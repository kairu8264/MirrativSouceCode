package ai;

import android.os.ConditionVariable;

/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p f7591w;

    public o(p pVar) {
        this.f7591w = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z10;
        r0 r0Var;
        ConditionVariable conditionVariable2;
        if (this.f7591w.f8196b != null) {
            return;
        }
        conditionVariable = p.f8192c;
        synchronized (conditionVariable) {
            if (this.f7591w.f8196b != null) {
                return;
            }
            boolean z11 = false;
            try {
                z10 = ox.F1.e().booleanValue();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
            if (z10) {
                try {
                    r0Var = this.f7591w.f8195a;
                    p.f8193d = new xv2(r0Var.f9266a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z11 = z10;
            this.f7591w.f8196b = Boolean.valueOf(z11);
            conditionVariable2 = p.f8192c;
            conditionVariable2.open();
        }
    }
}
