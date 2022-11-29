package ai;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class a3 {

    /* renamed from: a  reason: collision with root package name */
    public final long f1699a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1700b;

    /* renamed from: c  reason: collision with root package name */
    public long f1701c = C.TIME_UNSET;

    /* renamed from: d  reason: collision with root package name */
    public long f1702d = C.TIME_UNSET;

    /* renamed from: f  reason: collision with root package name */
    public long f1704f = C.TIME_UNSET;

    /* renamed from: g  reason: collision with root package name */
    public long f1705g = C.TIME_UNSET;

    /* renamed from: j  reason: collision with root package name */
    public float f1708j = 0.97f;

    /* renamed from: i  reason: collision with root package name */
    public float f1707i = 1.03f;

    /* renamed from: k  reason: collision with root package name */
    public float f1709k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public long f1710l = C.TIME_UNSET;

    /* renamed from: e  reason: collision with root package name */
    public long f1703e = C.TIME_UNSET;

    /* renamed from: h  reason: collision with root package name */
    public long f1706h = C.TIME_UNSET;

    /* renamed from: m  reason: collision with root package name */
    public long f1711m = C.TIME_UNSET;

    /* renamed from: n  reason: collision with root package name */
    public long f1712n = C.TIME_UNSET;

    public /* synthetic */ a3(float f10, float f11, long j10, float f12, long j11, long j12, float f13, z2 z2Var) {
        this.f1699a = j11;
        this.f1700b = j12;
    }

    public static long g(long j10, long j11, float f10) {
        return (((float) j10) * 0.999f) + (((float) j11) * 9.999871E-4f);
    }

    public final void a(h5 h5Var) {
        long j10 = h5Var.f4747a;
        this.f1701c = y2.b(C.TIME_UNSET);
        this.f1704f = y2.b(C.TIME_UNSET);
        this.f1705g = y2.b(C.TIME_UNSET);
        this.f1708j = 0.97f;
        this.f1707i = 1.03f;
        f();
    }

    public final void b(long j10) {
        this.f1702d = j10;
        f();
    }

    public final void c() {
        long j10 = this.f1706h;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.f1700b;
        this.f1706h = j11;
        long j12 = this.f1705g;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.f1706h = j12;
        }
        this.f1710l = C.TIME_UNSET;
    }

    public final float d(long j10, long j11) {
        long j12;
        if (this.f1701c != C.TIME_UNSET) {
            long j13 = j10 - j11;
            long j14 = this.f1711m;
            if (j14 == C.TIME_UNSET) {
                this.f1711m = j13;
                this.f1712n = 0L;
            } else {
                long max = Math.max(j13, g(j14, j13, 0.999f));
                this.f1711m = max;
                this.f1712n = g(this.f1712n, Math.abs(j13 - max), 0.999f);
            }
            if (this.f1710l != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f1710l < 1000) {
                return this.f1709k;
            }
            this.f1710l = SystemClock.elapsedRealtime();
            long j15 = this.f1711m + (this.f1712n * 3);
            if (this.f1706h > j15) {
                float b10 = (float) y2.b(1000L);
                long[] jArr = {j15, this.f1703e, this.f1706h - (((this.f1709k - 1.0f) * b10) + ((this.f1707i - 1.0f) * b10))};
                j12 = jArr[0];
                for (int i10 = 1; i10 < 3; i10++) {
                    long j16 = jArr[i10];
                    if (j16 > j12) {
                        j12 = j16;
                    }
                }
                this.f1706h = j12;
            } else {
                long d02 = sb.d0(j10 - (Math.max(0.0f, this.f1709k - 1.0f) / 1.0E-7f), this.f1706h, j15);
                this.f1706h = d02;
                long j17 = this.f1705g;
                if (j17 == C.TIME_UNSET || d02 <= j17) {
                    j12 = d02;
                } else {
                    this.f1706h = j17;
                    j12 = j17;
                }
            }
            long j18 = j10 - j12;
            if (Math.abs(j18) < this.f1699a) {
                this.f1709k = 1.0f;
                return 1.0f;
            }
            float e02 = sb.e0((((float) j18) * 1.0E-7f) + 1.0f, this.f1708j, this.f1707i);
            this.f1709k = e02;
            return e02;
        }
        return 1.0f;
    }

    public final long e() {
        return this.f1706h;
    }

    public final void f() {
        long j10 = this.f1701c;
        if (j10 != C.TIME_UNSET) {
            long j11 = this.f1702d;
            if (j11 != C.TIME_UNSET) {
                j10 = j11;
            }
            long j12 = this.f1704f;
            if (j12 != C.TIME_UNSET && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f1705g;
            if (j13 != C.TIME_UNSET && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f1703e == j10) {
            return;
        }
        this.f1703e = j10;
        this.f1706h = j10;
        this.f1711m = C.TIME_UNSET;
        this.f1712n = C.TIME_UNSET;
        this.f1710l = C.TIME_UNSET;
    }
}
