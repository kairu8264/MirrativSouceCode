package ai;

/* loaded from: classes3.dex */
public final class hh3 extends kh3 {
    public final int B;
    public final int C;

    public hh3(byte[] bArr, int i10, int i11) {
        super(bArr);
        oh3.k(i10, i10 + i11, bArr.length);
        this.B = i10;
        this.C = i11;
    }

    @Override // ai.kh3
    public final int W() {
        return this.B;
    }

    @Override // ai.kh3, ai.oh3
    public final byte l(int i10) {
        oh3.j(i10, this.C);
        return this.A[this.B + i10];
    }

    @Override // ai.kh3, ai.oh3
    public final byte m(int i10) {
        return this.A[this.B + i10];
    }

    @Override // ai.kh3, ai.oh3
    public final int p() {
        return this.C;
    }

    @Override // ai.kh3, ai.oh3
    public final void s(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.A, this.B + i10, bArr, i11, i12);
    }
}
