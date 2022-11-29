package cd;

import ad.k2;
import ad.r0;
import cd.p;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import uo.q0;

/* loaded from: classes2.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f19154w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f19155x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f19156y;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditBankAccountActionCreator$editBankAccount$1", f = "ContractEditBankAccountActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* renamed from: cd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0145a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19157w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r0 f19159y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0145a(r0 r0Var, ao.d<? super C0145a> dVar) {
            super(2, dVar);
            this.f19159y = r0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0145a(this.f19159y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0145a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            C0145a c0145a;
            Object postContractKyc$default;
            C0145a c0145a2 = this;
            Object c10 = bo.c.c();
            int i10 = c0145a2.f19157w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi c11 = a.this.c();
                    int c12 = k2.UPDATE_BANK_ACCOUNT.c();
                    String f10 = c0145a2.f19159y.f();
                    String e10 = c0145a2.f19159y.e();
                    String d10 = c0145a2.f19159y.d();
                    c0145a2.f19157w = 1;
                    c0145a2 = 508;
                    try {
                        postContractKyc$default = UserApi.DefaultImpls.postContractKyc$default(c11, "contract.edit_bank_account", c12, null, null, null, null, null, null, null, f10, e10, d10, this, 508, null);
                        if (postContractKyc$default == c10) {
                            return c10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c0145a = this;
                        a.this.b().a(new b(MRErrorKt.convertMRException(th).getError()));
                        return wn.v.f59242a;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postContractKyc$default = obj;
                }
                c0145a = this;
                try {
                    a.this.b().a(new d((ContractKycResponse) postContractKyc$default));
                } catch (Throwable th3) {
                    th = th3;
                    a.this.b().a(new b(MRErrorKt.convertMRException(th).getError()));
                    return wn.v.f59242a;
                }
            } catch (Throwable th4) {
                th = th4;
                c0145a = c0145a2;
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f19154w = aVar;
        this.f19155x = userApi;
        this.f19156y = uo.r0.b();
    }

    public final void a(r0 r0Var) {
        jo.p.h(r0Var, "bindModel");
        this.f19154w.a(p.b.f19264a);
        uo.l.d(this, null, null, new C0145a(r0Var, null), 3, null);
    }

    public final q8.a b() {
        return this.f19154w;
    }

    public final UserApi c() {
        return this.f19155x;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f19156y.getCoroutineContext();
    }
}
