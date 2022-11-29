package nf;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.i1;
import uo.g1;
import uo.i2;
import uo.o2;

/* loaded from: classes3.dex */
public final class b implements uo.q0 {
    public final wo.q<UserProfile> A;
    public final wo.f<MRError> B;
    public final wo.q<List<App.AppParams>> C;
    public String D;
    public boolean E;
    public final wo.q<MRError> F;
    public final wo.q<Boolean> G;
    public final wo.q<MRError> H;

    /* renamed from: w  reason: collision with root package name */
    public final String f42399w;

    /* renamed from: x  reason: collision with root package name */
    public final q8.a f42400x;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f42401y;

    /* renamed from: z  reason: collision with root package name */
    public final wo.q<String> f42402z;

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$10", f = "BroadcastUserProfileStore.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42403w;

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
            int i10 = this.f42403w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = b.this.G;
                Boolean a10 = co.b.a(false);
                this.f42403w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$11", f = "BroadcastUserProfileStore.kt", l = {158}, m = "invokeSuspend")
    /* renamed from: nf.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0629b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42405w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.n f42407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0629b(i1.n nVar, ao.d<? super C0629b> dVar) {
            super(2, dVar);
            this.f42407y = nVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0629b(this.f42407y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0629b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42405w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = b.this.H;
                MRError a10 = this.f42407y.a();
                this.f42405w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$1", f = "BroadcastUserProfileStore.kt", l = {66}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42408w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.x f42410y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i1.x xVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42410y = xVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42410y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42408w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = b.this.f42402z;
                String a10 = this.f42410y.a();
                this.f42408w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$2", f = "BroadcastUserProfileStore.kt", l = {74, 75}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42411w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.k f42413y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i1.k kVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f42413y = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42413y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42411w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = b.this.A;
                UserProfile b10 = this.f42413y.b();
                this.f42411w = 1;
                if (qVar.r(b10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            wo.q qVar2 = b.this.G;
            Boolean a10 = co.b.a(this.f42413y.b().isFollowing());
            this.f42411w = 2;
            if (qVar2.r(a10, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$3", f = "BroadcastUserProfileStore.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42414w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.p f42416y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i1.p pVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f42416y = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f42416y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42414w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = b.this.B;
                MRError a10 = this.f42416y.a();
                this.f42414w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$4", f = "BroadcastUserProfileStore.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42417w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.j f42419y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(i1.j jVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f42419y = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f42419y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42417w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = b.this.F;
                MRError a10 = this.f42419y.a();
                this.f42417w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$5", f = "BroadcastUserProfileStore.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42420w;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42420w;
            if (i10 == 0) {
                wn.m.b(obj);
                b.this.D = "";
                b.this.E = true;
                wo.q qVar = b.this.C;
                List k10 = xn.s.k();
                this.f42420w = 1;
                if (qVar.r(k10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$6", f = "BroadcastUserProfileStore.kt", l = {116}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42422w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.g f42424y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(i1.g gVar, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f42424y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f42424y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42422w;
            if (i10 == 0) {
                wn.m.b(obj);
                b.this.E = false;
                b.this.D = this.f42424y.a().getNextCursor();
                wo.q qVar = b.this.C;
                List<App.AppParams> apps = this.f42424y.a().getApps();
                this.f42422w = 1;
                if (qVar.r(apps, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$7", f = "BroadcastUserProfileStore.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42425w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.e f42427y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(i1.e eVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f42427y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f42427y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42425w;
            if (i10 == 0) {
                wn.m.b(obj);
                b.this.E = false;
                b.this.D = this.f42427y.a().getNextCursor();
                wo.q qVar = b.this.C;
                List o02 = xn.a0.o0(b.this.l(), this.f42427y.a().getApps());
                this.f42425w = 1;
                if (qVar.r(o02, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$8", f = "BroadcastUserProfileStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42428w;

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42428w == 0) {
                wn.m.b(obj);
                b.this.E = false;
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.BroadcastUserProfileStore$on$9", f = "BroadcastUserProfileStore.kt", l = {142}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42430w;

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42430w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = b.this.G;
                Boolean a10 = co.b.a(true);
                this.f42430w = 1;
                if (qVar.r(a10, this) == c10) {
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

    public b(String str, q8.a aVar) {
        uo.b0 b10;
        jo.p.h(str, "userId");
        jo.p.h(aVar, "dispatcher");
        this.f42399w = str;
        this.f42400x = aVar;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f42401y = c10.plus(b10);
        this.f42402z = new wo.q<>();
        this.A = new wo.q<>();
        this.B = wo.g.a(-2);
        this.C = new wo.q<>(xn.s.k());
        this.D = "";
        this.F = new wo.q<>();
        this.G = new wo.q<>(Boolean.FALSE);
        this.H = new wo.q<>();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42401y;
    }

    public final void j() {
        this.f42400x.b(this);
    }

    public final void k() {
        this.f42400x.c(this);
    }

    public final List<App.AppParams> l() {
        return this.C.d();
    }

    public final wo.x<List<App.AppParams>> m() {
        return this.C.g();
    }

    public final wo.x<MRError> n() {
        return this.F.g();
    }

    public final wo.x<MRError> o() {
        return this.H.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.x xVar) {
        jo.p.h(xVar, "event");
        uo.l.d(this, null, null, new c(xVar, null), 3, null);
    }

    public final wo.x<MRError> p() {
        return this.B.g();
    }

    public final String q() {
        return this.D;
    }

    public final String r() {
        return this.f42402z.e();
    }

    public final UserProfile s() {
        return this.A.e();
    }

    public final wo.x<UserProfile> t() {
        return this.A.g();
    }

    public final boolean u() {
        return this.G.d().booleanValue();
    }

    public final wo.x<Boolean> v() {
        return this.G.g();
    }

    public final boolean w() {
        return this.E;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.k kVar) {
        jo.p.h(kVar, "event");
        if (jo.p.c(this.f42399w, kVar.a())) {
            uo.l.d(this, null, null, new d(kVar, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.p pVar) {
        jo.p.h(pVar, "event");
        uo.l.d(this, null, null, new e(pVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.j jVar) {
        jo.p.h(jVar, "event");
        if (jo.p.c(this.f42399w, jVar.b())) {
            uo.l.d(this, null, null, new f(jVar, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.f fVar) {
        jo.p.h(fVar, "event");
        if (jo.p.c(this.f42399w, fVar.a())) {
            uo.l.d(this, null, null, new g(null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.d dVar) {
        jo.p.h(dVar, "event");
        if (jo.p.c(this.f42399w, dVar.a())) {
            this.E = true;
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.g gVar) {
        jo.p.h(gVar, "event");
        if (jo.p.c(this.f42399w, gVar.b())) {
            uo.l.d(this, null, null, new h(gVar, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.e eVar) {
        jo.p.h(eVar, "event");
        if (jo.p.c(this.f42399w, eVar.b())) {
            uo.l.d(this, null, null, new i(eVar, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.c cVar) {
        jo.p.h(cVar, "event");
        if (jo.p.c(this.f42399w, cVar.a())) {
            uo.l.d(this, null, null, new j(null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.o oVar) {
        jo.p.h(oVar, "event");
        if (jo.p.c(this.f42399w, oVar.b())) {
            uo.l.d(this, null, null, new k(null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.g0 g0Var) {
        jo.p.h(g0Var, "event");
        if (jo.p.c(this.f42399w, g0Var.a())) {
            uo.l.d(this, null, null, new a(null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.n nVar) {
        jo.p.h(nVar, "event");
        if (jo.p.c(this.f42399w, nVar.b())) {
            uo.l.d(this, null, null, new C0629b(nVar, null), 3, null);
        }
    }
}
