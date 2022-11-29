package v;

import l0.u1;

/* loaded from: classes.dex */
public final class r0 implements w.b0 {

    /* renamed from: f  reason: collision with root package name */
    public static final c f56375f = new c(null);

    /* renamed from: g  reason: collision with root package name */
    public static final u0.i<r0, ?> f56376g = u0.j.a(a.f56382w, b.f56383w);

    /* renamed from: a  reason: collision with root package name */
    public final l0.s0 f56377a;

    /* renamed from: d  reason: collision with root package name */
    public float f56380d;

    /* renamed from: b  reason: collision with root package name */
    public final x.m f56378b = x.l.a();

    /* renamed from: c  reason: collision with root package name */
    public l0.s0<Integer> f56379c = u1.f(Integer.MAX_VALUE, u1.n());

    /* renamed from: e  reason: collision with root package name */
    public final w.b0 f56381e = w.c0.a(new d());

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<u0.k, r0, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f56382w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Integer invoke(u0.k kVar, r0 r0Var) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(r0Var, "it");
            return Integer.valueOf(r0Var.k());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Integer, r0> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f56383w = new b();

        public b() {
            super(1);
        }

        public final r0 a(int i10) {
            return new r0(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ r0 invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final u0.i<r0, ?> a() {
            return r0.f56376g;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Float, Float> {
        public d() {
            super(1);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return invoke(f10.floatValue());
        }

        public final Float invoke(float f10) {
            float k10 = r0.this.k() + f10 + r0.this.f56380d;
            float l10 = po.n.l(k10, 0.0f, r0.this.j());
            boolean z10 = !(k10 == l10);
            float k11 = l10 - r0.this.k();
            int c10 = lo.c.c(k11);
            r0 r0Var = r0.this;
            r0Var.m(r0Var.k() + c10);
            r0.this.f56380d = k11 - c10;
            if (z10) {
                f10 = k11;
            }
            return Float.valueOf(f10);
        }
    }

    public r0(int i10) {
        this.f56377a = u1.f(Integer.valueOf(i10), u1.n());
    }

    @Override // w.b0
    public Object a(d0 d0Var, io.p<? super w.y, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar) {
        Object a10 = this.f56381e.a(d0Var, pVar, dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    @Override // w.b0
    public boolean c() {
        return this.f56381e.c();
    }

    @Override // w.b0
    public float d(float f10) {
        return this.f56381e.d(f10);
    }

    public final x.m i() {
        return this.f56378b;
    }

    public final int j() {
        return this.f56379c.getValue().intValue();
    }

    public final int k() {
        return ((Number) this.f56377a.getValue()).intValue();
    }

    public final void l(int i10) {
        this.f56379c.setValue(Integer.valueOf(i10));
        if (k() > i10) {
            m(i10);
        }
    }

    public final void m(int i10) {
        this.f56377a.setValue(Integer.valueOf(i10));
    }
}
