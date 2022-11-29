package ai;

/* loaded from: classes3.dex */
public final class rz3 {

    /* renamed from: a  reason: collision with root package name */
    public final oz3 f9637a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9638b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f9639c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f9640d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9641e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f9642f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f9643g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9644h;

    public rz3(oz3 oz3Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        u9.a(length == length2);
        int length3 = jArr.length;
        u9.a(length3 == length2);
        int length4 = iArr2.length;
        u9.a(length4 == length2);
        this.f9637a = oz3Var;
        this.f9639c = jArr;
        this.f9640d = iArr;
        this.f9641e = i10;
        this.f9642f = jArr2;
        this.f9643g = iArr2;
        this.f9644h = j10;
        this.f9638b = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int a(long j10) {
        for (int d10 = sb.d(this.f9642f, j10, true, false); d10 >= 0; d10--) {
            if ((this.f9643g[d10] & 1) != 0) {
                return d10;
            }
        }
        return -1;
    }

    public final int b(long j10) {
        for (int e10 = sb.e(this.f9642f, j10, true, false); e10 < this.f9642f.length; e10++) {
            if ((this.f9643g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
