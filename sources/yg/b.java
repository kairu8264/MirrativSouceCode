package yg;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;

@TargetApi(26)
/* loaded from: classes3.dex */
public class b extends k2 {
    @Override // yg.e
    public final int p(Context context, TelephonyManager telephonyManager) {
        wg.t.d();
        return (d2.e(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
