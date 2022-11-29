package ai;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class np2 {
    public static final <O> tp2<O> a(s43<O> s43Var, Object obj, up2 up2Var) {
        s43 s43Var2;
        s43Var2 = up2.f10789d;
        return new tp2<>(up2Var, obj, s43Var2, Collections.emptyList(), s43Var);
    }

    public static final <O> tp2<O> b(Callable<O> callable, Object obj, up2 up2Var) {
        t43 t43Var;
        t43Var = up2Var.f10790a;
        return c(callable, t43Var, obj, up2Var);
    }

    public static final <O> tp2<O> c(Callable<O> callable, t43 t43Var, Object obj, up2 up2Var) {
        s43 s43Var;
        s43Var = up2.f10789d;
        return new tp2<>(up2Var, obj, s43Var, Collections.emptyList(), t43Var.h(callable));
    }

    public static final tp2 d(final gp2 gp2Var, t43 t43Var, Object obj, up2 up2Var) {
        return c(new Callable(gp2Var) { // from class: ai.mp2

            /* renamed from: a  reason: collision with root package name */
            public final gp2 f6998a;

            {
                this.f6998a = gp2Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f6998a.zza();
                return null;
            }
        }, t43Var, obj, up2Var);
    }
}
