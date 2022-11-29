package ai;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class ja1<ListenerT> {

    /* renamed from: w  reason: collision with root package name */
    public final Map<ListenerT, Executor> f5673w = new HashMap();

    public ja1(Set<gc1<ListenerT>> set) {
        z0(set);
    }

    public final synchronized void C0(final ia1<ListenerT> ia1Var) {
        for (Map.Entry<ListenerT, Executor> entry : this.f5673w.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(ia1Var, key) { // from class: ai.ha1

                /* renamed from: w  reason: collision with root package name */
                public final ia1 f4789w;

                /* renamed from: x  reason: collision with root package name */
                public final Object f4790x;

                {
                    this.f4789w = ia1Var;
                    this.f4790x = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f4789w.a(this.f4790x);
                    } catch (Throwable th2) {
                        wg.t.h().l(th2, "EventEmitter.notify");
                        yg.p1.l("Event emitter exception.", th2);
                    }
                }
            });
        }
    }

    public final synchronized void x0(gc1<ListenerT> gc1Var) {
        y0(gc1Var.f4386a, gc1Var.f4387b);
    }

    public final synchronized void y0(ListenerT listenert, Executor executor) {
        this.f5673w.put(listenert, executor);
    }

    public final synchronized void z0(Set<gc1<ListenerT>> set) {
        for (gc1<ListenerT> gc1Var : set) {
            x0(gc1Var);
        }
    }
}
