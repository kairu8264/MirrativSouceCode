package y1;

import c1.f1;
import com.google.android.exoplayer2.C;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: d */
    public static final a f61075d = new a(null);

    /* renamed from: e */
    public static final d0 f61076e = new d0(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, 262143, null);

    /* renamed from: a */
    public final v f61077a;

    /* renamed from: b */
    public final n f61078b;

    /* renamed from: c */
    public final t f61079c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a() {
            return d0.f61076e;
        }
    }

    public /* synthetic */ d0(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, j2.e eVar, j2.g gVar, long j14, j2.j jVar, jo.h hVar) {
        this(j10, j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var, eVar, gVar, j14, jVar);
    }

    public d0(v vVar, n nVar, t tVar) {
        jo.p.h(vVar, "spanStyle");
        jo.p.h(nVar, "paragraphStyle");
        this.f61077a = vVar;
        this.f61078b = nVar;
        this.f61079c = tVar;
    }

    public static /* synthetic */ d0 c(d0 d0Var, long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, j2.e eVar, j2.g gVar, long j14, j2.j jVar, int i10, Object obj) {
        return d0Var.b((i10 & 1) != 0 ? d0Var.f61077a.f() : j10, (i10 & 2) != 0 ? d0Var.f61077a.i() : j11, (i10 & 4) != 0 ? d0Var.f61077a.l() : xVar, (i10 & 8) != 0 ? d0Var.f61077a.j() : uVar, (i10 & 16) != 0 ? d0Var.f61077a.k() : vVar, (i10 & 32) != 0 ? d0Var.f61077a.g() : lVar, (i10 & 64) != 0 ? d0Var.f61077a.h() : str, (i10 & 128) != 0 ? d0Var.f61077a.m() : j12, (i10 & 256) != 0 ? d0Var.f61077a.d() : aVar, (i10 & 512) != 0 ? d0Var.f61077a.s() : iVar, (i10 & 1024) != 0 ? d0Var.f61077a.n() : fVar, (i10 & 2048) != 0 ? d0Var.f61077a.c() : j13, (i10 & 4096) != 0 ? d0Var.f61077a.q() : fVar2, (i10 & 8192) != 0 ? d0Var.f61077a.p() : f1Var, (i10 & 16384) != 0 ? d0Var.f61078b.f() : eVar, (i10 & 32768) != 0 ? d0Var.f61078b.g() : gVar, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? d0Var.f61078b.c() : j14, (i10 & 131072) != 0 ? d0Var.f61078b.h() : jVar);
    }

    public final boolean A(d0 d0Var) {
        jo.p.h(d0Var, "other");
        return this == d0Var || (jo.p.c(this.f61078b, d0Var.f61078b) && this.f61077a.t(d0Var.f61077a));
    }

    public final d0 B(n nVar) {
        jo.p.h(nVar, "other");
        return new d0(E(), D().i(nVar));
    }

    public final d0 C(d0 d0Var) {
        return (d0Var == null || jo.p.c(d0Var, f61076e)) ? this : new d0(E().v(d0Var.E()), D().i(d0Var.D()));
    }

    public final n D() {
        return this.f61078b;
    }

    public final v E() {
        return this.f61077a;
    }

    public final d0 b(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, j2.e eVar, j2.g gVar, long j14, j2.j jVar) {
        j2.h a10;
        if (c1.c0.m(j10, this.f61077a.f())) {
            a10 = this.f61077a.r();
        } else {
            a10 = j2.h.f37095a.a(j10);
        }
        return new d0(new v(a10, j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var, this.f61077a.o(), (jo.h) null), new n(eVar, gVar, j14, jVar, this.f61078b.e(), p(), null), this.f61079c);
    }

    public final long d() {
        return this.f61077a.c();
    }

    public final j2.a e() {
        return this.f61077a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return jo.p.c(this.f61077a, d0Var.f61077a) && jo.p.c(this.f61078b, d0Var.f61078b) && jo.p.c(this.f61079c, d0Var.f61079c);
        }
        return false;
    }

    public final c1.u f() {
        return this.f61077a.e();
    }

    public final long g() {
        return this.f61077a.f();
    }

    public final d2.l h() {
        return this.f61077a.g();
    }

    public int hashCode() {
        int hashCode = ((this.f61077a.hashCode() * 31) + this.f61078b.hashCode()) * 31;
        t tVar = this.f61079c;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String i() {
        return this.f61077a.h();
    }

    public final long j() {
        return this.f61077a.i();
    }

    public final d2.u k() {
        return this.f61077a.j();
    }

    public final d2.v l() {
        return this.f61077a.k();
    }

    public final d2.x m() {
        return this.f61077a.l();
    }

    public final long n() {
        return this.f61077a.m();
    }

    public final long o() {
        return this.f61078b.c();
    }

    public final j2.c p() {
        return this.f61078b.d();
    }

    public final f2.f q() {
        return this.f61077a.n();
    }

    public final n r() {
        return this.f61078b;
    }

    public final t s() {
        return this.f61079c;
    }

    public final f1 t() {
        return this.f61077a.p();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) c1.c0.t(g())) + ", brush=" + f() + ", fontSize=" + ((Object) m2.r.j(j())) + ", fontWeight=" + m() + ", fontStyle=" + k() + ", fontSynthesis=" + l() + ", fontFamily=" + h() + ", fontFeatureSettings=" + i() + ", letterSpacing=" + ((Object) m2.r.j(n())) + ", baselineShift=" + e() + ", textGeometricTransform=" + y() + ", localeList=" + q() + ", background=" + ((Object) c1.c0.t(d())) + ", textDecoration=" + w() + ", shadow=" + t() + ", textAlign=" + v() + ", textDirection=" + x() + ", lineHeight=" + ((Object) m2.r.j(o())) + ", textIndent=" + z() + ", platformStyle=" + this.f61079c + "lineHeightStyle=" + p() + ')';
    }

    public final v u() {
        return this.f61077a;
    }

    public final j2.e v() {
        return this.f61078b.f();
    }

    public final j2.f w() {
        return this.f61077a.q();
    }

    public final j2.g x() {
        return this.f61078b.g();
    }

    public final j2.i y() {
        return this.f61077a.s();
    }

    public final j2.j z() {
        return this.f61078b.h();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(y1.v r3, y1.n r4) {
        /*
            r2 = this;
            java.lang.String r0 = "spanStyle"
            jo.p.h(r3, r0)
            java.lang.String r0 = "paragraphStyle"
            jo.p.h(r4, r0)
            y1.s r0 = r3.o()
            y1.r r1 = r4.e()
            y1.t r0 = y1.e0.a(r0, r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.d0.<init>(y1.v, y1.n):void");
    }

    public /* synthetic */ d0(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, j2.e eVar, j2.g gVar, long j14, j2.j jVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? c1.c0.f18634b.e() : j10, (i10 & 2) != 0 ? m2.r.f40540b.a() : j11, (i10 & 4) != 0 ? null : xVar, (i10 & 8) != 0 ? null : uVar, (i10 & 16) != 0 ? null : vVar, (i10 & 32) != 0 ? null : lVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? m2.r.f40540b.a() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : iVar, (i10 & 1024) != 0 ? null : fVar, (i10 & 2048) != 0 ? c1.c0.f18634b.e() : j13, (i10 & 4096) != 0 ? null : fVar2, (i10 & 8192) != 0 ? null : f1Var, (i10 & 16384) != 0 ? null : eVar, (i10 & 32768) != 0 ? null : gVar, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? m2.r.f40540b.a() : j14, (i10 & 131072) != 0 ? null : jVar, null);
    }

    public d0(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, f1 f1Var, j2.e eVar, j2.g gVar, long j14, j2.j jVar) {
        this(new v(j10, j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var, (s) null, (jo.h) null), new n(eVar, gVar, j14, jVar, null, null, null), null);
    }
}
