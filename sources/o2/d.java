package o2;

import android.view.View;
import q1.r;
import s1.k;

/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ void a(View view, k kVar) {
        e(view, kVar);
    }

    public static final /* synthetic */ float b(int i10) {
        return f(i10);
    }

    public static final /* synthetic */ float c(float f10) {
        return g(f10);
    }

    public static final /* synthetic */ int d(int i10) {
        return h(i10);
    }

    public static final void e(View view, k kVar) {
        long e10 = r.e(kVar.j());
        int c10 = lo.c.c(b1.f.m(e10));
        int c11 = lo.c.c(b1.f.n(e10));
        view.layout(c10, c11, view.getMeasuredWidth() + c10, view.getMeasuredHeight() + c11);
    }

    public static final float f(int i10) {
        return i10 * (-1);
    }

    public static final float g(float f10) {
        return f10 * (-1.0f);
    }

    public static final int h(int i10) {
        if (i10 == 0) {
            return m1.f.f40505a.a();
        }
        return m1.f.f40505a.b();
    }
}
