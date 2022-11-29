package uo;

/* loaded from: classes4.dex */
public final class w1 implements x1 {

    /* renamed from: w  reason: collision with root package name */
    public final p2 f56094w;

    public w1(p2 p2Var) {
        this.f56094w = p2Var;
    }

    @Override // uo.x1
    public p2 f() {
        return this.f56094w;
    }

    @Override // uo.x1
    public boolean isActive() {
        return false;
    }

    public String toString() {
        return u0.c() ? f().U("New") : super.toString();
    }
}
