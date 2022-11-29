package xc;

import co.l;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import hf.a0;
import hf.v0;
import io.p;
import uo.q0;
import wn.v;
import xc.b;

/* loaded from: classes2.dex */
public final class a implements q0 {
    public final /* synthetic */ da.b A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f60123w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f60124x;

    /* renamed from: y  reason: collision with root package name */
    public final a0 f60125y;

    /* renamed from: z  reason: collision with root package name */
    public final v0 f60126z;

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.datepicker.ChatConfirmationDatePickerActionCreator$onRegister$1", f = "ChatConfirmationDatePickerActionCreator.kt", l = {32, 39}, m = "invokeSuspend")
    /* renamed from: xc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0998a extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public Object f60127w;

        /* renamed from: x  reason: collision with root package name */
        public int f60128x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f60130z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0998a(String str, String str2, ao.d<? super C0998a> dVar) {
            super(2, dVar);
            this.f60130z = str;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0998a(this.f60130z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0998a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:2|(1:(1:(6:6|7|8|9|10|11)(2:16|17))(1:18))(3:29|30|(1:32))|19|21|22|(1:24)(4:25|9|10|11)) */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
            r0 = r7;
            r7 = r0;
         */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r6.f60128x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r6.f60127w
                com.dena.mirrativ.mirrativapi.user.ChatConfirmationResponse r0 = (com.dena.mirrativ.mirrativapi.user.ChatConfirmationResponse) r0
                wn.m.b(r7)     // Catch: java.lang.Throwable -> L16
                goto L53
            L16:
                r7 = move-exception
                goto L63
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                wn.m.b(r7)     // Catch: java.lang.Throwable -> L24
                goto L3c
            L24:
                r7 = move-exception
                goto L7b
            L26:
                wn.m.b(r7)
                xc.a r7 = xc.a.this     // Catch: java.lang.Throwable -> L24
                com.dena.mirrativ.mirrativapi.user.UserApi r7 = xc.a.c(r7)     // Catch: java.lang.Throwable -> L24
                java.lang.String r1 = "my_page"
                java.lang.String r4 = r6.f60130z     // Catch: java.lang.Throwable -> L24
                r6.f60128x = r3     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = r7.postBirthday(r1, r4, r6)     // Catch: java.lang.Throwable -> L24
                if (r7 != r0) goto L3c
                return r0
            L3c:
                com.dena.mirrativ.mirrativapi.user.ChatConfirmationResponse r7 = (com.dena.mirrativ.mirrativapi.user.ChatConfirmationResponse) r7     // Catch: java.lang.Throwable -> L24
                xc.a r1 = xc.a.this     // Catch: java.lang.Throwable -> L5f
                hf.a0 r1 = xc.a.b(r1)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r4 = r6.A     // Catch: java.lang.Throwable -> L5f
                r6.f60127w = r7     // Catch: java.lang.Throwable -> L5f
                r6.f60128x = r2     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r1 = r1.a(r4, r3, r6)     // Catch: java.lang.Throwable -> L5f
                if (r1 != r0) goto L51
                return r0
            L51:
                r0 = r7
                r7 = r1
            L53:
                com.dena.mirrorman.net.api.response.user.UserMe r7 = (com.dena.mirrorman.net.api.response.user.UserMe) r7     // Catch: java.lang.Throwable -> L16
                xc.a r1 = xc.a.this     // Catch: java.lang.Throwable -> L16
                hf.v0 r1 = xc.a.d(r1)     // Catch: java.lang.Throwable -> L16
                r1.v(r7)     // Catch: java.lang.Throwable -> L16
                goto L66
            L5f:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L63:
                g9.a.c(r7)
            L66:
                xc.a r7 = xc.a.this
                q8.a r7 = xc.a.a(r7)
                xc.b$d r1 = new xc.b$d
                com.dena.mirrativ.mirrativapi.user.ChatStatus r0 = r0.getChatStatus()
                r1.<init>(r0)
                r7.a(r1)
                wn.v r7 = wn.v.f59242a
                return r7
            L7b:
                xc.a r0 = xc.a.this
                q8.a r0 = xc.a.a(r0)
                xc.b$b r1 = new xc.b$b
                com.dena.mirrativ.mirrativapi.core.MRException r7 = com.dena.mirrativ.mirrativapi.core.MRErrorKt.convertMRException(r7)
                com.dena.mirrativ.mirrativapi.core.MRError r7 = r7.getError()
                r1.<init>(r7)
                r0.a(r1)
                wn.v r7 = wn.v.f59242a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xc.a.C0998a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(q8.a aVar, UserApi userApi, a0 a0Var, v0 v0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        jo.p.h(a0Var, "getUserMeRepository");
        jo.p.h(v0Var, "userHelper");
        this.f60123w = aVar;
        this.f60124x = userApi;
        this.f60125y = a0Var;
        this.f60126z = v0Var;
        this.A = new da.b();
    }

    public final void e() {
        this.f60123w.a(b.a.f60131a);
    }

    public final void f(int i10) {
        this.f60123w.a(new b.e(i10));
    }

    public final void g(int i10) {
        this.f60123w.a(new b.f(i10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final void h(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "date");
        this.f60123w.a(b.c.f60133a);
        uo.l.d(this, null, null, new C0998a(str2, str, null), 3, null);
    }
}
