package pi;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes3.dex */
public final class w3 extends r9 {
    public w3(ba baVar) {
        super(baVar);
    }

    @Override // pi.r9
    public final boolean j() {
        return false;
    }

    public final boolean k() {
        g();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f48285a.F().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
