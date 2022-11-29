package wh;

import android.os.Process;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f58759w;

    public b(Runnable runnable, int i10) {
        this.f58759w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f58759w.run();
    }
}
