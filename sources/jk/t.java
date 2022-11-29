package jk;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class t implements u {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f38095a = new CountDownLatch(1);

    public /* synthetic */ t(s sVar) {
    }

    @Override // jk.b
    public final void a(Exception exc) {
        this.f38095a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f38095a.await();
    }

    @Override // jk.c
    public final void onSuccess(Object obj) {
        this.f38095a.countDown();
    }
}
