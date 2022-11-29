package fi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class a implements IInterface {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f31981w;

    /* renamed from: x  reason: collision with root package name */
    public final String f31982x;

    public a(IBinder iBinder, String str) {
        this.f31981w = iBinder;
        this.f31982x = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31981w;
    }

    public final Parcel i0(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f31981w.transact(i10, parcel, obtain, 0);
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

    public final Parcel s0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31982x);
        return obtain;
    }
}
