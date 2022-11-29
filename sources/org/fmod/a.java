package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FMODAudioDevice f45539a;

    /* renamed from: b  reason: collision with root package name */
    private final ByteBuffer f45540b;

    /* renamed from: c  reason: collision with root package name */
    private final int f45541c;

    /* renamed from: d  reason: collision with root package name */
    private final int f45542d;

    /* renamed from: e  reason: collision with root package name */
    private final int f45543e = 2;

    /* renamed from: f  reason: collision with root package name */
    private volatile Thread f45544f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f45545g;

    /* renamed from: h  reason: collision with root package name */
    private AudioRecord f45546h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f45547i;

    public a(FMODAudioDevice fMODAudioDevice, int i10, int i11) {
        this.f45539a = fMODAudioDevice;
        this.f45541c = i10;
        this.f45542d = i11;
        this.f45540b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i10, i11, 2));
    }

    private void d() {
        AudioRecord audioRecord = this.f45546h;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f45546h.stop();
            }
            this.f45546h.release();
            this.f45546h = null;
        }
        this.f45540b.position(0);
        this.f45547i = false;
    }

    public final int a() {
        return this.f45540b.capacity();
    }

    public final void b() {
        if (this.f45544f != null) {
            c();
        }
        this.f45545g = true;
        this.f45544f = new Thread(this);
        this.f45544f.start();
    }

    public final void c() {
        while (this.f45544f != null) {
            this.f45545g = false;
            try {
                this.f45544f.join();
                this.f45544f = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 3;
        while (this.f45545g) {
            if (!this.f45547i && i10 > 0) {
                d();
                AudioRecord audioRecord = new AudioRecord(1, this.f45541c, this.f45542d, this.f45543e, this.f45540b.capacity());
                this.f45546h = audioRecord;
                boolean z10 = audioRecord.getState() == 1;
                this.f45547i = z10;
                if (z10) {
                    this.f45540b.position(0);
                    this.f45546h.startRecording();
                    i10 = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f45546h.getState() + ")");
                    i10 += -1;
                    d();
                }
            }
            if (this.f45547i && this.f45546h.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f45546h;
                ByteBuffer byteBuffer = this.f45540b;
                this.f45539a.fmodProcessMicData(this.f45540b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.f45540b.position(0);
            }
        }
        d();
    }
}
