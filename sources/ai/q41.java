package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class q41 implements rn3<wg0> {

    /* renamed from: a  reason: collision with root package name */
    public final p41 f8818a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f8819b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<zj0> f8820c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<fl2> f8821d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<sg0> f8822e;

    public q41(p41 p41Var, eo3<Context> eo3Var, eo3<zj0> eo3Var2, eo3<fl2> eo3Var3, eo3<sg0> eo3Var4) {
        this.f8818a = p41Var;
        this.f8819b = eo3Var;
        this.f8820c = eo3Var2;
        this.f8821d = eo3Var3;
        this.f8822e = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zzb = this.f8819b.zzb();
        zj0 a10 = ((cs0) this.f8820c).a();
        fl2 a11 = ((k11) this.f8821d).a();
        sg0 sg0Var = new sg0();
        tg0 tg0Var = a11.A;
        if (tg0Var != null) {
            return new qg0(zzb, a10, tg0Var, a11.f4108s.f6614b, sg0Var, null);
        }
        return null;
    }
}
