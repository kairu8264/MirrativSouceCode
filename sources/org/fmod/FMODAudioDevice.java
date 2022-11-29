package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class FMODAudioDevice implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    private static int f45528h = 0;

    /* renamed from: i  reason: collision with root package name */
    private static int f45529i = 1;

    /* renamed from: j  reason: collision with root package name */
    private static int f45530j = 2;

    /* renamed from: k  reason: collision with root package name */
    private static int f45531k = 3;

    /* renamed from: a  reason: collision with root package name */
    private volatile Thread f45532a = null;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f45533b = false;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f45534c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45535d = false;

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer f45536e = null;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f45537f = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile a f45538g;

    private native int fmodGetInfo(int i10);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f45534c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f45534c.stop();
            }
            this.f45534c.release();
            this.f45534c = null;
        }
        this.f45536e = null;
        this.f45537f = null;
        this.f45535d = false;
    }

    public synchronized void close() {
        stop();
    }

    public native int fmodProcessMicData(ByteBuffer byteBuffer, int i10);

    public boolean isRunning() {
        return this.f45532a != null && this.f45532a.isAlive();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = 3;
        while (this.f45533b) {
            if (!this.f45535d && i10 > 0) {
                releaseAudioTrack();
                int fmodGetInfo = fmodGetInfo(f45528h);
                int round = Math.round(AudioTrack.getMinBufferSize(fmodGetInfo, 12, 2) * 1.1f) & (-4);
                int fmodGetInfo2 = fmodGetInfo(f45529i);
                int fmodGetInfo3 = fmodGetInfo(f45530j) * fmodGetInfo2 * 4;
                AudioTrack audioTrack = new AudioTrack(3, fmodGetInfo, 12, 2, fmodGetInfo3 > round ? fmodGetInfo3 : round, 1);
                this.f45534c = audioTrack;
                boolean z10 = audioTrack.getState() == 1;
                this.f45535d = z10;
                if (z10) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fmodGetInfo2 * 2 * 2);
                    this.f45536e = allocateDirect;
                    this.f45537f = new byte[allocateDirect.capacity()];
                    this.f45534c.play();
                    i10 = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f45534c.getState() + ")");
                    releaseAudioTrack();
                    i10 += -1;
                }
            }
            if (this.f45535d) {
                if (fmodGetInfo(f45531k) == 1) {
                    fmodProcess(this.f45536e);
                    ByteBuffer byteBuffer = this.f45536e;
                    byteBuffer.get(this.f45537f, 0, byteBuffer.capacity());
                    this.f45534c.write(this.f45537f, 0, this.f45536e.capacity());
                    this.f45536e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f45532a != null) {
            stop();
        }
        this.f45532a = new Thread(this, "FMODAudioDevice");
        this.f45532a.setPriority(10);
        this.f45533b = true;
        this.f45532a.start();
        if (this.f45538g != null) {
            this.f45538g.b();
        }
    }

    public synchronized int startAudioRecord(int i10, int i11, int i12) {
        if (this.f45538g == null) {
            this.f45538g = new a(this, i10, i11);
            this.f45538g.b();
        }
        return this.f45538g.a();
    }

    public synchronized void stop() {
        while (this.f45532a != null) {
            this.f45533b = false;
            try {
                this.f45532a.join();
                this.f45532a = null;
            } catch (InterruptedException unused) {
            }
        }
        if (this.f45538g != null) {
            this.f45538g.c();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.f45538g != null) {
            this.f45538g.c();
            this.f45538g = null;
        }
    }
}
