package ai;

/* loaded from: classes3.dex */
public final class zu3 {

    /* renamed from: a  reason: collision with root package name */
    public final long f13192a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13193b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13194c;

    /* renamed from: d  reason: collision with root package name */
    public long f13195d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f13196e;

    /* renamed from: f  reason: collision with root package name */
    public long f13197f;

    /* renamed from: g  reason: collision with root package name */
    public long f13198g;

    /* renamed from: h  reason: collision with root package name */
    public long f13199h;

    public zu3(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f13192a = j10;
        this.f13193b = j11;
        this.f13196e = j13;
        this.f13197f = j14;
        this.f13198g = j15;
        this.f13194c = j16;
        this.f13199h = a(j11, 0L, j13, j14, j15, j16);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
        return sb.d0(((j13 + j16) - j15) - (j16 / 20), j13, (-1) + j14);
    }

    public static /* synthetic */ void f(zu3 zu3Var, long j10, long j11) {
        zu3Var.f13195d = j10;
        zu3Var.f13197f = j11;
        zu3Var.i();
    }

    public static /* synthetic */ void g(zu3 zu3Var, long j10, long j11) {
        zu3Var.f13196e = j10;
        zu3Var.f13198g = j11;
        zu3Var.i();
    }

    public final void i() {
        this.f13199h = a(this.f13193b, this.f13195d, this.f13196e, this.f13197f, this.f13198g, this.f13194c);
    }
}
