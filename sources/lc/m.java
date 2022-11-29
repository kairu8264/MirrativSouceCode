package lc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.q0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.FavoriteLiveSetting;
import java.util.ArrayList;
import java.util.List;
import lc.f;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;

/* loaded from: classes2.dex */
public final class m extends q0 implements uo.q0 {
    public final androidx.lifecycle.e0<StatusView.b> A;
    public final LiveData<StatusView.b> B;
    public final s0<List<FavoriteLiveSetting>> C;
    public final wo.f<wn.v> D;
    public final wo.f<MRError> E;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f39907y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f39908z;

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsStore$on$1", f = "FavoriteLiveSettingsStore.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39909w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39909w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = m.this.C;
                List k10 = xn.s.k();
                this.f39909w = 1;
                if (s0Var.d(k10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsStore$on$2", f = "FavoriteLiveSettingsStore.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39911w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.b f39913y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.b bVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f39913y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f39913y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39911w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = m.this.C;
                List<FavoriteLiveSetting> a10 = this.f39913y.a();
                this.f39911w = 1;
                if (s0Var.d(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsStore$on$3", f = "FavoriteLiveSettingsStore.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39914w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.a f39916y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f39916y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f39916y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39914w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = m.this.E;
                MRError a10 = this.f39916y.a();
                this.f39914w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsStore$on$4", f = "FavoriteLiveSettingsStore.kt", l = {74, 83}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39917w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.e f39919y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.e eVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f39919y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f39919y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39917w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = m.this.C;
                List<FavoriteLiveSetting> j10 = m.this.j();
                f.e eVar = this.f39919y;
                ArrayList arrayList = new ArrayList(xn.t.u(j10, 10));
                for (FavoriteLiveSetting favoriteLiveSetting : j10) {
                    if (favoriteLiveSetting.getId() == eVar.a().getId()) {
                        favoriteLiveSetting = eVar.a();
                    }
                    arrayList.add(favoriteLiveSetting);
                }
                this.f39917w = 1;
                if (s0Var.d(arrayList, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                wn.m.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            }
            wo.f fVar = m.this.D;
            wn.v vVar = wn.v.f59242a;
            this.f39917w = 2;
            if (fVar.r(vVar, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsStore$on$5", f = "FavoriteLiveSettingsStore.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39920w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.d f39922y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f.d dVar, ao.d<? super e> dVar2) {
            super(2, dVar2);
            this.f39922y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f39922y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39920w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = m.this.E;
                MRError a10 = this.f39922y.a();
                this.f39920w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public m(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f39907y = aVar;
        this.f39908z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<StatusView.b> e0Var = new androidx.lifecycle.e0<>(StatusView.b.c.f20791w);
        this.A = e0Var;
        this.B = e0Var;
        this.C = new s0<>();
        this.D = wo.g.a(-2);
        this.E = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f39907y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f39908z.getCoroutineContext();
    }

    public final wo.x<MRError> i() {
        return this.E.g();
    }

    public final List<FavoriteLiveSetting> j() {
        List<FavoriteLiveSetting> b10 = this.C.b();
        return b10 == null ? xn.s.k() : b10;
    }

    public final wo.x<List<FavoriteLiveSetting>> k() {
        return this.C.c();
    }

    public final LiveData<StatusView.b> l() {
        return this.B;
    }

    public final wo.x<wn.v> m() {
        return this.D.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(StatusView.b.C0181b.f20790w);
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(StatusView.b.c.f20791w);
        uo.l.d(this, null, null, new b(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(StatusView.b.c.f20791w);
        uo.l.d(this, null, null, new c(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new d(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new e(dVar, null), 3, null);
    }
}
