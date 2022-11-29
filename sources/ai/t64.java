package ai;

/* loaded from: classes3.dex */
public class t64 {

    /* renamed from: a  reason: collision with root package name */
    public int f10167a;

    public void a() {
        this.f10167a = 0;
    }

    public final boolean b() {
        return h(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return h(4);
    }

    public final boolean d() {
        return h(1);
    }

    public final boolean e() {
        return h(268435456);
    }

    public final void f(int i10) {
        this.f10167a = i10;
    }

    public final void g(int i10) {
        this.f10167a |= Integer.MIN_VALUE;
    }

    public final boolean h(int i10) {
        return (this.f10167a & i10) == i10;
    }
}
