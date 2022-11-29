package rh;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class v0 extends fi.b implements w0 {
    public static w0 s0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof w0 ? (w0) queryLocalInterface : new u0(iBinder);
    }
}
