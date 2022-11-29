package ai;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public final class nt1 implements rn3<PackageInfo> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f7519a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ApplicationInfo> f7520b;

    public nt1(eo3<Context> eo3Var, eo3<ApplicationInfo> eo3Var2) {
        this.f7519a = eo3Var;
        this.f7520b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return xh.c.a(this.f7519a.zzb()).f(((ht1) this.f7520b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
