package ai;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class n0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadFactory f7125a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f7126b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7125a.newThread(runnable);
        int andIncrement = this.f7126b.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append("gads-");
        sb2.append(andIncrement);
        newThread.setName(sb2.toString());
        return newThread;
    }
}
