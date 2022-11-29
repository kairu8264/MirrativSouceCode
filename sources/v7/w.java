package v7;

import com.google.android.exoplayer2.C;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class w extends FilterInputStream {
    public int A;
    public final p7.b B;

    /* renamed from: w  reason: collision with root package name */
    public volatile byte[] f56906w;

    /* renamed from: x  reason: collision with root package name */
    public int f56907x;

    /* renamed from: y  reason: collision with root package name */
    public int f56908y;

    /* renamed from: z  reason: collision with root package name */
    public int f56909z;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, p7.b bVar) {
        this(inputStream, bVar, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public static IOException e() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f56909z;
        if (i10 != -1) {
            int i11 = this.A - i10;
            int i12 = this.f56908y;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f56907x == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.B.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f56906w = bArr2;
                    this.B.e(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.A - this.f56909z;
                this.A = i13;
                this.f56909z = 0;
                this.f56907x = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.A;
                if (read > 0) {
                    i14 += read;
                }
                this.f56907x = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f56909z = -1;
            this.A = 0;
            this.f56907x = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f56906w != null && inputStream != null) {
        } else {
            throw e();
        }
        return (this.f56907x - this.A) + inputStream.available();
    }

    public synchronized void c() {
        this.f56908y = this.f56906w.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f56906w != null) {
            this.B.e(this.f56906w);
            this.f56906w = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void d() {
        if (this.f56906w != null) {
            this.B.e(this.f56906w);
            this.f56906w = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f56908y = Math.max(this.f56908y, i10);
        this.f56909z = this.A;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f56906w;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.A < this.f56907x || a(inputStream, bArr) != -1) {
                if (bArr != this.f56906w && (bArr = this.f56906w) == null) {
                    throw e();
                }
                int i10 = this.f56907x;
                int i11 = this.A;
                if (i10 - i11 > 0) {
                    this.A = i11 + 1;
                    return bArr[i11] & TagConstant.TAG_CAT_RESERVED;
                }
                return -1;
            }
            return -1;
        }
        throw e();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f56906w != null) {
            int i10 = this.f56909z;
            if (-1 != i10) {
                this.A = i10;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.A + " markLimit: " + this.f56908y);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f56906w;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.f56907x;
                int i11 = this.A;
                if (i10 - i11 >= j10) {
                    this.A = (int) (i11 + j10);
                    return j10;
                }
                long j11 = i10 - i11;
                this.A = i10;
                if (this.f56909z != -1 && j10 <= this.f56908y) {
                    if (a(inputStream, bArr) == -1) {
                        return j11;
                    }
                    int i12 = this.f56907x;
                    int i13 = this.A;
                    if (i12 - i13 >= j10 - j11) {
                        this.A = (int) ((i13 + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + i12) - i13;
                    this.A = i12;
                    return j12;
                }
                long skip = inputStream.skip(j10 - j11);
                if (skip > 0) {
                    this.f56909z = -1;
                }
                return j11 + skip;
            }
            throw e();
        }
        throw e();
    }

    public w(InputStream inputStream, p7.b bVar, int i10) {
        super(inputStream);
        this.f56909z = -1;
        this.B = bVar;
        this.f56906w = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f56906w;
        if (bArr2 == null) {
            throw e();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.A;
            int i15 = this.f56907x;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.A += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f56909z == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                } else {
                    if (bArr2 != this.f56906w && (bArr2 = this.f56906w) == null) {
                        throw e();
                    }
                    int i17 = this.f56907x;
                    int i18 = this.A;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.A += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw e();
        }
    }
}
