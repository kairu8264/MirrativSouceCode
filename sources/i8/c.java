package i8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: w  reason: collision with root package name */
    public final long f36414w;

    /* renamed from: x  reason: collision with root package name */
    public int f36415x;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f36414w = j10;
    }

    public static InputStream c(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    public final int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f36415x += i10;
        } else if (this.f36414w - this.f36415x > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f36414w + ", but read: " + this.f36415x);
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f36414w - this.f36415x, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        return a(super.read(bArr, i10, i11));
    }
}
