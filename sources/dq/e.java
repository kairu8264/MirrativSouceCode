package dq;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* loaded from: classes4.dex */
public class e extends Handler implements k {

    /* renamed from: w  reason: collision with root package name */
    public final j f29824w;

    /* renamed from: x  reason: collision with root package name */
    public final int f29825x;

    /* renamed from: y  reason: collision with root package name */
    public final c f29826y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f29827z;

    public e(c cVar, Looper looper, int i10) {
        super(looper);
        this.f29826y = cVar;
        this.f29825x = i10;
        this.f29824w = new j();
    }

    @Override // dq.k
    public void a(p pVar, Object obj) {
        i a10 = i.a(pVar, obj);
        synchronized (this) {
            this.f29824w.a(a10);
            if (!this.f29827z) {
                this.f29827z = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i b10 = this.f29824w.b();
                if (b10 == null) {
                    synchronized (this) {
                        b10 = this.f29824w.b();
                        if (b10 == null) {
                            this.f29827z = false;
                            return;
                        }
                    }
                }
                this.f29826y.g(b10);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f29825x);
            if (sendMessage(obtainMessage())) {
                this.f29827z = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } finally {
            this.f29827z = false;
        }
    }
}
