package ai;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jg1 extends u01 {
    public final Context A;
    public final lg1 B;
    public final e62 C;
    public final Map<String, Boolean> D;
    public final List<wk> E;
    public final xk F;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f5776i;

    /* renamed from: j  reason: collision with root package name */
    public final og1 f5777j;

    /* renamed from: k  reason: collision with root package name */
    public final wg1 f5778k;

    /* renamed from: l  reason: collision with root package name */
    public final oh1 f5779l;

    /* renamed from: m  reason: collision with root package name */
    public final tg1 f5780m;

    /* renamed from: n  reason: collision with root package name */
    public final zg1 f5781n;

    /* renamed from: o  reason: collision with root package name */
    public final kn3<sk1> f5782o;

    /* renamed from: p  reason: collision with root package name */
    public final kn3<qk1> f5783p;

    /* renamed from: q  reason: collision with root package name */
    public final kn3<xk1> f5784q;

    /* renamed from: r  reason: collision with root package name */
    public final kn3<ok1> f5785r;

    /* renamed from: s  reason: collision with root package name */
    public final kn3<vk1> f5786s;

    /* renamed from: t  reason: collision with root package name */
    public ki1 f5787t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5788u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5789v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5790w;

    /* renamed from: x  reason: collision with root package name */
    public final hh0 f5791x;

    /* renamed from: y  reason: collision with root package name */
    public final u f5792y;

    /* renamed from: z  reason: collision with root package name */
    public final zj0 f5793z;

    public jg1(t01 t01Var, Executor executor, og1 og1Var, wg1 wg1Var, oh1 oh1Var, tg1 tg1Var, zg1 zg1Var, kn3<sk1> kn3Var, kn3<qk1> kn3Var2, kn3<xk1> kn3Var3, kn3<ok1> kn3Var4, kn3<vk1> kn3Var5, hh0 hh0Var, u uVar, zj0 zj0Var, Context context, lg1 lg1Var, e62 e62Var, xk xkVar) {
        super(t01Var);
        this.f5776i = executor;
        this.f5777j = og1Var;
        this.f5778k = wg1Var;
        this.f5779l = oh1Var;
        this.f5780m = tg1Var;
        this.f5781n = zg1Var;
        this.f5782o = kn3Var;
        this.f5783p = kn3Var2;
        this.f5784q = kn3Var3;
        this.f5785r = kn3Var4;
        this.f5786s = kn3Var5;
        this.f5791x = hh0Var;
        this.f5792y = uVar;
        this.f5793z = zj0Var;
        this.A = context;
        this.B = lg1Var;
        this.C = e62Var;
        this.D = new HashMap();
        this.E = new ArrayList();
        this.F = xkVar;
    }

    public static boolean i(View view) {
        if (!((Boolean) ft.c().c(ox.S6)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        wg.t.d();
        long a10 = yg.d2.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (a10 >= ((Integer) ft.c().c(ox.T6)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void A(String str) {
        this.f5778k.R(str);
    }

    public final synchronized void B() {
        if (this.f5789v) {
            return;
        }
        this.f5778k.l();
    }

    public final synchronized void C(Bundle bundle) {
        this.f5778k.a0(bundle);
    }

    public final synchronized boolean D(Bundle bundle) {
        if (this.f5789v) {
            return true;
        }
        boolean h10 = this.f5778k.h(bundle);
        this.f5789v = h10;
        return h10;
    }

    public final synchronized void E(Bundle bundle) {
        this.f5778k.T(bundle);
    }

    public final synchronized void F(final ki1 ki1Var) {
        if (((Boolean) ft.c().c(ox.f7974e1)).booleanValue()) {
            yg.d2.f61866i.post(new Runnable(this, ki1Var) { // from class: ai.fg1

                /* renamed from: w  reason: collision with root package name */
                public final jg1 f4017w;

                /* renamed from: x  reason: collision with root package name */
                public final ki1 f4018x;

                {
                    this.f4017w = this;
                    this.f4018x = ki1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f4017w.t(this.f4018x);
                }
            });
        } else {
            t(ki1Var);
        }
    }

    public final synchronized void G(final ki1 ki1Var) {
        if (((Boolean) ft.c().c(ox.f7974e1)).booleanValue()) {
            yg.d2.f61866i.post(new Runnable(this, ki1Var) { // from class: ai.gg1

                /* renamed from: w  reason: collision with root package name */
                public final jg1 f4430w;

                /* renamed from: x  reason: collision with root package name */
                public final ki1 f4431x;

                {
                    this.f4430w = this;
                    this.f4431x = ki1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f4430w.s(this.f4431x);
                }
            });
        } else {
            s(ki1Var);
        }
    }

    public final synchronized void H(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        this.f5779l.b(this.f5787t);
        this.f5778k.o(view, view2, map, map2, z10);
        if (this.f5790w && this.f5777j.r() != null) {
            this.f5777j.r().j0("onSdkAdUserInteractionClick", new s.a());
        }
    }

    public final synchronized void I(View view, MotionEvent motionEvent, View view2) {
        this.f5778k.c(view, motionEvent, view2);
    }

    public final synchronized void J(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (this.f5789v) {
            return;
        }
        if (((Boolean) ft.c().c(ox.f7990g1)).booleanValue() && this.f10528b.f4095h0) {
            for (String str : this.D.keySet()) {
                if (!this.D.get(str).booleanValue()) {
                    return;
                }
            }
        }
        if (z10) {
            this.f5779l.c(this.f5787t);
            this.f5778k.p(view, map, map2);
            this.f5789v = true;
            return;
        }
        if (((Boolean) ft.c().c(ox.f8071q2)).booleanValue() && map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null && i(view2)) {
                    this.f5779l.c(this.f5787t);
                    this.f5778k.p(view, map, map2);
                    this.f5789v = true;
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject K(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f5778k.e(view, map, map2);
    }

    public final synchronized JSONObject L(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f5778k.a(view, map, map2);
    }

    public final synchronized void M(View view) {
        this.f5778k.d(view);
    }

    public final synchronized void N(d20 d20Var) {
        this.f5778k.k(d20Var);
    }

    public final synchronized void O() {
        this.f5778k.m();
    }

    public final synchronized void P(yu yuVar) {
        this.f5778k.q(yuVar);
    }

    public final synchronized void Q(vu vuVar) {
        this.f5778k.n(vuVar);
    }

    public final synchronized void R() {
        this.f5778k.g();
    }

    @Override // ai.u01
    public final void a() {
        this.f5776i.execute(new Runnable(this) { // from class: ai.cg1

            /* renamed from: w  reason: collision with root package name */
            public final jg1 f2809w;

            {
                this.f2809w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2809w.v();
            }
        });
        if (this.f5777j.d0() != 7) {
            Executor executor = this.f5776i;
            wg1 wg1Var = this.f5778k;
            wg1Var.getClass();
            executor.execute(dg1.a(wg1Var));
        }
        super.a();
    }

    @Override // ai.u01
    public final synchronized void b() {
        this.f5788u = true;
        this.f5776i.execute(new Runnable(this) { // from class: ai.eg1

            /* renamed from: w  reason: collision with root package name */
            public final jg1 f3659w;

            {
                this.f3659w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3659w.u();
            }
        });
        super.b();
    }

    public final synchronized void g() {
        ki1 ki1Var = this.f5787t;
        if (ki1Var == null) {
            uj0.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z10 = ki1Var instanceof ih1;
        this.f5776i.execute(new Runnable(this, z10) { // from class: ai.hg1

            /* renamed from: w  reason: collision with root package name */
            public final jg1 f4842w;

            /* renamed from: x  reason: collision with root package name */
            public final boolean f4843x;

            {
                this.f4842w = this;
                this.f4843x = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f4842w.r(this.f4843x);
            }
        });
    }

    public final synchronized boolean h() {
        return this.f5778k.i();
    }

    public final boolean j() {
        return this.f5780m.c();
    }

    public final String k() {
        return this.f5780m.f();
    }

    public final void l(String str, boolean z10) {
        String str2;
        lc0 lc0Var;
        mc0 mc0Var;
        if (!this.f5780m.d() || TextUtils.isEmpty(str)) {
            return;
        }
        rp0 t10 = this.f5777j.t();
        rp0 r10 = this.f5777j.r();
        if (t10 == null && r10 == null) {
            return;
        }
        if (t10 != null) {
            str2 = null;
        } else {
            str2 = "javascript";
            t10 = r10;
        }
        String str3 = str2;
        if (!wg.t.s().p(this.A)) {
            uj0.f("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zj0 zj0Var = this.f5793z;
        int i10 = zj0Var.f13014x;
        int i11 = zj0Var.f13015y;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i10);
        sb2.append(TopicConstant.SEPARATOR);
        sb2.append(i11);
        String sb3 = sb2.toString();
        if (r10 != null) {
            lc0Var = lc0.VIDEO;
            mc0Var = mc0.DEFINED_BY_JAVASCRIPT;
        } else {
            lc0Var = lc0.NATIVE_DISPLAY;
            if (this.f5777j.d0() == 3) {
                mc0Var = mc0.UNSPECIFIED;
            } else {
                mc0Var = mc0.ONE_PIXEL;
            }
        }
        yh.a q10 = wg.t.s().q(sb3, t10.I(), "", "javascript", str3, str, mc0Var, lc0Var, this.f10528b.f4097i0);
        if (q10 == null) {
            uj0.f("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.f5777j.X(q10);
        t10.K0(q10);
        if (r10 != null) {
            wg.t.s().s(q10, r10.G());
            this.f5790w = true;
        }
        if (z10) {
            wg.t.s().zzf(q10);
            t10.j0("onSdkLoaded", new s.a());
        }
    }

    public final boolean m() {
        return this.f5780m.d();
    }

    public final void n(View view) {
        yh.a u10 = this.f5777j.u();
        rp0 t10 = this.f5777j.t();
        if (!this.f5780m.d() || u10 == null || t10 == null || view == null) {
            return;
        }
        wg.t.s().s(u10, view);
    }

    public final void o(View view) {
        yh.a u10 = this.f5777j.u();
        if (!this.f5780m.d() || u10 == null || view == null) {
            return;
        }
        wg.t.s().r(u10, view);
    }

    public final lg1 p() {
        return this.B;
    }

    public final synchronized void q(iv ivVar) {
        this.C.a(ivVar);
    }

    public final /* synthetic */ void r(boolean z10) {
        this.f5778k.j(this.f5787t.k5(), this.f5787t.g(), this.f5787t.i(), z10);
    }

    public final /* synthetic */ void u() {
        this.f5778k.y();
        this.f5777j.z();
    }

    public final /* bridge */ /* synthetic */ void v() {
        try {
            int d02 = this.f5777j.d0();
            if (d02 == 1) {
                if (this.f5781n.a() != null) {
                    l("Google", true);
                    this.f5781n.a().a4(this.f5782o.zzb());
                }
            } else if (d02 == 2) {
                if (this.f5781n.b() != null) {
                    l("Google", true);
                    this.f5781n.b().t3(this.f5783p.zzb());
                }
            } else if (d02 == 3) {
                if (this.f5781n.f(this.f5777j.q()) != null) {
                    if (this.f5777j.r() != null) {
                        l("Google", true);
                    }
                    this.f5781n.f(this.f5777j.q()).k1(this.f5786s.zzb());
                }
            } else if (d02 == 6) {
                if (this.f5781n.c() != null) {
                    l("Google", true);
                    this.f5781n.c().l1(this.f5784q.zzb());
                }
            } else if (d02 != 7) {
                uj0.c("Wrong native template id!");
            } else if (this.f5781n.e() != null) {
                this.f5781n.e().t1(this.f5785r.zzb());
            }
        } catch (RemoteException e10) {
            uj0.d("RemoteException when notifyAdLoad is called", e10);
        }
    }

    /* renamed from: w */
    public final synchronized void t(ki1 ki1Var) {
        Iterator<String> keys;
        View view;
        q b10;
        if (this.f5788u) {
            return;
        }
        this.f5787t = ki1Var;
        this.f5779l.a(ki1Var);
        this.f5778k.f(ki1Var.k5(), ki1Var.i(), ki1Var.j(), ki1Var, ki1Var);
        if (((Boolean) ft.c().c(ox.K1)).booleanValue() && (b10 = this.f5792y.b()) != null) {
            b10.b(ki1Var.k5());
        }
        if (((Boolean) ft.c().c(ox.f7990g1)).booleanValue()) {
            fl2 fl2Var = this.f10528b;
            if (fl2Var.f4095h0 && (keys = fl2Var.f4093g0.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference<View> weakReference = this.f5787t.g().get(next);
                    this.D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = weakReference.get()) != null) {
                        wk wkVar = new wk(this.A, view);
                        this.E.add(wkVar);
                        wkVar.a(new ig1(this, next));
                    }
                }
            }
        }
        if (ki1Var.e() != null) {
            ki1Var.e().a(this.f5791x);
        }
    }

    /* renamed from: x */
    public final void s(ki1 ki1Var) {
        this.f5778k.b(ki1Var.k5(), ki1Var.g());
        if (ki1Var.z0() != null) {
            ki1Var.z0().setClickable(false);
            ki1Var.z0().removeAllViews();
        }
        if (ki1Var.e() != null) {
            ki1Var.e().b(this.f5791x);
        }
        this.f5787t = null;
    }
}
