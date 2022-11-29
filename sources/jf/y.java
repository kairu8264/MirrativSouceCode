package jf;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static final a f38026d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38027a;

    /* renamed from: b  reason: collision with root package name */
    public final long f38028b;

    /* renamed from: c  reason: collision with root package name */
    public final long f38029c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y a(LiveBasicParams liveBasicParams) {
            jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
            return new y(liveBasicParams.isLive(), liveBasicParams.getStartedAt(), liveBasicParams.getEndedAt());
        }
    }

    public y(boolean z10, long j10, long j11) {
        this.f38027a = z10;
        this.f38028b = j10;
        this.f38029c = j11;
    }

    public final long a(long j10) {
        if (this.f38027a) {
            long j11 = this.f38028b;
            if (j11 == 0) {
                return 0L;
            }
            return (j10 / 1000) - j11;
        }
        return this.f38029c - this.f38028b;
    }

    public final boolean b() {
        return this.f38027a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return this.f38027a == yVar.f38027a && this.f38028b == yVar.f38028b && this.f38029c == yVar.f38029c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.f38027a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((r02 * 31) + Long.hashCode(this.f38028b)) * 31) + Long.hashCode(this.f38029c);
    }

    public String toString() {
        return "LiveTime(isLive=" + this.f38027a + ", startedAt=" + this.f38028b + ", endedAt=" + this.f38029c + ')';
    }
}
