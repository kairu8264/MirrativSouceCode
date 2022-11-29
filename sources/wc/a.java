package wc;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.net.api.Referer;
import io.p;
import uo.q0;
import wc.b;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f58575w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f58576x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f58577y;

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementActionCreator$onAgree$1", f = "ChatConfirmationAgreementActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* renamed from: wc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0972a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58578w;

        public C0972a(ao.d<? super C0972a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0972a(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0972a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58578w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    UserApi userApi = a.this.f58576x;
                    this.f58578w = 1;
                    if (userApi.postChatConfirmationAgreement(Referer.MY_PAGE, true, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f58575w.a(b.C0973b.f58583a);
            } catch (Throwable th2) {
                a.this.f58575w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementActionCreator$onDisagree$1", f = "ChatConfirmationAgreementActionCreator.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58580w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58580w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    UserApi userApi = a.this.f58576x;
                    this.f58580w = 1;
                    if (userApi.postChatConfirmationAgreement(Referer.MY_PAGE, false, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f58575w.a(b.e.f58586a);
            } catch (Throwable th2) {
                a.this.f58575w.a(new b.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f58575w = aVar;
        this.f58576x = userApi;
        this.f58577y = new da.b();
    }

    public final void c() {
        this.f58575w.a(b.c.f58584a);
        uo.l.d(this, null, null, new C0972a(null), 3, null);
    }

    public final void d() {
        this.f58575w.a(b.c.f58584a);
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f58577y.getCoroutineContext();
    }
}
