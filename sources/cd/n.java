package cd;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class n extends q0 {
    public final e0<KycInfo> A;
    public final LiveData<KycInfo> B;
    public final e0<ha.a> C;
    public final LiveData<ha.a> D;
    public final xo.r<wn.v> E;
    public final xo.w<wn.v> F;
    public final xo.r<String> G;
    public final xo.w<String> H;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f19250y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f19251z;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditBankAccountStore$on$1", f = "ContractEditBankAccountStore.kt", l = {49}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19252w;

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
            int i10 = this.f19252w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = n.this.E;
                wn.v vVar = wn.v.f59242a;
                this.f19252w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditBankAccountStore$on$2", f = "ContractEditBankAccountStore.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19254w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ cd.b f19256y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cd.b bVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f19256y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f19256y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f19254w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = n.this.G;
                String message = this.f19256y.a().getMessage();
                if (message == null) {
                    message = n.this.j().getString(nc.i.f41875e);
                    jo.p.g(message, "resources.getString(R.string.error_access)");
                }
                this.f19254w = 1;
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

    public n(q8.a aVar, Resources resources) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f19250y = aVar;
        this.f19251z = resources;
        aVar.b(this);
        e0<KycInfo> e0Var = new e0<>();
        this.A = e0Var;
        this.B = e0Var;
        e0<ha.a> e0Var2 = new e0<>(a.d.f34697b);
        this.C = e0Var2;
        this.D = e0Var2;
        xo.r<wn.v> b10 = xo.y.b(0, 0, null, 7, null);
        this.E = b10;
        this.F = b10;
        xo.r<String> b11 = xo.y.b(0, 0, null, 7, null);
        this.G = b11;
        this.H = b11;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f19250y.c(this);
        super.d();
    }

    public final LiveData<KycInfo> h() {
        return this.B;
    }

    public final xo.w<wn.v> i() {
        return this.F;
    }

    public final Resources j() {
        return this.f19251z;
    }

    public final xo.w<String> k() {
        return this.H;
    }

    public final LiveData<ha.a> l() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c cVar) {
        jo.p.h(cVar, "event");
        this.C.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d dVar) {
        jo.p.h(dVar, "event");
        this.C.p(a.d.f34697b);
        this.A.p(dVar.a().getKycInfo());
        uo.l.d(r0.a(this), null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(cd.b bVar) {
        jo.p.h(bVar, "event");
        this.C.p(new a.C0439a(bVar.a()));
        uo.l.d(r0.a(this), null, null, new b(bVar, null), 3, null);
    }
}
