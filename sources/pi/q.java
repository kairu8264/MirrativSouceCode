package pi;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f48141a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48142b;

    /* renamed from: c  reason: collision with root package name */
    public final long f48143c;

    /* renamed from: d  reason: collision with root package name */
    public final long f48144d;

    /* renamed from: e  reason: collision with root package name */
    public final long f48145e;

    /* renamed from: f  reason: collision with root package name */
    public final long f48146f;

    /* renamed from: g  reason: collision with root package name */
    public final long f48147g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f48148h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f48149i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f48150j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f48151k;

    public q(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        rh.p.e(str);
        rh.p.e(str2);
        rh.p.a(j10 >= 0);
        rh.p.a(j11 >= 0);
        rh.p.a(j12 >= 0);
        rh.p.a(j14 >= 0);
        this.f48141a = str;
        this.f48142b = str2;
        this.f48143c = j10;
        this.f48144d = j11;
        this.f48145e = j12;
        this.f48146f = j13;
        this.f48147g = j14;
        this.f48148h = l10;
        this.f48149i = l11;
        this.f48150j = l12;
        this.f48151k = bool;
    }

    public final q a(Long l10, Long l11, Boolean bool) {
        return new q(this.f48141a, this.f48142b, this.f48143c, this.f48144d, this.f48145e, this.f48146f, this.f48147g, this.f48148h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final q b(long j10, long j11) {
        return new q(this.f48141a, this.f48142b, this.f48143c, this.f48144d, this.f48145e, this.f48146f, j10, Long.valueOf(j11), this.f48149i, this.f48150j, this.f48151k);
    }

    public final q c(long j10) {
        return new q(this.f48141a, this.f48142b, this.f48143c, this.f48144d, this.f48145e, j10, this.f48147g, this.f48148h, this.f48149i, this.f48150j, this.f48151k);
    }
}
