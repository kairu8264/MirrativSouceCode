package mc;

import android.content.Context;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.net.api.response.BroadcastResult;
import com.dena.mirrorman.net.api.response.live.LiveWatchedUsersResponse;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import ep.c0;
import hf.v0;
import pd.a;
import pd.s;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class a implements q0 {
    public final /* synthetic */ q0 A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f40728w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f40729x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f40730y;

    /* renamed from: z  reason: collision with root package name */
    public final v0 f40731z;

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActionCreator$follow$1", f = "BroadcastResultActionCreator.kt", l = {83}, m = "invokeSuspend")
    /* renamed from: mc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0600a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40732w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40734y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40735z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0600a(String str, String str2, ao.d<? super C0600a> dVar) {
            super(2, dVar);
            this.f40734y = str;
            this.f40735z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0600a(this.f40734y, this.f40735z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0600a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40732w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f40729x;
                    String str = this.f40734y;
                    String str2 = this.f40735z;
                    this.f40732w = 1;
                    if (mRRequest.postFollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f40728w.a(new s.C0720s(this.f40735z));
                dq.c.c().l(new nd.y(this.f40735z, true));
                a.this.f40728w.a(new a.f(this.f40735z));
                hf.b.f35490a.h();
                FirebaseAnalytics.getInstance(a.this.f40730y).a("jdwii7", null);
            } catch (Throwable th2) {
                a.this.f40728w.a(new a.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActionCreator$followAllViewers$1", f = "BroadcastResultActionCreator.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40736w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40738y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40739z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f40738y = str;
            this.f40739z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f40738y, this.f40739z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40736w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f40729x;
                    String str = this.f40738y;
                    String str2 = this.f40739z;
                    this.f40736w = 1;
                    if (mRRequest.postFollowLiveWatchedUsers(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f40728w.a(a.d.f46545a);
            } catch (Exception e10) {
                a.this.f40728w.a(new a.c(MRErrorKt.convertMRException(e10).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActionCreator$load$1", f = "BroadcastResultActionCreator.kt", l = {30}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40740w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40742y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40743z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f40742y = str;
            this.f40743z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f40742y, this.f40743z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40740w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f40729x;
                    String str = this.f40742y;
                    String str2 = this.f40743z;
                    this.f40740w = 1;
                    obj = mRRequest.getLiveBroadcastResult(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f40728w.a(new a.C0710a((BroadcastResult) obj));
            } catch (Throwable th2) {
                g9.a aVar = g9.a.f32826a;
                aVar.b("liveend failed " + this.f40743z + " : " + th2.getMessage(), new Object[0]);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActionCreator$loadLiveViewers$1", f = "BroadcastResultActionCreator.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ Integer A;
        public final /* synthetic */ boolean B;

        /* renamed from: w  reason: collision with root package name */
        public int f40744w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40746y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40747z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, Integer num, boolean z10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f40746y = str;
            this.f40747z = str2;
            this.A = num;
            this.B = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f40746y, this.f40747z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40744w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f40729x;
                    String str = this.f40746y;
                    String str2 = this.f40747z;
                    Integer num = this.A;
                    this.f40744w = 1;
                    obj = mRRequest.getLiveWatchedUsers(str, str2, num, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveWatchedUsersResponse liveWatchedUsersResponse = (LiveWatchedUsersResponse) obj;
                if (this.B) {
                    a.this.f40728w.a(new a.k(liveWatchedUsersResponse));
                } else {
                    a.this.f40728w.a(new a.b(liveWatchedUsersResponse));
                }
            } catch (Exception unused) {
                g9.a aVar = g9.a.f32826a;
                aVar.b("loadLiveViewers failed " + this.f40747z, new Object[0]);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActionCreator$postThanks$1", f = "BroadcastResultActionCreator.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public int f40748w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40750y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40751z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, int i10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f40750y = str;
            this.f40751z = str2;
            this.A = str3;
            this.B = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f40750y, this.f40751z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40748w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f40729x;
                    String str = this.f40750y;
                    String str2 = this.f40751z;
                    String str3 = this.A;
                    this.f40748w = 1;
                    if (mRRequest.chatPostThanksRequest(str, str2, str3, 0, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f40728w.a(new a.h(this.f40751z, this.B));
            } catch (Throwable th2) {
                a.this.f40728w.a(new a.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActionCreator$unfollow$1", f = "BroadcastResultActionCreator.kt", l = {99}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40752w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40754y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40755z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f40754y = str;
            this.f40755z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f40754y, this.f40755z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40752w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f40729x;
                    String str = this.f40754y;
                    String str2 = this.f40755z;
                    this.f40752w = 1;
                    if (mRRequest.postUnfollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                dq.c.c().l(new nd.y(this.f40755z, false));
                a.this.f40728w.a(s.u.f47251a);
                a.this.f40728w.a(new a.j(this.f40755z));
            } catch (Throwable th2) {
                a.this.f40728w.a(new a.i(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActionCreator$updateUserProfile$1", f = "BroadcastResultActionCreator.kt", l = {71}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40756w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40758y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c0 f40759z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, c0 c0Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f40758y = str;
            this.f40759z = c0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f40758y, this.f40759z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40756w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f40729x;
                    String str = this.f40758y;
                    c0 c0Var = this.f40759z;
                    this.f40756w = 1;
                    obj = mRRequest.postUserProfileEdit(str, c0Var, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f40731z.w((UserProfile) obj);
                a.this.f40728w.a(a.n.f46556a);
            } catch (Throwable th2) {
                a.this.f40728w.a(new a.m(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest, Context context, v0 v0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(context, "applicationContext");
        jo.p.h(v0Var, "userHelper");
        this.f40728w = aVar;
        this.f40729x = mRRequest;
        this.f40730y = context;
        this.f40731z = v0Var;
        this.A = r0.b();
    }

    public final void e(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        uo.l.d(this, null, null, new C0600a(str, str2, null), 3, null);
    }

    public final void f(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    public final void g(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new c(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final void h(String str, String str2, Integer num, boolean z10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new d(str, str2, num, z10, null), 3, null);
    }

    public final void i(ChatStatus chatStatus) {
        jo.p.h(chatStatus, "chatStatus");
        this.f40728w.a(new a.l(chatStatus));
    }

    public final void j(String str, String str2, String str3, int i10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        jo.p.h(str3, "userid");
        uo.l.d(this, null, null, new e(str, str3, str2, i10, null), 3, null);
    }

    public final void k(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        uo.l.d(this, null, null, new f(str, str2, null), 3, null);
    }

    public final void l(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "customThanksMessage");
        uo.l.d(this, null, null, new g(str, ApiUtil.INSTANCE.userProfileEditRequestBody(this.f40731z.x(), null, null, null, null, 0, str2, null, null, false, null, null), null), 3, null);
    }
}
