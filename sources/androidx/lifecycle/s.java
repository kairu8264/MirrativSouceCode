package androidx.lifecycle;

import uo.b3;
import uo.g1;

/* loaded from: classes.dex */
public final class s {
    public static final p a(o oVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        jo.p.h(oVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) oVar.f15595a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(oVar, b3.b(null, 1, null).plus(g1.c().h0()));
        } while (!oVar.f15595a.compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.j();
        return lifecycleCoroutineScopeImpl;
    }
}
