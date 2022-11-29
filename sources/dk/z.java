package dk;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class z implements Closeable {
    public abstract long a();

    public abstract InputStream c(long j10, long j11) throws IOException;

    public final synchronized InputStream d() throws IOException {
        return c(0L, a());
    }
}
