package om;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class a extends InputStream {
    public long A;

    /* renamed from: w  reason: collision with root package name */
    public final InputStream f45465w;

    /* renamed from: x  reason: collision with root package name */
    public final mm.d f45466x;

    /* renamed from: y  reason: collision with root package name */
    public final sm.h f45467y;

    /* renamed from: z  reason: collision with root package name */
    public long f45468z = -1;
    public long B = -1;

    public a(InputStream inputStream, mm.d dVar, sm.h hVar) {
        this.f45467y = hVar;
        this.f45465w = inputStream;
        this.f45466x = dVar;
        this.A = dVar.e();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f45465w.available();
        } catch (IOException e10) {
            this.f45466x.u(this.f45467y.b());
            h.d(this.f45466x);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long b10 = this.f45467y.b();
        if (this.B == -1) {
            this.B = b10;
        }
        try {
            this.f45465w.close();
            long j10 = this.f45468z;
            if (j10 != -1) {
                this.f45466x.s(j10);
            }
            long j11 = this.A;
            if (j11 != -1) {
                this.f45466x.v(j11);
            }
            this.f45466x.u(this.B);
            this.f45466x.b();
        } catch (IOException e10) {
            this.f45466x.u(this.f45467y.b());
            h.d(this.f45466x);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f45465w.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f45465w.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f45465w.read();
            long b10 = this.f45467y.b();
            if (this.A == -1) {
                this.A = b10;
            }
            if (read == -1 && this.B == -1) {
                this.B = b10;
                this.f45466x.u(b10);
                this.f45466x.b();
            } else {
                long j10 = this.f45468z + 1;
                this.f45468z = j10;
                this.f45466x.s(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f45466x.u(this.f45467y.b());
            h.d(this.f45466x);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f45465w.reset();
        } catch (IOException e10) {
            this.f45466x.u(this.f45467y.b());
            h.d(this.f45466x);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            long skip = this.f45465w.skip(j10);
            long b10 = this.f45467y.b();
            if (this.A == -1) {
                this.A = b10;
            }
            if (skip == -1 && this.B == -1) {
                this.B = b10;
                this.f45466x.u(b10);
            } else {
                long j11 = this.f45468z + skip;
                this.f45468z = j11;
                this.f45466x.s(j11);
            }
            return skip;
        } catch (IOException e10) {
            this.f45466x.u(this.f45467y.b());
            h.d(this.f45466x);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int read = this.f45465w.read(bArr, i10, i11);
            long b10 = this.f45467y.b();
            if (this.A == -1) {
                this.A = b10;
            }
            if (read == -1 && this.B == -1) {
                this.B = b10;
                this.f45466x.u(b10);
                this.f45466x.b();
            } else {
                long j10 = this.f45468z + read;
                this.f45468z = j10;
                this.f45466x.s(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f45466x.u(this.f45467y.b());
            h.d(this.f45466x);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f45465w.read(bArr);
            long b10 = this.f45467y.b();
            if (this.A == -1) {
                this.A = b10;
            }
            if (read == -1 && this.B == -1) {
                this.B = b10;
                this.f45466x.u(b10);
                this.f45466x.b();
            } else {
                long j10 = this.f45468z + read;
                this.f45468z = j10;
                this.f45466x.s(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f45466x.u(this.f45467y.b());
            h.d(this.f45466x);
            throw e10;
        }
    }
}
