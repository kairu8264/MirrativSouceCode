package o2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.platform.k1;
import androidx.lifecycle.u;
import androidx.lifecycle.w0;
import java.util.List;
import jo.e0;
import jo.p;
import jo.q;
import n1.g0;
import o2.a;
import o3.s;
import po.n;
import q1.b0;
import q1.c0;
import q1.d0;
import q1.k0;
import q1.q0;
import s1.y;
import v0.w;
import wn.v;
import x0.f;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup implements s {
    public x0.f A;
    public io.l<? super x0.f, v> B;
    public m2.d C;
    public io.l<? super m2.d, v> D;
    public u E;
    public y4.e F;
    public final w G;
    public final io.l<a, v> H;
    public final io.a<v> I;
    public io.l<? super Boolean, v> J;
    public final int[] K;
    public int L;
    public int M;
    public final o3.u N;
    public final s1.k O;

    /* renamed from: w  reason: collision with root package name */
    public final m1.b f43817w;

    /* renamed from: x  reason: collision with root package name */
    public View f43818x;

    /* renamed from: y  reason: collision with root package name */
    public io.a<v> f43819y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f43820z;

    /* renamed from: o2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0645a extends q implements io.l<x0.f, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s1.k f43821w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f43822x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0645a(s1.k kVar, x0.f fVar) {
            super(1);
            this.f43821w = kVar;
            this.f43822x = fVar;
        }

        public final void a(x0.f fVar) {
            p.h(fVar, "it");
            this.f43821w.k(fVar.L(this.f43822x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(x0.f fVar) {
            a(fVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<m2.d, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s1.k f43823w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s1.k kVar) {
            super(1);
            this.f43823w = kVar;
        }

        public final void a(m2.d dVar) {
            p.h(dVar, "it");
            this.f43823w.f(dVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(m2.d dVar) {
            a(dVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.l<y, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s1.k f43825x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0<View> f43826y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s1.k kVar, e0<View> e0Var) {
            super(1);
            this.f43825x = kVar;
            this.f43826y = e0Var;
        }

        public final void a(y yVar) {
            p.h(yVar, "owner");
            AndroidComposeView androidComposeView = yVar instanceof AndroidComposeView ? (AndroidComposeView) yVar : null;
            if (androidComposeView != null) {
                androidComposeView.N(a.this, this.f43825x);
            }
            View view = this.f43826y.f38136w;
            if (view != null) {
                a.this.setView$ui_release(view);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(y yVar) {
            a(yVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.l<y, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0<View> f43828x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0<View> e0Var) {
            super(1);
            this.f43828x = e0Var;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
        public final void a(y yVar) {
            p.h(yVar, "owner");
            AndroidComposeView androidComposeView = yVar instanceof AndroidComposeView ? (AndroidComposeView) yVar : null;
            if (androidComposeView != null) {
                androidComposeView.n0(a.this);
            }
            this.f43828x.f38136w = a.this.getView();
            a.this.setView$ui_release(null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(y yVar) {
            a(yVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s1.k f43830b;

        /* renamed from: o2.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0646a extends q implements io.l<q0.a, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a f43831w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s1.k f43832x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0646a(a aVar, s1.k kVar) {
                super(1);
                this.f43831w = aVar;
                this.f43832x = kVar;
            }

            public final void a(q0.a aVar) {
                p.h(aVar, "$this$layout");
                o2.d.a(this.f43831w, this.f43832x);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
                a(aVar);
                return v.f59242a;
            }
        }

        public e(s1.k kVar) {
            this.f43830b = kVar;
        }

        @Override // q1.c0
        public int a(q1.m mVar, List<? extends q1.l> list, int i10) {
            p.h(mVar, "<this>");
            p.h(list, "measurables");
            return j(i10);
        }

        @Override // q1.c0
        public d0 c(q1.e0 e0Var, List<? extends b0> list, long j10) {
            p.h(e0Var, "$this$measure");
            p.h(list, "measurables");
            if (m2.b.p(j10) != 0) {
                a.this.getChildAt(0).setMinimumWidth(m2.b.p(j10));
            }
            if (m2.b.o(j10) != 0) {
                a.this.getChildAt(0).setMinimumHeight(m2.b.o(j10));
            }
            a aVar = a.this;
            int p10 = m2.b.p(j10);
            int n10 = m2.b.n(j10);
            ViewGroup.LayoutParams layoutParams = a.this.getLayoutParams();
            p.e(layoutParams);
            int g10 = aVar.g(p10, n10, layoutParams.width);
            a aVar2 = a.this;
            int o10 = m2.b.o(j10);
            int m10 = m2.b.m(j10);
            ViewGroup.LayoutParams layoutParams2 = a.this.getLayoutParams();
            p.e(layoutParams2);
            aVar.measure(g10, aVar2.g(o10, m10, layoutParams2.height));
            return q1.e0.O0(e0Var, a.this.getMeasuredWidth(), a.this.getMeasuredHeight(), null, new C0646a(a.this, this.f43830b), 4, null);
        }

        @Override // q1.c0
        public int d(q1.m mVar, List<? extends q1.l> list, int i10) {
            p.h(mVar, "<this>");
            p.h(list, "measurables");
            return k(i10);
        }

        @Override // q1.c0
        public int e(q1.m mVar, List<? extends q1.l> list, int i10) {
            p.h(mVar, "<this>");
            p.h(list, "measurables");
            return j(i10);
        }

        @Override // q1.c0
        public int g(q1.m mVar, List<? extends q1.l> list, int i10) {
            p.h(mVar, "<this>");
            p.h(list, "measurables");
            return k(i10);
        }

        public final int j(int i10) {
            a aVar = a.this;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            p.e(layoutParams);
            aVar.measure(aVar.g(0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return a.this.getMeasuredHeight();
        }

        public final int k(int i10) {
            a aVar = a.this;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a aVar2 = a.this;
            ViewGroup.LayoutParams layoutParams = aVar2.getLayoutParams();
            p.e(layoutParams);
            aVar.measure(makeMeasureSpec, aVar2.g(0, i10, layoutParams.height));
            return a.this.getMeasuredWidth();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.l<e1.e, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s1.k f43833w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a f43834x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s1.k kVar, a aVar) {
            super(1);
            this.f43833w = kVar;
            this.f43834x = aVar;
        }

        public final void a(e1.e eVar) {
            p.h(eVar, "$this$drawBehind");
            s1.k kVar = this.f43833w;
            a aVar = this.f43834x;
            c1.w e10 = eVar.M0().e();
            y t02 = kVar.t0();
            AndroidComposeView androidComposeView = t02 instanceof AndroidComposeView ? (AndroidComposeView) t02 : null;
            if (androidComposeView != null) {
                androidComposeView.S(aVar, c1.c.c(e10));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(e1.e eVar) {
            a(eVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.l<q1.q, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s1.k f43836x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(s1.k kVar) {
            super(1);
            this.f43836x = kVar;
        }

        public final void a(q1.q qVar) {
            p.h(qVar, "it");
            o2.d.a(a.this, this.f43836x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q1.q qVar) {
            a(qVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.l<a, v> {
        public h() {
            super(1);
        }

        public static final void c(io.a aVar) {
            p.h(aVar, "$tmp0");
            aVar.invoke();
        }

        public final void b(a aVar) {
            p.h(aVar, "it");
            Handler handler = a.this.getHandler();
            final io.a aVar2 = a.this.I;
            handler.post(new Runnable() { // from class: o2.b
                @Override // java.lang.Runnable
                public final void run() {
                    a.h.c(io.a.this);
                }
            });
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(a aVar) {
            b(aVar);
            return v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {470, 475}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43838w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f43839x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a f43840y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f43841z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z10, a aVar, long j10, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f43839x = z10;
            this.f43840y = aVar;
            this.f43841z = j10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f43839x, this.f43840y, this.f43841z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43838w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (!this.f43839x) {
                    m1.b bVar = this.f43840y.f43817w;
                    long a10 = m2.u.f40549b.a();
                    long j10 = this.f43841z;
                    this.f43838w = 1;
                    if (bVar.a(a10, j10, this) == c10) {
                        return c10;
                    }
                } else {
                    m1.b bVar2 = this.f43840y.f43817w;
                    long j11 = this.f43841z;
                    long a11 = m2.u.f40549b.a();
                    this.f43838w = 2;
                    if (bVar2.a(j11, a11, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {488}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43842w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f43844y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j10, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f43844y = j10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f43844y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43842w;
            if (i10 == 0) {
                wn.m.b(obj);
                m1.b bVar = a.this.f43817w;
                long j10 = this.f43844y;
                this.f43842w = 1;
                if (bVar.c(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends q implements io.a<v> {
        public k() {
            super(0);
        }

        public final void a() {
            if (a.this.f43820z) {
                w wVar = a.this.G;
                a aVar = a.this;
                wVar.j(aVar, aVar.H, a.this.getUpdate());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends q implements io.l<io.a<? extends v>, v> {
        public l() {
            super(1);
        }

        public static final void c(io.a aVar) {
            p.h(aVar, "$tmp0");
            aVar.invoke();
        }

        public final void b(final io.a<v> aVar) {
            p.h(aVar, "command");
            if (a.this.getHandler().getLooper() == Looper.myLooper()) {
                aVar.invoke();
            } else {
                a.this.getHandler().post(new Runnable() { // from class: o2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.l.c(io.a.this);
                    }
                });
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(io.a<? extends v> aVar) {
            b(aVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final m f43847w = new m();

        public m() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, l0.m mVar, m1.b bVar) {
        super(context);
        p.h(context, "context");
        p.h(bVar, "dispatcher");
        this.f43817w = bVar;
        if (mVar != null) {
            WindowRecomposer_androidKt.i(this, mVar);
        }
        setSaveFromParentEnabled(false);
        this.f43819y = m.f43847w;
        f.a aVar = x0.f.f59359u;
        this.A = aVar;
        this.C = m2.f.b(1.0f, 0.0f, 2, null);
        this.G = new w(new l());
        this.H = new h();
        this.I = new k();
        this.K = new int[2];
        this.L = Integer.MIN_VALUE;
        this.M = Integer.MIN_VALUE;
        this.N = new o3.u(this);
        s1.k kVar = new s1.k(false, 1, null);
        x0.f a10 = k0.a(z0.i.a(g0.a(aVar, this), new f(kVar, this)), new g(kVar));
        kVar.k(this.A.L(a10));
        this.B = new C0645a(kVar, a10);
        kVar.f(this.C);
        this.D = new b(kVar);
        e0 e0Var = new e0();
        kVar.u1(new c(kVar, e0Var));
        kVar.v1(new d(e0Var));
        kVar.a(new e(kVar));
        this.O = kVar;
    }

    public final int g(int i10, int i11, int i12) {
        if (i12 >= 0 || i10 == i11) {
            return View.MeasureSpec.makeMeasureSpec(n.m(i12, i10, i11), 1073741824);
        }
        if (i12 != -2 || i11 == Integer.MAX_VALUE) {
            if (i12 == -1 && i11 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.K);
        int[] iArr = this.K;
        region.op(iArr[0], iArr[1], iArr[0] + getWidth(), this.K[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final m2.d getDensity() {
        return this.C;
    }

    public final s1.k getLayoutNode() {
        return this.O;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f43818x;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final u getLifecycleOwner() {
        return this.E;
    }

    public final x0.f getModifier() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.N.a();
    }

    public final io.l<m2.d, v> getOnDensityChanged$ui_release() {
        return this.D;
    }

    public final io.l<x0.f, v> getOnModifierChanged$ui_release() {
        return this.B;
    }

    public final io.l<Boolean, v> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.J;
    }

    public final y4.e getSavedStateRegistryOwner() {
        return this.F;
    }

    public final io.a<v> getUpdate() {
        return this.f43819y;
    }

    public final View getView() {
        return this.f43818x;
    }

    public final void h() {
        int i10;
        int i11 = this.L;
        if (i11 == Integer.MIN_VALUE || (i10 = this.M) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.O.I0();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        View view = this.f43818x;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G.k();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        p.h(view, "child");
        p.h(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.O.I0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G.l();
        this.G.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f43818x;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        View view = this.f43818x;
        if (view != null) {
            view.measure(i10, i11);
        }
        View view2 = this.f43818x;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.f43818x;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.L = i10;
        this.M = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        p.h(view, "target");
        if (isNestedScrollingEnabled()) {
            uo.l.d(this.f43817w.e(), null, null, new i(z10, this, m2.v.a(o2.d.c(f10), o2.d.c(f11)), null), 3, null);
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedPreFling(View view, float f10, float f11) {
        p.h(view, "target");
        if (isNestedScrollingEnabled()) {
            uo.l.d(this.f43817w.e(), null, null, new j(m2.v.a(o2.d.c(f10), o2.d.c(f11)), null), 3, null);
            return false;
        }
        return false;
    }

    @Override // o3.r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        p.h(view, "target");
        p.h(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            long d10 = this.f43817w.d(b1.g.a(o2.d.b(i10), o2.d.b(i11)), o2.d.d(i12));
            iArr[0] = k1.b(b1.f.m(d10));
            iArr[1] = k1.b(b1.f.n(d10));
        }
    }

    @Override // o3.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        p.h(view, "target");
        p.h(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            long b10 = this.f43817w.b(b1.g.a(o2.d.b(i10), o2.d.b(i11)), b1.g.a(o2.d.b(i12), o2.d.b(i13)), o2.d.d(i14));
            iArr[0] = k1.b(b1.f.m(b10));
            iArr[1] = k1.b(b1.f.n(b10));
        }
    }

    @Override // o3.r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        p.h(view, "child");
        p.h(view2, "target");
        this.N.c(view, view2, i10, i11);
    }

    @Override // o3.r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        p.h(view, "child");
        p.h(view2, "target");
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // o3.r
    public void onStopNestedScroll(View view, int i10) {
        p.h(view, "target");
        this.N.e(view, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        io.l<? super Boolean, v> lVar = this.J;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(m2.d dVar) {
        p.h(dVar, "value");
        if (dVar != this.C) {
            this.C = dVar;
            io.l<? super m2.d, v> lVar = this.D;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(u uVar) {
        if (uVar != this.E) {
            this.E = uVar;
            w0.b(this, uVar);
        }
    }

    public final void setModifier(x0.f fVar) {
        p.h(fVar, "value");
        if (fVar != this.A) {
            this.A = fVar;
            io.l<? super x0.f, v> lVar = this.B;
            if (lVar != null) {
                lVar.invoke(fVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(io.l<? super m2.d, v> lVar) {
        this.D = lVar;
    }

    public final void setOnModifierChanged$ui_release(io.l<? super x0.f, v> lVar) {
        this.B = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(io.l<? super Boolean, v> lVar) {
        this.J = lVar;
    }

    public final void setSavedStateRegistryOwner(y4.e eVar) {
        if (eVar != this.F) {
            this.F = eVar;
            y4.f.b(this, eVar);
        }
    }

    public final void setUpdate(io.a<v> aVar) {
        p.h(aVar, "value");
        this.f43819y = aVar;
        this.f43820z = true;
        this.I.invoke();
    }

    public final void setView$ui_release(View view) {
        if (view != this.f43818x) {
            this.f43818x = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.I.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // o3.r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        p.h(view, "target");
        if (isNestedScrollingEnabled()) {
            this.f43817w.b(b1.g.a(o2.d.b(i10), o2.d.b(i11)), b1.g.a(o2.d.b(i12), o2.d.b(i13)), o2.d.d(i14));
        }
    }
}
