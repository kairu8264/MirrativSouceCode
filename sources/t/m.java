package t;

import c1.i0;
import c1.n1;
import c1.o1;
import l0.c2;
import l0.i;
import l0.s0;
import l0.z1;
import u.a1;
import u.c1;
import u.e1;
import u.q1;
import u.u0;
import u.z0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public static final c1<n1, u.n> f52950a = e1.a(a.f52955w, b.f52956w);

    /* renamed from: b */
    public static final s0<Float> f52951b;

    /* renamed from: c */
    public static final u0<Float> f52952c;

    /* renamed from: d */
    public static final u0<m2.k> f52953d;

    /* renamed from: e */
    public static final u0<m2.o> f52954e;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<n1, u.n> {

        /* renamed from: w */
        public static final a f52955w = new a();

        public a() {
            super(1);
        }

        public final u.n a(long j10) {
            return new u.n(n1.f(j10), n1.g(j10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ u.n invoke(n1 n1Var) {
            return a(n1Var.j());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<u.n, n1> {

        /* renamed from: w */
        public static final b f52956w = new b();

        public b() {
            super(1);
        }

        public final long a(u.n nVar) {
            jo.p.h(nVar, "it");
            return o1.a(nVar.f(), nVar.g());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ n1 invoke(u.n nVar) {
            return n1.b(a(nVar));
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52957a;

        static {
            int[] iArr = new int[t.l.values().length];
            iArr[t.l.Visible.ordinal()] = 1;
            iArr[t.l.PreEnter.ordinal()] = 2;
            iArr[t.l.PostExit.ordinal()] = 3;
            f52957a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.q<z0.b<t.l>, l0.i, Integer, u0<n1>> {

        /* renamed from: w */
        public static final d f52958w = new d();

        public d() {
            super(3);
        }

        public final u0<n1> a(z0.b<t.l> bVar, l0.i iVar, int i10) {
            jo.p.h(bVar, "$this$null");
            iVar.x(-251233035);
            u0<n1> g10 = u.j.g(0.0f, 0.0f, null, 7, null);
            iVar.O();
            return g10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ u0<n1> s0(z0.b<t.l> bVar, l0.i iVar, Integer num) {
            return a(bVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<i0, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ c2<Float> f52959w;

        /* renamed from: x */
        public final /* synthetic */ c2<Float> f52960x;

        /* renamed from: y */
        public final /* synthetic */ c2<n1> f52961y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c2<Float> c2Var, c2<Float> c2Var2, c2<n1> c2Var3) {
            super(1);
            this.f52959w = c2Var;
            this.f52960x = c2Var2;
            this.f52961y = c2Var3;
        }

        public final void a(i0 i0Var) {
            jo.p.h(i0Var, "$this$graphicsLayer");
            i0Var.b(m.n(this.f52959w));
            i0Var.j(m.i(this.f52960x));
            i0Var.r(m.i(this.f52960x));
            i0Var.Y(m.j(this.f52961y));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(i0 i0Var) {
            a(i0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<i0, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ c2<Float> f52962w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c2<Float> c2Var) {
            super(1);
            this.f52962w = c2Var;
        }

        public final void a(i0 i0Var) {
            jo.p.h(i0Var, "$this$graphicsLayer");
            i0Var.b(m.n(this.f52962w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(i0 i0Var) {
            a(i0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.q<z0.b<t.l>, l0.i, Integer, u.c0<Float>> {

        /* renamed from: w */
        public final /* synthetic */ n f52963w;

        /* renamed from: x */
        public final /* synthetic */ p f52964x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(n nVar, p pVar) {
            super(3);
            this.f52963w = nVar;
            this.f52964x = pVar;
        }

        public final u.c0<Float> a(z0.b<t.l> bVar, l0.i iVar, int i10) {
            u.c0<Float> c0Var;
            jo.p.h(bVar, "$this$animateFloat");
            iVar.x(-9520302);
            t.l lVar = t.l.PreEnter;
            t.l lVar2 = t.l.Visible;
            if (bVar.c(lVar, lVar2)) {
                s b10 = this.f52963w.a().b();
                c0Var = b10 != null ? b10.b() : null;
                if (c0Var == null) {
                    c0Var = m.f52952c;
                }
            } else if (!bVar.c(lVar2, t.l.PostExit)) {
                c0Var = m.f52952c;
            } else {
                s b11 = this.f52964x.a().b();
                c0Var = b11 != null ? b11.b() : null;
                if (c0Var == null) {
                    c0Var = m.f52952c;
                }
            }
            iVar.O();
            return c0Var;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ u.c0<Float> s0(z0.b<t.l> bVar, l0.i iVar, Integer num) {
            return a(bVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.q<z0.b<t.l>, l0.i, Integer, u.c0<Float>> {

        /* renamed from: w */
        public final /* synthetic */ n f52965w;

        /* renamed from: x */
        public final /* synthetic */ p f52966x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(n nVar, p pVar) {
            super(3);
            this.f52965w = nVar;
            this.f52966x = pVar;
        }

        public final u.c0<Float> a(z0.b<t.l> bVar, l0.i iVar, int i10) {
            u.c0<Float> c0Var;
            jo.p.h(bVar, "$this$animateFloat");
            iVar.x(-9519413);
            t.l lVar = t.l.PreEnter;
            t.l lVar2 = t.l.Visible;
            if (bVar.c(lVar, lVar2)) {
                w c10 = this.f52965w.a().c();
                c0Var = c10 != null ? c10.a() : null;
                if (c0Var == null) {
                    c0Var = m.f52952c;
                }
            } else if (!bVar.c(lVar2, t.l.PostExit)) {
                c0Var = m.f52952c;
            } else {
                w c11 = this.f52966x.a().c();
                c0Var = c11 != null ? c11.a() : null;
                if (c0Var == null) {
                    c0Var = m.f52952c;
                }
            }
            iVar.O();
            return c0Var;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ u.c0<Float> s0(z0.b<t.l> bVar, l0.i iVar, Integer num) {
            return a(bVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.l<m2.o, m2.o> {

        /* renamed from: w */
        public static final i f52967w = new i();

        public i() {
            super(1);
        }

        public final long a(long j10) {
            return m2.p.a(0, 0);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ m2.o invoke(m2.o oVar) {
            return m2.o.b(a(oVar.j()));
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w */
        public final /* synthetic */ z0<t.l> f52968w;

        /* renamed from: x */
        public final /* synthetic */ c2<t.i> f52969x;

        /* renamed from: y */
        public final /* synthetic */ c2<t.i> f52970y;

        /* renamed from: z */
        public final /* synthetic */ String f52971z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(z0<t.l> z0Var, c2<t.i> c2Var, c2<t.i> c2Var2, String str) {
            super(3);
            this.f52968w = z0Var;
            this.f52969x = c2Var;
            this.f52970y = c2Var2;
            this.f52971z = str;
        }

        public static final boolean b(s0<Boolean> s0Var) {
            return s0Var.getValue().booleanValue();
        }

        public static final void c(s0<Boolean> s0Var, boolean z10) {
            s0Var.setValue(Boolean.valueOf(z10));
        }

        /* JADX WARN: Removed duplicated region for block: B:127:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x01ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final x0.f a(x0.f r21, l0.i r22, int r23) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t.m.j.a(x0.f, l0.i, int):x0.f");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<m2.o, m2.o> {

        /* renamed from: w */
        public static final k f52972w = new k();

        public k() {
            super(1);
        }

        public final long a(long j10) {
            return m2.p.a(0, 0);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ m2.o invoke(m2.o oVar) {
            return m2.o.b(a(oVar.j()));
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w */
        public final /* synthetic */ z0<t.l> f52973w;

        /* renamed from: x */
        public final /* synthetic */ c2<z> f52974x;

        /* renamed from: y */
        public final /* synthetic */ c2<z> f52975y;

        /* renamed from: z */
        public final /* synthetic */ String f52976z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(z0<t.l> z0Var, c2<z> c2Var, c2<z> c2Var2, String str) {
            super(3);
            this.f52973w = z0Var;
            this.f52974x = c2Var;
            this.f52975y = c2Var2;
            this.f52976z = str;
        }

        public static final boolean b(s0<Boolean> s0Var) {
            return s0Var.getValue().booleanValue();
        }

        public static final void c(s0<Boolean> s0Var, boolean z10) {
            s0Var.setValue(Boolean.valueOf(z10));
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(905898856);
            z0<t.l> z0Var = this.f52973w;
            iVar.x(-3686930);
            boolean P = iVar.P(z0Var);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = z1.e(Boolean.FALSE, null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            s0 s0Var = (s0) y10;
            if (this.f52973w.g() == this.f52973w.m() && !this.f52973w.q()) {
                c(s0Var, false);
            } else if (this.f52974x.getValue() != null || this.f52975y.getValue() != null) {
                c(s0Var, true);
            }
            if (b(s0Var)) {
                z0<t.l> z0Var2 = this.f52973w;
                c1<m2.k, u.n> i11 = e1.i(m2.k.f40528b);
                String str = this.f52976z;
                iVar.x(-3687241);
                Object y11 = iVar.y();
                i.a aVar = l0.i.f39065a;
                if (y11 == aVar.a()) {
                    y11 = jo.p.o(str, " slide");
                    iVar.q(y11);
                }
                iVar.O();
                z0.a b10 = a1.b(z0Var2, i11, (String) y11, iVar, 448, 0);
                z0<t.l> z0Var3 = this.f52973w;
                c2<z> c2Var = this.f52974x;
                c2<z> c2Var2 = this.f52975y;
                iVar.x(-3686930);
                boolean P2 = iVar.P(z0Var3);
                Object y12 = iVar.y();
                if (P2 || y12 == aVar.a()) {
                    y12 = new a0(b10, c2Var, c2Var2);
                    iVar.q(y12);
                }
                iVar.O();
                fVar = fVar.L((a0) y12);
            }
            iVar.O();
            return fVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    static {
        s0<Float> e10;
        e10 = z1.e(Float.valueOf(1.0f), null, 2, null);
        f52951b = e10;
        f52952c = u.j.g(0.0f, 400.0f, null, 5, null);
        f52953d = u.j.g(0.0f, 400.0f, m2.k.b(q1.e(m2.k.f40528b)), 1, null);
        f52954e = u.j.g(0.0f, 400.0f, m2.o.b(q1.f(m2.o.f40537b)), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final x0.f g(u.z0<t.l> r24, t.n r25, t.p r26, java.lang.String r27, l0.i r28, int r29) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.m.g(u.z0, t.n, t.p, java.lang.String, l0.i, int):x0.f");
    }

    public static final boolean h(s0<Boolean> s0Var) {
        return s0Var.getValue().booleanValue();
    }

    public static final float i(c2<Float> c2Var) {
        return c2Var.getValue().floatValue();
    }

    public static final long j(c2<n1> c2Var) {
        return c2Var.getValue().j();
    }

    public static final void k(s0<Boolean> s0Var, boolean z10) {
        s0Var.setValue(Boolean.valueOf(z10));
    }

    public static final boolean l(s0<Boolean> s0Var) {
        return s0Var.getValue().booleanValue();
    }

    public static final void m(s0<Boolean> s0Var, boolean z10) {
        s0Var.setValue(Boolean.valueOf(z10));
    }

    public static final float n(c2<Float> c2Var) {
        return c2Var.getValue().floatValue();
    }

    public static final n o(u.c0<m2.o> c0Var, x0.a aVar, boolean z10, io.l<? super m2.o, m2.o> lVar) {
        jo.p.h(c0Var, "animationSpec");
        jo.p.h(aVar, "expandFrom");
        jo.p.h(lVar, "initialSize");
        return new o(new e0(null, null, new t.i(aVar, lVar, c0Var, z10), null, 11, null));
    }

    public static /* synthetic */ n p(u.c0 c0Var, x0.a aVar, boolean z10, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = u.j.g(0.0f, 400.0f, m2.o.b(q1.f(m2.o.f40537b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            aVar = x0.a.f59327a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = i.f52967w;
        }
        return o(c0Var, aVar, z10, lVar);
    }

    public static final n q(u.c0<Float> c0Var, float f10) {
        jo.p.h(c0Var, "animationSpec");
        return new o(new e0(new s(f10, c0Var), null, null, null, 14, null));
    }

    public static /* synthetic */ n r(u.c0 c0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = u.j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return q(c0Var, f10);
    }

    public static final p s(u.c0<Float> c0Var, float f10) {
        jo.p.h(c0Var, "animationSpec");
        return new q(new e0(new s(f10, c0Var), null, null, null, 14, null));
    }

    public static /* synthetic */ p t(u.c0 c0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = u.j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return s(c0Var, f10);
    }

    public static final n u(u.c0<Float> c0Var, float f10, long j10) {
        jo.p.h(c0Var, "animationSpec");
        return new o(new e0(null, null, null, new w(f10, j10, c0Var, null), 7, null));
    }

    public static /* synthetic */ n v(u.c0 c0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = u.j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = n1.f18729b.a();
        }
        return u(c0Var, f10, j10);
    }

    public static final x0.f w(x0.f fVar, z0<t.l> z0Var, c2<t.i> c2Var, c2<t.i> c2Var2, String str) {
        return x0.e.d(fVar, null, new j(z0Var, c2Var, c2Var2, str), 1, null);
    }

    public static final p x(u.c0<m2.o> c0Var, x0.a aVar, boolean z10, io.l<? super m2.o, m2.o> lVar) {
        jo.p.h(c0Var, "animationSpec");
        jo.p.h(aVar, "shrinkTowards");
        jo.p.h(lVar, "targetSize");
        return new q(new e0(null, null, new t.i(aVar, lVar, c0Var, z10), null, 11, null));
    }

    public static /* synthetic */ p y(u.c0 c0Var, x0.a aVar, boolean z10, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = u.j.g(0.0f, 400.0f, m2.o.b(q1.f(m2.o.f40537b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            aVar = x0.a.f59327a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = k.f52972w;
        }
        return x(c0Var, aVar, z10, lVar);
    }

    public static final x0.f z(x0.f fVar, z0<t.l> z0Var, c2<z> c2Var, c2<z> c2Var2, String str) {
        return x0.e.d(fVar, null, new l(z0Var, c2Var, c2Var2, str), 1, null);
    }
}
