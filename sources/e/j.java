package e;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static Field f29954a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f29955b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f29956c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f29957d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f29958e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f29959f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f29960g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f29961h;

    public static void a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            d(resources);
        } else if (i10 >= 23) {
            c(resources);
        } else if (i10 >= 21) {
            b(resources);
        }
    }

    public static void b(Resources resources) {
        if (!f29955b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f29954a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f29955b = true;
        }
        Field field = f29954a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void c(Resources resources) {
        if (!f29955b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f29954a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f29955b = true;
        }
        Object obj = null;
        Field field = f29954a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    public static void d(Resources resources) {
        Object obj;
        if (!f29961h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f29960g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f29961h = true;
        }
        Field field = f29960g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f29955b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f29954a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f29955b = true;
        }
        Field field2 = f29954a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    public static void e(Object obj) {
        if (!f29957d) {
            try {
                f29956c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f29957d = true;
        }
        Class<?> cls = f29956c;
        if (cls == null) {
            return;
        }
        if (!f29959f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f29958e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f29959f = true;
        }
        Field field = f29958e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
