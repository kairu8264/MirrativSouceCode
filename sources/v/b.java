package v;

import android.content.Context;
import android.os.Build;
import q1.q0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f56127a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final x0.f f56128b;

    /* loaded from: classes.dex */
    public static final class a implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f56129a;

        @Override // v.i0
        public void a(long j10, long j11, b1.f fVar, int i10) {
        }

        @Override // v.i0
        public Object b(long j10, ao.d<? super wn.v> dVar) {
            return wn.v.f59242a;
        }

        @Override // v.i0
        public boolean c() {
            return false;
        }

        @Override // v.i0
        public Object d(long j10, ao.d<? super m2.u> dVar) {
            return m2.u.b(m2.u.f40549b.a());
        }

        @Override // v.i0
        public x0.f e() {
            return x0.f.f59359u;
        }

        @Override // v.i0
        public long f(long j10, b1.f fVar, int i10) {
            return b1.f.f16721b.c();
        }

        @Override // v.i0
        public boolean isEnabled() {
            return this.f56129a;
        }

        @Override // v.i0
        public void setEnabled(boolean z10) {
            this.f56129a = z10;
        }
    }

    /* renamed from: v.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0882b extends jo.q implements io.q<q1.e0, q1.b0, m2.b, q1.d0> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0882b f56130w = new C0882b();

        /* renamed from: v.b$b$a */
        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q1.q0 f56131w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f56132x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1.q0 q0Var, int i10) {
                super(1);
                this.f56131w = q0Var;
                this.f56132x = i10;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                q1.q0 q0Var = this.f56131w;
                q0.a.v(aVar, q0Var, ((-this.f56132x) / 2) - ((q0Var.r0() - this.f56131w.l0()) / 2), ((-this.f56132x) / 2) - ((this.f56131w.f0() - this.f56131w.g0()) / 2), 0.0f, null, 12, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        public C0882b() {
            super(3);
        }

        public final q1.d0 a(q1.e0 e0Var, q1.b0 b0Var, long j10) {
            jo.p.h(e0Var, "$this$layout");
            jo.p.h(b0Var, "measurable");
            q1.q0 M = b0Var.M(j10);
            int X = e0Var.X(m2.g.l(n.b() * 2));
            return q1.e0.O0(e0Var, M.l0() - X, M.g0() - X, null, new a(M, X), 4, null);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ q1.d0 s0(q1.e0 e0Var, q1.b0 b0Var, m2.b bVar) {
            return a(e0Var, b0Var, bVar.t());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<q1.e0, q1.b0, m2.b, q1.d0> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f56133w = new c();

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q1.q0 f56134w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f56135x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1.q0 q0Var, int i10) {
                super(1);
                this.f56134w = q0Var;
                this.f56135x = i10;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                q1.q0 q0Var = this.f56134w;
                int i10 = this.f56135x;
                q0.a.j(aVar, q0Var, i10 / 2, i10 / 2, 0.0f, 4, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        public c() {
            super(3);
        }

        public final q1.d0 a(q1.e0 e0Var, q1.b0 b0Var, long j10) {
            jo.p.h(e0Var, "$this$layout");
            jo.p.h(b0Var, "measurable");
            q1.q0 M = b0Var.M(j10);
            int X = e0Var.X(m2.g.l(n.b() * 2));
            return q1.e0.O0(e0Var, M.r0() + X, M.f0() + X, null, new a(M, X), 4, null);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ q1.d0 s0(q1.e0 e0Var, q1.b0 b0Var, m2.b bVar) {
            return a(e0Var, b0Var, bVar.t());
        }
    }

    static {
        x0.f fVar;
        if (Build.VERSION.SDK_INT >= 31) {
            fVar = q1.z.a(q1.z.a(x0.f.f59359u, C0882b.f56130w), c.f56133w);
        } else {
            fVar = x0.f.f59359u;
        }
        f56128b = fVar;
    }

    public static final i0 b(l0.i iVar, int i10) {
        iVar.x(-81138291);
        Context context = (Context) iVar.G(androidx.compose.ui.platform.z.g());
        g0 g0Var = (g0) iVar.G(h0.a());
        iVar.x(511388516);
        boolean P = iVar.P(context) | iVar.P(g0Var);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            if (g0Var != null) {
                y10 = new v.a(context, g0Var);
            } else {
                y10 = f56127a;
            }
            iVar.q(y10);
        }
        iVar.O();
        i0 i0Var = (i0) y10;
        iVar.O();
        return i0Var;
    }
}
