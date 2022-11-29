package dg;

import android.content.Context;

/* loaded from: classes3.dex */
public final class j implements fg.b<i> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<Context> f29622a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<ng.a> f29623b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<ng.a> f29624c;

    public j(rn.a<Context> aVar, rn.a<ng.a> aVar2, rn.a<ng.a> aVar3) {
        this.f29622a = aVar;
        this.f29623b = aVar2;
        this.f29624c = aVar3;
    }

    public static j a(rn.a<Context> aVar, rn.a<ng.a> aVar2, rn.a<ng.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, ng.a aVar, ng.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // rn.a
    /* renamed from: b */
    public i get() {
        return c(this.f29622a.get(), this.f29623b.get(), this.f29624c.get());
    }
}
