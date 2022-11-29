package ai;

import android.annotation.TargetApi;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b62 implements r71, k61, y41, p51, or, v41, h71, xb, l51, nc1 {
    public final nq2 E;

    /* renamed from: w  reason: collision with root package name */
    public final AtomicReference<nt> f2253w = new AtomicReference<>();

    /* renamed from: x  reason: collision with root package name */
    public final AtomicReference<hu> f2254x = new AtomicReference<>();

    /* renamed from: y  reason: collision with root package name */
    public final AtomicReference<iv> f2255y = new AtomicReference<>();

    /* renamed from: z  reason: collision with root package name */
    public final AtomicReference<qt> f2256z = new AtomicReference<>();
    public final AtomicReference<pu> A = new AtomicReference<>();
    public final AtomicBoolean B = new AtomicBoolean(true);
    public final AtomicBoolean C = new AtomicBoolean(false);
    public final AtomicBoolean D = new AtomicBoolean(false);
    public final BlockingQueue<Pair<String, String>> F = new ArrayBlockingQueue(((Integer) ft.c().c(ox.f8043m6)).intValue());

    public b62(nq2 nq2Var) {
        this.E = nq2Var;
    }

    public final void A(hu huVar) {
        this.f2254x.set(huVar);
        this.C.set(true);
        R();
    }

    @Override // ai.v41
    public final void B(ye0 ye0Var, String str, String str2) {
    }

    public final void K(iv ivVar) {
        this.f2255y.set(ivVar);
    }

    public final void M(qt qtVar) {
        this.f2256z.set(qtVar);
    }

    public final void N(pu puVar) {
        this.A.set(puVar);
    }

    @TargetApi(5)
    public final void R() {
        if (this.C.get() && this.D.get()) {
            Iterator it = this.F.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                hi2.a(this.f2254x, new gi2(pair) { // from class: ai.q52

                    /* renamed from: a  reason: collision with root package name */
                    public final Pair f8836a;

                    {
                        this.f8836a = pair;
                    }

                    @Override // ai.gi2
                    public final void a(Object obj) {
                        Pair pair2 = this.f8836a;
                        ((hu) obj).B5((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.F.clear();
            this.B.set(false);
        }
    }

    @Override // ai.k61
    public final synchronized void a() {
        hi2.a(this.f2253w, x52.f11872a);
        hi2.a(this.f2256z, y52.f12455a);
        this.D.set(true);
        R();
    }

    public final synchronized nt c() {
        return this.f2253w.get();
    }

    @Override // ai.v41
    public final void e() {
        hi2.a(this.f2253w, z52.f12889a);
        hi2.a(this.A, a62.f1755a);
        hi2.a(this.A, i52.f5123a);
    }

    @Override // ai.p51
    public final void f() {
        hi2.a(this.f2253w, m52.f6813a);
    }

    @Override // ai.v41
    public final void g() {
        hi2.a(this.f2253w, w52.f11497a);
    }

    @Override // ai.v41
    public final void h() {
        hi2.a(this.f2253w, h52.f4752a);
        hi2.a(this.A, r52.f9346a);
    }

    @Override // ai.v41
    public final void j() {
    }

    @Override // ai.v41
    public final void k() {
    }

    @Override // ai.l51
    public final void n(final sr srVar) {
        hi2.a(this.A, new gi2(srVar) { // from class: ai.p52

            /* renamed from: a  reason: collision with root package name */
            public final sr f8318a;

            {
                this.f8318a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((pu) obj).j2(this.f8318a);
            }
        });
    }

    @Override // ai.or
    public final void onAdClicked() {
        if (((Boolean) ft.c().c(ox.f7954b7)).booleanValue()) {
            return;
        }
        hi2.a(this.f2253w, j52.f5628a);
    }

    @Override // ai.h71
    public final void p(final hs hsVar) {
        hi2.a(this.f2255y, new gi2(hsVar) { // from class: ai.n52

            /* renamed from: a  reason: collision with root package name */
            public final hs f7199a;

            {
                this.f7199a = hsVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((iv) obj).d4(this.f7199a);
            }
        });
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
    }

    public final synchronized hu t() {
        return this.f2254x.get();
    }

    @Override // ai.r71
    public final void u(sl2 sl2Var) {
        this.B.set(true);
        this.D.set(false);
    }

    @Override // ai.xb
    @TargetApi(5)
    public final synchronized void v(final String str, final String str2) {
        if (this.B.get()) {
            if (!this.F.offer(new Pair<>(str, str2))) {
                uj0.a("The queue for app events is full, dropping the new event.");
                nq2 nq2Var = this.E;
                if (nq2Var != null) {
                    mq2 a10 = mq2.a("dae_action");
                    a10.c("dae_name", str);
                    a10.c("dae_data", str2);
                    nq2Var.a(a10);
                    return;
                }
            }
            return;
        }
        hi2.a(this.f2254x, new gi2(str, str2) { // from class: ai.o52

            /* renamed from: a  reason: collision with root package name */
            public final String f7664a;

            /* renamed from: b  reason: collision with root package name */
            public final String f7665b;

            {
                this.f7664a = str;
                this.f7665b = str2;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((hu) obj).B5(this.f7664a, this.f7665b);
            }
        });
    }

    public final void y(nt ntVar) {
        this.f2253w.set(ntVar);
    }

    @Override // ai.y41
    public final void z(final sr srVar) {
        hi2.a(this.f2253w, new gi2(srVar) { // from class: ai.t52

            /* renamed from: a  reason: collision with root package name */
            public final sr f10152a;

            {
                this.f10152a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((nt) obj).Z(this.f10152a);
            }
        });
        hi2.a(this.f2253w, new gi2(srVar) { // from class: ai.u52

            /* renamed from: a  reason: collision with root package name */
            public final sr f10611a;

            {
                this.f10611a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((nt) obj).F(this.f10611a.f9916w);
            }
        });
        hi2.a(this.f2256z, new gi2(srVar) { // from class: ai.v52

            /* renamed from: a  reason: collision with root package name */
            public final sr f10981a;

            {
                this.f10981a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((qt) obj).B2(this.f10981a);
            }
        });
        this.B.set(false);
        this.F.clear();
    }

    @Override // ai.nc1
    public final void zzb() {
        if (((Boolean) ft.c().c(ox.f7954b7)).booleanValue()) {
            hi2.a(this.f2253w, k52.f6094a);
        }
        hi2.a(this.A, l52.f6485a);
    }
}
