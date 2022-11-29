package qi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class e extends ii.a implements d {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.oss.licenses.IOSSLicenseService");
    }

    @Override // qi.d
    public final String A(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        Parcel s02 = s0(4, i02);
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // qi.d
    public final List<ii.c> p4(List<ii.c> list) throws RemoteException {
        Parcel i02 = i0();
        i02.writeList(list);
        Parcel s02 = s0(5, i02);
        ArrayList a10 = ii.b.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // qi.d
    public final String t(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        Parcel s02 = s0(3, i02);
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // qi.d
    public final String v(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        Parcel s02 = s0(2, i02);
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }
}
