package ai;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes3.dex */
public final class i53<V> extends y33<V> implements RunnableFuture<V> {
    public volatile r43<?> D;

    public i53(o33<V> o33Var) {
        this.D = new f53(this, o33Var);
    }

    public static <V> i53<V> F(Runnable runnable, V v10) {
        return new i53<>(Executors.callable(runnable, v10));
    }

    @Override // ai.a33
    public final String h() {
        r43<?> r43Var = this.D;
        if (r43Var != null) {
            String obj = r43Var.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 7);
            sb2.append("task=[");
            sb2.append(obj);
            sb2.append("]");
            return sb2.toString();
        }
        return super.h();
    }

    @Override // ai.a33
    public final void j() {
        r43<?> r43Var;
        if (t() && (r43Var = this.D) != null) {
            r43Var.g();
        }
        this.D = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        r43<?> r43Var = this.D;
        if (r43Var != null) {
            r43Var.run();
        }
        this.D = null;
    }

    public i53(Callable<V> callable) {
        this.D = new h53(this, callable);
    }
}
