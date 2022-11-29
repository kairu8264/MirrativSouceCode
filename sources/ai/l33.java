package ai;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class l33 extends j33 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<n33<?>, Set<Throwable>> f6475a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicIntegerFieldUpdater<n33<?>> f6476b;

    public l33(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f6475a = atomicReferenceFieldUpdater;
        this.f6476b = atomicIntegerFieldUpdater;
    }

    @Override // ai.j33
    public final void a(n33<?> n33Var, Set<Throwable> set, Set<Throwable> set2) {
        r23.a(this.f6475a, n33Var, null, set2);
    }

    @Override // ai.j33
    public final int b(n33<?> n33Var) {
        return this.f6476b.decrementAndGet(n33Var);
    }
}
