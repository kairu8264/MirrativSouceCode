package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class h2 extends View implements s1.x {
    public static final c I = new c(null);
    public static final io.p<View, Matrix, wn.v> J = b.f14469w;
    public static final ViewOutlineProvider K = new a();
    public static Method L;
    public static Field M;
    public static boolean N;
    public static boolean O;
    public final l1 A;
    public boolean B;
    public Rect C;
    public boolean D;
    public boolean E;
    public final c1.x F;
    public final g1<View> G;
    public long H;

    /* renamed from: w  reason: collision with root package name */
    public final AndroidComposeView f14465w;

    /* renamed from: x  reason: collision with root package name */
    public final u0 f14466x;

    /* renamed from: y  reason: collision with root package name */
    public io.l<? super c1.w, wn.v> f14467y;

    /* renamed from: z  reason: collision with root package name */
    public io.a<wn.v> f14468z;

    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            jo.p.h(view, "view");
            jo.p.h(outline, "outline");
            Outline c10 = ((h2) view).A.c();
            jo.p.e(c10);
            outline.set(c10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<View, Matrix, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f14469w = new b();

        public b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            jo.p.h(view, "view");
            jo.p.h(matrix, "matrix");
            matrix.set(view.getMatrix());
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(View view, Matrix matrix) {
            a(view, matrix);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final boolean a() {
            return h2.N;
        }

        public final boolean b() {
            return h2.O;
        }

        public final void c(boolean z10) {
            h2.O = z10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            jo.p.h(view, "view");
            try {
                if (!a()) {
                    h2.N = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        h2.L = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        h2.M = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        h2.L = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        h2.M = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = h2.L;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = h2.M;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = h2.M;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = h2.L;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f14470a = new d();

        public static final long a(View view) {
            jo.p.h(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(AndroidComposeView androidComposeView, u0 u0Var, io.l<? super c1.w, wn.v> lVar, io.a<wn.v> aVar) {
        super(androidComposeView.getContext());
        jo.p.h(androidComposeView, "ownerView");
        jo.p.h(u0Var, TtmlNode.RUBY_CONTAINER);
        jo.p.h(lVar, "drawBlock");
        jo.p.h(aVar, "invalidateParentLayer");
        this.f14465w = androidComposeView;
        this.f14466x = u0Var;
        this.f14467y = lVar;
        this.f14468z = aVar;
        this.A = new l1(androidComposeView.getDensity());
        this.F = new c1.x();
        this.G = new g1<>(J);
        this.H = c1.n1.f18729b.a();
        setWillNotDraw(false);
        setId(View.generateViewId());
        u0Var.addView(this);
    }

    private final c1.u0 getManualClipPath() {
        if (!getClipToOutline() || this.A.d()) {
            return null;
        }
        return this.A.b();
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.D) {
            this.D = z10;
            this.f14465w.i0(this, z10);
        }
    }

    @Override // s1.x
    public void a(c1.w wVar) {
        jo.p.h(wVar, "canvas");
        boolean z10 = getElevation() > 0.0f;
        this.E = z10;
        if (z10) {
            wVar.l();
        }
        this.f14466x.a(wVar, this, getDrawingTime());
        if (this.E) {
            wVar.q();
        }
    }

    @Override // s1.x
    public long b(long j10, boolean z10) {
        if (z10) {
            float[] a10 = this.G.a(this);
            return a10 != null ? c1.o0.f(a10, j10) : b1.f.f16721b.a();
        }
        return c1.o0.f(this.G.b(this), j10);
    }

    @Override // s1.x
    public void c(long j10) {
        int g10 = m2.o.g(j10);
        int f10 = m2.o.f(j10);
        if (g10 == getWidth() && f10 == getHeight()) {
            return;
        }
        float f11 = g10;
        setPivotX(c1.n1.f(this.H) * f11);
        float f12 = f10;
        setPivotY(c1.n1.g(this.H) * f12);
        this.A.h(b1.m.a(f11, f12));
        u();
        layout(getLeft(), getTop(), getLeft() + g10, getTop() + f10);
        t();
        this.G.c();
    }

    @Override // s1.x
    public void d(io.l<? super c1.w, wn.v> lVar, io.a<wn.v> aVar) {
        jo.p.h(lVar, "drawBlock");
        jo.p.h(aVar, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT < 23 && !O) {
            setVisibility(0);
        } else {
            this.f14466x.addView(this);
        }
        this.B = false;
        this.E = false;
        this.H = c1.n1.f18729b.a();
        this.f14467y = lVar;
        this.f14468z = aVar;
    }

    @Override // s1.x
    public void destroy() {
        setInvalidated(false);
        this.f14465w.o0();
        this.f14467y = null;
        this.f14468z = null;
        boolean m02 = this.f14465w.m0(this);
        if (Build.VERSION.SDK_INT < 23 && !O && m02) {
            setVisibility(8);
        } else {
            this.f14466x.removeViewInLayout(this);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        jo.p.h(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        c1.x xVar = this.F;
        Canvas y10 = xVar.a().y();
        xVar.a().z(canvas);
        c1.b a10 = xVar.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z10 = true;
            a10.p();
            this.A.a(a10);
        }
        io.l<? super c1.w, wn.v> lVar = this.f14467y;
        if (lVar != null) {
            lVar.invoke(a10);
        }
        if (z10) {
            a10.k();
        }
        xVar.a().z(y10);
    }

    @Override // s1.x
    public boolean e(long j10) {
        float m10 = b1.f.m(j10);
        float n10 = b1.f.n(j10);
        if (this.B) {
            return 0.0f <= m10 && m10 < ((float) getWidth()) && 0.0f <= n10 && n10 < ((float) getHeight());
        } else if (getClipToOutline()) {
            return this.A.e(j10);
        } else {
            return true;
        }
    }

    @Override // s1.x
    public void f(b1.d dVar, boolean z10) {
        jo.p.h(dVar, "rect");
        if (z10) {
            float[] a10 = this.G.a(this);
            if (a10 != null) {
                c1.o0.g(a10, dVar);
                return;
            } else {
                dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        c1.o0.g(this.G.b(this), dVar);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // s1.x
    public void g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c1.g1 g1Var, boolean z10, c1.b1 b1Var, long j11, long j12, m2.q qVar, m2.d dVar) {
        io.a<wn.v> aVar;
        jo.p.h(g1Var, "shape");
        jo.p.h(qVar, "layoutDirection");
        jo.p.h(dVar, "density");
        this.H = j10;
        setScaleX(f10);
        setScaleY(f11);
        setAlpha(f12);
        setTranslationX(f13);
        setTranslationY(f14);
        setElevation(f15);
        setRotation(f18);
        setRotationX(f16);
        setRotationY(f17);
        setPivotX(c1.n1.f(this.H) * getWidth());
        setPivotY(c1.n1.g(this.H) * getHeight());
        setCameraDistancePx(f19);
        this.B = z10 && g1Var == c1.a1.a();
        t();
        boolean z11 = getManualClipPath() != null;
        setClipToOutline(z10 && g1Var != c1.a1.a());
        boolean g10 = this.A.g(g1Var, getAlpha(), getClipToOutline(), getElevation(), qVar, dVar);
        u();
        boolean z12 = getManualClipPath() != null;
        if (z11 != z12 || (z12 && g10)) {
            invalidate();
        }
        if (!this.E && getElevation() > 0.0f && (aVar = this.f14468z) != null) {
            aVar.invoke();
        }
        this.G.c();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            j2 j2Var = j2.f14488a;
            j2Var.a(this, c1.e0.i(j11));
            j2Var.b(this, c1.e0.i(j12));
        }
        if (i10 >= 31) {
            k2.f14493a.a(this, b1Var);
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final u0 getContainer() {
        return this.f14466x;
    }

    public long getLayerId() {
        return getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.f14465w;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.f14465w);
        }
        return -1L;
    }

    @Override // s1.x
    public void h(long j10) {
        int j11 = m2.k.j(j10);
        if (j11 != getLeft()) {
            offsetLeftAndRight(j11 - getLeft());
            this.G.c();
        }
        int k10 = m2.k.k(j10);
        if (k10 != getTop()) {
            offsetTopAndBottom(k10 - getTop());
            this.G.c();
        }
    }

    @Override // s1.x
    public void i() {
        if (!this.D || O) {
            return;
        }
        setInvalidated(false);
        I.d(this);
    }

    @Override // android.view.View, s1.x
    public void invalidate() {
        if (this.D) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f14465w.invalidate();
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final boolean s() {
        return this.D;
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    public final void t() {
        Rect rect;
        if (this.B) {
            Rect rect2 = this.C;
            if (rect2 == null) {
                this.C = new Rect(0, 0, getWidth(), getHeight());
            } else {
                jo.p.e(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.C;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void u() {
        setOutlineProvider(this.A.c() != null ? K : null);
    }
}
