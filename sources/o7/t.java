package o7;

import j8.a;

/* loaded from: classes.dex */
public final class t<Z> implements u<Z>, a.f {
    public static final n3.e<t<?>> A = j8.a.d(20, new a());

    /* renamed from: w  reason: collision with root package name */
    public final j8.c f44246w = j8.c.a();

    /* renamed from: x  reason: collision with root package name */
    public u<Z> f44247x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f44248y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f44249z;

    /* loaded from: classes.dex */
    public class a implements a.d<t<?>> {
        @Override // j8.a.d
        /* renamed from: a */
        public t<?> create() {
            return new t<>();
        }
    }

    public static <Z> t<Z> f(u<Z> uVar) {
        t<Z> tVar = (t) i8.j.d(A.acquire());
        tVar.b(uVar);
        return tVar;
    }

    @Override // o7.u
    public int a() {
        return this.f44247x.a();
    }

    public final void b(u<Z> uVar) {
        this.f44249z = false;
        this.f44248y = true;
        this.f44247x = uVar;
    }

    @Override // o7.u
    public synchronized void c() {
        this.f44246w.c();
        this.f44249z = true;
        if (!this.f44248y) {
            this.f44247x.c();
            g();
        }
    }

    @Override // o7.u
    public Class<Z> d() {
        return this.f44247x.d();
    }

    @Override // j8.a.f
    public j8.c e() {
        return this.f44246w;
    }

    public final void g() {
        this.f44247x = null;
        A.a(this);
    }

    @Override // o7.u
    public Z get() {
        return this.f44247x.get();
    }

    public synchronized void h() {
        this.f44246w.c();
        if (this.f44248y) {
            this.f44248y = false;
            if (this.f44249z) {
                c();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
