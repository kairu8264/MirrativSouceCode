package rh;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class o1 extends h {

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<k1, l1> f51487f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final Context f51488g;

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f51489h;

    /* renamed from: i  reason: collision with root package name */
    public final n1 f51490i;

    /* renamed from: j  reason: collision with root package name */
    public final uh.a f51491j;

    /* renamed from: k  reason: collision with root package name */
    public final long f51492k;

    /* renamed from: l  reason: collision with root package name */
    public final long f51493l;

    public o1(Context context, Looper looper) {
        n1 n1Var = new n1(this, null);
        this.f51490i = n1Var;
        this.f51488g = context.getApplicationContext();
        this.f51489h = new fi.e(looper, n1Var);
        this.f51491j = uh.a.b();
        this.f51492k = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.f51493l = DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
    }

    @Override // rh.h
    public final void d(k1 k1Var, ServiceConnection serviceConnection, String str) {
        p.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f51487f) {
            l1 l1Var = this.f51487f.get(k1Var);
            if (l1Var != null) {
                if (l1Var.h(serviceConnection)) {
                    l1Var.f(serviceConnection, str);
                    if (l1Var.i()) {
                        this.f51489h.sendMessageDelayed(this.f51489h.obtainMessage(0, k1Var), this.f51492k);
                    }
                } else {
                    String obj = k1Var.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                String obj2 = k1Var.toString();
                StringBuilder sb3 = new StringBuilder(obj2.length() + 50);
                sb3.append("Nonexistent connection status for service config: ");
                sb3.append(obj2);
                throw new IllegalStateException(sb3.toString());
            }
        }
    }

    @Override // rh.h
    public final boolean f(k1 k1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        p.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f51487f) {
            l1 l1Var = this.f51487f.get(k1Var);
            if (l1Var == null) {
                l1Var = new l1(this, k1Var);
                l1Var.d(serviceConnection, serviceConnection, str);
                l1Var.e(str, executor);
                this.f51487f.put(k1Var, l1Var);
            } else {
                this.f51489h.removeMessages(0, k1Var);
                if (!l1Var.h(serviceConnection)) {
                    l1Var.d(serviceConnection, serviceConnection, str);
                    int a10 = l1Var.a();
                    if (a10 == 1) {
                        serviceConnection.onServiceConnected(l1Var.b(), l1Var.c());
                    } else if (a10 == 2) {
                        l1Var.e(str, executor);
                    }
                } else {
                    String obj = k1Var.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            j10 = l1Var.j();
        }
        return j10;
    }
}
