package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.platform.h;
import androidx.lifecycle.o;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p3.c;
import w1.e;
import w1.h;

/* loaded from: classes.dex */
public final class t extends o3.a {
    public static final d A = new d(null);
    public static final int[] B = {x0.h.f59363a, x0.h.f59364b, x0.h.f59375m, x0.h.f59386x, x0.h.A, x0.h.B, x0.h.C, x0.h.D, x0.h.E, x0.h.F, x0.h.f59365c, x0.h.f59366d, x0.h.f59367e, x0.h.f59368f, x0.h.f59369g, x0.h.f59370h, x0.h.f59371i, x0.h.f59372j, x0.h.f59373k, x0.h.f59374l, x0.h.f59376n, x0.h.f59377o, x0.h.f59378p, x0.h.f59379q, x0.h.f59380r, x0.h.f59381s, x0.h.f59382t, x0.h.f59383u, x0.h.f59384v, x0.h.f59385w, x0.h.f59387y, x0.h.f59388z};

    /* renamed from: d  reason: collision with root package name */
    public final AndroidComposeView f14606d;

    /* renamed from: e  reason: collision with root package name */
    public int f14607e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f14608f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14609g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f14610h;

    /* renamed from: i  reason: collision with root package name */
    public p3.d f14611i;

    /* renamed from: j  reason: collision with root package name */
    public int f14612j;

    /* renamed from: k  reason: collision with root package name */
    public s.h<s.h<CharSequence>> f14613k;

    /* renamed from: l  reason: collision with root package name */
    public s.h<Map<CharSequence, Integer>> f14614l;

    /* renamed from: m  reason: collision with root package name */
    public int f14615m;

    /* renamed from: n  reason: collision with root package name */
    public Integer f14616n;

    /* renamed from: o  reason: collision with root package name */
    public final s.b<s1.k> f14617o;

    /* renamed from: p  reason: collision with root package name */
    public final wo.i<wn.v> f14618p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14619q;

    /* renamed from: r  reason: collision with root package name */
    public f f14620r;

    /* renamed from: s  reason: collision with root package name */
    public Map<Integer, u1> f14621s;

    /* renamed from: t  reason: collision with root package name */
    public s.b<Integer> f14622t;

    /* renamed from: u  reason: collision with root package name */
    public Map<Integer, g> f14623u;

    /* renamed from: v  reason: collision with root package name */
    public g f14624v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14625w;

    /* renamed from: x  reason: collision with root package name */
    public final Runnable f14626x;

    /* renamed from: y  reason: collision with root package name */
    public final List<t1> f14627y;

    /* renamed from: z  reason: collision with root package name */
    public final io.l<t1, wn.v> f14628z;

    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            jo.p.h(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            jo.p.h(view, "view");
            t.this.f14610h.removeCallbacks(t.this.f14626x);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14630a = new b();

        public static final void a(p3.c cVar, w1.q qVar) {
            w1.a aVar;
            jo.p.h(cVar, "info");
            jo.p.h(qVar, "semanticsNode");
            if (!u.b(qVar) || (aVar = (w1.a) w1.l.a(qVar.s(), w1.j.f57906a.n())) == null) {
                return;
            }
            cVar.b(new c.a(16908349, aVar.b()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14631a = new c();

        public static final void a(AccessibilityEvent accessibilityEvent, int i10, int i11) {
            jo.p.h(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i10);
            accessibilityEvent.setScrollDeltaY(i11);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class e extends AccessibilityNodeProvider {
        public e() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            jo.p.h(accessibilityNodeInfo, "info");
            jo.p.h(str, "extraDataKey");
            t.this.w(i10, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            return t.this.D(i10);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return t.this.T(i10, i11, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final w1.q f14633a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14634b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14635c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14636d;

        /* renamed from: e  reason: collision with root package name */
        public final int f14637e;

        /* renamed from: f  reason: collision with root package name */
        public final long f14638f;

        public f(w1.q qVar, int i10, int i11, int i12, int i13, long j10) {
            jo.p.h(qVar, "node");
            this.f14633a = qVar;
            this.f14634b = i10;
            this.f14635c = i11;
            this.f14636d = i12;
            this.f14637e = i13;
            this.f14638f = j10;
        }

        public final int a() {
            return this.f14634b;
        }

        public final int b() {
            return this.f14636d;
        }

        public final int c() {
            return this.f14635c;
        }

        public final w1.q d() {
            return this.f14633a;
        }

        public final int e() {
            return this.f14637e;
        }

        public final long f() {
            return this.f14638f;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final w1.k f14639a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<Integer> f14640b;

        public g(w1.q qVar, Map<Integer, u1> map) {
            jo.p.h(qVar, "semanticsNode");
            jo.p.h(map, "currentSemanticsNodes");
            this.f14639a = qVar.s();
            this.f14640b = new LinkedHashSet();
            List<w1.q> o10 = qVar.o();
            int size = o10.size();
            for (int i10 = 0; i10 < size; i10++) {
                w1.q qVar2 = o10.get(i10);
                if (map.containsKey(Integer.valueOf(qVar2.i()))) {
                    this.f14640b.add(Integer.valueOf(qVar2.i()));
                }
            }
        }

        public final Set<Integer> a() {
            return this.f14640b;
        }

        public final w1.k b() {
            return this.f14639a;
        }

        public final boolean c() {
            return this.f14639a.g(w1.t.f57947a.o());
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14641a;

        static {
            int[] iArr = new int[x1.a.values().length];
            iArr[x1.a.On.ordinal()] = 1;
            iArr[x1.a.Off.ordinal()] = 2;
            iArr[x1.a.Indeterminate.ordinal()] = 3;
            f14641a = iArr;
        }
    }

    @co.f(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1637, 1666}, m = "boundsUpdatesEventLoop")
    /* loaded from: classes.dex */
    public static final class i extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f14642w;

        /* renamed from: x  reason: collision with root package name */
        public Object f14643x;

        /* renamed from: y  reason: collision with root package name */
        public Object f14644y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f14645z;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f14645z = obj;
            this.B |= Integer.MIN_VALUE;
            return t.this.x(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.l<s1.k, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final j f14646w = new j();

        public j() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(s1.k kVar) {
            w1.k j10;
            jo.p.h(kVar, "parent");
            w1.m j11 = w1.r.j(kVar);
            boolean z10 = true;
            if (j11 == null || (j10 = j11.j()) == null || !j10.s()) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t1 f14647w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t f14648x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(t1 t1Var, t tVar) {
            super(0);
            this.f14647w = t1Var;
            this.f14648x = tVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
            if ((r2 == 0.0f) == false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 256
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.k.a():void");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.l<t1, wn.v> {
        public l() {
            super(1);
        }

        public final void a(t1 t1Var) {
            jo.p.h(t1Var, "it");
            t.this.i0(t1Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(t1 t1Var) {
            a(t1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.l<s1.k, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final m f14650w = new m();

        public m() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(s1.k kVar) {
            w1.k j10;
            jo.p.h(kVar, "it");
            w1.m j11 = w1.r.j(kVar);
            boolean z10 = true;
            if (j11 == null || (j10 = j11.j()) == null || !j10.s()) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.l<s1.k, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final n f14651w = new n();

        public n() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(s1.k kVar) {
            jo.p.h(kVar, "it");
            return Boolean.valueOf(w1.r.j(kVar) != null);
        }
    }

    public t(AndroidComposeView androidComposeView) {
        jo.p.h(androidComposeView, "view");
        this.f14606d = androidComposeView;
        this.f14607e = Integer.MIN_VALUE;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f14608f = (AccessibilityManager) systemService;
        this.f14610h = new Handler(Looper.getMainLooper());
        this.f14611i = new p3.d(new e());
        this.f14612j = Integer.MIN_VALUE;
        this.f14613k = new s.h<>();
        this.f14614l = new s.h<>();
        this.f14615m = -1;
        this.f14617o = new s.b<>();
        this.f14618p = wo.l.b(-1, null, null, 6, null);
        this.f14619q = true;
        this.f14621s = xn.n0.e();
        this.f14622t = new s.b<>();
        this.f14623u = new LinkedHashMap();
        this.f14624v = new g(androidComposeView.getSemanticsOwner().a(), xn.n0.e());
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.f14626x = new Runnable() { // from class: androidx.compose.ui.platform.s
            @Override // java.lang.Runnable
            public final void run() {
                t.b0(t.this);
            }
        };
        this.f14627y = new ArrayList();
        this.f14628z = new l();
    }

    public static final boolean U(w1.i iVar, float f10) {
        return (f10 < 0.0f && iVar.c().invoke().floatValue() > 0.0f) || (f10 > 0.0f && iVar.c().invoke().floatValue() < iVar.a().invoke().floatValue());
    }

    public static final float V(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    public static final boolean X(w1.i iVar) {
        return (iVar.c().invoke().floatValue() > 0.0f && !iVar.b()) || (iVar.c().invoke().floatValue() < iVar.a().invoke().floatValue() && iVar.b());
    }

    public static final boolean Y(w1.i iVar) {
        return (iVar.c().invoke().floatValue() < iVar.a().invoke().floatValue() && !iVar.b()) || (iVar.c().invoke().floatValue() > 0.0f && iVar.b());
    }

    public static final void b0(t tVar) {
        jo.p.h(tVar, "this$0");
        s1.y.u(tVar.f14606d, false, 1, null);
        tVar.A();
        tVar.f14625w = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean f0(t tVar, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return tVar.e0(i10, i11, num, list);
    }

    public final void A() {
        k0(this.f14606d.getSemanticsOwner().a(), this.f14624v);
        j0(I());
        t0();
    }

    public final boolean B(int i10) {
        if (O(i10)) {
            this.f14612j = Integer.MIN_VALUE;
            this.f14606d.invalidate();
            f0(this, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE, null, null, 12, null);
            return true;
        }
        return false;
    }

    public final AccessibilityEvent C(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        jo.p.g(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f14606d.getContext().getPackageName());
        obtain.setSource(this.f14606d, i10);
        u1 u1Var = I().get(Integer.valueOf(i10));
        if (u1Var != null) {
            obtain.setPassword(u.f(u1Var.b()));
        }
        return obtain;
    }

    public final AccessibilityNodeInfo D(int i10) {
        androidx.lifecycle.u a10;
        androidx.lifecycle.o g10;
        AndroidComposeView.b viewTreeOwners = this.f14606d.getViewTreeOwners();
        if (((viewTreeOwners == null || (a10 = viewTreeOwners.a()) == null || (g10 = a10.g()) == null) ? null : g10.b()) == o.c.DESTROYED) {
            return null;
        }
        p3.c N = p3.c.N();
        jo.p.g(N, "obtain()");
        u1 u1Var = I().get(Integer.valueOf(i10));
        if (u1Var == null) {
            N.R();
            return null;
        }
        w1.q b10 = u1Var.b();
        if (i10 == -1) {
            ViewParent K = o3.c0.K(this.f14606d);
            N.v0(K instanceof View ? (View) K : null);
        } else if (b10.m() != null) {
            w1.q m10 = b10.m();
            jo.p.e(m10);
            int i11 = m10.i();
            N.w0(this.f14606d, i11 != this.f14606d.getSemanticsOwner().a().i() ? i11 : -1);
        } else {
            throw new IllegalStateException("semanticsNode " + i10 + " has null parent");
        }
        N.E0(this.f14606d, i10);
        Rect a11 = u1Var.a();
        long t10 = this.f14606d.t(b1.g.a(a11.left, a11.top));
        long t11 = this.f14606d.t(b1.g.a(a11.right, a11.bottom));
        N.X(new Rect((int) Math.floor(b1.f.m(t10)), (int) Math.floor(b1.f.n(t10)), (int) Math.ceil(b1.f.m(t11)), (int) Math.ceil(b1.f.n(t11))));
        W(i10, N, b10);
        return N.L0();
    }

    public final AccessibilityEvent E(int i10, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent C = C(i10, 8192);
        if (num != null) {
            C.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            C.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            C.setItemCount(num3.intValue());
        }
        if (str != null) {
            C.getText().add(str);
        }
        return C;
    }

    public final boolean F(MotionEvent motionEvent) {
        jo.p.h(motionEvent, "event");
        if (N()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int M = M(motionEvent.getX(), motionEvent.getY());
                boolean dispatchGenericMotionEvent = this.f14606d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                s0(M);
                if (M == Integer.MIN_VALUE) {
                    return dispatchGenericMotionEvent;
                }
                return true;
            } else if (action != 10) {
                return false;
            } else {
                if (this.f14607e != Integer.MIN_VALUE) {
                    s0(Integer.MIN_VALUE);
                    return true;
                }
                return this.f14606d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
        }
        return false;
    }

    public final int G(w1.q qVar) {
        w1.k s10 = qVar.s();
        w1.t tVar = w1.t.f57947a;
        if (!s10.g(tVar.c()) && qVar.s().g(tVar.x())) {
            return y1.b0.i(((y1.b0) qVar.s().k(tVar.x())).r());
        }
        return this.f14615m;
    }

    public final int H(w1.q qVar) {
        w1.k s10 = qVar.s();
        w1.t tVar = w1.t.f57947a;
        if (!s10.g(tVar.c()) && qVar.s().g(tVar.x())) {
            return y1.b0.n(((y1.b0) qVar.s().k(tVar.x())).r());
        }
        return this.f14615m;
    }

    public final Map<Integer, u1> I() {
        if (this.f14619q) {
            this.f14621s = u.o(this.f14606d.getSemanticsOwner());
            this.f14619q = false;
        }
        return this.f14621s;
    }

    public final String J(w1.q qVar) {
        y1.a aVar;
        if (qVar == null) {
            return null;
        }
        w1.k s10 = qVar.s();
        w1.t tVar = w1.t.f57947a;
        if (s10.g(tVar.c())) {
            return x0.j.d((List) qVar.s().k(tVar.c()), ",", null, null, 0, null, null, 62, null);
        }
        if (u.h(qVar)) {
            y1.a L = L(qVar.s());
            if (L != null) {
                return L.g();
            }
            return null;
        }
        List list = (List) w1.l.a(qVar.s(), tVar.w());
        if (list == null || (aVar = (y1.a) xn.a0.Z(list)) == null) {
            return null;
        }
        return aVar.g();
    }

    public final androidx.compose.ui.platform.g K(w1.q qVar, int i10) {
        if (qVar == null) {
            return null;
        }
        String J = J(qVar);
        if (J == null || J.length() == 0) {
            return null;
        }
        if (i10 == 1) {
            c.a aVar = androidx.compose.ui.platform.c.f14390d;
            Locale locale = this.f14606d.getContext().getResources().getConfiguration().locale;
            jo.p.g(locale, "view.context.resources.configuration.locale");
            androidx.compose.ui.platform.c a10 = aVar.a(locale);
            a10.e(J);
            return a10;
        } else if (i10 != 2) {
            if (i10 != 4) {
                if (i10 == 8) {
                    androidx.compose.ui.platform.f a11 = androidx.compose.ui.platform.f.f14442c.a();
                    a11.e(J);
                    return a11;
                } else if (i10 != 16) {
                    return null;
                }
            }
            w1.k s10 = qVar.s();
            w1.j jVar = w1.j.f57906a;
            if (s10.g(jVar.g())) {
                ArrayList arrayList = new ArrayList();
                io.l lVar = (io.l) ((w1.a) qVar.s().k(jVar.g())).a();
                if (jo.p.c(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                    y1.z zVar = (y1.z) arrayList.get(0);
                    if (i10 == 4) {
                        androidx.compose.ui.platform.d a12 = androidx.compose.ui.platform.d.f14404d.a();
                        a12.j(J, zVar);
                        return a12;
                    }
                    androidx.compose.ui.platform.e a13 = androidx.compose.ui.platform.e.f14425f.a();
                    a13.j(J, zVar, qVar);
                    return a13;
                }
                return null;
            }
            return null;
        } else {
            h.a aVar2 = androidx.compose.ui.platform.h.f14456d;
            Locale locale2 = this.f14606d.getContext().getResources().getConfiguration().locale;
            jo.p.g(locale2, "view.context.resources.configuration.locale");
            androidx.compose.ui.platform.h a14 = aVar2.a(locale2);
            a14.e(J);
            return a14;
        }
    }

    public final y1.a L(w1.k kVar) {
        return (y1.a) w1.l.a(kVar, w1.t.f57947a.e());
    }

    public final int M(float f10, float f11) {
        s1.k a10;
        w1.m mVar = null;
        s1.y.u(this.f14606d, false, 1, null);
        s1.f fVar = new s1.f();
        this.f14606d.getRoot().F0(b1.g.a(f10, f11), fVar, (r13 & 4) != 0, (r13 & 8) != 0);
        w1.m mVar2 = (w1.m) xn.a0.j0(fVar);
        if (mVar2 != null && (a10 = mVar2.a()) != null) {
            mVar = w1.r.j(a10);
        }
        if (mVar != null) {
            w1.q qVar = new w1.q(mVar, false);
            s1.p e10 = qVar.e();
            if (qVar.s().g(w1.t.f57947a.l()) || e10.S1() || this.f14606d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(mVar.a()) != null) {
                return Integer.MIN_VALUE;
            }
            return c0(mVar.c().getId());
        }
        return Integer.MIN_VALUE;
    }

    public final boolean N() {
        return this.f14609g || (this.f14608f.isEnabled() && this.f14608f.isTouchExplorationEnabled());
    }

    public final boolean O(int i10) {
        return this.f14612j == i10;
    }

    public final boolean P(w1.q qVar) {
        w1.k s10 = qVar.s();
        w1.t tVar = w1.t.f57947a;
        return !s10.g(tVar.c()) && qVar.s().g(tVar.e());
    }

    public final void Q(s1.k kVar) {
        if (this.f14617o.add(kVar)) {
            this.f14618p.l(wn.v.f59242a);
        }
    }

    public final void R(s1.k kVar) {
        jo.p.h(kVar, "layoutNode");
        this.f14619q = true;
        if (N()) {
            Q(kVar);
        }
    }

    public final void S() {
        this.f14619q = true;
        if (!N() || this.f14625w) {
            return;
        }
        this.f14625w = true;
        this.f14610h.post(this.f14626x);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108  */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00e6 -> B:59:0x00e7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.T(int, int, android.os.Bundle):boolean");
    }

    public final void W(int i10, p3.c cVar, w1.q qVar) {
        s1.p e10;
        c.a aVar;
        c.a aVar2;
        boolean z10;
        String string;
        String str;
        jo.p.h(cVar, "info");
        jo.p.h(qVar, "semanticsNode");
        cVar.b0("android.view.View");
        w1.k s10 = qVar.s();
        w1.t tVar = w1.t.f57947a;
        w1.h hVar = (w1.h) w1.l.a(s10, tVar.r());
        if (hVar != null) {
            int m10 = hVar.m();
            if (qVar.t() || qVar.o().isEmpty()) {
                h.a aVar3 = w1.h.f57895b;
                if (w1.h.j(hVar.m(), aVar3.f())) {
                    cVar.z0(this.f14606d.getContext().getResources().getString(x0.i.f59403o));
                } else {
                    if (w1.h.j(m10, aVar3.a())) {
                        str = "android.widget.Button";
                    } else if (w1.h.j(m10, aVar3.b())) {
                        str = "android.widget.CheckBox";
                    } else if (w1.h.j(m10, aVar3.e())) {
                        str = "android.widget.Switch";
                    } else if (w1.h.j(m10, aVar3.d())) {
                        str = "android.widget.RadioButton";
                    } else {
                        str = w1.h.j(m10, aVar3.c()) ? "android.widget.ImageView" : null;
                    }
                    if (!w1.h.j(hVar.m(), aVar3.c())) {
                        cVar.b0(str);
                    } else if (u.d(qVar.k(), j.f14646w) == null || qVar.s().s()) {
                        cVar.b0(str);
                    }
                }
            }
            wn.v vVar = wn.v.f59242a;
        }
        if (u.h(qVar)) {
            cVar.b0("android.widget.EditText");
        }
        if (qVar.h().g(tVar.w())) {
            cVar.b0("android.widget.TextView");
        }
        cVar.t0(this.f14606d.getContext().getPackageName());
        List<w1.q> p10 = qVar.p();
        int size = p10.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            w1.q qVar2 = p10.get(i12);
            if (I().containsKey(Integer.valueOf(qVar2.i()))) {
                o2.a aVar4 = this.f14606d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(qVar2.k());
                if (aVar4 != null) {
                    cVar.c(aVar4);
                } else {
                    cVar.d(this.f14606d, qVar2.i());
                }
            }
        }
        if (this.f14612j == i10) {
            cVar.U(true);
            cVar.b(c.a.f45752l);
        } else {
            cVar.U(false);
            cVar.b(c.a.f45751k);
        }
        o0(qVar, cVar);
        n0(qVar, cVar);
        w1.k s11 = qVar.s();
        w1.t tVar2 = w1.t.f57947a;
        cVar.F0((CharSequence) w1.l.a(s11, tVar2.u()));
        x1.a aVar5 = (x1.a) w1.l.a(qVar.s(), tVar2.y());
        if (aVar5 != null) {
            cVar.Z(true);
            int i13 = h.f14641a[aVar5.ordinal()];
            if (i13 == 1) {
                cVar.a0(true);
                if ((hVar == null ? false : w1.h.j(hVar.m(), w1.h.f57895b.e())) && cVar.x() == null) {
                    cVar.F0(this.f14606d.getContext().getResources().getString(x0.i.f59399k));
                }
            } else if (i13 != 2) {
                if (i13 == 3 && cVar.x() == null) {
                    cVar.F0(this.f14606d.getContext().getResources().getString(x0.i.f59395g));
                }
            } else {
                cVar.a0(false);
                if ((hVar == null ? false : w1.h.j(hVar.m(), w1.h.f57895b.e())) && cVar.x() == null) {
                    cVar.F0(this.f14606d.getContext().getResources().getString(x0.i.f59398j));
                }
            }
            wn.v vVar2 = wn.v.f59242a;
        }
        Boolean bool = (Boolean) w1.l.a(qVar.s(), tVar2.t());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (hVar == null ? false : w1.h.j(hVar.m(), w1.h.f57895b.f())) {
                cVar.C0(booleanValue);
            } else {
                cVar.Z(true);
                cVar.a0(booleanValue);
                if (cVar.x() == null) {
                    if (booleanValue) {
                        string = this.f14606d.getContext().getResources().getString(x0.i.f59402n);
                    } else {
                        string = this.f14606d.getContext().getResources().getString(x0.i.f59397i);
                    }
                    cVar.F0(string);
                }
            }
            wn.v vVar3 = wn.v.f59242a;
        }
        if (!qVar.s().s() || qVar.o().isEmpty()) {
            List list = (List) w1.l.a(qVar.s(), tVar2.c());
            cVar.f0(list != null ? (String) xn.a0.Z(list) : null);
        }
        if (qVar.s().s()) {
            cVar.A0(true);
        }
        String str2 = (String) w1.l.a(qVar.s(), tVar2.v());
        if (str2 != null) {
            w1.q qVar3 = qVar;
            while (true) {
                if (qVar3 == null) {
                    z10 = false;
                    break;
                }
                w1.k s12 = qVar3.s();
                w1.u uVar = w1.u.f57981a;
                if (s12.g(uVar.a())) {
                    z10 = ((Boolean) qVar3.s().k(uVar.a())).booleanValue();
                    break;
                }
                qVar3 = qVar3.m();
            }
            if (z10) {
                cVar.J0(str2);
            }
        }
        w1.k s13 = qVar.s();
        w1.t tVar3 = w1.t.f57947a;
        if (((wn.v) w1.l.a(s13, tVar3.h())) != null) {
            cVar.n0(true);
            wn.v vVar4 = wn.v.f59242a;
        }
        cVar.x0(u.f(qVar));
        cVar.i0(u.h(qVar));
        cVar.j0(u.b(qVar));
        cVar.l0(qVar.s().g(tVar3.g()));
        if (cVar.G()) {
            cVar.m0(((Boolean) qVar.s().k(tVar3.g())).booleanValue());
            if (cVar.H()) {
                cVar.a(2);
            } else {
                cVar.a(1);
            }
        }
        if (qVar.t()) {
            w1.q m11 = qVar.m();
            e10 = m11 != null ? m11.e() : null;
        } else {
            e10 = qVar.e();
        }
        cVar.K0(!(e10 != null ? e10.S1() : false) && w1.l.a(qVar.s(), tVar3.l()) == null);
        w1.e eVar = (w1.e) w1.l.a(qVar.s(), tVar3.n());
        if (eVar != null) {
            int i14 = eVar.i();
            e.a aVar6 = w1.e.f57880b;
            cVar.p0((w1.e.f(i14, aVar6.b()) || !w1.e.f(i14, aVar6.a())) ? 1 : 2);
            wn.v vVar5 = wn.v.f59242a;
        }
        cVar.c0(false);
        w1.k s14 = qVar.s();
        w1.j jVar = w1.j.f57906a;
        w1.a aVar7 = (w1.a) w1.l.a(s14, jVar.h());
        if (aVar7 != null) {
            boolean c10 = jo.p.c(w1.l.a(qVar.s(), tVar3.t()), Boolean.TRUE);
            cVar.c0(!c10);
            if (u.b(qVar) && !c10) {
                cVar.b(new c.a(16, aVar7.b()));
            }
            wn.v vVar6 = wn.v.f59242a;
        }
        cVar.q0(false);
        w1.a aVar8 = (w1.a) w1.l.a(qVar.s(), jVar.i());
        if (aVar8 != null) {
            cVar.q0(true);
            if (u.b(qVar)) {
                cVar.b(new c.a(32, aVar8.b()));
            }
            wn.v vVar7 = wn.v.f59242a;
        }
        w1.a aVar9 = (w1.a) w1.l.a(qVar.s(), jVar.b());
        if (aVar9 != null) {
            cVar.b(new c.a(16384, aVar9.b()));
            wn.v vVar8 = wn.v.f59242a;
        }
        if (u.b(qVar)) {
            w1.a aVar10 = (w1.a) w1.l.a(qVar.s(), jVar.p());
            if (aVar10 != null) {
                cVar.b(new c.a(2097152, aVar10.b()));
                wn.v vVar9 = wn.v.f59242a;
            }
            w1.a aVar11 = (w1.a) w1.l.a(qVar.s(), jVar.d());
            if (aVar11 != null) {
                cVar.b(new c.a(C.DEFAULT_BUFFER_SEGMENT_SIZE, aVar11.b()));
                wn.v vVar10 = wn.v.f59242a;
            }
            w1.a aVar12 = (w1.a) w1.l.a(qVar.s(), jVar.j());
            if (aVar12 != null) {
                if (cVar.H() && this.f14606d.getClipboardManager().c()) {
                    cVar.b(new c.a(32768, aVar12.b()));
                }
                wn.v vVar11 = wn.v.f59242a;
            }
        }
        String J = J(qVar);
        if (!(J == null || J.length() == 0)) {
            cVar.H0(H(qVar), G(qVar));
            w1.a aVar13 = (w1.a) w1.l.a(qVar.s(), jVar.o());
            cVar.b(new c.a(131072, aVar13 != null ? aVar13.b() : null));
            cVar.a(256);
            cVar.a(512);
            cVar.s0(11);
            List list2 = (List) w1.l.a(qVar.s(), tVar3.c());
            if ((list2 == null || list2.isEmpty()) && qVar.s().g(jVar.g()) && !u.c(qVar)) {
                cVar.s0(cVar.t() | 4 | 16);
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence y10 = cVar.y();
            if (!(y10 == null || y10.length() == 0) && qVar.s().g(jVar.g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (qVar.s().g(tVar3.v())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                androidx.compose.ui.platform.j jVar2 = androidx.compose.ui.platform.j.f14473a;
                AccessibilityNodeInfo L0 = cVar.L0();
                jo.p.g(L0, "info.unwrap()");
                jVar2.a(L0, arrayList);
            }
        }
        w1.g gVar = (w1.g) w1.l.a(qVar.s(), tVar3.q());
        if (gVar != null) {
            if (qVar.s().g(jVar.n())) {
                cVar.b0("android.widget.SeekBar");
            } else {
                cVar.b0("android.widget.ProgressBar");
            }
            if (gVar != w1.g.f57890d.a()) {
                cVar.y0(c.d.a(1, gVar.c().d().floatValue(), gVar.c().j().floatValue(), gVar.b()));
                if (cVar.x() == null) {
                    po.e<Float> c11 = gVar.c();
                    float l10 = po.n.l(((c11.j().floatValue() - c11.d().floatValue()) > 0.0f ? 1 : ((c11.j().floatValue() - c11.d().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (gVar.b() - c11.d().floatValue()) / (c11.j().floatValue() - c11.d().floatValue()), 0.0f, 1.0f);
                    int i16 = 100;
                    if (l10 == 0.0f) {
                        i16 = 0;
                    } else if (!(l10 == 1.0f)) {
                        i16 = po.n.m(lo.c.c(l10 * 100), 1, 99);
                    }
                    cVar.F0(this.f14606d.getContext().getResources().getString(x0.i.f59404p, Integer.valueOf(i16)));
                }
            } else if (cVar.x() == null) {
                cVar.F0(this.f14606d.getContext().getResources().getString(x0.i.f59394f));
            }
            if (qVar.s().g(jVar.n()) && u.b(qVar)) {
                if (gVar.b() < po.n.c(gVar.c().j().floatValue(), gVar.c().d().floatValue())) {
                    cVar.b(c.a.f45757q);
                }
                if (gVar.b() > po.n.h(gVar.c().d().floatValue(), gVar.c().j().floatValue())) {
                    cVar.b(c.a.f45758r);
                }
            }
        }
        if (i15 >= 24) {
            b.a(cVar, qVar);
        }
        t1.a.d(qVar, cVar);
        t1.a.e(qVar, cVar);
        w1.i iVar = (w1.i) w1.l.a(qVar.s(), tVar3.i());
        w1.a aVar14 = (w1.a) w1.l.a(qVar.s(), jVar.l());
        if (iVar != null && aVar14 != null) {
            if (!t1.a.b(qVar)) {
                cVar.b0("android.widget.HorizontalScrollView");
            }
            if (iVar.a().invoke().floatValue() > 0.0f) {
                cVar.B0(true);
            }
            if (u.b(qVar)) {
                if (Y(iVar)) {
                    cVar.b(c.a.f45757q);
                    if (!u.g(qVar)) {
                        aVar2 = c.a.F;
                    } else {
                        aVar2 = c.a.D;
                    }
                    cVar.b(aVar2);
                }
                if (X(iVar)) {
                    cVar.b(c.a.f45758r);
                    if (!u.g(qVar)) {
                        aVar = c.a.D;
                    } else {
                        aVar = c.a.F;
                    }
                    cVar.b(aVar);
                }
            }
        }
        w1.i iVar2 = (w1.i) w1.l.a(qVar.s(), tVar3.z());
        if (iVar2 != null && aVar14 != null) {
            if (!t1.a.b(qVar)) {
                cVar.b0("android.widget.ScrollView");
            }
            if (iVar2.a().invoke().floatValue() > 0.0f) {
                cVar.B0(true);
            }
            if (u.b(qVar)) {
                if (Y(iVar2)) {
                    cVar.b(c.a.f45757q);
                    cVar.b(c.a.E);
                }
                if (X(iVar2)) {
                    cVar.b(c.a.f45758r);
                    cVar.b(c.a.C);
                }
            }
        }
        cVar.u0((CharSequence) w1.l.a(qVar.s(), tVar3.o()));
        if (u.b(qVar)) {
            w1.a aVar15 = (w1.a) w1.l.a(qVar.s(), jVar.f());
            if (aVar15 != null) {
                cVar.b(new c.a(262144, aVar15.b()));
                wn.v vVar12 = wn.v.f59242a;
            }
            w1.a aVar16 = (w1.a) w1.l.a(qVar.s(), jVar.a());
            if (aVar16 != null) {
                cVar.b(new c.a(524288, aVar16.b()));
                wn.v vVar13 = wn.v.f59242a;
            }
            w1.a aVar17 = (w1.a) w1.l.a(qVar.s(), jVar.e());
            if (aVar17 != null) {
                cVar.b(new c.a(1048576, aVar17.b()));
                wn.v vVar14 = wn.v.f59242a;
            }
            if (qVar.s().g(jVar.c())) {
                List list3 = (List) qVar.s().k(jVar.c());
                int size2 = list3.size();
                int[] iArr = B;
                if (size2 < iArr.length) {
                    s.h<CharSequence> hVar2 = new s.h<>();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f14614l.f(i10)) {
                        Map<CharSequence, Integer> h10 = this.f14614l.h(i10);
                        List<Integer> f02 = xn.o.f0(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list3.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            w1.d dVar = (w1.d) list3.get(i17);
                            jo.p.e(h10);
                            if (h10.containsKey(dVar.b())) {
                                Integer num = h10.get(dVar.b());
                                jo.p.e(num);
                                hVar2.n(num.intValue(), dVar.b());
                                linkedHashMap.put(dVar.b(), num);
                                f02.remove(num);
                                cVar.b(new c.a(num.intValue(), dVar.b()));
                            } else {
                                arrayList2.add(dVar);
                            }
                        }
                        int size4 = arrayList2.size();
                        while (i11 < size4) {
                            w1.d dVar2 = (w1.d) arrayList2.get(i11);
                            int intValue = f02.get(i11).intValue();
                            hVar2.n(intValue, dVar2.b());
                            linkedHashMap.put(dVar2.b(), Integer.valueOf(intValue));
                            cVar.b(new c.a(intValue, dVar2.b()));
                            i11++;
                        }
                    } else {
                        int size5 = list3.size();
                        while (i11 < size5) {
                            w1.d dVar3 = (w1.d) list3.get(i11);
                            int i18 = B[i11];
                            hVar2.n(i18, dVar3.b());
                            linkedHashMap.put(dVar3.b(), Integer.valueOf(i18));
                            cVar.b(new c.a(i18, dVar3.b()));
                            i11++;
                        }
                    }
                    this.f14613k.n(i10, hVar2);
                    this.f14614l.n(i10, linkedHashMap);
                    return;
                }
                throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
            }
        }
    }

    public final boolean Z(int i10, List<t1> list) {
        boolean z10;
        t1 m10 = u.m(list, i10);
        if (m10 != null) {
            z10 = false;
        } else {
            t1 t1Var = new t1(i10, this.f14627y, null, null, null, null);
            z10 = true;
            m10 = t1Var;
        }
        this.f14627y.add(m10);
        return z10;
    }

    public final boolean a0(int i10) {
        if (N() && !O(i10)) {
            int i11 = this.f14612j;
            if (i11 != Integer.MIN_VALUE) {
                f0(this, i11, C.DEFAULT_BUFFER_SEGMENT_SIZE, null, null, 12, null);
            }
            this.f14612j = i10;
            this.f14606d.invalidate();
            f0(this, i10, 32768, null, null, 12, null);
            return true;
        }
        return false;
    }

    @Override // o3.a
    public p3.d b(View view) {
        jo.p.h(view, "host");
        return this.f14611i;
    }

    public final int c0(int i10) {
        if (i10 == this.f14606d.getSemanticsOwner().a().i()) {
            return -1;
        }
        return i10;
    }

    public final boolean d0(AccessibilityEvent accessibilityEvent) {
        if (N()) {
            return this.f14606d.getParent().requestSendAccessibilityEvent(this.f14606d, accessibilityEvent);
        }
        return false;
    }

    public final boolean e0(int i10, int i11, Integer num, List<String> list) {
        if (i10 == Integer.MIN_VALUE || !N()) {
            return false;
        }
        AccessibilityEvent C = C(i10, i11);
        if (num != null) {
            C.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            C.setContentDescription(x0.j.d(list, ",", null, null, 0, null, null, 62, null));
        }
        return d0(C);
    }

    public final void g0(int i10, int i11, String str) {
        AccessibilityEvent C = C(c0(i10), 32);
        C.setContentChangeTypes(i11);
        if (str != null) {
            C.getText().add(str);
        }
        d0(C);
    }

    public final void h0(int i10) {
        f fVar = this.f14620r;
        if (fVar != null) {
            if (i10 != fVar.d().i()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f() <= 1000) {
                AccessibilityEvent C = C(c0(fVar.d().i()), 131072);
                C.setFromIndex(fVar.b());
                C.setToIndex(fVar.e());
                C.setAction(fVar.a());
                C.setMovementGranularity(fVar.c());
                C.getText().add(J(fVar.d()));
                d0(C);
            }
        }
        this.f14620r = null;
    }

    public final void i0(t1 t1Var) {
        if (t1Var.m0()) {
            this.f14606d.getSnapshotObserver().e(t1Var, this.f14628z, new k(t1Var, this));
        }
    }

    public final void j0(Map<Integer, u1> map) {
        String str;
        String g10;
        jo.p.h(map, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.f14627y);
        this.f14627y.clear();
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            g gVar = this.f14623u.get(Integer.valueOf(intValue));
            if (gVar != null) {
                u1 u1Var = map.get(Integer.valueOf(intValue));
                w1.q b10 = u1Var != null ? u1Var.b() : null;
                jo.p.e(b10);
                Iterator<Map.Entry<? extends w1.x<?>, ? extends Object>> it = b10.s().iterator();
                boolean z10 = true;
                boolean z11 = false;
                while (it.hasNext()) {
                    Map.Entry<? extends w1.x<?>, ? extends Object> next = it.next();
                    w1.x<?> key = next.getKey();
                    w1.t tVar = w1.t.f57947a;
                    if (((jo.p.c(key, tVar.i()) || jo.p.c(next.getKey(), tVar.z())) ? Z(intValue, arrayList) : false) || !jo.p.c(next.getValue(), w1.l.a(gVar.b(), next.getKey()))) {
                        w1.x<?> key2 = next.getKey();
                        if (jo.p.c(key2, tVar.o())) {
                            Object value = next.getValue();
                            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) value;
                            if (gVar.c()) {
                                g0(intValue, 8, str2);
                            }
                        } else if (jo.p.c(key2, tVar.u()) ? z10 : jo.p.c(key2, tVar.y())) {
                            f0(this, c0(intValue), 2048, 64, null, 8, null);
                            f0(this, c0(intValue), 2048, 0, null, 8, null);
                        } else {
                            boolean z12 = z10;
                            if (jo.p.c(key2, tVar.q())) {
                                f0(this, c0(intValue), 2048, 64, null, 8, null);
                                f0(this, c0(intValue), 2048, 0, null, 8, null);
                            } else if (jo.p.c(key2, tVar.t())) {
                                w1.h hVar = (w1.h) w1.l.a(b10.h(), tVar.r());
                                if (hVar == null ? false : w1.h.j(hVar.m(), w1.h.f57895b.f())) {
                                    if (jo.p.c(w1.l.a(b10.h(), tVar.t()), Boolean.TRUE)) {
                                        AccessibilityEvent C = C(c0(intValue), 4);
                                        w1.q qVar = new w1.q(b10.l(), z12);
                                        List list = (List) w1.l.a(qVar.h(), tVar.c());
                                        String d10 = list != null ? x0.j.d(list, ",", null, null, 0, null, null, 62, null) : null;
                                        List list2 = (List) w1.l.a(qVar.h(), tVar.w());
                                        String d11 = list2 != null ? x0.j.d(list2, ",", null, null, 0, null, null, 62, null) : null;
                                        if (d10 != null) {
                                            C.setContentDescription(d10);
                                            wn.v vVar = wn.v.f59242a;
                                        }
                                        if (d11 != null) {
                                            C.getText().add(d11);
                                        }
                                        d0(C);
                                    } else {
                                        f0(this, c0(intValue), 2048, 0, null, 8, null);
                                    }
                                } else {
                                    f0(this, c0(intValue), 2048, 64, null, 8, null);
                                    f0(this, c0(intValue), 2048, 0, null, 8, null);
                                }
                            } else if (jo.p.c(key2, tVar.c())) {
                                int c02 = c0(intValue);
                                Object value2 = next.getValue();
                                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                e0(c02, 2048, 4, (List) value2);
                            } else {
                                str = "";
                                if (jo.p.c(key2, tVar.e())) {
                                    if (u.h(b10)) {
                                        y1.a L = L(gVar.b());
                                        if (L == null) {
                                            L = "";
                                        }
                                        y1.a L2 = L(b10.s());
                                        str = L2 != null ? L2 : "";
                                        int length = L.length();
                                        int length2 = str.length();
                                        int i10 = po.n.i(length, length2);
                                        int i11 = 0;
                                        while (i11 < i10 && L.charAt(i11) == str.charAt(i11)) {
                                            i11++;
                                        }
                                        int i12 = 0;
                                        while (i12 < i10 - i11) {
                                            int i13 = i10;
                                            if (L.charAt((length - 1) - i12) != str.charAt((length2 - 1) - i12)) {
                                                break;
                                            }
                                            i12++;
                                            i10 = i13;
                                        }
                                        AccessibilityEvent C2 = C(c0(intValue), 16);
                                        C2.setFromIndex(i11);
                                        C2.setRemovedCount((length - i12) - i11);
                                        C2.setAddedCount((length2 - i12) - i11);
                                        C2.setBeforeText(L);
                                        C2.getText().add(r0(str, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND));
                                        d0(C2);
                                    } else {
                                        f0(this, c0(intValue), 2048, 2, null, 8, null);
                                    }
                                } else if (jo.p.c(key2, tVar.x())) {
                                    y1.a L3 = L(b10.s());
                                    if (L3 != null && (g10 = L3.g()) != null) {
                                        str = g10;
                                    }
                                    long r10 = ((y1.b0) b10.s().k(tVar.x())).r();
                                    d0(E(c0(intValue), Integer.valueOf(y1.b0.n(r10)), Integer.valueOf(y1.b0.i(r10)), Integer.valueOf(str.length()), (String) r0(str, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND)));
                                    h0(b10.i());
                                } else if (jo.p.c(key2, tVar.i()) ? true : jo.p.c(key2, tVar.z())) {
                                    Q(b10.k());
                                    t1 m10 = u.m(this.f14627y, intValue);
                                    jo.p.e(m10);
                                    m10.f((w1.i) w1.l.a(b10.s(), tVar.i()));
                                    m10.i((w1.i) w1.l.a(b10.s(), tVar.z()));
                                    i0(m10);
                                } else if (jo.p.c(key2, tVar.g())) {
                                    Object value3 = next.getValue();
                                    Objects.requireNonNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                    if (((Boolean) value3).booleanValue()) {
                                        d0(C(c0(b10.i()), 8));
                                    }
                                    f0(this, c0(b10.i()), 2048, 0, null, 8, null);
                                } else {
                                    w1.j jVar = w1.j.f57906a;
                                    if (jo.p.c(key2, jVar.c())) {
                                        List list3 = (List) b10.s().k(jVar.c());
                                        List list4 = (List) w1.l.a(gVar.b(), jVar.c());
                                        if (list4 != null) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            int size = list3.size();
                                            for (int i14 = 0; i14 < size; i14++) {
                                                linkedHashSet.add(((w1.d) list3.get(i14)).b());
                                            }
                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                            int size2 = list4.size();
                                            for (int i15 = 0; i15 < size2; i15++) {
                                                linkedHashSet2.add(((w1.d) list4.get(i15)).b());
                                            }
                                            z11 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                        } else if (!list3.isEmpty()) {
                                            z10 = true;
                                            z11 = true;
                                        }
                                    } else if (next.getValue() instanceof w1.a) {
                                        Object value4 = next.getValue();
                                        Objects.requireNonNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                        z10 = true;
                                        z11 = !u.a((w1.a) value4, w1.l.a(gVar.b(), next.getKey()));
                                    } else {
                                        z11 = true;
                                        z10 = true;
                                    }
                                }
                            }
                        }
                    }
                    z10 = true;
                }
                if (!z11) {
                    z11 = u.i(b10, gVar);
                }
                if (z11) {
                    f0(this, c0(intValue), 2048, 0, null, 8, null);
                }
            }
        }
    }

    public final void k0(w1.q qVar, g gVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<w1.q> o10 = qVar.o();
        int size = o10.size();
        for (int i10 = 0; i10 < size; i10++) {
            w1.q qVar2 = o10.get(i10);
            if (I().containsKey(Integer.valueOf(qVar2.i()))) {
                if (!gVar.a().contains(Integer.valueOf(qVar2.i()))) {
                    Q(qVar.k());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(qVar2.i()));
            }
        }
        for (Integer num : gVar.a()) {
            if (!linkedHashSet.contains(Integer.valueOf(num.intValue()))) {
                Q(qVar.k());
                return;
            }
        }
        List<w1.q> o11 = qVar.o();
        int size2 = o11.size();
        for (int i11 = 0; i11 < size2; i11++) {
            w1.q qVar3 = o11.get(i11);
            if (I().containsKey(Integer.valueOf(qVar3.i()))) {
                g gVar2 = this.f14623u.get(Integer.valueOf(qVar3.i()));
                jo.p.e(gVar2);
                k0(qVar3, gVar2);
            }
        }
    }

    public final void l0(s1.k kVar, s.b<Integer> bVar) {
        s1.k d10;
        w1.m j10;
        if (kVar.L0() && !this.f14606d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(kVar)) {
            w1.m j11 = w1.r.j(kVar);
            if (j11 == null) {
                s1.k d11 = u.d(kVar, n.f14651w);
                j11 = d11 != null ? w1.r.j(d11) : null;
                if (j11 == null) {
                    return;
                }
            }
            if (!j11.j().s() && (d10 = u.d(kVar, m.f14650w)) != null && (j10 = w1.r.j(d10)) != null) {
                j11 = j10;
            }
            int id2 = j11.c().getId();
            if (bVar.add(Integer.valueOf(id2))) {
                f0(this, c0(id2), 2048, 1, null, 8, null);
            }
        }
    }

    public final boolean m0(w1.q qVar, int i10, int i11, boolean z10) {
        String J;
        w1.k s10 = qVar.s();
        w1.j jVar = w1.j.f57906a;
        if (s10.g(jVar.o()) && u.b(qVar)) {
            io.q qVar2 = (io.q) ((w1.a) qVar.s().k(jVar.o())).a();
            if (qVar2 != null) {
                return ((Boolean) qVar2.s0(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        } else if ((i10 == i11 && i11 == this.f14615m) || (J = J(qVar)) == null) {
            return false;
        } else {
            this.f14615m = (i10 < 0 || i10 != i11 || i11 > J.length()) ? -1 : -1;
            boolean z11 = J.length() > 0;
            d0(E(c0(qVar.i()), z11 ? Integer.valueOf(this.f14615m) : null, z11 ? Integer.valueOf(this.f14615m) : null, z11 ? Integer.valueOf(J.length()) : null, J));
            h0(qVar.i());
            return true;
        }
    }

    public final void n0(w1.q qVar, p3.c cVar) {
        w1.k s10 = qVar.s();
        w1.t tVar = w1.t.f57947a;
        if (s10.g(tVar.f())) {
            cVar.g0(true);
            cVar.k0((CharSequence) w1.l.a(qVar.s(), tVar.f()));
        }
    }

    public final void o0(w1.q qVar, p3.c cVar) {
        y1.a aVar;
        l.b fontFamilyResolver = this.f14606d.getFontFamilyResolver();
        y1.a L = L(qVar.s());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) r0(L != null ? g2.a.b(L, this.f14606d.getDensity(), fontFamilyResolver) : null, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
        List list = (List) w1.l.a(qVar.s(), w1.t.f57947a.w());
        if (list != null && (aVar = (y1.a) xn.a0.Z(list)) != null) {
            spannableString = g2.a.b(aVar, this.f14606d.getDensity(), fontFamilyResolver);
        }
        SpannableString spannableString3 = (SpannableString) r0(spannableString, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
        if (spannableString2 == null) {
            spannableString2 = spannableString3;
        }
        cVar.G0(spannableString2);
    }

    public final RectF p0(w1.q qVar, b1.h hVar) {
        if (qVar == null) {
            return null;
        }
        b1.h r10 = hVar.r(qVar.n());
        b1.h f10 = qVar.f();
        b1.h o10 = r10.p(f10) ? r10.o(f10) : null;
        if (o10 != null) {
            long t10 = this.f14606d.t(b1.g.a(o10.i(), o10.l()));
            long t11 = this.f14606d.t(b1.g.a(o10.j(), o10.e()));
            return new RectF(b1.f.m(t10), b1.f.n(t10), b1.f.m(t11), b1.f.n(t11));
        }
        return null;
    }

    public final boolean q0(w1.q qVar, int i10, boolean z10, boolean z11) {
        androidx.compose.ui.platform.g K;
        int i11;
        int i12;
        int i13 = qVar.i();
        Integer num = this.f14616n;
        if (num == null || i13 != num.intValue()) {
            this.f14615m = -1;
            this.f14616n = Integer.valueOf(qVar.i());
        }
        String J = J(qVar);
        if ((J == null || J.length() == 0) || (K = K(qVar, i10)) == null) {
            return false;
        }
        int G = G(qVar);
        if (G == -1) {
            G = z10 ? 0 : J.length();
        }
        int[] a10 = z10 ? K.a(G) : K.b(G);
        if (a10 == null) {
            return false;
        }
        int i14 = a10[0];
        int i15 = a10[1];
        if (z11 && P(qVar)) {
            i11 = H(qVar);
            if (i11 == -1) {
                i11 = z10 ? i14 : i15;
            }
            i12 = z10 ? i15 : i14;
        } else {
            i11 = z10 ? i15 : i14;
            i12 = i11;
        }
        this.f14620r = new f(qVar, z10 ? 256 : 512, i10, i14, i15, SystemClock.uptimeMillis());
        m0(qVar, i11, i12, true);
        return true;
    }

    public final <T extends CharSequence> T r0(T t10, int i10) {
        boolean z10 = true;
        if (i10 > 0) {
            if (t10 != null && t10.length() != 0) {
                z10 = false;
            }
            if (z10 || t10.length() <= i10) {
                return t10;
            }
            int i11 = i10 - 1;
            if (Character.isHighSurrogate(t10.charAt(i11)) && Character.isLowSurrogate(t10.charAt(i10))) {
                i10 = i11;
            }
            return (T) t10.subSequence(0, i10);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void s0(int i10) {
        int i11 = this.f14607e;
        if (i11 == i10) {
            return;
        }
        this.f14607e = i10;
        f0(this, i10, 128, null, null, 12, null);
        f0(this, i11, 256, null, null, 12, null);
    }

    public final void t0() {
        w1.k b10;
        Iterator<Integer> it = this.f14622t.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            u1 u1Var = I().get(next);
            String str = null;
            w1.q b11 = u1Var != null ? u1Var.b() : null;
            if (b11 == null || !u.e(b11)) {
                this.f14622t.remove(next);
                jo.p.g(next, TtmlNode.ATTR_ID);
                int intValue = next.intValue();
                g gVar = this.f14623u.get(next);
                if (gVar != null && (b10 = gVar.b()) != null) {
                    str = (String) w1.l.a(b10, w1.t.f57947a.o());
                }
                g0(intValue, 32, str);
            }
        }
        this.f14623u.clear();
        for (Map.Entry<Integer, u1> entry : I().entrySet()) {
            if (u.e(entry.getValue().b()) && this.f14622t.add(entry.getKey())) {
                g0(entry.getKey().intValue(), 16, (String) entry.getValue().b().s().k(w1.t.f57947a.o()));
            }
            this.f14623u.put(entry.getKey(), new g(entry.getValue().b(), I()));
        }
        this.f14624v = new g(this.f14606d.getSemanticsOwner().a(), I());
    }

    public final void w(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        w1.q b10;
        String str2;
        u1 u1Var = I().get(Integer.valueOf(i10));
        if (u1Var == null || (b10 = u1Var.b()) == null) {
            return;
        }
        String J = J(b10);
        w1.k s10 = b10.s();
        w1.j jVar = w1.j.f57906a;
        if (s10.g(jVar.g()) && bundle != null && jo.p.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i12 > 0 && i11 >= 0) {
                if (i11 < (J != null ? J.length() : Integer.MAX_VALUE)) {
                    ArrayList arrayList = new ArrayList();
                    io.l lVar = (io.l) ((w1.a) b10.s().k(jVar.g())).a();
                    if (jo.p.c(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                        y1.z zVar = (y1.z) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < i12; i13++) {
                            int i14 = i11 + i13;
                            if (i14 >= zVar.k().j().length()) {
                                arrayList2.add(null);
                            } else {
                                arrayList2.add(p0(b10, zVar.c(i14)));
                            }
                        }
                        Bundle extras = accessibilityNodeInfo.getExtras();
                        Object[] array = arrayList2.toArray(new RectF[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        extras.putParcelableArray(str, (Parcelable[]) array);
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        w1.k s11 = b10.s();
        w1.t tVar = w1.t.f57947a;
        if (!s11.g(tVar.v()) || bundle == null || !jo.p.c(str, "androidx.compose.ui.semantics.testTag") || (str2 = (String) w1.l.a(b10.s(), tVar.v())) == null) {
            return;
        }
        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a0, B:38:0x00a7, B:39:0x00b0, B:18:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c3 -> B:14:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(ao.d<? super wn.v> r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.x(ao.d):java.lang.Object");
    }

    public final boolean y(boolean z10, int i10, long j10) {
        return z(I().values(), z10, i10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(java.util.Collection<androidx.compose.ui.platform.u1> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            jo.p.h(r6, r0)
            b1.f$a r0 = b1.f.f16721b
            long r0 = r0.b()
            boolean r0 = b1.f.j(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lb8
            boolean r0 = b1.f.p(r9)
            if (r0 != 0) goto L1a
            goto Lb8
        L1a:
            r0 = 1
            if (r7 != r0) goto L24
            w1.t r7 = w1.t.f57947a
            w1.x r7 = r7.z()
            goto L2c
        L24:
            if (r7 != 0) goto Lb2
            w1.t r7 = w1.t.f57947a
            w1.x r7 = r7.i()
        L2c:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L34
            goto Lb1
        L34:
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.u1 r2 = (androidx.compose.ui.platform.u1) r2
            android.graphics.Rect r3 = r2.a()
            b1.h r3 = c1.z0.c(r3)
            boolean r3 = r3.b(r9)
            if (r3 != 0) goto L54
        L52:
            r2 = r1
            goto Lae
        L54:
            w1.q r2 = r2.b()
            w1.k r2 = r2.h()
            java.lang.Object r2 = w1.l.a(r2, r7)
            w1.i r2 = (w1.i) r2
            if (r2 != 0) goto L65
            goto L52
        L65:
            boolean r3 = r2.b()
            if (r3 == 0) goto L6d
            int r3 = -r8
            goto L6e
        L6d:
            r3 = r8
        L6e:
            if (r8 != 0) goto L77
            boolean r4 = r2.b()
            if (r4 == 0) goto L77
            r3 = -1
        L77:
            if (r3 >= 0) goto L8d
            io.a r2 = r2.c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L52
            goto Lad
        L8d:
            io.a r3 = r2.c()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            io.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L52
        Lad:
            r2 = r0
        Lae:
            if (r2 == 0) goto L38
            r1 = r0
        Lb1:
            return r1
        Lb2:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.z(java.util.Collection, boolean, int, long):boolean");
    }
}
