package ji;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class e implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f38056w;

    /* renamed from: x  reason: collision with root package name */
    public final String f38057x = "com.android.vending.billing.IInAppBillingService";

    public e(IBinder iBinder, String str) {
        this.f38056w = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38056w;
    }

    public final Parcel i0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f38057x);
        return obtain;
    }

    public final Parcel s0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f38056w.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
