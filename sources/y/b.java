package y;

/* loaded from: classes.dex */
public final class b extends androidx.compose.ui.platform.d1 implements q1.x {

    /* renamed from: x  reason: collision with root package name */
    public final q1.a f60677x;

    /* renamed from: y  reason: collision with root package name */
    public final float f60678y;

    /* renamed from: z  reason: collision with root package name */
    public final float f60679z;

    public b(q1.a aVar, float f10, float f11, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        this.f60677x = aVar;
        this.f60678y = f10;
        this.f60679z = f11;
        if (!((f10 >= 0.0f || m2.g.n(f10, m2.g.f40516x.b())) && (f11 >= 0.0f || m2.g.n(f11, m2.g.f40516x.b())))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public /* synthetic */ b(q1.a aVar, float f10, float f11, io.l lVar, jo.h hVar) {
        this(aVar, f10, f11, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar == null) {
            return false;
        }
        return jo.p.c(this.f60677x, bVar.f60677x) && m2.g.n(this.f60678y, bVar.f60678y) && m2.g.n(this.f60679z, bVar.f60679z);
    }

    public int hashCode() {
        return (((this.f60677x.hashCode() * 31) + m2.g.o(this.f60678y)) * 31) + m2.g.o(this.f60679z);
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        return a.a(e0Var, this.f60677x, this.f60678y, this.f60679z, b0Var, j10);
    }

    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.f60677x + ", before=" + ((Object) m2.g.p(this.f60678y)) + ", after=" + ((Object) m2.g.p(this.f60679z)) + ')';
    }
}
