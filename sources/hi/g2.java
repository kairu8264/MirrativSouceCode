package hi;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class g2 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadFactory f35781a = Executors.defaultThreadFactory();

    public g2(x2 x2Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f35781a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
