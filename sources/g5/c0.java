package g5;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f32674a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property<View, Float> f32675b;

    /* renamed from: c  reason: collision with root package name */
    public static final Property<View, Rect> f32676c;

    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            c0.g(view, f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return o3.c0.w(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            o3.c0.y0(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f32674a = new h0();
        } else if (i10 >= 23) {
            f32674a = new g0();
        } else if (i10 >= 22) {
            f32674a = new f0();
        } else if (i10 >= 21) {
            f32674a = new e0();
        } else if (i10 >= 19) {
            f32674a = new d0();
        } else {
            f32674a = new i0();
        }
        f32675b = new a(Float.class, "translationAlpha");
        f32676c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f32674a.a(view);
    }

    public static b0 b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new a0(view);
        }
        return z.e(view);
    }

    public static float c(View view) {
        return f32674a.c(view);
    }

    public static m0 d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new l0(view);
        }
        return new k0(view.getWindowToken());
    }

    public static void e(View view) {
        f32674a.d(view);
    }

    public static void f(View view, int i10, int i11, int i12, int i13) {
        f32674a.e(view, i10, i11, i12, i13);
    }

    public static void g(View view, float f10) {
        f32674a.f(view, f10);
    }

    public static void h(View view, int i10) {
        f32674a.g(view, i10);
    }

    public static void i(View view, Matrix matrix) {
        f32674a.h(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        f32674a.i(view, matrix);
    }
}
