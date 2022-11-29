package hi;

import android.os.Binder;

/* loaded from: classes3.dex */
public final /* synthetic */ class y5 {
    public static <V> V a(z5<V> z5Var) {
        try {
            return z5Var.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return z5Var.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
