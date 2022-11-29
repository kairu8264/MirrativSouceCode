package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.LiveRequestUsersTargetDetail;
import com.dena.mirrorman.net.api.response.live.LiveRequestUsersResponse;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.ArrayList;
import java.util.List;
import pd.s0;

/* loaded from: classes2.dex */
public final class g0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44893w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44894x;

    /* renamed from: y  reason: collision with root package name */
    public final MRLogger f44895y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f44896z;

    @co.f(c = "com.dena.mirrorman.actioncreator.ProfileUserListActionCreator$loadNextLiveRequestUsers$1", f = "ProfileUserListActionCreator.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f44897w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44899y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44900z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44899y = str;
            this.f44900z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44899y, this.f44900z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44897w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = g0.this.f44894x;
                    String str = this.f44899y;
                    String str2 = this.f44900z;
                    String str3 = this.A;
                    this.f44897w = 1;
                    obj = mRRequest.getLiveRequestUsers(str, str2, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                g0.this.f44893w.a(new s0.b((LiveRequestUsersResponse) obj));
            } catch (Throwable th2) {
                g0.this.f44893w.a(new s0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ProfileUserListActionCreator$reloadLiveRequestUsers$1", f = "ProfileUserListActionCreator.kt", l = {23}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44901w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44903y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44904z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44903y = str;
            this.f44904z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44903y, this.f44904z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44901w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = g0.this.f44894x;
                    String str = this.f44903y;
                    String str2 = this.f44904z;
                    this.f44901w = 1;
                    obj = MRRequest.DefaultImpls.getLiveRequestUsers$default(mRRequest, str, str2, null, this, 4, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveRequestUsersResponse liveRequestUsersResponse = (LiveRequestUsersResponse) obj;
                g0.this.f44893w.a(new s0.b(liveRequestUsersResponse));
                MRLogger mRLogger = g0.this.f44895y;
                MRLog.Companion companion = MRLog.Companion;
                String str3 = this.f44903y;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_REQUEST_USERS_IMP);
                builder.setPageId(str3);
                String valueOf = String.valueOf(liveRequestUsersResponse.getUsers().size());
                List<UrgeUser> users = liveRequestUsersResponse.getUsers();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : users) {
                    if (!((UrgeUser) obj2).isFollower()) {
                        arrayList.add(obj2);
                    }
                }
                builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new LiveRequestUsersTargetDetail(valueOf, String.valueOf(arrayList.size())).toJson())));
                mRLogger.sendLog(builder.build());
            } catch (Throwable th2) {
                g0.this.f44893w.a(new s0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public g0(q8.a aVar, MRRequest mRRequest, MRLogger mRLogger) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(mRLogger, "logger");
        this.f44893w = aVar;
        this.f44894x = mRRequest;
        this.f44895y = mRLogger;
        this.f44896z = uo.r0.b();
    }

    public final void d(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "nextCursor");
        this.f44893w.a(s0.c.f47259a);
        uo.l.d(this, null, null, new a(str, str3, str2, null), 3, null);
    }

    public final void e(String str, String str2) {
        jo.p.h(str, "referer");
        this.f44893w.a(s0.d.f47260a);
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44896z.getCoroutineContext();
    }
}
