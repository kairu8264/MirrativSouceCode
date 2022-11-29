package xh;

import android.content.Context;
import vh.n;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f60292a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f60293b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f60292a;
            if (context2 != null && (bool = f60293b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f60293b = null;
            if (n.k()) {
                f60293b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f60293b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f60293b = Boolean.FALSE;
                }
            }
            f60292a = applicationContext;
            return f60293b.booleanValue();
        }
    }
}
