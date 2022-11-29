package gi;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class k extends FilterInputStream {

    /* renamed from: w  reason: collision with root package name */
    public long f33605w;

    /* renamed from: x  reason: collision with root package name */
    public long f33606x;

    public k(InputStream inputStream, long j10) {
        super(inputStream);
        this.f33606x = -1L;
        Objects.requireNonNull(inputStream);
        this.f33605w = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f33605w);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f33606x = this.f33605w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f33605w == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f33605w--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f33606x != -1) {
                ((FilterInputStream) this).in.reset();
                this.f33605w = this.f33606x;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f33605w));
        this.f33605w -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f33605w;
        if (j10 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f33605w -= read;
        }
        return read;
    }
}
