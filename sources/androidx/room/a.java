package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0077a extends Binder implements a {

        /* renamed from: androidx.room.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0078a implements a {

            /* renamed from: x  reason: collision with root package name */
            public static a f16363x;

            /* renamed from: w  reason: collision with root package name */
            public IBinder f16364w;

            public C0078a(IBinder iBinder) {
                this.f16364w = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16364w;
            }

            @Override // androidx.room.a
            public void c1(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (this.f16364w.transact(1, obtain, null, 1) || AbstractBinderC0077a.s0() == null) {
                        return;
                    }
                    AbstractBinderC0077a.s0().c1(strArr);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0077a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static a i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0078a(iBinder);
        }

        public static a s0() {
            return C0078a.f16363x;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                c1(parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    void c1(String[] strArr) throws RemoteException;
}
