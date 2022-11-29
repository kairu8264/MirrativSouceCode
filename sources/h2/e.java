package h2;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import b2.j;
import b2.k;
import b2.m;
import c1.c0;
import c1.d1;
import c1.e0;
import c1.f1;
import c1.i1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import d2.u;
import d2.x;
import io.r;
import j2.c;
import j2.f;
import j2.i;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import jo.q;
import m2.s;
import m2.t;
import xn.n;
import xn.o;
import y1.a;
import y1.d0;
import y1.v;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.q<v, Integer, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Spannable f34428w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r<l, x, u, d2.v, Typeface> f34429x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Spannable spannable, r<? super l, ? super x, ? super u, ? super d2.v, ? extends Typeface> rVar) {
            super(3);
            this.f34428w = spannable;
            this.f34429x = rVar;
        }

        public final void a(v vVar, int i10, int i11) {
            p.h(vVar, "spanStyle");
            Spannable spannable = this.f34428w;
            r<l, x, u, d2.v, Typeface> rVar = this.f34429x;
            l g10 = vVar.g();
            x l10 = vVar.l();
            if (l10 == null) {
                l10 = x.f29149x.d();
            }
            u j10 = vVar.j();
            u c10 = u.c(j10 != null ? j10.i() : u.f29139b.b());
            d2.v k10 = vVar.k();
            spannable.setSpan(new m(rVar.F(g10, l10, c10, d2.v.e(k10 != null ? k10.m() : d2.v.f29143b.a()))), i10, i11, 33);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(v vVar, Integer num, Integer num2) {
            a(vVar, num.intValue(), num2.intValue());
            return wn.v.f59242a;
        }
    }

    public static final MetricAffectingSpan a(long j10, m2.d dVar) {
        long g10 = m2.r.g(j10);
        t.a aVar = t.f40544b;
        if (t.g(g10, aVar.b())) {
            return new b2.d(dVar.c0(j10));
        }
        if (t.g(g10, aVar.a())) {
            return new b2.c(m2.r.h(j10));
        }
        return null;
    }

    public static final void b(v vVar, List<a.b<v>> list, io.q<? super v, ? super Integer, ? super Integer, wn.v> qVar) {
        p.h(list, "spanStyles");
        p.h(qVar, "block");
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                qVar.s0(d(vVar, list.get(0).e()), Integer.valueOf(list.get(0).f()), Integer.valueOf(list.get(0).d()));
                return;
            }
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a.b<v> bVar = list.get(i12);
            numArr[i12] = Integer.valueOf(bVar.f());
            numArr[i12 + size] = Integer.valueOf(bVar.d());
        }
        n.x(numArr);
        int intValue = ((Number) o.F(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            int intValue2 = numArr[i13].intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                v vVar2 = vVar;
                for (int i14 = 0; i14 < size3; i14++) {
                    a.b<v> bVar2 = list.get(i14);
                    if (bVar2.f() != bVar2.d() && y1.b.g(intValue, intValue2, bVar2.f(), bVar2.d())) {
                        vVar2 = d(vVar2, bVar2.e());
                    }
                }
                if (vVar2 != null) {
                    qVar.s0(vVar2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    public static final boolean c(d0 d0Var) {
        return f.b(d0Var.E()) || d0Var.l() != null;
    }

    public static final v d(v vVar, v vVar2) {
        return vVar == null ? vVar2 : vVar.v(vVar2);
    }

    public static final float e(long j10, float f10, m2.d dVar) {
        long g10 = m2.r.g(j10);
        t.a aVar = t.f40544b;
        if (t.g(g10, aVar.b())) {
            return dVar.c0(j10);
        }
        if (t.g(g10, aVar.a())) {
            return m2.r.h(j10) * f10;
        }
        return Float.NaN;
    }

    public static final void f(Spannable spannable, long j10, int i10, int i11) {
        p.h(spannable, "$this$setBackground");
        if (j10 != c0.f18634b.e()) {
            r(spannable, new BackgroundColorSpan(e0.i(j10)), i10, i11);
        }
    }

    public static final void g(Spannable spannable, j2.a aVar, int i10, int i11) {
        if (aVar != null) {
            r(spannable, new b2.a(aVar.h()), i10, i11);
        }
    }

    public static final void h(Spannable spannable, c1.u uVar, int i10, int i11) {
        if (uVar != null) {
            if (uVar instanceof i1) {
                i(spannable, ((i1) uVar).b(), i10, i11);
            } else if (uVar instanceof d1) {
                r(spannable, new i2.a((d1) uVar), i10, i11);
            }
        }
    }

    public static final void i(Spannable spannable, long j10, int i10, int i11) {
        p.h(spannable, "$this$setColor");
        if (j10 != c0.f18634b.e()) {
            r(spannable, new ForegroundColorSpan(e0.i(j10)), i10, i11);
        }
    }

    public static final void j(Spannable spannable, d0 d0Var, List<a.b<v>> list, r<? super l, ? super x, ? super u, ? super d2.v, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.b<v> bVar = list.get(i10);
            a.b<v> bVar2 = bVar;
            if (f.b(bVar2.e()) || bVar2.e().k() != null) {
                arrayList.add(bVar);
            }
        }
        b(c(d0Var) ? new v(0L, 0L, d0Var.m(), d0Var.k(), d0Var.l(), d0Var.h(), (String) null, 0L, (j2.a) null, (i) null, (f2.f) null, 0L, (j2.f) null, (f1) null, 16323, (h) null) : null, arrayList, new a(spannable, rVar));
    }

    public static final void k(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            r(spannable, new b2.b(str), i10, i11);
        }
    }

    public static final void l(Spannable spannable, long j10, m2.d dVar, int i10, int i11) {
        p.h(spannable, "$this$setFontSize");
        p.h(dVar, "density");
        long g10 = m2.r.g(j10);
        t.a aVar = t.f40544b;
        if (t.g(g10, aVar.b())) {
            r(spannable, new AbsoluteSizeSpan(lo.c.c(dVar.c0(j10)), false), i10, i11);
        } else if (t.g(g10, aVar.a())) {
            r(spannable, new RelativeSizeSpan(m2.r.h(j10)), i10, i11);
        }
    }

    public static final void m(Spannable spannable, i iVar, int i10, int i11) {
        if (iVar != null) {
            r(spannable, new ScaleXSpan(iVar.b()), i10, i11);
            r(spannable, new k(iVar.c()), i10, i11);
        }
    }

    public static final void n(Spannable spannable, long j10, float f10, m2.d dVar, j2.c cVar) {
        p.h(spannable, "$this$setLineHeight");
        p.h(dVar, "density");
        p.h(cVar, "lineHeightStyle");
        float e10 = e(j10, f10, dVar);
        if (Float.isNaN(e10)) {
            return;
        }
        r(spannable, new b2.f(e10, 0, spannable.length(), c.C0492c.e(cVar.c()), c.C0492c.f(cVar.c()), cVar.b()), 0, spannable.length());
    }

    public static final void o(Spannable spannable, long j10, float f10, m2.d dVar) {
        p.h(spannable, "$this$setLineHeight");
        p.h(dVar, "density");
        float e10 = e(j10, f10, dVar);
        if (Float.isNaN(e10)) {
            return;
        }
        r(spannable, new b2.e(e10), 0, spannable.length());
    }

    public static final void p(Spannable spannable, f2.f fVar, int i10, int i11) {
        Object localeSpan;
        p.h(spannable, "<this>");
        if (fVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = b.f34424a.a(fVar);
            } else {
                localeSpan = new LocaleSpan(h2.a.a(fVar.isEmpty() ? f2.e.f31705b.a() : fVar.f(0)));
            }
            r(spannable, localeSpan, i10, i11);
        }
    }

    public static final void q(Spannable spannable, f1 f1Var, int i10, int i11) {
        if (f1Var != null) {
            r(spannable, new j(e0.i(f1Var.c()), b1.f.m(f1Var.d()), b1.f.n(f1Var.d()), f1Var.b()), i10, i11);
        }
    }

    public static final void r(Spannable spannable, Object obj, int i10, int i11) {
        p.h(spannable, "<this>");
        p.h(obj, TtmlNode.TAG_SPAN);
        spannable.setSpan(obj, i10, i11, 33);
    }

    public static final void s(Spannable spannable, a.b<v> bVar, m2.d dVar, ArrayList<d> arrayList) {
        int f10 = bVar.f();
        int d10 = bVar.d();
        v e10 = bVar.e();
        g(spannable, e10.d(), f10, d10);
        i(spannable, e10.f(), f10, d10);
        h(spannable, e10.e(), f10, d10);
        u(spannable, e10.q(), f10, d10);
        l(spannable, e10.i(), dVar, f10, d10);
        k(spannable, e10.h(), f10, d10);
        m(spannable, e10.s(), f10, d10);
        p(spannable, e10.n(), f10, d10);
        f(spannable, e10.c(), f10, d10);
        q(spannable, e10.p(), f10, d10);
        MetricAffectingSpan a10 = a(e10.m(), dVar);
        if (a10 != null) {
            arrayList.add(new d(a10, f10, d10));
        }
    }

    public static final void t(Spannable spannable, d0 d0Var, List<a.b<v>> list, m2.d dVar, r<? super l, ? super x, ? super u, ? super d2.v, ? extends Typeface> rVar) {
        p.h(spannable, "<this>");
        p.h(d0Var, "contextTextStyle");
        p.h(list, "spanStyles");
        p.h(dVar, "density");
        p.h(rVar, "resolveTypeface");
        j(spannable, d0Var, list, rVar);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.b<v> bVar = list.get(i10);
            int f10 = bVar.f();
            int d10 = bVar.d();
            if (f10 >= 0 && f10 < spannable.length() && d10 > f10 && d10 <= spannable.length()) {
                s(spannable, bVar, dVar, arrayList);
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            d dVar2 = (d) arrayList.get(i11);
            r(spannable, dVar2.a(), dVar2.b(), dVar2.c());
        }
    }

    public static final void u(Spannable spannable, j2.f fVar, int i10, int i11) {
        p.h(spannable, "<this>");
        if (fVar != null) {
            f.a aVar = j2.f.f37083b;
            r(spannable, new b2.l(fVar.d(aVar.d()), fVar.d(aVar.b())), i10, i11);
        }
    }

    public static final void v(Spannable spannable, j2.j jVar, float f10, m2.d dVar) {
        float h10;
        p.h(spannable, "<this>");
        p.h(dVar, "density");
        if (jVar != null) {
            if ((m2.r.e(jVar.b(), s.d(0)) && m2.r.e(jVar.c(), s.d(0))) || s.e(jVar.b()) || s.e(jVar.c())) {
                return;
            }
            long g10 = m2.r.g(jVar.b());
            t.a aVar = t.f40544b;
            float f11 = 0.0f;
            if (t.g(g10, aVar.b())) {
                h10 = dVar.c0(jVar.b());
            } else {
                h10 = t.g(g10, aVar.a()) ? m2.r.h(jVar.b()) * f10 : 0.0f;
            }
            long g11 = m2.r.g(jVar.c());
            if (t.g(g11, aVar.b())) {
                f11 = dVar.c0(jVar.c());
            } else if (t.g(g11, aVar.a())) {
                f11 = m2.r.h(jVar.c()) * f10;
            }
            r(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(h10), (int) Math.ceil(f11)), 0, spannable.length());
        }
    }
}
