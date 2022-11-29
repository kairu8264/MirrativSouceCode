package h0;

import androidx.appcompat.widget.ListPopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q1.q0;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f34174a = m2.g.l(90);

    /* renamed from: b  reason: collision with root package name */
    public static final u.i<Float> f34175b = u.j.i(ListPopupWindow.EXPAND_LIST_TIMEOUT, 0, u.b0.b(), 2, null);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<List<? extends q1>, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f34176w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(3);
            this.f34176w = i10;
        }

        public final void a(List<q1> list, l0.i iVar, int i10) {
            jo.p.h(list, "tabPositions");
            r1 r1Var = r1.f34156a;
            r1Var.b(r1Var.d(x0.f.f59359u, list.get(this.f34176w)), 0.0f, 0L, iVar, 3072, 6);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(List<? extends q1> list, l0.i iVar, Integer num) {
            a(list, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34177w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34178x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.q<List<q1>, l0.i, Integer, wn.v> f34179y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f34180z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.p<q1.z0, m2.b, q1.d0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34181w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34182x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.q<List<q1>, l0.i, Integer, wn.v> f34183y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f34184z;

            /* renamed from: h0.s1$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0423a extends jo.q implements io.l<q0.a, wn.v> {
                public final /* synthetic */ long A;
                public final /* synthetic */ int B;
                public final /* synthetic */ io.q<List<q1>, l0.i, Integer, wn.v> C;
                public final /* synthetic */ List<q1> D;
                public final /* synthetic */ int E;
                public final /* synthetic */ int F;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ List<q1.q0> f34185w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ q1.z0 f34186x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34187y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ int f34188z;

                /* renamed from: h0.s1$b$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0424a extends jo.q implements io.p<l0.i, Integer, wn.v> {

                    /* renamed from: w  reason: collision with root package name */
                    public final /* synthetic */ io.q<List<q1>, l0.i, Integer, wn.v> f34189w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ List<q1> f34190x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ int f34191y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0424a(io.q<? super List<q1>, ? super l0.i, ? super Integer, wn.v> qVar, List<q1> list, int i10) {
                        super(2);
                        this.f34189w = qVar;
                        this.f34190x = list;
                        this.f34191y = i10;
                    }

                    public final void a(l0.i iVar, int i10) {
                        if ((i10 & 11) == 2 && iVar.j()) {
                            iVar.I();
                        } else {
                            this.f34189w.s0(this.f34190x, iVar, Integer.valueOf(((this.f34191y >> 9) & 112) | 8));
                        }
                    }

                    @Override // io.p
                    public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                        a(iVar, num.intValue());
                        return wn.v.f59242a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0423a(List<? extends q1.q0> list, q1.z0 z0Var, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10, long j10, int i11, io.q<? super List<q1>, ? super l0.i, ? super Integer, wn.v> qVar, List<q1> list2, int i12, int i13) {
                    super(1);
                    this.f34185w = list;
                    this.f34186x = z0Var;
                    this.f34187y = pVar;
                    this.f34188z = i10;
                    this.A = j10;
                    this.B = i11;
                    this.C = qVar;
                    this.D = list2;
                    this.E = i12;
                    this.F = i13;
                }

                public final void a(q0.a aVar) {
                    jo.p.h(aVar, "$this$layout");
                    List<q1.q0> list = this.f34185w;
                    int i10 = this.f34188z;
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            xn.s.t();
                        }
                        q0.a.n(aVar, (q1.q0) obj, i11 * i10, 0, 0.0f, 4, null);
                        i11 = i12;
                    }
                    List<q1.b0> V = this.f34186x.V(t1.Divider, this.f34187y);
                    long j10 = this.A;
                    int i13 = this.B;
                    for (q1.b0 b0Var : V) {
                        q1.q0 M = b0Var.M(m2.b.e(j10, 0, 0, 0, 0, 11, null));
                        q0.a.n(aVar, M, 0, i13 - M.f0(), 0.0f, 4, null);
                        i13 = i13;
                        j10 = j10;
                    }
                    List<q1.b0> V2 = this.f34186x.V(t1.Indicator, s0.c.c(-1341594997, true, new C0424a(this.C, this.D, this.E)));
                    int i14 = this.F;
                    int i15 = this.B;
                    for (q1.b0 b0Var2 : V2) {
                        q0.a.n(aVar, b0Var2.M(m2.b.f40509b.c(i14, i15)), 0, 0, 0.0f, 4, null);
                    }
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                    a(aVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, io.q<? super List<q1>, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
                super(2);
                this.f34181w = pVar;
                this.f34182x = pVar2;
                this.f34183y = qVar;
                this.f34184z = i10;
            }

            public final q1.d0 a(q1.z0 z0Var, long j10) {
                Object next;
                jo.p.h(z0Var, "$this$SubcomposeLayout");
                int n10 = m2.b.n(j10);
                List<q1.b0> V = z0Var.V(t1.Tabs, this.f34181w);
                int size = V.size();
                int i10 = n10 / size;
                ArrayList arrayList = new ArrayList(xn.t.u(V, 10));
                for (q1.b0 b0Var : V) {
                    arrayList.add(b0Var.M(m2.b.e(j10, i10, i10, 0, 0, 12, null)));
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int f02 = ((q1.q0) next).f0();
                        do {
                            Object next2 = it.next();
                            int f03 = ((q1.q0) next2).f0();
                            if (f02 < f03) {
                                next = next2;
                                f02 = f03;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                q1.q0 q0Var = (q1.q0) next;
                int f04 = q0Var != null ? q0Var.f0() : 0;
                ArrayList arrayList2 = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList2.add(new q1(m2.g.l(z0Var.s(i10) * i11), z0Var.s(i10), null));
                }
                return q1.e0.O0(z0Var, n10, f04, null, new C0423a(arrayList, z0Var, this.f34182x, i10, j10, f04, this.f34183y, arrayList2, this.f34184z, n10), 4, null);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ q1.d0 invoke(q1.z0 z0Var, m2.b bVar) {
                return a(z0Var, bVar.t());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, io.q<? super List<q1>, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
            super(2);
            this.f34177w = pVar;
            this.f34178x = pVar2;
            this.f34179y = qVar;
            this.f34180z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            x0.f n10 = y.d1.n(x0.f.f59359u, 0.0f, 1, null);
            io.p<l0.i, Integer, wn.v> pVar = this.f34177w;
            io.p<l0.i, Integer, wn.v> pVar2 = this.f34178x;
            io.q<List<q1>, l0.i, Integer, wn.v> qVar = this.f34179y;
            int i11 = this.f34180z;
            iVar.x(1618982084);
            boolean P = iVar.P(pVar) | iVar.P(pVar2) | iVar.P(qVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(pVar, pVar2, qVar, i11);
                iVar.q(y10);
            }
            iVar.O();
            q1.x0.b(n10, (io.p) y10, iVar, 6, 0);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.q<List<q1>, l0.i, Integer, wn.v> A;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> B;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f34192w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f34193x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f34194y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f34195z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(int i10, x0.f fVar, long j10, long j11, io.q<? super List<q1>, ? super l0.i, ? super Integer, wn.v> qVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i11, int i12) {
            super(2);
            this.f34192w = i10;
            this.f34193x = fVar;
            this.f34194y = j10;
            this.f34195z = j11;
            this.A = qVar;
            this.B = pVar;
            this.C = pVar2;
            this.D = i11;
            this.E = i12;
        }

        public final void a(l0.i iVar, int i10) {
            s1.a(this.f34192w, this.f34193x, this.f34194y, this.f34195z, this.A, this.B, this.C, iVar, this.D | 1, this.E);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r24, x0.f r25, long r26, long r28, io.q<? super java.util.List<h0.q1>, ? super l0.i, ? super java.lang.Integer, wn.v> r30, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r31, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r32, l0.i r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.s1.a(int, x0.f, long, long, io.q, io.p, io.p, l0.i, int, int):void");
    }
}
