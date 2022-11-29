package cd;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import cd.p;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class z extends q0 {
    public final e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final xo.r<String> C;
    public final xo.w<String> D;
    public final xo.r<String> E;
    public final xo.w<String> F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f19305y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f19306z;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditIdentificationStore$on$1", f = "ContractEditIdentificationStore.kt", l = {43}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19307w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ p.c f19309y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f19309y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f19309y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            String applicationUrl;
            Object c10 = bo.c.c();
            int i10 = this.f19307w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.C;
                KycInfo kycInfo = this.f19309y.a().getKycInfo();
                if (kycInfo == null || (applicationUrl = kycInfo.getApplicationUrl()) == null) {
                    return wn.v.f59242a;
                }
                this.f19307w = 1;
                if (rVar.emit(applicationUrl, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditIdentificationStore$on$2", f = "ContractEditIdentificationStore.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19310w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ p.a f19312y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f19312y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f19312y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f19310w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.E;
                String message = this.f19312y.a().getMessage();
                if (message == null) {
                    message = z.this.j().getString(nc.i.f41875e);
                    jo.p.g(message, "resources.getString(R.string.error_access)");
                }
                this.f19310w = 1;
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

    public z(q8.a aVar, Resources resources) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f19305y = aVar;
        this.f19306z = resources;
        aVar.b(this);
        e0<ha.a> e0Var = new e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        xo.r<String> b10 = xo.y.b(0, 0, null, 7, null);
        this.C = b10;
        this.D = b10;
        xo.r<String> b11 = xo.y.b(0, 0, null, 7, null);
        this.E = b11;
        this.F = b11;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f19305y.c(this);
        super.d();
    }

    public final xo.w<String> h() {
        return this.D;
    }

    public final LiveData<ha.a> i() {
        return this.B;
    }

    public final Resources j() {
        return this.f19306z;
    }

    public final xo.w<String> k() {
        return this.F;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(p.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(p.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(r0.a(this), null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(p.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(new a.C0439a(aVar.a()));
        uo.l.d(r0.a(this), null, null, new b(aVar, null), 3, null);
    }
}
