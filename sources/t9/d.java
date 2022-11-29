package t9;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import ce.l;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUserBasic;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEquipmentGachaResultsResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGiftGachaResult;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGiftGachaResult;
import io.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jf.k0;
import l0.c2;
import l0.s0;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import pd.c;
import pd.f;
import t9.b;
import u9.a;
import uo.r0;
import wn.k;
import wn.m;
import wn.q;
import wn.v;
import xn.t;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes.dex */
public final class d extends q0 implements uo.q0 {
    public final e0<Integer> A;
    public final LiveData<Integer> B;
    public final s0<u9.a> C;
    public final c2<u9.a> D;
    public final r<k<jf.c, Set<k0>>> E;
    public final w<k<jf.c, Set<k0>>> F;
    public final r<k<String, List<EmomoRunGiftGachaResult>>> G;
    public final w<k<String, List<EmomoRunGiftGachaResult>>> H;
    public final r<v> I;
    public final w<v> J;
    public final e0<String> K;
    public final LiveData<String> L;
    public final s0<v9.c> M;
    public final c2<v9.c> N;
    public final e0<EmomoQuestEquipmentGachaResultsResponse> O;
    public final LiveData<EmomoQuestEquipmentGachaResultsResponse> P;
    public final r<MRError> Q;
    public final w<MRError> R;
    public final r<String> S;
    public final w<String> T;
    public final r<v> U;
    public final w<v> V;
    public final r<MRError> W;
    public final w<MRError> X;
    public final r<v> Y;
    public final w<v> Z;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f53331y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f53332z;

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$10", f = "EmomoQuestGameStore.kt", l = {185}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53333w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.g f53335y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.g gVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f53335y = gVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f53335y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53333w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.W;
                MRError b10 = this.f53335y.b();
                this.f53333w = 1;
                if (rVar.emit(b10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$1", f = "EmomoQuestGameStore.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53336w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.C0827b f53338y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.C0827b c0827b, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f53338y = c0827b;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f53338y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53336w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.E;
                k a10 = q.a(this.f53338y.a(), this.f53338y.c());
                this.f53336w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$2", f = "EmomoQuestGameStore.kt", l = {94}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53339w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.a f53341y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f53341y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f53341y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53339w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.W;
                MRError a10 = this.f53341y.a();
                this.f53339w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$3", f = "EmomoQuestGameStore.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: t9.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0828d extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53342w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.h f53344y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0828d(b.h hVar, ao.d<? super C0828d> dVar) {
            super(2, dVar);
            this.f53344y = hVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0828d(this.f53344y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((C0828d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53342w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.G;
                String b10 = this.f53344y.b();
                List<EmomoQuestGiftGachaResult> results = this.f53344y.a().getResults();
                b.h hVar = this.f53344y;
                ArrayList arrayList = new ArrayList(t.u(results, 10));
                for (EmomoQuestGiftGachaResult emomoQuestGiftGachaResult : results) {
                    arrayList.add(new EmomoRunGiftGachaResult(new GiftGachaUser(new GiftGachaUserBasic(emomoQuestGiftGachaResult.getStreamer().getUserId(), emomoQuestGiftGachaResult.getStreamer().getName(), emomoQuestGiftGachaResult.getStreamer().getIconUrl()), 1, 1, emomoQuestGiftGachaResult.getStreamer().getItems()), new GiftGachaUser(new GiftGachaUserBasic(emomoQuestGiftGachaResult.getViewer().getUserId(), emomoQuestGiftGachaResult.getViewer().getName(), emomoQuestGiftGachaResult.getViewer().getIconUrl()), 1, 1, emomoQuestGiftGachaResult.getViewer().getItems()), hVar.a().getHeadlineImageUrl(), hVar.a().getElementImageUrl(), hVar.a().getSpecialEffectSpan()));
                }
                k a10 = q.a(b10, arrayList);
                this.f53342w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$4", f = "EmomoQuestGameStore.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53345w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.g f53347y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b.g gVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f53347y = gVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f53347y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53345w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.W;
                MRError a10 = this.f53347y.a();
                this.f53345w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$5", f = "EmomoQuestGameStore.kt", l = {146}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53348w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53348w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.I;
                v vVar = v.f59242a;
                this.f53348w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$6", f = "EmomoQuestGameStore.kt", l = {153}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53350w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.e f53352y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b.e eVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f53352y = eVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f53352y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53350w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.Q;
                MRError a10 = this.f53352y.a();
                this.f53350w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$7", f = "EmomoQuestGameStore.kt", l = {160}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53353w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.r f53355y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l.r rVar, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f53355y = rVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f53355y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53353w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.S;
                String b10 = this.f53355y.b();
                this.f53353w = 1;
                if (rVar.emit(b10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$8", f = "EmomoQuestGameStore.kt", l = {169}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53356w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l.y f53357x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d f53358y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(l.y yVar, d dVar, ao.d<? super i> dVar2) {
            super(2, dVar2);
            this.f53357x = yVar;
            this.f53358y = dVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f53357x, this.f53358y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53356w;
            if (i10 == 0) {
                m.b(obj);
                if (!this.f53357x.a().isOtherLiveGift() && this.f53357x.a().m19getGiftType().i()) {
                    r rVar = this.f53358y.U;
                    v vVar = v.f59242a;
                    this.f53356w = 1;
                    if (rVar.emit(vVar, this) == c10) {
                        return c10;
                    }
                }
                return v.f59242a;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameStore$on$9", f = "EmomoQuestGameStore.kt", l = {177}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53359w;

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53359w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = d.this.Y;
                v vVar = v.f59242a;
                this.f53359w = 1;
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

    public d(q8.a aVar) {
        s0<u9.a> e10;
        s0<v9.c> e11;
        jo.p.h(aVar, "dispatcher");
        this.f53331y = aVar;
        this.f53332z = r0.b();
        aVar.b(this);
        e0<Integer> e0Var = new e0<>();
        this.A = e0Var;
        this.B = e0Var;
        e10 = z1.e(a.C0859a.f54633c, null, 2, null);
        this.C = e10;
        this.D = e10;
        r<k<jf.c, Set<k0>>> b10 = y.b(0, 0, null, 7, null);
        this.E = b10;
        this.F = xo.e.b(b10);
        r<k<String, List<EmomoRunGiftGachaResult>>> b11 = y.b(0, 0, null, 7, null);
        this.G = b11;
        this.H = xo.e.b(b11);
        r<v> b12 = y.b(0, 0, null, 7, null);
        this.I = b12;
        this.J = xo.e.b(b12);
        e0<String> e0Var2 = new e0<>();
        this.K = e0Var2;
        this.L = e0Var2;
        e11 = z1.e(null, null, 2, null);
        this.M = e11;
        this.N = e11;
        e0<EmomoQuestEquipmentGachaResultsResponse> e0Var3 = new e0<>();
        this.O = e0Var3;
        this.P = e0Var3;
        r<MRError> b13 = y.b(0, 0, null, 7, null);
        this.Q = b13;
        this.R = xo.e.b(b13);
        r<String> b14 = y.b(0, 0, null, 7, null);
        this.S = b14;
        this.T = xo.e.b(b14);
        r<v> b15 = y.b(0, 0, null, 7, null);
        this.U = b15;
        this.V = xo.e.b(b15);
        r<MRError> b16 = y.b(0, 0, null, 7, null);
        this.W = b16;
        this.X = xo.e.b(b16);
        r<v> b17 = y.b(0, 0, null, 7, null);
        this.Y = b17;
        this.Z = xo.e.b(b17);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f53331y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f53332z.getCoroutineContext();
    }

    public final w<v> n() {
        return this.Z;
    }

    public final c2<u9.a> o() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0827b c0827b) {
        jo.p.h(c0827b, "event");
        this.A.p(Integer.valueOf(c0827b.b().getGiftEventId()));
        this.C.setValue(new a.b(c0827b.b().isOpenEvent()));
        uo.l.d(this, null, null, new b(c0827b, null), 3, null);
    }

    public final w<MRError> p() {
        return this.X;
    }

    public final w<k<jf.c, Set<k0>>> q() {
        return this.F;
    }

    public final w<String> r() {
        return this.T;
    }

    public final LiveData<Integer> s() {
        return this.B;
    }

    public final w<v> t() {
        return this.V;
    }

    public final LiveData<EmomoQuestEquipmentGachaResultsResponse> u() {
        return this.P;
    }

    public final c2<v9.c> v() {
        return this.N;
    }

    public final LiveData<String> w() {
        return this.L;
    }

    public final w<MRError> x() {
        return this.R;
    }

    public final w<v> y() {
        return this.J;
    }

    public final w<k<String, List<EmomoRunGiftGachaResult>>> z() {
        return this.H;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new c(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.h hVar) {
        jo.p.h(hVar, "event");
        uo.l.d(this, null, null, new C0828d(hVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new e(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        jo.p.h(fVar, "event");
        this.K.p(fVar.b());
        this.M.setValue(v9.c.f56980b.a(fVar.a()));
        this.O.p(fVar.a());
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new g(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.r rVar) {
        jo.p.h(rVar, "event");
        uo.l.d(this, null, null, new h(rVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.y yVar) {
        jo.p.h(yVar, "event");
        uo.l.d(this, null, null, new i(yVar, this, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.C0712c c0712c) {
        jo.p.h(c0712c, "event");
        uo.l.d(this, null, null, new j(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new a(gVar, null), 3, null);
    }
}
