package rq;

import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final nq.a f51743a;

    /* renamed from: b  reason: collision with root package name */
    public final xq.a f51744b;

    /* renamed from: c  reason: collision with root package name */
    public final uq.a f51745c;

    public b(nq.a aVar, xq.a aVar2, uq.a aVar3) {
        p.h(aVar, "koin");
        p.h(aVar2, "scope");
        this.f51743a = aVar;
        this.f51744b = aVar2;
        this.f51745c = aVar3;
    }

    public final nq.a a() {
        return this.f51743a;
    }

    public final uq.a b() {
        return this.f51745c;
    }

    public final xq.a c() {
        return this.f51744b;
    }

    public /* synthetic */ b(nq.a aVar, xq.a aVar2, uq.a aVar3, int i10, h hVar) {
        this(aVar, aVar2, (i10 & 4) != 0 ? null : aVar3);
    }
}
