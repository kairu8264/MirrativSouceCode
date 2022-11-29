package ai;

/* loaded from: classes3.dex */
public final class t23<V> implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final a33<V> f10078w;

    /* renamed from: x  reason: collision with root package name */
    public final s43<? extends V> f10079x;

    public t23(a33<V> a33Var, s43<? extends V> s43Var) {
        this.f10078w = a33Var;
        this.f10079x = s43Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object g10;
        m23 m23Var;
        obj = this.f10078w.f1719w;
        if (obj != this) {
            return;
        }
        g10 = a33.g(this.f10079x);
        m23Var = a33.B;
        if (m23Var.e(this.f10078w, this, g10)) {
            a33.B(this.f10078w);
        }
    }
}
