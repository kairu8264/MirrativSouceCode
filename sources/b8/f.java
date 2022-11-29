package b8;

import android.content.Context;
import android.util.Log;
import b8.c;

/* loaded from: classes.dex */
public class f implements d {
    @Override // b8.d
    public c a(Context context, c.a aVar) {
        boolean z10 = c3.a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z10) {
            return new e(context, aVar);
        }
        return new n();
    }
}
