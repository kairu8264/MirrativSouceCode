package ad;

import ad.x;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.user.ContractLiveResultResponse;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class m0 extends androidx.lifecycle.q0 {
    public final LiveData<StatusView.b> A;
    public final xo.r<ContractLiveResultResponse> B;
    public final xo.w<ContractLiveResultResponse> C;
    public final xo.r<String> D;
    public final xo.w<String> E;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1195y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<StatusView.b> f1196z;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpStore$on$1", f = "BroadcastResultExpStore.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1197w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x.c f1199y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f1199y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f1199y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1197w;
            if (i10 == 0) {
                wn.m.b(obj);
                m0.this.f1196z.p(StatusView.b.c.f20791w);
                xo.r rVar = m0.this.B;
                ContractLiveResultResponse a10 = this.f1199y.a();
                this.f1197w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpStore$on$2", f = "BroadcastResultExpStore.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1200w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x.a f1202y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f1202y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f1202y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1200w;
            if (i10 == 0) {
                wn.m.b(obj);
                m0.this.f1196z.p(StatusView.b.c.f20791w);
                xo.r rVar = m0.this.D;
                String message = this.f1202y.a().getMessage();
                if (message == null) {
                    return wn.v.f59242a;
                }
                this.f1200w = 1;
                if (rVar.emit(message, this) == c10) {
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

    public m0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f1195y = aVar;
        aVar.b(this);
        androidx.lifecycle.e0<StatusView.b> e0Var = new androidx.lifecycle.e0<>(StatusView.b.c.f20791w);
        this.f1196z = e0Var;
        this.A = e0Var;
        xo.r<ContractLiveResultResponse> b10 = xo.y.b(0, 0, null, 7, null);
        this.B = b10;
        this.C = b10;
        xo.r<String> b11 = xo.y.b(0, 0, null, 7, null);
        this.D = b11;
        this.E = b11;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f1195y.c(this);
        super.d();
    }

    public final xo.w<ContractLiveResultResponse> i() {
        return this.C;
    }

    public final xo.w<String> j() {
        return this.E;
    }

    public final LiveData<StatusView.b> k() {
        return this.A;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.b bVar) {
        jo.p.h(bVar, "event");
        this.f1196z.p(StatusView.b.C0181b.f20790w);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new b(aVar, null), 3, null);
    }
}
