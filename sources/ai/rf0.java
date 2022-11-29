package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class rf0 extends l2 implements sf0 {
    public rf0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static sf0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof sf0) {
            return (sf0) queryLocalInterface;
        }
        return new qf0(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zf0 zf0Var = null;
        zf0 zf0Var2 = null;
        bg0 bg0Var = null;
        vf0 vf0Var = null;
        switch (i10) {
            case 1:
                as asVar = (as) m2.c(parcel, as.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zf0) {
                        zf0Var = (zf0) queryLocalInterface;
                    } else {
                        zf0Var = new xf0(readStrongBinder);
                    }
                }
                t5(asVar, zf0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof vf0) {
                        vf0Var = (vf0) queryLocalInterface2;
                    } else {
                        vf0Var = new tf0(readStrongBinder2);
                    }
                }
                o4(vf0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean h10 = h();
                parcel2.writeNoException();
                m2.b(parcel2, h10);
                return true;
            case 4:
                String g10 = g();
                parcel2.writeNoException();
                parcel2.writeString(g10);
                return true;
            case 5:
                S(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof bg0) {
                        bg0Var = (bg0) queryLocalInterface3;
                    } else {
                        bg0Var = new bg0(readStrongBinder3);
                    }
                }
                r5(bg0Var);
                parcel2.writeNoException();
                return true;
            case 7:
                U4((hg0) m2.c(parcel, hg0.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                f3(ev.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle f10 = f();
                parcel2.writeNoException();
                m2.e(parcel2, f10);
                return true;
            case 10:
                H1(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), m2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                pf0 j10 = j();
                parcel2.writeNoException();
                m2.f(parcel2, j10);
                return true;
            case 12:
                lv k10 = k();
                parcel2.writeNoException();
                m2.f(parcel2, k10);
                return true;
            case 13:
                u1(hv.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                as asVar2 = (as) m2.c(parcel, as.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zf0) {
                        zf0Var2 = (zf0) queryLocalInterface4;
                    } else {
                        zf0Var2 = new xf0(readStrongBinder4);
                    }
                }
                G5(asVar2, zf0Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                G0(m2.a(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
