package zh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class h extends fi.a {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final yh.a B4(yh.a aVar, String str, int i10) throws RemoteException {
        Parcel s02 = s0();
        fi.c.d(s02, aVar);
        s02.writeString(str);
        s02.writeInt(i10);
        Parcel i02 = i0(4, s02);
        yh.a s03 = a.AbstractBinderC1060a.s0(i02.readStrongBinder());
        i02.recycle();
        return s03;
    }

    public final yh.a M1(yh.a aVar, String str, int i10) throws RemoteException {
        Parcel s02 = s0();
        fi.c.d(s02, aVar);
        s02.writeString(str);
        s02.writeInt(i10);
        Parcel i02 = i0(2, s02);
        yh.a s03 = a.AbstractBinderC1060a.s0(i02.readStrongBinder());
        i02.recycle();
        return s03;
    }

    public final int c() throws RemoteException {
        Parcel i02 = i0(6, s0());
        int readInt = i02.readInt();
        i02.recycle();
        return readInt;
    }

    public final yh.a f4(yh.a aVar, String str, int i10, yh.a aVar2) throws RemoteException {
        Parcel s02 = s0();
        fi.c.d(s02, aVar);
        s02.writeString(str);
        s02.writeInt(i10);
        fi.c.d(s02, aVar2);
        Parcel i02 = i0(8, s02);
        yh.a s03 = a.AbstractBinderC1060a.s0(i02.readStrongBinder());
        i02.recycle();
        return s03;
    }

    public final int h1(yh.a aVar, String str, boolean z10) throws RemoteException {
        Parcel s02 = s0();
        fi.c.d(s02, aVar);
        s02.writeString(str);
        fi.c.b(s02, z10);
        Parcel i02 = i0(5, s02);
        int readInt = i02.readInt();
        i02.recycle();
        return readInt;
    }

    public final yh.a k5(yh.a aVar, String str, boolean z10, long j10) throws RemoteException {
        Parcel s02 = s0();
        fi.c.d(s02, aVar);
        s02.writeString(str);
        fi.c.b(s02, z10);
        s02.writeLong(j10);
        Parcel i02 = i0(7, s02);
        yh.a s03 = a.AbstractBinderC1060a.s0(i02.readStrongBinder());
        i02.recycle();
        return s03;
    }

    public final int z0(yh.a aVar, String str, boolean z10) throws RemoteException {
        Parcel s02 = s0();
        fi.c.d(s02, aVar);
        s02.writeString(str);
        fi.c.b(s02, z10);
        Parcel i02 = i0(3, s02);
        int readInt = i02.readInt();
        i02.recycle();
        return readInt;
    }
}
