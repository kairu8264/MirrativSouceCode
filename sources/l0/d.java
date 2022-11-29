package l0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f38968a;

    public d(int i10) {
        this.f38968a = i10;
    }

    public final int a() {
        return this.f38968a;
    }

    public final boolean b() {
        return this.f38968a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f38968a = i10;
    }

    public final int d(p1 p1Var) {
        jo.p.h(p1Var, "slots");
        return p1Var.d(this);
    }

    public final int e(r1 r1Var) {
        jo.p.h(r1Var, "writer");
        return r1Var.B(this);
    }
}
