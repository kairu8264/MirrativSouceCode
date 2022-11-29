package cg;

import kg.w;

/* loaded from: classes3.dex */
public final class v implements fg.b<t> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<ng.a> f19635a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<ng.a> f19636b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<jg.e> f19637c;

    /* renamed from: d  reason: collision with root package name */
    public final rn.a<kg.s> f19638d;

    /* renamed from: e  reason: collision with root package name */
    public final rn.a<w> f19639e;

    public v(rn.a<ng.a> aVar, rn.a<ng.a> aVar2, rn.a<jg.e> aVar3, rn.a<kg.s> aVar4, rn.a<w> aVar5) {
        this.f19635a = aVar;
        this.f19636b = aVar2;
        this.f19637c = aVar3;
        this.f19638d = aVar4;
        this.f19639e = aVar5;
    }

    public static v a(rn.a<ng.a> aVar, rn.a<ng.a> aVar2, rn.a<jg.e> aVar3, rn.a<kg.s> aVar4, rn.a<w> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(ng.a aVar, ng.a aVar2, jg.e eVar, kg.s sVar, w wVar) {
        return new t(aVar, aVar2, eVar, sVar, wVar);
    }

    @Override // rn.a
    /* renamed from: b */
    public t get() {
        return c(this.f19635a.get(), this.f19636b.get(), this.f19637c.get(), this.f19638d.get(), this.f19639e.get());
    }
}
