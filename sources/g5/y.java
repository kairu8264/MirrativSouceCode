package g5;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public static LayoutTransition f32786a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f32787b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f32788c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f32789d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f32790e;

    /* loaded from: classes.dex */
    public static class a extends LayoutTransition {
        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    public static void a(LayoutTransition layoutTransition) {
        if (!f32790e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f32789d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f32790e = true;
        }
        Method method = f32789d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = g5.y.f32786a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            g5.y$a r0 = new g5.y$a
            r0.<init>()
            g5.y.f32786a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = g5.y.f32786a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = g5.y.f32786a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = g5.y.f32786a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = g5.y.f32786a
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            a(r6)
        L39:
            android.animation.LayoutTransition r0 = g5.y.f32786a
            if (r6 == r0) goto L42
            int r0 = g5.j.f32717d
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = g5.y.f32786a
            r5.setLayoutTransition(r6)
            goto L94
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = g5.y.f32788c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L66
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L5f
            g5.y.f32787b = r6     // Catch: java.lang.NoSuchFieldException -> L5f
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5f
            goto L64
        L5f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L64:
            g5.y.f32788c = r1
        L66:
            java.lang.reflect.Field r6 = g5.y.f32787b
            if (r6 == 0) goto L7f
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L7a
            if (r6 == 0) goto L78
            java.lang.reflect.Field r1 = g5.y.f32787b     // Catch: java.lang.IllegalAccessException -> L76
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L76
            goto L78
        L76:
            r2 = r6
            goto L7a
        L78:
            r2 = r6
            goto L7f
        L7a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L7f:
            if (r2 == 0) goto L84
            r5.requestLayout()
        L84:
            int r6 = g5.j.f32717d
            java.lang.Object r0 = r5.getTag(r6)
            android.animation.LayoutTransition r0 = (android.animation.LayoutTransition) r0
            if (r0 == 0) goto L94
            r5.setTag(r6, r3)
            r5.setLayoutTransition(r0)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.y.b(android.view.ViewGroup, boolean):void");
    }
}
