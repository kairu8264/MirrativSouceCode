package om;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class b extends OutputStream {

    /* renamed from: w  reason: collision with root package name */
    public final OutputStream f45469w;

    /* renamed from: x  reason: collision with root package name */
    public final sm.h f45470x;

    /* renamed from: y  reason: collision with root package name */
    public mm.d f45471y;

    /* renamed from: z  reason: collision with root package name */
    public long f45472z = -1;

    public b(OutputStream outputStream, mm.d dVar, sm.h hVar) {
        this.f45469w = outputStream;
        this.f45471y = dVar;
        this.f45470x = hVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10 = this.f45472z;
        if (j10 != -1) {
            this.f45471y.p(j10);
        }
        this.f45471y.t(this.f45470x.b());
        try {
            this.f45469w.close();
        } catch (IOException e10) {
            this.f45471y.u(this.f45470x.b());
            h.d(this.f45471y);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f45469w.flush();
        } catch (IOException e10) {
            this.f45471y.u(this.f45470x.b());
            h.d(this.f45471y);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            this.f45469w.write(i10);
            long j10 = this.f45472z + 1;
            this.f45472z = j10;
            this.f45471y.p(j10);
        } catch (IOException e10) {
            this.f45471y.u(this.f45470x.b());
            h.d(this.f45471y);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f45469w.write(bArr);
            long length = this.f45472z + bArr.length;
            this.f45472z = length;
            this.f45471y.p(length);
        } catch (IOException e10) {
            this.f45471y.u(this.f45470x.b());
            h.d(this.f45471y);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f45469w.write(bArr, i10, i11);
            long j10 = this.f45472z + i11;
            this.f45472z = j10;
            this.f45471y.p(j10);
        } catch (IOException e10) {
            this.f45471y.u(this.f45470x.b());
            h.d(this.f45471y);
            throw e10;
        }
    }
}
