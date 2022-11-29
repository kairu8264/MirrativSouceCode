package ak;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class x2 extends InputStream {

    /* renamed from: w  reason: collision with root package name */
    public final Enumeration<File> f13712w;

    /* renamed from: x  reason: collision with root package name */
    public InputStream f13713x;

    public x2(Enumeration<File> enumeration) throws IOException {
        this.f13712w = enumeration;
        a();
    }

    public final void a() throws IOException {
        InputStream inputStream = this.f13713x;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f13713x = this.f13712w.hasMoreElements() ? new FileInputStream(this.f13712w.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f13713x;
        if (inputStream != null) {
            inputStream.close();
            this.f13713x = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f13713x;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f13713x == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 != 0) {
            do {
                int read = this.f13713x.read(bArr, i10, i11);
                if (read > 0) {
                    return read;
                }
                a();
            } while (this.f13713x != null);
            return -1;
        }
        return 0;
    }
}
