package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class x43 extends w23<Void> implements Runnable {
    public final Runnable D;

    public x43(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.D = runnable;
    }

    @Override // ai.a33
    public final String h() {
        String valueOf = String.valueOf(this.D);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
        sb2.append("task=[");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.D.run();
        } catch (Throwable th2) {
            v(th2);
            zx2.a(th2);
            throw new RuntimeException(th2);
        }
    }
}
