package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class zt extends l2 implements au {
    public zt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        nt ntVar = null;
        pu puVar = null;
        qt qtVar = null;
        iv ivVar = null;
        eu euVar = null;
        lu luVar = null;
        jt jtVar = null;
        hu huVar = null;
        switch (i10) {
            case 1:
                yh.a h10 = h();
                parcel2.writeNoException();
                m2.f(parcel2, h10);
                return true;
            case 2:
                g();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean i12 = i();
                parcel2.writeNoException();
                m2.b(parcel2, i12);
                return true;
            case 4:
                boolean e42 = e4((as) m2.c(parcel, as.CREATOR));
                parcel2.writeNoException();
                m2.b(parcel2, e42);
                return true;
            case 5:
                k();
                parcel2.writeNoException();
                return true;
            case 6:
                n();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof nt) {
                        ntVar = (nt) queryLocalInterface;
                    } else {
                        ntVar = new kt(readStrongBinder);
                    }
                }
                q1(ntVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof hu) {
                        huVar = (hu) queryLocalInterface2;
                    } else {
                        huVar = new fu(readStrongBinder2);
                    }
                }
                s2(huVar);
                parcel2.writeNoException();
                return true;
            case 9:
                q();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                m();
                parcel2.writeNoException();
                return true;
            case 12:
                fs r10 = r();
                parcel2.writeNoException();
                m2.e(parcel2, r10);
                return true;
            case 13:
                z3((fs) m2.c(parcel, fs.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                H2(yc0.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                z5(dd0.R5(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String z10 = z();
                parcel2.writeNoException();
                parcel2.writeString(z10);
                return true;
            case 19:
                d1(jy.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof jt) {
                        jtVar = (jt) queryLocalInterface3;
                    } else {
                        jtVar = new ht(readStrongBinder3);
                    }
                }
                V1(jtVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof lu) {
                        luVar = (lu) queryLocalInterface4;
                    } else {
                        luVar = new lu(readStrongBinder4);
                    }
                }
                X4(luVar);
                parcel2.writeNoException();
                return true;
            case 22:
                t2(m2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean G = G();
                parcel2.writeNoException();
                m2.b(parcel2, G);
                return true;
            case 24:
                i1(ef0.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                V0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                pv B0 = B0();
                parcel2.writeNoException();
                m2.f(parcel2, B0);
                return true;
            case 29:
                T3((uw) m2.c(parcel, uw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                s1((tv) m2.c(parcel, tv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String O = O();
                parcel2.writeNoException();
                parcel2.writeString(O);
                return true;
            case 32:
                hu x10 = x();
                parcel2.writeNoException();
                m2.f(parcel2, x10);
                return true;
            case 33:
                nt K = K();
                parcel2.writeNoException();
                m2.f(parcel2, K);
                return true;
            case 34:
                n0(m2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String u10 = u();
                parcel2.writeNoException();
                parcel2.writeString(u10);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof eu) {
                        euVar = (eu) queryLocalInterface5;
                    } else {
                        euVar = new cu(readStrongBinder5);
                    }
                }
                E1(euVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle w10 = w();
                parcel2.writeNoException();
                m2.e(parcel2, w10);
                return true;
            case 38:
                P1(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                O3((ls) m2.c(parcel, ls.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                m1(nm.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                lv y10 = y();
                parcel2.writeNoException();
                m2.f(parcel2, y10);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof iv) {
                        ivVar = (iv) queryLocalInterface6;
                    } else {
                        ivVar = new gv(readStrongBinder6);
                    }
                }
                l5(ivVar);
                parcel2.writeNoException();
                return true;
            case 43:
                as asVar = (as) m2.c(parcel, as.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof qt) {
                        qtVar = (qt) queryLocalInterface7;
                    } else {
                        qtVar = new ot(readStrongBinder7);
                    }
                }
                V3(asVar, qtVar);
                parcel2.writeNoException();
                return true;
            case 44:
                E3(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof pu) {
                        puVar = (pu) queryLocalInterface8;
                    } else {
                        puVar = new mu(readStrongBinder8);
                    }
                }
                N1(puVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
