package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import yh.a;

/* loaded from: classes3.dex */
public abstract class n90 extends l2 implements o90 {
    public n90() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static o90 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        if (queryLocalInterface instanceof o90) {
            return (o90) queryLocalInterface;
        }
        return new m90(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                String c10 = c();
                parcel2.writeNoException();
                parcel2.writeString(c10);
                return true;
            case 3:
                List a10 = a();
                parcel2.writeNoException();
                parcel2.writeList(a10);
                return true;
            case 4:
                String f10 = f();
                parcel2.writeNoException();
                parcel2.writeString(f10);
                return true;
            case 5:
                m00 e10 = e();
                parcel2.writeNoException();
                m2.f(parcel2, e10);
                return true;
            case 6:
                String h10 = h();
                parcel2.writeNoException();
                parcel2.writeString(h10);
                return true;
            case 7:
                String g10 = g();
                parcel2.writeNoException();
                parcel2.writeString(g10);
                return true;
            case 8:
                double i12 = i();
                parcel2.writeNoException();
                parcel2.writeDouble(i12);
                return true;
            case 9:
                String j10 = j();
                parcel2.writeNoException();
                parcel2.writeString(j10);
                return true;
            case 10:
                String k10 = k();
                parcel2.writeNoException();
                parcel2.writeString(k10);
                return true;
            case 11:
                pv n10 = n();
                parcel2.writeNoException();
                m2.f(parcel2, n10);
                return true;
            case 12:
                parcel2.writeNoException();
                m2.f(parcel2, null);
                return true;
            case 13:
                yh.a p10 = p();
                parcel2.writeNoException();
                m2.f(parcel2, p10);
                return true;
            case 14:
                yh.a l10 = l();
                parcel2.writeNoException();
                m2.f(parcel2, l10);
                return true;
            case 15:
                yh.a w10 = w();
                parcel2.writeNoException();
                m2.f(parcel2, w10);
                return true;
            case 16:
                Bundle q10 = q();
                parcel2.writeNoException();
                m2.e(parcel2, q10);
                return true;
            case 17:
                boolean m10 = m();
                parcel2.writeNoException();
                m2.b(parcel2, m10);
                return true;
            case 18:
                boolean r10 = r();
                parcel2.writeNoException();
                m2.b(parcel2, r10);
                return true;
            case 19:
                C();
                parcel2.writeNoException();
                return true;
            case 20:
                t0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                l4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                l3(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                float u10 = u();
                parcel2.writeNoException();
                parcel2.writeFloat(u10);
                return true;
            case 24:
                float y10 = y();
                parcel2.writeNoException();
                parcel2.writeFloat(y10);
                return true;
            case 25:
                float O = O();
                parcel2.writeNoException();
                parcel2.writeFloat(O);
                return true;
            default:
                return false;
        }
    }
}
