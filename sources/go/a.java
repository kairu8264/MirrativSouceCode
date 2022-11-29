package go;

import java.io.Closeable;

/* loaded from: classes4.dex */
public final class a {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                wn.a.a(th2, th3);
            }
        }
    }
}
