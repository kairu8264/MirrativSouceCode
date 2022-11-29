package ai;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes3.dex */
public final class oa {
    @Pure
    public static void a(String str, String str2, Throwable th2) {
        Log.w(str, c(str2, th2));
    }

    @Pure
    public static void b(String str, String str2, Throwable th2) {
        Log.e(str, c(str2, th2));
    }

    @Pure
    public static String c(String str, Throwable th2) {
        String replace;
        if (th2 != null) {
            Throwable th3 = th2;
            while (true) {
                if (th3 != null) {
                    if (th3 instanceof UnknownHostException) {
                        replace = "UnknownHostException (no network)";
                        break;
                    }
                    th3 = th3.getCause();
                } else {
                    replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                    break;
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace2 = replace.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace2).length());
        sb2.append(valueOf);
        sb2.append("\n  ");
        sb2.append(replace2);
        sb2.append('\n');
        return sb2.toString();
    }
}
