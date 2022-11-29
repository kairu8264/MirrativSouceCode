package nf;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import java.util.ArrayList;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.g;
import pd.q0;
import uo.r0;

/* loaded from: classes3.dex */
public final class h implements uo.q0 {
    public static final a K = new a(null);
    public static final int L = 8;
    public static h M;
    public final s0<List<LiveViewingUser>> A;
    public final wo.f<wn.v> B;
    public final wo.f<jf.k> C;
    public final wo.f<MRError> D;
    public final s0<jf.p0> E;
    public final wo.f<MRError> F;
    public final wo.f<String> G;
    public final wo.f<String> H;
    public final wo.f<wn.v> I;
    public final wo.f<wn.v> J;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f42856w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42857x;

    /* renamed from: y  reason: collision with root package name */
    public final s0<jf.h> f42858y;

    /* renamed from: z  reason: collision with root package name */
    public final s0<jf.j> f42859z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(q8.a aVar) {
            jo.p.h(aVar, "dispatcher");
            h hVar = h.M;
            if (hVar != null) {
                hVar.p();
            }
            h hVar2 = new h(aVar);
            h.M = hVar2;
            return hVar2;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$10", f = "CollabStore.kt", l = {163, 164}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42860w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.m f42862y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g.m mVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42862y = mVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42862y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42860w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h.this.F;
                MRError a10 = this.f42862y.a();
                this.f42860w = 1;
                if (fVar.r(a10, this) == c10) {
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
            s0 s0Var = h.this.E;
            this.f42860w = 2;
            if (s0Var.d(null, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$11", f = "CollabStore.kt", l = {171}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42863w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.c f42865y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g.c cVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42865y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42865y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42863w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h.this.G;
                String a10 = this.f42865y.a();
                this.f42863w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$12", f = "CollabStore.kt", l = {178, 179}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42866w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.e f42868y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g.e eVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f42868y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42868y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42866w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h.this.A;
                List<LiveViewingUser> u10 = h.this.u();
                g.e eVar = this.f42868y;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : u10) {
                    if (!jo.p.c(((LiveViewingUser) obj2).getUserId(), eVar.a())) {
                        arrayList.add(obj2);
                    }
                }
                this.f42866w = 1;
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
            wo.f fVar = h.this.H;
            String a10 = this.f42868y.a();
            this.f42866w = 2;
            if (fVar.r(a10, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$13", f = "CollabStore.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42869w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42869w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h.this.I;
                wn.v vVar = wn.v.f59242a;
                this.f42869w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$14", f = "CollabStore.kt", l = {195}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42871w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42871w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h.this.J;
                wn.v vVar = wn.v.f59242a;
                this.f42871w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$1", f = "CollabStore.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42873w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.j f42875y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(g.j jVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f42875y = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f42875y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42873w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h.this.f42858y;
                jf.h a10 = this.f42875y.a();
                this.f42873w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$2", f = "CollabStore.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: nf.h$h  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0634h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42876w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.a f42878y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0634h(q0.a aVar, ao.d<? super C0634h> dVar) {
            super(2, dVar);
            this.f42878y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0634h(this.f42878y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0634h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42876w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h.this.f42858y;
                jf.h a10 = this.f42878y.a();
                this.f42876w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$3", f = "CollabStore.kt", l = {106, 108}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42879w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.s f42881y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(g.s sVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f42881y = sVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f42881y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42879w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h.this.f42859z;
                jf.j a10 = this.f42881y.a();
                this.f42879w = 1;
                if (s0Var.d(a10, this) == c10) {
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
            if (this.f42881y.a().h()) {
                s0 s0Var2 = h.this.E;
                this.f42879w = 2;
                if (s0Var2.d(null, this) == c10) {
                    return c10;
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$4", f = "CollabStore.kt", l = {116}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42882w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.h f42884y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(g.h hVar, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f42884y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f42884y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42882w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h.this.A;
                List<LiveViewingUser> a10 = this.f42884y.a();
                this.f42882w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$5", f = "CollabStore.kt", l = {124, 125}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42885w;

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
            int i10 = this.f42885w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h.this.B;
                wn.v vVar = wn.v.f59242a;
                this.f42885w = 1;
                if (fVar.r(vVar, this) == c10) {
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
            s0 s0Var = h.this.E;
            this.f42885w = 2;
            if (s0Var.d(null, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$6", f = "CollabStore.kt", l = {132}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42887w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.r f42889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(g.r rVar, ao.d<? super l> dVar) {
            super(2, dVar);
            this.f42889y = rVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(this.f42889y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42887w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h.this.C;
                jf.k a10 = this.f42889y.a();
                this.f42887w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$7", f = "CollabStore.kt", l = {139}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42890w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.k f42892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(g.k kVar, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f42892y = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f42892y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42890w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h.this.D;
                MRError a10 = this.f42892y.a();
                this.f42890w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$8", f = "CollabStore.kt", l = {147, 148, 149}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42893w;

        public n(ao.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r6.f42893w
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L26
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                wn.m.b(r7)
                goto L5a
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                wn.m.b(r7)
                goto L4b
            L22:
                wn.m.b(r7)
                goto L3c
            L26:
                wn.m.b(r7)
                nf.h r7 = nf.h.this
                nd.s0 r7 = nf.h.d(r7)
                java.util.List r1 = xn.s.k()
                r6.f42893w = r5
                java.lang.Object r7 = r7.d(r1, r6)
                if (r7 != r0) goto L3c
                return r0
            L3c:
                nf.h r7 = nf.h.this
                nd.s0 r7 = nf.h.b(r7)
                r6.f42893w = r4
                java.lang.Object r7 = r7.d(r2, r6)
                if (r7 != r0) goto L4b
                return r0
            L4b:
                nf.h r7 = nf.h.this
                nd.s0 r7 = nf.h.j(r7)
                r6.f42893w = r3
                java.lang.Object r7 = r7.d(r2, r6)
                if (r7 != r0) goto L5a
                return r0
            L5a:
                wn.v r7 = wn.v.f59242a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: nf.h.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CollabStore$on$9", f = "CollabStore.kt", l = {156}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42895w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.l f42897y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(g.l lVar, ao.d<? super o> dVar) {
            super(2, dVar);
            this.f42897y = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(this.f42897y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42895w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h.this.E;
                jf.p0 a10 = this.f42897y.a();
                this.f42895w = 1;
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

    public h(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42856w = aVar;
        this.f42857x = r0.b();
        aVar.b(this);
        this.f42858y = new s0<>();
        this.f42859z = new s0<>();
        this.A = new s0<>();
        this.B = wo.g.a(-2);
        this.C = wo.g.a(-2);
        this.D = wo.g.a(-2);
        this.E = new s0<>();
        this.F = wo.g.a(-2);
        this.G = wo.g.a(-2);
        this.H = wo.g.a(-2);
        this.I = wo.g.a(-2);
        this.J = wo.g.a(-2);
    }

    public final wo.x<MRError> A() {
        return this.F.g();
    }

    public final wo.x<wn.v> B() {
        return this.B.g();
    }

    public final wo.x<wn.v> C() {
        return this.J.g();
    }

    public final wo.x<jf.k> D() {
        return this.C.g();
    }

    public final boolean E() {
        jf.h q10 = q();
        return (q10 != null ? q10.c() : null) == CollabType.LIVE;
    }

    public final boolean F() {
        jf.h q10 = q();
        return (q10 != null ? q10.c() : null) == CollabType.CALL && s().h();
    }

    public final boolean G() {
        return y() != null;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42857x.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.j jVar) {
        jo.p.h(jVar, "event");
        uo.l.d(this, null, null, new g(jVar, null), 3, null);
    }

    public final void p() {
        this.f42856w.c(this);
        r0.d(this, null, 1, null);
    }

    public final jf.h q() {
        return this.f42858y.b();
    }

    public final wo.x<jf.h> r() {
        return this.f42858y.c();
    }

    public final jf.j s() {
        jf.j b10 = this.f42859z.b();
        return b10 == null ? jf.j.INITIALIZED : b10;
    }

    public final wo.x<jf.j> t() {
        return this.f42859z.c();
    }

    public final List<LiveViewingUser> u() {
        List<LiveViewingUser> b10 = this.A.b();
        return b10 == null ? xn.s.k() : b10;
    }

    public final wo.x<String> v() {
        return this.G.g();
    }

    public final wo.x<wn.v> w() {
        return this.I.g();
    }

    public final wo.x<String> x() {
        return this.H.g();
    }

    public final jf.p0 y() {
        return this.E.b();
    }

    public final wo.x<jf.p0> z() {
        return this.E.c();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new C0634h(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.s sVar) {
        jo.p.h(sVar, "event");
        uo.l.d(this, null, null, new i(sVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.h hVar) {
        jo.p.h(hVar, "event");
        uo.l.d(this, null, null, new j(hVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.o oVar) {
        jo.p.h(oVar, "event");
        uo.l.d(this, null, null, new k(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.r rVar) {
        jo.p.h(rVar, "event");
        uo.l.d(this, null, null, new l(rVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.k kVar) {
        jo.p.h(kVar, "event");
        uo.l.d(this, null, null, new m(kVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new n(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.l lVar) {
        jo.p.h(lVar, "event");
        uo.l.d(this, null, null, new o(lVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new b(mVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new c(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new d(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.q qVar) {
        jo.p.h(qVar, "event");
        uo.l.d(this, null, null, new f(null), 3, null);
    }
}
