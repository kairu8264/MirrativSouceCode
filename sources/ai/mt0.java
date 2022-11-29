package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class mt0 implements zq1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7041a;

    /* renamed from: b  reason: collision with root package name */
    public final l40 f7042b;

    /* renamed from: c  reason: collision with root package name */
    public final bu0 f7043c;

    /* renamed from: d  reason: collision with root package name */
    public final mt0 f7044d = this;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<zq1> f7045e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<l40> f7046f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<uq1> f7047g;

    /* renamed from: h  reason: collision with root package name */
    public final eo3<wq1> f7048h;

    public /* synthetic */ mt0(bu0 bu0Var, Context context, l40 l40Var, st0 st0Var) {
        this.f7043c = bu0Var;
        this.f7041a = context;
        this.f7042b = l40Var;
        rn3 a10 = sn3.a(this);
        this.f7045e = a10;
        rn3 a11 = sn3.a(l40Var);
        this.f7046f = a11;
        vq1 vq1Var = new vq1(a11);
        this.f7047g = vq1Var;
        this.f7048h = pn3.a(new xq1(a10, vq1Var));
    }

    @Override // ai.zq1
    public final wq1 b() {
        return this.f7048h.zzb();
    }

    @Override // ai.zq1
    public final qq1 d() {
        return new jt0(this.f7043c, this.f7044d, null);
    }
}
