package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class km extends l2 implements lm {
    public km() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        qm qmVar = null;
        sm smVar = null;
        switch (i10) {
            case 2:
                au c10 = c();
                parcel2.writeNoException();
                m2.f(parcel2, c10);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof qm) {
                        qmVar = (qm) queryLocalInterface;
                    } else {
                        qmVar = new qm(readStrongBinder);
                    }
                }
                L5(qmVar);
                parcel2.writeNoException();
                return true;
            case 4:
                yh.a s02 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof sm) {
                        smVar = (sm) queryLocalInterface2;
                    } else {
                        smVar = new rm(readStrongBinder2);
                    }
                }
                q5(s02, smVar);
                parcel2.writeNoException();
                return true;
            case 5:
                lv f10 = f();
                parcel2.writeNoException();
                m2.f(parcel2, f10);
                return true;
            case 6:
                p0(m2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                m5(hv.R5(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
