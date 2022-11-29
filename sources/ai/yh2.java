package ai;

import ai.d41;
import ai.u01;
import com.google.android.gms.internal.ads.zzdym;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class yh2<R extends d41<AdT>, AdT extends u01> implements ti2<R, AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final ti2<R, AdT> f12597a;

    /* renamed from: b  reason: collision with root package name */
    public final ti2<R, di2<R, AdT>> f12598b;

    /* renamed from: c  reason: collision with root package name */
    public final go2<R, AdT> f12599c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12600d;

    /* renamed from: e  reason: collision with root package name */
    public R f12601e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f12602f;

    public yh2(ti2<R, AdT> ti2Var, ti2<R, di2<R, AdT>> ti2Var2, go2<R, AdT> go2Var, String str, Executor executor) {
        this.f12597a = ti2Var;
        this.f12598b = ti2Var2;
        this.f12599c = go2Var;
        this.f12600d = str;
        this.f12602f = executor;
    }

    @Override // ai.ti2
    public final /* bridge */ /* synthetic */ s43 a(ui2 ui2Var, si2 si2Var, Object obj) {
        return c(ui2Var, si2Var, null);
    }

    @Override // ai.ti2
    /* renamed from: b */
    public final synchronized R d() {
        return this.f12601e;
    }

    public final synchronized s43<AdT> c(final ui2 ui2Var, final si2<R> si2Var, R r10) {
        c41<R> a10 = si2Var.a(ui2Var.f10719b);
        a10.o(new zh2(this.f12600d));
        final R a11 = a10.a();
        a11.d0();
        a11.d0();
        as asVar = a11.d0().f12650d;
        if (asVar.O == null && asVar.T == null) {
            yl2 d02 = a11.d0();
            final xh2 xh2Var = new xh2(si2Var, ui2Var, d02.f12650d, d02.f12652f, this.f12602f, d02.f12656j, null);
            return j43.i(z33.E(((fi2) this.f12598b).b(ui2Var, si2Var, a11)), new p33(this, ui2Var, xh2Var, si2Var, a11) { // from class: ai.uh2

                /* renamed from: a  reason: collision with root package name */
                public final yh2 f10707a;

                /* renamed from: b  reason: collision with root package name */
                public final ui2 f10708b;

                /* renamed from: c  reason: collision with root package name */
                public final xh2 f10709c;

                /* renamed from: d  reason: collision with root package name */
                public final si2 f10710d;

                /* renamed from: e  reason: collision with root package name */
                public final d41 f10711e;

                {
                    this.f10707a = this;
                    this.f10708b = ui2Var;
                    this.f10709c = xh2Var;
                    this.f10710d = si2Var;
                    this.f10711e = a11;
                }

                @Override // ai.p33
                public final s43 a(Object obj) {
                    return this.f10707a.f(this.f10708b, this.f10709c, this.f10710d, this.f10711e, (di2) obj);
                }
            }, this.f12602f);
        }
        this.f12601e = a11;
        return ((ji2) this.f12597a).c(ui2Var, si2Var, a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ s43 e(do2 do2Var) throws Exception {
        Object obj;
        if (do2Var != null && do2Var.f3361a != null && (obj = do2Var.f3362b) != null) {
            Cdo B = jo.B();
            bo B2 = co.B();
            B2.u(2);
            B2.r(go.C());
            B.r(B2);
            do2Var.f3361a.f10355a.q().e().R(B.n());
            return g(do2Var.f3361a, ((xh2) obj).f11937b);
        }
        throw new zzdym(1, "Empty prefetch");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ s43 f(ui2 ui2Var, xh2 xh2Var, si2 si2Var, d41 d41Var, di2 di2Var) throws Exception {
        if (di2Var != null) {
            xh2 xh2Var2 = new xh2(xh2Var.f11936a, xh2Var.f11937b, xh2Var.f11938c, xh2Var.f11939d, xh2Var.f11940e, xh2Var.f11941f, di2Var.f3302a);
            if (di2Var.f3304c != null) {
                this.f12601e = null;
                this.f12599c.c(xh2Var2);
                return g(di2Var.f3304c, ui2Var);
            }
            s43<do2<R, AdT>> d10 = this.f12599c.d(xh2Var2);
            if (d10 != null) {
                this.f12601e = null;
                return j43.i(d10, new p33(this) { // from class: ai.vh2

                    /* renamed from: a  reason: collision with root package name */
                    public final yh2 f11088a;

                    {
                        this.f11088a = this;
                    }

                    @Override // ai.p33
                    public final s43 a(Object obj) {
                        return this.f11088a.e((do2) obj);
                    }
                }, this.f12602f);
            }
            this.f12599c.c(xh2Var2);
            ui2Var = new ui2(ui2Var.f10719b, di2Var.f3303b);
        }
        s43 c10 = ((ji2) this.f12597a).c(ui2Var, si2Var, d41Var);
        this.f12601e = d41Var;
        return c10;
    }

    public final s43<AdT> g(tn2<R, AdT> tn2Var, ui2 ui2Var) {
        R r10 = tn2Var.f10355a;
        this.f12601e = r10;
        if (tn2Var.f10357c != null) {
            if (r10.H() != null) {
                tn2Var.f10357c.e().s(tn2Var.f10355a.H());
            }
            return j43.a(tn2Var.f10357c);
        }
        r10.q().i(tn2Var.f10356b);
        return ((ji2) this.f12597a).c(ui2Var, null, tn2Var.f10355a);
    }
}
