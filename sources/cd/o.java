package cd;

import ad.k2;
import ad.u0;
import cd.p;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class o implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f19257w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f19258x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f19259y;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditIdentificationActionCreator$editIdentification$1", f = "ContractEditIdentificationActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19260w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u0 f19262y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f19262y = u0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f19262y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object postContractKyc$default;
            a aVar2 = this;
            Object c10 = bo.c.c();
            int i10 = aVar2.f19260w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi c11 = o.this.c();
                    int c12 = k2.UPDATE_IDENTIFICATION.c();
                    String e10 = aVar2.f19262y.e();
                    String i11 = aVar2.f19262y.i();
                    String f10 = aVar2.f19262y.f();
                    String j10 = aVar2.f19262y.j();
                    int c13 = aVar2.f19262y.c();
                    String b10 = aVar2.f19262y.b();
                    String k10 = aVar2.f19262y.k();
                    Integer d10 = co.b.d(c13);
                    aVar2.f19260w = 1;
                    aVar2 = 3584;
                    try {
                        postContractKyc$default = UserApi.DefaultImpls.postContractKyc$default(c11, "contract.edit_identification", c12, e10, i11, f10, j10, d10, k10, b10, null, null, null, this, 3584, null);
                        if (postContractKyc$default == c10) {
                            return c10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = this;
                        o.this.b().a(new p.a(MRErrorKt.convertMRException(th).getError()));
                        return wn.v.f59242a;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postContractKyc$default = obj;
                }
                aVar = this;
                try {
                    o.this.b().a(new p.c((ContractKycResponse) postContractKyc$default));
                } catch (Throwable th3) {
                    th = th3;
                    o.this.b().a(new p.a(MRErrorKt.convertMRException(th).getError()));
                    return wn.v.f59242a;
                }
            } catch (Throwable th4) {
                th = th4;
                aVar = aVar2;
            }
            return wn.v.f59242a;
        }
    }

    public o(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f19257w = aVar;
        this.f19258x = userApi;
        this.f19259y = r0.b();
    }

    public final void a(u0 u0Var) {
        jo.p.h(u0Var, "bindModel");
        this.f19257w.a(p.b.f19264a);
        uo.l.d(this, null, null, new a(u0Var, null), 3, null);
    }

    public final q8.a b() {
        return this.f19257w;
    }

    public final UserApi c() {
        return this.f19258x;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f19259y.getCoroutineContext();
    }
}
