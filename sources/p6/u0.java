package p6;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class u0 {
    public static Object a(Class cls) {
        try {
            return cls.newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object b(String str) {
        Class d10 = d(str);
        if (d10 == null) {
            return null;
        }
        return a(d10);
    }

    public static Object c(String str, Class[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class d(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object e(Context context) throws Exception {
        return k("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }

    public static Map<String, String> f(Context context, z zVar) {
        try {
            Object k10 = k("com.adjust.sdk.imei.Util", "getImeiParameters", new Class[]{Context.class, z.class}, context, zVar);
            if (k10 == null || !Map.class.isInstance(k10)) {
                return null;
            }
            return (Map) k10;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, String> g(Context context, z zVar) {
        try {
            Object k10 = k("com.adjust.sdk.oaid.Util", "getOaidParameters", new Class[]{Context.class, z.class}, context, zVar);
            if (k10 == null || !Map.class.isInstance(k10)) {
                return null;
            }
            return (Map) k10;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String h(Context context, Object obj) {
        try {
            return (String) i(obj, "getId", null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object i(Object obj, String str, Class[] clsArr, Object... objArr) throws Exception {
        return j(obj.getClass(), str, obj, clsArr, objArr);
    }

    public static Object j(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) throws Exception {
        Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    public static Object k(String str, String str2, Class[] clsArr, Object... objArr) throws Exception {
        return j(Class.forName(str), str2, null, clsArr, objArr);
    }

    public static Boolean l(Context context, Object obj) {
        try {
            Boolean bool = (Boolean) i(obj, "isLimitAdTrackingEnabled", null, new Object[0]);
            if (bool == null) {
                return null;
            }
            return Boolean.valueOf(bool.booleanValue() ? false : true);
        } catch (Throwable unused) {
            return null;
        }
    }
}
