package lg;

import android.content.Context;

/* loaded from: classes3.dex */
public final class u0 implements fg.b<t0> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<Context> f40211a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<String> f40212b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<Integer> f40213c;

    public u0(rn.a<Context> aVar, rn.a<String> aVar2, rn.a<Integer> aVar3) {
        this.f40211a = aVar;
        this.f40212b = aVar2;
        this.f40213c = aVar3;
    }

    public static u0 a(rn.a<Context> aVar, rn.a<String> aVar2, rn.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // rn.a
    /* renamed from: b */
    public t0 get() {
        return c(this.f40211a.get(), this.f40212b.get(), this.f40213c.get().intValue());
    }
}
