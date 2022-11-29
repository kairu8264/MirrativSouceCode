package w1;

import java.util.List;
import xn.a0;
import y1.b0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f57947a = new t();

    /* renamed from: b  reason: collision with root package name */
    public static final x<List<String>> f57948b = new x<>("ContentDescription", a.f57973w);

    /* renamed from: c  reason: collision with root package name */
    public static final x<String> f57949c = new x<>("StateDescription", null, 2, null);

    /* renamed from: d  reason: collision with root package name */
    public static final x<w1.g> f57950d = new x<>("ProgressBarRangeInfo", null, 2, null);

    /* renamed from: e  reason: collision with root package name */
    public static final x<String> f57951e = new x<>("PaneTitle", e.f57977w);

    /* renamed from: f  reason: collision with root package name */
    public static final x<wn.v> f57952f = new x<>("SelectableGroup", null, 2, null);

    /* renamed from: g  reason: collision with root package name */
    public static final x<w1.b> f57953g = new x<>("CollectionInfo", null, 2, null);

    /* renamed from: h  reason: collision with root package name */
    public static final x<w1.c> f57954h = new x<>("CollectionItemInfo", null, 2, null);

    /* renamed from: i  reason: collision with root package name */
    public static final x<wn.v> f57955i = new x<>("Heading", null, 2, null);

    /* renamed from: j  reason: collision with root package name */
    public static final x<wn.v> f57956j = new x<>("Disabled", null, 2, null);

    /* renamed from: k  reason: collision with root package name */
    public static final x<w1.e> f57957k = new x<>("LiveRegion", null, 2, null);

    /* renamed from: l  reason: collision with root package name */
    public static final x<Boolean> f57958l = new x<>("Focused", null, 2, null);

    /* renamed from: m  reason: collision with root package name */
    public static final x<wn.v> f57959m = new x<>("InvisibleToUser", b.f57974w);

    /* renamed from: n  reason: collision with root package name */
    public static final x<i> f57960n = new x<>("HorizontalScrollAxisRange", null, 2, null);

    /* renamed from: o  reason: collision with root package name */
    public static final x<i> f57961o = new x<>("VerticalScrollAxisRange", null, 2, null);

    /* renamed from: p  reason: collision with root package name */
    public static final x<wn.v> f57962p = new x<>("IsPopup", d.f57976w);

    /* renamed from: q  reason: collision with root package name */
    public static final x<wn.v> f57963q = new x<>("IsDialog", c.f57975w);

    /* renamed from: r  reason: collision with root package name */
    public static final x<w1.h> f57964r = new x<>("Role", f.f57978w);

    /* renamed from: s  reason: collision with root package name */
    public static final x<String> f57965s = new x<>("TestTag", g.f57979w);

    /* renamed from: t  reason: collision with root package name */
    public static final x<List<y1.a>> f57966t = new x<>("Text", h.f57980w);

    /* renamed from: u  reason: collision with root package name */
    public static final x<y1.a> f57967u = new x<>("EditableText", null, 2, null);

    /* renamed from: v  reason: collision with root package name */
    public static final x<b0> f57968v = new x<>("TextSelectionRange", null, 2, null);

    /* renamed from: w  reason: collision with root package name */
    public static final x<e2.l> f57969w = new x<>("ImeAction", null, 2, null);

    /* renamed from: x  reason: collision with root package name */
    public static final x<Boolean> f57970x = new x<>("Selected", null, 2, null);

    /* renamed from: y  reason: collision with root package name */
    public static final x<x1.a> f57971y = new x<>("ToggleableState", null, 2, null);

    /* renamed from: z  reason: collision with root package name */
    public static final x<wn.v> f57972z = new x<>("Password", null, 2, null);
    public static final x<String> A = new x<>("Error", null, 2, null);
    public static final x<io.l<Object, Integer>> B = new x<>("IndexForKey", null, 2, null);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f57973w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final List<String> invoke(List<String> list, List<String> list2) {
            List<String> D0;
            jo.p.h(list2, "childValue");
            if (list == null || (D0 = a0.D0(list)) == null) {
                return list2;
            }
            D0.addAll(list2);
            return D0;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<wn.v, wn.v, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f57974w = new b();

        public b() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final wn.v invoke(wn.v vVar, wn.v vVar2) {
            jo.p.h(vVar2, "<anonymous parameter 1>");
            return vVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<wn.v, wn.v, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f57975w = new c();

        public c() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final wn.v invoke(wn.v vVar, wn.v vVar2) {
            jo.p.h(vVar2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<wn.v, wn.v, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f57976w = new d();

        public d() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final wn.v invoke(wn.v vVar, wn.v vVar2) {
            jo.p.h(vVar2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<String, String, String> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f57977w = new e();

        public e() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final String invoke(String str, String str2) {
            jo.p.h(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<w1.h, w1.h, w1.h> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f57978w = new f();

        public f() {
            super(2);
        }

        public final w1.h a(w1.h hVar, int i10) {
            return hVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ w1.h invoke(w1.h hVar, w1.h hVar2) {
            return a(hVar, hVar2.m());
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<String, String, String> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f57979w = new g();

        public g() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final String invoke(String str, String str2) {
            jo.p.h(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.p<List<? extends y1.a>, List<? extends y1.a>, List<? extends y1.a>> {

        /* renamed from: w  reason: collision with root package name */
        public static final h f57980w = new h();

        public h() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final List<y1.a> invoke(List<y1.a> list, List<y1.a> list2) {
            List<y1.a> D0;
            jo.p.h(list2, "childValue");
            if (list == null || (D0 = a0.D0(list)) == null) {
                return list2;
            }
            D0.addAll(list2);
            return D0;
        }
    }

    public final x<w1.b> a() {
        return f57953g;
    }

    public final x<w1.c> b() {
        return f57954h;
    }

    public final x<List<String>> c() {
        return f57948b;
    }

    public final x<wn.v> d() {
        return f57956j;
    }

    public final x<y1.a> e() {
        return f57967u;
    }

    public final x<String> f() {
        return A;
    }

    public final x<Boolean> g() {
        return f57958l;
    }

    public final x<wn.v> h() {
        return f57955i;
    }

    public final x<i> i() {
        return f57960n;
    }

    public final x<e2.l> j() {
        return f57969w;
    }

    public final x<io.l<Object, Integer>> k() {
        return B;
    }

    public final x<wn.v> l() {
        return f57959m;
    }

    public final x<wn.v> m() {
        return f57962p;
    }

    public final x<w1.e> n() {
        return f57957k;
    }

    public final x<String> o() {
        return f57951e;
    }

    public final x<wn.v> p() {
        return f57972z;
    }

    public final x<w1.g> q() {
        return f57950d;
    }

    public final x<w1.h> r() {
        return f57964r;
    }

    public final x<wn.v> s() {
        return f57952f;
    }

    public final x<Boolean> t() {
        return f57970x;
    }

    public final x<String> u() {
        return f57949c;
    }

    public final x<String> v() {
        return f57965s;
    }

    public final x<List<y1.a>> w() {
        return f57966t;
    }

    public final x<b0> x() {
        return f57968v;
    }

    public final x<x1.a> y() {
        return f57971y;
    }

    public final x<i> z() {
        return f57961o;
    }
}
