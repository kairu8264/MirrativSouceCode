package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements r {
    public static Field A;

    /* renamed from: x  reason: collision with root package name */
    public static int f14051x;

    /* renamed from: y  reason: collision with root package name */
    public static Field f14052y;

    /* renamed from: z  reason: collision with root package name */
    public static Field f14053z;

    /* renamed from: w  reason: collision with root package name */
    public Activity f14054w;

    public ImmLeaksCleaner(Activity activity) {
        this.f14054w = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a() {
        try {
            f14051x = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f14053z = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            A = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f14052y = declaredField3;
            declaredField3.setAccessible(true);
            f14051x = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        if (bVar != o.b.ON_DESTROY) {
            return;
        }
        if (f14051x == 0) {
            a();
        }
        if (f14051x == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f14054w.getSystemService("input_method");
            try {
                Object obj = f14052y.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f14053z.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                A.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
