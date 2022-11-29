package n1;

import java.util.List;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final long f41531a;

    /* renamed from: b  reason: collision with root package name */
    public final long f41532b;

    /* renamed from: c  reason: collision with root package name */
    public final long f41533c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f41534d;

    /* renamed from: e  reason: collision with root package name */
    public final long f41535e;

    /* renamed from: f  reason: collision with root package name */
    public final long f41536f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f41537g;

    /* renamed from: h  reason: collision with root package name */
    public final int f41538h;

    /* renamed from: i  reason: collision with root package name */
    public final long f41539i;

    /* renamed from: j  reason: collision with root package name */
    public List<e> f41540j;

    /* renamed from: k  reason: collision with root package name */
    public d f41541k;

    public w(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f41531a = j10;
        this.f41532b = j11;
        this.f41533c = j12;
        this.f41534d = z10;
        this.f41535e = j13;
        this.f41536f = j14;
        this.f41537g = z11;
        this.f41538h = i10;
        this.f41539i = j15;
        this.f41541k = new d(z12, z12);
    }

    public /* synthetic */ w(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, jo.h hVar) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15);
    }

    public /* synthetic */ w(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, jo.h hVar) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, list, j15);
    }

    public final void a() {
        this.f41541k.c(true);
        this.f41541k.d(true);
    }

    public final w b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List<e> list, long j15) {
        jo.p.h(list, "historical");
        w wVar = new w(j10, j11, j12, z10, j13, j14, z11, false, i10, (List) list, j15, (jo.h) null);
        wVar.f41541k = this.f41541k;
        return wVar;
    }

    public final List<e> d() {
        List<e> list = this.f41540j;
        return list == null ? xn.s.k() : list;
    }

    public final long e() {
        return this.f41531a;
    }

    public final long f() {
        return this.f41533c;
    }

    public final boolean g() {
        return this.f41534d;
    }

    public final long h() {
        return this.f41536f;
    }

    public final boolean i() {
        return this.f41537g;
    }

    public final long j() {
        return this.f41539i;
    }

    public final int k() {
        return this.f41538h;
    }

    public final long l() {
        return this.f41532b;
    }

    public final boolean m() {
        return this.f41541k.a() || this.f41541k.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) v.f(this.f41531a)) + ", uptimeMillis=" + this.f41532b + ", position=" + ((Object) b1.f.t(this.f41533c)) + ", pressed=" + this.f41534d + ", previousUptimeMillis=" + this.f41535e + ", previousPosition=" + ((Object) b1.f.t(this.f41536f)) + ", previousPressed=" + this.f41537g + ", isConsumed=" + m() + ", type=" + ((Object) j0.i(this.f41538h)) + ", historical=" + d() + ",scrollDelta=" + ((Object) b1.f.t(this.f41539i)) + ')';
    }

    public /* synthetic */ w(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, jo.h hVar) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, (i11 & 256) != 0 ? j0.f41449a.d() : i10, (i11 & 512) != 0 ? b1.f.f16721b.c() : j15, (jo.h) null);
    }

    public w(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, List<e> list, long j15) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15, (jo.h) null);
        this.f41540j = list;
    }
}
