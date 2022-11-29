package ai;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public final class tq3 {

    /* renamed from: a  reason: collision with root package name */
    public final Random f10379a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f10380b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f10381c;

    public tq3(int i10) {
        this(0, new Random());
    }

    public final int a() {
        return this.f10380b.length;
    }

    public final int b(int i10) {
        int i11 = this.f10381c[i10] + 1;
        int[] iArr = this.f10380b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int c(int i10) {
        int i11 = this.f10381c[i10] - 1;
        if (i11 >= 0) {
            return this.f10380b[i11];
        }
        return -1;
    }

    public final int d() {
        int[] iArr = this.f10380b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int e() {
        int[] iArr = this.f10380b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final tq3 f(int i10, int i11) {
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int i12 = 0;
        int i13 = 0;
        while (i13 < i11) {
            iArr[i13] = this.f10379a.nextInt(this.f10380b.length + 1);
            int i14 = i13 + 1;
            int nextInt = this.f10379a.nextInt(i14);
            iArr2[i13] = iArr2[nextInt];
            iArr2[nextInt] = i13;
            i13 = i14;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f10380b.length + i11];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr4 = this.f10380b;
            if (i12 < iArr4.length + i11) {
                if (i15 < i11 && i16 == iArr[i15]) {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                } else {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= 0) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                }
                i12++;
            } else {
                return new tq3(iArr3, new Random(this.f10379a.nextLong()));
            }
        }
    }

    public final tq3 g(int i10, int i11) {
        int[] iArr = new int[this.f10380b.length - i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f10380b;
            if (i12 < iArr2.length) {
                int i14 = iArr2[i12];
                if (i14 < 0 || i14 >= i11) {
                    int i15 = i12 - i13;
                    if (i14 >= 0) {
                        i14 -= i11;
                    }
                    iArr[i15] = i14;
                } else {
                    i13++;
                }
                i12++;
            } else {
                return new tq3(iArr, new Random(this.f10379a.nextLong()));
            }
        }
    }

    public final tq3 h() {
        return new tq3(0, new Random(this.f10379a.nextLong()));
    }

    public tq3(int i10, Random random) {
        this(new int[0], random);
    }

    public tq3(int[] iArr, Random random) {
        this.f10380b = iArr;
        this.f10379a = random;
        this.f10381c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f10381c[iArr[i10]] = i10;
        }
    }
}
