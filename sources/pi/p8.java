package pi;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p8 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ w8 B;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48133w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48134x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f48135y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ na f48136z;

    public p8(w8 w8Var, AtomicReference atomicReference, String str, String str2, String str3, na naVar, boolean z10) {
        this.B = w8Var;
        this.f48133w = atomicReference;
        this.f48134x = str2;
        this.f48135y = str3;
        this.f48136z = naVar;
        this.A = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        g3 g3Var;
        synchronized (this.f48133w) {
            try {
                g3Var = this.B.f48322d;
            } catch (RemoteException e10) {
                this.B.f48285a.r().p().d("(legacy) Failed to get user properties; remote exception", null, this.f48134x, e10);
                this.f48133w.set(Collections.emptyList());
                atomicReference = this.f48133w;
            }
            if (g3Var == null) {
                this.B.f48285a.r().p().d("(legacy) Failed to get user properties; not connected to service", null, this.f48134x, this.f48135y);
                this.f48133w.set(Collections.emptyList());
                this.f48133w.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                rh.p.i(this.f48136z);
                this.f48133w.set(g3Var.Z0(this.f48134x, this.f48135y, this.A, this.f48136z));
            } else {
                this.f48133w.set(g3Var.H3(null, this.f48134x, this.f48135y, this.A));
            }
            this.B.D();
            atomicReference = this.f48133w;
            atomicReference.notify();
        }
    }
}
