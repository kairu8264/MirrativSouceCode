package nj;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import o3.c0;
import o3.p0;
import o3.v;

/* loaded from: classes3.dex */
public class l {

    /* loaded from: classes3.dex */
    public static class a implements v {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c f43663w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d f43664x;

        public a(c cVar, d dVar) {
            this.f43663w = cVar;
            this.f43664x = dVar;
        }

        @Override // o3.v
        public p0 a(View view, p0 p0Var) {
            return this.f43663w.a(view, p0Var, new d(this.f43664x));
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            c0.o0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        p0 a(View view, p0 p0Var, d dVar);
    }

    public static void a(View view, c cVar) {
        c0.F0(view, new a(cVar, new d(c0.J(view), view.getPaddingTop(), c0.I(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += c0.y((View) parent);
        }
        return f10;
    }

    public static boolean d(View view) {
        return c0.E(view) == 1;
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void f(View view) {
        if (c0.U(view)) {
            c0.o0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f43665a;

        /* renamed from: b  reason: collision with root package name */
        public int f43666b;

        /* renamed from: c  reason: collision with root package name */
        public int f43667c;

        /* renamed from: d  reason: collision with root package name */
        public int f43668d;

        public d(int i10, int i11, int i12, int i13) {
            this.f43665a = i10;
            this.f43666b = i11;
            this.f43667c = i12;
            this.f43668d = i13;
        }

        public d(d dVar) {
            this.f43665a = dVar.f43665a;
            this.f43666b = dVar.f43666b;
            this.f43667c = dVar.f43667c;
            this.f43668d = dVar.f43668d;
        }
    }
}
