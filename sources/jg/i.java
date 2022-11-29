package jg;

import android.content.Context;
import kg.y;

/* loaded from: classes3.dex */
public final class i implements fg.b<y> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<Context> f38051a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<lg.d> f38052b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<kg.g> f38053c;

    /* renamed from: d  reason: collision with root package name */
    public final rn.a<ng.a> f38054d;

    public i(rn.a<Context> aVar, rn.a<lg.d> aVar2, rn.a<kg.g> aVar3, rn.a<ng.a> aVar4) {
        this.f38051a = aVar;
        this.f38052b = aVar2;
        this.f38053c = aVar3;
        this.f38054d = aVar4;
    }

    public static i a(rn.a<Context> aVar, rn.a<lg.d> aVar2, rn.a<kg.g> aVar3, rn.a<ng.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static y c(Context context, lg.d dVar, kg.g gVar, ng.a aVar) {
        return (y) fg.d.c(h.a(context, dVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public y get() {
        return c(this.f38051a.get(), this.f38052b.get(), this.f38053c.get(), this.f38054d.get());
    }
}
