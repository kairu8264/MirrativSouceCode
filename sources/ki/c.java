package ki;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.c;

/* loaded from: classes3.dex */
public final class c extends rh.g<k> {

    /* renamed from: e0  reason: collision with root package name */
    public final Context f38819e0;

    public c(Context context, Looper looper, rh.d dVar, c.a aVar, c.b bVar) {
        super(context, looper, 45, dVar, aVar, bVar);
        this.f38819e0 = context;
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // rh.c
    public final boolean Q() {
        return true;
    }

    public final String j0(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f38819e0.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f38819e0.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return "";
            }
            String str2 = (String) bundle.get(str);
            return str2 == null ? "" : str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @Override // rh.c
    public final int l() {
        return 12200000;
    }

    @Override // rh.c
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new k(iBinder);
    }
}
