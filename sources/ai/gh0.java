package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class gh0 extends bi0 {

    /* renamed from: b  reason: collision with root package name */
    public final vh.f f4438b;

    /* renamed from: c  reason: collision with root package name */
    public final gh0 f4439c = this;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Context> f4440d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<yg.r1> f4441e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<ai0> f4442f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<xg0> f4443g;

    /* renamed from: h  reason: collision with root package name */
    public final eo3<vh.f> f4444h;

    /* renamed from: i  reason: collision with root package name */
    public final eo3<ah0> f4445i;

    /* renamed from: j  reason: collision with root package name */
    public final eo3<ch0> f4446j;

    /* renamed from: k  reason: collision with root package name */
    public final eo3<gi0> f4447k;

    public /* synthetic */ gh0(Context context, vh.f fVar, yg.r1 r1Var, ai0 ai0Var, fh0 fh0Var) {
        this.f4438b = fVar;
        rn3 a10 = sn3.a(context);
        this.f4440d = a10;
        rn3 a11 = sn3.a(r1Var);
        this.f4441e = a11;
        rn3 a12 = sn3.a(ai0Var);
        this.f4442f = a12;
        this.f4443g = pn3.a(new zg0(a10, a11, a12));
        rn3 a13 = sn3.a(fVar);
        this.f4444h = a13;
        eo3<ah0> a14 = pn3.a(new bh0(a13, a11, a12));
        this.f4445i = a14;
        dh0 dh0Var = new dh0(a13, a14);
        this.f4446j = dh0Var;
        this.f4447k = pn3.a(new hi0(a10, dh0Var));
    }

    @Override // ai.bi0
    public final xg0 a() {
        return this.f4443g.zzb();
    }

    @Override // ai.bi0
    public final ch0 b() {
        return new ch0(this.f4438b, this.f4445i.zzb());
    }

    @Override // ai.bi0
    public final gi0 c() {
        return this.f4447k.zzb();
    }
}
