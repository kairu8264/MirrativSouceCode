package ki;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class i extends e implements j {
    public i() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // ki.e
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            I1((Status) f.a(parcel, Status.CREATOR), (ri.f) f.a(parcel, ri.f.CREATOR));
        } else if (i10 == 2) {
            H(parcel.readString());
        } else if (i10 == 3) {
            Y3((Status) f.a(parcel, Status.CREATOR), (ri.b) f.a(parcel, ri.b.CREATOR));
        } else if (i10 == 4) {
            D2((Status) f.a(parcel, Status.CREATOR), f.c(parcel));
        } else if (i10 == 6) {
            D4((Status) f.a(parcel, Status.CREATOR), (ri.k) f.a(parcel, ri.k.CREATOR));
        } else if (i10 == 8) {
            I3((Status) f.a(parcel, Status.CREATOR), (ri.i) f.a(parcel, ri.i.CREATOR));
        } else if (i10 == 10) {
            I4((Status) f.a(parcel, Status.CREATOR), f.c(parcel));
        } else if (i10 == 11) {
            e3((Status) f.a(parcel, Status.CREATOR));
        } else if (i10 == 15) {
            Q2((Status) f.a(parcel, Status.CREATOR), (ri.m) f.a(parcel, ri.m.CREATOR));
        } else if (i10 != 16) {
            return false;
        } else {
            n2((Status) f.a(parcel, Status.CREATOR), parcel.readString(), parcel.readInt());
        }
        return true;
    }
}
