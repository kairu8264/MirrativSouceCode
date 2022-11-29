package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import rh.c;

/* loaded from: classes3.dex */
public final class cu2 implements c.a, c.b {
    public final HandlerThread A;

    /* renamed from: w  reason: collision with root package name */
    public final cv2 f3038w;

    /* renamed from: x  reason: collision with root package name */
    public final String f3039x;

    /* renamed from: y  reason: collision with root package name */
    public final String f3040y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedBlockingQueue<s64> f3041z;

    public cu2(Context context, String str, String str2) {
        this.f3039x = str;
        this.f3040y = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.A = handlerThread;
        handlerThread.start();
        cv2 cv2Var = new cv2(context, handlerThread.getLooper(), this, this, 9200000);
        this.f3038w = cv2Var;
        this.f3041z = new LinkedBlockingQueue<>();
        cv2Var.o();
    }

    public static s64 c() {
        c64 y02 = s64.y0();
        y02.i0(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return y02.n();
    }

    public final s64 a(int i10) {
        s64 s64Var;
        try {
            s64Var = this.f3041z.poll(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            s64Var = null;
        }
        return s64Var == null ? c() : s64Var;
    }

    public final void b() {
        cv2 cv2Var = this.f3038w;
        if (cv2Var != null) {
            if (cv2Var.isConnected() || this.f3038w.b()) {
                this.f3038w.disconnect();
            }
        }
    }

    public final hv2 d() {
        try {
            return this.f3038w.h0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        hv2 d10 = d();
        if (d10 != null) {
            try {
                try {
                    this.f3041z.put(d10.M1(new dv2(this.f3039x, this.f3040y)).p());
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    b();
                    this.A.quit();
                    throw th2;
                }
            } catch (Throwable unused2) {
                this.f3041z.put(c());
            }
            b();
            this.A.quit();
        }
    }

    @Override // rh.c.a
    public final void s0(int i10) {
        try {
            this.f3041z.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // rh.c.b
    public final void z0(ConnectionResult connectionResult) {
        try {
            this.f3041z.put(c());
        } catch (InterruptedException unused) {
        }
    }
}
