package yc;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ChatConfirmationResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.net.api.Referer;
import io.p;
import uo.q0;
import wn.m;
import wn.v;
import yc.c;

/* loaded from: classes2.dex */
public final class b implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f61619w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f61620x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f61621y;

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.generationpicker.ChatConfirmationGenerationPickerActionCreator$onRegister$1", f = "ChatConfirmationGenerationPickerActionCreator.kt", l = {23}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61622w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f61624y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f61624y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f61624y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61622w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    UserApi userApi = b.this.f61620x;
                    String str = this.f61624y;
                    this.f61622w = 1;
                    obj = userApi.postGeneration(Referer.MY_PAGE, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                b.this.f61619w.a(new c.d(((ChatConfirmationResponse) obj).getChatStatus()));
            } catch (Throwable th2) {
                b.this.f61619w.a(new c.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public b(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f61619w = aVar;
        this.f61620x = userApi;
        this.f61621y = new da.b();
    }

    public final void c() {
        this.f61619w.a(c.a.f61625a);
    }

    public final void d(int i10) {
        this.f61619w.a(new c.e(i10));
    }

    public final void e(String str) {
        jo.p.h(str, "generation");
        this.f61619w.a(c.C1053c.f61627a);
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f61621y.getCoroutineContext();
    }
}
