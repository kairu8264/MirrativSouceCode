package vi;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f57374a = new CountDownLatch(1);

    public /* synthetic */ m(l lVar) {
    }

    @Override // vi.d
    public final void a(Exception exc) {
        this.f57374a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f57374a.await();
    }

    @Override // vi.b
    public final void c() {
        this.f57374a.countDown();
    }

    public final boolean d(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f57374a.await(j10, timeUnit);
    }

    @Override // vi.e
    public final void onSuccess(Object obj) {
        this.f57374a.countDown();
    }
}
