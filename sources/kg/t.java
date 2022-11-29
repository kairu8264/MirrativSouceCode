package kg;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class t implements fg.b<s> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<Context> f38794a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<dg.e> f38795b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<lg.d> f38796c;

    /* renamed from: d  reason: collision with root package name */
    public final rn.a<y> f38797d;

    /* renamed from: e  reason: collision with root package name */
    public final rn.a<Executor> f38798e;

    /* renamed from: f  reason: collision with root package name */
    public final rn.a<mg.a> f38799f;

    /* renamed from: g  reason: collision with root package name */
    public final rn.a<ng.a> f38800g;

    /* renamed from: h  reason: collision with root package name */
    public final rn.a<ng.a> f38801h;

    /* renamed from: i  reason: collision with root package name */
    public final rn.a<lg.c> f38802i;

    public t(rn.a<Context> aVar, rn.a<dg.e> aVar2, rn.a<lg.d> aVar3, rn.a<y> aVar4, rn.a<Executor> aVar5, rn.a<mg.a> aVar6, rn.a<ng.a> aVar7, rn.a<ng.a> aVar8, rn.a<lg.c> aVar9) {
        this.f38794a = aVar;
        this.f38795b = aVar2;
        this.f38796c = aVar3;
        this.f38797d = aVar4;
        this.f38798e = aVar5;
        this.f38799f = aVar6;
        this.f38800g = aVar7;
        this.f38801h = aVar8;
        this.f38802i = aVar9;
    }

    public static t a(rn.a<Context> aVar, rn.a<dg.e> aVar2, rn.a<lg.d> aVar3, rn.a<y> aVar4, rn.a<Executor> aVar5, rn.a<mg.a> aVar6, rn.a<ng.a> aVar7, rn.a<ng.a> aVar8, rn.a<lg.c> aVar9) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static s c(Context context, dg.e eVar, lg.d dVar, y yVar, Executor executor, mg.a aVar, ng.a aVar2, ng.a aVar3, lg.c cVar) {
        return new s(context, eVar, dVar, yVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // rn.a
    /* renamed from: b */
    public s get() {
        return c(this.f38794a.get(), this.f38795b.get(), this.f38796c.get(), this.f38797d.get(), this.f38798e.get(), this.f38799f.get(), this.f38800g.get(), this.f38801h.get(), this.f38802i.get());
    }
}
