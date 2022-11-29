package p6;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Object f46018a;

    public static void a() {
        if (f46018a == null) {
            synchronized (o.class) {
                if (f46018a == null) {
                    f46018a = u0.b("com.adjust.sdk.sig.Signer");
                }
            }
        }
    }

    public static void b(z zVar) {
        a();
        if (f46018a == null) {
            return;
        }
        try {
            u0.i(f46018a, "onResume", null, new Object[0]);
        } catch (Exception e10) {
            zVar.b("Invoking Signer onResume() received an error [%s]", e10.getMessage());
        }
    }

    public static void c(Map<String, String> map, String str, String str2, Context context, z zVar) {
        a();
        if (f46018a == null) {
            return;
        }
        try {
            u0.i(f46018a, "sign", new Class[]{Context.class, Map.class, String.class, String.class}, context, map, str, str2);
        } catch (Exception e10) {
            zVar.b("Invoking Signer sign() for %s received an error [%s]", str, e10.getMessage());
        }
    }
}
