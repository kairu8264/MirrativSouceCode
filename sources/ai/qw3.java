package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class qw3 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9222a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9223b;

    /* renamed from: c  reason: collision with root package name */
    public int f9224c;

    /* renamed from: d  reason: collision with root package name */
    public int f9225d;

    public qw3(byte[] bArr) {
        this.f9222a = bArr;
        this.f9223b = bArr.length;
    }

    public final boolean a() {
        byte b10 = this.f9222a[this.f9224c];
        int i10 = this.f9225d;
        c(1);
        return 1 == (((b10 & TagConstant.TAG_CAT_RESERVED) >> i10) & 1);
    }

    public final int b(int i10) {
        int i11 = this.f9224c;
        int min = Math.min(i10, 8 - this.f9225d);
        int i12 = i11 + 1;
        int i13 = ((this.f9222a[i11] & TagConstant.TAG_CAT_RESERVED) >> this.f9225d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f9222a[i12] & TagConstant.TAG_CAT_RESERVED) << min;
            min += 8;
            i12++;
        }
        c(i10);
        return ((-1) >>> (32 - i10)) & i13;
    }

    public final void c(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f9224c + i12;
        this.f9224c = i13;
        int i14 = this.f9225d + (i10 - (i12 * 8));
        this.f9225d = i14;
        if (i14 > 7) {
            i13++;
            this.f9224c = i13;
            i14 -= 8;
            this.f9225d = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.f9223b) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        u9.d(z10);
    }

    public final int d() {
        return (this.f9224c * 8) + this.f9225d;
    }
}
