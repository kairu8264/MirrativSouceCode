package j6;

import a6.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import coil.target.ImageViewTarget;
import d6.h;
import ep.u;
import h6.c;
import j6.n;
import java.util.List;
import java.util.Map;
import n6.c;
import uo.k0;
import xn.n0;

/* loaded from: classes.dex */
public final class i {
    public final androidx.lifecycle.o A;
    public final k6.i B;
    public final k6.g C;
    public final n D;
    public final c.b E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final c L;
    public final j6.b M;

    /* renamed from: a  reason: collision with root package name */
    public final Context f37151a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f37152b;

    /* renamed from: c  reason: collision with root package name */
    public final l6.a f37153c;

    /* renamed from: d  reason: collision with root package name */
    public final b f37154d;

    /* renamed from: e  reason: collision with root package name */
    public final c.b f37155e;

    /* renamed from: f  reason: collision with root package name */
    public final String f37156f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f37157g;

    /* renamed from: h  reason: collision with root package name */
    public final ColorSpace f37158h;

    /* renamed from: i  reason: collision with root package name */
    public final k6.d f37159i;

    /* renamed from: j  reason: collision with root package name */
    public final wn.k<h.a<?>, Class<?>> f37160j;

    /* renamed from: k  reason: collision with root package name */
    public final g.a f37161k;

    /* renamed from: l  reason: collision with root package name */
    public final List<m6.c> f37162l;

    /* renamed from: m  reason: collision with root package name */
    public final c.a f37163m;

    /* renamed from: n  reason: collision with root package name */
    public final u f37164n;

    /* renamed from: o  reason: collision with root package name */
    public final q f37165o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f37166p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f37167q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f37168r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f37169s;

    /* renamed from: t  reason: collision with root package name */
    public final j6.a f37170t;

    /* renamed from: u  reason: collision with root package name */
    public final j6.a f37171u;

    /* renamed from: v  reason: collision with root package name */
    public final j6.a f37172v;

    /* renamed from: w  reason: collision with root package name */
    public final k0 f37173w;

    /* renamed from: x  reason: collision with root package name */
    public final k0 f37174x;

    /* renamed from: y  reason: collision with root package name */
    public final k0 f37175y;

    /* renamed from: z  reason: collision with root package name */
    public final k0 f37176z;

    /* loaded from: classes.dex */
    public interface b {
        void a(i iVar);

        void b(i iVar, p pVar);

        void c(i iVar);

        void d(i iVar, e eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(Context context, Object obj, l6.a aVar, b bVar, c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, k6.d dVar, wn.k<? extends h.a<?>, ? extends Class<?>> kVar, g.a aVar2, List<? extends m6.c> list, c.a aVar3, u uVar, q qVar, boolean z10, boolean z11, boolean z12, boolean z13, j6.a aVar4, j6.a aVar5, j6.a aVar6, k0 k0Var, k0 k0Var2, k0 k0Var3, k0 k0Var4, androidx.lifecycle.o oVar, k6.i iVar, k6.g gVar, n nVar, c.b bVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, j6.b bVar4) {
        this.f37151a = context;
        this.f37152b = obj;
        this.f37153c = aVar;
        this.f37154d = bVar;
        this.f37155e = bVar2;
        this.f37156f = str;
        this.f37157g = config;
        this.f37158h = colorSpace;
        this.f37159i = dVar;
        this.f37160j = kVar;
        this.f37161k = aVar2;
        this.f37162l = list;
        this.f37163m = aVar3;
        this.f37164n = uVar;
        this.f37165o = qVar;
        this.f37166p = z10;
        this.f37167q = z11;
        this.f37168r = z12;
        this.f37169s = z13;
        this.f37170t = aVar4;
        this.f37171u = aVar5;
        this.f37172v = aVar6;
        this.f37173w = k0Var;
        this.f37174x = k0Var2;
        this.f37175y = k0Var3;
        this.f37176z = k0Var4;
        this.A = oVar;
        this.B = iVar;
        this.C = gVar;
        this.D = nVar;
        this.E = bVar3;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = cVar;
        this.M = bVar4;
    }

    public /* synthetic */ i(Context context, Object obj, l6.a aVar, b bVar, c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, k6.d dVar, wn.k kVar, g.a aVar2, List list, c.a aVar3, u uVar, q qVar, boolean z10, boolean z11, boolean z12, boolean z13, j6.a aVar4, j6.a aVar5, j6.a aVar6, k0 k0Var, k0 k0Var2, k0 k0Var3, k0 k0Var4, androidx.lifecycle.o oVar, k6.i iVar, k6.g gVar, n nVar, c.b bVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, j6.b bVar4, jo.h hVar) {
        this(context, obj, aVar, bVar, bVar2, str, config, colorSpace, dVar, kVar, aVar2, list, aVar3, uVar, qVar, z10, z11, z12, z13, aVar4, aVar5, aVar6, k0Var, k0Var2, k0Var3, k0Var4, oVar, iVar, gVar, nVar, bVar3, num, drawable, num2, drawable2, num3, drawable3, cVar, bVar4);
    }

    public static /* synthetic */ a R(i iVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = iVar.f37151a;
        }
        return iVar.Q(context);
    }

    public final b A() {
        return this.f37154d;
    }

    public final c.b B() {
        return this.f37155e;
    }

    public final j6.a C() {
        return this.f37170t;
    }

    public final j6.a D() {
        return this.f37172v;
    }

    public final n E() {
        return this.D;
    }

    public final Drawable F() {
        return o6.j.c(this, this.G, this.F, this.M.n());
    }

    public final c.b G() {
        return this.E;
    }

    public final k6.d H() {
        return this.f37159i;
    }

    public final boolean I() {
        return this.f37169s;
    }

    public final k6.g J() {
        return this.C;
    }

    public final k6.i K() {
        return this.B;
    }

    public final q L() {
        return this.f37165o;
    }

    public final l6.a M() {
        return this.f37153c;
    }

    public final k0 N() {
        return this.f37176z;
    }

    public final List<m6.c> O() {
        return this.f37162l;
    }

    public final c.a P() {
        return this.f37163m;
    }

    public final a Q(Context context) {
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (jo.p.c(this.f37151a, iVar.f37151a) && jo.p.c(this.f37152b, iVar.f37152b) && jo.p.c(this.f37153c, iVar.f37153c) && jo.p.c(this.f37154d, iVar.f37154d) && jo.p.c(this.f37155e, iVar.f37155e) && jo.p.c(this.f37156f, iVar.f37156f) && this.f37157g == iVar.f37157g && ((Build.VERSION.SDK_INT < 26 || jo.p.c(this.f37158h, iVar.f37158h)) && this.f37159i == iVar.f37159i && jo.p.c(this.f37160j, iVar.f37160j) && jo.p.c(this.f37161k, iVar.f37161k) && jo.p.c(this.f37162l, iVar.f37162l) && jo.p.c(this.f37163m, iVar.f37163m) && jo.p.c(this.f37164n, iVar.f37164n) && jo.p.c(this.f37165o, iVar.f37165o) && this.f37166p == iVar.f37166p && this.f37167q == iVar.f37167q && this.f37168r == iVar.f37168r && this.f37169s == iVar.f37169s && this.f37170t == iVar.f37170t && this.f37171u == iVar.f37171u && this.f37172v == iVar.f37172v && jo.p.c(this.f37173w, iVar.f37173w) && jo.p.c(this.f37174x, iVar.f37174x) && jo.p.c(this.f37175y, iVar.f37175y) && jo.p.c(this.f37176z, iVar.f37176z) && jo.p.c(this.E, iVar.E) && jo.p.c(this.F, iVar.F) && jo.p.c(this.G, iVar.G) && jo.p.c(this.H, iVar.H) && jo.p.c(this.I, iVar.I) && jo.p.c(this.J, iVar.J) && jo.p.c(this.K, iVar.K) && jo.p.c(this.A, iVar.A) && jo.p.c(this.B, iVar.B) && this.C == iVar.C && jo.p.c(this.D, iVar.D) && jo.p.c(this.L, iVar.L) && jo.p.c(this.M, iVar.M))) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return this.f37166p;
    }

    public final boolean h() {
        return this.f37167q;
    }

    public int hashCode() {
        int hashCode = ((this.f37151a.hashCode() * 31) + this.f37152b.hashCode()) * 31;
        l6.a aVar = this.f37153c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f37154d;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c.b bVar2 = this.f37155e;
        int hashCode4 = (hashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str = this.f37156f;
        int hashCode5 = (((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.f37157g.hashCode()) * 31;
        ColorSpace colorSpace = this.f37158h;
        int hashCode6 = (((hashCode5 + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.f37159i.hashCode()) * 31;
        wn.k<h.a<?>, Class<?>> kVar = this.f37160j;
        int hashCode7 = (hashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        g.a aVar2 = this.f37161k;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31) + this.f37162l.hashCode()) * 31) + this.f37163m.hashCode()) * 31) + this.f37164n.hashCode()) * 31) + this.f37165o.hashCode()) * 31) + Boolean.hashCode(this.f37166p)) * 31) + Boolean.hashCode(this.f37167q)) * 31) + Boolean.hashCode(this.f37168r)) * 31) + Boolean.hashCode(this.f37169s)) * 31) + this.f37170t.hashCode()) * 31) + this.f37171u.hashCode()) * 31) + this.f37172v.hashCode()) * 31) + this.f37173w.hashCode()) * 31) + this.f37174x.hashCode()) * 31) + this.f37175y.hashCode()) * 31) + this.f37176z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        c.b bVar3 = this.E;
        int hashCode9 = (hashCode8 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        Integer num = this.F;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Drawable drawable = this.G;
        int hashCode11 = (hashCode10 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num2 = this.H;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Drawable drawable2 = this.I;
        int hashCode13 = (hashCode12 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Integer num3 = this.J;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Drawable drawable3 = this.K;
        return ((((hashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.f37168r;
    }

    public final Bitmap.Config j() {
        return this.f37157g;
    }

    public final ColorSpace k() {
        return this.f37158h;
    }

    public final Context l() {
        return this.f37151a;
    }

    public final Object m() {
        return this.f37152b;
    }

    public final k0 n() {
        return this.f37175y;
    }

    public final g.a o() {
        return this.f37161k;
    }

    public final j6.b p() {
        return this.M;
    }

    public final c q() {
        return this.L;
    }

    public final String r() {
        return this.f37156f;
    }

    public final j6.a s() {
        return this.f37171u;
    }

    public final Drawable t() {
        return o6.j.c(this, this.I, this.H, this.M.h());
    }

    public final Drawable u() {
        return o6.j.c(this, this.K, this.J, this.M.i());
    }

    public final k0 v() {
        return this.f37174x;
    }

    public final wn.k<h.a<?>, Class<?>> w() {
        return this.f37160j;
    }

    public final u x() {
        return this.f37164n;
    }

    public final k0 y() {
        return this.f37173w;
    }

    public final androidx.lifecycle.o z() {
        return this.A;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public k0 A;
        public n.a B;
        public c.b C;
        public Integer D;
        public Drawable E;
        public Integer F;
        public Drawable G;
        public Integer H;
        public Drawable I;
        public androidx.lifecycle.o J;
        public k6.i K;
        public k6.g L;
        public androidx.lifecycle.o M;
        public k6.i N;
        public k6.g O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f37177a;

        /* renamed from: b  reason: collision with root package name */
        public j6.b f37178b;

        /* renamed from: c  reason: collision with root package name */
        public Object f37179c;

        /* renamed from: d  reason: collision with root package name */
        public l6.a f37180d;

        /* renamed from: e  reason: collision with root package name */
        public b f37181e;

        /* renamed from: f  reason: collision with root package name */
        public c.b f37182f;

        /* renamed from: g  reason: collision with root package name */
        public String f37183g;

        /* renamed from: h  reason: collision with root package name */
        public Bitmap.Config f37184h;

        /* renamed from: i  reason: collision with root package name */
        public ColorSpace f37185i;

        /* renamed from: j  reason: collision with root package name */
        public k6.d f37186j;

        /* renamed from: k  reason: collision with root package name */
        public wn.k<? extends h.a<?>, ? extends Class<?>> f37187k;

        /* renamed from: l  reason: collision with root package name */
        public g.a f37188l;

        /* renamed from: m  reason: collision with root package name */
        public List<? extends m6.c> f37189m;

        /* renamed from: n  reason: collision with root package name */
        public c.a f37190n;

        /* renamed from: o  reason: collision with root package name */
        public u.a f37191o;

        /* renamed from: p  reason: collision with root package name */
        public Map<Class<?>, Object> f37192p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f37193q;

        /* renamed from: r  reason: collision with root package name */
        public Boolean f37194r;

        /* renamed from: s  reason: collision with root package name */
        public Boolean f37195s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f37196t;

        /* renamed from: u  reason: collision with root package name */
        public j6.a f37197u;

        /* renamed from: v  reason: collision with root package name */
        public j6.a f37198v;

        /* renamed from: w  reason: collision with root package name */
        public j6.a f37199w;

        /* renamed from: x  reason: collision with root package name */
        public k0 f37200x;

        /* renamed from: y  reason: collision with root package name */
        public k0 f37201y;

        /* renamed from: z  reason: collision with root package name */
        public k0 f37202z;

        public a(Context context) {
            this.f37177a = context;
            this.f37178b = o6.j.b();
            this.f37179c = null;
            this.f37180d = null;
            this.f37181e = null;
            this.f37182f = null;
            this.f37183g = null;
            this.f37184h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f37185i = null;
            }
            this.f37186j = null;
            this.f37187k = null;
            this.f37188l = null;
            this.f37189m = xn.s.k();
            this.f37190n = null;
            this.f37191o = null;
            this.f37192p = null;
            this.f37193q = true;
            this.f37194r = null;
            this.f37195s = null;
            this.f37196t = true;
            this.f37197u = null;
            this.f37198v = null;
            this.f37199w = null;
            this.f37200x = null;
            this.f37201y = null;
            this.f37202z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        public final i a() {
            Context context = this.f37177a;
            Object obj = this.f37179c;
            if (obj == null) {
                obj = k.f37203a;
            }
            Object obj2 = obj;
            l6.a aVar = this.f37180d;
            b bVar = this.f37181e;
            c.b bVar2 = this.f37182f;
            String str = this.f37183g;
            Bitmap.Config config = this.f37184h;
            if (config == null) {
                config = this.f37178b.e();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f37185i;
            k6.d dVar = this.f37186j;
            if (dVar == null) {
                dVar = this.f37178b.o();
            }
            k6.d dVar2 = dVar;
            wn.k<? extends h.a<?>, ? extends Class<?>> kVar = this.f37187k;
            g.a aVar2 = this.f37188l;
            List<? extends m6.c> list = this.f37189m;
            c.a aVar3 = this.f37190n;
            if (aVar3 == null) {
                aVar3 = this.f37178b.q();
            }
            c.a aVar4 = aVar3;
            u.a aVar5 = this.f37191o;
            u v10 = o6.k.v(aVar5 == null ? null : aVar5.g());
            Map<Class<?>, ? extends Object> map = this.f37192p;
            q x10 = o6.k.x(map == null ? null : q.f37236b.a(map));
            boolean z10 = this.f37193q;
            Boolean bool = this.f37194r;
            boolean c10 = bool == null ? this.f37178b.c() : bool.booleanValue();
            Boolean bool2 = this.f37195s;
            boolean d10 = bool2 == null ? this.f37178b.d() : bool2.booleanValue();
            boolean z11 = this.f37196t;
            j6.a aVar6 = this.f37197u;
            if (aVar6 == null) {
                aVar6 = this.f37178b.l();
            }
            j6.a aVar7 = aVar6;
            j6.a aVar8 = this.f37198v;
            if (aVar8 == null) {
                aVar8 = this.f37178b.g();
            }
            j6.a aVar9 = aVar8;
            j6.a aVar10 = this.f37199w;
            if (aVar10 == null) {
                aVar10 = this.f37178b.m();
            }
            j6.a aVar11 = aVar10;
            k0 k0Var = this.f37200x;
            if (k0Var == null) {
                k0Var = this.f37178b.k();
            }
            k0 k0Var2 = k0Var;
            k0 k0Var3 = this.f37201y;
            if (k0Var3 == null) {
                k0Var3 = this.f37178b.j();
            }
            k0 k0Var4 = k0Var3;
            k0 k0Var5 = this.f37202z;
            if (k0Var5 == null) {
                k0Var5 = this.f37178b.f();
            }
            k0 k0Var6 = k0Var5;
            k0 k0Var7 = this.A;
            if (k0Var7 == null) {
                k0Var7 = this.f37178b.p();
            }
            k0 k0Var8 = k0Var7;
            androidx.lifecycle.o oVar = this.J;
            if (oVar == null && (oVar = this.M) == null) {
                oVar = g();
            }
            androidx.lifecycle.o oVar2 = oVar;
            k6.i iVar = this.K;
            if (iVar == null && (iVar = this.N) == null) {
                iVar = i();
            }
            k6.i iVar2 = iVar;
            k6.g gVar = this.L;
            if (gVar == null && (gVar = this.O) == null) {
                gVar = h();
            }
            k6.g gVar2 = gVar;
            n.a aVar12 = this.B;
            return new i(context, obj2, aVar, bVar, bVar2, str, config2, colorSpace, dVar2, kVar, aVar2, list, aVar4, v10, x10, z10, c10, d10, z11, aVar7, aVar9, aVar11, k0Var2, k0Var4, k0Var6, k0Var8, oVar2, iVar2, gVar2, o6.k.w(aVar12 == null ? null : aVar12.a()), this.C, this.D, this.E, this.F, this.G, this.H, this.I, new c(this.J, this.K, this.L, this.f37200x, this.f37201y, this.f37202z, this.A, this.f37190n, this.f37186j, this.f37184h, this.f37194r, this.f37195s, this.f37197u, this.f37198v, this.f37199w), this.f37178b, null);
        }

        public final a b(Object obj) {
            this.f37179c = obj;
            return this;
        }

        public final a c(j6.b bVar) {
            this.f37178b = bVar;
            e();
            return this;
        }

        public final a d(k6.d dVar) {
            this.f37186j = dVar;
            return this;
        }

        public final void e() {
            this.O = null;
        }

        public final void f() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        public final androidx.lifecycle.o g() {
            l6.a aVar = this.f37180d;
            androidx.lifecycle.o c10 = o6.d.c(aVar instanceof l6.b ? ((l6.b) aVar).a().getContext() : this.f37177a);
            return c10 == null ? h.f37149b : c10;
        }

        public final k6.g h() {
            k6.i iVar = this.K;
            View view = null;
            k6.k kVar = iVar instanceof k6.k ? (k6.k) iVar : null;
            View a10 = kVar == null ? null : kVar.a();
            if (a10 == null) {
                l6.a aVar = this.f37180d;
                l6.b bVar = aVar instanceof l6.b ? (l6.b) aVar : null;
                if (bVar != null) {
                    view = bVar.a();
                }
            } else {
                view = a10;
            }
            if (view instanceof ImageView) {
                return o6.k.n((ImageView) view);
            }
            return k6.g.FIT;
        }

        public final k6.i i() {
            l6.a aVar = this.f37180d;
            if (aVar instanceof l6.b) {
                View a10 = ((l6.b) aVar).a();
                if (a10 instanceof ImageView) {
                    ImageView.ScaleType scaleType = ((ImageView) a10).getScaleType();
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        return k6.j.a(k6.h.f38444d);
                    }
                }
                return k6.l.b(a10, false, 2, null);
            }
            return new k6.c(this.f37177a);
        }

        public final a j(k6.g gVar) {
            this.L = gVar;
            return this;
        }

        public final a k(k6.i iVar) {
            this.K = iVar;
            f();
            return this;
        }

        public final a l(ImageView imageView) {
            return m(new ImageViewTarget(imageView));
        }

        public final a m(l6.a aVar) {
            this.f37180d = aVar;
            f();
            return this;
        }

        public a(i iVar, Context context) {
            this.f37177a = context;
            this.f37178b = iVar.p();
            this.f37179c = iVar.m();
            this.f37180d = iVar.M();
            this.f37181e = iVar.A();
            this.f37182f = iVar.B();
            this.f37183g = iVar.r();
            this.f37184h = iVar.q().c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f37185i = iVar.k();
            }
            this.f37186j = iVar.q().k();
            this.f37187k = iVar.w();
            this.f37188l = iVar.o();
            this.f37189m = iVar.O();
            this.f37190n = iVar.q().o();
            this.f37191o = iVar.x().j();
            this.f37192p = n0.p(iVar.L().a());
            this.f37193q = iVar.g();
            this.f37194r = iVar.q().a();
            this.f37195s = iVar.q().b();
            this.f37196t = iVar.I();
            this.f37197u = iVar.q().i();
            this.f37198v = iVar.q().e();
            this.f37199w = iVar.q().j();
            this.f37200x = iVar.q().g();
            this.f37201y = iVar.q().f();
            this.f37202z = iVar.q().d();
            this.A = iVar.q().n();
            this.B = iVar.E().g();
            this.C = iVar.G();
            this.D = iVar.F;
            this.E = iVar.G;
            this.F = iVar.H;
            this.G = iVar.I;
            this.H = iVar.J;
            this.I = iVar.K;
            this.J = iVar.q().h();
            this.K = iVar.q().m();
            this.L = iVar.q().l();
            if (iVar.l() == context) {
                this.M = iVar.z();
                this.N = iVar.K();
                this.O = iVar.J();
                return;
            }
            this.M = null;
            this.N = null;
            this.O = null;
        }
    }
}
