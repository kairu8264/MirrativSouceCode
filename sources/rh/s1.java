package rh;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class s1 extends fi.a implements i {
    public s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // rh.i
    public final Account zzb() throws RemoteException {
        Parcel i02 = i0(2, s0());
        Account account = (Account) fi.c.a(i02, Account.CREATOR);
        i02.recycle();
        return account;
    }
}
