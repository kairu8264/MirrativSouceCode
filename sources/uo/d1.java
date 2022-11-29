package uo;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class d1<T> extends zo.g0<T> {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56000z = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public d1(ao.g gVar, ao.d<? super T> dVar) {
        super(gVar, dVar);
        this._decision = 0;
    }

    @Override // zo.g0, uo.k2
    public void H(Object obj) {
        V0(obj);
    }

    @Override // zo.g0, uo.a
    public void V0(Object obj) {
        if (b1()) {
            return;
        }
        zo.l.c(bo.b.b(this.f63289y), g0.a(obj, this.f63289y), null, 2, null);
    }

    public final Object a1() {
        if (c1()) {
            return bo.c.c();
        }
        Object h10 = l2.h(n0());
        if (h10 instanceof d0) {
            throw ((d0) h10).f55999a;
        }
        return h10;
    }

    public final boolean b1() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f56000z.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean c1() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f56000z.compareAndSet(this, 0, 1));
        return true;
    }
}
