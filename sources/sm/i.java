package sm;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f52759a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        lm.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f52759a == null) {
            f52759a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f52759a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
