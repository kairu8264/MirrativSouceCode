package dk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class a extends g0 implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // dk.c
    public final void F3(String str, Bundle bundle, e eVar) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i0.b(i02, bundle);
        i0.c(i02, eVar);
        s0(2, i02);
    }
}
