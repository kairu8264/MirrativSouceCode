package f0;

import androidx.compose.ui.platform.g2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.q0;
import s1.a;
import x0.f;
import y1.a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final wn.k<List<a.b<y1.p>>, List<a.b<io.q<String, l0.i, Integer, wn.v>>>> f31485a = new wn.k<>(xn.s.k(), xn.s.k());

    /* loaded from: classes.dex */
    public static final class a implements q1.c0 {

        /* renamed from: a */
        public static final a f31486a = new a();

        /* renamed from: f0.i$a$a */
        /* loaded from: classes.dex */
        public static final class C0331a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w */
            public final /* synthetic */ List<q1.q0> f31487w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0331a(List<? extends q1.q0> list) {
                super(1);
                this.f31487w = list;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                List<q1.q0> list = this.f31487w;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    q0.a.n(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        @Override // q1.c0
        public final q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            jo.p.h(e0Var, "$this$Layout");
            jo.p.h(list, "children");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).M(j10));
            }
            return q1.e0.O0(e0Var, m2.b.n(j10), m2.b.m(j10), null, new C0331a(arrayList), 4, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ y1.a f31488w;

        /* renamed from: x */
        public final /* synthetic */ List<a.b<io.q<String, l0.i, Integer, wn.v>>> f31489x;

        /* renamed from: y */
        public final /* synthetic */ int f31490y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y1.a aVar, List<a.b<io.q<String, l0.i, Integer, wn.v>>> list, int i10) {
            super(2);
            this.f31488w = aVar;
            this.f31489x = list;
            this.f31490y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            i.a(this.f31488w, this.f31489x, iVar, this.f31490y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(y1.a aVar, List<a.b<io.q<String, l0.i, Integer, wn.v>>> list, l0.i iVar, int i10) {
        jo.p.h(aVar, "text");
        jo.p.h(list, "inlineContents");
        l0.i h10 = iVar.h(-110905764);
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            a.b<io.q<String, l0.i, Integer, wn.v>> bVar = list.get(i11);
            io.q<String, l0.i, Integer, wn.v> a10 = bVar.a();
            int b10 = bVar.b();
            int c10 = bVar.c();
            a aVar2 = a.f31486a;
            h10.x(-1323940314);
            f.a aVar3 = x0.f.f59359u;
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(aVar3);
            int i12 = size;
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a11);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a13 = h2.a(h10);
            h2.b(a13, aVar2, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-72427749);
            a10.s0(aVar.subSequence(b10, c10).g(), h10, 0);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            i11++;
            size = i12;
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(aVar, list, i10));
    }

    public static final wn.k<List<a.b<y1.p>>, List<a.b<io.q<String, l0.i, Integer, wn.v>>>> b(y1.a aVar, Map<String, m> map) {
        jo.p.h(aVar, "text");
        jo.p.h(map, "inlineContent");
        if (map.isEmpty()) {
            return f31485a;
        }
        List<a.b<String>> f10 = aVar.f("androidx.compose.foundation.text.inlineContent", 0, aVar.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = f10.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.b<String> bVar = f10.get(i10);
            m mVar = map.get(bVar.e());
            if (mVar != null) {
                arrayList.add(new a.b(mVar.b(), bVar.f(), bVar.d()));
                arrayList2.add(new a.b(mVar.a(), bVar.f(), bVar.d()));
            }
        }
        return new wn.k<>(arrayList, arrayList2);
    }

    public static final d0 c(d0 d0Var, y1.a aVar, y1.d0 d0Var2, m2.d dVar, l.b bVar, boolean z10, int i10, int i11, List<a.b<y1.p>> list) {
        jo.p.h(d0Var, "current");
        jo.p.h(aVar, "text");
        jo.p.h(d0Var2, TtmlNode.TAG_STYLE);
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        jo.p.h(list, "placeholders");
        if (jo.p.c(d0Var.k(), aVar) && jo.p.c(d0Var.j(), d0Var2)) {
            if (d0Var.i() == z10) {
                if (j2.k.d(d0Var.g(), i10)) {
                    if (d0Var.d() == i11 && jo.p.c(d0Var.a(), dVar) && jo.p.c(d0Var.h(), list) && d0Var.b() == bVar) {
                        return d0Var;
                    }
                    return new d0(aVar, d0Var2, i11, z10, i10, dVar, bVar, list, null);
                }
                return new d0(aVar, d0Var2, i11, z10, i10, dVar, bVar, list, null);
            }
        }
        return new d0(aVar, d0Var2, i11, z10, i10, dVar, bVar, list, null);
    }

    public static final d0 e(d0 d0Var, String str, y1.d0 d0Var2, m2.d dVar, l.b bVar, boolean z10, int i10, int i11) {
        jo.p.h(d0Var, "current");
        jo.p.h(str, "text");
        jo.p.h(d0Var2, TtmlNode.TAG_STYLE);
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        if (jo.p.c(d0Var.k().g(), str) && jo.p.c(d0Var.j(), d0Var2)) {
            if (d0Var.i() == z10) {
                if (j2.k.d(d0Var.g(), i10)) {
                    if (d0Var.d() == i11 && jo.p.c(d0Var.a(), dVar) && d0Var.b() == bVar) {
                        return d0Var;
                    }
                    return new d0(new y1.a(str, null, null, 6, null), d0Var2, i11, z10, i10, dVar, bVar, null, 128, null);
                }
                return new d0(new y1.a(str, null, null, 6, null), d0Var2, i11, z10, i10, dVar, bVar, null, 128, null);
            }
        }
        return new d0(new y1.a(str, null, null, 6, null), d0Var2, i11, z10, i10, dVar, bVar, null, 128, null);
    }
}
