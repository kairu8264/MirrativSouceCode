package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class gw implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ iw f4603w;

    public gw(iw iwVar) {
        this.f4603w = iwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (jw.R5(this.f4603w.f5430w) != null) {
            try {
                jw.R5(this.f4603w.f5430w).F(1);
            } catch (RemoteException e10) {
                uj0.g("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
