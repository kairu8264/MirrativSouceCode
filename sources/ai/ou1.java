package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzeap;

/* loaded from: classes3.dex */
public final class ou1 extends mu1 {
    public ou1(Context context) {
        this.B = new sd0(context, wg.t.r().a(), this, this);
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        synchronized (this.f7060x) {
            if (!this.f7062z) {
                this.f7062z = true;
                try {
                    this.B.h0().E4(this.A, new ju1(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f7059w.e(new zzeap(1));
                } catch (Throwable th2) {
                    wg.t.h().k(th2, "RemoteSignalsClientTask.onConnected");
                    this.f7059w.e(new zzeap(1));
                }
            }
        }
    }
}
