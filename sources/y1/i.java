package y1;

import c1.u0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final h f61089a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61090b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61091c;

    /* renamed from: d  reason: collision with root package name */
    public int f61092d;

    /* renamed from: e  reason: collision with root package name */
    public int f61093e;

    /* renamed from: f  reason: collision with root package name */
    public float f61094f;

    /* renamed from: g  reason: collision with root package name */
    public float f61095g;

    public i(h hVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        jo.p.h(hVar, "paragraph");
        this.f61089a = hVar;
        this.f61090b = i10;
        this.f61091c = i11;
        this.f61092d = i12;
        this.f61093e = i13;
        this.f61094f = f10;
        this.f61095g = f11;
    }

    public final float a() {
        return this.f61095g;
    }

    public final int b() {
        return this.f61091c;
    }

    public final int c() {
        return this.f61093e;
    }

    public final int d() {
        return this.f61091c - this.f61090b;
    }

    public final h e() {
        return this.f61089a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return jo.p.c(this.f61089a, iVar.f61089a) && this.f61090b == iVar.f61090b && this.f61091c == iVar.f61091c && this.f61092d == iVar.f61092d && this.f61093e == iVar.f61093e && jo.p.c(Float.valueOf(this.f61094f), Float.valueOf(iVar.f61094f)) && jo.p.c(Float.valueOf(this.f61095g), Float.valueOf(iVar.f61095g));
        }
        return false;
    }

    public final int f() {
        return this.f61090b;
    }

    public final int g() {
        return this.f61092d;
    }

    public final float h() {
        return this.f61094f;
    }

    public int hashCode() {
        return (((((((((((this.f61089a.hashCode() * 31) + Integer.hashCode(this.f61090b)) * 31) + Integer.hashCode(this.f61091c)) * 31) + Integer.hashCode(this.f61092d)) * 31) + Integer.hashCode(this.f61093e)) * 31) + Float.hashCode(this.f61094f)) * 31) + Float.hashCode(this.f61095g);
    }

    public final b1.h i(b1.h hVar) {
        jo.p.h(hVar, "<this>");
        return hVar.r(b1.g.a(0.0f, this.f61094f));
    }

    public final u0 j(u0 u0Var) {
        jo.p.h(u0Var, "<this>");
        u0Var.k(b1.g.a(0.0f, this.f61094f));
        return u0Var;
    }

    public final long k(long j10) {
        return c0.b(l(b0.n(j10)), l(b0.i(j10)));
    }

    public final int l(int i10) {
        return i10 + this.f61090b;
    }

    public final int m(int i10) {
        return i10 + this.f61092d;
    }

    public final float n(float f10) {
        return f10 + this.f61094f;
    }

    public final long o(long j10) {
        return b1.g.a(b1.f.m(j10), b1.f.n(j10) - this.f61094f);
    }

    public final int p(int i10) {
        return po.n.m(i10, this.f61090b, this.f61091c) - this.f61090b;
    }

    public final int q(int i10) {
        return i10 - this.f61092d;
    }

    public final float r(float f10) {
        return f10 - this.f61094f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f61089a + ", startIndex=" + this.f61090b + ", endIndex=" + this.f61091c + ", startLineIndex=" + this.f61092d + ", endLineIndex=" + this.f61093e + ", top=" + this.f61094f + ", bottom=" + this.f61095g + ')';
    }
}
