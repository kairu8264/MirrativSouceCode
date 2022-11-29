package ci;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // ci.b
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            s5((Status) c.a(parcel, Status.CREATOR), (ih.f) c.a(parcel, ih.f.CREATOR));
            return true;
        }
        return false;
    }
}
