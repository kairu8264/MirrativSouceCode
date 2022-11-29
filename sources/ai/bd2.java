package ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class bd2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<xc2<? extends wc2<T>>> f2294a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f2295b;

    public bd2(Executor executor, Set<xc2<? extends wc2<T>>> set) {
        this.f2295b = executor;
        this.f2294a = set;
    }

    public final s43<T> a(final T t10) {
        final ArrayList arrayList = new ArrayList(this.f2294a.size());
        for (final xc2<? extends wc2<T>> xc2Var : this.f2294a) {
            s43<? extends wc2<T>> zza = xc2Var.zza();
            if (fz.f4253a.e().booleanValue()) {
                final long elapsedRealtime = wg.t.k().elapsedRealtime();
                zza.c(new Runnable(xc2Var, elapsedRealtime) { // from class: ai.yc2

                    /* renamed from: w  reason: collision with root package name */
                    public final xc2 f12531w;

                    /* renamed from: x  reason: collision with root package name */
                    public final long f12532x;

                    {
                        this.f12531w = xc2Var;
                        this.f12532x = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        xc2 xc2Var2 = this.f12531w;
                        long j10 = this.f12532x;
                        String canonicalName = xc2Var2.getClass().getCanonicalName();
                        long elapsedRealtime2 = wg.t.k().elapsedRealtime();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb2.append("Signal runtime : ");
                        sb2.append(canonicalName);
                        sb2.append(" = ");
                        sb2.append(elapsedRealtime2 - j10);
                        yg.p1.k(sb2.toString());
                    }
                }, hk0.f4883f);
            }
            arrayList.add(zza);
        }
        return j43.o(arrayList).a(new Callable(arrayList, t10) { // from class: ai.ad2

            /* renamed from: a  reason: collision with root package name */
            public final List f1826a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f1827b;

            {
                this.f1826a = arrayList;
                this.f1827b = t10;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<s43> list = this.f1826a;
                Object obj = this.f1827b;
                for (s43 s43Var : list) {
                    wc2 wc2Var = (wc2) s43Var.get();
                    if (wc2Var != null) {
                        wc2Var.d(obj);
                    }
                }
                return obj;
            }
        }, this.f2295b);
    }
}
