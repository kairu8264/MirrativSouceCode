package ai;

import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class j34 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ w34 f5612w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ k34 f5613x;

    public j34(k34 k34Var, w34 w34Var) {
        this.f5613x = k34Var;
        this.f5612w = w34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f5613x.f6073x;
            blockingQueue.put(this.f5612w);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
