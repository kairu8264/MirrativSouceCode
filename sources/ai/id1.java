package ai;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.zzdkm;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class id1 extends u01 {

    /* renamed from: i  reason: collision with root package name */
    public final Context f5189i;

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference<rp0> f5190j;

    /* renamed from: k  reason: collision with root package name */
    public final wb1 f5191k;

    /* renamed from: l  reason: collision with root package name */
    public final ne1 f5192l;

    /* renamed from: m  reason: collision with root package name */
    public final p11 f5193m;

    /* renamed from: n  reason: collision with root package name */
    public final gu2 f5194n;

    /* renamed from: o  reason: collision with root package name */
    public final i51 f5195o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5196p;

    public id1(t01 t01Var, Context context, rp0 rp0Var, wb1 wb1Var, ne1 ne1Var, p11 p11Var, gu2 gu2Var, i51 i51Var) {
        super(t01Var);
        this.f5196p = false;
        this.f5189i = context;
        this.f5190j = new WeakReference<>(rp0Var);
        this.f5191k = wb1Var;
        this.f5192l = ne1Var;
        this.f5193m = p11Var;
        this.f5194n = gu2Var;
        this.f5195o = i51Var;
    }

    public final void finalize() throws Throwable {
        try {
            rp0 rp0Var = this.f5190j.get();
            if (((Boolean) ft.c().c(ox.Z4)).booleanValue()) {
                if (!this.f5196p && rp0Var != null) {
                    hk0.f4882e.execute(hd1.a(rp0Var));
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
            if (yg.d2.j(this.f5189i)) {
                uj0.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f5195o.d();
                if (((Boolean) ft.c().c(ox.f8085s0)).booleanValue()) {
                    this.f5194n.a(this.f10527a.f9876b.f9497b.f6277b);
                }
                return false;
            }
        }
        if (((Boolean) ft.c().c(ox.X6)).booleanValue() && this.f5196p) {
            uj0.f("The interstitial ad has been showed.");
            this.f5195o.y(tm2.d(10, null, null));
        }
        if (!this.f5196p) {
            this.f5191k.zza();
            Activity activity2 = activity;
            if (activity == null) {
                activity2 = this.f5189i;
            }
            try {
                this.f5192l.a(z10, activity2, this.f5195o);
                this.f5191k.zzb();
                this.f5196p = true;
                return true;
            } catch (zzdkm e10) {
                this.f5195o.j0(e10);
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f5193m.a();
    }
}
