package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import yh.a;

/* loaded from: classes3.dex */
public abstract class c10 extends l2 implements d10 {
    public c10() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static d10 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof d10) {
            return (d10) queryLocalInterface;
        }
        return new a10(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                String H = H(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(H);
                return true;
            case 2:
                m00 s10 = s(parcel.readString());
                parcel2.writeNoException();
                m2.f(parcel2, s10);
                return true;
            case 3:
                List<String> f10 = f();
                parcel2.writeNoException();
                parcel2.writeStringList(f10);
                return true;
            case 4:
                String e10 = e();
                parcel2.writeNoException();
                parcel2.writeString(e10);
                return true;
            case 5:
                H0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                g();
                parcel2.writeNoException();
                return true;
            case 7:
                pv i12 = i();
                parcel2.writeNoException();
                m2.f(parcel2, i12);
                return true;
            case 8:
                j();
                parcel2.writeNoException();
                return true;
            case 9:
                yh.a k10 = k();
                parcel2.writeNoException();
                m2.f(parcel2, k10);
                return true;
            case 10:
                boolean h02 = h0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                m2.b(parcel2, h02);
                return true;
            case 11:
                parcel2.writeNoException();
                m2.f(parcel2, null);
                return true;
            case 12:
                boolean o10 = o();
                parcel2.writeNoException();
                m2.b(parcel2, o10);
                return true;
            case 13:
                boolean p10 = p();
                parcel2.writeNoException();
                m2.b(parcel2, p10);
                return true;
            case 14:
                p5(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                w();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
