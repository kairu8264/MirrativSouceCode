package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class et0 implements qh2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3769a;

    /* renamed from: b  reason: collision with root package name */
    public final fs f3770b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3771c;

    /* renamed from: d  reason: collision with root package name */
    public final bu0 f3772d;

    /* renamed from: e  reason: collision with root package name */
    public final et0 f3773e = this;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<Context> f3774f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<fs> f3775g;

    /* renamed from: h  reason: collision with root package name */
    public final eo3<b62> f3776h;

    /* renamed from: i  reason: collision with root package name */
    public final eo3<f62> f3777i;

    /* renamed from: j  reason: collision with root package name */
    public final eo3<nh2> f3778j;

    public /* synthetic */ et0(bu0 bu0Var, Context context, String str, fs fsVar, st0 st0Var) {
        eo3 eo3Var;
        eo3 eo3Var2;
        eo3 eo3Var3;
        this.f3772d = bu0Var;
        this.f3769a = context;
        this.f3770b = fsVar;
        this.f3771c = str;
        rn3 a10 = sn3.a(context);
        this.f3774f = a10;
        rn3 a11 = sn3.a(fsVar);
        this.f3775g = a11;
        eo3Var = bu0Var.f2530p;
        eo3<b62> a12 = pn3.a(new c62(eo3Var));
        this.f3776h = a12;
        eo3<f62> a13 = pn3.a(h62.a());
        this.f3777i = a13;
        eo3Var2 = bu0Var.f2532q;
        eo3Var3 = bu0Var.O;
        this.f3778j = pn3.a(new oh2(a10, eo3Var2, a11, eo3Var3, a12, a13, am2.a()));
    }

    @Override // ai.qh2
    public final g52 zza() {
        return new g52(this.f3769a, this.f3770b, this.f3771c, this.f3778j.zzb(), this.f3776h.zzb());
    }
}
