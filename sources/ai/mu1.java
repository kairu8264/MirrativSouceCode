package ai;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzeap;
import java.io.InputStream;
import rh.c;

/* loaded from: classes3.dex */
public abstract class mu1 implements c.a, c.b {
    public ie0 A;
    public sd0 B;

    /* renamed from: w  reason: collision with root package name */
    public final mk0<InputStream> f7059w = new mk0<>();

    /* renamed from: x  reason: collision with root package name */
    public final Object f7060x = new Object();

    /* renamed from: y  reason: collision with root package name */
    public boolean f7061y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7062z = false;

    public final void a() {
        synchronized (this.f7060x) {
            this.f7062z = true;
            if (this.B.isConnected() || this.B.b()) {
                this.B.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // rh.c.a
    public final void s0(int i10) {
        uj0.a("Cannot connect to remote service, fallback to local instance.");
    }

    public void z0(ConnectionResult connectionResult) {
        uj0.a("Disconnected from remote ad request service.");
        this.f7059w.e(new zzeap(1));
    }
}
