package tl;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class b extends OutputStream {

    /* renamed from: w  reason: collision with root package name */
    public long f53795w = 0;

    public long a() {
        return this.f53795w;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f53795w++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f53795w += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f53795w += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
