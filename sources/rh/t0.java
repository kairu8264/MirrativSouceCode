package rh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class t0 implements l {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f51518w;

    public t0(IBinder iBinder) {
        this.f51518w = iBinder;
    }

    @Override // rh.l
    public final void W1(k kVar, f fVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                j1.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f51518w.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f51518w;
    }
}
