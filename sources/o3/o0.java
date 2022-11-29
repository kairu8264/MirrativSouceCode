package o3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o3.p0;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public e f43980a;

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: w  reason: collision with root package name */
        public WindowInsets f43983w;

        /* renamed from: x  reason: collision with root package name */
        public final int f43984x;

        public b(int i10) {
            this.f43984x = i10;
        }

        public final int b() {
            return this.f43984x;
        }

        public void c(o0 o0Var) {
        }

        public void d(o0 o0Var) {
        }

        public abstract p0 e(p0 p0Var, List<o0> list);

        public a f(o0 o0Var, a aVar) {
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public final b f43985a;

            /* renamed from: b  reason: collision with root package name */
            public p0 f43986b;

            /* renamed from: o3.o0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0651a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ o0 f43987a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ p0 f43988b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ p0 f43989c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ int f43990d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ View f43991e;

                public C0651a(o0 o0Var, p0 p0Var, p0 p0Var2, int i10, View view) {
                    this.f43987a = o0Var;
                    this.f43988b = p0Var;
                    this.f43989c = p0Var2;
                    this.f43990d = i10;
                    this.f43991e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f43987a.e(valueAnimator.getAnimatedFraction());
                    c.j(this.f43991e, c.n(this.f43988b, this.f43989c, this.f43987a.b(), this.f43990d), Collections.singletonList(this.f43987a));
                }
            }

            /* loaded from: classes.dex */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ o0 f43993a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ View f43994b;

                public b(o0 o0Var, View view) {
                    this.f43993a = o0Var;
                    this.f43994b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f43993a.e(1.0f);
                    c.h(this.f43994b, this.f43993a);
                }
            }

            /* renamed from: o3.o0$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0652c implements Runnable {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ View f43996w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ o0 f43997x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ a f43998y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f43999z;

                public RunnableC0652c(View view, o0 o0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f43996w = view;
                    this.f43997x = o0Var;
                    this.f43998y = aVar;
                    this.f43999z = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.k(this.f43996w, this.f43997x, this.f43998y);
                    this.f43999z.start();
                }
            }

            public a(View view, b bVar) {
                this.f43985a = bVar;
                p0 L = c0.L(view);
                this.f43986b = L != null ? new p0.b(L).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f43986b = p0.y(windowInsets, view);
                    return c.l(view, windowInsets);
                }
                p0 y10 = p0.y(windowInsets, view);
                if (this.f43986b == null) {
                    this.f43986b = c0.L(view);
                }
                if (this.f43986b == null) {
                    this.f43986b = y10;
                    return c.l(view, windowInsets);
                }
                b m10 = c.m(view);
                if (m10 != null && Objects.equals(m10.f43983w, windowInsets)) {
                    return c.l(view, windowInsets);
                }
                int e10 = c.e(y10, this.f43986b);
                if (e10 == 0) {
                    return c.l(view, windowInsets);
                }
                p0 p0Var = this.f43986b;
                o0 o0Var = new o0(e10, new DecelerateInterpolator(), 160L);
                o0Var.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o0Var.a());
                a f10 = c.f(y10, p0Var, e10);
                c.i(view, o0Var, windowInsets, false);
                duration.addUpdateListener(new C0651a(o0Var, y10, p0Var, e10, view));
                duration.addListener(new b(o0Var, view));
                y.a(view, new RunnableC0652c(view, o0Var, f10, duration));
                this.f43986b = y10;
                return c.l(view, windowInsets);
            }
        }

        public c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @SuppressLint({"WrongConstant"})
        public static int e(p0 p0Var, p0 p0Var2) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!p0Var.f(i11).equals(p0Var2.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        public static a f(p0 p0Var, p0 p0Var2, int i10) {
            f3.b f10 = p0Var.f(i10);
            f3.b f11 = p0Var2.f(i10);
            return new a(f3.b.b(Math.min(f10.f31713a, f11.f31713a), Math.min(f10.f31714b, f11.f31714b), Math.min(f10.f31715c, f11.f31715c), Math.min(f10.f31716d, f11.f31716d)), f3.b.b(Math.max(f10.f31713a, f11.f31713a), Math.max(f10.f31714b, f11.f31714b), Math.max(f10.f31715c, f11.f31715c), Math.max(f10.f31716d, f11.f31716d)));
        }

        public static View.OnApplyWindowInsetsListener g(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void h(View view, o0 o0Var) {
            b m10 = m(view);
            if (m10 != null) {
                m10.c(o0Var);
                if (m10.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    h(viewGroup.getChildAt(i10), o0Var);
                }
            }
        }

        public static void i(View view, o0 o0Var, WindowInsets windowInsets, boolean z10) {
            b m10 = m(view);
            if (m10 != null) {
                m10.f43983w = windowInsets;
                if (!z10) {
                    m10.d(o0Var);
                    z10 = m10.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), o0Var, windowInsets, z10);
                }
            }
        }

        public static void j(View view, p0 p0Var, List<o0> list) {
            b m10 = m(view);
            if (m10 != null) {
                p0Var = m10.e(p0Var, list);
                if (m10.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), p0Var, list);
                }
            }
        }

        public static void k(View view, o0 o0Var, a aVar) {
            b m10 = m(view);
            if (m10 != null) {
                m10.f(o0Var, aVar);
                if (m10.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), o0Var, aVar);
                }
            }
        }

        public static WindowInsets l(View view, WindowInsets windowInsets) {
            return view.getTag(a3.d.T) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b m(View view) {
            Object tag = view.getTag(a3.d.f386b0);
            if (tag instanceof a) {
                return ((a) tag).f43985a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public static p0 n(p0 p0Var, p0 p0Var2, float f10, int i10) {
            p0.b bVar = new p0.b(p0Var);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    bVar.b(i11, p0Var.f(i11));
                } else {
                    f3.b f11 = p0Var.f(i11);
                    f3.b f12 = p0Var2.f(i11);
                    float f13 = 1.0f - f10;
                    bVar.b(i11, p0.o(f11, (int) (((f11.f31713a - f12.f31713a) * f13) + 0.5d), (int) (((f11.f31714b - f12.f31714b) * f13) + 0.5d), (int) (((f11.f31715c - f12.f31715c) * f13) + 0.5d), (int) (((f11.f31716d - f12.f31716d) * f13) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void o(View view, b bVar) {
            Object tag = view.getTag(a3.d.T);
            if (bVar == null) {
                view.setTag(a3.d.f386b0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener g10 = g(view, bVar);
            view.setTag(a3.d.f386b0, g10);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(g10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f44005a;

        /* renamed from: b  reason: collision with root package name */
        public float f44006b;

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f44007c;

        /* renamed from: d  reason: collision with root package name */
        public final long f44008d;

        public e(int i10, Interpolator interpolator, long j10) {
            this.f44005a = i10;
            this.f44007c = interpolator;
            this.f44008d = j10;
        }

        public long a() {
            return this.f44008d;
        }

        public float b() {
            Interpolator interpolator = this.f44007c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f44006b);
            }
            return this.f44006b;
        }

        public int c() {
            return this.f44005a;
        }

        public void d(float f10) {
            this.f44006b = f10;
        }
    }

    public o0(int i10, Interpolator interpolator, long j10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f43980a = new d(i10, interpolator, j10);
        } else if (i11 >= 21) {
            this.f43980a = new c(i10, interpolator, j10);
        } else {
            this.f43980a = new e(0, interpolator, j10);
        }
    }

    public static void d(View view, b bVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            d.h(view, bVar);
        } else if (i10 >= 21) {
            c.o(view, bVar);
        }
    }

    public static o0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new o0(windowInsetsAnimation);
    }

    public long a() {
        return this.f43980a.a();
    }

    public float b() {
        return this.f43980a.b();
    }

    public int c() {
        return this.f43980a.c();
    }

    public void e(float f10) {
        this.f43980a.d(f10);
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        public final WindowInsetsAnimation f44000e;

        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final b f44001a;

            /* renamed from: b  reason: collision with root package name */
            public List<o0> f44002b;

            /* renamed from: c  reason: collision with root package name */
            public ArrayList<o0> f44003c;

            /* renamed from: d  reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, o0> f44004d;

            public a(b bVar) {
                super(bVar.b());
                this.f44004d = new HashMap<>();
                this.f44001a = bVar;
            }

            public final o0 a(WindowInsetsAnimation windowInsetsAnimation) {
                o0 o0Var = this.f44004d.get(windowInsetsAnimation);
                if (o0Var == null) {
                    o0 f10 = o0.f(windowInsetsAnimation);
                    this.f44004d.put(windowInsetsAnimation, f10);
                    return f10;
                }
                return o0Var;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f44001a.c(a(windowInsetsAnimation));
                this.f44004d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f44001a.d(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<o0> arrayList = this.f44003c;
                if (arrayList == null) {
                    ArrayList<o0> arrayList2 = new ArrayList<>(list.size());
                    this.f44003c = arrayList2;
                    this.f44002b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    o0 a10 = a(windowInsetsAnimation);
                    a10.e(windowInsetsAnimation.getFraction());
                    this.f44003c.add(a10);
                }
                return this.f44001a.e(p0.x(windowInsets), this.f44002b).w();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f44001a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f44000e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.a().e(), aVar.b().e());
        }

        public static f3.b f(WindowInsetsAnimation.Bounds bounds) {
            return f3.b.d(bounds.getUpperBound());
        }

        public static f3.b g(WindowInsetsAnimation.Bounds bounds) {
            return f3.b.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // o3.o0.e
        public long a() {
            return this.f44000e.getDurationMillis();
        }

        @Override // o3.o0.e
        public float b() {
            return this.f44000e.getInterpolatedFraction();
        }

        @Override // o3.o0.e
        public int c() {
            return this.f44000e.getTypeMask();
        }

        @Override // o3.o0.e
        public void d(float f10) {
            this.f44000e.setFraction(f10);
        }

        public d(int i10, Interpolator interpolator, long j10) {
            this(new WindowInsetsAnimation(i10, interpolator, j10));
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final f3.b f43981a;

        /* renamed from: b  reason: collision with root package name */
        public final f3.b f43982b;

        public a(f3.b bVar, f3.b bVar2) {
            this.f43981a = bVar;
            this.f43982b = bVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public f3.b a() {
            return this.f43981a;
        }

        public f3.b b() {
            return this.f43982b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f43981a + " upper=" + this.f43982b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f43981a = d.g(bounds);
            this.f43982b = d.f(bounds);
        }
    }

    public o0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f43980a = new d(windowInsetsAnimation);
        }
    }
}
