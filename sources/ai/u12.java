package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class u12 implements rn3<t12> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f10558a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<cf1> f10559b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<zj0> f10560c;

    public u12(eo3<Context> eo3Var, eo3<cf1> eo3Var2, eo3<zj0> eo3Var3) {
        this.f10558a = eo3Var;
        this.f10559b = eo3Var2;
        this.f10560c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new t12(this.f10558a.zzb(), this.f10559b.zzb(), ((cs0) this.f10560c).a());
    }
}
