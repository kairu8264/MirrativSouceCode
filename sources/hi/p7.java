package hi;

/* loaded from: classes3.dex */
public final class p7 extends s7 {
    public final int B;

    public p7(byte[] bArr, int i10, int i11) {
        super(bArr);
        u7.r(0, i11, bArr.length);
        this.B = i11;
    }

    @Override // hi.s7, hi.u7
    public final byte d(int i10) {
        int i11 = this.B;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(22);
                sb2.append("Index < 0: ");
                sb2.append(i10);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Index > length: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        return this.A[i10];
    }

    @Override // hi.s7, hi.u7
    public final byte f(int i10) {
        return this.A[i10];
    }

    @Override // hi.s7, hi.u7
    public final int g() {
        return this.B;
    }

    @Override // hi.s7
    public final int x() {
        return 0;
    }
}
