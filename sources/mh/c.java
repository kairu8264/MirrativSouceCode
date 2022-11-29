package mh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface c extends IInterface {

    /* loaded from: classes3.dex */
    public static class a implements c {

        /* renamed from: w  reason: collision with root package name */
        public final IBinder f41135w;

        public a(IBinder iBinder) {
            this.f41135w = iBinder;
        }

        @Override // mh.c
        public void N3(Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f41135w.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f41135w;
        }
    }

    void N3(Message message) throws RemoteException;
}
