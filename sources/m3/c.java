package m3;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Method f40569a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f40570b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            if (i10 < 24) {
                try {
                    f40570b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f40569a = cls.getMethod("getScript", String.class);
            f40570b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e11) {
            f40569a = null;
            f40570b = null;
            Log.w("ICUCompat", e11);
        }
    }

    public static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f40570b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e10) {
            Log.w("ICUCompat", e10);
        } catch (InvocationTargetException e11) {
            Log.w("ICUCompat", e11);
        }
        return locale2;
    }

    public static String b(String str) {
        try {
            Method method = f40569a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e10) {
            Log.w("ICUCompat", e10);
        } catch (InvocationTargetException e11) {
            Log.w("ICUCompat", e11);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i10 >= 21) {
            try {
                return ((Locale) f40570b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException e10) {
                Log.w("ICUCompat", e10);
                return locale.getScript();
            } catch (InvocationTargetException e11) {
                Log.w("ICUCompat", e11);
                return locale.getScript();
            }
        }
        String a10 = a(locale);
        if (a10 != null) {
            return b(a10);
        }
        return null;
    }
}
