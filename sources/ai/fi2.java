package ai;

import ai.d41;
import ai.u01;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class fi2<R extends d41<AdT>, AdT extends u01> implements ti2<R, di2<R, AdT>> {

    /* renamed from: a  reason: collision with root package name */
    public final kn2 f4044a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4045b;

    /* renamed from: c  reason: collision with root package name */
    public final e43<Void> f4046c = new ci2(this);

    public fi2(kn2 kn2Var, Executor executor) {
        this.f4044a = kn2Var;
        this.f4045b = executor;
    }

    @Override // ai.ti2
    public final /* bridge */ /* synthetic */ s43 a(ui2 ui2Var, si2 si2Var, Object obj) {
        return b(ui2Var, si2Var, null);
    }

    public final s43<di2<R, AdT>> b(ui2 ui2Var, si2<R> si2Var, final R r10) {
        return j43.f(j43.i(z33.E(new pi2(this.f4044a, r10, this.f4045b).c()), new p33(this, r10) { // from class: ai.ai2

            /* renamed from: a  reason: collision with root package name */
            public final fi2 f1876a;

            /* renamed from: b  reason: collision with root package name */
            public final d41 f1877b;

            {
                this.f1876a = this;
                this.f1877b = r10;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f1876a.c(this.f1877b, (oi2) obj);
            }
        }, this.f4045b), Exception.class, new bi2(this), this.f4045b);
    }

    public final /* synthetic */ s43 c(d41 d41Var, oi2 oi2Var) throws Exception {
        un2 un2Var = oi2Var.f7822b;
        ie0 ie0Var = oi2Var.f7821a;
        tn2<?, ?> e10 = un2Var != null ? this.f4044a.e(un2Var) : null;
        if (un2Var == null) {
            return j43.a(null);
        }
        if (e10 != null && ie0Var != null) {
            j43.p(d41Var.q().g(ie0Var), this.f4046c, this.f4045b);
        }
        return j43.a(new di2(un2Var, ie0Var, e10));
    }

    @Override // ai.ti2
    public final /* bridge */ /* synthetic */ Object d() {
        return null;
    }
}
