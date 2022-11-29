package ai;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rs0 extends qd2 {

    /* renamed from: a  reason: collision with root package name */
    public final ye2 f9550a;

    /* renamed from: b  reason: collision with root package name */
    public final bu0 f9551b;

    /* renamed from: c  reason: collision with root package name */
    public final rs0 f9552c = this;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Integer> f9553d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<nd2> f9554e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<String> f9555f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<wd2> f9556g;

    /* renamed from: h  reason: collision with root package name */
    public final eo3<de2> f9557h;

    /* renamed from: i  reason: collision with root package name */
    public final eo3<he2> f9558i;

    /* renamed from: j  reason: collision with root package name */
    public final eo3<oe2> f9559j;

    /* renamed from: k  reason: collision with root package name */
    public final eo3<ve2> f9560k;

    /* renamed from: l  reason: collision with root package name */
    public final eo3<of2> f9561l;

    /* renamed from: m  reason: collision with root package name */
    public final eo3<Boolean> f9562m;

    /* renamed from: n  reason: collision with root package name */
    public final eo3<kf2> f9563n;

    /* renamed from: o  reason: collision with root package name */
    public final eo3<String> f9564o;

    /* renamed from: p  reason: collision with root package name */
    public final eo3<xo1> f9565p;

    /* renamed from: q  reason: collision with root package name */
    public final eo3<xo1> f9566q;

    /* renamed from: r  reason: collision with root package name */
    public final eo3<xo1> f9567r;

    /* renamed from: s  reason: collision with root package name */
    public final eo3<xo1> f9568s;

    /* renamed from: t  reason: collision with root package name */
    public final eo3<Map<wp2, xo1>> f9569t;

    /* renamed from: u  reason: collision with root package name */
    public final eo3<Set<gc1<dq2>>> f9570u;

    /* renamed from: v  reason: collision with root package name */
    public final eo3<Set<gc1<dq2>>> f9571v;

    /* renamed from: w  reason: collision with root package name */
    public final eo3 f9572w;

    /* renamed from: x  reason: collision with root package name */
    public final eo3<cq2> f9573x;

    public /* synthetic */ rs0(bu0 bu0Var, ye2 ye2Var, st0 st0Var) {
        dv0 dv0Var;
        eo3 eo3Var;
        eo3 eo3Var2;
        gs0 gs0Var;
        eo3 eo3Var3;
        dv0 dv0Var2;
        eo3 eo3Var4;
        eo3 eo3Var5;
        eo3 eo3Var6;
        xu0 xu0Var;
        eo3 eo3Var7;
        zu0 zu0Var;
        bv0 bv0Var;
        eo3 eo3Var8;
        eo3 eo3Var9;
        eo3 eo3Var10;
        fv0 fv0Var;
        eo3 eo3Var11;
        eo3 eo3Var12;
        eo3 eo3Var13;
        this.f9551b = bu0Var;
        this.f9550a = ye2Var;
        af2 af2Var = new af2(ye2Var);
        this.f9553d = af2Var;
        dv0Var = cv0.f3045a;
        eo3Var = bu0Var.f2516i;
        eo3Var2 = bu0Var.f2528o;
        this.f9554e = new pd2(dv0Var, eo3Var, eo3Var2, xo2.a(), af2Var);
        ze2 ze2Var = new ze2(ye2Var);
        this.f9555f = ze2Var;
        gs0Var = es0.f3759a;
        eo3Var3 = bu0Var.f2516i;
        this.f9556g = new yd2(gs0Var, eo3Var3, ze2Var, xo2.a());
        dv0Var2 = cv0.f3045a;
        eo3Var4 = bu0Var.f2516i;
        eo3Var5 = bu0Var.Z;
        eo3Var6 = bu0Var.f2528o;
        this.f9557h = new fe2(dv0Var2, af2Var, eo3Var4, eo3Var5, eo3Var6, xo2.a(), ze2Var);
        xu0Var = wu0.f11750a;
        xo2 a10 = xo2.a();
        eo3Var7 = bu0Var.f2516i;
        this.f9558i = new je2(xu0Var, a10, eo3Var7);
        zu0Var = yu0.f12733a;
        this.f9559j = new qe2(zu0Var, xo2.a(), ze2Var);
        bv0Var = av0.f2135a;
        eo3Var8 = bu0Var.f2528o;
        eo3Var9 = bu0Var.f2516i;
        this.f9560k = new xe2(bv0Var, eo3Var8, eo3Var9);
        this.f9561l = new qf2(xo2.a());
        cf2 cf2Var = new cf2(ye2Var);
        this.f9562m = cf2Var;
        eo3Var10 = bu0Var.Z;
        fv0Var = ev0.f3791a;
        xo2 a11 = xo2.a();
        eo3Var11 = bu0Var.f2528o;
        this.f9563n = new mf2(eo3Var10, cf2Var, fv0Var, a11, ze2Var, eo3Var11);
        df2 df2Var = new df2(ye2Var);
        this.f9564o = df2Var;
        eo3<xo1> a12 = pn3.a(qo1.a());
        this.f9565p = a12;
        eo3<xo1> a13 = pn3.a(oo1.a());
        this.f9566q = a13;
        eo3<xo1> a14 = pn3.a(so1.a());
        this.f9567r = a14;
        eo3<xo1> a15 = pn3.a(uo1.a());
        this.f9568s = a15;
        un3 b10 = vn3.b(4);
        b10.b(wp2.GMS_SIGNALS, a12);
        b10.b(wp2.BUILD_URL, a13);
        b10.b(wp2.HTTP, a14);
        b10.b(wp2.PRE_PROCESS, a15);
        vn3 c10 = b10.c();
        this.f9569t = c10;
        eo3Var12 = bu0Var.f2516i;
        eo3<Set<gc1<dq2>>> a16 = pn3.a(new vo1(df2Var, eo3Var12, xo2.a(), c10));
        this.f9570u = a16;
        bo3 a17 = co3.a(0, 1);
        a17.b(a16);
        co3 c11 = a17.c();
        this.f9571v = c11;
        fq2 fq2Var = new fq2(c11);
        this.f9572w = fq2Var;
        xo2 a18 = xo2.a();
        eo3Var13 = bu0Var.f2528o;
        this.f9573x = pn3.a(new eq2(a18, eo3Var13, fq2Var));
    }

    @Override // ai.qd2
    public final bd2<JSONObject> a() {
        eo3 eo3Var;
        eo3 eo3Var2;
        rr0 rr0Var;
        eo3 eo3Var3;
        rr0 rr0Var2;
        eo3 eo3Var4;
        eo3 eo3Var5;
        eo3 eo3Var6;
        rr0 rr0Var3;
        rr0 rr0Var4;
        rr0 rr0Var5;
        eo3 eo3Var7;
        eo3 eo3Var8;
        eo3 eo3Var9;
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        ti0 ti0Var = new ti0();
        zn3.b(t43Var);
        String a10 = this.f9550a.a();
        zn3.b(a10);
        oe2 oe2Var = new oe2(ti0Var, t43Var, a10, null);
        eo3Var = this.f9551b.f2528o;
        gb2 gb2Var = new gb2(oe2Var, 0L, (ScheduledExecutorService) eo3Var.zzb());
        uc0 uc0Var = new uc0();
        eo3Var2 = this.f9551b.f2528o;
        rr0Var = this.f9551b.f2502b;
        Context a11 = rr0Var.a();
        zn3.b(a11);
        ve2 ve2Var = new ve2(uc0Var, (ScheduledExecutorService) eo3Var2.zzb(), a11, null);
        eo3Var3 = this.f9551b.f2528o;
        gb2 gb2Var2 = new gb2(ve2Var, ((Long) ft.c().c(ox.f8135y2)).longValue(), (ScheduledExecutorService) eo3Var3.zzb());
        wi0 wi0Var = new wi0();
        rr0Var2 = this.f9551b.f2502b;
        Context a12 = rr0Var2.a();
        zn3.b(a12);
        eo3Var4 = this.f9551b.f2528o;
        zn3.b(t43Var);
        nd2 nd2Var = new nd2(wi0Var, a12, (ScheduledExecutorService) eo3Var4.zzb(), t43Var, this.f9550a.f(), null);
        eo3Var5 = this.f9551b.f2528o;
        gb2 gb2Var3 = new gb2(nd2Var, 0L, (ScheduledExecutorService) eo3Var5.zzb());
        zn3.b(t43Var);
        of2 of2Var = new of2(t43Var);
        eo3Var6 = this.f9551b.f2528o;
        gb2 gb2Var4 = new gb2(of2Var, 0L, (ScheduledExecutorService) eo3Var6.zzb());
        xc2<? extends wc2<JSONObject>> a13 = gf2.a();
        rr0Var3 = this.f9551b.f2502b;
        Context a14 = rr0Var3.a();
        zn3.b(a14);
        String a15 = this.f9550a.a();
        zn3.b(a15);
        zn3.b(t43Var);
        wd2 wd2Var = new wd2(null, a14, a15, t43Var);
        en enVar = new en();
        zn3.b(t43Var);
        rr0Var4 = this.f9551b.f2502b;
        Context a16 = rr0Var4.a();
        zn3.b(a16);
        wi0 wi0Var2 = new wi0();
        int f10 = this.f9550a.f();
        rr0Var5 = this.f9551b.f2502b;
        Context a17 = rr0Var5.a();
        zn3.b(a17);
        eo3Var7 = this.f9551b.Z;
        fj0 fj0Var = (fj0) eo3Var7.zzb();
        eo3Var8 = this.f9551b.f2528o;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eo3Var8.zzb();
        zn3.b(t43Var);
        String a18 = this.f9550a.a();
        zn3.b(a18);
        eo3Var9 = this.f9551b.f2547x0;
        return new bd2<>(t43Var, j03.r(gb2Var, gb2Var2, gb2Var3, gb2Var4, a13, wd2Var, new he2(enVar, t43Var, a16, null), d(), e(), new de2(wi0Var2, f10, a17, fj0Var, scheduledExecutorService, t43Var, a18, null), (xc2) eo3Var9.zzb()));
    }

    @Override // ai.qd2
    public final bd2<JSONObject> b() {
        eo3 eo3Var;
        eo3 eo3Var2;
        ti0 ti0Var = new ti0();
        ui0 ui0Var = new ui0();
        eo3Var = this.f9551b.f2547x0;
        Object zzb = eo3Var.zzb();
        td2 e10 = e();
        se2 d10 = d();
        kn3 b10 = pn3.b(this.f9554e);
        kn3 b11 = pn3.b(this.f9556g);
        kn3 b12 = pn3.b(this.f9557h);
        kn3 b13 = pn3.b(this.f9558i);
        kn3 b14 = pn3.b(this.f9559j);
        kn3 b15 = pn3.b(this.f9560k);
        kn3 b16 = pn3.b(this.f9561l);
        kn3 b17 = pn3.b(this.f9563n);
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        eo3Var2 = this.f9551b.f2528o;
        return hf2.a(ti0Var, ui0Var, zzb, e10, d10, b10, b11, b12, b13, b14, b15, b16, b17, t43Var, (ScheduledExecutorService) eo3Var2.zzb());
    }

    @Override // ai.qd2
    public final cq2 c() {
        return this.f9573x.zzb();
    }

    public final se2 d() {
        yw ywVar = new yw();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        List<String> d10 = this.f9550a.d();
        zn3.b(d10);
        return new se2(ywVar, t43Var, d10, null);
    }

    public final td2 e() {
        wi0 wi0Var = new wi0();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        String b10 = this.f9550a.b();
        zn3.b(b10);
        return new td2(wi0Var, t43Var, b10, this.f9550a.c(), this.f9550a.f(), null);
    }
}
