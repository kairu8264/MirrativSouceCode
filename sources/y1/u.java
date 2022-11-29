package y1;

import b1.f;
import c1.c0;
import c1.f1;
import d2.x;
import f2.e;
import f2.f;
import j2.a;
import j2.f;
import j2.i;
import j2.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m2.r;
import y1.a;
import y1.b0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u0.i<y1.a, Object> f61117a = u0.j.a(a.f61135w, b.f61137w);

    /* renamed from: b  reason: collision with root package name */
    public static final u0.i<List<a.b<? extends Object>>, Object> f61118b = u0.j.a(c.f61139w, d.f61141w);

    /* renamed from: c  reason: collision with root package name */
    public static final u0.i<a.b<? extends Object>, Object> f61119c = u0.j.a(e.f61143w, f.f61146w);

    /* renamed from: d  reason: collision with root package name */
    public static final u0.i<y1.g0, Object> f61120d = u0.j.a(i0.f61154w, j0.f61156w);

    /* renamed from: e  reason: collision with root package name */
    public static final u0.i<y1.n, Object> f61121e = u0.j.a(s.f61165w, t.f61166w);

    /* renamed from: f  reason: collision with root package name */
    public static final u0.i<y1.v, Object> f61122f = u0.j.a(w.f61169w, x.f61170w);

    /* renamed from: g  reason: collision with root package name */
    public static final u0.i<j2.f, Object> f61123g = u0.j.a(y.f61171w, z.f61172w);

    /* renamed from: h  reason: collision with root package name */
    public static final u0.i<j2.i, Object> f61124h = u0.j.a(a0.f61136w, b0.f61138w);

    /* renamed from: i  reason: collision with root package name */
    public static final u0.i<j2.j, Object> f61125i = u0.j.a(c0.f61140w, d0.f61142w);

    /* renamed from: j  reason: collision with root package name */
    public static final u0.i<d2.x, Object> f61126j = u0.j.a(k.f61157w, l.f61158w);

    /* renamed from: k  reason: collision with root package name */
    public static final u0.i<j2.a, Object> f61127k = u0.j.a(g.f61149w, h.f61151w);

    /* renamed from: l  reason: collision with root package name */
    public static final u0.i<y1.b0, Object> f61128l = u0.j.a(e0.f61145w, f0.f61148w);

    /* renamed from: m  reason: collision with root package name */
    public static final u0.i<f1, Object> f61129m = u0.j.a(C1039u.f61167w, v.f61168w);

    /* renamed from: n  reason: collision with root package name */
    public static final u0.i<c1.c0, Object> f61130n = u0.j.a(i.f61153w, j.f61155w);

    /* renamed from: o  reason: collision with root package name */
    public static final u0.i<m2.r, Object> f61131o = u0.j.a(g0.f61150w, h0.f61152w);

    /* renamed from: p  reason: collision with root package name */
    public static final u0.i<b1.f, Object> f61132p = u0.j.a(q.f61163w, r.f61164w);

    /* renamed from: q  reason: collision with root package name */
    public static final u0.i<f2.f, Object> f61133q = u0.j.a(m.f61159w, n.f61160w);

    /* renamed from: r  reason: collision with root package name */
    public static final u0.i<f2.e, Object> f61134r = u0.j.a(o.f61161w, p.f61162w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<u0.k, y1.a, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f61135w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, y1.a aVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(aVar, "it");
            return xn.s.e(u.s(aVar.g()), u.t(aVar.e(), u.f61118b, kVar), u.t(aVar.d(), u.f61118b, kVar), u.t(aVar.b(), u.f61118b, kVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.p<u0.k, j2.i, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final a0 f61136w = new a0();

        public a0() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, j2.i iVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(iVar, "it");
            return xn.s.e(Float.valueOf(iVar.b()), Float.valueOf(iVar.c()));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Object, y1.a> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f61137w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final y1.a invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            List list2 = null;
            String str = obj2 != null ? (String) obj2 : null;
            jo.p.e(str);
            Object obj3 = list.get(1);
            u0.i iVar = u.f61118b;
            Boolean bool = Boolean.FALSE;
            List list3 = (jo.p.c(obj3, bool) || obj3 == null) ? null : (List) iVar.a(obj3);
            jo.p.e(list3);
            Object obj4 = list.get(2);
            List list4 = (jo.p.c(obj4, bool) || obj4 == null) ? null : (List) u.f61118b.a(obj4);
            jo.p.e(list4);
            Object obj5 = list.get(3);
            u0.i iVar2 = u.f61118b;
            if (!jo.p.c(obj5, bool) && obj5 != null) {
                list2 = (List) iVar2.a(obj5);
            }
            jo.p.e(list2);
            return new y1.a(str, list3, list4, list2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.l<Object, j2.i> {

        /* renamed from: w  reason: collision with root package name */
        public static final b0 f61138w = new b0();

        public b0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final j2.i invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            return new j2.i(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<u0.k, List<? extends a.b<? extends Object>>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f61139w = new c();

        public c() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, List<? extends a.b<? extends Object>> list) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(list, "it");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(u.t(list.get(i10), u.f61119c, kVar));
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends jo.q implements io.p<u0.k, j2.j, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final c0 f61140w = new c0();

        public c0() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, j2.j jVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(jVar, "it");
            m2.r b10 = m2.r.b(jVar.b());
            r.a aVar = m2.r.f40540b;
            return xn.s.e(u.t(b10, u.p(aVar), kVar), u.t(m2.r.b(jVar.c()), u.p(aVar), kVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Object, List<? extends a.b<? extends Object>>> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f61141w = new d();

        public d() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final List<a.b<? extends Object>> invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                u0.i iVar = u.f61119c;
                a.b bVar = null;
                if (!jo.p.c(obj2, Boolean.FALSE) && obj2 != null) {
                    bVar = (a.b) iVar.a(obj2);
                }
                jo.p.e(bVar);
                arrayList.add(bVar);
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.l<Object, j2.j> {

        /* renamed from: w  reason: collision with root package name */
        public static final d0 f61142w = new d0();

        public d0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final j2.j invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            r.a aVar = m2.r.f40540b;
            u0.i<m2.r, Object> p10 = u.p(aVar);
            Boolean bool = Boolean.FALSE;
            m2.r rVar = null;
            m2.r a10 = (jo.p.c(obj2, bool) || obj2 == null) ? null : p10.a(obj2);
            jo.p.e(a10);
            long k10 = a10.k();
            Object obj3 = list.get(1);
            u0.i<m2.r, Object> p11 = u.p(aVar);
            if (!jo.p.c(obj3, bool) && obj3 != null) {
                rVar = p11.a(obj3);
            }
            jo.p.e(rVar);
            return new j2.j(k10, rVar.k(), null);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<u0.k, a.b<? extends Object>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f61143w = new e();

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f61144a;

            static {
                int[] iArr = new int[y1.c.values().length];
                iArr[y1.c.Paragraph.ordinal()] = 1;
                iArr[y1.c.Span.ordinal()] = 2;
                iArr[y1.c.VerbatimTts.ordinal()] = 3;
                iArr[y1.c.String.ordinal()] = 4;
                f61144a = iArr;
            }
        }

        public e() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, a.b<? extends Object> bVar) {
            y1.c cVar;
            Object t10;
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(bVar, "it");
            Object e10 = bVar.e();
            if (e10 instanceof y1.n) {
                cVar = y1.c.Paragraph;
            } else if (e10 instanceof y1.v) {
                cVar = y1.c.Span;
            } else {
                cVar = e10 instanceof y1.g0 ? y1.c.VerbatimTts : y1.c.String;
            }
            int i10 = a.f61144a[cVar.ordinal()];
            if (i10 == 1) {
                t10 = u.t((y1.n) bVar.e(), u.e(), kVar);
            } else if (i10 == 2) {
                t10 = u.t((y1.v) bVar.e(), u.r(), kVar);
            } else if (i10 == 3) {
                t10 = u.t((y1.g0) bVar.e(), u.f61120d, kVar);
            } else if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                t10 = u.s(bVar.e());
            }
            return xn.s.e(u.s(cVar), t10, u.s(Integer.valueOf(bVar.f())), u.s(Integer.valueOf(bVar.d())), u.s(bVar.g()));
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends jo.q implements io.p<u0.k, y1.b0, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final e0 f61145w = new e0();

        public e0() {
            super(2);
        }

        public final Object a(u0.k kVar, long j10) {
            jo.p.h(kVar, "$this$Saver");
            return xn.s.e((Integer) u.s(Integer.valueOf(y1.b0.n(j10))), (Integer) u.s(Integer.valueOf(y1.b0.i(j10))));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(u0.k kVar, y1.b0 b0Var) {
            return a(kVar, b0Var.r());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<Object, a.b<? extends Object>> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f61146w = new f();

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f61147a;

            static {
                int[] iArr = new int[y1.c.values().length];
                iArr[y1.c.Paragraph.ordinal()] = 1;
                iArr[y1.c.Span.ordinal()] = 2;
                iArr[y1.c.VerbatimTts.ordinal()] = 3;
                iArr[y1.c.String.ordinal()] = 4;
                f61147a = iArr;
            }
        }

        public f() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final a.b<? extends Object> invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            y1.c cVar = obj2 != null ? (y1.c) obj2 : null;
            jo.p.e(cVar);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            jo.p.e(num);
            int intValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            jo.p.e(num2);
            int intValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            jo.p.e(str);
            int i10 = a.f61147a[cVar.ordinal()];
            if (i10 == 1) {
                Object obj6 = list.get(1);
                u0.i<y1.n, Object> e10 = u.e();
                if (!jo.p.c(obj6, Boolean.FALSE) && obj6 != null) {
                    r1 = e10.a(obj6);
                }
                jo.p.e(r1);
                return new a.b<>(r1, intValue, intValue2, str);
            } else if (i10 == 2) {
                Object obj7 = list.get(1);
                u0.i<y1.v, Object> r10 = u.r();
                if (!jo.p.c(obj7, Boolean.FALSE) && obj7 != null) {
                    r1 = r10.a(obj7);
                }
                jo.p.e(r1);
                return new a.b<>(r1, intValue, intValue2, str);
            } else if (i10 != 3) {
                if (i10 == 4) {
                    Object obj8 = list.get(1);
                    r1 = obj8 != null ? (String) obj8 : null;
                    jo.p.e(r1);
                    return new a.b<>(r1, intValue, intValue2, str);
                }
                throw new NoWhenBranchMatchedException();
            } else {
                Object obj9 = list.get(1);
                u0.i iVar = u.f61120d;
                if (!jo.p.c(obj9, Boolean.FALSE) && obj9 != null) {
                    r1 = (y1.g0) iVar.a(obj9);
                }
                jo.p.e(r1);
                return new a.b<>(r1, intValue, intValue2, str);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends jo.q implements io.l<Object, y1.b0> {

        /* renamed from: w  reason: collision with root package name */
        public static final f0 f61148w = new f0();

        public f0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final y1.b0 invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            jo.p.e(num);
            int intValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            jo.p.e(num2);
            return y1.b0.b(y1.c0.b(intValue, num2.intValue()));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<u0.k, j2.a, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f61149w = new g();

        public g() {
            super(2);
        }

        public final Object a(u0.k kVar, float f10) {
            jo.p.h(kVar, "$this$Saver");
            return Float.valueOf(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(u0.k kVar, j2.a aVar) {
            return a(kVar, aVar.h());
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends jo.q implements io.p<u0.k, m2.r, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final g0 f61150w = new g0();

        public g0() {
            super(2);
        }

        public final Object a(u0.k kVar, long j10) {
            jo.p.h(kVar, "$this$Saver");
            return xn.s.e(u.s(Float.valueOf(m2.r.h(j10))), u.s(m2.t.d(m2.r.g(j10))));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(u0.k kVar, m2.r rVar) {
            return a(kVar, rVar.k());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<Object, j2.a> {

        /* renamed from: w  reason: collision with root package name */
        public static final h f61151w = new h();

        public h() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final j2.a invoke(Object obj) {
            jo.p.h(obj, "it");
            return j2.a.b(j2.a.c(((Float) obj).floatValue()));
        }
    }

    /* loaded from: classes.dex */
    public static final class h0 extends jo.q implements io.l<Object, m2.r> {

        /* renamed from: w  reason: collision with root package name */
        public static final h0 f61152w = new h0();

        public h0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final m2.r invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            jo.p.e(f10);
            float floatValue = f10.floatValue();
            Object obj3 = list.get(1);
            m2.t tVar = obj3 != null ? (m2.t) obj3 : null;
            jo.p.e(tVar);
            return m2.r.b(m2.s.a(floatValue, tVar.j()));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.p<u0.k, c1.c0, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final i f61153w = new i();

        public i() {
            super(2);
        }

        public final Object a(u0.k kVar, long j10) {
            jo.p.h(kVar, "$this$Saver");
            return wn.t.a(j10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(u0.k kVar, c1.c0 c0Var) {
            return a(kVar, c0Var.u());
        }
    }

    /* loaded from: classes.dex */
    public static final class i0 extends jo.q implements io.p<u0.k, y1.g0, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final i0 f61154w = new i0();

        public i0() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, y1.g0 g0Var) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(g0Var, "it");
            return u.s(g0Var.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.l<Object, c1.c0> {

        /* renamed from: w  reason: collision with root package name */
        public static final j f61155w = new j();

        public j() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final c1.c0 invoke(Object obj) {
            jo.p.h(obj, "it");
            return c1.c0.g(c1.c0.h(((wn.t) obj).l()));
        }
    }

    /* loaded from: classes.dex */
    public static final class j0 extends jo.q implements io.l<Object, y1.g0> {

        /* renamed from: w  reason: collision with root package name */
        public static final j0 f61156w = new j0();

        public j0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final y1.g0 invoke(Object obj) {
            jo.p.h(obj, "it");
            return new y1.g0((String) obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.p<u0.k, d2.x, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final k f61157w = new k();

        public k() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, d2.x xVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(xVar, "it");
            return Integer.valueOf(xVar.r());
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.l<Object, d2.x> {

        /* renamed from: w  reason: collision with root package name */
        public static final l f61158w = new l();

        public l() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final d2.x invoke(Object obj) {
            jo.p.h(obj, "it");
            return new d2.x(((Integer) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.p<u0.k, f2.f, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final m f61159w = new m();

        public m() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, f2.f fVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(fVar, "it");
            List<f2.e> g10 = fVar.g();
            ArrayList arrayList = new ArrayList(g10.size());
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(u.t(g10.get(i10), u.j(f2.e.f31705b), kVar));
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.l<Object, f2.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final n f61160w = new n();

        public n() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final f2.f invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                u0.i<f2.e, Object> j10 = u.j(f2.e.f31705b);
                f2.e eVar = null;
                if (!jo.p.c(obj2, Boolean.FALSE) && obj2 != null) {
                    eVar = j10.a(obj2);
                }
                jo.p.e(eVar);
                arrayList.add(eVar);
            }
            return new f2.f(arrayList);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.p<u0.k, f2.e, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final o f61161w = new o();

        public o() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, f2.e eVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(eVar, "it");
            return eVar.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.l<Object, f2.e> {

        /* renamed from: w  reason: collision with root package name */
        public static final p f61162w = new p();

        public p() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final f2.e invoke(Object obj) {
            jo.p.h(obj, "it");
            return new f2.e((String) obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.p<u0.k, b1.f, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final q f61163w = new q();

        public q() {
            super(2);
        }

        public final Object a(u0.k kVar, long j10) {
            jo.p.h(kVar, "$this$Saver");
            return b1.f.j(j10, b1.f.f16721b.b()) ? Boolean.FALSE : xn.s.e((Float) u.s(Float.valueOf(b1.f.m(j10))), (Float) u.s(Float.valueOf(b1.f.n(j10))));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(u0.k kVar, b1.f fVar) {
            return a(kVar, fVar.u());
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.l<Object, b1.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final r f61164w = new r();

        public r() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final b1.f invoke(Object obj) {
            jo.p.h(obj, "it");
            if (jo.p.c(obj, Boolean.FALSE)) {
                return b1.f.d(b1.f.f16721b.b());
            }
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            jo.p.e(f10);
            float floatValue = f10.floatValue();
            Object obj3 = list.get(1);
            Float f11 = obj3 != null ? (Float) obj3 : null;
            jo.p.e(f11);
            return b1.f.d(b1.g.a(floatValue, f11.floatValue()));
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.p<u0.k, y1.n, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final s f61165w = new s();

        public s() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, y1.n nVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(nVar, "it");
            return xn.s.e(u.s(nVar.f()), u.s(nVar.g()), u.t(m2.r.b(nVar.c()), u.p(m2.r.f40540b), kVar), u.t(nVar.h(), u.o(j2.j.f37103c), kVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.l<Object, y1.n> {

        /* renamed from: w  reason: collision with root package name */
        public static final t f61166w = new t();

        public t() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final y1.n invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            j2.e eVar = obj2 != null ? (j2.e) obj2 : null;
            Object obj3 = list.get(1);
            j2.g gVar = obj3 != null ? (j2.g) obj3 : null;
            Object obj4 = list.get(2);
            u0.i<m2.r, Object> p10 = u.p(m2.r.f40540b);
            Boolean bool = Boolean.FALSE;
            m2.r a10 = (jo.p.c(obj4, bool) || obj4 == null) ? null : p10.a(obj4);
            jo.p.e(a10);
            long k10 = a10.k();
            Object obj5 = list.get(3);
            return new y1.n(eVar, gVar, k10, (jo.p.c(obj5, bool) || obj5 == null) ? null : u.o(j2.j.f37103c).a(obj5), null);
        }
    }

    /* renamed from: y1.u$u  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1039u extends jo.q implements io.p<u0.k, f1, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final C1039u f61167w = new C1039u();

        public C1039u() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, f1 f1Var) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(f1Var, "it");
            return xn.s.e(u.t(c1.c0.g(f1Var.c()), u.g(c1.c0.f18634b), kVar), u.t(b1.f.d(f1Var.d()), u.f(b1.f.f16721b), kVar), u.s(Float.valueOf(f1Var.b())));
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.l<Object, f1> {

        /* renamed from: w  reason: collision with root package name */
        public static final v f61168w = new v();

        public v() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final f1 invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            u0.i<c1.c0, Object> g10 = u.g(c1.c0.f18634b);
            Boolean bool = Boolean.FALSE;
            c1.c0 a10 = (jo.p.c(obj2, bool) || obj2 == null) ? null : g10.a(obj2);
            jo.p.e(a10);
            long u10 = a10.u();
            Object obj3 = list.get(1);
            b1.f a11 = (jo.p.c(obj3, bool) || obj3 == null) ? null : u.f(b1.f.f16721b).a(obj3);
            jo.p.e(a11);
            long u11 = a11.u();
            Object obj4 = list.get(2);
            Float f10 = obj4 != null ? (Float) obj4 : null;
            jo.p.e(f10);
            return new f1(u10, u11, f10.floatValue(), null);
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.p<u0.k, y1.v, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final w f61169w = new w();

        public w() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, y1.v vVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(vVar, "it");
            c1.c0 g10 = c1.c0.g(vVar.f());
            c0.a aVar = c1.c0.f18634b;
            m2.r b10 = m2.r.b(vVar.i());
            r.a aVar2 = m2.r.f40540b;
            return xn.s.e(u.t(g10, u.g(aVar), kVar), u.t(b10, u.p(aVar2), kVar), u.t(vVar.l(), u.i(d2.x.f29149x), kVar), u.s(vVar.j()), u.s(vVar.k()), u.s(-1), u.s(vVar.h()), u.t(m2.r.b(vVar.m()), u.p(aVar2), kVar), u.t(vVar.d(), u.l(j2.a.f37055b), kVar), u.t(vVar.s(), u.n(j2.i.f37099c), kVar), u.t(vVar.n(), u.k(f2.f.f31707y), kVar), u.t(c1.c0.g(vVar.c()), u.g(aVar), kVar), u.t(vVar.q(), u.m(j2.f.f37083b), kVar), u.t(vVar.p(), u.h(f1.f18663d), kVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.l<Object, y1.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final x f61170w = new x();

        public x() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final y1.v invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            c0.a aVar = c1.c0.f18634b;
            u0.i<c1.c0, Object> g10 = u.g(aVar);
            Boolean bool = Boolean.FALSE;
            c1.c0 a10 = (jo.p.c(obj2, bool) || obj2 == null) ? null : g10.a(obj2);
            jo.p.e(a10);
            long u10 = a10.u();
            Object obj3 = list.get(1);
            r.a aVar2 = m2.r.f40540b;
            m2.r a11 = (jo.p.c(obj3, bool) || obj3 == null) ? null : u.p(aVar2).a(obj3);
            jo.p.e(a11);
            long k10 = a11.k();
            Object obj4 = list.get(2);
            d2.x a12 = (jo.p.c(obj4, bool) || obj4 == null) ? null : u.i(d2.x.f29149x).a(obj4);
            Object obj5 = list.get(3);
            d2.u uVar = obj5 != null ? (d2.u) obj5 : null;
            Object obj6 = list.get(4);
            d2.v vVar = obj6 != null ? (d2.v) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            m2.r a13 = (jo.p.c(obj8, bool) || obj8 == null) ? null : u.p(aVar2).a(obj8);
            jo.p.e(a13);
            long k11 = a13.k();
            Object obj9 = list.get(8);
            j2.a a14 = (jo.p.c(obj9, bool) || obj9 == null) ? null : u.l(j2.a.f37055b).a(obj9);
            Object obj10 = list.get(9);
            j2.i a15 = (jo.p.c(obj10, bool) || obj10 == null) ? null : u.n(j2.i.f37099c).a(obj10);
            Object obj11 = list.get(10);
            f2.f a16 = (jo.p.c(obj11, bool) || obj11 == null) ? null : u.k(f2.f.f31707y).a(obj11);
            Object obj12 = list.get(11);
            c1.c0 a17 = (jo.p.c(obj12, bool) || obj12 == null) ? null : u.g(aVar).a(obj12);
            jo.p.e(a17);
            long u11 = a17.u();
            Object obj13 = list.get(12);
            j2.f a18 = (jo.p.c(obj13, bool) || obj13 == null) ? null : u.m(j2.f.f37083b).a(obj13);
            Object obj14 = list.get(13);
            return new y1.v(u10, k10, a12, uVar, vVar, (d2.l) null, str, k11, a14, a15, a16, u11, a18, (jo.p.c(obj14, bool) || obj14 == null) ? null : u.h(f1.f18663d).a(obj14), 32, (jo.h) null);
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.p<u0.k, j2.f, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final y f61171w = new y();

        public y() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, j2.f fVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(fVar, "it");
            return Integer.valueOf(fVar.e());
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.l<Object, j2.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final z f61172w = new z();

        public z() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final j2.f invoke(Object obj) {
            jo.p.h(obj, "it");
            return new j2.f(((Integer) obj).intValue());
        }
    }

    public static final u0.i<y1.a, Object> d() {
        return f61117a;
    }

    public static final u0.i<y1.n, Object> e() {
        return f61121e;
    }

    public static final u0.i<b1.f, Object> f(f.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61132p;
    }

    public static final u0.i<c1.c0, Object> g(c0.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61130n;
    }

    public static final u0.i<f1, Object> h(f1.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61129m;
    }

    public static final u0.i<d2.x, Object> i(x.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61126j;
    }

    public static final u0.i<f2.e, Object> j(e.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61134r;
    }

    public static final u0.i<f2.f, Object> k(f.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61133q;
    }

    public static final u0.i<j2.a, Object> l(a.C0490a c0490a) {
        jo.p.h(c0490a, "<this>");
        return f61127k;
    }

    public static final u0.i<j2.f, Object> m(f.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61123g;
    }

    public static final u0.i<j2.i, Object> n(i.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61124h;
    }

    public static final u0.i<j2.j, Object> o(j.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61125i;
    }

    public static final u0.i<m2.r, Object> p(r.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61131o;
    }

    public static final u0.i<y1.b0, Object> q(b0.a aVar) {
        jo.p.h(aVar, "<this>");
        return f61128l;
    }

    public static final u0.i<y1.v, Object> r() {
        return f61122f;
    }

    public static final <T> T s(T t10) {
        return t10;
    }

    public static final <T extends u0.i<Original, Saveable>, Original, Saveable> Object t(Original original, T t10, u0.k kVar) {
        Object b10;
        jo.p.h(t10, "saver");
        jo.p.h(kVar, "scope");
        return (original == null || (b10 = t10.b(kVar, original)) == null) ? Boolean.FALSE : b10;
    }
}
