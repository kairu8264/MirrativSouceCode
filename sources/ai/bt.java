package ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;

/* loaded from: classes3.dex */
public final class bt {

    /* renamed from: a  reason: collision with root package name */
    public final zr f2474a;

    /* renamed from: b  reason: collision with root package name */
    public final xr f2475b;

    /* renamed from: c  reason: collision with root package name */
    public final ew f2476c;

    /* renamed from: d  reason: collision with root package name */
    public final i20 f2477d;

    /* renamed from: e  reason: collision with root package name */
    public final fg0 f2478e;

    /* renamed from: f  reason: collision with root package name */
    public final nc0 f2479f;

    /* renamed from: g  reason: collision with root package name */
    public final j20 f2480g;

    /* renamed from: h  reason: collision with root package name */
    public rd0 f2481h;

    public bt(zr zrVar, xr xrVar, ew ewVar, i20 i20Var, fg0 fg0Var, nc0 nc0Var, j20 j20Var) {
        this.f2474a = zrVar;
        this.f2475b = xrVar;
        this.f2476c = ewVar;
        this.f2477d = i20Var;
        this.f2478e = fg0Var;
        this.f2479f = nc0Var;
        this.f2480g = j20Var;
    }

    public static /* synthetic */ void f(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ActionLogBase.ACTION, "no_ads_fallback");
        bundle.putString("flow", str);
        dt.a().e(context, dt.d().f13013w, "gmob-apps", bundle, true);
    }

    public final au g(Context context, fs fsVar, String str, z80 z80Var) {
        return new xs(this, context, fsVar, str, z80Var).d(context, false);
    }

    public final wt h(Context context, String str, z80 z80Var) {
        return new zs(this, context, str, z80Var).d(context, false);
    }

    public final sf0 i(Context context, String str, z80 z80Var) {
        return new at(this, context, str, z80Var).d(context, false);
    }

    public final qc0 j(Activity activity) {
        ps psVar = new ps(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            uj0.c("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return psVar.d(activity, z10);
    }

    public final ni0 k(Context context, z80 z80Var) {
        return new rs(this, context, z80Var).d(context, false);
    }

    public final ec0 l(Context context, z80 z80Var) {
        return new ts(this, context, z80Var).d(context, false);
    }
}
