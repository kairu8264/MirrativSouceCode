package bi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class a implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f18467w;

    /* renamed from: x  reason: collision with root package name */
    public final String f18468x = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public a(IBinder iBinder, String str) {
        this.f18467w = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18467w;
    }

    public final Parcel i0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18468x);
        return obtain;
    }

    public final Parcel s0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f18467w.transact(i10, parcel, obtain, 0);
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
