package y;

import x0.a;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static final w f60729a = c(1.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final w f60730b = a(1.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final w f60731c = b(1.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final w1 f60732d;

    /* renamed from: e  reason: collision with root package name */
    public static final w1 f60733e;

    /* renamed from: f  reason: collision with root package name */
    public static final w1 f60734f;

    /* renamed from: g  reason: collision with root package name */
    public static final w1 f60735g;

    /* renamed from: h  reason: collision with root package name */
    public static final w1 f60736h;

    /* renamed from: i  reason: collision with root package name */
    public static final w1 f60737i;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60738w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10) {
            super(1);
            this.f60738w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$$receiver");
            c1Var.b("fillMaxHeight");
            c1Var.a().b("fraction", Float.valueOf(this.f60738w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60739w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10) {
            super(1);
            this.f60739w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$$receiver");
            c1Var.b("fillMaxSize");
            c1Var.a().b("fraction", Float.valueOf(this.f60739w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60740w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10) {
            super(1);
            this.f60740w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$$receiver");
            c1Var.b("fillMaxWidth");
            c1Var.a().b("fraction", Float.valueOf(this.f60740w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<m2.o, m2.q, m2.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a.c f60741w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a.c cVar) {
            super(2);
            this.f60741w = cVar;
        }

        public final long a(long j10, m2.q qVar) {
            jo.p.h(qVar, "<anonymous parameter 1>");
            return m2.l.a(0, this.f60741w.a(0, m2.o.f(j10)));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ m2.k invoke(m2.o oVar, m2.q qVar) {
            return m2.k.b(a(oVar.j(), qVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a.c f60742w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f60743x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a.c cVar, boolean z10) {
            super(1);
            this.f60742w = cVar;
            this.f60743x = z10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$$receiver");
            c1Var.b("wrapContentHeight");
            c1Var.a().b("align", this.f60742w);
            c1Var.a().b("unbounded", Boolean.valueOf(this.f60743x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<m2.o, m2.q, m2.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.a f60744w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x0.a aVar) {
            super(2);
            this.f60744w = aVar;
        }

        public final long a(long j10, m2.q qVar) {
            jo.p.h(qVar, "layoutDirection");
            return this.f60744w.a(m2.o.f40537b.a(), j10, qVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ m2.k invoke(m2.o oVar, m2.q qVar) {
            return m2.k.b(a(oVar.j(), qVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.a f60745w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f60746x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x0.a aVar, boolean z10) {
            super(1);
            this.f60745w = aVar;
            this.f60746x = z10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$$receiver");
            c1Var.b("wrapContentSize");
            c1Var.a().b("align", this.f60745w);
            c1Var.a().b("unbounded", Boolean.valueOf(this.f60746x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.p<m2.o, m2.q, m2.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a.b f60747w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a.b bVar) {
            super(2);
            this.f60747w = bVar;
        }

        public final long a(long j10, m2.q qVar) {
            jo.p.h(qVar, "layoutDirection");
            return m2.l.a(this.f60747w.a(0, m2.o.g(j10), qVar), 0);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ m2.k invoke(m2.o oVar, m2.q qVar) {
            return m2.k.b(a(oVar.j(), qVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a.b f60748w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f60749x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(a.b bVar, boolean z10) {
            super(1);
            this.f60748w = bVar;
            this.f60749x = z10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$$receiver");
            c1Var.b("wrapContentWidth");
            c1Var.a().b("align", this.f60748w);
            c1Var.a().b("unbounded", Boolean.valueOf(this.f60749x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60750w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f60751x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f10, float f11) {
            super(1);
            this.f60750w = f10;
            this.f60751x = f11;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("defaultMinSize");
            c1Var.a().b("minWidth", m2.g.e(this.f60750w));
            c1Var.a().b("minHeight", m2.g.e(this.f60751x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60752w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f10) {
            super(1);
            this.f60752w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("height");
            c1Var.c(m2.g.e(this.f60752w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60753w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f60754x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f10, float f11) {
            super(1);
            this.f60753w = f10;
            this.f60754x = f11;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("heightIn");
            c1Var.a().b("min", m2.g.e(this.f60753w));
            c1Var.a().b("max", m2.g.e(this.f60754x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60755w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f10) {
            super(1);
            this.f60755w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("requiredSize");
            c1Var.c(m2.g.e(this.f60755w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60756w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f60757x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(float f10, float f11) {
            super(1);
            this.f60756w = f10;
            this.f60757x = f11;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("requiredSize");
            c1Var.a().b("width", m2.g.e(this.f60756w));
            c1Var.a().b("height", m2.g.e(this.f60757x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60758w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(float f10) {
            super(1);
            this.f60758w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("requiredWidth");
            c1Var.c(m2.g.e(this.f60758w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60759w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(float f10) {
            super(1);
            this.f60759w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("size");
            c1Var.c(m2.g.e(this.f60759w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60760w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f60761x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(float f10, float f11) {
            super(1);
            this.f60760w = f10;
            this.f60761x = f11;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("size");
            c1Var.a().b("width", m2.g.e(this.f60760w));
            c1Var.a().b("height", m2.g.e(this.f60761x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60762w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f60763x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f60764y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f60765z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(float f10, float f11, float f12, float f13) {
            super(1);
            this.f60762w = f10;
            this.f60763x = f11;
            this.f60764y = f12;
            this.f60765z = f13;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("sizeIn");
            c1Var.a().b("minWidth", m2.g.e(this.f60762w));
            c1Var.a().b("minHeight", m2.g.e(this.f60763x));
            c1Var.a().b("maxWidth", m2.g.e(this.f60764y));
            c1Var.a().b("maxHeight", m2.g.e(this.f60765z));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60766w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(float f10) {
            super(1);
            this.f60766w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("width");
            c1Var.c(m2.g.e(this.f60766w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60767w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f60768x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(float f10, float f11) {
            super(1);
            this.f60767w = f10;
            this.f60768x = f11;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("widthIn");
            c1Var.a().b("min", m2.g.e(this.f60767w));
            c1Var.a().b("max", m2.g.e(this.f60768x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    static {
        a.C0986a c0986a = x0.a.f59327a;
        f60732d = f(c0986a.g(), false);
        f60733e = f(c0986a.k(), false);
        f60734f = d(c0986a.i(), false);
        f60735g = d(c0986a.l(), false);
        f60736h = e(c0986a.e(), false);
        f60737i = e(c0986a.o(), false);
    }

    public static /* synthetic */ x0.f A(x0.f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.f40516x.b();
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.f40516x.b();
        }
        return z(fVar, f10, f11);
    }

    public static final x0.f B(x0.f fVar, a.c cVar, boolean z10) {
        w1 d10;
        jo.p.h(fVar, "<this>");
        jo.p.h(cVar, "align");
        a.C0986a c0986a = x0.a.f59327a;
        if (jo.p.c(cVar, c0986a.i()) && !z10) {
            d10 = f60734f;
        } else if (jo.p.c(cVar, c0986a.l()) && !z10) {
            d10 = f60735g;
        } else {
            d10 = d(cVar, z10);
        }
        return fVar.L(d10);
    }

    public static /* synthetic */ x0.f C(x0.f fVar, a.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = x0.a.f59327a.i();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B(fVar, cVar, z10);
    }

    public static final x0.f D(x0.f fVar, x0.a aVar, boolean z10) {
        w1 e10;
        jo.p.h(fVar, "<this>");
        jo.p.h(aVar, "align");
        a.C0986a c0986a = x0.a.f59327a;
        if (jo.p.c(aVar, c0986a.e()) && !z10) {
            e10 = f60736h;
        } else if (jo.p.c(aVar, c0986a.o()) && !z10) {
            e10 = f60737i;
        } else {
            e10 = e(aVar, z10);
        }
        return fVar.L(e10);
    }

    public static /* synthetic */ x0.f E(x0.f fVar, x0.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = x0.a.f59327a.e();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return D(fVar, aVar, z10);
    }

    public static final x0.f F(x0.f fVar, a.b bVar, boolean z10) {
        w1 f10;
        jo.p.h(fVar, "<this>");
        jo.p.h(bVar, "align");
        a.C0986a c0986a = x0.a.f59327a;
        if (jo.p.c(bVar, c0986a.g()) && !z10) {
            f10 = f60732d;
        } else if (jo.p.c(bVar, c0986a.k()) && !z10) {
            f10 = f60733e;
        } else {
            f10 = f(bVar, z10);
        }
        return fVar.L(f10);
    }

    public static /* synthetic */ x0.f G(x0.f fVar, a.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = x0.a.f59327a.g();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return F(fVar, bVar, z10);
    }

    public static final w a(float f10) {
        return new w(y.t.Vertical, f10, new a(f10));
    }

    public static final w b(float f10) {
        return new w(y.t.Both, f10, new b(f10));
    }

    public static final w c(float f10) {
        return new w(y.t.Horizontal, f10, new c(f10));
    }

    public static final w1 d(a.c cVar, boolean z10) {
        return new w1(y.t.Vertical, z10, new d(cVar), cVar, new e(cVar, z10));
    }

    public static final w1 e(x0.a aVar, boolean z10) {
        return new w1(y.t.Both, z10, new f(aVar), aVar, new g(aVar, z10));
    }

    public static final w1 f(a.b bVar, boolean z10) {
        return new w1(y.t.Horizontal, z10, new h(bVar), bVar, new i(bVar, z10));
    }

    public static final x0.f g(x0.f fVar, float f10, float f11) {
        jo.p.h(fVar, "$this$defaultMinSize");
        return fVar.L(new k1(f10, f11, androidx.compose.ui.platform.a1.c() ? new j(f10, f11) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static /* synthetic */ x0.f h(x0.f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.f40516x.b();
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.f40516x.b();
        }
        return g(fVar, f10, f11);
    }

    public static final x0.f i(x0.f fVar, float f10) {
        jo.p.h(fVar, "<this>");
        return fVar.L((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0 ? f60730b : a(f10));
    }

    public static /* synthetic */ x0.f j(x0.f fVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return i(fVar, f10);
    }

    public static final x0.f k(x0.f fVar, float f10) {
        jo.p.h(fVar, "<this>");
        return fVar.L((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0 ? f60731c : b(f10));
    }

    public static /* synthetic */ x0.f l(x0.f fVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return k(fVar, f10);
    }

    public static final x0.f m(x0.f fVar, float f10) {
        jo.p.h(fVar, "<this>");
        return fVar.L((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0 ? f60729a : c(f10));
    }

    public static /* synthetic */ x0.f n(x0.f fVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return m(fVar, f10);
    }

    public static final x0.f o(x0.f fVar, float f10) {
        jo.p.h(fVar, "$this$height");
        return fVar.L(new f1(0.0f, f10, 0.0f, f10, true, androidx.compose.ui.platform.a1.c() ? new k(f10) : androidx.compose.ui.platform.a1.a(), 5, null));
    }

    public static final x0.f p(x0.f fVar, float f10, float f11) {
        jo.p.h(fVar, "$this$heightIn");
        return fVar.L(new f1(0.0f, f10, 0.0f, f11, true, androidx.compose.ui.platform.a1.c() ? new l(f10, f11) : androidx.compose.ui.platform.a1.a(), 5, null));
    }

    public static /* synthetic */ x0.f q(x0.f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.f40516x.b();
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.f40516x.b();
        }
        return p(fVar, f10, f11);
    }

    public static final x0.f r(x0.f fVar, float f10) {
        jo.p.h(fVar, "$this$requiredSize");
        return fVar.L(new f1(f10, f10, f10, f10, false, androidx.compose.ui.platform.a1.c() ? new m(f10) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static final x0.f s(x0.f fVar, float f10, float f11) {
        jo.p.h(fVar, "$this$requiredSize");
        return fVar.L(new f1(f10, f11, f10, f11, false, androidx.compose.ui.platform.a1.c() ? new n(f10, f11) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static final x0.f t(x0.f fVar, float f10) {
        jo.p.h(fVar, "$this$requiredWidth");
        return fVar.L(new f1(f10, 0.0f, f10, 0.0f, false, androidx.compose.ui.platform.a1.c() ? new o(f10) : androidx.compose.ui.platform.a1.a(), 10, null));
    }

    public static final x0.f u(x0.f fVar, float f10) {
        jo.p.h(fVar, "$this$size");
        return fVar.L(new f1(f10, f10, f10, f10, true, androidx.compose.ui.platform.a1.c() ? new p(f10) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static final x0.f v(x0.f fVar, float f10, float f11) {
        jo.p.h(fVar, "$this$size");
        return fVar.L(new f1(f10, f11, f10, f11, true, androidx.compose.ui.platform.a1.c() ? new q(f10, f11) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static final x0.f w(x0.f fVar, float f10, float f11, float f12, float f13) {
        jo.p.h(fVar, "$this$sizeIn");
        return fVar.L(new f1(f10, f11, f12, f13, true, androidx.compose.ui.platform.a1.c() ? new r(f10, f11, f12, f13) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static /* synthetic */ x0.f x(x0.f fVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.f40516x.b();
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.f40516x.b();
        }
        if ((i10 & 4) != 0) {
            f12 = m2.g.f40516x.b();
        }
        if ((i10 & 8) != 0) {
            f13 = m2.g.f40516x.b();
        }
        return w(fVar, f10, f11, f12, f13);
    }

    public static final x0.f y(x0.f fVar, float f10) {
        jo.p.h(fVar, "$this$width");
        return fVar.L(new f1(f10, 0.0f, f10, 0.0f, true, androidx.compose.ui.platform.a1.c() ? new s(f10) : androidx.compose.ui.platform.a1.a(), 10, null));
    }

    public static final x0.f z(x0.f fVar, float f10, float f11) {
        jo.p.h(fVar, "$this$widthIn");
        return fVar.L(new f1(f10, 0.0f, f11, 0.0f, true, androidx.compose.ui.platform.a1.c() ? new t(f10, f11) : androidx.compose.ui.platform.a1.a(), 10, null));
    }
}
