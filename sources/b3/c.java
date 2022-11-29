package b3;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f16773a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f16774b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f16775c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f16776d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f16777e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f16778f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f16779g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d f16780w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f16781x;

        public a(d dVar, Object obj) {
            this.f16780w = dVar;
            this.f16781x = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16780w.f16786w = this.f16781x;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Application f16782w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d f16783x;

        public b(Application application, d dVar) {
            this.f16782w = application;
            this.f16783x = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16782w.unregisterActivityLifecycleCallbacks(this.f16783x);
        }
    }

    /* renamed from: b3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0095c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f16784w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f16785x;

        public RunnableC0095c(Object obj, Object obj2) {
            this.f16784w = obj;
            this.f16785x = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = c.f16776d;
                if (method != null) {
                    method.invoke(this.f16784w, this.f16785x, Boolean.FALSE, "AppCompat recreation");
                } else {
                    c.f16777e.invoke(this.f16784w, this.f16785x, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: w  reason: collision with root package name */
        public Object f16786w;

        /* renamed from: x  reason: collision with root package name */
        public Activity f16787x;

        /* renamed from: y  reason: collision with root package name */
        public final int f16788y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f16789z = false;
        public boolean A = false;
        public boolean B = false;

        public d(Activity activity) {
            this.f16787x = activity;
            this.f16788y = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f16787x == activity) {
                this.f16787x = null;
                this.A = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.A || this.B || this.f16789z || !c.h(this.f16786w, this.f16788y, activity)) {
                return;
            }
            this.B = true;
            this.f16786w = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f16787x == activity) {
                this.f16789z = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f16773a = a10;
        f16774b = b();
        f16775c = f();
        f16776d = d(a10);
        f16777e = c(a10);
        f16778f = e(a10);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f16775c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f16779g.postAtFrontOfQueue(new RunnableC0095c(f16774b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f16778f == null) {
            return false;
        } else {
            if (f16777e == null && f16776d == null) {
                return false;
            }
            try {
                Object obj2 = f16775c.get(activity);
                if (obj2 == null || (obj = f16774b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f16779g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f16778f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
