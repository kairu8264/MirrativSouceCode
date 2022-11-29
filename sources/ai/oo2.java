package ai;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class oo2 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f7870a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f7870a.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("AdWorker(NG) #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
