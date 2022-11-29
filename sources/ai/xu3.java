package ai;

/* loaded from: classes3.dex */
public final class xu3 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final av3 f12315a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12316b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12317c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12318d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12319e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12320f;

    public xu3(av3 av3Var, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f12315a = av3Var;
        this.f12316b = j10;
        this.f12317c = j12;
        this.f12318d = j13;
        this.f12319e = j14;
        this.f12320f = j15;
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        mw3 mw3Var = new mw3(j10, zu3.a(this.f12315a.a(j10), 0L, this.f12317c, this.f12318d, this.f12319e, this.f12320f));
        return new jw3(mw3Var, mw3Var);
    }

    @Override // ai.lw3
    public final boolean c() {
        return true;
    }

    @Override // ai.lw3
    public final long f() {
        return this.f12316b;
    }

    public final long j(long j10) {
        return this.f12315a.a(j10);
    }
}
