package ai;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes3.dex */
public final class ht1 implements rn3<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f4983a;

    public ht1(eo3<Context> eo3Var) {
        this.f4983a = eo3Var;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = this.f4983a.zzb().getApplicationInfo();
        zn3.b(applicationInfo);
        return applicationInfo;
    }
}
