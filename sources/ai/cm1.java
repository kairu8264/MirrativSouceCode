package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzdkm;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class cm1 extends u01 {

    /* renamed from: i  reason: collision with root package name */
    public final Context f2868i;

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference<rp0> f2869j;

    /* renamed from: k  reason: collision with root package name */
    public final ne1 f2870k;

    /* renamed from: l  reason: collision with root package name */
    public final wb1 f2871l;

    /* renamed from: m  reason: collision with root package name */
    public final i51 f2872m;

    /* renamed from: n  reason: collision with root package name */
    public final q61 f2873n;

    /* renamed from: o  reason: collision with root package name */
    public final p11 f2874o;

    /* renamed from: p  reason: collision with root package name */
    public final pf0 f2875p;

    /* renamed from: q  reason: collision with root package name */
    public final gu2 f2876q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2877r;

    public cm1(t01 t01Var, Context context, rp0 rp0Var, ne1 ne1Var, wb1 wb1Var, i51 i51Var, q61 q61Var, p11 p11Var, fl2 fl2Var, gu2 gu2Var) {
        super(t01Var);
        this.f2877r = false;
        this.f2868i = context;
        this.f2870k = ne1Var;
        this.f2869j = new WeakReference<>(rp0Var);
        this.f2871l = wb1Var;
        this.f2872m = i51Var;
        this.f2873n = q61Var;
        this.f2874o = p11Var;
        this.f2876q = gu2Var;
        lf0 lf0Var = fl2Var.f4102m;
        this.f2875p = new jg0(lf0Var != null ? lf0Var.f6553w : "", lf0Var != null ? lf0Var.f6554x : 1);
    }

    public final void finalize() throws Throwable {
        try {
            rp0 rp0Var = this.f2869j.get();
            if (((Boolean) ft.c().c(ox.Z4)).booleanValue()) {
                if (!this.f2877r && rp0Var != null) {
                    hk0.f4882e.execute(bm1.a(rp0Var));
                }
            } else if (rp0Var != null) {
                rp0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean g(boolean z10, Activity activity) {
        if (((Boolean) ft.c().c(ox.f8077r0)).booleanValue()) {
            wg.t.d();
            if (yg.d2.j(this.f2868i)) {
                uj0.f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f2872m.d();
                if (((Boolean) ft.c().c(ox.f8085s0)).booleanValue()) {
                    this.f2876q.a(this.f10527a.f9876b.f9497b.f6277b);
                }
                return false;
            }
        }
        if (this.f2877r) {
            uj0.f("The rewarded ad have been showed.");
            this.f2872m.y(tm2.d(10, null, null));
            return false;
        }
        this.f2877r = true;
        this.f2871l.zza();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f2868i;
        }
        try {
            this.f2870k.a(z10, activity2, this.f2872m);
            this.f2871l.zzb();
            return true;
        } catch (zzdkm e10) {
            this.f2872m.j0(e10);
            return false;
        }
    }

    public final boolean h() {
        return this.f2877r;
    }

    public final pf0 i() {
        return this.f2875p;
    }

    public final boolean j() {
        return this.f2874o.a();
    }

    public final boolean k() {
        rp0 rp0Var = this.f2869j.get();
        return (rp0Var == null || rp0Var.N0()) ? false : true;
    }

    public final Bundle l() {
        return this.f2873n.S0();
    }
}
