package h0;

import androidx.appcompat.widget.ListPopupWindow;
import l0.c2;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final r1 f34156a = new r1();

    /* renamed from: b  reason: collision with root package name */
    public static final float f34157b = m2.g.l(1);

    /* renamed from: c  reason: collision with root package name */
    public static final float f34158c = m2.g.l(2);

    /* renamed from: d  reason: collision with root package name */
    public static final float f34159d = m2.g.l(52);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f34161x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f34162y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f34163z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.f fVar, float f10, long j10, int i10, int i11) {
            super(2);
            this.f34161x = fVar;
            this.f34162y = f10;
            this.f34163z = j10;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            r1.this.a(this.f34161x, this.f34162y, this.f34163z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f34165x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f34166y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f34167z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x0.f fVar, float f10, long j10, int i10, int i11) {
            super(2);
            this.f34165x = fVar;
            this.f34166y = f10;
            this.f34167z = j10;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            r1.this.b(this.f34165x, this.f34166y, this.f34167z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1 f34168w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q1 q1Var) {
            super(1);
            this.f34168w = q1Var;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("tabIndicatorOffset");
            c1Var.c(this.f34168w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1 f34169w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q1 q1Var) {
            super(3);
            this.f34169w = q1Var;
        }

        public static final float b(c2<m2.g> c2Var) {
            return c2Var.getValue().q();
        }

        public static final float c(c2<m2.g> c2Var) {
            return c2Var.getValue().q();
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-398757863);
            c2<m2.g> c10 = u.c.c(this.f34169w.c(), u.j.i(ListPopupWindow.EXPAND_LIST_TIMEOUT, 0, u.b0.b(), 2, null), null, iVar, 0, 4);
            x0.f y10 = y.d1.y(y.n0.c(y.d1.E(y.d1.n(fVar, 0.0f, 1, null), x0.a.f59327a.d(), false, 2, null), c(u.c.c(this.f34169w.a(), u.j.i(ListPopupWindow.EXPAND_LIST_TIMEOUT, 0, u.b0.b(), 2, null), null, iVar, 0, 4)), 0.0f, 2, null), b(c10));
            iVar.O();
            return y10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public final void a(x0.f fVar, float f10, long j10, l0.i iVar, int i10, int i11) {
        Object obj;
        int i12;
        float f11;
        long j11;
        x0.f fVar2;
        float f12;
        long k10;
        float f13;
        int i13;
        l0.i h10 = iVar.h(910934799);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            obj = fVar;
        } else if ((i10 & 14) == 0) {
            obj = fVar;
            i12 = (h10.P(obj) ? 4 : 2) | i10;
        } else {
            obj = fVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                f11 = f10;
                if (h10.b(f11)) {
                    i13 = 32;
                    i12 |= i13;
                }
            } else {
                f11 = f10;
            }
            i13 = 16;
            i12 |= i13;
        } else {
            f11 = f10;
        }
        if ((i10 & 896) == 0) {
            j11 = j10;
            i12 |= ((i11 & 4) == 0 && h10.e(j11)) ? 256 : 128;
        } else {
            j11 = j10;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= h10.P(this) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && h10.j()) {
            h10.I();
            f13 = f11;
            k10 = j11;
        } else {
            h10.B();
            if ((i10 & 1) != 0 && !h10.K()) {
                h10.I();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                fVar2 = obj;
                f12 = f11;
            } else {
                fVar2 = i14 != 0 ? x0.f.f59359u : obj;
                if ((i11 & 2) != 0) {
                    f12 = f34157b;
                    i12 &= -113;
                } else {
                    f12 = f11;
                }
                if ((i11 & 4) != 0) {
                    k10 = c1.c0.k(((c1.c0) h10.G(p.a())).u(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -897;
                    h10.t();
                    w.a(fVar2, k10, f12, 0.0f, h10, (i12 & 14) | ((i12 >> 3) & 112) | ((i12 << 3) & 896), 8);
                    f13 = f12;
                    obj = fVar2;
                }
            }
            k10 = j11;
            h10.t();
            w.a(fVar2, k10, f12, 0.0f, h10, (i12 & 14) | ((i12 >> 3) & 112) | ((i12 << 3) & 896), 8);
            f13 = f12;
            obj = fVar2;
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(obj, f13, k10, i10, i11));
    }

    public final void b(x0.f fVar, float f10, long j10, l0.i iVar, int i10, int i11) {
        Object obj;
        int i12;
        float f11;
        long j11;
        x0.f fVar2;
        float f12;
        float f13;
        long j12;
        int i13;
        l0.i h10 = iVar.h(1499002201);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            obj = fVar;
        } else if ((i10 & 14) == 0) {
            obj = fVar;
            i12 = (h10.P(obj) ? 4 : 2) | i10;
        } else {
            obj = fVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                f11 = f10;
                if (h10.b(f11)) {
                    i13 = 32;
                    i12 |= i13;
                }
            } else {
                f11 = f10;
            }
            i13 = 16;
            i12 |= i13;
        } else {
            f11 = f10;
        }
        if ((i10 & 896) == 0) {
            j11 = j10;
            i12 |= ((i11 & 4) == 0 && h10.e(j11)) ? 256 : 128;
        } else {
            j11 = j10;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= h10.P(this) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && h10.j()) {
            h10.I();
            f13 = f11;
            j12 = j11;
        } else {
            h10.B();
            if ((i10 & 1) != 0 && !h10.K()) {
                h10.I();
                fVar2 = obj;
                f12 = f11;
            } else {
                fVar2 = i14 != 0 ? x0.f.f59359u : obj;
                f12 = (i11 & 2) != 0 ? f34158c : f11;
                if ((i11 & 4) != 0) {
                    j11 = ((c1.c0) h10.G(p.a())).u();
                }
            }
            h10.t();
            y.j.a(v.e.d(y.d1.o(y.d1.n(fVar2, 0.0f, 1, null), f12), j11, null, 2, null), h10, 0);
            f13 = f12;
            j12 = j11;
            obj = fVar2;
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(obj, f13, j12, i10, i11));
    }

    public final float c() {
        return f34158c;
    }

    public final x0.f d(x0.f fVar, q1 q1Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(q1Var, "currentTabPosition");
        return x0.e.c(fVar, androidx.compose.ui.platform.a1.c() ? new c(q1Var) : androidx.compose.ui.platform.a1.a(), new d(q1Var));
    }
}
