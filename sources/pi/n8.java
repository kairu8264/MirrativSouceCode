package pi;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class n8 implements Runnable {
    public final /* synthetic */ w8 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48074w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48075x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f48076y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ na f48077z;

    public n8(w8 w8Var, AtomicReference atomicReference, String str, String str2, String str3, na naVar) {
        this.A = w8Var;
        this.f48074w = atomicReference;
        this.f48075x = str2;
        this.f48076y = str3;
        this.f48077z = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        g3 g3Var;
        synchronized (this.f48074w) {
            try {
                g3Var = this.A.f48322d;
            } catch (RemoteException e10) {
                this.A.f48285a.r().p().d("(legacy) Failed to get conditional properties; remote exception", null, this.f48075x, e10);
                this.f48074w.set(Collections.emptyList());
                atomicReference = this.f48074w;
            }
            if (g3Var == null) {
                this.A.f48285a.r().p().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f48075x, this.f48076y);
                this.f48074w.set(Collections.emptyList());
                this.f48074w.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                rh.p.i(this.f48077z);
                this.f48074w.set(g3Var.x3(this.f48075x, this.f48076y, this.f48077z));
            } else {
                this.f48074w.set(g3Var.W3(null, this.f48075x, this.f48076y));
            }
            this.A.D();
            atomicReference = this.f48074w;
            atomicReference.notify();
        }
    }
}
