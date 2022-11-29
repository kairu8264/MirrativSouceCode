package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class nj {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f7359a;

    /* renamed from: b  reason: collision with root package name */
    public int f7360b;

    /* renamed from: c  reason: collision with root package name */
    public int f7361c;

    public nj() {
    }

    public nj(int i10) {
        this.f7359a = new byte[i10];
        this.f7361c = i10;
    }

    public final void a(int i10) {
        b(h() < i10 ? new byte[i10] : this.f7359a, i10);
    }

    public final void b(byte[] bArr, int i10) {
        this.f7359a = bArr;
        this.f7361c = i10;
        this.f7360b = 0;
    }

    public final void c() {
        this.f7360b = 0;
        this.f7361c = 0;
    }

    public final int d() {
        return this.f7361c - this.f7360b;
    }

    public final int e() {
        return this.f7361c;
    }

    public final void f(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f7359a.length) {
            z10 = true;
        }
        fj.a(z10);
        this.f7361c = i10;
    }

    public final int g() {
        return this.f7360b;
    }

    public final int h() {
        byte[] bArr = this.f7359a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void i(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f7361c) {
            z10 = true;
        }
        fj.a(z10);
        this.f7360b = i10;
    }

    public final void j(int i10) {
        i(this.f7360b + i10);
    }

    public final void k(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f7359a, this.f7360b, bArr, i10, i11);
        this.f7360b += i11;
    }

    public final int l() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        this.f7360b = i10 + 1;
        return bArr[i10] & TagConstant.TAG_CAT_RESERVED;
    }

    public final int m() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        int i11 = i10 + 1;
        this.f7360b = i11;
        byte b10 = bArr[i10];
        this.f7360b = i11 + 1;
        return (bArr[i11] & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public final int n() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        int i11 = i10 + 1;
        this.f7360b = i11;
        byte b10 = bArr[i10];
        this.f7360b = i11 + 1;
        return ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8) | (b10 & TagConstant.TAG_CAT_RESERVED);
    }

    public final short o() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        int i11 = i10 + 1;
        this.f7360b = i11;
        byte b10 = bArr[i10];
        this.f7360b = i11 + 1;
        return (short) ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 8));
    }

    public final long p() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        int i11 = i10 + 1;
        this.f7360b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7360b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7360b = i13;
        byte b12 = bArr[i12];
        this.f7360b = i13 + 1;
        return ((b11 & 255) << 16) | ((b10 & 255) << 24) | ((b12 & 255) << 8) | (bArr[i13] & 255);
    }

    public final long q() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        int i11 = i10 + 1;
        this.f7360b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7360b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7360b = i13;
        byte b12 = bArr[i12];
        this.f7360b = i13 + 1;
        return ((b11 & 255) << 8) | (b10 & 255) | ((b12 & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public final int r() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        int i11 = i10 + 1;
        this.f7360b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7360b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7360b = i13;
        byte b12 = bArr[i12];
        this.f7360b = i13 + 1;
        return (bArr[i13] & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 24) | ((b11 & TagConstant.TAG_CAT_RESERVED) << 16) | ((b12 & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public final long s() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        int i11 = i10 + 1;
        this.f7360b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7360b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7360b = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.f7360b = i14;
        byte b13 = bArr[i13];
        int i15 = i14 + 1;
        this.f7360b = i15;
        byte b14 = bArr[i14];
        int i16 = i15 + 1;
        this.f7360b = i16;
        byte b15 = bArr[i15];
        int i17 = i16 + 1;
        this.f7360b = i17;
        byte b16 = bArr[i16];
        this.f7360b = i17 + 1;
        return ((b11 & 255) << 48) | ((b10 & 255) << 56) | ((b12 & 255) << 40) | ((b13 & 255) << 32) | ((b14 & 255) << 24) | ((b15 & 255) << 16) | ((b16 & 255) << 8) | (bArr[i17] & 255);
    }

    public final int t() {
        byte[] bArr = this.f7359a;
        int i10 = this.f7360b;
        int i11 = i10 + 1;
        this.f7360b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7360b = i12;
        byte b11 = bArr[i11];
        this.f7360b = i12 + 2;
        return (b11 & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public final int u() {
        int r10 = r();
        if (r10 >= 0) {
            return r10;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(r10);
        throw new IllegalStateException(sb2.toString());
    }

    public final long v() {
        long s10 = s();
        if (s10 >= 0) {
            return s10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(s10);
        throw new IllegalStateException(sb2.toString());
    }

    public final String w(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f7360b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f7359a, i11, (i12 >= this.f7361c || this.f7359a[i12] != 0) ? i10 : i10 - 1);
        this.f7360b += i10;
        return str;
    }

    public nj(byte[] bArr) {
        this.f7359a = bArr;
        this.f7361c = bArr.length;
    }
}
