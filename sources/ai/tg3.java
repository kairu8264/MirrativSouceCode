package ai;

import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class tg3 extends ng3 {
    @Override // ai.ng3
    public final void a(Throwable th2, Throwable th3) {
        th2.addSuppressed(th3);
    }

    @Override // ai.ng3
    public final void b(Throwable th2) {
        th2.printStackTrace();
    }

    @Override // ai.ng3
    public final void c(Throwable th2, PrintWriter printWriter) {
        th2.printStackTrace(printWriter);
    }
}
