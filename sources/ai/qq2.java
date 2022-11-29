package ai;

import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class qq2 implements nq2 {

    /* renamed from: a  reason: collision with root package name */
    public final nq2 f9060a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<mq2> f9061b = new LinkedBlockingQueue();

    /* renamed from: c  reason: collision with root package name */
    public final int f9062c = ((Integer) ft.c().c(ox.f8035l6)).intValue();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f9063d = new AtomicBoolean(false);

    public qq2(nq2 nq2Var, ScheduledExecutorService scheduledExecutorService) {
        this.f9060a = nq2Var;
        long intValue = ((Integer) ft.c().c(ox.f8027k6)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable(this) { // from class: ai.pq2

            /* renamed from: w  reason: collision with root package name */
            public final qq2 f8501w;

            {
                this.f8501w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8501w.c();
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    @Override // ai.nq2
    public final void a(mq2 mq2Var) {
        if (this.f9061b.size() >= this.f9062c) {
            if (this.f9063d.getAndSet(true)) {
                return;
            }
            Queue<mq2> queue = this.f9061b;
            mq2 a10 = mq2.a("dropped_event");
            Map<String, String> j10 = mq2Var.j();
            if (j10.containsKey(ActionLogBase.ACTION)) {
                a10.c("dropped_action", j10.get(ActionLogBase.ACTION));
            }
            queue.offer(a10);
            return;
        }
        this.f9061b.offer(mq2Var);
    }

    @Override // ai.nq2
    public final String b(mq2 mq2Var) {
        return this.f9060a.b(mq2Var);
    }

    public final /* bridge */ /* synthetic */ void c() {
        while (!this.f9061b.isEmpty()) {
            this.f9060a.a(this.f9061b.remove());
        }
    }
}
