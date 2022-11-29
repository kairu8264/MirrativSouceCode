package ai;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class wh0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f11624a = new AtomicInteger(1);

    public wh0(ai0 ai0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f11624a.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
