package ai;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class k74 implements Runnable {
    public /* synthetic */ k74(l74 l74Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            m74.a(MessageDigest.getInstance("MD5"));
            countDownLatch = m74.f6832e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = m74.f6832e;
        } catch (Throwable th2) {
            m74.f6832e.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
