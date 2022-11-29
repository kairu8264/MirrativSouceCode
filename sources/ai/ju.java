package ai;

import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class ju extends l2 implements ku {
    public ju() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                au h32 = h3(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), (fs) m2.c(parcel, fs.CREATOR), parcel.readString(), y80.R5(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, h32);
                return true;
            case 2:
                au d22 = d2(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), (fs) m2.c(parcel, fs.CREATOR), parcel.readString(), y80.R5(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, d22);
                return true;
            case 3:
                wt v52 = v5(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readString(), y80.R5(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, v52);
                return true;
            case 4:
                a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                parcel2.writeNoException();
                m2.f(parcel2, null);
                return true;
            case 5:
                p00 b12 = b1(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                m2.f(parcel2, b12);
                return true;
            case 6:
                cf0 o32 = o3(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), y80.R5(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, o32);
                return true;
            case 7:
                a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                parcel2.writeNoException();
                m2.f(parcel2, null);
                return true;
            case 8:
                qc0 P = P(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                m2.f(parcel2, P);
                return true;
            case 9:
                ru q32 = q3(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, q32);
                return true;
            case 10:
                au e22 = e2(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), (fs) m2.c(parcel, fs.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, e22);
                return true;
            case 11:
                t00 J5 = J5(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                m2.f(parcel2, J5);
                return true;
            case 12:
                sf0 i32 = i3(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readString(), y80.R5(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, i32);
                return true;
            case 13:
                au b52 = b5(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), (fs) m2.c(parcel, fs.CREATOR), parcel.readString(), y80.R5(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, b52);
                return true;
            case 14:
                ni0 V4 = V4(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), y80.R5(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, V4);
                return true;
            case 15:
                ec0 A5 = A5(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), y80.R5(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                m2.f(parcel2, A5);
                return true;
            case 16:
                n40 C1 = C1(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), y80.R5(parcel.readStrongBinder()), parcel.readInt(), k40.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                m2.f(parcel2, C1);
                return true;
            default:
                return false;
        }
    }
}
