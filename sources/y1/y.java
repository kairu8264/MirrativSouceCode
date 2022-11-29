package y1;

import d2.k;
import d2.l;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final a f61193a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f61194b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a.b<p>> f61195c;

    /* renamed from: d  reason: collision with root package name */
    public final int f61196d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f61197e;

    /* renamed from: f  reason: collision with root package name */
    public final int f61198f;

    /* renamed from: g  reason: collision with root package name */
    public final m2.d f61199g;

    /* renamed from: h  reason: collision with root package name */
    public final m2.q f61200h;

    /* renamed from: i  reason: collision with root package name */
    public final l.b f61201i;

    /* renamed from: j  reason: collision with root package name */
    public final long f61202j;

    /* renamed from: k  reason: collision with root package name */
    public k.a f61203k;

    public y(a aVar, d0 d0Var, List<a.b<p>> list, int i10, boolean z10, int i11, m2.d dVar, m2.q qVar, k.a aVar2, l.b bVar, long j10) {
        this.f61193a = aVar;
        this.f61194b = d0Var;
        this.f61195c = list;
        this.f61196d = i10;
        this.f61197e = z10;
        this.f61198f = i11;
        this.f61199g = dVar;
        this.f61200h = qVar;
        this.f61201i = bVar;
        this.f61202j = j10;
        this.f61203k = aVar2;
    }

    public /* synthetic */ y(a aVar, d0 d0Var, List list, int i10, boolean z10, int i11, m2.d dVar, m2.q qVar, l.b bVar, long j10, jo.h hVar) {
        this(aVar, d0Var, list, i10, z10, i11, dVar, qVar, bVar, j10);
    }

    public final long a() {
        return this.f61202j;
    }

    public final m2.d b() {
        return this.f61199g;
    }

    public final l.b c() {
        return this.f61201i;
    }

    public final m2.q d() {
        return this.f61200h;
    }

    public final int e() {
        return this.f61196d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return jo.p.c(this.f61193a, yVar.f61193a) && jo.p.c(this.f61194b, yVar.f61194b) && jo.p.c(this.f61195c, yVar.f61195c) && this.f61196d == yVar.f61196d && this.f61197e == yVar.f61197e && j2.k.d(this.f61198f, yVar.f61198f) && jo.p.c(this.f61199g, yVar.f61199g) && this.f61200h == yVar.f61200h && jo.p.c(this.f61201i, yVar.f61201i) && m2.b.g(this.f61202j, yVar.f61202j);
        }
        return false;
    }

    public final int f() {
        return this.f61198f;
    }

    public final List<a.b<p>> g() {
        return this.f61195c;
    }

    public final boolean h() {
        return this.f61197e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f61193a.hashCode() * 31) + this.f61194b.hashCode()) * 31) + this.f61195c.hashCode()) * 31) + this.f61196d) * 31) + Boolean.hashCode(this.f61197e)) * 31) + j2.k.e(this.f61198f)) * 31) + this.f61199g.hashCode()) * 31) + this.f61200h.hashCode()) * 31) + this.f61201i.hashCode()) * 31) + m2.b.q(this.f61202j);
    }

    public final d0 i() {
        return this.f61194b;
    }

    public final a j() {
        return this.f61193a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f61193a) + ", style=" + this.f61194b + ", placeholders=" + this.f61195c + ", maxLines=" + this.f61196d + ", softWrap=" + this.f61197e + ", overflow=" + ((Object) j2.k.f(this.f61198f)) + ", density=" + this.f61199g + ", layoutDirection=" + this.f61200h + ", fontFamilyResolver=" + this.f61201i + ", constraints=" + ((Object) m2.b.s(this.f61202j)) + ')';
    }

    public y(a aVar, d0 d0Var, List<a.b<p>> list, int i10, boolean z10, int i11, m2.d dVar, m2.q qVar, l.b bVar, long j10) {
        this(aVar, d0Var, list, i10, z10, i11, dVar, qVar, (k.a) null, bVar, j10);
    }
}
