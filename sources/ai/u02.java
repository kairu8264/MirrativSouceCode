package ai;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes3.dex */
public final class u02 implements ne1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10535a;

    /* renamed from: b  reason: collision with root package name */
    public final zj0 f10536b;

    /* renamed from: c  reason: collision with root package name */
    public final s43<jd1> f10537c;

    /* renamed from: d  reason: collision with root package name */
    public final fl2 f10538d;

    /* renamed from: e  reason: collision with root package name */
    public final rp0 f10539e;

    /* renamed from: f  reason: collision with root package name */
    public final yl2 f10540f;

    /* renamed from: g  reason: collision with root package name */
    public final u30 f10541g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10542h;

    public u02(Context context, zj0 zj0Var, s43<jd1> s43Var, fl2 fl2Var, rp0 rp0Var, yl2 yl2Var, boolean z10, u30 u30Var) {
        this.f10535a = context;
        this.f10536b = zj0Var;
        this.f10537c = s43Var;
        this.f10538d = fl2Var;
        this.f10539e = rp0Var;
        this.f10540f = yl2Var;
        this.f10541g = u30Var;
        this.f10542h = z10;
    }

    @Override // ai.ne1
    public final void a(boolean z10, Context context, i51 i51Var) {
        jd1 jd1Var = (jd1) j43.r(this.f10537c);
        this.f10539e.t0(true);
        boolean c10 = this.f10542h ? this.f10541g.c(false) : false;
        wg.t.d();
        wg.j jVar = new wg.j(c10, yg.d2.l(this.f10535a), this.f10542h ? this.f10541g.d() : false, this.f10542h ? this.f10541g.e() : 0.0f, -1, z10, this.f10538d.K, false);
        if (i51Var != null) {
            i51Var.c();
        }
        wg.t.c();
        de1 j10 = jd1Var.j();
        rp0 rp0Var = this.f10539e;
        fl2 fl2Var = this.f10538d;
        int i10 = fl2Var.M;
        zj0 zj0Var = this.f10536b;
        String str = fl2Var.B;
        ll2 ll2Var = fl2Var.f4108s;
        xg.o.a(context, new AdOverlayInfoParcel((or) null, j10, (xg.x) null, rp0Var, i10, zj0Var, str, jVar, ll2Var.f6614b, ll2Var.f6613a, this.f10540f.f12652f, i51Var), true);
    }
}
