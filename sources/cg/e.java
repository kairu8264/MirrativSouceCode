package cg;

import android.content.Context;
import cg.u;
import java.util.concurrent.Executor;
import kg.w;
import kg.x;
import kg.y;
import lg.m0;
import lg.n0;
import lg.u0;

/* loaded from: classes3.dex */
public final class e extends u {
    public rn.a A;
    public rn.a<String> B;
    public rn.a<m0> C;
    public rn.a<kg.g> D;
    public rn.a<y> E;
    public rn.a<jg.c> F;
    public rn.a<kg.s> G;
    public rn.a<w> H;
    public rn.a<t> I;

    /* renamed from: w  reason: collision with root package name */
    public rn.a<Executor> f19610w;

    /* renamed from: x  reason: collision with root package name */
    public rn.a<Context> f19611x;

    /* renamed from: y  reason: collision with root package name */
    public rn.a f19612y;

    /* renamed from: z  reason: collision with root package name */
    public rn.a f19613z;

    /* loaded from: classes3.dex */
    public static final class b implements u.a {

        /* renamed from: a  reason: collision with root package name */
        public Context f19614a;

        public b() {
        }

        @Override // cg.u.a
        public u a() {
            fg.d.a(this.f19614a, Context.class);
            return new e(this.f19614a);
        }

        @Override // cg.u.a
        /* renamed from: c */
        public b b(Context context) {
            this.f19614a = (Context) fg.d.b(context);
            return this;
        }
    }

    public static u.a d() {
        return new b();
    }

    @Override // cg.u
    public lg.d a() {
        return this.C.get();
    }

    @Override // cg.u
    public t c() {
        return this.I.get();
    }

    public final void e(Context context) {
        this.f19610w = fg.a.b(k.a());
        fg.b a10 = fg.c.a(context);
        this.f19611x = a10;
        dg.j a11 = dg.j.a(a10, ng.c.a(), ng.d.a());
        this.f19612y = a11;
        this.f19613z = fg.a.b(dg.l.a(this.f19611x, a11));
        this.A = u0.a(this.f19611x, lg.g.a(), lg.i.a());
        this.B = lg.h.a(this.f19611x);
        this.C = fg.a.b(n0.a(ng.c.a(), ng.d.a(), lg.j.a(), this.A, this.B));
        jg.g b10 = jg.g.b(ng.c.a());
        this.D = b10;
        jg.i a12 = jg.i.a(this.f19611x, this.C, b10, ng.d.a());
        this.E = a12;
        rn.a<Executor> aVar = this.f19610w;
        rn.a aVar2 = this.f19613z;
        rn.a<m0> aVar3 = this.C;
        this.F = jg.d.a(aVar, aVar2, a12, aVar3, aVar3);
        rn.a<Context> aVar4 = this.f19611x;
        rn.a aVar5 = this.f19613z;
        rn.a<m0> aVar6 = this.C;
        this.G = kg.t.a(aVar4, aVar5, aVar6, this.E, this.f19610w, aVar6, ng.c.a(), ng.d.a(), this.C);
        rn.a<Executor> aVar7 = this.f19610w;
        rn.a<m0> aVar8 = this.C;
        this.H = x.a(aVar7, aVar8, this.E, aVar8);
        this.I = fg.a.b(v.a(ng.c.a(), ng.d.a(), this.F, this.G, this.H));
    }

    public e(Context context) {
        e(context);
    }
}
