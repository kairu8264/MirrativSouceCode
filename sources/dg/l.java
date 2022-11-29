package dg;

import android.content.Context;

/* loaded from: classes3.dex */
public final class l implements fg.b<k> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<Context> f29630a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<i> f29631b;

    public l(rn.a<Context> aVar, rn.a<i> aVar2) {
        this.f29630a = aVar;
        this.f29631b = aVar2;
    }

    public static l a(rn.a<Context> aVar, rn.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // rn.a
    /* renamed from: b */
    public k get() {
        return c(this.f29630a.get(), this.f29631b.get());
    }
}
