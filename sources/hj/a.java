package hj;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import qj.b;

/* loaded from: classes3.dex */
public class a {
    public static int a(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        return a10 != null ? a10.data : i11;
    }

    public static int b(Context context, int i10, String str) {
        return b.c(context, i10, str);
    }

    public static int c(View view, int i10) {
        return b.d(view, i10);
    }

    public static int d(View view, int i10, int i11) {
        return a(view.getContext(), i10, i11);
    }

    public static boolean e(int i10) {
        return i10 != 0 && f3.a.d(i10) > 0.5d;
    }

    public static int f(int i10, int i11) {
        return f3.a.g(i11, i10);
    }

    public static int g(int i10, int i11, float f10) {
        return f(i10, f3.a.k(i11, Math.round(Color.alpha(i11) * f10)));
    }

    public static int h(View view, int i10, int i11, float f10) {
        return g(c(view, i10), c(view, i11), f10);
    }
}
