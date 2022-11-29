package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class xa0 extends l2 implements ya0 {
    public xa0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static ya0 R5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof ya0) {
            return (ya0) queryLocalInterface;
        }
        return new wa0(iBinder);
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        bb0 za0Var;
        bb0 bb0Var;
        ma0 ma0Var = null;
        sa0 qa0Var = null;
        ma0 ja0Var = null;
        va0 ta0Var = null;
        sa0 qa0Var2 = null;
        va0 ta0Var2 = null;
        pa0 na0Var = null;
        if (i10 == 1) {
            yh.a s02 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) m2.c(parcel, creator);
            Bundle bundle2 = (Bundle) m2.c(parcel, creator);
            fs fsVar = (fs) m2.c(parcel, fs.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                bb0Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface instanceof bb0) {
                    za0Var = (bb0) queryLocalInterface;
                } else {
                    za0Var = new za0(readStrongBinder);
                }
                bb0Var = za0Var;
            }
            X1(s02, readString, bundle, bundle2, fsVar, bb0Var);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            lb0 a10 = a();
            parcel2.writeNoException();
            m2.e(parcel2, a10);
        } else if (i10 == 3) {
            lb0 f10 = f();
            parcel2.writeNoException();
            m2.e(parcel2, f10);
        } else if (i10 == 5) {
            pv e10 = e();
            parcel2.writeNoException();
            m2.f(parcel2, e10);
        } else if (i10 == 10) {
            a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
            parcel2.writeNoException();
        } else if (i10 != 11) {
            switch (i10) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    as asVar = (as) m2.c(parcel, as.CREATOR);
                    yh.a s03 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface2 instanceof ma0) {
                            ma0Var = (ma0) queryLocalInterface2;
                        } else {
                            ma0Var = new ja0(readStrongBinder2);
                        }
                    }
                    W4(readString2, readString3, asVar, s03, ma0Var, e90.R5(parcel.readStrongBinder()), (fs) m2.c(parcel, fs.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    as asVar2 = (as) m2.c(parcel, as.CREATOR);
                    yh.a s04 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        if (queryLocalInterface3 instanceof pa0) {
                            na0Var = (pa0) queryLocalInterface3;
                        } else {
                            na0Var = new na0(readStrongBinder3);
                        }
                    }
                    U3(readString4, readString5, asVar2, s04, na0Var, e90.R5(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean y02 = y0(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    m2.b(parcel2, y02);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    as asVar3 = (as) m2.c(parcel, as.CREATOR);
                    yh.a s05 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface4 instanceof va0) {
                            ta0Var2 = (va0) queryLocalInterface4;
                        } else {
                            ta0Var2 = new ta0(readStrongBinder4);
                        }
                    }
                    A3(readString6, readString7, asVar3, s05, ta0Var2, e90.R5(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean h42 = h4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    m2.b(parcel2, h42);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    as asVar4 = (as) m2.c(parcel, as.CREATOR);
                    yh.a s06 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface5 instanceof sa0) {
                            qa0Var2 = (sa0) queryLocalInterface5;
                        } else {
                            qa0Var2 = new qa0(readStrongBinder5);
                        }
                    }
                    R2(readString8, readString9, asVar4, s06, qa0Var2, e90.R5(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    r0(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    as asVar5 = (as) m2.c(parcel, as.CREATOR);
                    yh.a s07 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface6 instanceof va0) {
                            ta0Var = (va0) queryLocalInterface6;
                        } else {
                            ta0Var = new ta0(readStrongBinder6);
                        }
                    }
                    h5(readString10, readString11, asVar5, s07, ta0Var, e90.R5(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    as asVar6 = (as) m2.c(parcel, as.CREATOR);
                    yh.a s08 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface7 instanceof ma0) {
                            ja0Var = (ma0) queryLocalInterface7;
                        } else {
                            ja0Var = new ja0(readStrongBinder7);
                        }
                    }
                    d3(readString12, readString13, asVar6, s08, ja0Var, e90.R5(parcel.readStrongBinder()), (fs) m2.c(parcel, fs.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    as asVar7 = (as) m2.c(parcel, as.CREATOR);
                    yh.a s09 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface8 instanceof sa0) {
                            qa0Var = (sa0) queryLocalInterface8;
                        } else {
                            qa0Var = new qa0(readStrongBinder8);
                        }
                    }
                    w5(readString14, readString15, asVar7, s09, qa0Var, e90.R5(parcel.readStrongBinder()), (a00) m2.c(parcel, a00.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
            parcel2.writeNoException();
        }
        return true;
    }
}
