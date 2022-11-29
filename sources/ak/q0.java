package ak;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class q0 extends InputStream {

    /* renamed from: w  reason: collision with root package name */
    public final InputStream f13590w;

    /* renamed from: x  reason: collision with root package name */
    public long f13591x;

    public q0(InputStream inputStream, long j10) {
        this.f13590w = inputStream;
        this.f13591x = j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f13590w.close();
        this.f13591x = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j10 = this.f13591x;
        if (j10 <= 0) {
            return -1;
        }
        this.f13591x = j10 - 1;
        return this.f13590w.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f13591x;
        if (j10 <= 0) {
            return -1;
        }
        int read = this.f13590w.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f13591x -= read;
        }
        return read;
    }
}
