package rp;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface h0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long f1(c cVar, long j10) throws IOException;

    i0 m();
}
