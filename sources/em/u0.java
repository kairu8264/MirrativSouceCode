package em;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f30758a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f30759b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static ui.a f30760c;

    public static void a(Context context) {
        if (f30760c == null) {
            ui.a aVar = new ui.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f30760c = aVar;
            aVar.d(true);
        }
    }

    public static void b(Intent intent) {
        synchronized (f30759b) {
            if (f30760c != null && c(intent)) {
                d(intent, false);
                f30760c.c();
            }
        }
    }

    public static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void d(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    public static ComponentName e(Context context, Intent intent) {
        synchronized (f30759b) {
            a(context);
            boolean c10 = c(intent);
            d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c10) {
                f30760c.a(f30758a);
            }
            return startService;
        }
    }
}
