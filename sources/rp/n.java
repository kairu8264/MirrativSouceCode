package rp;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
public final class n implements h0 {
    public final CRC32 A;

    /* renamed from: w  reason: collision with root package name */
    public byte f51717w;

    /* renamed from: x  reason: collision with root package name */
    public final b0 f51718x;

    /* renamed from: y  reason: collision with root package name */
    public final Inflater f51719y;

    /* renamed from: z  reason: collision with root package name */
    public final o f51720z;

    public n(h0 h0Var) {
        jo.p.h(h0Var, "source");
        b0 b0Var = new b0(h0Var);
        this.f51718x = b0Var;
        Inflater inflater = new Inflater(true);
        this.f51719y = inflater;
        this.f51720z = new o((e) b0Var, inflater);
        this.A = new CRC32();
    }

    public final void a(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        jo.p.g(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    public final void c() throws IOException {
        this.f51718x.I0(10L);
        byte n10 = this.f51718x.f51653x.n(3L);
        boolean z10 = ((n10 >> 1) & 1) == 1;
        if (z10) {
            e(this.f51718x.f51653x, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f51718x.readShort());
        this.f51718x.k(8L);
        if (((n10 >> 2) & 1) == 1) {
            this.f51718x.I0(2L);
            if (z10) {
                e(this.f51718x.f51653x, 0L, 2L);
            }
            long y02 = this.f51718x.f51653x.y0();
            this.f51718x.I0(y02);
            if (z10) {
                e(this.f51718x.f51653x, 0L, y02);
            }
            this.f51718x.k(y02);
        }
        if (((n10 >> 3) & 1) == 1) {
            long a10 = this.f51718x.a((byte) 0);
            if (a10 != -1) {
                if (z10) {
                    e(this.f51718x.f51653x, 0L, a10 + 1);
                }
                this.f51718x.k(a10 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((n10 >> 4) & 1) == 1) {
            long a11 = this.f51718x.a((byte) 0);
            if (a11 != -1) {
                if (z10) {
                    e(this.f51718x.f51653x, 0L, a11 + 1);
                }
                this.f51718x.k(a11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            a("FHCRC", this.f51718x.y0(), (short) this.A.getValue());
            this.A.reset();
        }
    }

    @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51720z.close();
    }

    public final void d() throws IOException {
        a("CRC", this.f51718x.A1(), (int) this.A.getValue());
        a("ISIZE", this.f51718x.A1(), (int) this.f51719y.getBytesWritten());
    }

    public final void e(c cVar, long j10, long j11) {
        int i10;
        c0 c0Var = cVar.f51656w;
        jo.p.e(c0Var);
        while (true) {
            int i11 = c0Var.f51667c;
            int i12 = c0Var.f51666b;
            if (j10 < i11 - i12) {
                break;
            }
            j10 -= i11 - i12;
            c0Var = c0Var.f51670f;
            jo.p.e(c0Var);
        }
        while (j11 > 0) {
            int min = (int) Math.min(c0Var.f51667c - i10, j11);
            this.A.update(c0Var.f51665a, (int) (c0Var.f51666b + j10), min);
            j11 -= min;
            c0Var = c0Var.f51670f;
            jo.p.e(c0Var);
            j10 = 0;
        }
    }

    @Override // rp.h0
    public long f1(c cVar, long j10) throws IOException {
        jo.p.h(cVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 == 0) {
                return 0L;
            }
            if (this.f51717w == 0) {
                c();
                this.f51717w = (byte) 1;
            }
            if (this.f51717w == 1) {
                long X = cVar.X();
                long f12 = this.f51720z.f1(cVar, j10);
                if (f12 != -1) {
                    e(cVar, X, f12);
                    return f12;
                }
                this.f51717w = (byte) 2;
            }
            if (this.f51717w == 2) {
                d();
                this.f51717w = (byte) 3;
                if (!this.f51718x.a1()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(jo.p.o("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // rp.h0
    public i0 m() {
        return this.f51718x.m();
    }
}
