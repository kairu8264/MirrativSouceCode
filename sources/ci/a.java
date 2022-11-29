package ci;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class a implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f19644w;

    /* renamed from: x  reason: collision with root package name */
    public final String f19645x = "com.google.android.gms.appset.internal.IAppSetService";

    public a(IBinder iBinder, String str) {
        this.f19644w = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19644w;
    }

    public final Parcel i0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19645x);
        return obtain;
    }

    public final void s0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f19644w.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
