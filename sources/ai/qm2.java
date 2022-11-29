package ai;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes3.dex */
public final class qm2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Deque<s43<T>> f9008a = new LinkedBlockingDeque();

    /* renamed from: b  reason: collision with root package name */
    public final Callable<T> f9009b;

    /* renamed from: c  reason: collision with root package name */
    public final t43 f9010c;

    public qm2(Callable<T> callable, t43 t43Var) {
        this.f9009b = callable;
        this.f9010c = t43Var;
    }

    public final synchronized void a(int i10) {
        int size = i10 - this.f9008a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f9008a.add(this.f9010c.h(this.f9009b));
        }
    }

    public final synchronized s43<T> b() {
        a(1);
        return this.f9008a.poll();
    }

    public final synchronized void c(s43<T> s43Var) {
        this.f9008a.addFirst(s43Var);
    }
}
