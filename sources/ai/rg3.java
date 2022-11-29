package ai;

import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes3.dex */
public final class rg3 extends ng3 {

    /* renamed from: a  reason: collision with root package name */
    public final pg3 f9434a = new pg3();

    @Override // ai.ng3
    public final void a(Throwable th2, Throwable th3) {
        if (th3 != th2) {
            this.f9434a.a(th2, true).add(th3);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th3);
    }

    @Override // ai.ng3
    public final void b(Throwable th2) {
        th2.printStackTrace();
        List<Throwable> a10 = this.f9434a.a(th2, false);
        if (a10 == null) {
            return;
        }
        synchronized (a10) {
            for (Throwable th3 : a10) {
                System.err.print("Suppressed: ");
                th3.printStackTrace();
            }
        }
    }

    @Override // ai.ng3
    public final void c(Throwable th2, PrintWriter printWriter) {
        th2.printStackTrace(printWriter);
        List<Throwable> a10 = this.f9434a.a(th2, false);
        if (a10 == null) {
            return;
        }
        synchronized (a10) {
            for (Throwable th3 : a10) {
                printWriter.print("Suppressed: ");
                th3.printStackTrace(printWriter);
            }
        }
    }
}
