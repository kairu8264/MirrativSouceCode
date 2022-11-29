package zo;

import ai.r23;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uo.u0;
import zo.h;

/* loaded from: classes4.dex */
public abstract class h<N extends h<N>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63290a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63291b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    public h(N n10) {
        this._prev = n10;
    }

    public final void b() {
        f63291b.lazySet(this, null);
    }

    public final N c() {
        N f10 = f();
        while (f10 != null && f10.g()) {
            f10 = (N) f10._prev;
        }
        return f10;
    }

    public final N d() {
        k0 k0Var;
        Object e10 = e();
        k0Var = g.f63288a;
        if (e10 == k0Var) {
            return null;
        }
        return (N) e10;
    }

    public final Object e() {
        return this._next;
    }

    public final N f() {
        return (N) this._prev;
    }

    public abstract boolean g();

    public final N h() {
        if (!u0.a() || (!i())) {
            N d10 = d();
            jo.p.e(d10);
            while (d10.g()) {
                d10 = (N) d10.d();
                jo.p.e(d10);
            }
            return d10;
        }
        throw new AssertionError();
    }

    public final boolean i() {
        return d() == null;
    }

    public final void j() {
        if (u0.a() && !g()) {
            throw new AssertionError();
        }
        if (u0.a() && !(!i())) {
            throw new AssertionError();
        }
        while (true) {
            N c10 = c();
            N h10 = h();
            h10._prev = c10;
            if (c10 != null) {
                c10._next = h10;
            }
            if (!h10.g() && (c10 == null || !c10.g())) {
                return;
            }
        }
    }

    public final boolean k(N n10) {
        return r23.a(f63290a, this, null, n10);
    }
}
