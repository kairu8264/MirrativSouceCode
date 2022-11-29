package uo;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class q2 extends ao.a implements d2 {

    /* renamed from: w  reason: collision with root package name */
    public static final q2 f56080w = new q2();

    public q2() {
        super(d2.f56001s);
    }

    @Override // uo.d2
    public Object E(ao.d<? super wn.v> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // uo.d2
    public v K(x xVar) {
        return r2.f56082w;
    }

    @Override // uo.d2
    public i1 O(boolean z10, boolean z11, io.l<? super Throwable, wn.v> lVar) {
        return r2.f56082w;
    }

    @Override // uo.d2
    public void c(CancellationException cancellationException) {
    }

    @Override // uo.d2
    public boolean isActive() {
        return true;
    }

    @Override // uo.d2
    public CancellationException n() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // uo.d2
    public i1 p(io.l<? super Throwable, wn.v> lVar) {
        return r2.f56082w;
    }

    @Override // uo.d2
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }
}
