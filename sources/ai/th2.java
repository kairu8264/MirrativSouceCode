package ai;

import ai.d41;
import ai.u01;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class th2<R extends d41<AdT>, AdT extends u01> implements ti2<R, tn2<R, AdT>> {

    /* renamed from: a  reason: collision with root package name */
    public R f10309a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f10310b = z43.a();

    @Override // ai.ti2
    public final /* bridge */ /* synthetic */ s43 a(ui2 ui2Var, si2 si2Var, Object obj) {
        return c(ui2Var, si2Var, null);
    }

    public final R b() {
        return this.f10309a;
    }

    public final s43<tn2<R, AdT>> c(ui2 ui2Var, si2<R> si2Var, R r10) {
        c41<R> a10 = si2Var.a(ui2Var.f10719b);
        a10.m(new zi2(true));
        R a11 = a10.a();
        this.f10309a = a11;
        final y11 q10 = a11.q();
        final tn2 tn2Var = new tn2();
        return j43.j(j43.i(z33.E(q10.c()), new p33(this, tn2Var, q10) { // from class: ai.rh2

            /* renamed from: a  reason: collision with root package name */
            public final th2 f9445a;

            /* renamed from: b  reason: collision with root package name */
            public final tn2 f9446b;

            /* renamed from: c  reason: collision with root package name */
            public final y11 f9447c;

            {
                this.f9445a = this;
                this.f9446b = tn2Var;
                this.f9447c = q10;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                tn2 tn2Var2 = this.f9446b;
                y11 y11Var = this.f9447c;
                sl2 sl2Var = (sl2) obj;
                tn2Var2.f10356b = sl2Var;
                Iterator<fl2> it = sl2Var.f9876b.f9496a.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : it.next().f4080a) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return y11Var.d(j43.a(sl2Var));
                    }
                }
                return j43.a(null);
            }
        }, this.f10310b), new bx2(tn2Var) { // from class: ai.sh2

            /* renamed from: a  reason: collision with root package name */
            public final tn2 f9838a;

            {
                this.f9838a = tn2Var;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                tn2 tn2Var2 = this.f9838a;
                tn2Var2.f10357c = (AdT) obj;
                return tn2Var2;
            }
        }, this.f10310b);
    }

    @Override // ai.ti2
    public final /* bridge */ /* synthetic */ Object d() {
        return this.f10309a;
    }
}
