package dk;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class k0 extends h0 implements l0 {
    public static l0 s0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        if (queryLocalInterface instanceof l0) {
            return (l0) queryLocalInterface;
        }
        return new j0(iBinder);
    }
}
