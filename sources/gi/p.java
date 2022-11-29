package gi;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class p extends OutputStream {

    /* renamed from: w  reason: collision with root package name */
    public long f33613w = 0;

    public final long a() {
        return this.f33613w;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f33613w++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f33613w += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f33613w += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
