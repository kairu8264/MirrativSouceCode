package uo;

import wn.l;

/* loaded from: classes4.dex */
public abstract class e1<T> extends bp.h {

    /* renamed from: y  reason: collision with root package name */
    public int f56011y;

    public e1(int i10) {
        this.f56011y = i10;
    }

    public void a(Object obj, Throwable th2) {
    }

    public abstract ao.d<T> b();

    public Throwable c(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f55999a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            wn.a.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        jo.p.e(th2);
        n0.a(b().getContext(), new t0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object a10;
        Object a11;
        if (u0.a()) {
            if (!(this.f56011y != -1)) {
                throw new AssertionError();
            }
        }
        bp.i iVar = this.f18570x;
        try {
            zo.k kVar = (zo.k) b();
            ao.d<T> dVar = kVar.A;
            Object obj = kVar.C;
            ao.g context = dVar.getContext();
            Object c10 = zo.o0.c(context, obj);
            i3<?> g10 = c10 != zo.o0.f63311a ? j0.g(dVar, context, c10) : null;
            ao.g context2 = dVar.getContext();
            Object g11 = g();
            Throwable c11 = c(g11);
            d2 d2Var = (c11 == null && f1.b(this.f56011y)) ? (d2) context2.get(d2.f56001s) : null;
            if (d2Var != null && !d2Var.isActive()) {
                Throwable n10 = d2Var.n();
                a(g11, n10);
                l.a aVar = wn.l.f59224w;
                if (u0.d() && (dVar instanceof co.e)) {
                    n10 = zo.j0.a(n10, (co.e) dVar);
                }
                dVar.resumeWith(wn.l.a(wn.m.a(n10)));
            } else if (c11 != null) {
                l.a aVar2 = wn.l.f59224w;
                dVar.resumeWith(wn.l.a(wn.m.a(c11)));
            } else {
                T e10 = e(g11);
                l.a aVar3 = wn.l.f59224w;
                dVar.resumeWith(wn.l.a(e10));
            }
            wn.v vVar = wn.v.f59242a;
            if (g10 == null || g10.a1()) {
                zo.o0.a(context, c10);
            }
            try {
                l.a aVar4 = wn.l.f59224w;
                iVar.a();
                a11 = wn.l.a(vVar);
            } catch (Throwable th2) {
                l.a aVar5 = wn.l.f59224w;
                a11 = wn.l.a(wn.m.a(th2));
            }
            f(null, wn.l.b(a11));
        } catch (Throwable th3) {
            try {
                l.a aVar6 = wn.l.f59224w;
                iVar.a();
                a10 = wn.l.a(wn.v.f59242a);
            } catch (Throwable th4) {
                l.a aVar7 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th4));
            }
            f(th3, wn.l.b(a10));
        }
    }
}
