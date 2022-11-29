package ai;

/* loaded from: classes3.dex */
public final class ew3 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f3799a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f3800b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3801c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3802d;

    public ew3(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        u9.a(length == length2);
        boolean z10 = length2 > 0;
        this.f3802d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f3799a = jArr;
            this.f3800b = jArr2;
        } else {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.f3799a = jArr3;
            long[] jArr4 = new long[i10];
            this.f3800b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f3801c = j10;
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        if (!this.f3802d) {
            mw3 mw3Var = mw3.f7081c;
            return new jw3(mw3Var, mw3Var);
        }
        int d10 = sb.d(this.f3800b, j10, true, true);
        mw3 mw3Var2 = new mw3(this.f3800b[d10], this.f3799a[d10]);
        if (mw3Var2.f7082a != j10) {
            long[] jArr = this.f3800b;
            if (d10 != jArr.length - 1) {
                int i10 = d10 + 1;
                return new jw3(mw3Var2, new mw3(jArr[i10], this.f3799a[i10]));
            }
        }
        return new jw3(mw3Var2, mw3Var2);
    }

    @Override // ai.lw3
    public final boolean c() {
        return this.f3802d;
    }

    @Override // ai.lw3
    public final long f() {
        return this.f3801c;
    }
}
