package hi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class o0 implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f35887w;

    /* renamed from: x  reason: collision with root package name */
    public final String f35888x;

    public o0(IBinder iBinder, String str) {
        this.f35887w = iBinder;
        this.f35888x = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f35887w;
    }

    public final Parcel i0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f35888x);
        return obtain;
    }

    public final Parcel s0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f35887w.transact(i10, parcel, obtain, 0);
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

    public final void z0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f35887w.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
