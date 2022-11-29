package ai;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class ib2 implements rn3<hb2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ApplicationInfo> f5158a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<PackageInfo> f5159b;

    public ib2(eo3<ApplicationInfo> eo3Var, eo3<PackageInfo> eo3Var2) {
        this.f5158a = eo3Var;
        this.f5159b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new hb2(((ht1) this.f5158a).zzb(), this.f5159b.zzb());
    }
}
