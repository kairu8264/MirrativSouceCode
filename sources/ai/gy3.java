package ai;

import android.util.Pair;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class gy3 implements ly3 {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f4651a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f4652b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4653c;

    public gy3(long[] jArr, long[] jArr2, long j10) {
        this.f4651a = jArr;
        this.f4652b = jArr2;
        this.f4653c = j10 == C.TIME_UNSET ? y2.b(jArr2[jArr2.length - 1]) : j10;
    }

    public static gy3 e(long j10, c9 c9Var, long j11) {
        int length = c9Var.A.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += c9Var.f2757y + c9Var.A[i12];
            j12 += c9Var.f2758z + c9Var.B[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new gy3(jArr, jArr2, j11);
    }

    public static Pair<Long, Long> g(long j10, long[] jArr, long[] jArr2) {
        int d10 = sb.d(jArr, j10, true, true);
        long j11 = jArr[d10];
        long j12 = jArr2[d10];
        int i10 = d10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        Pair<Long, Long> g10 = g(y2.a(sb.d0(j10, 0L, this.f4653c)), this.f4652b, this.f4651a);
        mw3 mw3Var = new mw3(y2.b(((Long) g10.first).longValue()), ((Long) g10.second).longValue());
        return new jw3(mw3Var, mw3Var);
    }

    @Override // ai.ly3
    public final long b() {
        return -1L;
    }

    @Override // ai.lw3
    public final boolean c() {
        return true;
    }

    @Override // ai.ly3
    public final long d(long j10) {
        return y2.b(((Long) g(j10, this.f4651a, this.f4652b).second).longValue());
    }

    @Override // ai.lw3
    public final long f() {
        return this.f4653c;
    }
}
