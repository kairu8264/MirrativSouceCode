package b5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f16970d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f16971e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f16974c;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f16973b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f16972a = new HashMap();

    public a(Context context) {
        this.f16974c = context.getApplicationContext();
    }

    public static a e(Context context) {
        if (f16970d == null) {
            synchronized (f16971e) {
                if (f16970d == null) {
                    f16970d = new a(context);
                }
            }
        }
        return f16970d;
    }

    public void a() {
        try {
            try {
                f5.a.a("Startup");
                b(this.f16974c.getPackageManager().getProviderInfo(new ComponentName(this.f16974c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } finally {
            f5.a.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(Bundle bundle) {
        String string = this.f16974c.getString(c.f16975a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f16973b.add(cls);
                        }
                    }
                }
                for (Class<? extends b<?>> cls2 : this.f16973b) {
                    d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    public <T> T c(Class<? extends b<?>> cls) {
        T t10;
        synchronized (f16971e) {
            t10 = (T) this.f16972a.get(cls);
            if (t10 == null) {
                t10 = (T) d(cls, new HashSet());
            }
        }
        return t10;
    }

    public final <T> T d(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t10;
        if (f5.a.d()) {
            try {
                f5.a.a(cls.getSimpleName());
            } finally {
                f5.a.b();
            }
        }
        if (!set.contains(cls)) {
            if (!this.f16972a.containsKey(cls)) {
                set.add(cls);
                b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a10 = newInstance.a();
                if (!a10.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : a10) {
                        if (!this.f16972a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) newInstance.b(this.f16974c);
                set.remove(cls);
                this.f16972a.put(cls, t10);
            } else {
                t10 = (T) this.f16972a.get(cls);
            }
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public <T> T f(Class<? extends b<T>> cls) {
        return (T) c(cls);
    }
}
