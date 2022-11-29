package ai;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class xj0 {
    public static <T> T a(Context context, String str, wj0<IBinder, T> wj0Var) throws zzcgw {
        try {
            return wj0Var.a(c(context).d(str));
        } catch (Exception e10) {
            throw new zzcgw(e10);
        }
    }

    public static Context b(Context context) throws zzcgw {
        return c(context).b();
    }

    public static DynamiteModule c(Context context) throws zzcgw {
        try {
            return DynamiteModule.e(context, DynamiteModule.f27228b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e10) {
            throw new zzcgw(e10);
        }
    }
}
