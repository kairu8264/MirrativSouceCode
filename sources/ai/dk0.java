package ai;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class dk0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f3322a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f3323b;

    public dk0(String str) {
        this.f3323b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f3323b;
        int andIncrement = this.f3322a.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(str.length() + 23);
        sb2.append("AdWorker(");
        sb2.append(str);
        sb2.append(") #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
