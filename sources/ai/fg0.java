package ai;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class fg0 {
    public static final sf0 a(Context context, String str, z80 z80Var) {
        sf0 qf0Var;
        try {
            IBinder M1 = ((wf0) xj0.a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", eg0.f3658a)).M1(yh.b.h1(context), str, z80Var, 213806000);
            if (M1 == null) {
                return null;
            }
            IInterface queryLocalInterface = M1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof sf0) {
                qf0Var = (sf0) queryLocalInterface;
            } else {
                qf0Var = new qf0(M1);
            }
            return qf0Var;
        } catch (RemoteException | zzcgw e10) {
            uj0.i("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
