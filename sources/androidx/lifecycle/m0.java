package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0 extends t0.c {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f15582f = {Application.class, l0.class};

    /* renamed from: g  reason: collision with root package name */
    public static final Class<?>[] f15583g = {l0.class};

    /* renamed from: a  reason: collision with root package name */
    public final Application f15584a;

    /* renamed from: b  reason: collision with root package name */
    public final t0.b f15585b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f15586c;

    /* renamed from: d  reason: collision with root package name */
    public final o f15587d;

    /* renamed from: e  reason: collision with root package name */
    public final y4.c f15588e;

    @SuppressLint({"LambdaLast"})
    public m0(Application application, y4.e eVar, Bundle bundle) {
        t0.b d10;
        this.f15588e = eVar.a0();
        this.f15587d = eVar.g();
        this.f15586c = bundle;
        this.f15584a = application;
        if (application != null) {
            d10 = t0.a.g(application);
        } else {
            d10 = t0.d.d();
        }
        this.f15585b = d10;
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.t0.c, androidx.lifecycle.t0.b
    public <T extends q0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.t0.e
    public void b(q0 q0Var) {
        SavedStateHandleController.a(q0Var, this.f15588e, this.f15587d);
    }

    @Override // androidx.lifecycle.t0.c
    public <T extends q0> T c(String str, Class<T> cls) {
        Constructor d10;
        T t10;
        boolean isAssignableFrom = b.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.f15584a != null) {
            d10 = d(cls, f15582f);
        } else {
            d10 = d(cls, f15583g);
        }
        if (d10 == null) {
            return (T) this.f15585b.a(cls);
        }
        SavedStateHandleController j10 = SavedStateHandleController.j(this.f15588e, this.f15587d, str, this.f15586c);
        if (isAssignableFrom) {
            try {
                Application application = this.f15584a;
                if (application != null) {
                    t10 = (T) d10.newInstance(application, j10.k());
                    t10.e("androidx.lifecycle.savedstate.vm.tag", j10);
                    return t10;
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to access " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
            }
        }
        t10 = (T) d10.newInstance(j10.k());
        t10.e("androidx.lifecycle.savedstate.vm.tag", j10);
        return t10;
    }
}
