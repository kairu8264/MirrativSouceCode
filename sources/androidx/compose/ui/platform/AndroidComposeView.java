package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.h2;
import b1.f;
import d2.k;
import d2.l;
import j1.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import l1.a;
import s1.k;
import s1.y;
import x0.f;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements s1.y, m2, n1.k0, androidx.lifecycle.h {
    public static final a N0 = new a(null);
    public static Class<?> O0;
    public static Method P0;
    public final w1.o A;
    public final j1.c A0;
    public final a1.h B;
    public final x1 B0;
    public final p2 C;
    public MotionEvent C0;
    public final l1.e D;
    public long D0;
    public final x0.f E;
    public final n2<s1.x> E0;
    public final c1.x F;
    public final m0.e<io.a<wn.v>> F0;
    public final s1.k G;
    public final i G0;
    public final s1.d0 H;
    public final Runnable H0;
    public final w1.s I;
    public boolean I0;
    public final t J;
    public final io.a<wn.v> J0;
    public final y0.i K;
    public final j0 K0;
    public final List<s1.x> L;
    public n1.r L0;
    public List<s1.x> M;
    public final n1.t M0;
    public boolean N;
    public final n1.h O;
    public final n1.a0 P;
    public io.l<? super Configuration, wn.v> Q;
    public final y0.a R;
    public boolean S;
    public final androidx.compose.ui.platform.l T;
    public final androidx.compose.ui.platform.k U;
    public final s1.a0 V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public h0 f14289a0;

    /* renamed from: b0  reason: collision with root package name */
    public u0 f14290b0;

    /* renamed from: c0  reason: collision with root package name */
    public m2.b f14291c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f14292d0;

    /* renamed from: e0  reason: collision with root package name */
    public final s1.r f14293e0;

    /* renamed from: f0  reason: collision with root package name */
    public final g2 f14294f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f14295g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int[] f14296h0;

    /* renamed from: i0  reason: collision with root package name */
    public final float[] f14297i0;

    /* renamed from: j0  reason: collision with root package name */
    public final float[] f14298j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f14299k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f14300l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f14301m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f14302n0;

    /* renamed from: o0  reason: collision with root package name */
    public final l0.s0 f14303o0;

    /* renamed from: p0  reason: collision with root package name */
    public io.l<? super b, wn.v> f14304p0;

    /* renamed from: q0  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f14305q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f14306r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ViewTreeObserver.OnTouchModeChangeListener f14307s0;

    /* renamed from: t0  reason: collision with root package name */
    public final e2.d0 f14308t0;

    /* renamed from: u0  reason: collision with root package name */
    public final e2.c0 f14309u0;

    /* renamed from: v0  reason: collision with root package name */
    public final k.a f14310v0;

    /* renamed from: w  reason: collision with root package name */
    public long f14311w;

    /* renamed from: w0  reason: collision with root package name */
    public final l0.s0 f14312w0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14313x;

    /* renamed from: x0  reason: collision with root package name */
    public int f14314x0;

    /* renamed from: y  reason: collision with root package name */
    public final s1.m f14315y;

    /* renamed from: y0  reason: collision with root package name */
    public final l0.s0 f14316y0;

    /* renamed from: z  reason: collision with root package name */
    public m2.d f14317z;

    /* renamed from: z0  reason: collision with root package name */
    public final i1.a f14318z0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        public final boolean b() {
            try {
                if (AndroidComposeView.O0 == null) {
                    AndroidComposeView.O0 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.O0;
                    AndroidComposeView.P0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.P0;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.lifecycle.u f14319a;

        /* renamed from: b  reason: collision with root package name */
        public final y4.e f14320b;

        public b(androidx.lifecycle.u uVar, y4.e eVar) {
            jo.p.h(uVar, "lifecycleOwner");
            jo.p.h(eVar, "savedStateRegistryOwner");
            this.f14319a = uVar;
            this.f14320b = eVar;
        }

        public final androidx.lifecycle.u a() {
            return this.f14319a;
        }

        public final y4.e b() {
            return this.f14320b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<j1.a, Boolean> {
        public c() {
            super(1);
        }

        public final Boolean a(int i10) {
            boolean requestFocusFromTouch;
            a.C0489a c0489a = j1.a.f37049b;
            if (j1.a.f(i10, c0489a.b())) {
                requestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else {
                requestFocusFromTouch = j1.a.f(i10, c0489a.a()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false;
            }
            return Boolean.valueOf(requestFocusFromTouch);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Boolean invoke(j1.a aVar) {
            return a(aVar.i());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends o3.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ s1.k f14322d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f14323e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f14324f;

        public d(s1.k kVar, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
            this.f14322d = kVar;
            this.f14323e = androidComposeView;
            this.f14324f = androidComposeView2;
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            jo.p.h(view, "host");
            jo.p.h(cVar, "info");
            super.g(view, cVar);
            w1.m j10 = w1.r.j(this.f14322d);
            jo.p.e(j10);
            w1.q m10 = new w1.q(j10, false).m();
            jo.p.e(m10);
            int i10 = m10.i();
            if (i10 == this.f14323e.getSemanticsOwner().a().i()) {
                i10 = -1;
            }
            cVar.w0(this.f14324f, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<Configuration, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f14325w = new e();

        public e() {
            super(1);
        }

        public final void a(Configuration configuration) {
            jo.p.h(configuration, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Configuration configuration) {
            a(configuration);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<l1.b, Boolean> {
        public f() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            jo.p.h(keyEvent, "it");
            a1.c U = AndroidComposeView.this.U(keyEvent);
            if (U != null && l1.c.e(l1.d.b(keyEvent), l1.c.f39491a.a())) {
                return Boolean.valueOf(AndroidComposeView.this.getFocusManager().a(U.o()));
            }
            return Boolean.FALSE;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Boolean invoke(l1.b bVar) {
            return a(bVar.f());
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements n1.t {
        public g() {
        }

        @Override // n1.t
        public void a(n1.r rVar) {
            jo.p.h(rVar, "value");
            AndroidComposeView.this.L0 = rVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<wn.v> {
        public h() {
            super(0);
        }

        public final void a() {
            MotionEvent motionEvent = AndroidComposeView.this.C0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.D0 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.G0);
                }
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.C0;
            if (motionEvent != null) {
                boolean z10 = false;
                boolean z11 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z11 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z10 = true;
                }
                if (z10) {
                    int i10 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.v0(motionEvent, i10, androidComposeView.D0, false);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.l<p1.b, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final j f14330w = new j();

        public j() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(p1.b bVar) {
            jo.p.h(bVar, "it");
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<w1.y, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final k f14331w = new k();

        public k() {
            super(1);
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$$receiver");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.l<io.a<? extends wn.v>, wn.v> {
        public l() {
            super(1);
        }

        public static final void c(io.a aVar) {
            jo.p.h(aVar, "$tmp0");
            aVar.invoke();
        }

        public final void b(final io.a<wn.v> aVar) {
            jo.p.h(aVar, "command");
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.l.c(io.a.this);
                    }
                });
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(io.a<? extends wn.v> aVar) {
            b(aVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        l0.s0 e10;
        l0.s0 e11;
        j0 k0Var;
        jo.p.h(context, "context");
        f.a aVar = b1.f.f16721b;
        this.f14311w = aVar.b();
        this.f14313x = true;
        this.f14315y = new s1.m(null, 1, null);
        this.f14317z = m2.a.a(context);
        w1.o oVar = new w1.o(w1.o.f57927y.a(), false, false, k.f14331w);
        this.A = oVar;
        a1.h hVar = new a1.h(null, 1, null);
        this.B = hVar;
        this.C = new p2();
        l1.e eVar = new l1.e(new f(), null);
        this.D = eVar;
        f.a aVar2 = x0.f.f59359u;
        x0.f c10 = p1.a.c(aVar2, j.f14330w);
        this.E = c10;
        this.F = new c1.x();
        s1.k kVar = new s1.k(false, 1, null);
        kVar.a(q1.u0.f48606b);
        kVar.k(aVar2.L(oVar).L(c10).L(hVar.g()).L(eVar));
        kVar.f(getDensity());
        this.G = kVar;
        this.H = this;
        this.I = new w1.s(getRoot());
        t tVar = new t(this);
        this.J = tVar;
        this.K = new y0.i();
        this.L = new ArrayList();
        this.O = new n1.h();
        this.P = new n1.a0(getRoot());
        this.Q = e.f14325w;
        this.R = O() ? new y0.a(this, getAutofillTree()) : null;
        this.T = new androidx.compose.ui.platform.l(context);
        this.U = new androidx.compose.ui.platform.k(context);
        this.V = new s1.a0(new l());
        this.f14293e0 = new s1.r(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        jo.p.g(viewConfiguration, "get(context)");
        this.f14294f0 = new g0(viewConfiguration);
        this.f14295g0 = m2.k.f40528b.a();
        this.f14296h0 = new int[]{0, 0};
        this.f14297i0 = c1.o0.c(null, 1, null);
        this.f14298j0 = c1.o0.c(null, 1, null);
        this.f14299k0 = -1L;
        this.f14301m0 = aVar.a();
        this.f14302n0 = true;
        e10 = l0.z1.e(null, null, 2, null);
        this.f14303o0 = e10;
        this.f14305q0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.W(AndroidComposeView.this);
            }
        };
        this.f14306r0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.r0(AndroidComposeView.this);
            }
        };
        this.f14307s0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                AndroidComposeView.x0(AndroidComposeView.this, z10);
            }
        };
        e2.d0 d0Var = new e2.d0(this);
        this.f14308t0 = d0Var;
        this.f14309u0 = y.e().invoke(d0Var);
        this.f14310v0 = new a0(context);
        this.f14312w0 = l0.u1.f(d2.o.a(context), l0.u1.k());
        Configuration configuration = context.getResources().getConfiguration();
        jo.p.g(configuration, "context.resources.configuration");
        this.f14314x0 = V(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        jo.p.g(configuration2, "context.resources.configuration");
        e11 = l0.z1.e(y.d(configuration2), null, 2, null);
        this.f14316y0 = e11;
        this.f14318z0 = new i1.c(this);
        this.A0 = new j1.c(isInTouchMode() ? j1.a.f37049b.b() : j1.a.f37049b.a(), new c(), null);
        this.B0 = new b0(this);
        this.E0 = new n2<>();
        this.F0 = new m0.e<>(new io.a[16], 0);
        this.G0 = new i();
        this.H0 = new Runnable() { // from class: androidx.compose.ui.platform.q
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.s0(AndroidComposeView.this);
            }
        };
        this.J0 = new h();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            k0Var = new l0();
        } else {
            k0Var = new k0();
        }
        this.K0 = k0Var;
        setWillNotDraw(false);
        setFocusable(true);
        if (i10 >= 26) {
            x.f14679a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        o3.c0.r0(this, tVar);
        io.l<m2, wn.v> a10 = m2.f14526c.a();
        if (a10 != null) {
            a10.invoke(this);
        }
        getRoot().I(this);
        if (i10 >= 29) {
            v.f14669a.a(this);
        }
        this.M0 = new g();
    }

    public static final void W(AndroidComposeView androidComposeView) {
        jo.p.h(androidComposeView, "this$0");
        androidComposeView.y0();
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void q0(AndroidComposeView androidComposeView, s1.k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = null;
        }
        androidComposeView.p0(kVar);
    }

    public static final void r0(AndroidComposeView androidComposeView) {
        jo.p.h(androidComposeView, "this$0");
        androidComposeView.y0();
    }

    public static final void s0(AndroidComposeView androidComposeView) {
        jo.p.h(androidComposeView, "this$0");
        androidComposeView.I0 = false;
        MotionEvent motionEvent = androidComposeView.C0;
        jo.p.e(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.u0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    private void setFontFamilyResolver(l.b bVar) {
        this.f14312w0.setValue(bVar);
    }

    private void setLayoutDirection(m2.q qVar) {
        this.f14316y0.setValue(qVar);
    }

    private final void setViewTreeOwners(b bVar) {
        this.f14303o0.setValue(bVar);
    }

    public static /* synthetic */ void w0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        androidComposeView.v0(motionEvent, i10, j10, z10);
    }

    public static final void x0(AndroidComposeView androidComposeView, boolean z10) {
        jo.p.h(androidComposeView, "this$0");
        androidComposeView.A0.b(z10 ? j1.a.f37049b.b() : j1.a.f37049b.a());
        androidComposeView.B.d();
    }

    public final void N(o2.a aVar, s1.k kVar) {
        jo.p.h(aVar, "view");
        jo.p.h(kVar, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(aVar, kVar);
        getAndroidViewsHandler$ui_release().addView(aVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(kVar, aVar);
        o3.c0.C0(aVar, 1);
        o3.c0.r0(aVar, new d(kVar, this, this));
    }

    public final boolean O() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final Object P(ao.d<? super wn.v> dVar) {
        Object x10 = this.J.x(dVar);
        return x10 == bo.c.c() ? x10 : wn.v.f59242a;
    }

    public final void Q(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).v();
            } else if (childAt instanceof ViewGroup) {
                Q((ViewGroup) childAt);
            }
        }
    }

    public final wn.k<Integer, Integer> R(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return wn.q.a(Integer.valueOf(size), Integer.valueOf(size));
                }
                throw new IllegalStateException();
            }
            return wn.q.a(0, Integer.MAX_VALUE);
        }
        return wn.q.a(0, Integer.valueOf(size));
    }

    public final void S(o2.a aVar, Canvas canvas) {
        jo.p.h(aVar, "view");
        jo.p.h(canvas, "canvas");
        getAndroidViewsHandler$ui_release().a(aVar, canvas);
    }

    public final View T(int i10, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (jo.p.c(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    jo.p.g(childAt, "currentView.getChildAt(i)");
                    View T = T(i10, childAt);
                    if (T != null) {
                        return T;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public a1.c U(KeyEvent keyEvent) {
        jo.p.h(keyEvent, "keyEvent");
        long a10 = l1.d.a(keyEvent);
        a.C0560a c0560a = l1.a.f39334a;
        if (l1.a.l(a10, c0560a.j())) {
            return a1.c.i(l1.d.e(keyEvent) ? a1.c.f288b.f() : a1.c.f288b.d());
        } else if (l1.a.l(a10, c0560a.e())) {
            return a1.c.i(a1.c.f288b.g());
        } else {
            if (l1.a.l(a10, c0560a.d())) {
                return a1.c.i(a1.c.f288b.c());
            }
            if (l1.a.l(a10, c0560a.f())) {
                return a1.c.i(a1.c.f288b.h());
            }
            if (l1.a.l(a10, c0560a.c())) {
                return a1.c.i(a1.c.f288b.a());
            }
            if (l1.a.l(a10, c0560a.b()) ? true : l1.a.l(a10, c0560a.g()) ? true : l1.a.l(a10, c0560a.i())) {
                return a1.c.i(a1.c.f288b.b());
            }
            if (l1.a.l(a10, c0560a.a()) ? true : l1.a.l(a10, c0560a.h())) {
                return a1.c.i(a1.c.f288b.e());
            }
            return null;
        }
    }

    public final int V(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public final int X(MotionEvent motionEvent) {
        removeCallbacks(this.G0);
        try {
            k0(motionEvent);
            boolean z10 = true;
            this.f14300l0 = true;
            a(false);
            this.L0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.C0;
            boolean z11 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && Z(motionEvent, motionEvent2)) {
                if (e0(motionEvent2)) {
                    this.P.b();
                } else if (motionEvent2.getActionMasked() != 10 && z11) {
                    w0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z10 = false;
            }
            if (!z11 && z10 && actionMasked != 3 && actionMasked != 9 && f0(motionEvent)) {
                w0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.C0 = MotionEvent.obtainNoHistory(motionEvent);
            int u02 = u0(motionEvent);
            Trace.endSection();
            if (Build.VERSION.SDK_INT >= 24) {
                w.f14671a.a(this, this.L0);
            }
            return u02;
        } finally {
            this.f14300l0 = false;
        }
    }

    public final boolean Y(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        p1.b bVar = new p1.b(o3.e0.d(viewConfiguration, getContext()) * f10, f10 * o3.e0.b(viewConfiguration, getContext()), motionEvent.getEventTime());
        a1.j e10 = this.B.e();
        if (e10 != null) {
            return e10.v(bVar);
        }
        return false;
    }

    public final boolean Z(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    @Override // s1.y
    public void a(boolean z10) {
        io.a<wn.v> aVar;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z10) {
            try {
                aVar = this.J0;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            aVar = null;
        }
        if (this.f14293e0.k(aVar)) {
            requestLayout();
        }
        s1.r.e(this.f14293e0, false, 1, null);
        wn.v vVar = wn.v.f59242a;
        Trace.endSection();
    }

    public void a0() {
        b0(getRoot());
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        y0.a aVar;
        jo.p.h(sparseArray, "values");
        if (!O() || (aVar = this.R) == null) {
            return;
        }
        y0.c.a(aVar, sparseArray);
    }

    public final void b0(s1.k kVar) {
        kVar.J0();
        m0.e<s1.k> A0 = kVar.A0();
        int p10 = A0.p();
        if (p10 > 0) {
            int i10 = 0;
            s1.k[] n10 = A0.n();
            do {
                b0(n10[i10]);
                i10++;
            } while (i10 < p10);
        }
    }

    @Override // androidx.lifecycle.h, androidx.lifecycle.m
    public void c(androidx.lifecycle.u uVar) {
        jo.p.h(uVar, "owner");
        setShowLayoutBounds(N0.b());
    }

    public final void c0(s1.k kVar) {
        int i10 = 0;
        s1.r.s(this.f14293e0, kVar, false, 2, null);
        m0.e<s1.k> A0 = kVar.A0();
        int p10 = A0.p();
        if (p10 > 0) {
            s1.k[] n10 = A0.n();
            do {
                c0(n10[i10]);
                i10++;
            } while (i10 < p10);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.J.y(false, i10, this.f14311w);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.J.y(true, i10, this.f14311w);
    }

    public final boolean d0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if ((Float.isInfinite(x10) || Float.isNaN(x10)) ? false : true) {
            float y10 = motionEvent.getY();
            if ((Float.isInfinite(y10) || Float.isNaN(y10)) ? false : true) {
                float rawX = motionEvent.getRawX();
                if ((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true) {
                    float rawY = motionEvent.getRawY();
                    return !(!Float.isInfinite(rawY) && !Float.isNaN(rawY));
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        jo.p.h(canvas, "canvas");
        if (!isAttachedToWindow()) {
            b0(getRoot());
        }
        s1.y.u(this, false, 1, null);
        this.N = true;
        c1.x xVar = this.F;
        Canvas y10 = xVar.a().y();
        xVar.a().z(canvas);
        getRoot().S(xVar.a());
        xVar.a().z(y10);
        if (!this.L.isEmpty()) {
            int size = this.L.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.L.get(i10).i();
            }
        }
        if (h2.I.b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.L.clear();
        this.N = false;
        List<s1.x> list = this.M;
        if (list != null) {
            jo.p.e(list);
            this.L.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        jo.p.h(motionEvent, "event");
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return Y(motionEvent);
            }
            if (!d0(motionEvent) && isAttachedToWindow()) {
                return n1.l0.c(X(motionEvent));
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        jo.p.h(motionEvent, "event");
        if (this.I0) {
            removeCallbacks(this.H0);
            this.H0.run();
        }
        if (d0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.isFromSource(4098) && motionEvent.getToolType(0) == 1) {
            return this.J.F(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && f0(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.C0;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.C0 = MotionEvent.obtainNoHistory(motionEvent);
                    this.I0 = true;
                    post(this.H0);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!g0(motionEvent)) {
            return false;
        }
        return n1.l0.c(X(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jo.p.h(keyEvent, "event");
        if (isFocused()) {
            return t0(l1.b.b(keyEvent));
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        jo.p.h(motionEvent, "motionEvent");
        if (this.I0) {
            removeCallbacks(this.H0);
            MotionEvent motionEvent2 = this.C0;
            jo.p.e(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !Z(motionEvent, motionEvent2)) {
                this.I0 = false;
            } else {
                this.H0.run();
            }
        }
        if (d0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() != 2 || g0(motionEvent)) {
            int X = X(motionEvent);
            if (n1.l0.b(X)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return n1.l0.c(X);
        }
        return false;
    }

    @Override // s1.y
    public void e(s1.k kVar, boolean z10) {
        jo.p.h(kVar, "layoutNode");
        if (this.f14293e0.p(kVar, z10)) {
            q0(this, null, 1, null);
        }
    }

    public final boolean e0(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    public final boolean f0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x10 && x10 <= ((float) getWidth())) {
            if (0.0f <= y10 && y10 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i10));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = T(i10, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    public final boolean g0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.C0) != null) {
            if (motionEvent.getRawX() == motionEvent2.getRawX()) {
                return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
            }
            return true;
        }
        return true;
    }

    public final h0 getAndroidViewsHandler$ui_release() {
        if (this.f14289a0 == null) {
            Context context = getContext();
            jo.p.g(context, "context");
            h0 h0Var = new h0(context);
            this.f14289a0 = h0Var;
            addView(h0Var);
        }
        h0 h0Var2 = this.f14289a0;
        jo.p.e(h0Var2);
        return h0Var2;
    }

    @Override // s1.y
    public y0.d getAutofill() {
        return this.R;
    }

    @Override // s1.y
    public y0.i getAutofillTree() {
        return this.K;
    }

    public final io.l<Configuration, wn.v> getConfigurationChangeObserver() {
        return this.Q;
    }

    @Override // s1.y
    public m2.d getDensity() {
        return this.f14317z;
    }

    @Override // s1.y
    public a1.g getFocusManager() {
        return this.B;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        wn.v vVar;
        b1.h e10;
        jo.p.h(rect, "rect");
        a1.j e11 = this.B.e();
        if (e11 == null || (e10 = a1.a0.e(e11)) == null) {
            vVar = null;
        } else {
            rect.left = lo.c.c(e10.i());
            rect.top = lo.c.c(e10.l());
            rect.right = lo.c.c(e10.j());
            rect.bottom = lo.c.c(e10.e());
            vVar = wn.v.f59242a;
        }
        if (vVar == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // s1.y
    public l.b getFontFamilyResolver() {
        return (l.b) this.f14312w0.getValue();
    }

    @Override // s1.y
    public k.a getFontLoader() {
        return this.f14310v0;
    }

    @Override // s1.y
    public i1.a getHapticFeedBack() {
        return this.f14318z0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f14293e0.i();
    }

    @Override // s1.y
    public j1.b getInputModeManager() {
        return this.A0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f14299k0;
    }

    @Override // android.view.View, android.view.ViewParent, s1.y
    public m2.q getLayoutDirection() {
        return (m2.q) this.f14316y0.getValue();
    }

    public long getMeasureIteration() {
        return this.f14293e0.j();
    }

    @Override // s1.y
    public n1.t getPointerIconService() {
        return this.M0;
    }

    public s1.k getRoot() {
        return this.G;
    }

    public s1.d0 getRootForTest() {
        return this.H;
    }

    public w1.s getSemanticsOwner() {
        return this.I;
    }

    @Override // s1.y
    public s1.m getSharedDrawScope() {
        return this.f14315y;
    }

    @Override // s1.y
    public boolean getShowLayoutBounds() {
        return this.W;
    }

    @Override // s1.y
    public s1.a0 getSnapshotObserver() {
        return this.V;
    }

    @Override // s1.y
    public e2.c0 getTextInputService() {
        return this.f14309u0;
    }

    @Override // s1.y
    public x1 getTextToolbar() {
        return this.B0;
    }

    public View getView() {
        return this;
    }

    @Override // s1.y
    public g2 getViewConfiguration() {
        return this.f14294f0;
    }

    public final b getViewTreeOwners() {
        return (b) this.f14303o0.getValue();
    }

    @Override // s1.y
    public o2 getWindowInfo() {
        return this.C;
    }

    public final Object h0(ao.d<? super wn.v> dVar) {
        Object o10 = this.f14308t0.o(dVar);
        return o10 == bo.c.c() ? o10 : wn.v.f59242a;
    }

    public final void i0(s1.x xVar, boolean z10) {
        jo.p.h(xVar, "layer");
        if (!z10) {
            if (!this.N && !this.L.remove(xVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.N) {
            this.L.add(xVar);
        } else {
            List list = this.M;
            if (list == null) {
                list = new ArrayList();
                this.M = list;
            }
            list.add(xVar);
        }
    }

    @Override // s1.y
    public long j(long j10) {
        j0();
        return c1.o0.f(this.f14297i0, j10);
    }

    public final void j0() {
        if (this.f14300l0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f14299k0) {
            this.f14299k0 = currentAnimationTimeMillis;
            l0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f14296h0);
            int[] iArr = this.f14296h0;
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f14296h0;
            this.f14301m0 = b1.g.a(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
    }

    @Override // s1.y
    public void k(s1.k kVar) {
        jo.p.h(kVar, "node");
    }

    public final void k0(MotionEvent motionEvent) {
        this.f14299k0 = AnimationUtils.currentAnimationTimeMillis();
        l0();
        long f10 = c1.o0.f(this.f14297i0, b1.g.a(motionEvent.getX(), motionEvent.getY()));
        this.f14301m0 = b1.g.a(motionEvent.getRawX() - b1.f.m(f10), motionEvent.getRawY() - b1.f.n(f10));
    }

    @Override // s1.y
    public void l(io.a<wn.v> aVar) {
        jo.p.h(aVar, "listener");
        if (this.F0.j(aVar)) {
            return;
        }
        this.F0.c(aVar);
    }

    public final void l0() {
        this.K0.a(this, this.f14297i0);
        e1.a(this.f14297i0, this.f14298j0);
    }

    @Override // s1.y
    public void m(s1.k kVar, boolean z10) {
        jo.p.h(kVar, "layoutNode");
        if (this.f14293e0.r(kVar, z10)) {
            p0(kVar);
        }
    }

    public final boolean m0(s1.x xVar) {
        jo.p.h(xVar, "layer");
        boolean z10 = this.f14290b0 == null || h2.I.b() || Build.VERSION.SDK_INT >= 23 || this.E0.b() < 10;
        if (z10) {
            this.E0.d(xVar);
        }
        return z10;
    }

    @Override // s1.y
    public void n(s1.k kVar) {
        jo.p.h(kVar, "node");
        this.f14293e0.m(kVar);
        o0();
    }

    public final void n0(o2.a aVar) {
        jo.p.h(aVar, "view");
        getAndroidViewsHandler$ui_release().removeView(aVar);
        HashMap<s1.k, o2.a> layoutNodeToHolder = getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        jo.j0.d(layoutNodeToHolder).remove(getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(aVar));
        o3.c0.C0(aVar, 0);
    }

    @Override // n1.k0
    public long o(long j10) {
        j0();
        return c1.o0.f(this.f14298j0, b1.g.a(b1.f.m(j10) - b1.f.m(this.f14301m0), b1.f.n(j10) - b1.f.n(this.f14301m0)));
    }

    public final void o0() {
        this.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        androidx.lifecycle.u a10;
        androidx.lifecycle.o g10;
        y0.a aVar;
        super.onAttachedToWindow();
        c0(getRoot());
        b0(getRoot());
        getSnapshotObserver().f();
        if (O() && (aVar = this.R) != null) {
            y0.g.f61038a.a(aVar);
        }
        androidx.lifecycle.u a11 = androidx.lifecycle.w0.a(this);
        y4.e a12 = y4.f.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(a11 == null || a12 == null || (a11 == viewTreeOwners.a() && a12 == viewTreeOwners.a()))) {
            if (a11 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a12 != null) {
                if (viewTreeOwners != null && (a10 = viewTreeOwners.a()) != null && (g10 = a10.g()) != null) {
                    g10.c(this);
                }
                a11.g().a(this);
                b bVar = new b(a11, a12);
                setViewTreeOwners(bVar);
                io.l<? super b, wn.v> lVar = this.f14304p0;
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                this.f14304p0 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        b viewTreeOwners2 = getViewTreeOwners();
        jo.p.e(viewTreeOwners2);
        viewTreeOwners2.a().g().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f14305q0);
        getViewTreeObserver().addOnScrollChangedListener(this.f14306r0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f14307s0);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.f14308t0.l();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        jo.p.g(context, "context");
        this.f14317z = m2.a.a(context);
        if (V(configuration) != this.f14314x0) {
            this.f14314x0 = V(configuration);
            Context context2 = getContext();
            jo.p.g(context2, "context");
            setFontFamilyResolver(d2.o.a(context2));
        }
        this.Q.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        jo.p.h(editorInfo, "outAttrs");
        return this.f14308t0.i(editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        y0.a aVar;
        androidx.lifecycle.u a10;
        androidx.lifecycle.o g10;
        super.onDetachedFromWindow();
        getSnapshotObserver().g();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a10 = viewTreeOwners.a()) != null && (g10 = a10.g()) != null) {
            g10.c(this);
        }
        if (O() && (aVar = this.R) != null) {
            y0.g.f61038a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f14305q0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f14306r0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f14307s0);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        jo.p.h(canvas, "canvas");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        a1.h hVar = this.B;
        if (z10) {
            hVar.j();
        } else {
            hVar.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f14291c0 = null;
        y0();
        if (this.f14289a0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                c0(getRoot());
            }
            wn.k<Integer, Integer> R = R(i10);
            int intValue = R.a().intValue();
            int intValue2 = R.b().intValue();
            wn.k<Integer, Integer> R2 = R(i11);
            long a10 = m2.c.a(intValue, intValue2, R2.a().intValue(), R2.b().intValue());
            m2.b bVar = this.f14291c0;
            boolean z10 = false;
            if (bVar == null) {
                this.f14291c0 = m2.b.b(a10);
                this.f14292d0 = false;
            } else {
                if (bVar != null) {
                    z10 = m2.b.g(bVar.t(), a10);
                }
                if (!z10) {
                    this.f14292d0 = true;
                }
            }
            this.f14293e0.t(a10);
            this.f14293e0.k(this.J0);
            setMeasuredDimension(getRoot().y0(), getRoot().a0());
            if (this.f14289a0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().y0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().a0(), 1073741824));
            }
            wn.v vVar = wn.v.f59242a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        y0.a aVar;
        if (!O() || viewStructure == null || (aVar = this.R) == null) {
            return;
        }
        y0.c.b(aVar, viewStructure);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        m2.q f10;
        if (this.f14313x) {
            f10 = y.f(i10);
            setLayoutDirection(f10);
            this.B.i(f10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean b10;
        this.C.a(z10);
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (b10 = N0.b())) {
            return;
        }
        setShowLayoutBounds(b10);
        a0();
    }

    @Override // s1.y
    public void p(y.b bVar) {
        jo.p.h(bVar, "listener");
        this.f14293e0.n(bVar);
        q0(this, null, 1, null);
    }

    public final void p0(s1.k kVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.f14292d0 && kVar != null) {
            while (kVar != null && kVar.l0() == k.i.InMeasureBlock) {
                kVar = kVar.u0();
            }
            if (kVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() != 0 && getHeight() != 0) {
            invalidate();
        } else {
            requestLayout();
        }
    }

    @Override // s1.y
    public void q(s1.k kVar, long j10) {
        jo.p.h(kVar, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f14293e0.l(kVar, j10);
            s1.r.e(this.f14293e0, false, 1, null);
            wn.v vVar = wn.v.f59242a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // s1.y
    public void r(s1.k kVar) {
        jo.p.h(kVar, "layoutNode");
        this.J.R(kVar);
    }

    @Override // s1.y
    public long s(long j10) {
        j0();
        return c1.o0.f(this.f14298j0, j10);
    }

    public final void setConfigurationChangeObserver(io.l<? super Configuration, wn.v> lVar) {
        jo.p.h(lVar, "<set-?>");
        this.Q = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f14299k0 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(io.l<? super b, wn.v> lVar) {
        jo.p.h(lVar, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f14304p0 = lVar;
    }

    @Override // s1.y
    public void setShowLayoutBounds(boolean z10) {
        this.W = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // n1.k0
    public long t(long j10) {
        j0();
        long f10 = c1.o0.f(this.f14297i0, j10);
        return b1.g.a(b1.f.m(f10) + b1.f.m(this.f14301m0), b1.f.n(f10) + b1.f.n(this.f14301m0));
    }

    public boolean t0(KeyEvent keyEvent) {
        jo.p.h(keyEvent, "keyEvent");
        return this.D.f(keyEvent);
    }

    public final int u0(MotionEvent motionEvent) {
        n1.z zVar;
        n1.y c10 = this.O.c(motionEvent, this);
        if (c10 != null) {
            List<n1.z> b10 = c10.b();
            ListIterator<n1.z> listIterator = b10.listIterator(b10.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    zVar = null;
                    break;
                }
                zVar = listIterator.previous();
                if (zVar.a()) {
                    break;
                }
            }
            n1.z zVar2 = zVar;
            if (zVar2 != null) {
                this.f14311w = zVar2.e();
            }
            int a10 = this.P.a(c10, this, f0(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !n1.l0.c(a10)) {
                this.O.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return a10;
            }
            return a10;
        }
        this.P.b();
        return n1.b0.a(false, false);
    }

    @Override // s1.y
    public void v() {
        if (this.S) {
            getSnapshotObserver().a();
            this.S = false;
        }
        h0 h0Var = this.f14289a0;
        if (h0Var != null) {
            Q(h0Var);
        }
        while (this.F0.s()) {
            int p10 = this.F0.p();
            for (int i10 = 0; i10 < p10; i10++) {
                io.a<wn.v> aVar = this.F0.n()[i10];
                this.F0.B(i10, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.F0.z(0, p10);
        }
    }

    public final void v0(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int i11 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i11 = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            i11 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i11 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerPropertiesArr[i12] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerCoordsArr[i13] = new MotionEvent.PointerCoords();
        }
        int i14 = 0;
        while (i14 < pointerCount) {
            int i15 = ((i11 < 0 || i14 < i11) ? 0 : 1) + i14;
            motionEvent.getPointerProperties(i15, pointerPropertiesArr[i14]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i14];
            motionEvent.getPointerCoords(i15, pointerCoords);
            long t10 = t(b1.g.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = b1.f.m(t10);
            pointerCoords.y = b1.f.n(t10);
            i14++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        n1.h hVar = this.O;
        jo.p.g(obtain, "event");
        n1.y c10 = hVar.c(obtain, this);
        jo.p.e(c10);
        this.P.a(c10, this, true);
        obtain.recycle();
    }

    @Override // s1.y
    public void w() {
        this.J.S();
    }

    @Override // s1.y
    public s1.x x(io.l<? super c1.w, wn.v> lVar, io.a<wn.v> aVar) {
        u0 i2Var;
        jo.p.h(lVar, "drawBlock");
        jo.p.h(aVar, "invalidateParentLayer");
        s1.x c10 = this.E0.c();
        if (c10 != null) {
            c10.d(lVar, aVar);
            return c10;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.f14302n0) {
            try {
                return new p1(this, lVar, aVar);
            } catch (Throwable unused) {
                this.f14302n0 = false;
            }
        }
        if (this.f14290b0 == null) {
            h2.c cVar = h2.I;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            if (cVar.b()) {
                Context context = getContext();
                jo.p.g(context, "context");
                i2Var = new u0(context);
            } else {
                Context context2 = getContext();
                jo.p.g(context2, "context");
                i2Var = new i2(context2);
            }
            this.f14290b0 = i2Var;
            addView(i2Var);
        }
        u0 u0Var = this.f14290b0;
        jo.p.e(u0Var);
        return new h2(this, u0Var, lVar, aVar);
    }

    @Override // s1.y
    public void y(s1.k kVar) {
        jo.p.h(kVar, "layoutNode");
        this.f14293e0.g(kVar);
    }

    public final void y0() {
        getLocationOnScreen(this.f14296h0);
        boolean z10 = false;
        if (m2.k.j(this.f14295g0) != this.f14296h0[0] || m2.k.k(this.f14295g0) != this.f14296h0[1]) {
            int[] iArr = this.f14296h0;
            this.f14295g0 = m2.l.a(iArr[0], iArr[1]);
            z10 = true;
        }
        this.f14293e0.d(z10);
    }

    @Override // s1.y
    public androidx.compose.ui.platform.k getAccessibilityManager() {
        return this.U;
    }

    @Override // s1.y
    public androidx.compose.ui.platform.l getClipboardManager() {
        return this.T;
    }
}
