package i6;

import android.content.Context;
import android.net.ConnectivityManager;
import i6.d;
import o6.i;
import o6.s;

/* loaded from: classes.dex */
public final class e {
    public static final d a(Context context, d.a aVar, s sVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) c3.a.j(context, ConnectivityManager.class);
        if (connectivityManager != null && o6.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                return new f(connectivityManager, aVar);
            } catch (Exception e10) {
                if (sVar != null) {
                    i.a(sVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
                }
                return new c();
            }
        }
        if (sVar != null && sVar.b() <= 5) {
            sVar.a("NetworkObserver", 5, "Unable to register network observer.", null);
        }
        return new c();
    }
}
