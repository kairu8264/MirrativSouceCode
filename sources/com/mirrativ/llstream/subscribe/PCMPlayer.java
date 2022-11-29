package com.mirrativ.llstream.subscribe;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.util.Log;
import com.mirrativ.llstream.NamedThreadFactory;
import com.mirrativ.llstream.decoder.PCMData;
import com.mirrativ.llstream.decoder.a;
import io.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import jo.h;
import jo.p;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.r0;
import uo.s1;
import uo.u1;
import wn.v;
import wo.b0;
import wo.i;
import wo.m;

/* loaded from: classes4.dex */
public final class PCMPlayer {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "PCMPlayer";
    private final AudioTrack audioTrack;
    private PCMPlayerCallback callback;
    private final i<PCMData> channel;
    private final q0 coroutineScope;
    private final AudioFormat format;
    private final Object lock;
    private final s1 playerDispatcher;
    private final AtomicBoolean playing;
    private d2 receiveLoopJob;
    private l<? super PCMData, v> renderCallback;
    private boolean speedControlDisabled;
    private float volume;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final AudioTrack createAudioTrack(AudioFormat audioFormat, PCMPlayerCallback pCMPlayerCallback) {
            p.h(audioFormat, "format");
            try {
                int minBufferSize = AudioTrack.getMinBufferSize(audioFormat.getSampleRate(), audioFormat.getChannelMask(), 2) * 2;
                AudioTrack.Builder transferMode = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).setAudioFormat(audioFormat).setTransferMode(1);
                p.g(transferMode, "Builder()\n              …e(AudioTrack.MODE_STREAM)");
                if (minBufferSize > 0) {
                    transferMode.setBufferSizeInBytes(minBufferSize);
                } else {
                    Log.e(PCMPlayer.TAG, "Invalid buffer size. bufferSize=" + minBufferSize);
                    if (pCMPlayerCallback != null) {
                        pCMPlayerCallback.onPCMPlayerError(new IllegalArgumentException("Invalid Buffer Size " + minBufferSize));
                    }
                }
                return transferMode.build();
            } catch (IllegalArgumentException e10) {
                Log.e(PCMPlayer.TAG, "IllegalArgumentException. format=" + audioFormat);
                if (pCMPlayerCallback != null) {
                    pCMPlayerCallback.onPCMPlayerError(e10);
                }
                return null;
            } catch (UnsupportedOperationException e11) {
                StringBuilder a10 = a.a("UnsupportedOperation. sampleRate=");
                a10.append(audioFormat.getSampleRate());
                a10.append(", channelMask=");
                a10.append(audioFormat.getChannelMask());
                a10.append(", format=");
                a10.append(audioFormat.getEncoding());
                Log.e(PCMPlayer.TAG, a10.toString());
                if (pCMPlayerCallback != null) {
                    pCMPlayerCallback.onPCMPlayerError(e11);
                }
                return null;
            }
        }
    }

    public PCMPlayer(q0 q0Var, AudioFormat audioFormat, PCMPlayerCallback pCMPlayerCallback) {
        p.h(q0Var, "coroutineScope");
        p.h(audioFormat, "format");
        this.coroutineScope = q0Var;
        this.format = audioFormat;
        this.callback = pCMPlayerCallback;
        this.playing = new AtomicBoolean(false);
        this.audioTrack = Companion.createAudioTrack(audioFormat, this.callback);
        this.lock = new Object();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory(TAG));
        p.g(newSingleThreadExecutor, "newSingleThreadExecutor(…readFactory(\"PCMPlayer\"))");
        this.playerDispatcher = u1.a(newSingleThreadExecutor);
        this.channel = wo.l.b(Integer.MAX_VALUE, null, null, 6, null);
        this.volume = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:20:0x0054). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object receiveLoop(ao.d<? super wn.v> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.mirrativ.llstream.subscribe.PCMPlayer$receiveLoop$1
            if (r0 == 0) goto L13
            r0 = r12
            com.mirrativ.llstream.subscribe.PCMPlayer$receiveLoop$1 r0 = (com.mirrativ.llstream.subscribe.PCMPlayer$receiveLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.mirrativ.llstream.subscribe.PCMPlayer$receiveLoop$1 r0 = new com.mirrativ.llstream.subscribe.PCMPlayer$receiveLoop$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.subscribe.PCMPlayer r2 = (com.mirrativ.llstream.subscribe.PCMPlayer) r2
            wn.m.b(r12)
            wo.m r12 = (wo.m) r12
            java.lang.Object r12 = r12.l()
            goto L54
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3b:
            wn.m.b(r12)
            r2 = r11
        L3f:
            java.util.concurrent.atomic.AtomicBoolean r12 = r2.playing
            boolean r12 = r12.get()
            if (r12 == 0) goto La4
            wo.i<com.mirrativ.llstream.decoder.PCMData> r12 = r2.channel
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r12 = r12.f(r0)
            if (r12 != r1) goto L54
            return r1
        L54:
            boolean r4 = r12 instanceof wo.m.c
            java.lang.String r5 = "PCMPlayer"
            if (r4 != 0) goto L7f
            r6 = r12
            com.mirrativ.llstream.decoder.PCMData r6 = (com.mirrativ.llstream.decoder.PCMData) r6
            android.media.AudioTrack r7 = r2.audioTrack     // Catch: java.lang.IllegalStateException -> L79
            if (r7 == 0) goto L71
            byte[] r8 = r6.getBytes()     // Catch: java.lang.IllegalStateException -> L79
            r9 = 0
            int r10 = r6.getSize()     // Catch: java.lang.IllegalStateException -> L79
            int r7 = r7.write(r8, r9, r10)     // Catch: java.lang.IllegalStateException -> L79
            co.b.d(r7)     // Catch: java.lang.IllegalStateException -> L79
        L71:
            io.l<? super com.mirrativ.llstream.decoder.PCMData, wn.v> r7 = r2.renderCallback     // Catch: java.lang.IllegalStateException -> L79
            if (r7 == 0) goto L7f
            r7.invoke(r6)     // Catch: java.lang.IllegalStateException -> L79
            goto L7f
        L79:
            r6 = move-exception
            java.lang.String r7 = "failed to write pcmdata"
            android.util.Log.e(r5, r7, r6)
        L7f:
            boolean r6 = r12 instanceof wo.m.a
            r7 = 3
            if (r6 == 0) goto L92
            wo.m.e(r12)
            boolean r6 = android.util.Log.isLoggable(r5, r7)
            if (r6 == 0) goto L92
            java.lang.String r6 = "receive channel is already closed"
            android.util.Log.d(r5, r6)
        L92:
            if (r4 == 0) goto L3f
            java.lang.Throwable r12 = wo.m.e(r12)
            boolean r4 = android.util.Log.isLoggable(r5, r7)
            if (r4 == 0) goto L3f
            java.lang.String r4 = "audio track write failed"
            android.util.Log.d(r5, r4, r12)
            goto L3f
        La4:
            wn.v r12 = wn.v.f59242a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.subscribe.PCMPlayer.receiveLoop(ao.d):java.lang.Object");
    }

    public final void controlSpeed(l<? super Float, Float> lVar) {
        p.h(lVar, "operation");
        setSpeed(lVar.invoke(Float.valueOf(getSpeed())).floatValue());
    }

    public final PCMPlayerCallback getCallback() {
        return this.callback;
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final AudioFormat getFormat() {
        return this.format;
    }

    public final AtomicBoolean getPlaying() {
        return this.playing;
    }

    public final l<PCMData, v> getRenderCallback() {
        return this.renderCallback;
    }

    public final float getSpeed() {
        PlaybackParams playbackParams;
        try {
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null && (playbackParams = audioTrack.getPlaybackParams()) != null) {
                return playbackParams.getSpeed();
            }
        } catch (IllegalStateException unused) {
        }
        return 1.0f;
    }

    public final boolean getSpeedControlDisabled() {
        return this.speedControlDisabled;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final void play() {
        d2 d10;
        synchronized (this.lock) {
            this.playing.set(true);
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null) {
                audioTrack.setPlaybackRate(this.format.getSampleRate());
            }
            AudioTrack audioTrack2 = this.audioTrack;
            if (audioTrack2 != null) {
                audioTrack2.play();
            }
            d10 = uo.l.d(this.coroutineScope, this.playerDispatcher, null, new PCMPlayer$play$1$1(this, null), 2, null);
            this.receiveLoopJob = d10;
            v vVar = v.f59242a;
        }
    }

    public final void release() {
        synchronized (this.lock) {
            boolean z10 = true;
            b0.a.a(this.channel, null, 1, null);
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                z10 = false;
            }
            if (z10) {
                this.audioTrack.release();
            }
            this.playerDispatcher.close();
            v vVar = v.f59242a;
        }
    }

    public final void schedulePCMData(PCMData pCMData) {
        p.h(pCMData, "pcmData");
        if (this.playing.get()) {
            Object l10 = this.channel.l(pCMData);
            if (l10 instanceof m.a) {
                Log.e(TAG, "already closed", m.e(l10));
            }
            if (l10 instanceof m.c) {
                Log.e(TAG, "send failed", m.e(l10));
            }
        }
    }

    public final void scheduleSilent(int i10) {
        if (this.playing.get()) {
            Object l10 = this.channel.l(new PCMData(new byte[i10], -1, i10, -1L));
            if (l10 instanceof m.a) {
                Log.e(TAG, "already closed", m.e(l10));
            }
            if (l10 instanceof m.c) {
                Log.e(TAG, "send failed", m.e(l10));
            }
        }
    }

    public final void setCallback(PCMPlayerCallback pCMPlayerCallback) {
        this.callback = pCMPlayerCallback;
    }

    public final void setRenderCallback(l<? super PCMData, v> lVar) {
        this.renderCallback = lVar;
    }

    public final void setSpeed(float f10) {
        if (this.speedControlDisabled) {
            return;
        }
        try {
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null && audioTrack.getState() == 1) {
                PlaybackParams playbackParams = this.audioTrack.getPlaybackParams();
                p.g(playbackParams, "audioTrack.playbackParams");
                if (playbackParams.getSpeed() == f10) {
                    return;
                }
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "change playback speed " + playbackParams.getSpeed() + " to " + f10);
                }
                playbackParams.setSpeed(f10);
                this.audioTrack.setPlaybackParams(playbackParams);
            }
        } catch (IllegalArgumentException e10) {
            if (Log.isLoggable(TAG, 3)) {
                StringBuilder a10 = a.a("setSpeed failed. ");
                a10.append(e10.getMessage());
                Log.d(TAG, a10.toString());
            }
            this.speedControlDisabled = true;
        } catch (IllegalStateException e11) {
            if (Log.isLoggable(TAG, 3)) {
                StringBuilder a11 = a.a("setSpeed failed ");
                a11.append(e11.getMessage());
                Log.d(TAG, a11.toString());
            }
            this.speedControlDisabled = true;
        }
    }

    public final void setSpeedControlDisabled(boolean z10) {
        this.speedControlDisabled = z10;
    }

    public final void setVolume(float f10) {
        boolean z10 = false;
        if (this.volume == f10) {
            return;
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null && audioTrack.getState() == 1) {
            z10 = true;
        }
        if (z10) {
            this.audioTrack.setVolume(f10);
            this.volume = f10;
        }
    }

    public final void stop() {
        synchronized (this.lock) {
            boolean z10 = false;
            this.playing.set(false);
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null && audioTrack.getState() == 1) {
                z10 = true;
            }
            if (z10) {
                this.audioTrack.stop();
            }
            d2 d2Var = this.receiveLoopJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
                v vVar = v.f59242a;
            }
        }
    }

    public /* synthetic */ PCMPlayer(q0 q0Var, AudioFormat audioFormat, PCMPlayerCallback pCMPlayerCallback, int i10, h hVar) {
        this((i10 & 1) != 0 ? r0.a(g1.a()) : q0Var, audioFormat, (i10 & 4) != 0 ? null : pCMPlayerCallback);
    }
}
