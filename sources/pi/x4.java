package pi;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public final class x4 extends Thread {

    /* renamed from: w  reason: collision with root package name */
    public final Object f48338w;

    /* renamed from: x  reason: collision with root package name */
    public final BlockingQueue<w4<?>> f48339x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f48340y = false;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ y4 f48341z;

    public x4(y4 y4Var, String str, BlockingQueue<w4<?>> blockingQueue) {
        this.f48341z = y4Var;
        rh.p.i(str);
        rh.p.i(blockingQueue);
        this.f48338w = new Object();
        this.f48339x = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f48338w) {
            this.f48338w.notifyAll();
        }
    }

    public final void b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        x4 x4Var;
        x4 x4Var2;
        obj = this.f48341z.f48379i;
        synchronized (obj) {
            if (!this.f48340y) {
                semaphore = this.f48341z.f48380j;
                semaphore.release();
                obj2 = this.f48341z.f48379i;
                obj2.notifyAll();
                x4Var = this.f48341z.f48373c;
                if (this == x4Var) {
                    this.f48341z.f48373c = null;
                } else {
                    x4Var2 = this.f48341z.f48374d;
                    if (this == x4Var2) {
                        this.f48341z.f48374d = null;
                    } else {
                        this.f48341z.f48285a.r().p().a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f48340y = true;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.f48341z.f48285a.r().v().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.f48341z.f48380j;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                w4<?> poll = this.f48339x.poll();
                if (poll != null) {
                    Process.setThreadPriority(true != poll.f48303x ? 10 : threadPriority);
                    poll.run();
                } else {
                    synchronized (this.f48338w) {
                        if (this.f48339x.peek() == null) {
                            boolean unused = this.f48341z.f48381k;
                            try {
                                this.f48338w.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    obj = this.f48341z.f48379i;
                    synchronized (obj) {
                        if (this.f48339x.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.f48341z.f48285a.y().A(null, c3.f47711l0)) {
                b();
            }
        } finally {
            b();
        }
    }
}
