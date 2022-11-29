package ai;

/* loaded from: classes3.dex */
public final class eg {

    /* renamed from: a  reason: collision with root package name */
    public final int f3652a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f3653b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f3654c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3655d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f3656e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3657f;

    public eg(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        fj.a(iArr.length == length);
        int length2 = jArr.length;
        fj.a(length2 == length);
        fj.a(iArr2.length == length);
        this.f3653b = jArr;
        this.f3654c = iArr;
        this.f3655d = i10;
        this.f3656e = jArr2;
        this.f3657f = iArr2;
        this.f3652a = length2;
    }

    public final int a(long j10) {
        for (int h10 = vj.h(this.f3656e, j10, true, false); h10 >= 0; h10--) {
            if ((this.f3657f[h10] & 1) != 0) {
                return h10;
            }
        }
        return -1;
    }

    public final int b(long j10) {
        for (int i10 = vj.i(this.f3656e, j10, true, false); i10 < this.f3656e.length; i10++) {
            if ((this.f3657f[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }
}
