package uo;

import ao.e;
import ao.g;

/* loaded from: classes4.dex */
public abstract class k0 extends ao.a implements ao.e {

    /* renamed from: w  reason: collision with root package name */
    public static final a f56038w = new a(null);

    /* loaded from: classes4.dex */
    public static final class a extends ao.b<ao.e, k0> {

        /* renamed from: uo.k0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0878a extends jo.q implements io.l<g.b, k0> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0878a f56039w = new C0878a();

            public C0878a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final k0 invoke(g.b bVar) {
                if (bVar instanceof k0) {
                    return (k0) bVar;
                }
                return null;
            }
        }

        public a() {
            super(ao.e.f16648d, C0878a.f56039w);
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public k0() {
        super(ao.e.f16648d);
    }

    @Override // ao.e
    public final <T> ao.d<T> U(ao.d<? super T> dVar) {
        return new zo.k(this, dVar);
    }

    public abstract void X(ao.g gVar, Runnable runnable);

    public void Y(ao.g gVar, Runnable runnable) {
        X(gVar, runnable);
    }

    public boolean c0(ao.g gVar) {
        return true;
    }

    public k0 d0(int i10) {
        zo.r.a(i10);
        return new zo.q(this, i10);
    }

    @Override // ao.a, ao.g.b, ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // ao.a, ao.g
    public ao.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return v0.a(this) + '@' + v0.b(this);
    }

    @Override // ao.e
    public final void v(ao.d<?> dVar) {
        ((zo.k) dVar).p();
    }
}
