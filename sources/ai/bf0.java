package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class bf0 extends l2 implements cf0 {
    public bf0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            M3((gf0) m2.c(parcel, gf0.CREATOR));
            parcel2.writeNoException();
        } else if (i10 != 2) {
            ff0 ff0Var = null;
            af0 af0Var = null;
            if (i10 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface instanceof ff0) {
                        ff0Var = (ff0) queryLocalInterface;
                    } else {
                        ff0Var = new df0(readStrongBinder);
                    }
                }
                q4(ff0Var);
                parcel2.writeNoException();
            } else if (i10 != 34) {
                switch (i10) {
                    case 5:
                        boolean c10 = c();
                        parcel2.writeNoException();
                        m2.b(parcel2, c10);
                        break;
                    case 6:
                        a();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        f();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        e();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        X(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        e0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        y0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String j10 = j();
                        parcel2.writeNoException();
                        parcel2.writeString(j10);
                        break;
                    case 13:
                        V(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 14:
                        X0(du.R5(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle o10 = o();
                        parcel2.writeNoException();
                        m2.e(parcel2, o10);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            if (queryLocalInterface2 instanceof af0) {
                                af0Var = (af0) queryLocalInterface2;
                            } else {
                                af0Var = new af0(readStrongBinder2);
                            }
                        }
                        r2(af0Var);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        parcel2.writeNoException();
                        break;
                    case 18:
                        x5(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        Y2(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean q10 = q();
                        parcel2.writeNoException();
                        m2.b(parcel2, q10);
                        break;
                    case 21:
                        lv m10 = m();
                        parcel2.writeNoException();
                        m2.f(parcel2, m10);
                        break;
                    default:
                        return false;
                }
            } else {
                g5(m2.a(parcel));
                parcel2.writeNoException();
            }
        } else {
            b();
            parcel2.writeNoException();
        }
        return true;
    }
}
