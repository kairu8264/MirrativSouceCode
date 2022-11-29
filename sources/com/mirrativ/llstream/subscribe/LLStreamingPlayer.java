package com.mirrativ.llstream.subscribe;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.video.VideoListener;
import com.mirrativ.llstream.NamedThreadFactory;
import com.mirrativ.llstream.decoder.AudioDecodeParams;
import com.mirrativ.llstream.decoder.JitterCoordinator;
import com.mirrativ.llstream.decoder.SurfaceUtil;
import com.mirrativ.llstream.decoder.VideoDecodeParams;
import com.mirrativ.llstream.subscribe.StreamEndpoint;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jo.h;
import jo.p;
import so.e;
import so.n;
import so.o;
import uo.b0;
import uo.b3;
import uo.d2;
import uo.g1;
import uo.l;
import uo.p0;
import uo.q0;
import uo.r0;
import uo.s1;
import uo.u1;
import wn.v;

/* loaded from: classes4.dex */
public final class LLStreamingPlayer implements AVCStreamerCallback, AACStreamerCallback {
    private static final long AUDIO_TICK_INTERVAL_MS = 10;
    public static final Companion Companion = new Companion(null);
    private static final long HEALTHCHECK_INTERVAL_MS = 1000;
    private static final String TAG = "LLStreamingPlayer";
    private static final long VIDEO_TICK_INTERVAL_MS = 100;
    private AACStreamer aacStreamer;
    private final AudioDecodeParams audioDecodeParams;
    private d2 audioLoop;
    private AVCStreamer avcStreamer;
    private LLStreamingPlayerCallback callback;
    private Context context;
    private final q0 coroutineScope;
    private DecodeErrorInfo decodeErrorInfo;
    private final s1 dispatcher;
    private final StreamEndpoint endpoint;
    private SimpleExoPlayer exoPlayer;
    private final MyExoPlayerEventHandler exoPlayerEventHandler;
    private final MyExoPlayerVideoHandler exoPlayerVideoHandler;
    private d2 healthCheckLoop;
    private final AtomicBoolean isAudioPlaying;
    private final AtomicBoolean isHealthcheckActive;
    private final AtomicBoolean isPlayingAtomic;
    private final AtomicBoolean isVideoPlaying;
    private JitterCoordinator jitterCoordinator;
    private final b0 job;
    private final Object lock;
    private boolean muted;
    private StreamerType savedType;
    private final AtomicInteger slowCheckCount;
    private Surface surface;
    private StreamerType type;
    private final VideoDecodeParams videoDecodeParams;
    private d2 videoLoop;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final boolean isV1StreamKey(URI uri) {
            p.h(uri, "uri");
            String path = uri.getPath();
            p.g(path, "uri.path");
            List r02 = o.r0(path, new String[]{"/"}, false, 0, 6, null);
            if (r02.size() < 3) {
                return false;
            }
            String str = (String) r02.get(2);
            return str.length() >= 64 && n.C(str, "v1", false, 2, null);
        }

        public final StreamEndpoint parseURL(URI uri) {
            p.h(uri, "uri");
            String path = uri.getPath();
            p.g(path, "uri.path");
            List r02 = o.r0(path, new String[]{"/"}, false, 0, 6, null);
            if (r02.size() < 3) {
                return null;
            }
            String str = (String) r02.get(2);
            if (str.length() >= 64 && n.C(str, "v1", false, 2, null)) {
                return new StreamEndpoint.Builder().fromRTMP(uri).build();
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public final class MyExoPlayerEventHandler implements Player.EventListener {
        private final LLStreamingPlayer player;
        public final /* synthetic */ LLStreamingPlayer this$0;

        public MyExoPlayerEventHandler(LLStreamingPlayer lLStreamingPlayer, LLStreamingPlayer lLStreamingPlayer2) {
            p.h(lLStreamingPlayer2, "player");
            this.this$0 = lLStreamingPlayer;
            this.player = lLStreamingPlayer2;
        }

        public final LLStreamingPlayer getPlayer() {
            return this.player;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsLoadingChanged(boolean z10) {
            LLStreamingPlayerCallback lLStreamingPlayerCallback;
            super.onIsLoadingChanged(z10);
            if (z10 && (lLStreamingPlayerCallback = this.this$0.callback) != null) {
                lLStreamingPlayerCallback.onLoadingBegan(this.player);
            }
            LLStreamingPlayerCallback lLStreamingPlayerCallback2 = this.this$0.callback;
            if (lLStreamingPlayerCallback2 != null) {
                lLStreamingPlayerCallback2.onLoadingEnded(this.player, null);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i10) {
            super.onPlaybackStateChanged(i10);
            if (Log.isLoggable(LLStreamingPlayer.TAG, 3)) {
                Log.d(LLStreamingPlayer.TAG, "onPlaybackStateChanged state=" + i10);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            p.h(exoPlaybackException, MRLog.PAYLOAD_KEY_ERROR);
            super.onPlayerError(exoPlaybackException);
            if (Log.isLoggable(LLStreamingPlayer.TAG, 6)) {
                String message = exoPlaybackException.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                Log.e(LLStreamingPlayer.TAG, message);
            }
            this.this$0.stopHLS();
            LLStreamingPlayer lLStreamingPlayer = this.this$0;
            lLStreamingPlayer.type = lLStreamingPlayer.savedType;
            LLStreamingPlayerCallback lLStreamingPlayerCallback = this.this$0.callback;
            if (lLStreamingPlayerCallback != null) {
                lLStreamingPlayerCallback.onPlaybackFailed(this.this$0, exoPlaybackException);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class MyExoPlayerVideoHandler implements VideoListener {
        private final LLStreamingPlayer player;
        public final /* synthetic */ LLStreamingPlayer this$0;

        public MyExoPlayerVideoHandler(LLStreamingPlayer lLStreamingPlayer, LLStreamingPlayer lLStreamingPlayer2) {
            p.h(lLStreamingPlayer2, "player");
            this.this$0 = lLStreamingPlayer;
            this.player = lLStreamingPlayer2;
        }

        public final LLStreamingPlayer getPlayer() {
            return this.player;
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
            LLStreamingPlayerCallback lLStreamingPlayerCallback = this.this$0.callback;
            if (lLStreamingPlayerCallback != null) {
                lLStreamingPlayerCallback.onVideoRendered(0);
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            super.onVideoSizeChanged(i10, i11, i12, f10);
            LLStreamingPlayerCallback lLStreamingPlayerCallback = this.this$0.callback;
            if (lLStreamingPlayerCallback != null) {
                lLStreamingPlayerCallback.onVideoSizeChanged(this.player, new Size(i10, i11));
            }
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StreamerType.values().length];
            iArr[StreamerType.NORMAL.ordinal()] = 1;
            iArr[StreamerType.HLS.ordinal()] = 2;
            iArr[StreamerType.AUDIO_ONLY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LLStreamingPlayer(StreamEndpoint streamEndpoint, VideoDecodeParams videoDecodeParams, AudioDecodeParams audioDecodeParams) {
        p.h(streamEndpoint, "endpoint");
        p.h(videoDecodeParams, "videoDecodeParams");
        p.h(audioDecodeParams, "audioDecodeParams");
        this.endpoint = streamEndpoint;
        this.videoDecodeParams = videoDecodeParams;
        this.audioDecodeParams = audioDecodeParams;
        this.isPlayingAtomic = new AtomicBoolean(false);
        b0 b10 = b3.b(null, 1, null);
        this.job = b10;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory(TAG));
        p.g(newSingleThreadExecutor, "newSingleThreadExecutor(…ory(\"LLStreamingPlayer\"))");
        s1 a10 = u1.a(newSingleThreadExecutor);
        this.dispatcher = a10;
        this.coroutineScope = r0.a(b10.plus(a10));
        this.jitterCoordinator = new JitterCoordinator();
        StreamerType streamerType = StreamerType.NORMAL;
        this.type = streamerType;
        this.savedType = streamerType;
        this.isVideoPlaying = new AtomicBoolean(false);
        this.isAudioPlaying = new AtomicBoolean(false);
        this.isHealthcheckActive = new AtomicBoolean(false);
        this.slowCheckCount = new AtomicInteger(0);
        this.exoPlayerEventHandler = new MyExoPlayerEventHandler(this, this);
        this.exoPlayerVideoHandler = new MyExoPlayerVideoHandler(this, this);
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHealth() {
        if (this.slowCheckCount.incrementAndGet() < 60) {
            return;
        }
        boolean z10 = false;
        this.slowCheckCount.set(0);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.jitterCoordinator.getVideoPacketLastArrived().get();
        long j11 = this.jitterCoordinator.getAudioPacketLastArrived().get();
        z10 = (((j11 > 0L ? 1 : (j11 == 0L ? 0 : -1)) > 0 ? currentTimeMillis - j11 : 60000L) < DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS || ((j10 > 0L ? 1 : (j10 == 0L ? 0 : -1)) > 0 ? currentTimeMillis - j10 : 60000L) < DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS) ? true : true;
        Log.v(TAG, "checkHealth isPacketArrived = " + z10);
        if (!z10) {
            l.d(this.coroutineScope, g1.c(), null, new LLStreamingPlayer$checkHealth$1(this, null), 2, null);
        } else if (this.jitterCoordinator.getConfig().getNotAcceptableClient().get()) {
            l.d(this.coroutineScope, g1.c(), null, new LLStreamingPlayer$checkHealth$2(this, null), 2, null);
        }
    }

    private final String getUserAgent() {
        String b10;
        String str = Build.MODEL;
        if (str == null) {
            b10 = "";
        } else {
            p.g(str, "MODEL");
            b10 = new e("([\\r\\n])").b(str, " ");
        }
        return "MR_APP/llstream/Android/" + b10 + '/' + Build.VERSION.RELEASE;
    }

    private final int measureCropped(MediaFormat mediaFormat, String str, String str2, String str3) {
        if (mediaFormat.containsKey(str2) && mediaFormat.containsKey(str)) {
            return (mediaFormat.getInteger(str2) - mediaFormat.getInteger(str)) + 1;
        }
        return mediaFormat.getInteger(str3);
    }

    private final void playAudio() {
        this.isAudioPlaying.set(true);
        this.jitterCoordinator.resetAudioTimestamps();
        AACStreamer aACStreamer = new AACStreamer(this.endpoint.getAudioURL(), this.jitterCoordinator, this.audioDecodeParams, this.coroutineScope);
        this.aacStreamer = aACStreamer;
        aACStreamer.setCallback(this);
        AACStreamer aACStreamer2 = this.aacStreamer;
        if (aACStreamer2 != null) {
            aACStreamer2.open();
        }
        setupAudioBufferTick();
    }

    private final void playHLS() {
        this.isVideoPlaying.set(true);
        if (!p.c(Looper.myLooper(), Looper.getMainLooper())) {
            l.d(this.coroutineScope, g1.c(), null, new LLStreamingPlayer$playHLS$1(this, null), 2, null);
        } else {
            playHLSInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playHLSInternal() {
        Context context = this.context;
        if (context == null) {
            LLStreamingPlayerCallback lLStreamingPlayerCallback = this.callback;
            if (lLStreamingPlayerCallback != null) {
                lLStreamingPlayerCallback.onPlaybackFailed(this, new IllegalArgumentException("context is null"));
                return;
            }
            return;
        }
        p.f(context, "null cannot be cast to non-null type android.content.Context");
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(context).build();
        p.g(build, "Builder(ctx).build()");
        build.addListener(this.exoPlayerEventHandler);
        build.addVideoListener(this.exoPlayerVideoHandler);
        this.exoPlayer = build;
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(context, getUserAgent());
        MediaItem fromUri = MediaItem.fromUri(this.endpoint.getHlsURL());
        p.g(fromUri, "fromUri(endpoint.hlsURL)");
        HlsMediaSource createMediaSource = new HlsMediaSource.Factory(defaultDataSourceFactory).setLoadErrorHandlingPolicy((LoadErrorHandlingPolicy) new DefaultLoadErrorHandlingPolicy(1)).createMediaSource(fromUri);
        p.g(createMediaSource, "Factory(dataSourceFactor…ateMediaSource(mediaItem)");
        build.addMediaSource(createMediaSource);
        build.prepare();
        build.setVideoSurface(this.surface);
        build.setPlayWhenReady(true);
    }

    private final void playVideo() {
        if (this.surface != null) {
            this.isVideoPlaying.set(true);
            this.jitterCoordinator.resetVideoTimestamps();
            String videoURL = this.endpoint.getVideoURL();
            JitterCoordinator jitterCoordinator = this.jitterCoordinator;
            Surface surface = this.surface;
            p.e(surface);
            AVCStreamer aVCStreamer = new AVCStreamer(videoURL, jitterCoordinator, surface, this.videoDecodeParams, this.coroutineScope);
            this.avcStreamer = aVCStreamer;
            aVCStreamer.setCallback(this);
            AVCStreamer aVCStreamer2 = this.avcStreamer;
            if (aVCStreamer2 != null) {
                aVCStreamer2.open();
            }
            setupVideoBufferTick();
        }
    }

    private final void recover(long j10) {
        l.d(this.coroutineScope, g1.c(), null, new LLStreamingPlayer$recover$1(j10, this, null), 2, null);
    }

    public static /* synthetic */ void recover$default(LLStreamingPlayer lLStreamingPlayer, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        lLStreamingPlayer.recover(j10);
    }

    private final boolean recoverFromCodecException(MediaCodec.CodecException codecException) {
        if (this.isPlayingAtomic.get()) {
            if (codecException.isRecoverable()) {
                recover$default(this, 0L, 1, null);
                return true;
            } else if (codecException.isTransient()) {
                recover(1000L);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private final void setExoplayerVolume(float f10) {
        if (!p.c(Looper.myLooper(), Looper.getMainLooper())) {
            l.d(this.coroutineScope, g1.c(), null, new LLStreamingPlayer$setExoplayerVolume$1(this, f10, null), 2, null);
            return;
        }
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(f10);
    }

    private final void setupAudioBufferTick() {
        d2 d10;
        d10 = l.d(this.coroutineScope, this.dispatcher.plus(new p0("com.mirrativ.llstream.aacstreamer")), null, new LLStreamingPlayer$setupAudioBufferTick$1(this, null), 2, null);
        this.audioLoop = d10;
    }

    private final void setupHealthcheckLoop() {
        d2 d10;
        d10 = l.d(this.coroutineScope, this.dispatcher.plus(new p0("com.mirrativ.llstream.healthcheck")), null, new LLStreamingPlayer$setupHealthcheckLoop$1(this, null), 2, null);
        this.healthCheckLoop = d10;
    }

    private final void setupVideoBufferTick() {
        d2 d10;
        d10 = l.d(this.coroutineScope, this.dispatcher.plus(new p0("com.mirrativ.llstream.avcstreamer")), null, new LLStreamingPlayer$setupVideoBufferTick$1(this, null), 2, null);
        this.videoLoop = d10;
    }

    private final void stopAudio() {
        d2 d2Var = this.audioLoop;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        AACStreamer aACStreamer = this.aacStreamer;
        if (aACStreamer != null) {
            aACStreamer.close();
        }
        this.aacStreamer = null;
        this.isAudioPlaying.set(false);
        this.jitterCoordinator.resetAudioTimestamps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopHLS() {
        if (!p.c(Looper.myLooper(), Looper.getMainLooper())) {
            l.d(this.coroutineScope, g1.c(), null, new LLStreamingPlayer$stopHLS$1(this, null), 2, null);
        } else {
            stopHLSInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopHLSInternal() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return;
        }
        p.f(simpleExoPlayer, "null cannot be cast to non-null type com.google.android.exoplayer2.SimpleExoPlayer");
        simpleExoPlayer.stop();
        simpleExoPlayer.removeListener(this.exoPlayerEventHandler);
        simpleExoPlayer.removeVideoListener(this.exoPlayerVideoHandler);
        simpleExoPlayer.setVideoSurface(null);
        simpleExoPlayer.release();
        this.exoPlayer = null;
    }

    private final void stopVideo() {
        d2 d2Var = this.videoLoop;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        AVCStreamer aVCStreamer = this.avcStreamer;
        if (aVCStreamer != null) {
            aVCStreamer.close();
        }
        this.avcStreamer = null;
        this.isVideoPlaying.set(false);
        this.jitterCoordinator.resetVideoTimestamps();
    }

    public final void fallback() {
        StreamerType streamerType = this.type;
        StreamerType streamerType2 = StreamerType.HLS;
        if (streamerType != streamerType2) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "fallback player");
            }
            if (this.isPlayingAtomic.get()) {
                stop();
                this.type = streamerType2;
                play();
                return;
            }
            this.savedType = this.type;
            this.type = streamerType2;
        }
    }

    public final AudioDecodeParams getAudioDecodeParams() {
        return this.audioDecodeParams;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DecodeErrorInfo getDecodeErrorInfo() {
        return this.decodeErrorInfo;
    }

    public final StreamEndpoint getEndpoint() {
        return this.endpoint;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final VideoDecodeParams getVideoDecodeParams() {
        return this.videoDecodeParams;
    }

    public final boolean isPlaying() {
        return this.isPlayingAtomic.get();
    }

    @Override // com.mirrativ.llstream.subscribe.AACStreamerCallback
    public void onAACStreamerError(Throwable th2) {
        p.h(th2, i7.e.f36387u);
        if (th2 instanceof CancellationException) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "aac decoder has been cancelled");
            }
        } else if (this.isPlayingAtomic.get()) {
            LLStreamingPlayerCallback lLStreamingPlayerCallback = this.callback;
            if (lLStreamingPlayerCallback != null && lLStreamingPlayerCallback.continuesToRetry(this, th2)) {
                if (th2 instanceof LLStreamException) {
                    recover$default(this, 0L, 1, null);
                    return;
                } else if (th2 instanceof MediaCodec.CodecException) {
                    recoverFromCodecException((MediaCodec.CodecException) th2);
                    LLStreamingPlayerCallback lLStreamingPlayerCallback2 = this.callback;
                    if (lLStreamingPlayerCallback2 != null) {
                        lLStreamingPlayerCallback2.onError(th2);
                        return;
                    }
                    return;
                } else {
                    LLStreamingPlayerCallback lLStreamingPlayerCallback3 = this.callback;
                    if (lLStreamingPlayerCallback3 != null) {
                        lLStreamingPlayerCallback3.onError(th2);
                    }
                }
            }
            LLStreamingPlayerCallback lLStreamingPlayerCallback4 = this.callback;
            if (lLStreamingPlayerCallback4 != null) {
                lLStreamingPlayerCallback4.onPlaybackFailed(this, th2);
            }
        }
    }

    @Override // com.mirrativ.llstream.subscribe.AVCStreamerCallback
    public void onAVCStreamerError(Throwable th2, DecodeErrorInfo decodeErrorInfo) {
        p.h(th2, i7.e.f36387u);
        this.decodeErrorInfo = decodeErrorInfo;
        if (th2 instanceof CancellationException) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "avc decoder has been cancelled");
            }
        } else if (this.isPlayingAtomic.get()) {
            LLStreamingPlayerCallback lLStreamingPlayerCallback = this.callback;
            if (lLStreamingPlayerCallback != null && lLStreamingPlayerCallback.continuesToRetry(this, th2)) {
                if (th2 instanceof LLStreamException) {
                    recover$default(this, 0L, 1, null);
                    return;
                } else if ((th2 instanceof MediaCodec.CodecException) && recoverFromCodecException((MediaCodec.CodecException) th2)) {
                    LLStreamingPlayerCallback lLStreamingPlayerCallback2 = this.callback;
                    if (lLStreamingPlayerCallback2 != null) {
                        lLStreamingPlayerCallback2.onError(th2);
                        return;
                    }
                    return;
                } else {
                    LLStreamingPlayerCallback lLStreamingPlayerCallback3 = this.callback;
                    if (lLStreamingPlayerCallback3 != null) {
                        lLStreamingPlayerCallback3.onError(th2);
                    }
                }
            }
            LLStreamingPlayerCallback lLStreamingPlayerCallback4 = this.callback;
            if (lLStreamingPlayerCallback4 != null) {
                lLStreamingPlayerCallback4.onPlaybackFailed(this, th2);
            }
        }
    }

    @Override // com.mirrativ.llstream.subscribe.AVCStreamerCallback
    public void onLoadingBegan() {
        LLStreamingPlayerCallback lLStreamingPlayerCallback = this.callback;
        if (lLStreamingPlayerCallback != null) {
            lLStreamingPlayerCallback.onLoadingBegan(this);
        }
    }

    @Override // com.mirrativ.llstream.subscribe.AVCStreamerCallback
    public void onLoadingEnd() {
        LLStreamingPlayerCallback lLStreamingPlayerCallback = this.callback;
        if (lLStreamingPlayerCallback != null) {
            lLStreamingPlayerCallback.onLoadingEnded(this, null);
        }
    }

    @Override // com.mirrativ.llstream.subscribe.AVCStreamerCallback
    public void onVideoOutputFormatChanged(MediaFormat mediaFormat) {
        p.h(mediaFormat, "format");
        Size size = new Size(measureCropped(mediaFormat, "crop-left", "crop-right", "width"), measureCropped(mediaFormat, "crop-top", "crop-bottom", "height"));
        LLStreamingPlayerCallback lLStreamingPlayerCallback = this.callback;
        if (lLStreamingPlayerCallback != null) {
            lLStreamingPlayerCallback.onVideoSizeChanged(this, size);
        }
    }

    @Override // com.mirrativ.llstream.subscribe.AVCStreamerCallback
    public void onVideoRendered(int i10) {
        LLStreamingPlayerCallback lLStreamingPlayerCallback = this.callback;
        if (lLStreamingPlayerCallback != null) {
            lLStreamingPlayerCallback.onVideoRendered(i10);
        }
    }

    public final void play() {
        synchronized (this.lock) {
            if (this.isPlayingAtomic.get()) {
                return;
            }
            this.isPlayingAtomic.set(true);
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
            if (i10 == 1) {
                playVideo();
                if (!this.muted) {
                    playAudio();
                }
                this.isHealthcheckActive.set(true);
                setupHealthcheckLoop();
            } else if (i10 == 2) {
                playHLS();
                if (this.muted) {
                    setExoplayerVolume(0.0f);
                } else {
                    setExoplayerVolume(1.0f);
                }
            } else if (i10 == 3) {
                if (!this.muted) {
                    playAudio();
                }
                this.isHealthcheckActive.set(true);
                setupHealthcheckLoop();
            }
            v vVar = v.f59242a;
        }
    }

    public final void release() {
        synchronized (this.lock) {
            r0.d(this.coroutineScope, null, 1, null);
            this.avcStreamer = null;
            this.aacStreamer = null;
            this.exoPlayer = null;
            SurfaceUtil.Companion.clearSurface$default(SurfaceUtil.Companion, this.surface, 0, 2, null);
            this.surface = null;
            this.dispatcher.close();
            v vVar = v.f59242a;
        }
    }

    public final void sendReceivesVideo(boolean z10) {
        synchronized (this.lock) {
            if (z10) {
                if (this.type == StreamerType.AUDIO_ONLY) {
                    if (!this.muted) {
                        playVideo();
                    }
                    this.type = StreamerType.NORMAL;
                }
                return;
            }
            if (this.type == StreamerType.NORMAL) {
                stopVideo();
                this.type = StreamerType.AUDIO_ONLY;
            }
            v vVar = v.f59242a;
        }
    }

    public final void setCallback(LLStreamingPlayerCallback lLStreamingPlayerCallback) {
        synchronized (this.lock) {
            this.callback = lLStreamingPlayerCallback;
            v vVar = v.f59242a;
        }
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setDecodeErrorInfo(DecodeErrorInfo decodeErrorInfo) {
        this.decodeErrorInfo = decodeErrorInfo;
    }

    public final void setMute(boolean z10) {
        synchronized (this.lock) {
            if (this.type == StreamerType.HLS) {
                if (z10) {
                    setExoplayerVolume(0.0f);
                } else {
                    setExoplayerVolume(1.0f);
                }
                this.muted = z10;
                return;
            }
            if (z10) {
                if (!this.muted) {
                    stopAudio();
                }
            } else if (this.muted) {
                playAudio();
            }
            this.muted = z10;
            v vVar = v.f59242a;
        }
    }

    public final void setSurface(Surface surface) {
        this.surface = surface;
    }

    public final void stop() {
        synchronized (this.lock) {
            if (this.isPlayingAtomic.get()) {
                this.isPlayingAtomic.set(false);
                stopVideo();
                stopAudio();
                stopHLS();
                d2 d2Var = this.healthCheckLoop;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                this.isHealthcheckActive.set(false);
                this.isVideoPlaying.set(false);
                this.isAudioPlaying.set(false);
                v vVar = v.f59242a;
            }
        }
    }

    public /* synthetic */ LLStreamingPlayer(StreamEndpoint streamEndpoint, VideoDecodeParams videoDecodeParams, AudioDecodeParams audioDecodeParams, int i10, h hVar) {
        LLStreamingPlayer lLStreamingPlayer;
        StreamEndpoint streamEndpoint2;
        AudioDecodeParams audioDecodeParams2;
        VideoDecodeParams videoDecodeParams2 = (i10 & 2) != 0 ? new VideoDecodeParams(0, 0, 0L, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0L, 0, 0L, 0L, 0L, 0L, 0L, null, 131071, null) : videoDecodeParams;
        if ((i10 & 4) != 0) {
            audioDecodeParams2 = new AudioDecodeParams(0, 0.0d, false, 0, 0, 0L, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, 0L, 0L, 0L, 0L, 65535, null);
            lLStreamingPlayer = this;
            streamEndpoint2 = streamEndpoint;
        } else {
            lLStreamingPlayer = this;
            streamEndpoint2 = streamEndpoint;
            audioDecodeParams2 = audioDecodeParams;
        }
        new LLStreamingPlayer(streamEndpoint2, videoDecodeParams2, audioDecodeParams2);
    }
}
