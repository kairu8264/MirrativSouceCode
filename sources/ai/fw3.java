package ai;

/* loaded from: classes3.dex */
public final class fw3 {

    /* renamed from: a  reason: collision with root package name */
    public int f4230a;

    /* renamed from: b  reason: collision with root package name */
    public String f4231b;

    /* renamed from: c  reason: collision with root package name */
    public int f4232c;

    /* renamed from: d  reason: collision with root package name */
    public int f4233d;

    /* renamed from: e  reason: collision with root package name */
    public int f4234e;

    /* renamed from: f  reason: collision with root package name */
    public int f4235f;

    /* renamed from: g  reason: collision with root package name */
    public int f4236g;

    public final boolean a(int i10) {
        boolean l10;
        int i11;
        int i12;
        int i13;
        int i14;
        String[] strArr;
        int[] iArr;
        int m10;
        int[] iArr2;
        int[] iArr3;
        int i15;
        int[] iArr4;
        int[] iArr5;
        int i16;
        int[] iArr6;
        l10 = gw3.l(i10);
        if (!l10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f4230a = i11;
        strArr = gw3.f4611a;
        this.f4231b = strArr[3 - i12];
        iArr = gw3.f4612b;
        int i17 = iArr[i14];
        this.f4233d = i17;
        if (i11 == 2) {
            this.f4233d = i17 / 2;
        } else if (i11 == 0) {
            this.f4233d = i17 / 4;
        }
        int i18 = (i10 >>> 9) & 1;
        m10 = gw3.m(i11, i12);
        this.f4236g = m10;
        if (i12 == 3) {
            if (i11 == 3) {
                iArr6 = gw3.f4613c;
                i16 = iArr6[i13 - 1];
            } else {
                iArr5 = gw3.f4614d;
                i16 = iArr5[i13 - 1];
            }
            this.f4235f = i16;
            this.f4232c = (((i16 * 12) / this.f4233d) + i18) * 4;
        } else {
            if (i11 == 3) {
                if (i12 == 2) {
                    iArr4 = gw3.f4615e;
                    i15 = iArr4[i13 - 1];
                } else {
                    iArr3 = gw3.f4616f;
                    i15 = iArr3[i13 - 1];
                }
                this.f4235f = i15;
                this.f4232c = ((i15 * 144) / this.f4233d) + i18;
            } else {
                iArr2 = gw3.f4617g;
                int i19 = iArr2[i13 - 1];
                this.f4235f = i19;
                this.f4232c = (((i12 == 1 ? 72 : 144) * i19) / this.f4233d) + i18;
            }
        }
        this.f4234e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
