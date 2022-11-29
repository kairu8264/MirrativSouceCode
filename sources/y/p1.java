package y;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import o3.p0;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: v  reason: collision with root package name */
    public static final a f60881v = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public static final WeakHashMap<View, p1> f60882w = new WeakHashMap<>();

    /* renamed from: x  reason: collision with root package name */
    public static boolean f60883x;

    /* renamed from: a  reason: collision with root package name */
    public final e f60884a;

    /* renamed from: b  reason: collision with root package name */
    public final e f60885b;

    /* renamed from: c  reason: collision with root package name */
    public final e f60886c;

    /* renamed from: d  reason: collision with root package name */
    public final e f60887d;

    /* renamed from: e  reason: collision with root package name */
    public final e f60888e;

    /* renamed from: f  reason: collision with root package name */
    public final e f60889f;

    /* renamed from: g  reason: collision with root package name */
    public final e f60890g;

    /* renamed from: h  reason: collision with root package name */
    public final e f60891h;

    /* renamed from: i  reason: collision with root package name */
    public final e f60892i;

    /* renamed from: j  reason: collision with root package name */
    public final l1 f60893j;

    /* renamed from: k  reason: collision with root package name */
    public final n1 f60894k;

    /* renamed from: l  reason: collision with root package name */
    public final n1 f60895l;

    /* renamed from: m  reason: collision with root package name */
    public final n1 f60896m;

    /* renamed from: n  reason: collision with root package name */
    public final l1 f60897n;

    /* renamed from: o  reason: collision with root package name */
    public final l1 f60898o;

    /* renamed from: p  reason: collision with root package name */
    public final l1 f60899p;

    /* renamed from: q  reason: collision with root package name */
    public final l1 f60900q;

    /* renamed from: r  reason: collision with root package name */
    public final l1 f60901r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f60902s;

    /* renamed from: t  reason: collision with root package name */
    public int f60903t;

    /* renamed from: u  reason: collision with root package name */
    public final z f60904u;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: y.p1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1032a extends jo.q implements io.l<l0.a0, l0.z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p1 f60905w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ View f60906x;

            /* renamed from: y.p1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1033a implements l0.z {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ p1 f60907a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ View f60908b;

                public C1033a(p1 p1Var, View view) {
                    this.f60907a = p1Var;
                    this.f60908b = view;
                }

                @Override // l0.z
                public void dispose() {
                    this.f60907a.b(this.f60908b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1032a(p1 p1Var, View view) {
                super(1);
                this.f60905w = p1Var;
                this.f60906x = view;
            }

            @Override // io.l
            /* renamed from: a */
            public final l0.z invoke(l0.a0 a0Var) {
                jo.p.h(a0Var, "$this$DisposableEffect");
                this.f60905w.f(this.f60906x);
                return new C1033a(this.f60905w, this.f60906x);
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p1 c(l0.i iVar, int i10) {
            iVar.x(-1366542614);
            View view = (View) iVar.G(androidx.compose.ui.platform.z.k());
            p1 d10 = d(view);
            l0.c0.a(d10, new C1032a(d10, view), iVar, 8);
            iVar.O();
            return d10;
        }

        public final p1 d(View view) {
            p1 p1Var;
            synchronized (p1.f60882w) {
                WeakHashMap weakHashMap = p1.f60882w;
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new p1(null, view, null);
                    weakHashMap.put(view, obj);
                }
                p1Var = (p1) obj;
            }
            return p1Var;
        }

        public final e e(o3.p0 p0Var, int i10, String str) {
            e eVar = new e(i10, str);
            if (p0Var != null) {
                eVar.j(p0Var, i10);
            }
            return eVar;
        }

        public final l1 f(o3.p0 p0Var, int i10, String str) {
            f3.b bVar;
            if (p0Var == null || (bVar = p0Var.g(i10)) == null) {
                bVar = f3.b.f31712e;
            }
            jo.p.g(bVar, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return v1.a(bVar, str);
        }
    }

    public p1(o3.p0 p0Var, View view) {
        o3.d e10;
        a aVar = f60881v;
        this.f60884a = aVar.e(p0Var, p0.m.a(), "captionBar");
        e e11 = aVar.e(p0Var, p0.m.b(), "displayCutout");
        this.f60885b = e11;
        e e12 = aVar.e(p0Var, p0.m.c(), "ime");
        this.f60886c = e12;
        e e13 = aVar.e(p0Var, p0.m.e(), "mandatorySystemGestures");
        this.f60887d = e13;
        this.f60888e = aVar.e(p0Var, p0.m.f(), "navigationBars");
        this.f60889f = aVar.e(p0Var, p0.m.g(), "statusBars");
        e e14 = aVar.e(p0Var, p0.m.h(), "systemBars");
        this.f60890g = e14;
        e e15 = aVar.e(p0Var, p0.m.i(), "systemGestures");
        this.f60891h = e15;
        e e16 = aVar.e(p0Var, p0.m.j(), "tappableElement");
        this.f60892i = e16;
        f3.b bVar = (p0Var == null || (e10 = p0Var.e()) == null || (bVar = e10.e()) == null) ? f3.b.f31712e : bVar;
        jo.p.g(bVar, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        l1 a10 = v1.a(bVar, "waterfall");
        this.f60893j = a10;
        n1 d10 = q1.d(q1.d(e14, e12), e11);
        this.f60894k = d10;
        n1 d11 = q1.d(q1.d(q1.d(e16, e13), e15), a10);
        this.f60895l = d11;
        this.f60896m = q1.d(d10, d11);
        this.f60897n = aVar.f(p0Var, p0.m.a(), "captionBarIgnoringVisibility");
        this.f60898o = aVar.f(p0Var, p0.m.f(), "navigationBarsIgnoringVisibility");
        this.f60899p = aVar.f(p0Var, p0.m.g(), "statusBarsIgnoringVisibility");
        this.f60900q = aVar.f(p0Var, p0.m.h(), "systemBarsIgnoringVisibility");
        this.f60901r = aVar.f(p0Var, p0.m.j(), "tappableElementIgnoringVisibility");
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(x0.h.I) : null;
        Boolean bool = tag instanceof Boolean ? tag : null;
        this.f60902s = bool != null ? bool.booleanValue() : true;
        this.f60904u = new z(this);
    }

    public /* synthetic */ p1(o3.p0 p0Var, View view, jo.h hVar) {
        this(p0Var, view);
    }

    public static /* synthetic */ void h(p1 p1Var, o3.p0 p0Var, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        p1Var.g(p0Var, i10);
    }

    public final void b(View view) {
        jo.p.h(view, "view");
        int i10 = this.f60903t - 1;
        this.f60903t = i10;
        if (i10 == 0) {
            o3.c0.F0(view, null);
            o3.c0.N0(view, null);
            view.removeOnAttachStateChangeListener(this.f60904u);
        }
    }

    public final boolean c() {
        return this.f60902s;
    }

    public final e d() {
        return this.f60886c;
    }

    public final n1 e() {
        return this.f60894k;
    }

    public final void f(View view) {
        jo.p.h(view, "view");
        if (this.f60903t == 0) {
            o3.c0.F0(view, this.f60904u);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f60904u);
            if (Build.VERSION.SDK_INT >= 30) {
                o3.c0.N0(view, this.f60904u);
            }
        }
        this.f60903t++;
    }

    public final void g(o3.p0 p0Var, int i10) {
        jo.p.h(p0Var, "windowInsets");
        if (f60883x) {
            WindowInsets w10 = p0Var.w();
            jo.p.e(w10);
            p0Var = o3.p0.x(w10);
        }
        jo.p.g(p0Var, "if (testInsets) {\n      …   windowInsets\n        }");
        this.f60884a.j(p0Var, i10);
        this.f60886c.j(p0Var, i10);
        this.f60885b.j(p0Var, i10);
        this.f60888e.j(p0Var, i10);
        this.f60889f.j(p0Var, i10);
        this.f60890g.j(p0Var, i10);
        this.f60891h.j(p0Var, i10);
        this.f60892i.j(p0Var, i10);
        this.f60887d.j(p0Var, i10);
        if (i10 == 0) {
            l1 l1Var = this.f60897n;
            f3.b g10 = p0Var.g(p0.m.a());
            jo.p.g(g10, "insets.getInsetsIgnoring…aptionBar()\n            )");
            l1Var.f(v1.c(g10));
            l1 l1Var2 = this.f60898o;
            f3.b g11 = p0Var.g(p0.m.f());
            jo.p.g(g11, "insets.getInsetsIgnoring…ationBars()\n            )");
            l1Var2.f(v1.c(g11));
            l1 l1Var3 = this.f60899p;
            f3.b g12 = p0Var.g(p0.m.g());
            jo.p.g(g12, "insets.getInsetsIgnoring…tatusBars()\n            )");
            l1Var3.f(v1.c(g12));
            l1 l1Var4 = this.f60900q;
            f3.b g13 = p0Var.g(p0.m.h());
            jo.p.g(g13, "insets.getInsetsIgnoring…ystemBars()\n            )");
            l1Var4.f(v1.c(g13));
            l1 l1Var5 = this.f60901r;
            f3.b g14 = p0Var.g(p0.m.j());
            jo.p.g(g14, "insets.getInsetsIgnoring…leElement()\n            )");
            l1Var5.f(v1.c(g14));
            o3.d e10 = p0Var.e();
            if (e10 != null) {
                f3.b e11 = e10.e();
                jo.p.g(e11, "cutout.waterfallInsets");
                this.f60893j.f(v1.c(e11));
            }
        }
        v0.h.f56484e.g();
    }
}
