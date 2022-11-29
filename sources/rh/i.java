package rh;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface i extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class a extends fi.b implements i {
        public static i s0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof i ? (i) queryLocalInterface : new s1(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
