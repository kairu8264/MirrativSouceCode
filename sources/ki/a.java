package ki;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class a implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f38817w;

    /* renamed from: x  reason: collision with root package name */
    public final String f38818x = "com.google.android.gms.safetynet.internal.ISafetyNetService";

    public a(IBinder iBinder, String str) {
        this.f38817w = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38817w;
    }

    public final Parcel i0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f38818x);
        return obtain;
    }

    public final void s0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f38817w.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
