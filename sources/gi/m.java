package gi;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f33608a = Logger.getLogger(m.class.getName());

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e10) {
            try {
                f33608a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e10);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
