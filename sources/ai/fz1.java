package ai;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes3.dex */
public final class fz1 implements ne1 {

    /* renamed from: a  reason: collision with root package name */
    public final zj0 f4256a;

    /* renamed from: b  reason: collision with root package name */
    public final s43<dy0> f4257b;

    /* renamed from: c  reason: collision with root package name */
    public final fl2 f4258c;

    /* renamed from: d  reason: collision with root package name */
    public final rp0 f4259d;

    /* renamed from: e  reason: collision with root package name */
    public final yl2 f4260e;

    /* renamed from: f  reason: collision with root package name */
    public final u30 f4261f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4262g;

    public fz1(zj0 zj0Var, s43<dy0> s43Var, fl2 fl2Var, rp0 rp0Var, yl2 yl2Var, boolean z10, u30 u30Var) {
        this.f4256a = zj0Var;
        this.f4257b = s43Var;
        this.f4258c = fl2Var;
        this.f4259d = rp0Var;
        this.f4260e = yl2Var;
        this.f4262g = z10;
        this.f4261f = u30Var;
    }

    @Override // ai.ne1
    public final void a(boolean z10, Context context, i51 i51Var) {
        dy0 dy0Var = (dy0) j43.r(this.f4257b);
        this.f4259d.t0(true);
        wg.j jVar = new wg.j(this.f4262g ? this.f4261f.c(true) : true, true, this.f4262g ? this.f4261f.d() : false, this.f4262g ? this.f4261f.e() : 0.0f, -1, z10, this.f4258c.K, false);
        if (i51Var != null) {
            i51Var.c();
        }
        wg.t.c();
        de1 j10 = dy0Var.j();
        rp0 rp0Var = this.f4259d;
        int i10 = this.f4258c.M;
        if (i10 == -1) {
            ls lsVar = this.f4260e.f12656j;
            if (lsVar != null) {
                int i11 = lsVar.f6652w;
                if (i11 == 1) {
                    i10 = 7;
                } else if (i11 == 2) {
                    i10 = 6;
                }
            }
            uj0.a("Error setting app open orientation; no targeting orientation available.");
            i10 = this.f4258c.M;
        }
        int i12 = i10;
        zj0 zj0Var = this.f4256a;
        fl2 fl2Var = this.f4258c;
        String str = fl2Var.B;
        ll2 ll2Var = fl2Var.f4108s;
        xg.o.a(context, new AdOverlayInfoParcel((or) null, j10, (xg.x) null, rp0Var, i12, zj0Var, str, jVar, ll2Var.f6614b, ll2Var.f6613a, this.f4260e.f12652f, i51Var), true);
    }
}
