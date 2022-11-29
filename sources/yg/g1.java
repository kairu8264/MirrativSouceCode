package yg;

import ai.pd0;
import ai.uj0;
import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class g1 {
    @Deprecated
    public static <T> T a(Context context, Callable<T> callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th2) {
            uj0.d("Unexpected exception.", th2);
            pd0.c(context).b(th2, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
