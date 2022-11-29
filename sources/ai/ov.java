package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class ov extends l2 implements pv {
    public ov() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static pv R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof pv) {
            return (pv) queryLocalInterface;
        }
        return new nv(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        sv qvVar;
        switch (i10) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                a();
                parcel2.writeNoException();
                return true;
            case 3:
                b0(m2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean e10 = e();
                parcel2.writeNoException();
                m2.b(parcel2, e10);
                return true;
            case 5:
                int h10 = h();
                parcel2.writeNoException();
                parcel2.writeInt(h10);
                return true;
            case 6:
                float g10 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g10);
                return true;
            case 7:
                float i12 = i();
                parcel2.writeNoException();
                parcel2.writeFloat(i12);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    qvVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof sv) {
                        qvVar = (sv) queryLocalInterface;
                    } else {
                        qvVar = new qv(readStrongBinder);
                    }
                }
                n5(qvVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float k10 = k();
                parcel2.writeNoException();
                parcel2.writeFloat(k10);
                return true;
            case 10:
                boolean n10 = n();
                parcel2.writeNoException();
                m2.b(parcel2, n10);
                return true;
            case 11:
                sv o10 = o();
                parcel2.writeNoException();
                m2.f(parcel2, o10);
                return true;
            case 12:
                boolean p10 = p();
                parcel2.writeNoException();
                m2.b(parcel2, p10);
                return true;
            case 13:
                l();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
