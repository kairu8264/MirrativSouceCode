package ol;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface i extends IInterface {

    /* loaded from: classes4.dex */
    public static abstract class a extends Binder implements i {

        /* renamed from: ol.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0685a implements i {

            /* renamed from: w  reason: collision with root package name */
            public IBinder f45460w;

            public C0685a(IBinder iBinder) {
                this.f45460w = iBinder;
            }

            @Override // ol.i
            public void K0(h hVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f45460w.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45460w;
            }
        }

        public static i i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof i)) {
                return (i) queryLocalInterface;
            }
            return new C0685a(iBinder);
        }
    }

    void K0(h hVar, String str) throws RemoteException;
}
