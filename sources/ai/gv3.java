package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public class gv3 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final long f4597a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4598b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4599c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4600d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4601e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4602f;

    public gv3(long j10, long j11, int i10, int i11, boolean z10) {
        long g10;
        this.f4597a = j10;
        this.f4598b = j11;
        this.f4599c = i11 == -1 ? 1 : i11;
        this.f4601e = i10;
        if (j10 == -1) {
            this.f4600d = -1L;
            g10 = C.TIME_UNSET;
        } else {
            this.f4600d = j10 - j11;
            g10 = g(j10, j11, i10);
        }
        this.f4602f = g10;
    }

    public static long g(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        long j11 = this.f4600d;
        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        if (i10 != 0) {
            int i11 = this.f4601e;
            long j12 = this.f4599c;
            long j13 = (((i11 * j10) / 8000000) / j12) * j12;
            if (i10 != 0) {
                j13 = Math.min(j13, j11 - j12);
            }
            long max = this.f4598b + Math.max(j13, 0L);
            long e10 = e(max);
            mw3 mw3Var = new mw3(e10, max);
            if (this.f4600d != -1 && e10 < j10) {
                long j14 = max + this.f4599c;
                if (j14 < this.f4597a) {
                    return new jw3(mw3Var, new mw3(e(j14), j14));
                }
            }
            return new jw3(mw3Var, mw3Var);
        }
        mw3 mw3Var2 = new mw3(0L, this.f4598b);
        return new jw3(mw3Var2, mw3Var2);
    }

    @Override // ai.lw3
    public final boolean c() {
        return this.f4600d != -1;
    }

    public final long e(long j10) {
        return g(j10, this.f4598b, this.f4601e);
    }

    @Override // ai.lw3
    public final long f() {
        return this.f4602f;
    }
}
