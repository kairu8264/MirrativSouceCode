package l0;

import ao.g;
import java.util.ArrayList;
import java.util.List;
import l0.n0;
import wn.l;

/* loaded from: classes.dex */
public final class f implements n0 {

    /* renamed from: w  reason: collision with root package name */
    public final io.a<wn.v> f38982w;

    /* renamed from: y  reason: collision with root package name */
    public Throwable f38984y;

    /* renamed from: x  reason: collision with root package name */
    public final Object f38983x = new Object();

    /* renamed from: z  reason: collision with root package name */
    public List<a<?>> f38985z = new ArrayList();
    public List<a<?>> A = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<R> {

        /* renamed from: a  reason: collision with root package name */
        public final io.l<Long, R> f38986a;

        /* renamed from: b  reason: collision with root package name */
        public final ao.d<R> f38987b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar) {
            jo.p.h(lVar, "onFrame");
            jo.p.h(dVar, "continuation");
            this.f38986a = lVar;
            this.f38987b = dVar;
        }

        public final ao.d<R> a() {
            return this.f38987b;
        }

        public final void b(long j10) {
            Object a10;
            ao.d<R> dVar = this.f38987b;
            try {
                l.a aVar = wn.l.f59224w;
                a10 = wn.l.a(this.f38986a.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th2));
            }
            dVar.resumeWith(a10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.e0<a<R>> f38989x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jo.e0<a<R>> e0Var) {
            super(1);
            this.f38989x = e0Var;
        }

        public final void a(Throwable th2) {
            a aVar;
            Object obj = f.this.f38983x;
            f fVar = f.this;
            jo.e0<a<R>> e0Var = this.f38989x;
            synchronized (obj) {
                List list = fVar.f38985z;
                Object obj2 = e0Var.f38136w;
                if (obj2 == null) {
                    jo.p.v("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) obj2;
                }
                list.remove(aVar);
                wn.v vVar = wn.v.f59242a;
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    public f(io.a<wn.v> aVar) {
        this.f38982w = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, l0.f$a] */
    @Override // l0.n0
    public <R> Object L(io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar) {
        a aVar;
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        jo.e0 e0Var = new jo.e0();
        synchronized (this.f38983x) {
            Throwable th2 = this.f38984y;
            if (th2 != null) {
                l.a aVar2 = wn.l.f59224w;
                qVar.resumeWith(wn.l.a(wn.m.a(th2)));
            } else {
                e0Var.f38136w = new a(lVar, qVar);
                boolean z10 = !this.f38985z.isEmpty();
                List list = this.f38985z;
                T t10 = e0Var.f38136w;
                if (t10 == 0) {
                    jo.p.v("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t10;
                }
                list.add(aVar);
                boolean z11 = !z10;
                qVar.M(new b(e0Var));
                if (z11 && this.f38982w != null) {
                    try {
                        this.f38982w.invoke();
                    } catch (Throwable th3) {
                        k(th3);
                    }
                }
            }
        }
        Object t11 = qVar.t();
        if (t11 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t11;
    }

    @Override // ao.g
    public <R> R fold(R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) n0.a.a(this, r10, pVar);
    }

    @Override // ao.g.b, ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) n0.a.b(this, cVar);
    }

    public final void k(Throwable th2) {
        synchronized (this.f38983x) {
            if (this.f38984y != null) {
                return;
            }
            this.f38984y = th2;
            List<a<?>> list = this.f38985z;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ao.d<?> a10 = list.get(i10).a();
                l.a aVar = wn.l.f59224w;
                a10.resumeWith(wn.l.a(wn.m.a(th2)));
            }
            this.f38985z.clear();
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f38983x) {
            z10 = !this.f38985z.isEmpty();
        }
        return z10;
    }

    public final void m(long j10) {
        synchronized (this.f38983x) {
            List<a<?>> list = this.f38985z;
            this.f38985z = this.A;
            this.A = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).b(j10);
            }
            list.clear();
            wn.v vVar = wn.v.f59242a;
        }
    }

    @Override // ao.g
    public ao.g minusKey(g.c<?> cVar) {
        return n0.a.c(this, cVar);
    }

    @Override // ao.g
    public ao.g plus(ao.g gVar) {
        return n0.a.d(this, gVar);
    }
}
