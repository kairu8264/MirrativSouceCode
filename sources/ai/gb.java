package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class gb {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f4375a;

    /* renamed from: b  reason: collision with root package name */
    public int f4376b;

    /* renamed from: c  reason: collision with root package name */
    public int f4377c;

    /* renamed from: d  reason: collision with root package name */
    public int f4378d;

    public gb() {
        this.f4375a = sb.f9783f;
    }

    public gb(byte[] bArr, int i10) {
        this.f4375a = bArr;
        this.f4378d = i10;
    }

    public final void a(byte[] bArr, int i10) {
        this.f4375a = bArr;
        this.f4376b = 0;
        this.f4377c = 0;
        this.f4378d = i10;
    }

    public final int b() {
        return ((this.f4378d - this.f4376b) * 8) - this.f4377c;
    }

    public final int c() {
        return (this.f4376b * 8) + this.f4377c;
    }

    public final void d(int i10) {
        int i11 = i10 / 8;
        this.f4376b = i11;
        this.f4377c = i10 - (i11 * 8);
        m();
    }

    public final void e() {
        int i10 = this.f4377c + 1;
        this.f4377c = i10;
        if (i10 == 8) {
            this.f4377c = 0;
            this.f4376b++;
        }
        m();
    }

    public final void f(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f4376b + i11;
        this.f4376b = i12;
        int i13 = this.f4377c + (i10 - (i11 * 8));
        this.f4377c = i13;
        if (i13 > 7) {
            this.f4376b = i12 + 1;
            this.f4377c = i13 - 8;
        }
        m();
    }

    public final boolean g() {
        boolean z10 = (this.f4375a[this.f4376b] & (128 >> this.f4377c)) != 0;
        e();
        return z10;
    }

    public final int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f4377c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f4377c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f4377c = i13;
            byte[] bArr = this.f4375a;
            int i14 = this.f4376b;
            this.f4376b = i14 + 1;
            i12 |= (bArr[i14] & TagConstant.TAG_CAT_RESERVED) << i13;
        }
        byte[] bArr2 = this.f4375a;
        int i15 = this.f4376b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & TagConstant.TAG_CAT_RESERVED) >> (8 - i11)));
        if (i11 == 8) {
            this.f4377c = 0;
            this.f4376b = i15 + 1;
        }
        m();
        return i16;
    }

    public final void i(byte[] bArr, int i10, int i11) {
        int i12 = i11 >> 3;
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr2 = this.f4375a;
            int i14 = this.f4376b;
            int i15 = i14 + 1;
            this.f4376b = i15;
            byte b10 = bArr2[i14];
            int i16 = this.f4377c;
            byte b11 = (byte) (b10 << i16);
            bArr[i13] = b11;
            bArr[i13] = (byte) (((255 & bArr2[i15]) >> (8 - i16)) | b11);
        }
        int i17 = i11 & 7;
        if (i17 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i17));
        bArr[i12] = b12;
        int i18 = this.f4377c;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.f4375a;
            int i19 = this.f4376b;
            this.f4376b = i19 + 1;
            b12 = (byte) (b12 | ((bArr3[i19] & TagConstant.TAG_CAT_RESERVED) << i18));
            bArr[i12] = b12;
            i18 -= 8;
        }
        int i20 = i18 + i17;
        this.f4377c = i20;
        byte[] bArr4 = this.f4375a;
        int i21 = this.f4376b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i17))) | b12);
        if (i20 == 8) {
            this.f4377c = 0;
            this.f4376b = i21 + 1;
        }
        m();
    }

    public final void j() {
        if (this.f4377c == 0) {
            return;
        }
        this.f4377c = 0;
        this.f4376b++;
        m();
    }

    public final void k(int i10) {
        u9.d(this.f4377c == 0);
        this.f4376b += i10;
        m();
    }

    public final void l(int i10, int i11) {
        int i12;
        int i13 = i10 & 16383;
        int min = Math.min(8 - this.f4377c, 14);
        int i14 = this.f4377c;
        int i15 = (8 - i14) - min;
        byte[] bArr = this.f4375a;
        int i16 = this.f4376b;
        byte b10 = (byte) (((65280 >> i14) | ((1 << i15) - 1)) & bArr[i16]);
        bArr[i16] = b10;
        int i17 = 14 - min;
        bArr[i16] = (byte) (b10 | ((i13 >>> i17) << i15));
        int i18 = i16 + 1;
        while (i17 > 8) {
            i17 -= 8;
            this.f4375a[i18] = (byte) (i13 >>> i17);
            i18++;
        }
        byte[] bArr2 = this.f4375a;
        byte b11 = (byte) (bArr2[i18] & ((1 << i12) - 1));
        bArr2[i18] = b11;
        bArr2[i18] = (byte) (((i13 & ((1 << i17) - 1)) << (8 - i17)) | b11);
        f(14);
        m();
    }

    public final void m() {
        int i10;
        int i11 = this.f4376b;
        boolean z10 = true;
        if (i11 < 0 || (i11 >= (i10 = this.f4378d) && (i11 != i10 || this.f4377c != 0))) {
            z10 = false;
        }
        u9.d(z10);
    }
}
