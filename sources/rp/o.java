package rp;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
public final class o implements h0 {

    /* renamed from: w  reason: collision with root package name */
    public final e f51723w;

    /* renamed from: x  reason: collision with root package name */
    public final Inflater f51724x;

    /* renamed from: y  reason: collision with root package name */
    public int f51725y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f51726z;

    public o(e eVar, Inflater inflater) {
        jo.p.h(eVar, "source");
        jo.p.h(inflater, "inflater");
        this.f51723w = eVar;
        this.f51724x = inflater;
    }

    public final long a(c cVar, long j10) throws IOException {
        jo.p.h(cVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (!this.f51726z) {
                if (i10 == 0) {
                    return 0L;
                }
                try {
                    c0 d02 = cVar.d0(1);
                    c();
                    int inflate = this.f51724x.inflate(d02.f51665a, d02.f51667c, (int) Math.min(j10, 8192 - d02.f51667c));
                    d();
                    if (inflate > 0) {
                        d02.f51667c += inflate;
                        long j11 = inflate;
                        cVar.O(cVar.X() + j11);
                        return j11;
                    }
                    if (d02.f51666b == d02.f51667c) {
                        cVar.f51656w = d02.b();
                        d0.b(d02);
                    }
                    return 0L;
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(jo.p.o("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    public final boolean c() throws IOException {
        if (this.f51724x.needsInput()) {
            if (this.f51723w.a1()) {
                return true;
            }
            c0 c0Var = this.f51723w.l().f51656w;
            jo.p.e(c0Var);
            int i10 = c0Var.f51667c;
            int i11 = c0Var.f51666b;
            int i12 = i10 - i11;
            this.f51725y = i12;
            this.f51724x.setInput(c0Var.f51665a, i11, i12);
            return false;
        }
        return false;
    }

    @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f51726z) {
            return;
        }
        this.f51724x.end();
        this.f51726z = true;
        this.f51723w.close();
    }

    public final void d() {
        int i10 = this.f51725y;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f51724x.getRemaining();
        this.f51725y -= remaining;
        this.f51723w.k(remaining);
    }

    @Override // rp.h0
    public long f1(c cVar, long j10) throws IOException {
        jo.p.h(cVar, "sink");
        do {
            long a10 = a(cVar, j10);
            if (a10 > 0) {
                return a10;
            }
            if (this.f51724x.finished() || this.f51724x.needsDictionary()) {
                return -1L;
            }
        } while (!this.f51723w.a1());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // rp.h0
    public i0 m() {
        return this.f51723w.m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(h0 h0Var, Inflater inflater) {
        this(t.c(h0Var), inflater);
        jo.p.h(h0Var, "source");
        jo.p.h(inflater, "inflater");
    }
}
