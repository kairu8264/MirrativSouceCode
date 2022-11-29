package ak;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k4 f13512a = new k4();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
