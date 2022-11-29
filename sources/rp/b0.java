package rp;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class b0 implements e {

    /* renamed from: w  reason: collision with root package name */
    public final h0 f51652w;

    /* renamed from: x  reason: collision with root package name */
    public final c f51653x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f51654y;

    public b0(h0 h0Var) {
        jo.p.h(h0Var, "source");
        this.f51652w = h0Var;
        this.f51653x = new c();
    }

    @Override // rp.e
    public c A() {
        return this.f51653x;
    }

    @Override // rp.e
    public int A1() {
        I0(4L);
        return this.f51653x.A1();
    }

    @Override // rp.e
    public long C0() {
        I0(8L);
        return this.f51653x.C0();
    }

    @Override // rp.e
    public void I0(long j10) {
        if (!n0(j10)) {
            throw new EOFException();
        }
    }

    @Override // rp.e
    public long O1() {
        byte n10;
        I0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!n0(i11)) {
                break;
            }
            n10 = this.f51653x.n(i10);
            if ((n10 < ((byte) 48) || n10 > ((byte) 57)) && ((n10 < ((byte) 97) || n10 > ((byte) 102)) && (n10 < ((byte) 65) || n10 > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            String num = Integer.toString(n10, so.a.a(so.a.a(16)));
            jo.p.g(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new NumberFormatException(jo.p.o("Expected leading [0-9a-fA-F] character but was 0x", num));
        }
        return this.f51653x.O1();
    }

    @Override // rp.e
    public String P0(long j10) {
        I0(j10);
        return this.f51653x.P0(j10);
    }

    @Override // rp.e
    public InputStream P1() {
        return new a();
    }

    @Override // rp.e
    public String R(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            byte b10 = (byte) 10;
            long c10 = c(b10, 0L, j11);
            if (c10 != -1) {
                return sp.f.c(this.f51653x, c10);
            }
            if (j11 < Long.MAX_VALUE && n0(j11) && this.f51653x.n(j11 - 1) == ((byte) 13) && n0(1 + j11) && this.f51653x.n(j11) == b10) {
                return sp.f.c(this.f51653x, j11);
            }
            c cVar = new c();
            c cVar2 = this.f51653x;
            cVar2.i(cVar, 0L, Math.min(32, cVar2.X()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f51653x.X(), j10) + " content=" + cVar.G().q() + (char) 8230);
        }
        throw new IllegalArgumentException(jo.p.o("limit < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // rp.e
    public f R0(long j10) {
        I0(j10);
        return this.f51653x.R0(j10);
    }

    @Override // rp.e
    public byte[] Z0() {
        this.f51653x.H0(this.f51652w);
        return this.f51653x.Z0();
    }

    public long a(byte b10) {
        return c(b10, 0L, Long.MAX_VALUE);
    }

    @Override // rp.e
    public boolean a1() {
        if (!this.f51654y) {
            return this.f51653x.a1() && this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.e
    public long b0(f0 f0Var) {
        jo.p.h(f0Var, "sink");
        long j10 = 0;
        while (this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long e10 = this.f51653x.e();
            if (e10 > 0) {
                j10 += e10;
                f0Var.O0(this.f51653x, e10);
            }
        }
        if (this.f51653x.X() > 0) {
            long X = j10 + this.f51653x.X();
            c cVar = this.f51653x;
            f0Var.O0(cVar, cVar.X());
            return X;
        }
        return j10;
    }

    public long c(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f51654y) {
            if (0 > j10 || j10 > j11) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
            }
            while (j10 < j11) {
                long q10 = this.f51653x.q(b10, j10, j11);
                if (q10 != -1) {
                    return q10;
                }
                long X = this.f51653x.X();
                if (X >= j11 || this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                j10 = Math.max(j10, X);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.e
    public boolean c1(long j10, f fVar) {
        jo.p.h(fVar, "bytes");
        return h(j10, fVar, 0, fVar.G());
    }

    @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f51654y) {
            return;
        }
        this.f51654y = true;
        this.f51652w.close();
        this.f51653x.clear();
    }

    public long d(f fVar, long j10) {
        jo.p.h(fVar, "bytes");
        if (!(!this.f51654y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long v10 = this.f51653x.v(fVar, j10);
            if (v10 != -1) {
                return v10;
            }
            long X = this.f51653x.X();
            if (this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (X - fVar.G()) + 1);
        }
    }

    public long e(f fVar, long j10) {
        jo.p.h(fVar, "targetBytes");
        if (!(!this.f51654y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long z10 = this.f51653x.z(fVar, j10);
            if (z10 != -1) {
                return z10;
            }
            long X = this.f51653x.X();
            if (this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, X);
        }
    }

    @Override // rp.h0
    public long f1(c cVar, long j10) {
        jo.p.h(cVar, "sink");
        if (j10 >= 0) {
            if (!this.f51654y) {
                if (this.f51653x.X() == 0 && this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                return this.f51653x.f1(cVar, Math.min(j10, this.f51653x.X()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(jo.p.o("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    public boolean h(long j10, f fVar, int i10, int i11) {
        jo.p.h(fVar, "bytes");
        if (!this.f51654y) {
            if (j10 >= 0 && i10 >= 0 && i11 >= 0 && fVar.G() - i10 >= i11) {
                if (i11 <= 0) {
                    return true;
                }
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    long j11 = i12 + j10;
                    if (!n0(1 + j11) || this.f51653x.n(j11) != fVar.l(i12 + i10)) {
                        break;
                    } else if (i13 >= i11) {
                        return true;
                    } else {
                        i12 = i13;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f51654y;
    }

    @Override // rp.e
    public void k(long j10) {
        if (!(!this.f51654y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (this.f51653x.X() == 0 && this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f51653x.X());
            this.f51653x.k(min);
            j10 -= min;
        }
    }

    @Override // rp.e
    public c l() {
        return this.f51653x;
    }

    @Override // rp.h0
    public i0 m() {
        return this.f51652w.m();
    }

    @Override // rp.e
    public boolean n0(long j10) {
        if (j10 >= 0) {
            if (!this.f51654y) {
                while (this.f51653x.X() < j10) {
                    if (this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(jo.p.o("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // rp.e
    public e peek() {
        return t.c(new z(this));
    }

    @Override // rp.e
    public String q1(Charset charset) {
        jo.p.h(charset, "charset");
        this.f51653x.H0(this.f51652w);
        return this.f51653x.q1(charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        jo.p.h(byteBuffer, "sink");
        if (this.f51653x.X() == 0 && this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f51653x.read(byteBuffer);
    }

    @Override // rp.e
    public byte readByte() {
        I0(1L);
        return this.f51653x.readByte();
    }

    @Override // rp.e
    public int readInt() {
        I0(4L);
        return this.f51653x.readInt();
    }

    @Override // rp.e
    public short readShort() {
        I0(2L);
        return this.f51653x.readShort();
    }

    @Override // rp.e
    public String s0() {
        return R(Long.MAX_VALUE);
    }

    @Override // rp.e
    public byte[] t0(long j10) {
        I0(j10);
        return this.f51653x.t0(j10);
    }

    public String toString() {
        return "buffer(" + this.f51652w + ')';
    }

    @Override // rp.e
    public long w1(f fVar) {
        jo.p.h(fVar, "targetBytes");
        return e(fVar, 0L);
    }

    @Override // rp.e
    public int x1(w wVar) {
        jo.p.h(wVar, "options");
        if (!this.f51654y) {
            while (true) {
                int d10 = sp.f.d(this.f51653x, wVar, true);
                if (d10 == -2) {
                    if (this.f51652w.f1(this.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        break;
                    }
                } else if (d10 != -1) {
                    this.f51653x.k(wVar.j()[d10].G());
                    return d10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // rp.e
    public short y0() {
        I0(2L);
        return this.f51653x.y0();
    }

    @Override // rp.e
    public long z0(f fVar) {
        jo.p.h(fVar, "bytes");
        return d(fVar, 0L);
    }

    /* loaded from: classes4.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            b0 b0Var = b0.this;
            if (!b0Var.f51654y) {
                return (int) Math.min(b0Var.f51653x.X(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            b0.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            b0 b0Var = b0.this;
            if (!b0Var.f51654y) {
                if (b0Var.f51653x.X() == 0) {
                    b0 b0Var2 = b0.this;
                    if (b0Var2.f51652w.f1(b0Var2.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                }
                return b0.this.f51653x.readByte() & TagConstant.TAG_CAT_RESERVED;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return b0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            jo.p.h(bArr, "data");
            if (!b0.this.f51654y) {
                n0.b(bArr.length, i10, i11);
                if (b0.this.f51653x.X() == 0) {
                    b0 b0Var = b0.this;
                    if (b0Var.f51652w.f1(b0Var.f51653x, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                }
                return b0.this.f51653x.F(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
