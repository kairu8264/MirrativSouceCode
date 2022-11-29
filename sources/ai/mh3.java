package ai;

import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class mh3 extends OutputStream {
    public static final byte[] B = new byte[0];
    public int A;

    /* renamed from: y  reason: collision with root package name */
    public int f6948y;

    /* renamed from: w  reason: collision with root package name */
    public final int f6946w = 128;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<oh3> f6947x = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public byte[] f6949z = new byte[128];

    public mh3(int i10) {
    }

    public final synchronized oh3 a() {
        int i10 = this.A;
        byte[] bArr = this.f6949z;
        int length = bArr.length;
        if (i10 >= length) {
            this.f6947x.add(new kh3(bArr));
            this.f6949z = B;
        } else if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i10));
            this.f6947x.add(new kh3(bArr2));
        }
        this.f6948y += this.A;
        this.A = 0;
        return oh3.S(this.f6947x);
    }

    public final synchronized int c() {
        return this.f6948y + this.A;
    }

    public final void d(int i10) {
        this.f6947x.add(new kh3(this.f6949z));
        int length = this.f6948y + this.f6949z.length;
        this.f6948y = length;
        this.f6949z = new byte[Math.max(this.f6946w, Math.max(i10, length >>> 1))];
        this.A = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        if (this.A == this.f6949z.length) {
            d(1);
        }
        byte[] bArr = this.f6949z;
        int i11 = this.A;
        this.A = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f6949z;
        int length = bArr2.length;
        int i12 = this.A;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.A += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        d(i14);
        System.arraycopy(bArr, i10 + i13, this.f6949z, 0, i14);
        this.A = i14;
    }
}
