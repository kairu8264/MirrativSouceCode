package ib;

import com.dena.mirrorman.net.api.response.notice.NotificationPushSettingsV3Response;
import com.dena.mirrorman.net.retrofit.MRRequest;
import ib.b;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f36454w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f36455x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f36456y;

    @co.f(c = "com.dena.mirrativ.player.afterplay.AfterPlayActionCreator$getNotificationSetting$1", f = "AfterPlayActionCreator.kt", l = {16}, m = "invokeSuspend")
    /* renamed from: ib.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0470a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36457w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36459y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36460z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0470a(String str, String str2, ao.d<? super C0470a> dVar) {
            super(2, dVar);
            this.f36459y = str;
            this.f36460z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0470a(this.f36459y, this.f36460z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0470a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36457w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f36455x;
                    String str = this.f36459y;
                    this.f36457w = 1;
                    obj = mRRequest.notificationGetSettingsRequest(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                if (((NotificationPushSettingsV3Response) obj).isEnabledLives()) {
                    a.this.f36454w.a(b.a.f36462a);
                } else {
                    a.this.f36454w.a(new b.c(this.f36460z));
                }
            } catch (Throwable unused) {
                a.this.f36454w.a(b.C0471b.f36463a);
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f36454w = aVar;
        this.f36455x = mRRequest;
        this.f36456y = r0.b();
    }

    public final void c(String str, String str2) {
        jo.p.h(str, "casterUserName");
        jo.p.h(str2, "referer");
        uo.l.d(this, null, null, new C0470a(str2, str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f36456y.getCoroutineContext();
    }
}
