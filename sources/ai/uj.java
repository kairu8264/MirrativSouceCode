package ai;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class uj implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10720a = "Loader:ExtractorMediaPeriod";

    public uj(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f10720a);
    }
}
