package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.LoudnessEnhancer;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static final String TAG = "WebRtcAudioTrackExternal";
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private final Context context;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private LoudnessEnhancer mLoudnessEnhancer;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final ThreadUtils.ThreadChecker threadChecker;
    private AudioTrack voiceAudioTrack;
    private final VolumeLogger volumeLogger;

    /* loaded from: classes4.dex */
    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
            if (Build.VERSION.SDK_INT >= 21) {
                if (WebRtcAudioMediator.getInstance().isMultiMode()) {
                    return WebRtcAudioTrack.this.voiceAudioTrack.write(byteBuffer, i10, 0);
                }
                return audioTrack.write(byteBuffer, i10, 0);
            } else if (WebRtcAudioMediator.getInstance().isMultiMode()) {
                return WebRtcAudioTrack.this.voiceAudioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i10);
            } else {
                return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i10);
            }
        }

        @TargetApi(21)
        private int writeOnLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
            if (WebRtcAudioMediator.getInstance().isMultiMode()) {
                return WebRtcAudioTrack.this.voiceAudioTrack.write(byteBuffer, i10, 0);
            }
            return audioTrack.write(byteBuffer, i10, 0);
        }

        private int writePreLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
            if (WebRtcAudioMediator.getInstance().isMultiMode()) {
                return WebRtcAudioTrack.this.voiceAudioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i10);
            }
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i10);
        }

        public void joinThread() {
            this.keepAlive = false;
            while (isAlive()) {
                try {
                    join();
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            try {
                WebRtcAudioTrack.this.audioTrack.play();
                WebRtcAudioTrack.this.voiceAudioTrack.play();
                WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
                WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.voiceAudioTrack.getPlayState() == 3);
                int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
                while (this.keepAlive) {
                    WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                    WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                    if (WebRtcAudioTrack.this.speakerMute) {
                        WebRtcAudioTrack.this.byteBuffer.clear();
                        WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                        WebRtcAudioTrack.this.byteBuffer.position(0);
                    }
                    int writeOnLollipop = WebRtcAudioUtils.runningOnLollipopOrHigher() ? writeOnLollipop(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity) : writePreLollipop(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                    if (writeOnLollipop != capacity) {
                        Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write failed: " + writeOnLollipop);
                        if (writeOnLollipop == -3) {
                            this.keepAlive = false;
                            WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                            webRtcAudioTrack.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeOnLollipop);
                        }
                    }
                    WebRtcAudioTrack.this.byteBuffer.rewind();
                }
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    WebRtcAudioTrack.this.voiceAudioTrack.stop();
                } catch (IllegalStateException e10) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e10.getMessage());
                }
                WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 1);
                WebRtcAudioTrack.this.audioTrack.flush();
                WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.voiceAudioTrack.getPlayState() == 1);
                WebRtcAudioTrack.this.voiceAudioTrack.flush();
            } catch (IllegalStateException e11) {
                WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
                webRtcAudioTrack2.reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed: " + e11.getMessage());
                WebRtcAudioTrack.this.releaseAudioResources();
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    @CalledByNative
    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 4 : 12;
    }

    @TargetApi(21)
    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i10, int i11, int i12) {
        Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i10 != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(DEFAULT_USAGE).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build(), i12, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i10, int i11, int i12) {
        return new AudioTrack(0, i10, i11, 2, i12, 1);
    }

    private static int getDefaultUsageAttribute() {
        return Build.VERSION.SDK_INT >= 21 ? 2 : 0;
    }

    @CalledByNative
    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        if (WebRtcAudioMediator.getInstance().isStarted() && WebRtcAudioMediator.getInstance().isMultiMode()) {
            return this.audioManager.getStreamMaxVolume(0);
        }
        return this.audioManager.getStreamMaxVolume(3);
    }

    @CalledByNative
    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        if (WebRtcAudioMediator.getInstance().isStarted() && WebRtcAudioMediator.getInstance().isMultiMode()) {
            return this.audioManager.getStreamVolume(0);
        }
        return this.audioManager.getStreamVolume(3);
    }

    @CalledByNative
    private boolean initPlayout(int i10, int i11) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(sampleRate=" + i10 + ", channels=" + i11 + ")");
        this.byteBuffer = ByteBuffer.allocateDirect(i11 * 2 * (i10 / 100));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.d(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = AudioTrack.getMinBufferSize(i10, channelCountToConfiguration, 2);
        Logging.d(TAG, "AudioTrack.getMinBufferSize: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        } else if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return false;
        } else {
            try {
                this.audioTrack = new AudioTrack(3, i10, channelCountToConfiguration, 2, minBufferSize, 1);
                this.voiceAudioTrack = new AudioTrack(0, i10, channelCountToConfiguration, 2, minBufferSize, 1);
                this.audioManager.setMode(0);
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null && audioTrack.getState() == 1) {
                    logMainParameters();
                    logMainParametersExtended();
                    return true;
                }
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return false;
            } catch (IllegalArgumentException e10) {
                reportWebRtcAudioTrackInitError(e10.getMessage());
                releaseAudioResources();
                return false;
            }
        }
    }

    private boolean isVolumeFixed() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            Logging.d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
    }

    private void logMainParameters() {
        Logging.d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private boolean loudnessEnhancerAvailable() {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : AudioEffect.queryEffects()) {
            if (AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER.equals(descriptor.type)) {
                return true;
            }
        }
        return false;
    }

    private static native void nativeCacheDirectBufferAddress(long j10, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeGetPlayoutData(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseAudioResources() {
        LoudnessEnhancer loudnessEnhancer;
        Logging.d(TAG, "releaseAudioResources");
        try {
            if (Build.VERSION.SDK_INT >= 19 && (loudnessEnhancer = this.mLoudnessEnhancer) != null) {
                loudnessEnhancer.setEnabled(false);
                this.mLoudnessEnhancer.release();
                this.mLoudnessEnhancer = null;
                Logging.d(TAG, "released loudness enhancer");
            }
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "AudioTrack.stop failed: " + e10.getMessage());
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
        AudioTrack audioTrack2 = this.voiceAudioTrack;
        if (audioTrack2 != null) {
            audioTrack2.release();
            this.voiceAudioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    @CalledByNative
    private boolean setStreamVolume(int i10) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i10 + ")");
        if (isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        } else if (WebRtcAudioMediator.getInstance().isStarted() && WebRtcAudioMediator.getInstance().isMultiMode()) {
            this.audioManager.setStreamVolume(0, i10, 0);
            return true;
        } else {
            this.audioManager.setStreamVolume(3, i10, 0);
            return true;
        }
    }

    @CalledByNative
    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        Logging.d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        if (this.audioTrack.getState() != 1) {
            JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
            releaseAudioResources();
            return false;
        }
        if (WebRtcAudioMediator.getInstance().isStarted()) {
            WebRtcAudioMediator.getInstance().setWebRtcAudioTrack(this);
            if (Build.VERSION.SDK_INT >= 19 && loudnessEnhancerAvailable()) {
                LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(this.audioTrack.getAudioSessionId());
                this.mLoudnessEnhancer = loudnessEnhancer;
                loudnessEnhancer.setTargetGain(600);
                this.mLoudnessEnhancer.setEnabled(true);
                Logging.d(TAG, "applied loudness enhancer");
                Logging.d(TAG, "target gain mb = " + this.mLoudnessEnhancer.getTargetGain());
            } else {
                Logging.d(TAG, "This device doesn't support LoudnessEnhancer effect");
            }
        }
        AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
        this.audioThread = audioTrackThread;
        audioTrackThread.start();
        return true;
    }

    @CalledByNative
    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        if (WebRtcAudioMediator.getInstance().isStarted()) {
            WebRtcAudioMediator.getInstance().setWebRtcAudioTrack(null);
        }
        this.audioThread.joinThread();
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public void setEnhanceMB(int i10) {
        LoudnessEnhancer loudnessEnhancer = this.mLoudnessEnhancer;
        if (loudnessEnhancer == null || !loudnessEnhancer.getEnabled() || Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.mLoudnessEnhancer.setTargetGain(i10);
        Logging.d(TAG, "now target gain mb = " + this.mLoudnessEnhancer.getTargetGain());
    }

    @CalledByNative
    public void setNativeAudioTrack(long j10) {
        this.nativeAudioTrack = j10;
    }

    public void setSpeakerMute(boolean z10) {
        Logging.w(TAG, "setSpeakerMute(" + z10 + ")");
        this.speakerMute = z10;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.errorCallback = audioTrackErrorCallback;
        this.volumeLogger = new VolumeLogger(audioManager);
    }
}
