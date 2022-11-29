package dk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class o0 extends h0 implements p0 {
    public o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // dk.h0
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        q0 q0Var = null;
        if (i10 == 2) {
            Bundle bundle = (Bundle) i0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface instanceof q0) {
                    q0Var = (q0) queryLocalInterface;
                } else {
                    q0Var = new q0(readStrongBinder);
                }
            }
            F4(bundle, q0Var);
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) i0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface2 instanceof q0) {
                    q0Var = (q0) queryLocalInterface2;
                } else {
                    q0Var = new q0(readStrongBinder2);
                }
            }
            J3(bundle2, q0Var);
            return true;
        }
    }
}
