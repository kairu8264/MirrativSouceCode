package ai;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class t33 extends u33 {
    public final Callable A;
    public final /* synthetic */ v33 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t33(v33 v33Var, Callable callable, Executor executor) {
        super(v33Var, executor);
        this.B = v33Var;
        Objects.requireNonNull(callable);
        this.A = callable;
    }

    @Override // ai.r43
    public final Object a() throws Exception {
        return this.A.call();
    }

    @Override // ai.r43
    public final String c() {
        return this.A.toString();
    }

    @Override // ai.u33
    public final void h(Object obj) {
        this.B.u(obj);
    }
}
