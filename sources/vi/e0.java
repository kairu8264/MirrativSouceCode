package vi;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class e0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f57357a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public Queue<d0<TResult>> f57358b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f57359c;

    public final void a(d0<TResult> d0Var) {
        synchronized (this.f57357a) {
            if (this.f57358b == null) {
                this.f57358b = new ArrayDeque();
            }
            this.f57358b.add(d0Var);
        }
    }

    public final void b(g<TResult> gVar) {
        d0<TResult> poll;
        synchronized (this.f57357a) {
            if (this.f57358b != null && !this.f57359c) {
                this.f57359c = true;
                while (true) {
                    synchronized (this.f57357a) {
                        poll = this.f57358b.poll();
                        if (poll == null) {
                            this.f57359c = false;
                            return;
                        }
                    }
                    poll.d(gVar);
                }
            }
        }
    }
}
