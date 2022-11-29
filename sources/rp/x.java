package rp;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class x implements f0 {

    /* renamed from: w  reason: collision with root package name */
    public final OutputStream f51734w;

    /* renamed from: x  reason: collision with root package name */
    public final i0 f51735x;

    public x(OutputStream outputStream, i0 i0Var) {
        jo.p.h(outputStream, "out");
        jo.p.h(i0Var, "timeout");
        this.f51734w = outputStream;
        this.f51735x = i0Var;
    }

    @Override // rp.f0
    public void O0(c cVar, long j10) {
        jo.p.h(cVar, "source");
        n0.b(cVar.X(), 0L, j10);
        while (j10 > 0) {
            this.f51735x.f();
            c0 c0Var = cVar.f51656w;
            jo.p.e(c0Var);
            int min = (int) Math.min(j10, c0Var.f51667c - c0Var.f51666b);
            this.f51734w.write(c0Var.f51665a, c0Var.f51666b, min);
            c0Var.f51666b += min;
            long j11 = min;
            j10 -= j11;
            cVar.O(cVar.X() - j11);
            if (c0Var.f51666b == c0Var.f51667c) {
                cVar.f51656w = c0Var.b();
                d0.b(c0Var);
            }
        }
    }

    @Override // rp.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51734w.close();
    }

    @Override // rp.f0, java.io.Flushable
    public void flush() {
        this.f51734w.flush();
    }

    @Override // rp.f0
    public i0 m() {
        return this.f51735x;
    }

    public String toString() {
        return "sink(" + this.f51734w + ')';
    }
}
