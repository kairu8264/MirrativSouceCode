package ai;

import com.google.android.exoplayer2.C;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class pb {

    /* renamed from: a  reason: collision with root package name */
    public long f8364a;

    /* renamed from: b  reason: collision with root package name */
    public long f8365b;

    /* renamed from: c  reason: collision with root package name */
    public long f8366c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Long> f8367d = new ThreadLocal<>();

    public pb(long j10) {
        d(0L);
    }

    public final synchronized long a() {
        long j10 = this.f8364a;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? C.TIME_UNSET : j10;
    }

    public final synchronized long b() {
        long j10;
        j10 = this.f8366c;
        return j10 != C.TIME_UNSET ? j10 + this.f8365b : a();
    }

    public final synchronized long c() {
        return this.f8365b;
    }

    public final synchronized void d(long j10) {
        this.f8364a = j10;
        this.f8365b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f8366c = C.TIME_UNSET;
    }

    public final synchronized long e(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j11 = this.f8366c;
        if (j11 != C.TIME_UNSET) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = (((-1) + j13) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return f((j10 * 1000000) / 90000);
    }

    public final synchronized long f(long j10) {
        if (this.f8365b == C.TIME_UNSET) {
            long j11 = this.f8364a;
            if (j11 == 9223372036854775806L) {
                Long l10 = this.f8367d.get();
                Objects.requireNonNull(l10);
                j11 = l10.longValue();
            }
            this.f8365b = j11 - j10;
            notifyAll();
        }
        this.f8366c = j10;
        return j10 + this.f8365b;
    }
}
