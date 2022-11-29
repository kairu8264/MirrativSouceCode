package ai;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class n44 extends FilterInputStream {

    /* renamed from: w  reason: collision with root package name */
    public final long f7192w;

    /* renamed from: x  reason: collision with root package name */
    public long f7193x;

    public n44(InputStream inputStream, long j10) {
        super(inputStream);
        this.f7192w = j10;
    }

    public final long a() {
        return this.f7192w - this.f7193x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f7193x++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.f7193x += read;
        }
        return read;
    }
}
