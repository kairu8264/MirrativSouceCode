package dk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class d extends h0 implements e {
    public d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // dk.h0
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            F0((Bundle) i0.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
