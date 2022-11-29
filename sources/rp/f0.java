package rp;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface f0 extends Closeable, Flushable {
    void O0(c cVar, long j10) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    i0 m();
}
