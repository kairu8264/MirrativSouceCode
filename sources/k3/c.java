package k3;

import android.os.Build;
import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f38372a;

    /* renamed from: b  reason: collision with root package name */
    public a f38373b;

    /* renamed from: c  reason: collision with root package name */
    public Object f38374c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f38375d;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public void a() {
        synchronized (this) {
            if (this.f38372a) {
                return;
            }
            this.f38372a = true;
            this.f38375d = true;
            a aVar = this.f38373b;
            Object obj = this.f38374c;
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f38375d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f38375d = false;
                notifyAll();
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            c();
            if (this.f38373b == aVar) {
                return;
            }
            this.f38373b = aVar;
            if (this.f38372a && aVar != null) {
                aVar.a();
            }
        }
    }

    public final void c() {
        while (this.f38375d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
