package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class b90 extends l2 implements c90 {
    public b90() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        f90 f90Var = null;
        switch (i10) {
            case 1:
                yh.a s02 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                fs fsVar = (fs) m2.c(parcel, fs.CREATOR);
                as asVar = (as) m2.c(parcel, as.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof f90) {
                        f90Var = (f90) queryLocalInterface;
                    } else {
                        f90Var = new d90(readStrongBinder);
                    }
                }
                e5(s02, fsVar, asVar, readString, f90Var);
                parcel2.writeNoException();
                return true;
            case 2:
                yh.a a10 = a();
                parcel2.writeNoException();
                m2.f(parcel2, a10);
                return true;
            case 3:
                yh.a s03 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                as asVar2 = (as) m2.c(parcel, as.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof f90) {
                        f90Var = (f90) queryLocalInterface2;
                    } else {
                        f90Var = new d90(readStrongBinder2);
                    }
                }
                r4(s03, asVar2, readString2, f90Var);
                parcel2.writeNoException();
                return true;
            case 4:
                e();
                parcel2.writeNoException();
                return true;
            case 5:
                h();
                parcel2.writeNoException();
                return true;
            case 6:
                yh.a s04 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                fs fsVar2 = (fs) m2.c(parcel, fs.CREATOR);
                as asVar3 = (as) m2.c(parcel, as.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof f90) {
                        f90Var = (f90) queryLocalInterface3;
                    } else {
                        f90Var = new d90(readStrongBinder3);
                    }
                }
                s3(s04, fsVar2, asVar3, readString3, readString4, f90Var);
                parcel2.writeNoException();
                return true;
            case 7:
                yh.a s05 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                as asVar4 = (as) m2.c(parcel, as.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof f90) {
                        f90Var = (f90) queryLocalInterface4;
                    } else {
                        f90Var = new d90(readStrongBinder4);
                    }
                }
                A2(s05, asVar4, readString5, readString6, f90Var);
                parcel2.writeNoException();
                return true;
            case 8:
                j();
                parcel2.writeNoException();
                return true;
            case 9:
                k();
                parcel2.writeNoException();
                return true;
            case 10:
                i4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), (as) m2.c(parcel, as.CREATOR), parcel.readString(), jf0.R5(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                m3((as) m2.c(parcel, as.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                p();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean l10 = l();
                parcel2.writeNoException();
                m2.b(parcel2, l10);
                return true;
            case 14:
                yh.a s06 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                as asVar5 = (as) m2.c(parcel, as.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof f90) {
                        f90Var = (f90) queryLocalInterface5;
                    } else {
                        f90Var = new d90(readStrongBinder5);
                    }
                }
                Q1(s06, asVar5, readString7, readString8, f90Var, (a00) m2.c(parcel, a00.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                m2.f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                m2.f(parcel2, null);
                return true;
            case 17:
                Bundle q10 = q();
                parcel2.writeNoException();
                m2.e(parcel2, q10);
                return true;
            case 18:
                Bundle m10 = m();
                parcel2.writeNoException();
                m2.e(parcel2, m10);
                return true;
            case 19:
                Bundle r10 = r();
                parcel2.writeNoException();
                m2.e(parcel2, r10);
                return true;
            case 20:
                k4((as) m2.c(parcel, as.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                t0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                m2.b(parcel2, false);
                return true;
            case 23:
                V2(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), jf0.R5(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                d10 u10 = u();
                parcel2.writeNoException();
                m2.f(parcel2, u10);
                return true;
            case 25:
                J1(m2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                pv O = O();
                parcel2.writeNoException();
                m2.f(parcel2, O);
                return true;
            case 27:
                o90 x10 = x();
                parcel2.writeNoException();
                m2.f(parcel2, x10);
                return true;
            case 28:
                yh.a s07 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                as asVar6 = (as) m2.c(parcel, as.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof f90) {
                        f90Var = (f90) queryLocalInterface6;
                    } else {
                        f90Var = new d90(readStrongBinder6);
                    }
                }
                u3(s07, asVar6, readString9, f90Var);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                i2(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                w4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), g50.R5(parcel.readStrongBinder()), parcel.createTypedArrayList(l50.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                yh.a s08 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                as asVar7 = (as) m2.c(parcel, as.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof f90) {
                        f90Var = (f90) queryLocalInterface7;
                    } else {
                        f90Var = new d90(readStrongBinder7);
                    }
                }
                Z4(s08, asVar7, readString10, f90Var);
                parcel2.writeNoException();
                return true;
            case 33:
                lb0 G = G();
                parcel2.writeNoException();
                m2.e(parcel2, G);
                return true;
            case 34:
                lb0 Q = Q();
                parcel2.writeNoException();
                m2.e(parcel2, Q);
                return true;
            case 35:
                yh.a s09 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                fs fsVar3 = (fs) m2.c(parcel, fs.CREATOR);
                as asVar8 = (as) m2.c(parcel, as.CREATOR);
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof f90) {
                        f90Var = (f90) queryLocalInterface8;
                    } else {
                        f90Var = new d90(readStrongBinder8);
                    }
                }
                C2(s09, fsVar3, asVar8, readString11, readString12, f90Var);
                parcel2.writeNoException();
                return true;
            case 36:
                i90 W = W();
                parcel2.writeNoException();
                m2.f(parcel2, W);
                return true;
            case 37:
                d5(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
