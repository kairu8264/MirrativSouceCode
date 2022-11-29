package o6;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import ep.d0;

/* loaded from: classes.dex */
public final class b {
    public static final Object a(ep.e eVar, ao.d<? super d0> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        l lVar = new l(eVar, qVar);
        FirebasePerfOkHttpClient.enqueue(eVar, lVar);
        qVar.M(lVar);
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }
}
