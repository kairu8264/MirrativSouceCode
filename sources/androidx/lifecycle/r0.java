package androidx.lifecycle;

import uo.b3;
import uo.g1;

/* loaded from: classes.dex */
public final class r0 {
    public static final uo.q0 a(q0 q0Var) {
        jo.p.h(q0Var, "<this>");
        uo.q0 q0Var2 = (uo.q0) q0Var.c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (q0Var2 != null) {
            return q0Var2;
        }
        Object e10 = q0Var.e("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new e(b3.b(null, 1, null).plus(g1.c().h0())));
        jo.p.g(e10, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (uo.q0) e10;
    }
}
