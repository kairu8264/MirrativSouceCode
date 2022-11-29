package of;

import android.content.Context;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.user.UserMe;
import hf.a0;
import hf.v0;
import nd.f1;
import nd.h0;
import pd.j0;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.l;
import wn.v;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f45418a;

    /* renamed from: b  reason: collision with root package name */
    public final hf.r f45419b;

    /* renamed from: c  reason: collision with root package name */
    public final q8.a f45420c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f45421d;

    @co.f(c = "com.dena.mirrorman.util.ProfileUtil$updateProfileMe$2$1", f = "ProfileUtil.kt", l = {32}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ Context A;

        /* renamed from: w  reason: collision with root package name */
        public int f45422w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45424y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ao.d<Boolean> f45425z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, ao.d<? super Boolean> dVar, Context context, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.f45424y = str;
            this.f45425z = dVar;
            this.A = context;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45424y, this.f45425z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45422w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    a0 a0Var = r.this.f45421d;
                    String str = this.f45424y;
                    this.f45422w = 1;
                    obj = a0Var.a(str, true, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                UserMe userMe = (UserMe) obj;
                r.this.f45418a.v(userMe);
                r.this.f45420c.a(new j0.e0(userMe));
                r.this.f45419b.t(userMe.getCapabilities());
                dq.c.c().l(new h0(userMe));
                ao.d<Boolean> dVar = this.f45425z;
                l.a aVar = wn.l.f59224w;
                dVar.resumeWith(wn.l.a(co.b.a(true)));
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    n.f45411a.l(this.A, error);
                } else {
                    n nVar = n.f45411a;
                    Context context = this.A;
                    String message = error.getMessage();
                    if (message == null) {
                        message = this.A.getString(f1.f41966c);
                        jo.p.g(message, "context.getString(R.string.error_access)");
                    }
                    nVar.B(context, message, false);
                }
                ao.d<Boolean> dVar2 = this.f45425z;
                l.a aVar2 = wn.l.f59224w;
                dVar2.resumeWith(wn.l.a(wn.m.a(e10)));
            }
            return v.f59242a;
        }
    }

    public r(v0 v0Var, hf.r rVar, q8.a aVar, a0 a0Var) {
        jo.p.h(v0Var, "userHelper");
        jo.p.h(rVar, "featureHelper");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(a0Var, "getUserMeRepository");
        this.f45418a = v0Var;
        this.f45419b = rVar;
        this.f45420c = aVar;
        this.f45421d = a0Var;
    }

    public final Object e(Context context, String str, ao.d<? super Boolean> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        uo.l.d(r0.a(g1.c().plus(iVar.getContext())), null, null, new a(str, iVar, context, null), 3, null);
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10;
    }
}
