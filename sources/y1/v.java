package y1;

import c1.f1;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final j2.h f61173a;

    /* renamed from: b  reason: collision with root package name */
    public final long f61174b;

    /* renamed from: c  reason: collision with root package name */
    public final d2.x f61175c;

    /* renamed from: d  reason: collision with root package name */
    public final d2.u f61176d;

    /* renamed from: e  reason: collision with root package name */
    public final d2.v f61177e;

    /* renamed from: f  reason: collision with root package name */
    public final d2.l f61178f;

    /* renamed from: g  reason: collision with root package name */
    public final String f61179g;

    /* renamed from: h  reason: collision with root package name */
    public final long f61180h;

    /* renamed from: i  reason: collision with root package name */
    public final j2.a f61181i;

    /* renamed from: j  reason: collision with root package name */
    public final j2.i f61182j;

    /* renamed from: k  reason: collision with root package name */
    public final f2.f f61183k;

    /* renamed from: l  reason: collision with root package name */
    public final long f61184l;

    /* renamed from: m  reason: collision with root package name */
    public final j2.f f61185m;

    /* renamed from: n  reason: collision with root package name */
    public final f1 f61186n;

    /* renamed from: o  reason: collision with root package name */
    public final s f61187o;

    public /* synthetic */ v(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, jo.h hVar) {
        this(j10, j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var);
    }

    public /* synthetic */ v(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, s sVar, jo.h hVar) {
        this(j10, j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var, sVar);
    }

    public v(j2.h hVar, long j10, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j11, j2.a aVar, j2.i iVar, f2.f fVar, long j12, j2.f fVar2, f1 f1Var, s sVar) {
        this.f61173a = hVar;
        this.f61174b = j10;
        this.f61175c = xVar;
        this.f61176d = uVar;
        this.f61177e = vVar;
        this.f61178f = lVar;
        this.f61179g = str;
        this.f61180h = j11;
        this.f61181i = aVar;
        this.f61182j = iVar;
        this.f61183k = fVar;
        this.f61184l = j12;
        this.f61185m = fVar2;
        this.f61186n = f1Var;
    }

    public /* synthetic */ v(j2.h hVar, long j10, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j11, j2.a aVar, j2.i iVar, f2.f fVar, long j12, j2.f fVar2, f1 f1Var, s sVar, jo.h hVar2) {
        this(hVar, j10, xVar, uVar, vVar, lVar, str, j11, aVar, iVar, fVar, j12, fVar2, f1Var, sVar);
    }

    public final v a(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var) {
        return new v(c1.c0.m(j10, f()) ? this.f61173a : j2.h.f37095a.a(j10), j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var, this.f61187o, (jo.h) null);
    }

    public final long c() {
        return this.f61184l;
    }

    public final j2.a d() {
        return this.f61181i;
    }

    public final c1.u e() {
        return this.f61173a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return t(vVar) && u(vVar);
        }
        return false;
    }

    public final long f() {
        return this.f61173a.a();
    }

    public final d2.l g() {
        return this.f61178f;
    }

    public final String h() {
        return this.f61179g;
    }

    public int hashCode() {
        int s10 = c1.c0.s(f()) * 31;
        c1.u e10 = e();
        int hashCode = (((s10 + (e10 != null ? e10.hashCode() : 0)) * 31) + m2.r.i(this.f61174b)) * 31;
        d2.x xVar = this.f61175c;
        int hashCode2 = (hashCode + (xVar != null ? xVar.hashCode() : 0)) * 31;
        d2.u uVar = this.f61176d;
        int g10 = (hashCode2 + (uVar != null ? d2.u.g(uVar.i()) : 0)) * 31;
        d2.v vVar = this.f61177e;
        int i10 = (g10 + (vVar != null ? d2.v.i(vVar.m()) : 0)) * 31;
        d2.l lVar = this.f61178f;
        int hashCode3 = (i10 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        String str = this.f61179g;
        int hashCode4 = (((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + m2.r.i(this.f61180h)) * 31;
        j2.a aVar = this.f61181i;
        int f10 = (hashCode4 + (aVar != null ? j2.a.f(aVar.h()) : 0)) * 31;
        j2.i iVar = this.f61182j;
        int hashCode5 = (f10 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        f2.f fVar = this.f61183k;
        int hashCode6 = (((hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31) + c1.c0.s(this.f61184l)) * 31;
        j2.f fVar2 = this.f61185m;
        int hashCode7 = (hashCode6 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        f1 f1Var = this.f61186n;
        return ((hashCode7 + (f1Var != null ? f1Var.hashCode() : 0)) * 31) + 0;
    }

    public final long i() {
        return this.f61174b;
    }

    public final d2.u j() {
        return this.f61176d;
    }

    public final d2.v k() {
        return this.f61177e;
    }

    public final d2.x l() {
        return this.f61175c;
    }

    public final long m() {
        return this.f61180h;
    }

    public final f2.f n() {
        return this.f61183k;
    }

    public final s o() {
        return this.f61187o;
    }

    public final f1 p() {
        return this.f61186n;
    }

    public final j2.f q() {
        return this.f61185m;
    }

    public final j2.h r() {
        return this.f61173a;
    }

    public final j2.i s() {
        return this.f61182j;
    }

    public final boolean t(v vVar) {
        jo.p.h(vVar, "other");
        if (this == vVar) {
            return true;
        }
        return m2.r.e(this.f61174b, vVar.f61174b) && jo.p.c(this.f61175c, vVar.f61175c) && jo.p.c(this.f61176d, vVar.f61176d) && jo.p.c(this.f61177e, vVar.f61177e) && jo.p.c(this.f61178f, vVar.f61178f) && jo.p.c(this.f61179g, vVar.f61179g) && m2.r.e(this.f61180h, vVar.f61180h) && jo.p.c(this.f61181i, vVar.f61181i) && jo.p.c(this.f61182j, vVar.f61182j) && jo.p.c(this.f61183k, vVar.f61183k) && c1.c0.m(this.f61184l, vVar.f61184l) && jo.p.c(this.f61187o, vVar.f61187o);
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) c1.c0.t(f())) + ", brush=" + e() + ", fontSize=" + ((Object) m2.r.j(this.f61174b)) + ", fontWeight=" + this.f61175c + ", fontStyle=" + this.f61176d + ", fontSynthesis=" + this.f61177e + ", fontFamily=" + this.f61178f + ", fontFeatureSettings=" + this.f61179g + ", letterSpacing=" + ((Object) m2.r.j(this.f61180h)) + ", baselineShift=" + this.f61181i + ", textGeometricTransform=" + this.f61182j + ", localeList=" + this.f61183k + ", background=" + ((Object) c1.c0.t(this.f61184l)) + ", textDecoration=" + this.f61185m + ", shadow=" + this.f61186n + ", platformStyle=" + this.f61187o + ')';
    }

    public final boolean u(v vVar) {
        return jo.p.c(this.f61173a, vVar.f61173a) && jo.p.c(this.f61185m, vVar.f61185m) && jo.p.c(this.f61186n, vVar.f61186n);
    }

    public final v v(v vVar) {
        long j10;
        if (vVar == null) {
            return this;
        }
        j2.h c10 = this.f61173a.c(vVar.f61173a);
        d2.l lVar = vVar.f61178f;
        if (lVar == null) {
            lVar = this.f61178f;
        }
        d2.l lVar2 = lVar;
        long j11 = !m2.s.e(vVar.f61174b) ? vVar.f61174b : this.f61174b;
        d2.x xVar = vVar.f61175c;
        if (xVar == null) {
            xVar = this.f61175c;
        }
        d2.x xVar2 = xVar;
        d2.u uVar = vVar.f61176d;
        if (uVar == null) {
            uVar = this.f61176d;
        }
        d2.u uVar2 = uVar;
        d2.v vVar2 = vVar.f61177e;
        if (vVar2 == null) {
            vVar2 = this.f61177e;
        }
        d2.v vVar3 = vVar2;
        String str = vVar.f61179g;
        if (str == null) {
            str = this.f61179g;
        }
        String str2 = str;
        if (!m2.s.e(vVar.f61180h)) {
            j10 = vVar.f61180h;
        } else {
            j10 = this.f61180h;
        }
        long j12 = j10;
        j2.a aVar = vVar.f61181i;
        if (aVar == null) {
            aVar = this.f61181i;
        }
        j2.a aVar2 = aVar;
        j2.i iVar = vVar.f61182j;
        if (iVar == null) {
            iVar = this.f61182j;
        }
        j2.i iVar2 = iVar;
        f2.f fVar = vVar.f61183k;
        if (fVar == null) {
            fVar = this.f61183k;
        }
        f2.f fVar2 = fVar;
        long j13 = vVar.f61184l;
        if (!(j13 != c1.c0.f18634b.e())) {
            j13 = this.f61184l;
        }
        long j14 = j13;
        j2.f fVar3 = vVar.f61185m;
        if (fVar3 == null) {
            fVar3 = this.f61185m;
        }
        j2.f fVar4 = fVar3;
        f1 f1Var = vVar.f61186n;
        if (f1Var == null) {
            f1Var = this.f61186n;
        }
        return new v(c10, j11, xVar2, uVar2, vVar3, lVar2, str2, j12, aVar2, iVar2, fVar2, j14, fVar4, f1Var, w(vVar.f61187o), (jo.h) null);
    }

    public final s w(s sVar) {
        return sVar;
    }

    public /* synthetic */ v(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? c1.c0.f18634b.e() : j10, (i10 & 2) != 0 ? m2.r.f40540b.a() : j11, (i10 & 4) != 0 ? null : xVar, (i10 & 8) != 0 ? null : uVar, (i10 & 16) != 0 ? null : vVar, (i10 & 32) != 0 ? null : lVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? m2.r.f40540b.a() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : iVar, (i10 & 1024) != 0 ? null : fVar, (i10 & 2048) != 0 ? c1.c0.f18634b.e() : j13, (i10 & 4096) != 0 ? null : fVar2, (i10 & 8192) != 0 ? null : f1Var, (jo.h) null);
    }

    public v(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var) {
        this(j2.h.f37095a.a(j10), j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var, (s) null, (jo.h) null);
    }

    public v(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, s sVar) {
        this(j2.h.f37095a.a(j10), j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var, sVar, (jo.h) null);
    }
}
