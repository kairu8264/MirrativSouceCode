package androidx.compose.ui.platform;

import android.view.Choreographer;
import ao.g;
import l0.n0;
import wn.l;

/* loaded from: classes.dex */
public final class e0 implements l0.n0 {

    /* renamed from: w  reason: collision with root package name */
    public final Choreographer f14433w;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0 f14434w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f14435x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f14434w = c0Var;
            this.f14435x = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f14434w.L0(this.f14435x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f14437x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f14437x = frameCallback;
        }

        public final void a(Throwable th2) {
            e0.this.b().removeFrameCallback(this.f14437x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Choreographer.FrameCallback {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ uo.p<R> f14438w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0 f14439x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<Long, R> f14440y;

        /* JADX WARN: Multi-variable type inference failed */
        public c(uo.p<? super R> pVar, e0 e0Var, io.l<? super Long, ? extends R> lVar) {
            this.f14438w = pVar;
            this.f14439x = e0Var;
            this.f14440y = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object a10;
            ao.d dVar = this.f14438w;
            io.l<Long, R> lVar = this.f14440y;
            try {
                l.a aVar = wn.l.f59224w;
                a10 = wn.l.a(lVar.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th2));
            }
            dVar.resumeWith(a10);
        }
    }

    public e0(Choreographer choreographer) {
        jo.p.h(choreographer, "choreographer");
        this.f14433w = choreographer;
    }

    @Override // l0.n0
    public <R> Object L(io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar) {
        g.b bVar = dVar.getContext().get(ao.e.f16648d);
        c0 c0Var = bVar instanceof c0 ? (c0) bVar : null;
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        c cVar = new c(qVar, this, lVar);
        if (c0Var != null && jo.p.c(c0Var.x0(), b())) {
            c0Var.F0(cVar);
            qVar.M(new a(c0Var, cVar));
        } else {
            b().postFrameCallback(cVar);
            qVar.M(new b(cVar));
        }
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }

    public final Choreographer b() {
        return this.f14433w;
    }

    @Override // ao.g
    public <R> R fold(R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) n0.a.a(this, r10, pVar);
    }

    @Override // ao.g.b, ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) n0.a.b(this, cVar);
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
