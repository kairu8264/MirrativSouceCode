package c1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f18789a = new z();

    /* renamed from: b  reason: collision with root package name */
    public static Method f18790b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f18791c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f18792d;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(Canvas canvas, boolean z10) {
        Method method;
        jo.p.h(canvas, "canvas");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            a0.f18625a.a(canvas, z10);
            return;
        }
        if (!f18792d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f18790b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f18791c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f18790b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f18791c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f18790b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f18791c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f18792d = true;
        }
        if (z10) {
            try {
                Method method4 = f18790b;
                if (method4 != null) {
                    jo.p.e(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f18791c) == null) {
            return;
        }
        jo.p.e(method);
        method.invoke(canvas, new Object[0]);
    }
}
