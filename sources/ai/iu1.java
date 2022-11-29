package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzeap;

/* loaded from: classes3.dex */
public final class iu1 extends mu1 {
    public iu1(Context context) {
        this.B = new sd0(context, wg.t.r().a(), this, this);
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        synchronized (this.f7060x) {
            if (!this.f7062z) {
                this.f7062z = true;
                try {
                    this.B.h0().G3(this.A, new ju1(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f7059w.e(new zzeap(1));
                } catch (Throwable th2) {
                    wg.t.h().k(th2, "RemoteAdRequestClientTask.onConnected");
                    this.f7059w.e(new zzeap(1));
                }
            }
        }
    }

    @Override // ai.mu1, rh.c.b
    public final void z0(ConnectionResult connectionResult) {
        uj0.a("Cannot connect to remote service, fallback to local instance.");
        this.f7059w.e(new zzeap(1));
    }
}
