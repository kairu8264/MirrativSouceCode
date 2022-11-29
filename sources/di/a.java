package di;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class a implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f29652w;

    /* renamed from: x  reason: collision with root package name */
    public final String f29653x;

    public a(IBinder iBinder, String str) {
        this.f29652w = iBinder;
        this.f29653x = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29652w;
    }

    public final Parcel i0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29653x);
        return obtain;
    }

    public final void s0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f29652w.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void z0(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f29652w.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
