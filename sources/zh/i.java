package zh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class i extends fi.a {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final yh.a h1(yh.a aVar, String str, int i10, yh.a aVar2) throws RemoteException {
        Parcel s02 = s0();
        fi.c.d(s02, aVar);
        s02.writeString(str);
        s02.writeInt(i10);
        fi.c.d(s02, aVar2);
        Parcel i02 = i0(3, s02);
        yh.a s03 = a.AbstractBinderC1060a.s0(i02.readStrongBinder());
        i02.recycle();
        return s03;
    }

    public final yh.a z0(yh.a aVar, String str, int i10, yh.a aVar2) throws RemoteException {
        Parcel s02 = s0();
        fi.c.d(s02, aVar);
        s02.writeString(str);
        s02.writeInt(i10);
        fi.c.d(s02, aVar2);
        Parcel i02 = i0(2, s02);
        yh.a s03 = a.AbstractBinderC1060a.s0(i02.readStrongBinder());
        i02.recycle();
        return s03;
    }
}
