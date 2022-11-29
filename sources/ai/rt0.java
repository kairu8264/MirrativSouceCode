package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class rt0 implements kj2 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f9582a;

    /* renamed from: b  reason: collision with root package name */
    public final rt0 f9583b = this;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Context> f9584c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<fs> f9585d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<String> f9586e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<b62> f9587f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<ik2> f9588g;

    /* renamed from: h  reason: collision with root package name */
    public final eo3<hj2> f9589h;

    /* renamed from: i  reason: collision with root package name */
    public final eo3<j62> f9590i;

    public /* synthetic */ rt0(bu0 bu0Var, Context context, String str, fs fsVar, st0 st0Var) {
        eo3 eo3Var;
        eo3 eo3Var2;
        eo3 eo3Var3;
        eo3 eo3Var4;
        this.f9582a = bu0Var;
        rn3 a10 = sn3.a(context);
        this.f9584c = a10;
        rn3 a11 = sn3.a(fsVar);
        this.f9585d = a11;
        rn3 a12 = sn3.a(str);
        this.f9586e = a12;
        eo3Var = bu0Var.f2530p;
        eo3<b62> a13 = pn3.a(new c62(eo3Var));
        this.f9587f = a13;
        eo3Var2 = bu0Var.f2539t0;
        eo3<ik2> a14 = pn3.a(new jk2(eo3Var2));
        this.f9588g = a14;
        eo3Var3 = bu0Var.f2532q;
        eo3Var4 = bu0Var.O;
        eo3<hj2> a15 = pn3.a(new ij2(a10, eo3Var3, eo3Var4, a13, a14, am2.a()));
        this.f9589h = a15;
        this.f9590i = pn3.a(new k62(a10, a11, a12, a15, a13, a14));
    }

    @Override // ai.kj2
    public final j62 zza() {
        return this.f9590i.zzb();
    }
}
