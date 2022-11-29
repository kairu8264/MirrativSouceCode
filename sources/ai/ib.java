package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class ib {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f5150a;

    /* renamed from: b  reason: collision with root package name */
    public int f5151b;

    /* renamed from: c  reason: collision with root package name */
    public int f5152c;

    /* renamed from: d  reason: collision with root package name */
    public int f5153d;

    public ib(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f5150a = bArr;
        this.f5152c = i10;
        this.f5151b = i11;
        this.f5153d = 0;
        j();
    }

    public final void b() {
        int i10 = this.f5153d + 1;
        this.f5153d = i10;
        if (i10 == 8) {
            this.f5153d = 0;
            int i11 = this.f5152c;
            this.f5152c = i11 + (true == i(i11 + 1) ? 2 : 1);
        }
        j();
    }

    public final void c(int i10) {
        int i11 = this.f5152c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f5152c = i13;
        int i14 = this.f5153d + (i10 - (i12 * 8));
        this.f5153d = i14;
        if (i14 > 7) {
            this.f5152c = i13 + 1;
            this.f5153d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f5152c) {
                j();
                return;
            } else if (i(i11)) {
                this.f5152c++;
                i11 += 2;
            }
        }
    }

    public final boolean d() {
        boolean z10 = (this.f5150a[this.f5152c] & (128 >> this.f5153d)) != 0;
        b();
        return z10;
    }

    public final int e(int i10) {
        int i11;
        this.f5153d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f5153d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f5153d = i13;
            byte[] bArr = this.f5150a;
            int i14 = this.f5152c;
            i12 |= (bArr[i14] & TagConstant.TAG_CAT_RESERVED) << i13;
            if (true != i(i14 + 1)) {
                r3 = 1;
            }
            this.f5152c = i14 + r3;
        }
        byte[] bArr2 = this.f5150a;
        int i15 = this.f5152c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & TagConstant.TAG_CAT_RESERVED) >> (8 - i11)));
        if (i11 == 8) {
            this.f5153d = 0;
            this.f5152c = i15 + (true != i(i15 + 1) ? 1 : 2);
        }
        j();
        return i16;
    }

    public final int f() {
        return h();
    }

    public final int g() {
        int h10 = h();
        return (h10 % 2 == 0 ? -1 : 1) * ((h10 + 1) / 2);
    }

    public final int h() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    public final boolean i(int i10) {
        if (i10 < 2 || i10 >= this.f5151b) {
            return false;
        }
        byte[] bArr = this.f5150a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final void j() {
        int i10;
        int i11 = this.f5152c;
        boolean z10 = true;
        if (i11 < 0 || (i11 >= (i10 = this.f5151b) && (i11 != i10 || this.f5153d != 0))) {
            z10 = false;
        }
        u9.d(z10);
    }
}
