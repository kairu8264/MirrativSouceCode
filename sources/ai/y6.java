package ai;

/* loaded from: classes3.dex */
public final class y6 {

    /* renamed from: c  reason: collision with root package name */
    public static final y6 f12458c;

    /* renamed from: d  reason: collision with root package name */
    public static final y6 f12459d;

    /* renamed from: e  reason: collision with root package name */
    public static final y6 f12460e;

    /* renamed from: f  reason: collision with root package name */
    public static final y6 f12461f;

    /* renamed from: g  reason: collision with root package name */
    public static final y6 f12462g;

    /* renamed from: a  reason: collision with root package name */
    public final long f12463a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12464b;

    static {
        y6 y6Var = new y6(0L, 0L);
        f12458c = y6Var;
        f12459d = new y6(Long.MAX_VALUE, Long.MAX_VALUE);
        f12460e = new y6(Long.MAX_VALUE, 0L);
        f12461f = new y6(0L, Long.MAX_VALUE);
        f12462g = y6Var;
    }

    public y6(long j10, long j11) {
        u9.a(j10 >= 0);
        u9.a(j11 >= 0);
        this.f12463a = j10;
        this.f12464b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y6.class == obj.getClass()) {
            y6 y6Var = (y6) obj;
            if (this.f12463a == y6Var.f12463a && this.f12464b == y6Var.f12464b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12463a) * 31) + ((int) this.f12464b);
    }
}
