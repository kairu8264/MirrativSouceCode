package uo;

/* loaded from: classes4.dex */
public final class d3 {

    /* renamed from: a  reason: collision with root package name */
    public static final d3 f56003a = new d3();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<m1> f56004b = new ThreadLocal<>();

    public final m1 a() {
        return f56004b.get();
    }

    public final m1 b() {
        ThreadLocal<m1> threadLocal = f56004b;
        m1 m1Var = threadLocal.get();
        if (m1Var == null) {
            m1 a10 = p1.a();
            threadLocal.set(a10);
            return a10;
        }
        return m1Var;
    }

    public final void c() {
        f56004b.set(null);
    }

    public final void d(m1 m1Var) {
        f56004b.set(m1Var);
    }
}
