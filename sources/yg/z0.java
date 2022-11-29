package yg;

import ai.ow2;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f62006a = null;

    /* renamed from: b  reason: collision with root package name */
    public Handler f62007b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f62008c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f62009d = new Object();

    public final Looper a() {
        Looper looper;
        synchronized (this.f62009d) {
            if (this.f62008c != 0) {
                rh.p.j(this.f62006a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f62006a == null) {
                p1.k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f62006a = handlerThread;
                handlerThread.start();
                this.f62007b = new ow2(this.f62006a.getLooper());
                p1.k("Looper thread started.");
            } else {
                p1.k("Resuming the looper thread");
                this.f62009d.notifyAll();
            }
            this.f62008c++;
            looper = this.f62006a.getLooper();
        }
        return looper;
    }

    public final Handler b() {
        return this.f62007b;
    }
}
