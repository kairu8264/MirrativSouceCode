package ai;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class x40 extends u40 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ mk0 f11862w;

    public x40(y40 y40Var, mk0 mk0Var) {
        this.f11862w = mk0Var;
    }

    @Override // ai.v40
    public final void y3(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.f11862w.d(parcelFileDescriptor);
    }
}
