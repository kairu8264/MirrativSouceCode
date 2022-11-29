package a6;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends InputStream {

    /* renamed from: w  reason: collision with root package name */
    public final InputStream f490w;

    /* renamed from: x  reason: collision with root package name */
    public int f491x = 1073741824;

    public i(InputStream inputStream) {
        this.f490w = inputStream;
    }

    public final int a(int i10) {
        if (i10 == -1) {
            this.f491x = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f491x;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f490w.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.f490w.read());
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f490w.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return a(this.f490w.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return a(this.f490w.read(bArr, i10, i11));
    }
}
