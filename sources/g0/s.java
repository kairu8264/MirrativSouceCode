package g0;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import java.util.ArrayList;
import java.util.List;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.d0;
import q1.e0;
import q1.q0;
import s1.a;

/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public static final class a implements q1.c0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32273a = new a();

        /* renamed from: g0.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0369a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List<q0> f32274w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0369a(List<? extends q0> list) {
                super(1);
                this.f32274w = list;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                List<q0> list = this.f32274w;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    q0.a.j(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        @Override // q1.c0
        public final d0 c(e0 e0Var, List<? extends q1.b0> list, long j10) {
            jo.p.h(e0Var, "$this$Layout");
            jo.p.h(list, "measurables");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            Integer num = 0;
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).M(j10));
            }
            int size2 = arrayList.size();
            Integer num2 = num;
            for (int i11 = 0; i11 < size2; i11++) {
                num2 = Integer.valueOf(Math.max(num2.intValue(), ((q0) arrayList.get(i11)).r0()));
            }
            int intValue = num2.intValue();
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                num = Integer.valueOf(Math.max(num.intValue(), ((q0) arrayList.get(i12)).f0()));
            }
            return e0.O0(e0Var, intValue, num.intValue(), null, new C0369a(arrayList), 4, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f32275w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f32276x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f32277y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f32278z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x0.f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10, int i11) {
            super(2);
            this.f32275w = fVar;
            this.f32276x = pVar;
            this.f32277y = i10;
            this.f32278z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            s.a(this.f32275w, this.f32276x, iVar, this.f32277y | 1, this.f32278z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10, int i11) {
        int i12;
        jo.p.h(pVar, "content");
        l0.i h10 = iVar.h(-2105228848);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= h10.P(pVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            if (i13 != 0) {
                fVar = x0.f.f59359u;
            }
            a aVar = a.f32273a;
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(fVar);
            int i14 = (((((i12 << 3) & 112) | ((i12 >> 3) & 14)) << 9) & 7168) | 6;
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a10);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a12 = h2.a(h10);
            h2.b(a12, aVar, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(n1.a(n1.b(h10)), h10, Integer.valueOf((i14 >> 3) & 112));
            h10.x(2058660585);
            pVar.invoke(h10, Integer.valueOf((i14 >> 9) & 14));
            h10.O();
            h10.s();
            h10.O();
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(fVar, pVar, i10, i11));
    }
}
