package h7;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class b implements Closeable {
    public int A;

    /* renamed from: w  reason: collision with root package name */
    public final InputStream f34582w;

    /* renamed from: x  reason: collision with root package name */
    public final Charset f34583x;

    /* renamed from: y  reason: collision with root package name */
    public byte[] f34584y;

    /* renamed from: z  reason: collision with root package name */
    public int f34585z;

    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f34583x.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public final void c() throws IOException {
        InputStream inputStream = this.f34582w;
        byte[] bArr = this.f34584y;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f34585z = 0;
            this.A = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f34582w) {
            if (this.f34584y != null) {
                this.f34584y = null;
                this.f34582w.close();
            }
        }
    }

    public boolean d() {
        return this.A == -1;
    }

    public String e() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f34582w) {
            if (this.f34584y != null) {
                if (this.f34585z >= this.A) {
                    c();
                }
                for (int i12 = this.f34585z; i12 != this.A; i12++) {
                    byte[] bArr2 = this.f34584y;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f34585z;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f34583x.name());
                                this.f34585z = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f34583x.name());
                        this.f34585z = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.A - this.f34585z) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f34584y;
                    int i14 = this.f34585z;
                    aVar.write(bArr3, i14, this.A - i14);
                    this.A = -1;
                    c();
                    i10 = this.f34585z;
                    while (i10 != this.A) {
                        bArr = this.f34584y;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f34585z;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f34585z = i10 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 >= 0) {
            if (charset.equals(c.f34587a)) {
                this.f34582w = inputStream;
                this.f34583x = charset;
                this.f34584y = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
