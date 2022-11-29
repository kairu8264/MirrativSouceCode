package rp;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class k implements f0 {

    /* renamed from: w  reason: collision with root package name */
    public final f0 f51706w;

    public k(f0 f0Var) {
        jo.p.h(f0Var, "delegate");
        this.f51706w = f0Var;
    }

    @Override // rp.f0
    public void O0(c cVar, long j10) throws IOException {
        jo.p.h(cVar, "source");
        this.f51706w.O0(cVar, j10);
    }

    @Override // rp.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51706w.close();
    }

    @Override // rp.f0, java.io.Flushable
    public void flush() throws IOException {
        this.f51706w.flush();
    }

    @Override // rp.f0
    public i0 m() {
        return this.f51706w.m();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append('(');
        sb2.append(this.f51706w);
        sb2.append(')');
        return sb2.toString();
    }
}
