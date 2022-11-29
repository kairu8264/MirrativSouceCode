package ai;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h43<V> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4743a;

    /* renamed from: b  reason: collision with root package name */
    public final zz2<s43<? extends V>> f4744b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h43(boolean z10, boolean z11, zz2<s43<? extends V>> zz2Var) {
        this.f4743a = z10;
        this.f4744b = z11;
    }

    public final <C> s43<C> a(Callable<C> callable, Executor executor) {
        return new v33(this.f4744b, this.f4743a, executor, callable);
    }
}
