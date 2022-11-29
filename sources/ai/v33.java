package ai;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class v33<V> extends i33<Object, V> {
    public u33<?> L;

    public v33(uz2<? extends s43<?>> uz2Var, boolean z10, Executor executor, Callable<V> callable) {
        super(uz2Var, z10, false);
        this.L = new t33(this, callable, executor);
        T();
    }

    @Override // ai.i33
    public final void M() {
        u33<?> u33Var = this.L;
        if (u33Var != null) {
            u33Var.i();
        }
    }

    @Override // ai.i33
    public final void N(int i10) {
        super.N(i10);
        if (i10 == 1) {
            this.L = null;
        }
    }

    @Override // ai.i33
    public final void W(int i10, Object obj) {
    }

    @Override // ai.a33
    public final void s() {
        u33<?> u33Var = this.L;
        if (u33Var != null) {
            u33Var.g();
        }
    }
}
