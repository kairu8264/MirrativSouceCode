package r6;

import p6.k;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public Runnable f49773w;

    public c(Runnable runnable) {
        this.f49773w = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f49773w.run();
        } catch (Throwable th2) {
            k.h().c("Runnable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
        }
    }
}
