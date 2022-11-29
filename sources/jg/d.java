package jg;

import java.util.concurrent.Executor;
import kg.y;

/* loaded from: classes3.dex */
public final class d implements fg.b<c> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<Executor> f38045a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<dg.e> f38046b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<y> f38047c;

    /* renamed from: d  reason: collision with root package name */
    public final rn.a<lg.d> f38048d;

    /* renamed from: e  reason: collision with root package name */
    public final rn.a<mg.a> f38049e;

    public d(rn.a<Executor> aVar, rn.a<dg.e> aVar2, rn.a<y> aVar3, rn.a<lg.d> aVar4, rn.a<mg.a> aVar5) {
        this.f38045a = aVar;
        this.f38046b = aVar2;
        this.f38047c = aVar3;
        this.f38048d = aVar4;
        this.f38049e = aVar5;
    }

    public static d a(rn.a<Executor> aVar, rn.a<dg.e> aVar2, rn.a<y> aVar3, rn.a<lg.d> aVar4, rn.a<mg.a> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, dg.e eVar, y yVar, lg.d dVar, mg.a aVar) {
        return new c(executor, eVar, yVar, dVar, aVar);
    }

    @Override // rn.a
    /* renamed from: b */
    public c get() {
        return c(this.f38045a.get(), this.f38046b.get(), this.f38047c.get(), this.f38048d.get(), this.f38049e.get());
    }
}
