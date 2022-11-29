package y;

/* loaded from: classes.dex */
public final class u0 implements t0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f60977a;

    /* renamed from: b  reason: collision with root package name */
    public final float f60978b;

    /* renamed from: c  reason: collision with root package name */
    public final float f60979c;

    /* renamed from: d  reason: collision with root package name */
    public final float f60980d;

    public u0(float f10, float f11, float f12, float f13) {
        this.f60977a = f10;
        this.f60978b = f11;
        this.f60979c = f12;
        this.f60980d = f13;
    }

    public /* synthetic */ u0(float f10, float f11, float f12, float f13, jo.h hVar) {
        this(f10, f11, f12, f13);
    }

    @Override // y.t0
    public float a() {
        return this.f60980d;
    }

    @Override // y.t0
    public float b(m2.q qVar) {
        jo.p.h(qVar, "layoutDirection");
        return qVar == m2.q.Ltr ? this.f60977a : this.f60979c;
    }

    @Override // y.t0
    public float c(m2.q qVar) {
        jo.p.h(qVar, "layoutDirection");
        return qVar == m2.q.Ltr ? this.f60979c : this.f60977a;
    }

    @Override // y.t0
    public float d() {
        return this.f60978b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return m2.g.n(this.f60977a, u0Var.f60977a) && m2.g.n(this.f60978b, u0Var.f60978b) && m2.g.n(this.f60979c, u0Var.f60979c) && m2.g.n(this.f60980d, u0Var.f60980d);
        }
        return false;
    }

    public int hashCode() {
        return (((((m2.g.o(this.f60977a) * 31) + m2.g.o(this.f60978b)) * 31) + m2.g.o(this.f60979c)) * 31) + m2.g.o(this.f60980d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) m2.g.p(this.f60977a)) + ", top=" + ((Object) m2.g.p(this.f60978b)) + ", end=" + ((Object) m2.g.p(this.f60979c)) + ", bottom=" + ((Object) m2.g.p(this.f60980d)) + ')';
    }
}
