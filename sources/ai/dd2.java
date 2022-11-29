package ai;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class dd2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3206a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3207b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3208c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3209d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3210e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3211f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3212g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<String> f3213h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3214i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3215j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3216k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3217l;

    /* renamed from: m  reason: collision with root package name */
    public final String f3218m;

    /* renamed from: n  reason: collision with root package name */
    public final long f3219n;

    public dd2(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList<String> arrayList, String str3, String str4, String str5, boolean z15, String str6, long j10) {
        this.f3206a = z10;
        this.f3207b = z11;
        this.f3208c = str;
        this.f3209d = z12;
        this.f3210e = z13;
        this.f3211f = z14;
        this.f3212g = str2;
        this.f3213h = arrayList;
        this.f3214i = str3;
        this.f3215j = str4;
        this.f3216k = str5;
        this.f3217l = z15;
        this.f3218m = str6;
        this.f3219n = j10;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.f3206a);
        bundle2.putBoolean("coh", this.f3207b);
        bundle2.putString("gl", this.f3208c);
        bundle2.putBoolean("simulator", this.f3209d);
        bundle2.putBoolean("is_latchsky", this.f3210e);
        bundle2.putBoolean("is_sidewinder", this.f3211f);
        bundle2.putString("hl", this.f3212g);
        if (!this.f3213h.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.f3213h);
        }
        bundle2.putString("mv", this.f3214i);
        bundle2.putString("submodel", this.f3218m);
        Bundle a10 = km2.a(bundle2, "device");
        bundle2.putBundle("device", a10);
        a10.putString("build", this.f3216k);
        a10.putLong("remaining_data_partition_space", this.f3219n);
        Bundle a11 = km2.a(a10, "browser");
        a10.putBundle("browser", a11);
        a11.putBoolean("is_browser_custom_tabs_capable", this.f3217l);
        if (TextUtils.isEmpty(this.f3215j)) {
            return;
        }
        Bundle a12 = km2.a(a10, "play_store");
        a10.putBundle("play_store", a12);
        a12.putString("package_version", this.f3215j);
    }
}
