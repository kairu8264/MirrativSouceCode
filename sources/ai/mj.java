package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class mj {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f6954a;

    /* renamed from: b  reason: collision with root package name */
    public int f6955b;

    /* renamed from: c  reason: collision with root package name */
    public int f6956c;

    /* renamed from: d  reason: collision with root package name */
    public int f6957d;

    public mj(byte[] bArr, int i10) {
        this.f6954a = bArr;
        this.f6957d = i10;
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i10 >> 3;
        boolean z10 = false;
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = this.f6956c;
            if (i18 != 0) {
                byte[] bArr = this.f6954a;
                int i19 = this.f6955b;
                i14 = ((bArr[i19 + 1] & TagConstant.TAG_CAT_RESERVED) >>> (8 - i18)) | ((bArr[i19] & TagConstant.TAG_CAT_RESERVED) << i18);
            } else {
                i14 = this.f6954a[this.f6955b];
            }
            i10 -= 8;
            i16 |= (255 & i14) << i10;
            this.f6955b++;
        }
        if (i10 > 0) {
            int i20 = this.f6956c + i10;
            byte b10 = (byte) (255 >> (8 - i10));
            if (i20 > 8) {
                byte[] bArr2 = this.f6954a;
                int i21 = this.f6955b;
                int i22 = i21 + 1;
                i13 = (b10 & (((255 & bArr2[i22]) >> (16 - i20)) | ((bArr2[i21] & TagConstant.TAG_CAT_RESERVED) << (i20 - 8)))) | i16;
                this.f6955b = i22;
            } else {
                byte[] bArr3 = this.f6954a;
                int i23 = this.f6955b;
                i13 = (b10 & ((255 & bArr3[i23]) >> (8 - i20))) | i16;
                if (i20 == 8) {
                    this.f6955b = i23 + 1;
                }
            }
            i16 = i13;
            this.f6956c = i20 % 8;
        }
        int i24 = this.f6955b;
        if (i24 >= 0 && (i11 = this.f6956c) >= 0 && (i24 < (i12 = this.f6957d) || (i24 == i12 && i11 == 0))) {
            z10 = true;
        }
        fj.d(z10);
        return i16;
    }
}
