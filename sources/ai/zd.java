package ai;

/* loaded from: classes3.dex */
public class zd {

    /* renamed from: a  reason: collision with root package name */
    public int f12940a;

    public void a() {
        this.f12940a = 0;
    }

    public final boolean b() {
        return g(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return g(4);
    }

    public final boolean d() {
        return g(1);
    }

    public final void e(int i10) {
        this.f12940a = i10;
    }

    public final void f(int i10) {
        this.f12940a |= Integer.MIN_VALUE;
    }

    public final boolean g(int i10) {
        return (this.f12940a & i10) == i10;
    }
}
