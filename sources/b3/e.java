package b3;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Method f16790a;

        /* renamed from: b  reason: collision with root package name */
        public static boolean f16791b;

        /* renamed from: c  reason: collision with root package name */
        public static Method f16792c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f16793d;

        public static IBinder a(Bundle bundle, String str) {
            if (!f16791b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f16790a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e10);
                }
                f16791b = true;
            }
            Method method2 = f16790a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e11);
                    f16790a = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f16793d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f16792c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e10);
                }
                f16793d = true;
            }
            Method method2 = f16792c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e11);
                    f16792c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return a.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.b(bundle, str, iBinder);
        }
    }
}
