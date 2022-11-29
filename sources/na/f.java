package na;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameListItem;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import ha.a;
import io.p;
import java.util.ArrayList;
import java.util.List;
import l0.c2;
import l0.s0;
import l0.u1;
import l0.z1;
import na.b;
import nd.i1;
import org.greenrobot.eventbus.ThreadMode;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;
import v0.s;
import wn.m;
import wn.v;
import xn.t;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes.dex */
public final class f extends q0 implements uo.q0 {
    public final ao.g A;
    public final s0<na.c> B;
    public final c2<na.c> C;
    public final s<na.d> D;
    public final List<na.d> E;
    public final e0<ha.a> F;
    public final LiveData<ha.a> G;
    public final r<LiveGameStartResponse> H;
    public final w<LiveGameStartResponse> I;
    public final r<MRError> J;
    public final w<MRError> K;
    public final r<v> L;
    public final r<v> M;
    public final s0<String> N;
    public final c2<String> O;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f41666y;

    /* renamed from: z  reason: collision with root package name */
    public final i1 f41667z;

    @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingStore$on$1", f = "LiveGameListingStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41668w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.c f41670y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f41670y = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f41670y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f41668w == 0) {
                m.b(obj);
                f.this.F.p(a.d.f34697b);
                List<LiveGameListItem> games = this.f41670y.a().getGames();
                f fVar = f.this;
                ArrayList arrayList = new ArrayList(t.u(games, 10));
                for (LiveGameListItem liveGameListItem : games) {
                    arrayList.add(na.d.M.a(liveGameListItem, fVar.f41667z.a().c()));
                }
                f.this.D.addAll(arrayList);
                f.this.N.setValue(this.f41670y.a().getNextCursor());
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingStore$on$2", f = "LiveGameListingStore.kt", l = {101}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41671w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.f f41673y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.f fVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f41673y = fVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f41673y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41671w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = f.this.H;
                LiveGameStartResponse a10 = this.f41673y.a();
                this.f41671w = 1;
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

    @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingStore$on$3", f = "LiveGameListingStore.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41674w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.e f41676y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b.e eVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f41676y = eVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f41676y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41674w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = f.this.J;
                MRError a10 = this.f41676y.a();
                this.f41674w = 1;
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

    @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingStore$on$4", f = "LiveGameListingStore.kt", l = {116}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41677w;

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
            int i10 = this.f41677w;
            if (i10 == 0) {
                m.b(obj);
                r<v> q10 = f.this.q();
                v vVar = v.f59242a;
                this.f41677w = 1;
                if (q10.emit(vVar, this) == c10) {
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

    public f(q8.a aVar, i1 i1Var) {
        b0 b10;
        s0<na.c> e10;
        s0<String> e11;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(i1Var, "sharedApplicationModel");
        this.f41666y = aVar;
        this.f41667z = i1Var;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.A = c10.plus(b10);
        e10 = z1.e(null, null, 2, null);
        this.B = e10;
        this.C = e10;
        s<na.d> c11 = u1.c();
        this.D = c11;
        this.E = c11;
        e0<ha.a> e0Var = new e0<>(a.b.f34695b);
        this.F = e0Var;
        this.G = e0Var;
        r<LiveGameStartResponse> b11 = y.b(0, 0, null, 7, null);
        this.H = b11;
        this.I = b11;
        r<MRError> b12 = y.b(0, 0, null, 7, null);
        this.J = b12;
        this.K = b12;
        r<v> b13 = y.b(0, 0, null, 7, null);
        this.L = b13;
        this.M = b13;
        e11 = z1.e(null, null, 2, null);
        this.N = e11;
        this.O = e11;
        aVar.b(this);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f41666y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }

    public final List<na.d> l() {
        return this.E;
    }

    public final c2<na.c> m() {
        return this.C;
    }

    public final w<MRError> n() {
        return this.K;
    }

    public final w<LiveGameStartResponse> o() {
        return this.I;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        this.F.p(a.b.f34695b);
        this.D.clear();
    }

    public final c2<String> p() {
        return this.O;
    }

    public final r<v> q() {
        return this.M;
    }

    public final LiveData<ha.a> r() {
        return this.G;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        this.F.p(a.c.f34696b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        this.B.setValue(new na.c(cVar.a().getMissionBannerUrl(), i.f41718f.a(cVar.a().getMissionProgress())));
        uo.l.d(this, null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0620b c0620b) {
        jo.p.h(c0620b, "event");
        this.F.p(a.e.f34698b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        jo.p.h(fVar, "event");
        uo.l.d(this, null, null, new b(fVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new c(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new d(null), 3, null);
    }
}
