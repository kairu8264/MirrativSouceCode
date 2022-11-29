package g9;

import android.util.Log;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import jo.i0;
import jo.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32826a = new a();

    public static final void c(Throwable th2) {
        a aVar = f32826a;
        if (aVar.k() && th2 != null) {
            Log.w("MIRRORMAN", "Log exception " + th2 + ", " + aVar.d(), th2);
        }
        if (th2 instanceof CancellationException) {
            return;
        }
        try {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.recordException(new Exception("Log exception " + th2 + ", " + aVar.d(), th2));
        } catch (Throwable unused) {
        }
    }

    public static final void f(Object obj) {
        a aVar = f32826a;
        if (!aVar.k() || obj == null) {
            return;
        }
        aVar.e(obj + ' ' + aVar.d());
    }

    public static final void g(String str) {
        p.h(str, "string");
        a aVar = f32826a;
        if (aVar.k()) {
            aVar.e(str + ' ' + aVar.d());
        }
    }

    public static final void h(Throwable th2) {
        a aVar = f32826a;
        if (!aVar.k() || th2 == null) {
            return;
        }
        Log.i("MIRRORMAN", "Log exception " + th2.getMessage() + ", " + aVar.d(), th2);
    }

    public static final void j(String str, String str2, String str3, String str4) {
        p.h(str, LogBase.USER_ID);
        p.h(str2, "referer");
        p.h(str3, "classname");
        p.h(str4, "message");
        a aVar = f32826a;
        aVar.i("start Profile " + str + " from " + str2 + " at " + str3 + ' ' + str4);
    }

    public final void a(String str) {
        int i10 = 0;
        while (true) {
            int i11 = i10 * 4000;
            if (i11 >= str.length()) {
                return;
            }
            i10++;
            String substring = str.substring(i11, Math.min(i10 * 4000, str.length()));
            p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.e("MIRRORMAN", substring);
        }
    }

    public final void b(String str, Object... objArr) {
        p.h(str, "format");
        p.h(objArr, "args");
        if (k()) {
            a(fp.b.q(str, objArr) + ' ' + d());
        }
        try {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            StringBuilder sb2 = new StringBuilder();
            i0 i0Var = i0.f38149a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            p.g(format, "format(format, *args)");
            sb2.append(format);
            sb2.append(' ');
            sb2.append(d());
            firebaseCrashlytics.recordException(new Exception(sb2.toString()));
        } catch (Throwable unused) {
        }
    }

    public final String d() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        for (int i10 = 2; i10 < length; i10++) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!p.c(stackTraceElement.getClassName(), a.class.getName())) {
                i0 i0Var = i0.f38149a;
                String format = String.format("at %s.%s(%s:%d)", Arrays.copyOf(new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())}, 4));
                p.g(format, "format(format, *args)");
                return format;
            }
        }
        return "(unknown)";
    }

    public final void e(String str) {
        int i10 = 0;
        while (true) {
            int i11 = i10 * 4000;
            if (i11 >= str.length()) {
                return;
            }
            i10++;
            String substring = str.substring(i11, Math.min(i10 * 4000, str.length()));
            p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.i("MIRRORMAN", substring);
        }
    }

    public final void i(String str) {
        p.h(str, "message");
        try {
            FirebaseCrashlytics.getInstance().log(str);
        } catch (IllegalStateException unused) {
        }
        if (k()) {
            l("BREADCRUMB : " + str);
        }
    }

    public final boolean k() {
        return false;
    }

    public final void l(String str) {
        int i10 = 0;
        while (true) {
            int i11 = i10 * 4000;
            if (i11 >= str.length()) {
                return;
            }
            i10++;
            String substring = str.substring(i11, Math.min(i10 * 4000, str.length()));
            p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.v("MIRRORMAN", substring);
        }
    }
}
