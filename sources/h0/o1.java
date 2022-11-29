package h0;

import com.google.android.exoplayer2.C;
import l0.c2;
import l0.i;
import x0.a;
import x0.f;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f34056a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f34057b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f34058c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f34059d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f34060e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f34061f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f34062g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f34063h;

    /* renamed from: i  reason: collision with root package name */
    public static final u.b1<Float> f34064i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f34065j;

    /* renamed from: k  reason: collision with root package name */
    public static final float f34066k;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<Boolean, Boolean, x1> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f34067w = new a();

        public a() {
            super(2);
        }

        public final x1 a(boolean z10, boolean z11) {
            return new n0(0.5f);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ x1 invoke(Boolean bool, Boolean bool2) {
            return a(bool.booleanValue(), bool2.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ x.m A;
        public final /* synthetic */ m1 B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f34068w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<Boolean, wn.v> f34069x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f34070y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f34071z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, io.l<? super Boolean, wn.v> lVar, x0.f fVar, boolean z11, x.m mVar, m1 m1Var, int i10, int i11) {
            super(2);
            this.f34068w = z10;
            this.f34069x = lVar;
            this.f34070y = fVar;
            this.f34071z = z11;
            this.A = mVar;
            this.B = m1Var;
            this.C = i10;
            this.D = i11;
        }

        public final void a(l0.i iVar, int i10) {
            o1.a(this.f34068w, this.f34069x, this.f34070y, this.f34071z, this.A, this.B, iVar, this.C | 1, this.D);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<Boolean, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f34072w = new c();

        public c() {
            super(1);
        }

        public final void a(boolean z10) {
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Boolean bool) {
            a(bool.booleanValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", l = {185}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34073w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.k f34074x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v0.s<x.j> f34075y;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<x.j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v0.s<x.j> f34076w;

            public a(v0.s<x.j> sVar) {
                this.f34076w = sVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(x.j jVar, ao.d<? super wn.v> dVar) {
                if (jVar instanceof x.p) {
                    this.f34076w.add(jVar);
                } else if (jVar instanceof x.q) {
                    this.f34076w.remove(((x.q) jVar).a());
                } else if (jVar instanceof x.o) {
                    this.f34076w.remove(((x.o) jVar).a());
                } else if (jVar instanceof x.b) {
                    this.f34076w.add(jVar);
                } else if (jVar instanceof x.c) {
                    this.f34076w.remove(((x.c) jVar).a());
                } else if (jVar instanceof x.a) {
                    this.f34076w.remove(((x.a) jVar).a());
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x.k kVar, v0.s<x.j> sVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f34074x = kVar;
            this.f34075y = sVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f34074x, this.f34075y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34073w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<x.j> c11 = this.f34074x.c();
                a aVar = new a(this.f34075y);
                this.f34073w = 1;
                if (c11.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<e1.e, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<c1.c0> f34077w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c2<c1.c0> c2Var) {
            super(1);
            this.f34077w = c2Var;
        }

        public final void a(e1.e eVar) {
            jo.p.h(eVar, "$this$Canvas");
            o1.h(eVar, o1.c(this.f34077w), eVar.I0(o1.j()), eVar.I0(o1.i()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.e eVar) {
            a(eVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<m2.d, m2.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<Float> f34078w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c2<Float> c2Var) {
            super(1);
            this.f34078w = c2Var;
        }

        public final long a(m2.d dVar) {
            jo.p.h(dVar, "$this$offset");
            return m2.l.a(lo.c.c(this.f34078w.getValue().floatValue()), 0);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ m2.k invoke(m2.d dVar) {
            return m2.k.b(a(dVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ c2<Float> A;
        public final /* synthetic */ x.k B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y.k f34079w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34080x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f34081y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ m1 f34082z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(y.k kVar, boolean z10, boolean z11, m1 m1Var, c2<Float> c2Var, x.k kVar2, int i10) {
            super(2);
            this.f34079w = kVar;
            this.f34080x = z10;
            this.f34081y = z11;
            this.f34082z = m1Var;
            this.A = c2Var;
            this.B = kVar2;
            this.C = i10;
        }

        public final void a(l0.i iVar, int i10) {
            o1.b(this.f34079w, this.f34080x, this.f34081y, this.f34082z, this.A, this.B, iVar, this.C | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    static {
        float l10 = m2.g.l(34);
        f34056a = l10;
        f34057b = m2.g.l(14);
        float l11 = m2.g.l(20);
        f34058c = l11;
        f34059d = m2.g.l(24);
        f34060e = m2.g.l(2);
        f34061f = l10;
        f34062g = l11;
        f34063h = m2.g.l(l10 - l11);
        f34064i = new u.b1<>(100, 0, null, 6, null);
        f34065j = m2.g.l(1);
        f34066k = m2.g.l(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r36, io.l<? super java.lang.Boolean, wn.v> r37, x0.f r38, boolean r39, x.m r40, h0.m1 r41, l0.i r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o1.a(boolean, io.l, x0.f, boolean, x.m, h0.m1, l0.i, int, int):void");
    }

    public static final void b(y.k kVar, boolean z10, boolean z11, m1 m1Var, c2<Float> c2Var, x.k kVar2, l0.i iVar, int i10) {
        int i11;
        float f10;
        int i12;
        long d10;
        l0.i h10 = iVar.h(-1834839253);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(kVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.a(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.a(z11) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(m1Var) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= h10.P(c2Var) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= h10.P(kVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((374491 & i11) == 74898 && h10.j()) {
            h10.I();
        } else {
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar = l0.i.f39065a;
            if (y10 == aVar.a()) {
                y10 = l0.u1.c();
                h10.q(y10);
            }
            h10.O();
            v0.s sVar = (v0.s) y10;
            int i13 = (i11 >> 15) & 14;
            h10.x(511388516);
            boolean P = h10.P(kVar2) | h10.P(sVar);
            Object y11 = h10.y();
            if (P || y11 == aVar.a()) {
                y11 = new d(kVar2, sVar, null);
                h10.q(y11);
            }
            h10.O();
            l0.c0.c(kVar2, (io.p) y11, h10, i13);
            if (!sVar.isEmpty()) {
                f10 = f34066k;
            } else {
                f10 = f34065j;
            }
            float f11 = f10;
            int i14 = ((i11 >> 3) & 896) | ((i11 >> 6) & 14) | (i11 & 112);
            c2<c1.c0> b10 = m1Var.b(z11, z10, h10, i14);
            f.a aVar2 = x0.f.f59359u;
            a.C0986a c0986a = x0.a.f59327a;
            x0.f l10 = y.d1.l(kVar.a(aVar2, c0986a.e()), 0.0f, 1, null);
            h10.x(1157296644);
            boolean P2 = h10.P(b10);
            Object y12 = h10.y();
            if (P2 || y12 == aVar.a()) {
                y12 = new e(b10);
                h10.q(y12);
            }
            h10.O();
            v.j.a(l10, (io.l) y12, h10, 0);
            c2<c1.c0> a10 = m1Var.a(z11, z10, h10, i14);
            d0 d0Var = (d0) h10.G(e0.d());
            float l11 = m2.g.l(((m2.g) h10.G(e0.c())).q() + f11);
            h10.x(-539245361);
            if (c1.c0.m(d(a10), q0.f34133a.a(h10, 6).l()) && d0Var != null) {
                i12 = 1157296644;
                d10 = d0Var.a(d(a10), l11, h10, 0);
            } else {
                i12 = 1157296644;
                d10 = d(a10);
            }
            long j10 = d10;
            h10.O();
            x0.f a11 = kVar.a(aVar2, c0986a.h());
            h10.x(i12);
            boolean P3 = h10.P(c2Var);
            Object y13 = h10.y();
            if (P3 || y13 == aVar.a()) {
                y13 = new f(c2Var);
                h10.q(y13);
            }
            h10.O();
            y.g1.a(v.e.c(z0.q.b(y.d1.r(v.z.b(y.n0.a(a11, (io.l) y13), kVar2, k0.n.e(false, f34059d, 0L, h10, 54, 4)), f34058c), f11, e0.g.f(), false, 0L, 0L, 24, null), j10, e0.g.f()), h10, 0);
        }
        l0.l1 l12 = h10.l();
        if (l12 == null) {
            return;
        }
        l12.a(new g(kVar, z10, z11, m1Var, c2Var, kVar2, i10));
    }

    public static final long c(c2<c1.c0> c2Var) {
        return c2Var.getValue().u();
    }

    public static final long d(c2<c1.c0> c2Var) {
        return c2Var.getValue().u();
    }

    public static final void h(e1.e eVar, long j10, float f10, float f11) {
        float f12 = f11 / 2;
        e1.e.u0(eVar, j10, b1.g.a(f12, b1.f.n(eVar.U0())), b1.g.a(f10 - f12, b1.f.n(eVar.U0())), f11, c1.j1.f18697b.b(), null, 0.0f, null, 0, 480, null);
    }

    public static final float i() {
        return f34057b;
    }

    public static final float j() {
        return f34056a;
    }
}
