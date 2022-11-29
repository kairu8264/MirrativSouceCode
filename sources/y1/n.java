package y1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final j2.e f61099a;

    /* renamed from: b  reason: collision with root package name */
    public final j2.g f61100b;

    /* renamed from: c  reason: collision with root package name */
    public final long f61101c;

    /* renamed from: d  reason: collision with root package name */
    public final j2.j f61102d;

    /* renamed from: e  reason: collision with root package name */
    public final r f61103e;

    /* renamed from: f  reason: collision with root package name */
    public final j2.c f61104f;

    public /* synthetic */ n(j2.e eVar, j2.g gVar, long j10, j2.j jVar, jo.h hVar) {
        this(eVar, gVar, j10, jVar);
    }

    public n(j2.e eVar, j2.g gVar, long j10, j2.j jVar, r rVar, j2.c cVar) {
        this.f61099a = eVar;
        this.f61100b = gVar;
        this.f61101c = j10;
        this.f61102d = jVar;
        this.f61104f = cVar;
        if (m2.r.e(j10, m2.r.f40540b.a())) {
            return;
        }
        if (m2.r.h(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + m2.r.h(j10) + ')').toString());
    }

    public /* synthetic */ n(j2.e eVar, j2.g gVar, long j10, j2.j jVar, r rVar, j2.c cVar, jo.h hVar) {
        this(eVar, gVar, j10, jVar, rVar, cVar);
    }

    public static /* synthetic */ n b(n nVar, j2.e eVar, j2.g gVar, long j10, j2.j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = nVar.f61099a;
        }
        if ((i10 & 2) != 0) {
            gVar = nVar.f61100b;
        }
        j2.g gVar2 = gVar;
        if ((i10 & 4) != 0) {
            j10 = nVar.f61101c;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            jVar = nVar.f61102d;
        }
        return nVar.a(eVar, gVar2, j11, jVar);
    }

    public final n a(j2.e eVar, j2.g gVar, long j10, j2.j jVar) {
        return new n(eVar, gVar, j10, jVar, this.f61103e, this.f61104f, null);
    }

    public final long c() {
        return this.f61101c;
    }

    public final j2.c d() {
        return this.f61104f;
    }

    public final r e() {
        return this.f61103e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return jo.p.c(this.f61099a, nVar.f61099a) && jo.p.c(this.f61100b, nVar.f61100b) && m2.r.e(this.f61101c, nVar.f61101c) && jo.p.c(this.f61102d, nVar.f61102d) && jo.p.c(this.f61103e, nVar.f61103e) && jo.p.c(this.f61104f, nVar.f61104f);
        }
        return false;
    }

    public final j2.e f() {
        return this.f61099a;
    }

    public final j2.g g() {
        return this.f61100b;
    }

    public final j2.j h() {
        return this.f61102d;
    }

    public int hashCode() {
        j2.e eVar = this.f61099a;
        int k10 = (eVar != null ? j2.e.k(eVar.m()) : 0) * 31;
        j2.g gVar = this.f61100b;
        int j10 = (((k10 + (gVar != null ? j2.g.j(gVar.l()) : 0)) * 31) + m2.r.i(this.f61101c)) * 31;
        j2.j jVar = this.f61102d;
        int hashCode = (((j10 + (jVar != null ? jVar.hashCode() : 0)) * 31) + 0) * 31;
        j2.c cVar = this.f61104f;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final n i(n nVar) {
        long j10;
        if (nVar == null) {
            return this;
        }
        if (m2.s.e(nVar.f61101c)) {
            j10 = this.f61101c;
        } else {
            j10 = nVar.f61101c;
        }
        long j11 = j10;
        j2.j jVar = nVar.f61102d;
        if (jVar == null) {
            jVar = this.f61102d;
        }
        j2.j jVar2 = jVar;
        j2.e eVar = nVar.f61099a;
        if (eVar == null) {
            eVar = this.f61099a;
        }
        j2.e eVar2 = eVar;
        j2.g gVar = nVar.f61100b;
        if (gVar == null) {
            gVar = this.f61100b;
        }
        j2.g gVar2 = gVar;
        r j12 = j(nVar.f61103e);
        j2.c cVar = nVar.f61104f;
        if (cVar == null) {
            cVar = this.f61104f;
        }
        return new n(eVar2, gVar2, j11, jVar2, j12, cVar, null);
    }

    public final r j(r rVar) {
        return rVar;
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.f61099a + ", textDirection=" + this.f61100b + ", lineHeight=" + ((Object) m2.r.j(this.f61101c)) + ", textIndent=" + this.f61102d + ", platformStyle=" + this.f61103e + ", lineHeightStyle=" + this.f61104f + ')';
    }

    public n(j2.e eVar, j2.g gVar, long j10, j2.j jVar) {
        this(eVar, gVar, j10, jVar, null, null, null);
    }
}
