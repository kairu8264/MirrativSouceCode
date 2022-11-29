package ai;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class kt2 {

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<Runnable> f6357a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadPoolExecutor f6358b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<jt2> f6359c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public jt2 f6360d = null;

    public kt2() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f6357a = linkedBlockingQueue;
        this.f6358b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void a(jt2 jt2Var) {
        jt2Var.b(this);
        this.f6359c.add(jt2Var);
        if (this.f6360d == null) {
            c();
        }
    }

    public final void b(jt2 jt2Var) {
        this.f6360d = null;
        c();
    }

    public final void c() {
        jt2 poll = this.f6359c.poll();
        this.f6360d = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f6358b, new Object[0]);
        }
    }
}
