package a0;

import java.util.ArrayList;
import java.util.List;
import y.f;
import y.r0;
import y.t0;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ f.l B;
        public final /* synthetic */ f.d C;
        public final /* synthetic */ w.m D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ io.l<y, wn.v> F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a0.b f92w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f93x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0 f94y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ t0 f95z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a0.b bVar, x0.f fVar, e0 e0Var, t0 t0Var, boolean z10, f.l lVar, f.d dVar, w.m mVar, boolean z11, io.l<? super y, wn.v> lVar2, int i10, int i11) {
            super(2);
            this.f92w = bVar;
            this.f93x = fVar;
            this.f94y = e0Var;
            this.f95z = t0Var;
            this.A = z10;
            this.B = lVar;
            this.C = dVar;
            this.D = mVar;
            this.E = z11;
            this.F = lVar2;
            this.G = i10;
            this.H = i11;
        }

        public final void a(l0.i iVar, int i10) {
            g.a(this.f92w, this.f93x, this.f94y, this.f95z, this.A, this.B, this.C, this.D, this.E, this.F, iVar, this.G | 1, this.H);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<m2.d, m2.b, List<Integer>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t0 f96w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a0.b f97x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.d f98y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t0 t0Var, a0.b bVar, f.d dVar) {
            super(2);
            this.f96w = t0Var;
            this.f97x = bVar;
            this.f98y = dVar;
        }

        public final List<Integer> a(m2.d dVar, long j10) {
            jo.p.h(dVar, "$this$null");
            if (m2.b.n(j10) != Integer.MAX_VALUE) {
                t0 t0Var = this.f96w;
                m2.q qVar = m2.q.Ltr;
                List<Integer> D0 = xn.a0.D0(this.f97x.a(dVar, m2.b.n(j10) - dVar.X(m2.g.l(r0.g(t0Var, qVar) + r0.f(this.f96w, qVar))), dVar.X(this.f98y.a())));
                int size = D0.size();
                for (int i10 = 1; i10 < size; i10++) {
                    D0.set(i10, Integer.valueOf(D0.get(i10).intValue() + D0.get(i10 - 1).intValue()));
                }
                return D0;
            }
            throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ List<Integer> invoke(m2.d dVar, m2.b bVar) {
            return a(dVar, bVar.t());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(a0.b r27, x0.f r28, a0.e0 r29, y.t0 r30, boolean r31, y.f.l r32, y.f.d r33, w.m r34, boolean r35, io.l<? super a0.y, wn.v> r36, l0.i r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.g.a(a0.b, x0.f, a0.e0, y.t0, boolean, y.f$l, y.f$d, w.m, boolean, io.l, l0.i, int, int):void");
    }

    public static final List<Integer> c(int i10, int i11, int i12) {
        int i13 = i10 - (i12 * (i11 - 1));
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    public static final io.p<m2.d, m2.b, List<Integer>> d(a0.b bVar, f.d dVar, t0 t0Var, l0.i iVar, int i10) {
        iVar.x(-1355301804);
        iVar.x(1618982084);
        boolean P = iVar.P(bVar) | iVar.P(dVar) | iVar.P(t0Var);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new b(t0Var, bVar, dVar);
            iVar.q(y10);
        }
        iVar.O();
        io.p<m2.d, m2.b, List<Integer>> pVar = (io.p) y10;
        iVar.O();
        return pVar;
    }
}
