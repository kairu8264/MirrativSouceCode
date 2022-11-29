package ai;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class hb2 implements xc2, wc2 {

    /* renamed from: a  reason: collision with root package name */
    public final ApplicationInfo f4797a;

    /* renamed from: b  reason: collision with root package name */
    public final PackageInfo f4798b;

    public hb2(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f4797a = applicationInfo;
        this.f4798b = packageInfo;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f4797a.packageName;
        PackageInfo packageInfo = this.f4798b;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f4798b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    @Override // ai.xc2
    public final s43<wc2<Bundle>> zza() {
        return j43.a(this);
    }
}
