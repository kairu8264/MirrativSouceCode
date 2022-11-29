package ai;

import ai.d41;
import ai.u01;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class go2<R extends d41<AdT>, AdT extends u01> {

    /* renamed from: a  reason: collision with root package name */
    public final kn2 f4528a;

    /* renamed from: b  reason: collision with root package name */
    public final eo2<R, AdT> f4529b;

    /* renamed from: c  reason: collision with root package name */
    public final fn2 f4530c;

    /* renamed from: e  reason: collision with root package name */
    public no2<R, AdT> f4532e;

    /* renamed from: f  reason: collision with root package name */
    public int f4533f = 1;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<fo2<R, AdT>> f4531d = new ArrayDeque<>();

    public go2(kn2 kn2Var, fn2 fn2Var, eo2<R, AdT> eo2Var) {
        this.f4528a = kn2Var;
        this.f4530c = fn2Var;
        this.f4529b = eo2Var;
        fn2Var.a(new en2(this) { // from class: ai.bo2

            /* renamed from: a  reason: collision with root package name */
            public final go2 f2428a;

            {
                this.f2428a = this;
            }

            @Override // ai.en2
            public final void zza() {
                this.f2428a.f();
            }
        });
    }

    public final synchronized void c(fo2<R, AdT> fo2Var) {
        this.f4531d.add(fo2Var);
    }

    public final synchronized s43<do2<R, AdT>> d(fo2<R, AdT> fo2Var) {
        this.f4533f = 2;
        if (i()) {
            return null;
        }
        return this.f4532e.b(fo2Var);
    }

    public final /* synthetic */ void f() {
        synchronized (this) {
            this.f4533f = 1;
            h();
        }
    }

    public final synchronized void h() {
        if (((Boolean) ft.c().c(ox.D4)).booleanValue() && !wg.t.h().p().n().i()) {
            this.f4531d.clear();
            return;
        }
        if (i()) {
            while (!this.f4531d.isEmpty()) {
                fo2<R, AdT> pollFirst = this.f4531d.pollFirst();
                if (pollFirst == null || (pollFirst.zzb() != null && this.f4528a.a(pollFirst.zzb()))) {
                    no2<R, AdT> no2Var = new no2<>(this.f4528a, this.f4529b, pollFirst);
                    this.f4532e = no2Var;
                    no2Var.a(new co2(this, pollFirst));
                    return;
                }
            }
        }
    }

    public final synchronized boolean i() {
        return this.f4532e == null;
    }
}
