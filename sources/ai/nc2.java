package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class nc2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7255a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7256b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7257c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7258d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7259e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7260f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7261g;

    public nc2(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12) {
        this.f7255a = z10;
        this.f7256b = z11;
        this.f7257c = str;
        this.f7258d = z12;
        this.f7259e = i10;
        this.f7260f = i11;
        this.f7261g = i12;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f7257c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) ft.c().c(ox.f7991g2));
        bundle2.putInt("target_api", this.f7259e);
        bundle2.putInt("dv", this.f7260f);
        bundle2.putInt("lv", this.f7261g);
        Bundle a10 = km2.a(bundle2, "sdk_env");
        a10.putBoolean("mf", cz.f3076a.e().booleanValue());
        a10.putBoolean("instant_app", this.f7255a);
        a10.putBoolean("lite", this.f7256b);
        a10.putBoolean("is_privileged_process", this.f7258d);
        bundle2.putBundle("sdk_env", a10);
        Bundle a11 = km2.a(a10, "build_meta");
        a11.putString("cl", "407425155");
        a11.putString("rapid_rc", "dev");
        a11.putString("rapid_rollup", "HEAD");
        a10.putBundle("build_meta", a11);
    }
}
