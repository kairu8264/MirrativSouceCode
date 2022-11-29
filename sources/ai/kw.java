package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class kw implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ lw f6379w;

    public kw(lw lwVar) {
        this.f6379w = lwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nt ntVar;
        nt ntVar2;
        ntVar = this.f6379w.f6703w;
        if (ntVar != null) {
            try {
                ntVar2 = this.f6379w.f6703w;
                ntVar2.F(1);
            } catch (RemoteException e10) {
                uj0.g("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
