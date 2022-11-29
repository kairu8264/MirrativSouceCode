package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public final class hr2 extends k2 implements jr2 {
    public hr2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // ai.jr2
    public final boolean L(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        Parcel s02 = s0(2, i02);
        boolean a10 = m2.a(s02);
        s02.recycle();
        return a10;
    }

    @Override // ai.jr2
    public final yh.a L0(String str, yh.a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        m2.f(i02, aVar);
        i02.writeString("");
        i02.writeString("javascript");
        i02.writeString(str4);
        i02.writeString("Google");
        i02.writeString(str6);
        i02.writeString(str7);
        i02.writeString(str8);
        Parcel s02 = s0(11, i02);
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    @Override // ai.jr2
    public final void U0(yh.a aVar, yh.a aVar2) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, aVar2);
        z0(5, i02);
    }

    @Override // ai.jr2
    public final void X(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(7, i02);
    }

    @Override // ai.jr2
    public final yh.a c3(String str, yh.a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        m2.f(i02, aVar);
        i02.writeString("");
        i02.writeString("javascript");
        i02.writeString(str4);
        i02.writeString(str5);
        i02.writeString(str6);
        i02.writeString(str7);
        i02.writeString(str8);
        Parcel s02 = s0(10, i02);
        yh.a s03 = a.AbstractBinderC1060a.s0(s02.readStrongBinder());
        s02.recycle();
        return s03;
    }

    @Override // ai.jr2
    public final String e() throws RemoteException {
        Parcel s02 = s0(6, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.jr2
    public final void u2(yh.a aVar, yh.a aVar2) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, aVar2);
        z0(8, i02);
    }

    @Override // ai.jr2
    public final void zzf(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        z0(4, i02);
    }
}
