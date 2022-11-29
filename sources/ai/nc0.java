package ai;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes3.dex */
public final class nc0 extends RemoteCreator<tc0> {
    public nc0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* bridge */ /* synthetic */ tc0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof tc0) {
            return (tc0) queryLocalInterface;
        }
        return new rc0(iBinder);
    }

    public final qc0 c(Activity activity) {
        qc0 oc0Var;
        try {
            IBinder L = b(activity).L(yh.b.h1(activity));
            if (L == null) {
                return null;
            }
            IInterface queryLocalInterface = L.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof qc0) {
                oc0Var = (qc0) queryLocalInterface;
            } else {
                oc0Var = new oc0(L);
            }
            return oc0Var;
        } catch (RemoteException e10) {
            uj0.g("Could not create remote AdOverlay.", e10);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            uj0.g("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}
