package n1;

import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final long f41550a;

    /* renamed from: b  reason: collision with root package name */
    public final long f41551b;

    /* renamed from: c  reason: collision with root package name */
    public final long f41552c;

    /* renamed from: d  reason: collision with root package name */
    public final long f41553d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f41554e;

    /* renamed from: f  reason: collision with root package name */
    public final int f41555f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f41556g;

    /* renamed from: h  reason: collision with root package name */
    public final List<e> f41557h;

    /* renamed from: i  reason: collision with root package name */
    public final long f41558i;

    public z(long j10, long j11, long j12, long j13, boolean z10, int i10, boolean z11, List<e> list, long j14) {
        this.f41550a = j10;
        this.f41551b = j11;
        this.f41552c = j12;
        this.f41553d = j13;
        this.f41554e = z10;
        this.f41555f = i10;
        this.f41556g = z11;
        this.f41557h = list;
        this.f41558i = j14;
    }

    public /* synthetic */ z(long j10, long j11, long j12, long j13, boolean z10, int i10, boolean z11, List list, long j14, jo.h hVar) {
        this(j10, j11, j12, j13, z10, i10, z11, list, j14);
    }

    public final boolean a() {
        return this.f41554e;
    }

    public final List<e> b() {
        return this.f41557h;
    }

    public final long c() {
        return this.f41550a;
    }

    public final boolean d() {
        return this.f41556g;
    }

    public final long e() {
        return this.f41553d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return v.d(this.f41550a, zVar.f41550a) && this.f41551b == zVar.f41551b && b1.f.j(this.f41552c, zVar.f41552c) && b1.f.j(this.f41553d, zVar.f41553d) && this.f41554e == zVar.f41554e && j0.g(this.f41555f, zVar.f41555f) && this.f41556g == zVar.f41556g && jo.p.c(this.f41557h, zVar.f41557h) && b1.f.j(this.f41558i, zVar.f41558i);
        }
        return false;
    }

    public final long f() {
        return this.f41552c;
    }

    public final long g() {
        return this.f41558i;
    }

    public final int h() {
        return this.f41555f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int e10 = ((((((v.e(this.f41550a) * 31) + Long.hashCode(this.f41551b)) * 31) + b1.f.o(this.f41552c)) * 31) + b1.f.o(this.f41553d)) * 31;
        boolean z10 = this.f41554e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int h10 = (((e10 + i10) * 31) + j0.h(this.f41555f)) * 31;
        boolean z11 = this.f41556g;
        return ((((h10 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.f41557h.hashCode()) * 31) + b1.f.o(this.f41558i);
    }

    public final long i() {
        return this.f41551b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) v.f(this.f41550a)) + ", uptime=" + this.f41551b + ", positionOnScreen=" + ((Object) b1.f.t(this.f41552c)) + ", position=" + ((Object) b1.f.t(this.f41553d)) + ", down=" + this.f41554e + ", type=" + ((Object) j0.i(this.f41555f)) + ", issuesEnterExit=" + this.f41556g + ", historical=" + this.f41557h + ", scrollDelta=" + ((Object) b1.f.t(this.f41558i)) + ')';
    }
}
