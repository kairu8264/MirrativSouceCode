package ai;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class lt extends l2 implements nt {
    public lt() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // ai.l2
    public final boolean Q5(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zzb();
                break;
            case 2:
                F(parcel.readInt());
                break;
            case 3:
                break;
            case 4:
                a();
                break;
            case 5:
                f();
                break;
            case 6:
                e();
                break;
            case 7:
                h();
                break;
            case 8:
                Z((sr) m2.c(parcel, sr.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
