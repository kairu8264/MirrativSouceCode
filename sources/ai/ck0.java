package ai;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class ck0 extends ScheduledThreadPoolExecutor {
    public ck0(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
