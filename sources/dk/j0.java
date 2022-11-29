package dk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class j0 extends g0 implements l0 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // dk.l0
    public final void B1(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i0.b(i02, bundle);
        i0.b(i02, bundle2);
        i0.c(i02, n0Var);
        s0(9, i02);
    }

    @Override // dk.l0
    public final void F2(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i0.b(i02, bundle);
        i0.b(i02, bundle2);
        i0.c(i02, n0Var);
        s0(11, i02);
    }

    @Override // dk.l0
    public final void K1(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i0.b(i02, bundle);
        i0.b(i02, bundle2);
        i0.c(i02, n0Var);
        s0(13, i02);
    }

    @Override // dk.l0
    public final void K2(String str, Bundle bundle, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i0.b(i02, bundle);
        i0.c(i02, n0Var);
        s0(5, i02);
    }

    @Override // dk.l0
    public final void R0(String str, List<Bundle> list, Bundle bundle, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeTypedList(list);
        i0.b(i02, bundle);
        i0.c(i02, n0Var);
        s0(12, i02);
    }

    @Override // dk.l0
    public final void Y0(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i0.b(i02, bundle);
        i0.b(i02, bundle2);
        i0.c(i02, n0Var);
        s0(6, i02);
    }

    @Override // dk.l0
    public final void e1(String str, Bundle bundle, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i0.b(i02, bundle);
        i0.c(i02, n0Var);
        s0(10, i02);
    }

    @Override // dk.l0
    public final void g3(String str, List<Bundle> list, Bundle bundle, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeTypedList(list);
        i0.b(i02, bundle);
        i0.c(i02, n0Var);
        s0(2, i02);
    }

    @Override // dk.l0
    public final void o1(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i0.b(i02, bundle);
        i0.b(i02, bundle2);
        i0.c(i02, n0Var);
        s0(7, i02);
    }

    @Override // dk.l0
    public final void v3(String str, List<Bundle> list, Bundle bundle, n0 n0Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeTypedList(list);
        i0.b(i02, bundle);
        i0.c(i02, n0Var);
        s0(14, i02);
    }
}
