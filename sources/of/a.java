package of;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45385a = new a();

    public static final boolean a(Context context) {
        jo.p.h(context, "context");
        return f45385a.b(context, 11);
    }

    public final boolean b(Context context, int i10) {
        try {
            Object systemService = context.getSystemService("appops");
            jo.p.f(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            Class cls = Integer.TYPE;
            Object invoke = AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke((AppOpsManager) systemService, Integer.valueOf(i10), Integer.valueOf(Process.myUid()), context.getPackageName());
            jo.p.f(invoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) invoke).intValue() == 0;
        } catch (Exception e10) {
            g9.a.c(e10);
            return false;
        }
    }
}
