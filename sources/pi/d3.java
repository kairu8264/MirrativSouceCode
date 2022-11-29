package pi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class d3 extends hi.o0 implements g3 {
    public d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // pi.g3
    public final void C5(na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, naVar);
        z0(4, i02);
    }

    @Override // pi.g3
    public final List<ea> H3(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(null);
        i02.writeString(str2);
        i02.writeString(str3);
        hi.q0.c(i02, z10);
        Parcel s02 = s0(15, i02);
        ArrayList createTypedArrayList = s02.createTypedArrayList(ea.CREATOR);
        s02.recycle();
        return createTypedArrayList;
    }

    @Override // pi.g3
    public final void J2(Bundle bundle, na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, bundle);
        hi.q0.d(i02, naVar);
        z0(19, i02);
    }

    @Override // pi.g3
    public final void R4(ea eaVar, na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, eaVar);
        hi.q0.d(i02, naVar);
        z0(2, i02);
    }

    @Override // pi.g3
    public final void T2(c cVar, na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, cVar);
        hi.q0.d(i02, naVar);
        z0(12, i02);
    }

    @Override // pi.g3
    public final List<c> W3(String str, String str2, String str3) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(null);
        i02.writeString(str2);
        i02.writeString(str3);
        Parcel s02 = s0(17, i02);
        ArrayList createTypedArrayList = s02.createTypedArrayList(c.CREATOR);
        s02.recycle();
        return createTypedArrayList;
    }

    @Override // pi.g3
    public final List<ea> Z0(String str, String str2, boolean z10, na naVar) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        hi.q0.c(i02, z10);
        hi.q0.d(i02, naVar);
        Parcel s02 = s0(14, i02);
        ArrayList createTypedArrayList = s02.createTypedArrayList(ea.CREATOR);
        s02.recycle();
        return createTypedArrayList;
    }

    @Override // pi.g3
    public final void Z1(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel i02 = i0();
        i02.writeLong(j10);
        i02.writeString(str);
        i02.writeString(str2);
        i02.writeString(str3);
        z0(10, i02);
    }

    @Override // pi.g3
    public final void i5(na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, naVar);
        z0(18, i02);
    }

    @Override // pi.g3
    public final byte[] j4(u uVar, String str) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, uVar);
        i02.writeString(str);
        Parcel s02 = s0(9, i02);
        byte[] createByteArray = s02.createByteArray();
        s02.recycle();
        return createByteArray;
    }

    @Override // pi.g3
    public final String m2(na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, naVar);
        Parcel s02 = s0(11, i02);
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // pi.g3
    public final void n4(na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, naVar);
        z0(20, i02);
    }

    @Override // pi.g3
    public final void p3(na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, naVar);
        z0(6, i02);
    }

    @Override // pi.g3
    public final void r1(u uVar, na naVar) throws RemoteException {
        Parcel i02 = i0();
        hi.q0.d(i02, uVar);
        hi.q0.d(i02, naVar);
        z0(1, i02);
    }

    @Override // pi.g3
    public final List<c> x3(String str, String str2, na naVar) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        hi.q0.d(i02, naVar);
        Parcel s02 = s0(16, i02);
        ArrayList createTypedArrayList = s02.createTypedArrayList(c.CREATOR);
        s02.recycle();
        return createTypedArrayList;
    }
}
