package pa;

import androidx.lifecycle.q0;
import ao.g;
import ce.l;
import co.l;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameInterruptibleBcsvrResponse;
import io.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pa.b;
import pd.q0;
import uo.r0;
import wn.m;
import wn.v;
import xo.g0;
import xo.i0;
import xo.r;
import xo.s;
import xo.w;
import xo.y;

/* loaded from: classes.dex */
public final class c extends q0 implements uo.q0 {
    public final r<LiveDetailResponse> A;
    public final r<v> B;
    public final w<v> C;
    public final r<v> D;
    public final s<GiftItem> E;
    public final s<LiveGameInterruptibleBcsvrResponse> F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f46340y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f46341z;

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewStore$on$1", f = "LiveGameWebViewStore.kt", l = {54}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f46342w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.c f46344y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f46344y = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f46344y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f46342w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = c.this.A;
                LiveDetailResponse a10 = this.f46344y.a();
                this.f46342w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewStore$on$2", f = "LiveGameWebViewStore.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f46345w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f46345w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = c.this.B;
                v vVar = v.f59242a;
                this.f46345w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewStore$on$3", f = "LiveGameWebViewStore.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: pa.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0704c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f46347w;

        public C0704c(ao.d<? super C0704c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0704c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((C0704c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f46347w;
            if (i10 == 0) {
                m.b(obj);
                s sVar = c.this.E;
                this.f46347w = 1;
                if (sVar.emit(null, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewStore$on$4", f = "LiveGameWebViewStore.kt", l = {78}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f46349w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f46349w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = c.this.D;
                v vVar = v.f59242a;
                this.f46349w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewStore$on$6", f = "LiveGameWebViewStore.kt", l = {89}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f46351w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.y f46353y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l.y yVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f46353y = yVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f46353y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f46351w;
            if (i10 == 0) {
                m.b(obj);
                s sVar = c.this.E;
                GiftItem a10 = this.f46353y.a();
                this.f46351w = 1;
                if (sVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewStore$on$7", f = "LiveGameWebViewStore.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f46354w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.k0 f46356y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l.k0 k0Var, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f46356y = k0Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f46356y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f46354w;
            if (i10 == 0) {
                m.b(obj);
                s sVar = c.this.F;
                LiveGameInterruptibleBcsvrResponse b10 = this.f46356y.b();
                this.f46354w = 1;
                if (sVar.emit(b10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    public c(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f46340y = aVar;
        this.f46341z = r0.b();
        aVar.b(this);
        this.A = y.b(0, 0, null, 7, null);
        r<v> b10 = y.b(0, 0, null, 7, null);
        this.B = b10;
        this.C = b10;
        this.D = y.b(0, 0, null, 7, null);
        this.E = i0.a(null);
        this.F = i0.a(new LiveGameInterruptibleBcsvrResponse(true, 0L));
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f46340y.c(this);
        super.d();
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.f46341z.getCoroutineContext();
    }

    public final g0<GiftItem> k() {
        return this.E;
    }

    public final w<LiveDetailResponse> l() {
        return xo.e.b(this.A);
    }

    public final w<v> m() {
        return this.C;
    }

    public final g0<LiveGameInterruptibleBcsvrResponse> n() {
        return this.F;
    }

    public final w<v> o() {
        return xo.e.b(this.D);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new C0704c(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.l0 l0Var) {
        jo.p.h(l0Var, "event");
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.y yVar) {
        jo.p.h(yVar, "event");
        if (jo.p.c(yVar.b(), "CastService") && jo.p.c(yVar.a().isLastSent(), Boolean.TRUE)) {
            List<GiftRankingBcsvrResponse> rankings = yVar.a().getRankings();
            boolean z10 = false;
            if (!(rankings instanceof Collection) || !rankings.isEmpty()) {
                Iterator<T> it = rankings.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((GiftRankingBcsvrResponse) it.next()).isAppEventRankUp()) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                uo.l.d(this, null, null, new e(yVar, null), 3, null);
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.k0 k0Var) {
        jo.p.h(k0Var, "event");
        if (jo.p.c(k0Var.a(), "CastService") && this.F.getValue().getSentAt() <= k0Var.b().getSentAt()) {
            uo.l.d(this, null, null, new f(k0Var, null), 3, null);
        }
    }
}
