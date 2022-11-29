package ug;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a extends Thread {

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<AdvertisingIdClient> f55917w;

    /* renamed from: x  reason: collision with root package name */
    public final long f55918x;

    /* renamed from: y  reason: collision with root package name */
    public final CountDownLatch f55919y = new CountDownLatch(1);

    /* renamed from: z  reason: collision with root package name */
    public boolean f55920z = false;

    public a(AdvertisingIdClient advertisingIdClient, long j10) {
        this.f55917w = new WeakReference<>(advertisingIdClient);
        this.f55918x = j10;
        start();
    }

    public final void a() {
        AdvertisingIdClient advertisingIdClient = this.f55917w.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.e();
            this.f55920z = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f55919y.await(this.f55918x, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
