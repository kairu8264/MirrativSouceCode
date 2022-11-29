package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class k2 implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f6045w;

    /* renamed from: x  reason: collision with root package name */
    public final String f6046x;

    public k2(IBinder iBinder, String str) {
        this.f6045w = iBinder;
        this.f6046x = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6045w;
    }

    public final void h1(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f6045w.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel i0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6046x);
        return obtain;
    }

    public final Parcel s0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f6045w.transact(i10, parcel, obtain, 0);
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
            this.f6045w.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
