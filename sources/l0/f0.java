package l0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public int[] f38990a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    public int f38991b;

    public final void a() {
        this.f38991b = 0;
    }

    public final int b() {
        return this.f38991b;
    }

    public final int c(int i10) {
        int i11 = this.f38991b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f38990a[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f38991b == 0;
    }

    public final int e() {
        return this.f38990a[this.f38991b - 1];
    }

    public final int f(int i10) {
        return this.f38990a[i10];
    }

    public final int g(int i10) {
        return this.f38991b > 0 ? e() : i10;
    }

    public final int h() {
        int[] iArr = this.f38990a;
        int i10 = this.f38991b - 1;
        this.f38991b = i10;
        return iArr[i10];
    }

    public final void i(int i10) {
        int i11 = this.f38991b;
        int[] iArr = this.f38990a;
        if (i11 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            jo.p.g(copyOf, "copyOf(this, newSize)");
            this.f38990a = copyOf;
        }
        int[] iArr2 = this.f38990a;
        int i12 = this.f38991b;
        this.f38991b = i12 + 1;
        iArr2[i12] = i10;
    }
}
