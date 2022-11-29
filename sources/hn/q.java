package hn;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final int f36248a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36249b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f36250c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f36251d;

    public q(int[] iArr) {
        this.f36248a = Math.max(t.k(iArr), 1);
        int j10 = t.j(iArr);
        this.f36249b = j10;
        Object[] objArr = new Object[2];
        this.f36250c = c(a(iArr, j10), j10, objArr);
        this.f36251d = d(iArr, (int[]) objArr[0], ((Integer) objArr[1]).intValue());
    }

    public static int[] a(int[] iArr, int i10) {
        int[] iArr2 = new int[i10 + 1];
        for (int i11 : iArr) {
            iArr2[i11] = iArr2[i11] + 1;
        }
        return iArr2;
    }

    public static int[] b(int i10, int i11) {
        int[] iArr = new int[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static int[] c(int[] iArr, int i10, Object[] objArr) {
        int i11 = i10 + 1;
        int[] b10 = b(i11, -1);
        iArr[0] = 0;
        int[] iArr2 = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iArr.length; i14++) {
            i13 = (i13 + iArr[i14 - 1]) << 1;
            iArr2[i14] = i13;
            i12 = (iArr[i14] + i13) - 1;
            b10[i14] = i12;
        }
        objArr[0] = iArr2;
        objArr[1] = Integer.valueOf(i12);
        return b10;
    }

    public static int[] d(int[] iArr, int[] iArr2, int i10) {
        int[] iArr3 = new int[i10 + 1];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                int i13 = iArr2[i12];
                iArr2[i12] = i13 + 1;
                iArr3[i13] = i11;
            }
        }
        return iArr3;
    }

    public int e(c cVar, int[] iArr) throws n {
        int g10;
        for (int i10 = this.f36248a; i10 <= this.f36249b; i10++) {
            int i11 = this.f36250c[i10];
            if (i11 >= 0 && i11 >= (g10 = cVar.g(iArr[0], i10))) {
                int i12 = this.f36251d[g10];
                iArr[0] = iArr[0] + i10;
                return i12;
            }
        }
        throw new n(String.format("[%s] Bad code at the bit index '%d'.", getClass().getSimpleName(), Integer.valueOf(iArr[0])));
    }
}
