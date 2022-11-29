package ai;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class pc0 extends l2 implements qc0 {
    public pc0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static qc0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (queryLocalInterface instanceof qc0) {
            return (qc0) queryLocalInterface;
        }
        return new oc0(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                a0((Bundle) m2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                g();
                parcel2.writeNoException();
                return true;
            case 4:
                i();
                parcel2.writeNoException();
                return true;
            case 5:
                j();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) m2.c(parcel, Bundle.CREATOR);
                l0(bundle);
                parcel2.writeNoException();
                m2.e(parcel2, bundle);
                return true;
            case 7:
                p();
                parcel2.writeNoException();
                return true;
            case 8:
                l();
                parcel2.writeNoException();
                return true;
            case 9:
                q();
                parcel2.writeNoException();
                return true;
            case 10:
                c();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean f10 = f();
                parcel2.writeNoException();
                m2.b(parcel2, f10);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) m2.c(parcel, Intent.CREATOR);
                parcel2.writeNoException();
                return true;
            case 13:
                h0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                a();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
