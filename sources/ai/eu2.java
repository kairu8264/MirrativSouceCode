package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import rh.c;

/* loaded from: classes3.dex */
public final class eu2 implements c.a, c.b {
    public final HandlerThread A;
    public final vt2 B;
    public final long C;
    public final int D;

    /* renamed from: w  reason: collision with root package name */
    public final cv2 f3784w;

    /* renamed from: x  reason: collision with root package name */
    public final String f3785x;

    /* renamed from: y  reason: collision with root package name */
    public final String f3786y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedBlockingQueue<pv2> f3787z;

    public eu2(Context context, int i10, int i11, String str, String str2, String str3, vt2 vt2Var) {
        this.f3785x = str;
        this.D = i11;
        this.f3786y = str2;
        this.B = vt2Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.A = handlerThread;
        handlerThread.start();
        this.C = System.currentTimeMillis();
        cv2 cv2Var = new cv2(context, handlerThread.getLooper(), this, this, 19621000);
        this.f3784w = cv2Var;
        this.f3787z = new LinkedBlockingQueue<>();
        cv2Var.o();
    }

    public static pv2 c() {
        return new pv2(null, 1);
    }

    public final pv2 a(int i10) {
        pv2 pv2Var;
        try {
            pv2Var = this.f3787z.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e(2009, this.C, e10);
            pv2Var = null;
        }
        e(3004, this.C, null);
        if (pv2Var != null) {
            if (pv2Var.f8701y == 7) {
                vt2.g(3);
            } else {
                vt2.g(2);
            }
        }
        return pv2Var == null ? c() : pv2Var;
    }

    public final void b() {
        cv2 cv2Var = this.f3784w;
        if (cv2Var != null) {
            if (cv2Var.isConnected() || this.f3784w.b()) {
                this.f3784w.disconnect();
            }
        }
    }

    public final hv2 d() {
        try {
            return this.f3784w.h0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void e(int i10, long j10, Exception exc) {
        this.B.c(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        hv2 d10 = d();
        if (d10 != null) {
            try {
                pv2 B4 = d10.B4(new mv2(1, this.D, this.f3785x, this.f3786y));
                e(5011, this.C, null);
                this.f3787z.put(B4);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // rh.c.a
    public final void s0(int i10) {
        try {
            e(4011, this.C, null);
            this.f3787z.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // rh.c.b
    public final void z0(ConnectionResult connectionResult) {
        try {
            e(4012, this.C, null);
            this.f3787z.put(c());
        } catch (InterruptedException unused) {
        }
    }
}
