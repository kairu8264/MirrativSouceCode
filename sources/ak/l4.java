package ak;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class l4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13526a;

    public l4(Context context) {
        this.f13526a = context;
    }

    public static String b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Context a() {
        return this.f13526a;
    }
}
