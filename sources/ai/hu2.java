package ai;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import rh.c;

/* loaded from: classes3.dex */
public final class hu2 implements c.a, c.b {

    /* renamed from: w  reason: collision with root package name */
    public final cv2 f5001w;

    /* renamed from: x  reason: collision with root package name */
    public final xu2 f5002x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f5003y = new Object();

    /* renamed from: z  reason: collision with root package name */
    public boolean f5004z = false;
    public boolean A = false;

    public hu2(Context context, Looper looper, xu2 xu2Var) {
        this.f5002x = xu2Var;
        this.f5001w = new cv2(context, looper, this, this, 12800000);
    }

    public final void a() {
        synchronized (this.f5003y) {
            if (!this.f5004z) {
                this.f5004z = true;
                this.f5001w.o();
            }
        }
    }

    public final void b() {
        synchronized (this.f5003y) {
            if (this.f5001w.isConnected() || this.f5001w.b()) {
                this.f5001w.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        synchronized (this.f5003y) {
            if (this.A) {
                return;
            }
            this.A = true;
            try {
                this.f5001w.h0().f4(new av2(this.f5002x.L()));
            } catch (Exception unused) {
            } catch (Throwable th2) {
                b();
                throw th2;
            }
            b();
        }
    }

    @Override // rh.c.a
    public final void s0(int i10) {
    }

    @Override // rh.c.b
    public final void z0(ConnectionResult connectionResult) {
    }
}
