package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class oj {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7823a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7824b;

    /* renamed from: c  reason: collision with root package name */
    public int f7825c;

    /* renamed from: d  reason: collision with root package name */
    public int f7826d = 0;

    public oj(byte[] bArr, int i10, int i11) {
        this.f7823a = bArr;
        this.f7825c = i10;
        this.f7824b = i11;
        h();
    }

    public final void a(int i10) {
        int i11 = this.f7825c;
        int i12 = (i10 >> 3) + i11;
        this.f7825c = i12;
        int i13 = this.f7826d + (i10 & 7);
        this.f7826d = i13;
        if (i13 > 7) {
            this.f7825c = i12 + 1;
            this.f7826d = i13 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f7825c) {
                h();
                return;
            } else if (g(i11)) {
                this.f7825c++;
                i11 += 2;
            }
        }
    }

    public final boolean b() {
        return c(1) == 1;
    }

    public final int c(int i10) {
        int i11;
        int i12;
        int i13 = i10 >> 3;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = g(this.f7825c + 1) ? this.f7825c + 2 : this.f7825c + 1;
            int i17 = this.f7826d;
            if (i17 != 0) {
                byte[] bArr = this.f7823a;
                i12 = ((bArr[i16] & TagConstant.TAG_CAT_RESERVED) >>> (8 - i17)) | ((bArr[this.f7825c] & TagConstant.TAG_CAT_RESERVED) << i17);
            } else {
                i12 = this.f7823a[this.f7825c];
            }
            i10 -= 8;
            i14 |= (255 & i12) << i10;
            this.f7825c = i16;
        }
        if (i10 > 0) {
            int i18 = this.f7826d + i10;
            byte b10 = (byte) (255 >> (8 - i10));
            int i19 = g(this.f7825c + 1) ? this.f7825c + 2 : this.f7825c + 1;
            if (i18 > 8) {
                byte[] bArr2 = this.f7823a;
                i11 = (b10 & (((255 & bArr2[i19]) >> (16 - i18)) | ((bArr2[this.f7825c] & TagConstant.TAG_CAT_RESERVED) << (i18 - 8)))) | i14;
                this.f7825c = i19;
            } else {
                i11 = (b10 & ((255 & this.f7823a[this.f7825c]) >> (8 - i18))) | i14;
                if (i18 == 8) {
                    this.f7825c = i19;
                }
            }
            i14 = i11;
            this.f7826d = i18 % 8;
        }
        h();
        return i14;
    }

    public final int d() {
        return f();
    }

    public final int e() {
        int f10 = f();
        return (f10 % 2 == 0 ? -1 : 1) * ((f10 + 1) / 2);
    }

    public final int f() {
        int i10 = 0;
        while (!b()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? c(i10) : 0);
    }

    public final boolean g(int i10) {
        if (i10 < 2 || i10 >= this.f7824b) {
            return false;
        }
        byte[] bArr = this.f7823a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final void h() {
        int i10;
        int i11;
        int i12 = this.f7825c;
        boolean z10 = true;
        if (i12 < 0 || (i10 = this.f7826d) < 0 || i10 >= 8 || (i12 >= (i11 = this.f7824b) && (i12 != i11 || i10 != 0))) {
            z10 = false;
        }
        fj.d(z10);
    }
}
