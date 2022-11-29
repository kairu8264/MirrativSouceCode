package nf;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.r0;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResult;
import org.greenrobot.eventbus.ThreadMode;
import pd.v0;

/* loaded from: classes3.dex */
public final class c0 extends androidx.lifecycle.q0 {
    public final xo.r<SeasonRatingLiveResult> A;
    public final xo.r<wn.v> B;
    public final xo.c<SeasonRatingLiveResult> C;
    public final androidx.lifecycle.e0<Long> D;
    public final LiveData<Long> E;
    public final androidx.lifecycle.e0<h9.a> F;
    public final LiveData<h9.a> G;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42582y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f42583z;

    @co.f(c = "com.dena.mirrorman.store.SeasonRatingStore$on$1", f = "SeasonRatingStore.kt", l = {47}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42584w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v0.b f42586y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v0.b bVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f42586y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f42586y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42584w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c0.this.A;
                SeasonRatingLiveResult a10 = this.f42586y.a();
                this.f42584w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.SeasonRatingStore$on$2", f = "SeasonRatingStore.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42587w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42587w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c0.this.B;
                wn.v vVar = wn.v.f59242a;
                this.f42587w = 1;
                if (rVar.emit(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.SeasonRatingStore$seasonRatingLiveResult$1", f = "SeasonRatingStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.q<SeasonRatingLiveResult, wn.v, ao.d<? super SeasonRatingLiveResult>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42589w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f42590x;

        public c(ao.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // io.q
        /* renamed from: a */
        public final Object s0(SeasonRatingLiveResult seasonRatingLiveResult, wn.v vVar, ao.d<? super SeasonRatingLiveResult> dVar) {
            c cVar = new c(dVar);
            cVar.f42590x = seasonRatingLiveResult;
            return cVar.invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42589w == 0) {
                wn.m.b(obj);
                return (SeasonRatingLiveResult) this.f42590x;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c0(q8.a aVar, Resources resources) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f42582y = aVar;
        this.f42583z = resources;
        aVar.b(this);
        xo.r<SeasonRatingLiveResult> b10 = xo.y.b(0, 0, null, 7, null);
        this.A = b10;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.B = b11;
        this.C = xo.e.h(b10, b11, new c(null));
        androidx.lifecycle.e0<Long> e0Var = new androidx.lifecycle.e0<>();
        this.D = e0Var;
        this.E = e0Var;
        androidx.lifecycle.e0<h9.a> e0Var2 = new androidx.lifecycle.e0<>();
        this.F = e0Var2;
        this.G = e0Var2;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f42582y.c(this);
        super.d();
    }

    public final LiveData<Long> h() {
        return this.E;
    }

    public final LiveData<h9.a> i() {
        return this.G;
    }

    public final xo.c<SeasonRatingLiveResult> j() {
        return this.C;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v0.b bVar) {
        jo.p.h(bVar, "event");
        this.D.p(Long.valueOf(bVar.a().getLiveDuration()));
        uo.l.d(r0.a(this), null, null, new a(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v0.d dVar) {
        jo.p.h(dVar, "event");
        df.c a10 = df.c.Companion.a(dVar.a().getSeason().getClassId());
        this.F.p(h9.a.f34594i.a(a10.h(), dVar.a().getSeason().getCurrent(), dVar.a().getSeason().getClassStart(), dVar.a().getSeason().getClassEnd(), a10.r(), a10.n(), this.f42583z));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v0.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(r0.a(this), null, null, new b(null), 3, null);
    }
}
