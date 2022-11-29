package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class fv3 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4219a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4220b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f4221c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f4222d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f4223e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4224f;

    public fv3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4220b = iArr;
        this.f4221c = jArr;
        this.f4222d = jArr2;
        this.f4223e = jArr3;
        int length = iArr.length;
        this.f4219a = length;
        if (length <= 0) {
            this.f4224f = 0L;
            return;
        }
        int i10 = length - 1;
        this.f4224f = jArr2[i10] + jArr3[i10];
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        int d10 = sb.d(this.f4223e, j10, true, true);
        mw3 mw3Var = new mw3(this.f4223e[d10], this.f4221c[d10]);
        if (mw3Var.f7082a < j10 && d10 != this.f4219a - 1) {
            int i10 = d10 + 1;
            return new jw3(mw3Var, new mw3(this.f4223e[i10], this.f4221c[i10]));
        }
        return new jw3(mw3Var, mw3Var);
    }

    @Override // ai.lw3
    public final boolean c() {
        return true;
    }

    @Override // ai.lw3
    public final long f() {
        return this.f4224f;
    }

    public final String toString() {
        int i10 = this.f4219a;
        String arrays = Arrays.toString(this.f4220b);
        String arrays2 = Arrays.toString(this.f4221c);
        String arrays3 = Arrays.toString(this.f4223e);
        String arrays4 = Arrays.toString(this.f4222d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(arrays);
        sb2.append(", offsets=");
        sb2.append(arrays2);
        sb2.append(", timeUs=");
        sb2.append(arrays3);
        sb2.append(", durationsUs=");
        sb2.append(arrays4);
        sb2.append(")");
        return sb2.toString();
    }
}
