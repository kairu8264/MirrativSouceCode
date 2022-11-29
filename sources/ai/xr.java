package ai;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes3.dex */
public final class xr extends RemoteCreator<xt> {
    public xr() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* bridge */ /* synthetic */ xt a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof xt) {
            return (xt) queryLocalInterface;
        }
        return new xt(iBinder);
    }

    public final wt c(Context context, String str, z80 z80Var) {
        wt utVar;
        try {
            IBinder M1 = b(context).M1(yh.b.h1(context), str, z80Var, 213806000);
            if (M1 == null) {
                return null;
            }
            IInterface queryLocalInterface = M1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof wt) {
                utVar = (wt) queryLocalInterface;
            } else {
                utVar = new ut(M1);
            }
            return utVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            uj0.g("Could not create remote builder for AdLoader.", e10);
            return null;
        }
    }
}
