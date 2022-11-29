package xo;

import ai.r23;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uo.u0;
import wn.l;

/* loaded from: classes4.dex */
public final class j0 extends yo.c<h0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f60518a = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    @Override // yo.c
    /* renamed from: c */
    public boolean a(h0<?> h0Var) {
        zo.k0 k0Var;
        if (this._state != null) {
            return false;
        }
        k0Var = i0.f60512a;
        this._state = k0Var;
        return true;
    }

    public final Object d(ao.d<? super wn.v> dVar) {
        zo.k0 k0Var;
        zo.k0 k0Var2;
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        if (!u0.a() || (!(this._state instanceof uo.q))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f60518a;
            k0Var = i0.f60512a;
            if (!r23.a(atomicReferenceFieldUpdater, this, k0Var, qVar)) {
                if (u0.a()) {
                    Object obj = this._state;
                    k0Var2 = i0.f60513b;
                    if (!(obj == k0Var2)) {
                        throw new AssertionError();
                    }
                }
                l.a aVar = wn.l.f59224w;
                qVar.resumeWith(wn.l.a(wn.v.f59242a));
            }
            Object t10 = qVar.t();
            if (t10 == bo.c.c()) {
                co.h.c(dVar);
            }
            return t10 == bo.c.c() ? t10 : wn.v.f59242a;
        }
        throw new AssertionError();
    }

    @Override // yo.c
    /* renamed from: e */
    public ao.d<wn.v>[] b(h0<?> h0Var) {
        this._state = null;
        return yo.b.f62080a;
    }

    public final void f() {
        zo.k0 k0Var;
        zo.k0 k0Var2;
        zo.k0 k0Var3;
        zo.k0 k0Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            k0Var = i0.f60513b;
            if (obj == k0Var) {
                return;
            }
            k0Var2 = i0.f60512a;
            if (obj == k0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f60518a;
                k0Var3 = i0.f60513b;
                if (r23.a(atomicReferenceFieldUpdater, this, obj, k0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f60518a;
                k0Var4 = i0.f60512a;
                if (r23.a(atomicReferenceFieldUpdater2, this, obj, k0Var4)) {
                    l.a aVar = wn.l.f59224w;
                    ((uo.q) obj).resumeWith(wn.l.a(wn.v.f59242a));
                    return;
                }
            }
        }
    }

    public final boolean g() {
        zo.k0 k0Var;
        zo.k0 k0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f60518a;
        k0Var = i0.f60512a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, k0Var);
        jo.p.e(andSet);
        if (!u0.a() || (!(andSet instanceof uo.q))) {
            k0Var2 = i0.f60513b;
            return andSet == k0Var2;
        }
        throw new AssertionError();
    }
}
