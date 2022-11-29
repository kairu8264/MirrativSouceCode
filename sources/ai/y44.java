package ai;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class y44 extends ByteArrayOutputStream {

    /* renamed from: w  reason: collision with root package name */
    public final k44 f12447w;

    public y44(k44 k44Var, int i10) {
        this.f12447w = k44Var;
        ((ByteArrayOutputStream) this).buf = k44Var.a(Math.max(i10, 256));
    }

    public final void a(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i12 = i11 + i10;
        byte[] a10 = this.f12447w.a(i12 + i12);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a10, 0, ((ByteArrayOutputStream) this).count);
        this.f12447w.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a10;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12447w.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f12447w.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i10) {
        a(1);
        super.write(i10);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        a(i11);
        super.write(bArr, i10, i11);
    }
}
