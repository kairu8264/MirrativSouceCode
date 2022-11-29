package ai;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes3.dex */
public final class yv {

    /* renamed from: a  reason: collision with root package name */
    public final w80 f12737a;

    /* renamed from: b  reason: collision with root package name */
    public final es f12738b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f12739c;

    /* renamed from: d  reason: collision with root package name */
    public final rg.u f12740d;

    /* renamed from: e  reason: collision with root package name */
    public final et f12741e;

    /* renamed from: f  reason: collision with root package name */
    public or f12742f;

    /* renamed from: g  reason: collision with root package name */
    public rg.c f12743g;

    /* renamed from: h  reason: collision with root package name */
    public rg.g[] f12744h;

    /* renamed from: i  reason: collision with root package name */
    public sg.c f12745i;

    /* renamed from: j  reason: collision with root package name */
    public au f12746j;

    /* renamed from: k  reason: collision with root package name */
    public rg.v f12747k;

    /* renamed from: l  reason: collision with root package name */
    public String f12748l;
    @NotOnlyInitialized

    /* renamed from: m  reason: collision with root package name */
    public final ViewGroup f12749m;

    /* renamed from: n  reason: collision with root package name */
    public int f12750n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12751o;

    /* renamed from: p  reason: collision with root package name */
    public rg.p f12752p;

    public yv(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, es.f3758a, null, i10);
    }

    public static fs a(Context context, rg.g[] gVarArr, int i10) {
        for (rg.g gVar : gVarArr) {
            if (gVar.equals(rg.g.f51355q)) {
                return fs.k0();
            }
        }
        fs fsVar = new fs(context, gVarArr);
        fsVar.F = b(i10);
        return fsVar;
    }

    public static boolean b(int i10) {
        return i10 == 1;
    }

    public final void d() {
        try {
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.g();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final rg.c e() {
        return this.f12743g;
    }

    public final rg.g f() {
        fs r10;
        try {
            au auVar = this.f12746j;
            if (auVar != null && (r10 = auVar.r()) != null) {
                return rg.w.a(r10.A, r10.f4174x, r10.f4173w);
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
        rg.g[] gVarArr = this.f12744h;
        if (gVarArr != null) {
            return gVarArr[0];
        }
        return null;
    }

    public final rg.g[] g() {
        return this.f12744h;
    }

    public final String h() {
        au auVar;
        if (this.f12748l == null && (auVar = this.f12746j) != null) {
            try {
                this.f12748l = auVar.O();
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
            }
        }
        return this.f12748l;
    }

    public final sg.c i() {
        return this.f12745i;
    }

    public final void j(wv wvVar) {
        au d10;
        try {
            if (this.f12746j == null) {
                if (this.f12744h != null && this.f12748l != null) {
                    Context context = this.f12749m.getContext();
                    fs a10 = a(context, this.f12744h, this.f12750n);
                    if ("search_v2".equals(a10.f4173w)) {
                        d10 = new ws(dt.b(), context, a10, this.f12748l).d(context, false);
                    } else {
                        d10 = new vs(dt.b(), context, a10, this.f12748l, this.f12737a).d(context, false);
                    }
                    this.f12746j = d10;
                    d10.q1(new vr(this.f12741e));
                    or orVar = this.f12742f;
                    if (orVar != null) {
                        this.f12746j.V1(new pr(orVar));
                    }
                    sg.c cVar = this.f12745i;
                    if (cVar != null) {
                        this.f12746j.s2(new jl(cVar));
                    }
                    rg.v vVar = this.f12747k;
                    if (vVar != null) {
                        this.f12746j.T3(new uw(vVar));
                    }
                    this.f12746j.l5(new ow(this.f12752p));
                    this.f12746j.t2(this.f12751o);
                    au auVar = this.f12746j;
                    if (auVar != null) {
                        try {
                            yh.a h10 = auVar.h();
                            if (h10 != null) {
                                this.f12749m.addView((View) yh.b.z0(h10));
                            }
                        } catch (RemoteException e10) {
                            uj0.i("#007 Could not call remote method.", e10);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            au auVar2 = this.f12746j;
            Objects.requireNonNull(auVar2);
            if (auVar2.e4(this.f12738b.a(this.f12749m.getContext(), wvVar))) {
                this.f12737a.S5(wvVar.l());
            }
        } catch (RemoteException e11) {
            uj0.i("#007 Could not call remote method.", e11);
        }
    }

    public final void k() {
        try {
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.k();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final void l() {
        try {
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.n();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final void m(rg.c cVar) {
        this.f12743g = cVar;
        this.f12741e.v(cVar);
    }

    public final void n(or orVar) {
        try {
            this.f12742f = orVar;
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.V1(orVar != null ? new pr(orVar) : null);
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final void o(rg.g... gVarArr) {
        if (this.f12744h == null) {
            p(gVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void p(rg.g... gVarArr) {
        this.f12744h = gVarArr;
        try {
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.z3(a(this.f12749m.getContext(), this.f12744h, this.f12750n));
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
        this.f12749m.requestLayout();
    }

    public final void q(String str) {
        if (this.f12748l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f12748l = str;
    }

    public final void r(sg.c cVar) {
        try {
            this.f12745i = cVar;
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.s2(cVar != null ? new jl(cVar) : null);
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final void s(boolean z10) {
        this.f12751o = z10;
        try {
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.t2(z10);
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final rg.t t() {
        lv lvVar = null;
        try {
            au auVar = this.f12746j;
            if (auVar != null) {
                lvVar = auVar.y();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
        return rg.t.d(lvVar);
    }

    public final void u(rg.p pVar) {
        try {
            this.f12752p = pVar;
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.l5(new ow(pVar));
            }
        } catch (RemoteException e10) {
            uj0.i("#008 Must be called on the main UI thread.", e10);
        }
    }

    public final rg.p v() {
        return this.f12752p;
    }

    public final rg.u w() {
        return this.f12740d;
    }

    public final pv x() {
        au auVar = this.f12746j;
        if (auVar != null) {
            try {
                return auVar.B0();
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final void y(rg.v vVar) {
        this.f12747k = vVar;
        try {
            au auVar = this.f12746j;
            if (auVar != null) {
                auVar.T3(vVar == null ? null : new uw(vVar));
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final rg.v z() {
        return this.f12747k;
    }

    public yv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, es esVar, au auVar, int i10) {
        fs fsVar;
        this.f12737a = new w80();
        this.f12740d = new rg.u();
        this.f12741e = new xv(this);
        this.f12749m = viewGroup;
        this.f12738b = esVar;
        this.f12746j = null;
        this.f12739c = new AtomicBoolean(false);
        this.f12750n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                ns nsVar = new ns(context, attributeSet);
                this.f12744h = nsVar.a(z10);
                this.f12748l = nsVar.b();
                if (viewGroup.isInEditMode()) {
                    nj0 a10 = dt.a();
                    rg.g gVar = this.f12744h[0];
                    int i11 = this.f12750n;
                    if (gVar.equals(rg.g.f51355q)) {
                        fsVar = fs.k0();
                    } else {
                        fs fsVar2 = new fs(context, gVar);
                        fsVar2.F = b(i11);
                        fsVar = fsVar2;
                    }
                    a10.c(viewGroup, fsVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                dt.a().b(viewGroup, new fs(context, rg.g.f51347i), e10.getMessage(), e10.getMessage());
            }
        }
    }
}
