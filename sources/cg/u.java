package cg;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class u implements Closeable {

    /* loaded from: classes3.dex */
    public interface a {
        u a();

        a b(Context context);
    }

    public abstract lg.d a();

    public abstract t c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
