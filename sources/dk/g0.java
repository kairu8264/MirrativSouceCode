package dk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class g0 implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f29689w;

    /* renamed from: x  reason: collision with root package name */
    public final String f29690x;

    public g0(IBinder iBinder, String str) {
        this.f29689w = iBinder;
        this.f29690x = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29689w;
    }

    public final Parcel i0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29690x);
        return obtain;
    }

    public final void s0(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f29689w.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
