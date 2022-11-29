package rp;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class l implements h0 {

    /* renamed from: w  reason: collision with root package name */
    public final h0 f51713w;

    public l(h0 h0Var) {
        jo.p.h(h0Var, "delegate");
        this.f51713w = h0Var;
    }

    public final h0 a() {
        return this.f51713w;
    }

    @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51713w.close();
    }

    @Override // rp.h0
    public long f1(c cVar, long j10) throws IOException {
        jo.p.h(cVar, "sink");
        return this.f51713w.f1(cVar, j10);
    }

    @Override // rp.h0
    public i0 m() {
        return this.f51713w.m();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append('(');
        sb2.append(this.f51713w);
        sb2.append(')');
        return sb2.toString();
    }
}
