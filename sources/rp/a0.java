package rp;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class a0 implements d {

    /* renamed from: w  reason: collision with root package name */
    public final f0 f51649w;

    /* renamed from: x  reason: collision with root package name */
    public final c f51650x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f51651y;

    public a0(f0 f0Var) {
        jo.p.h(f0Var, "sink");
        this.f51649w = f0Var;
        this.f51650x = new c();
    }

    @Override // rp.d
    public d H(int i10) {
        if (!this.f51651y) {
            this.f51650x.H(i10);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.d
    public long H0(h0 h0Var) {
        jo.p.h(h0Var, "source");
        long j10 = 0;
        while (true) {
            long f12 = h0Var.f1(this.f51650x, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (f12 == -1) {
                return j10;
            }
            j10 += f12;
            a();
        }
    }

    @Override // rp.d
    public d J0(long j10) {
        if (!this.f51651y) {
            this.f51650x.J0(j10);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.f0
    public void O0(c cVar, long j10) {
        jo.p.h(cVar, "source");
        if (!this.f51651y) {
            this.f51650x.O0(cVar, j10);
            a();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.d
    public d U0(int i10) {
        if (!this.f51651y) {
            this.f51650x.U0(i10);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    public d a() {
        if (!this.f51651y) {
            long e10 = this.f51650x.e();
            if (e10 > 0) {
                this.f51649w.O0(this.f51650x, e10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.d
    public d a0(String str) {
        jo.p.h(str, "string");
        if (!this.f51651y) {
            this.f51650x.a0(str);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.d
    public d b1(int i10) {
        if (!this.f51651y) {
            this.f51650x.b1(i10);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f51651y) {
            return;
        }
        Throwable th2 = null;
        try {
            if (this.f51650x.X() > 0) {
                f0 f0Var = this.f51649w;
                c cVar = this.f51650x;
                f0Var.O0(cVar, cVar.X());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f51649w.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        this.f51651y = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // rp.d, rp.f0, java.io.Flushable
    public void flush() {
        if (!this.f51651y) {
            if (this.f51650x.X() > 0) {
                f0 f0Var = this.f51649w;
                c cVar = this.f51650x;
                f0Var.O0(cVar, cVar.X());
            }
            this.f51649w.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.d
    public d g0(String str, int i10, int i11) {
        jo.p.h(str, "string");
        if (!this.f51651y) {
            this.f51650x.g0(str, i10, i11);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f51651y;
    }

    @Override // rp.d
    public c l() {
        return this.f51650x;
    }

    @Override // rp.f0
    public i0 m() {
        return this.f51649w.m();
    }

    @Override // rp.d
    public d o0(f fVar) {
        jo.p.h(fVar, "byteString");
        if (!this.f51651y) {
            this.f51650x.o0(fVar);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.d
    public d t1(long j10) {
        if (!this.f51651y) {
            this.f51650x.t1(j10);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f51649w + ')';
    }

    @Override // rp.d
    public d v0(byte[] bArr) {
        jo.p.h(bArr, "source");
        if (!this.f51651y) {
            this.f51650x.v0(bArr);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        jo.p.h(byteBuffer, "source");
        if (!this.f51651y) {
            int write = this.f51650x.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.d
    public d write(byte[] bArr, int i10, int i11) {
        jo.p.h(bArr, "source");
        if (!this.f51651y) {
            this.f51650x.write(bArr, i10, i11);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }
}
