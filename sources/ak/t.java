package ak;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class t extends r<ParcelFileDescriptor> {
    public t(c0 c0Var, jk.o<ParcelFileDescriptor> oVar) {
        super(c0Var, oVar);
    }

    @Override // ak.r, dk.n0
    public final void w3(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.w3(bundle, bundle2);
        this.f13609w.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
