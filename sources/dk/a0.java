package dk;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class a0 extends z {

    /* renamed from: w  reason: collision with root package name */
    public final z f29680w;

    /* renamed from: x  reason: collision with root package name */
    public final long f29681x;

    /* renamed from: y  reason: collision with root package name */
    public final long f29682y;

    public a0(z zVar, long j10, long j11) {
        this.f29680w = zVar;
        long e10 = e(j10);
        this.f29681x = e10;
        this.f29682y = e(e10 + j11);
    }

    @Override // dk.z
    public final long a() {
        return this.f29682y - this.f29681x;
    }

    @Override // dk.z
    public final InputStream c(long j10, long j11) throws IOException {
        long e10 = e(this.f29681x);
        return this.f29680w.c(e10, e(j11 + e10) - e10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final long e(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        return j10 > this.f29680w.a() ? this.f29680w.a() : j10;
    }
}
