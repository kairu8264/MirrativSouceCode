package yk;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    public final e f62038a;

    /* renamed from: b  reason: collision with root package name */
    public final int f62039b;

    /* renamed from: c  reason: collision with root package name */
    public final TimeUnit f62040c;

    /* renamed from: e  reason: collision with root package name */
    public CountDownLatch f62042e;

    /* renamed from: d  reason: collision with root package name */
    public final Object f62041d = new Object();

    /* renamed from: f  reason: collision with root package name */
    public boolean f62043f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f62038a = eVar;
        this.f62039b = i10;
        this.f62040c = timeUnit;
    }

    @Override // yk.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f62041d) {
            xk.f f10 = xk.f.f();
            f10.i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f62042e = new CountDownLatch(1);
            this.f62043f = false;
            this.f62038a.a(str, bundle);
            xk.f.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f62042e.await(this.f62039b, this.f62040c)) {
                    this.f62043f = true;
                    xk.f.f().i("App exception callback received from Analytics listener.");
                } else {
                    xk.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                xk.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f62042e = null;
        }
    }

    @Override // yk.b
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f62042e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
