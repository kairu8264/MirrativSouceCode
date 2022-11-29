package o3;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: b  reason: collision with root package name */
    public static final p0 f44009b;

    /* renamed from: a  reason: collision with root package name */
    public final l f44010a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f44011a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f44012b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f44013c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f44014d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f44011a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f44012b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f44013c = declaredField3;
                declaredField3.setAccessible(true);
                f44014d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static p0 a(View view) {
            if (f44014d && view.isAttachedToWindow()) {
                try {
                    Object obj = f44011a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f44012b.get(obj);
                        Rect rect2 = (Rect) f44013c.get(obj);
                        if (rect != null && rect2 != null) {
                            p0 a10 = new b().c(f3.b.c(rect)).d(f3.b.c(rect2)).a();
                            a10.u(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public e() {
        }

        @Override // o3.p0.f
        public void c(int i10, f3.b bVar) {
            this.f44022c.setInsets(n.a(i10), bVar.e());
        }

        public e(p0 p0Var) {
            super(p0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final p0 f44023a;

        /* renamed from: b  reason: collision with root package name */
        public f3.b[] f44024b;

        public f() {
            this(new p0((p0) null));
        }

        public final void a() {
            f3.b[] bVarArr = this.f44024b;
            if (bVarArr != null) {
                f3.b bVar = bVarArr[m.d(1)];
                f3.b bVar2 = this.f44024b[m.d(2)];
                if (bVar2 == null) {
                    bVar2 = this.f44023a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f44023a.f(1);
                }
                g(f3.b.a(bVar, bVar2));
                f3.b bVar3 = this.f44024b[m.d(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                f3.b bVar4 = this.f44024b[m.d(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                f3.b bVar5 = this.f44024b[m.d(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        public p0 b() {
            a();
            return this.f44023a;
        }

        public void c(int i10, f3.b bVar) {
            if (this.f44024b == null) {
                this.f44024b = new f3.b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f44024b[m.d(i11)] = bVar;
                }
            }
        }

        public void d(f3.b bVar) {
        }

        public void e(f3.b bVar) {
        }

        public void f(f3.b bVar) {
        }

        public void g(f3.b bVar) {
        }

        public void h(f3.b bVar) {
        }

        public f(p0 p0Var) {
            this.f44023a = p0Var;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public i(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var, windowInsets);
        }

        @Override // o3.p0.l
        public p0 a() {
            return p0.x(this.f44030c.consumeDisplayCutout());
        }

        @Override // o3.p0.g, o3.p0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.f44030c, iVar.f44030c) && Objects.equals(this.f44034g, iVar.f44034g);
            }
            return false;
        }

        @Override // o3.p0.l
        public o3.d f() {
            return o3.d.f(this.f44030c.getDisplayCutout());
        }

        @Override // o3.p0.l
        public int hashCode() {
            return this.f44030c.hashCode();
        }

        public i(p0 p0Var, i iVar) {
            super(p0Var, iVar);
        }
    }

    /* loaded from: classes.dex */
    public static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        public static final p0 f44039q = p0.x(WindowInsets.CONSUMED);

        public k(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var, windowInsets);
        }

        @Override // o3.p0.g, o3.p0.l
        public final void d(View view) {
        }

        @Override // o3.p0.g, o3.p0.l
        public f3.b g(int i10) {
            return f3.b.d(this.f44030c.getInsets(n.a(i10)));
        }

        @Override // o3.p0.g, o3.p0.l
        public f3.b h(int i10) {
            return f3.b.d(this.f44030c.getInsetsIgnoringVisibility(n.a(i10)));
        }

        @Override // o3.p0.g, o3.p0.l
        public boolean q(int i10) {
            return this.f44030c.isVisible(n.a(i10));
        }

        public k(p0 p0Var, k kVar) {
            super(p0Var, kVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b  reason: collision with root package name */
        public static final p0 f44040b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        public final p0 f44041a;

        public l(p0 p0Var) {
            this.f44041a = p0Var;
        }

        public p0 a() {
            return this.f44041a;
        }

        public p0 b() {
            return this.f44041a;
        }

        public p0 c() {
            return this.f44041a;
        }

        public void d(View view) {
        }

        public void e(p0 p0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return p() == lVar.p() && o() == lVar.o() && n3.c.a(l(), lVar.l()) && n3.c.a(j(), lVar.j()) && n3.c.a(f(), lVar.f());
            }
            return false;
        }

        public o3.d f() {
            return null;
        }

        public f3.b g(int i10) {
            return f3.b.f31712e;
        }

        public f3.b h(int i10) {
            if ((i10 & 8) == 0) {
                return f3.b.f31712e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return n3.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public f3.b i() {
            return l();
        }

        public f3.b j() {
            return f3.b.f31712e;
        }

        public f3.b k() {
            return l();
        }

        public f3.b l() {
            return f3.b.f31712e;
        }

        public f3.b m() {
            return l();
        }

        public p0 n(int i10, int i11, int i12, int i13) {
            return f44040b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i10) {
            return true;
        }

        public void r(f3.b[] bVarArr) {
        }

        public void s(f3.b bVar) {
        }

        public void t(p0 p0Var) {
        }

        public void u(f3.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            if (i10 != 16) {
                                if (i10 != 32) {
                                    if (i10 != 64) {
                                        if (i10 != 128) {
                                            if (i10 == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* loaded from: classes.dex */
    public static final class n {
        public static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f44009b = k.f44039q;
        } else {
            f44009b = l.f44040b;
        }
    }

    public p0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f44010a = new k(this, windowInsets);
        } else if (i10 >= 29) {
            this.f44010a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f44010a = new i(this, windowInsets);
        } else if (i10 >= 21) {
            this.f44010a = new h(this, windowInsets);
        } else if (i10 >= 20) {
            this.f44010a = new g(this, windowInsets);
        } else {
            this.f44010a = new l(this);
        }
    }

    public static f3.b o(f3.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f31713a - i10);
        int max2 = Math.max(0, bVar.f31714b - i11);
        int max3 = Math.max(0, bVar.f31715c - i12);
        int max4 = Math.max(0, bVar.f31716d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : f3.b.b(max, max2, max3, max4);
    }

    public static p0 x(WindowInsets windowInsets) {
        return y(windowInsets, null);
    }

    public static p0 y(WindowInsets windowInsets, View view) {
        p0 p0Var = new p0((WindowInsets) n3.h.g(windowInsets));
        if (view != null && c0.U(view)) {
            p0Var.u(c0.L(view));
            p0Var.d(view.getRootView());
        }
        return p0Var;
    }

    @Deprecated
    public p0 a() {
        return this.f44010a.a();
    }

    @Deprecated
    public p0 b() {
        return this.f44010a.b();
    }

    @Deprecated
    public p0 c() {
        return this.f44010a.c();
    }

    public void d(View view) {
        this.f44010a.d(view);
    }

    public o3.d e() {
        return this.f44010a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return n3.c.a(this.f44010a, ((p0) obj).f44010a);
        }
        return false;
    }

    public f3.b f(int i10) {
        return this.f44010a.g(i10);
    }

    public f3.b g(int i10) {
        return this.f44010a.h(i10);
    }

    @Deprecated
    public f3.b h() {
        return this.f44010a.i();
    }

    public int hashCode() {
        l lVar = this.f44010a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public f3.b i() {
        return this.f44010a.j();
    }

    @Deprecated
    public int j() {
        return this.f44010a.l().f31716d;
    }

    @Deprecated
    public int k() {
        return this.f44010a.l().f31713a;
    }

    @Deprecated
    public int l() {
        return this.f44010a.l().f31715c;
    }

    @Deprecated
    public int m() {
        return this.f44010a.l().f31714b;
    }

    public p0 n(int i10, int i11, int i12, int i13) {
        return this.f44010a.n(i10, i11, i12, i13);
    }

    public boolean p() {
        return this.f44010a.o();
    }

    public boolean q(int i10) {
        return this.f44010a.q(i10);
    }

    @Deprecated
    public p0 r(int i10, int i11, int i12, int i13) {
        return new b(this).d(f3.b.b(i10, i11, i12, i13)).a();
    }

    public void s(f3.b[] bVarArr) {
        this.f44010a.r(bVarArr);
    }

    public void t(f3.b bVar) {
        this.f44010a.s(bVar);
    }

    public void u(p0 p0Var) {
        this.f44010a.t(p0Var);
    }

    public void v(f3.b bVar) {
        this.f44010a.u(bVar);
    }

    public WindowInsets w() {
        l lVar = this.f44010a;
        if (lVar instanceof g) {
            return ((g) lVar).f44030c;
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public static Field f44016e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f44017f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor<WindowInsets> f44018g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f44019h = false;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsets f44020c;

        /* renamed from: d  reason: collision with root package name */
        public f3.b f44021d;

        public c() {
            this.f44020c = i();
        }

        private static WindowInsets i() {
            if (!f44017f) {
                try {
                    f44016e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f44017f = true;
            }
            Field field = f44016e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f44019h) {
                try {
                    f44018g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f44019h = true;
            }
            Constructor<WindowInsets> constructor = f44018g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // o3.p0.f
        public p0 b() {
            a();
            p0 x10 = p0.x(this.f44020c);
            x10.s(this.f44024b);
            x10.v(this.f44021d);
            return x10;
        }

        @Override // o3.p0.f
        public void e(f3.b bVar) {
            this.f44021d = bVar;
        }

        @Override // o3.p0.f
        public void g(f3.b bVar) {
            WindowInsets windowInsets = this.f44020c;
            if (windowInsets != null) {
                this.f44020c = windowInsets.replaceSystemWindowInsets(bVar.f31713a, bVar.f31714b, bVar.f31715c, bVar.f31716d);
            }
        }

        public c(p0 p0Var) {
            super(p0Var);
            this.f44020c = p0Var.w();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets.Builder f44022c;

        public d() {
            this.f44022c = new WindowInsets.Builder();
        }

        @Override // o3.p0.f
        public p0 b() {
            a();
            p0 x10 = p0.x(this.f44022c.build());
            x10.s(this.f44024b);
            return x10;
        }

        @Override // o3.p0.f
        public void d(f3.b bVar) {
            this.f44022c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // o3.p0.f
        public void e(f3.b bVar) {
            this.f44022c.setStableInsets(bVar.e());
        }

        @Override // o3.p0.f
        public void f(f3.b bVar) {
            this.f44022c.setSystemGestureInsets(bVar.e());
        }

        @Override // o3.p0.f
        public void g(f3.b bVar) {
            this.f44022c.setSystemWindowInsets(bVar.e());
        }

        @Override // o3.p0.f
        public void h(f3.b bVar) {
            this.f44022c.setTappableElementInsets(bVar.e());
        }

        public d(p0 p0Var) {
            super(p0Var);
            WindowInsets.Builder builder;
            WindowInsets w10 = p0Var.w();
            if (w10 != null) {
                builder = new WindowInsets.Builder(w10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f44022c = builder;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        public f3.b f44035m;

        public h(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var, windowInsets);
            this.f44035m = null;
        }

        @Override // o3.p0.l
        public p0 b() {
            return p0.x(this.f44030c.consumeStableInsets());
        }

        @Override // o3.p0.l
        public p0 c() {
            return p0.x(this.f44030c.consumeSystemWindowInsets());
        }

        @Override // o3.p0.l
        public final f3.b j() {
            if (this.f44035m == null) {
                this.f44035m = f3.b.b(this.f44030c.getStableInsetLeft(), this.f44030c.getStableInsetTop(), this.f44030c.getStableInsetRight(), this.f44030c.getStableInsetBottom());
            }
            return this.f44035m;
        }

        @Override // o3.p0.l
        public boolean o() {
            return this.f44030c.isConsumed();
        }

        @Override // o3.p0.l
        public void u(f3.b bVar) {
            this.f44035m = bVar;
        }

        public h(p0 p0Var, h hVar) {
            super(p0Var, hVar);
            this.f44035m = null;
            this.f44035m = hVar.f44035m;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f44025h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f44026i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f44027j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f44028k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f44029l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f44030c;

        /* renamed from: d  reason: collision with root package name */
        public f3.b[] f44031d;

        /* renamed from: e  reason: collision with root package name */
        public f3.b f44032e;

        /* renamed from: f  reason: collision with root package name */
        public p0 f44033f;

        /* renamed from: g  reason: collision with root package name */
        public f3.b f44034g;

        public g(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var);
            this.f44032e = null;
            this.f44030c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f44026i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f44027j = cls;
                f44028k = cls.getDeclaredField("mVisibleInsets");
                f44029l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f44028k.setAccessible(true);
                f44029l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f44025h = true;
        }

        @SuppressLint({"WrongConstant"})
        private f3.b v(int i10, boolean z10) {
            f3.b bVar = f3.b.f31712e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = f3.b.a(bVar, w(i11, z10));
                }
            }
            return bVar;
        }

        private f3.b x() {
            p0 p0Var = this.f44033f;
            if (p0Var != null) {
                return p0Var.i();
            }
            return f3.b.f31712e;
        }

        private f3.b y(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f44025h) {
                    A();
                }
                Method method = f44026i;
                if (method != null && f44027j != null && f44028k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f44028k.get(f44029l.get(invoke));
                        if (rect != null) {
                            return f3.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // o3.p0.l
        public void d(View view) {
            f3.b y10 = y(view);
            if (y10 == null) {
                y10 = f3.b.f31712e;
            }
            s(y10);
        }

        @Override // o3.p0.l
        public void e(p0 p0Var) {
            p0Var.u(this.f44033f);
            p0Var.t(this.f44034g);
        }

        @Override // o3.p0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f44034g, ((g) obj).f44034g);
            }
            return false;
        }

        @Override // o3.p0.l
        public f3.b g(int i10) {
            return v(i10, false);
        }

        @Override // o3.p0.l
        public f3.b h(int i10) {
            return v(i10, true);
        }

        @Override // o3.p0.l
        public final f3.b l() {
            if (this.f44032e == null) {
                this.f44032e = f3.b.b(this.f44030c.getSystemWindowInsetLeft(), this.f44030c.getSystemWindowInsetTop(), this.f44030c.getSystemWindowInsetRight(), this.f44030c.getSystemWindowInsetBottom());
            }
            return this.f44032e;
        }

        @Override // o3.p0.l
        public p0 n(int i10, int i11, int i12, int i13) {
            b bVar = new b(p0.x(this.f44030c));
            bVar.d(p0.o(l(), i10, i11, i12, i13));
            bVar.c(p0.o(j(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // o3.p0.l
        public boolean p() {
            return this.f44030c.isRound();
        }

        @Override // o3.p0.l
        @SuppressLint({"WrongConstant"})
        public boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // o3.p0.l
        public void r(f3.b[] bVarArr) {
            this.f44031d = bVarArr;
        }

        @Override // o3.p0.l
        public void s(f3.b bVar) {
            this.f44034g = bVar;
        }

        @Override // o3.p0.l
        public void t(p0 p0Var) {
            this.f44033f = p0Var;
        }

        public f3.b w(int i10, boolean z10) {
            f3.b i11;
            int i12;
            o3.d f10;
            if (i10 == 1) {
                if (z10) {
                    return f3.b.b(0, Math.max(x().f31714b, l().f31714b), 0, 0);
                }
                return f3.b.b(0, l().f31714b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    f3.b x10 = x();
                    f3.b j10 = j();
                    return f3.b.b(Math.max(x10.f31713a, j10.f31713a), 0, Math.max(x10.f31715c, j10.f31715c), Math.max(x10.f31716d, j10.f31716d));
                }
                f3.b l10 = l();
                p0 p0Var = this.f44033f;
                i11 = p0Var != null ? p0Var.i() : null;
                int i13 = l10.f31716d;
                if (i11 != null) {
                    i13 = Math.min(i13, i11.f31716d);
                }
                return f3.b.b(l10.f31713a, 0, l10.f31715c, i13);
            } else if (i10 != 8) {
                if (i10 != 16) {
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                return f3.b.f31712e;
                            }
                            p0 p0Var2 = this.f44033f;
                            if (p0Var2 != null) {
                                f10 = p0Var2.e();
                            } else {
                                f10 = f();
                            }
                            if (f10 != null) {
                                return f3.b.b(f10.b(), f10.d(), f10.c(), f10.a());
                            }
                            return f3.b.f31712e;
                        }
                        return m();
                    }
                    return i();
                }
                return k();
            } else {
                f3.b[] bVarArr = this.f44031d;
                i11 = bVarArr != null ? bVarArr[m.d(8)] : null;
                if (i11 != null) {
                    return i11;
                }
                f3.b l11 = l();
                f3.b x11 = x();
                int i14 = l11.f31716d;
                if (i14 > x11.f31716d) {
                    return f3.b.b(0, 0, 0, i14);
                }
                f3.b bVar = this.f44034g;
                if (bVar != null && !bVar.equals(f3.b.f31712e) && (i12 = this.f44034g.f31716d) > x11.f31716d) {
                    return f3.b.b(0, 0, 0, i12);
                }
                return f3.b.f31712e;
            }
        }

        public boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(f3.b.f31712e);
        }

        public g(p0 p0Var, g gVar) {
            this(p0Var, new WindowInsets(gVar.f44030c));
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        public f3.b f44036n;

        /* renamed from: o  reason: collision with root package name */
        public f3.b f44037o;

        /* renamed from: p  reason: collision with root package name */
        public f3.b f44038p;

        public j(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var, windowInsets);
            this.f44036n = null;
            this.f44037o = null;
            this.f44038p = null;
        }

        @Override // o3.p0.l
        public f3.b i() {
            if (this.f44037o == null) {
                this.f44037o = f3.b.d(this.f44030c.getMandatorySystemGestureInsets());
            }
            return this.f44037o;
        }

        @Override // o3.p0.l
        public f3.b k() {
            if (this.f44036n == null) {
                this.f44036n = f3.b.d(this.f44030c.getSystemGestureInsets());
            }
            return this.f44036n;
        }

        @Override // o3.p0.l
        public f3.b m() {
            if (this.f44038p == null) {
                this.f44038p = f3.b.d(this.f44030c.getTappableElementInsets());
            }
            return this.f44038p;
        }

        @Override // o3.p0.g, o3.p0.l
        public p0 n(int i10, int i11, int i12, int i13) {
            return p0.x(this.f44030c.inset(i10, i11, i12, i13));
        }

        @Override // o3.p0.h, o3.p0.l
        public void u(f3.b bVar) {
        }

        public j(p0 p0Var, j jVar) {
            super(p0Var, jVar);
            this.f44036n = null;
            this.f44037o = null;
            this.f44038p = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f44015a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f44015a = new e();
            } else if (i10 >= 29) {
                this.f44015a = new d();
            } else if (i10 >= 20) {
                this.f44015a = new c();
            } else {
                this.f44015a = new f();
            }
        }

        public p0 a() {
            return this.f44015a.b();
        }

        public b b(int i10, f3.b bVar) {
            this.f44015a.c(i10, bVar);
            return this;
        }

        @Deprecated
        public b c(f3.b bVar) {
            this.f44015a.e(bVar);
            return this;
        }

        @Deprecated
        public b d(f3.b bVar) {
            this.f44015a.g(bVar);
            return this;
        }

        public b(p0 p0Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f44015a = new e(p0Var);
            } else if (i10 >= 29) {
                this.f44015a = new d(p0Var);
            } else if (i10 >= 20) {
                this.f44015a = new c(p0Var);
            } else {
                this.f44015a = new f(p0Var);
            }
        }
    }

    public p0(p0 p0Var) {
        if (p0Var != null) {
            l lVar = p0Var.f44010a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f44010a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f44010a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f44010a = new i(this, (i) lVar);
            } else if (i10 >= 21 && (lVar instanceof h)) {
                this.f44010a = new h(this, (h) lVar);
            } else if (i10 >= 20 && (lVar instanceof g)) {
                this.f44010a = new g(this, (g) lVar);
            } else {
                this.f44010a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f44010a = new l(this);
    }
}
