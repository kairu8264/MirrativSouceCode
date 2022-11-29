package dp;

import uo.n;
import wn.v;

/* loaded from: classes4.dex */
public final class a extends n {

    /* renamed from: w  reason: collision with root package name */
    public final i f29745w;

    /* renamed from: x  reason: collision with root package name */
    public final int f29746x;

    public a(i iVar, int i10) {
        this.f29745w = iVar;
        this.f29746x = i10;
    }

    @Override // uo.o
    public void a(Throwable th2) {
        this.f29745w.q(this.f29746x);
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
        a(th2);
        return v.f59242a;
    }

    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f29745w + ", " + this.f29746x + ']';
    }
}
