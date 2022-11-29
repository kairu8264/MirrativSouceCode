package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.a;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: androidx.room.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0079a implements b {

            /* renamed from: x  reason: collision with root package name */
            public static b f16365x;

            /* renamed from: w  reason: collision with root package name */
            public IBinder f16366w;

            public C0079a(IBinder iBinder) {
                this.f16366w = iBinder;
            }

            @Override // androidx.room.b
            public void X2(int i10, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    if (this.f16366w.transact(3, obtain, null, 1) || a.s0() == null) {
                        return;
                    }
                    a.s0().X2(i10, strArr);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.b
            public int Z3(androidx.room.a aVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f16366w.transact(1, obtain, obtain2, 0) && a.s0() != null) {
                        return a.s0().Z3(aVar, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16366w;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static b i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0079a(iBinder);
        }

        public static b s0() {
            return C0079a.f16365x;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int Z3 = Z3(a.AbstractBinderC0077a.i0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Z3);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                H5(a.AbstractBinderC0077a.i0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                X2(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    void H5(androidx.room.a aVar, int i10) throws RemoteException;

    void X2(int i10, String[] strArr) throws RemoteException;

    int Z3(androidx.room.a aVar, String str) throws RemoteException;
}
