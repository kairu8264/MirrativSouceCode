package qm;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements xl.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f49591a = new f();

    @Override // xl.b
    public final Object get() {
        ScheduledExecutorService newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        return newSingleThreadScheduledExecutor;
    }
}
