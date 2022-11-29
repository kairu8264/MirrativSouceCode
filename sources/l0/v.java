package l0;

import android.view.Choreographer;
import ao.g;
import l0.n0;
import wn.l;

/* loaded from: classes.dex */
public final class v implements n0 {

    /* renamed from: w  reason: collision with root package name */
    public static final v f39280w = new v();

    /* renamed from: x  reason: collision with root package name */
    public static final Choreographer f39281x = (Choreographer) uo.j.e(uo.g1.c().h0(), new a(null));

    @co.f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super Choreographer>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39282w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super Choreographer> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f39282w == 0) {
                wn.m.b(obj);
                return Choreographer.getInstance();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f39283w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f39283w = frameCallback;
        }

        public final void a(Throwable th2) {
            v.f39281x.removeFrameCallback(this.f39283w);
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
        public final /* synthetic */ uo.p<R> f39284w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<Long, R> f39285x;

        /* JADX WARN: Multi-variable type inference failed */
        public c(uo.p<? super R> pVar, io.l<? super Long, ? extends R> lVar) {
            this.f39284w = pVar;
            this.f39285x = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object a10;
            ao.d dVar = this.f39284w;
            v vVar = v.f39280w;
            io.l<Long, R> lVar = this.f39285x;
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

    @Override // l0.n0
    public <R> Object L(io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        c cVar = new c(qVar, lVar);
        f39281x.postFrameCallback(cVar);
        qVar.M(new b(cVar));
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
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
