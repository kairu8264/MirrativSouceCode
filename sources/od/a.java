package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.ModeratorResponse;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import pd.c;
import pd.i1;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class a implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final MRRequest f44610w;

    /* renamed from: x  reason: collision with root package name */
    public final kf.x f44611x;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f44612y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f44613z;

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$addModerator$1", f = "BroadcastActionCreator.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
    /* renamed from: od.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0675a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f44614w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44616y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44617z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0675a(String str, String str2, String str3, ao.d<? super C0675a> dVar) {
            super(2, dVar);
            this.f44616y = str;
            this.f44617z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0675a(this.f44616y, this.f44617z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0675a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44614w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44616y;
                    String str2 = this.f44617z;
                    String str3 = this.A;
                    this.f44614w = 1;
                    obj = mRRequest.addModerator(str, str2, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ModeratorResponse moderatorResponse = (ModeratorResponse) obj;
                a.this.f44612y.a(new i1.e0(moderatorResponse.getModerator().getUserId(), moderatorResponse.getModerator()));
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.z(this.A, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$blockUser$1", f = "BroadcastActionCreator.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44618w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44620y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44621z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44620y = str;
            this.f44621z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44620y, this.f44621z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44618w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44620y;
                    String str2 = this.f44621z;
                    this.f44618w = 1;
                    if (mRRequest.postBlock(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.k(this.f44621z, this.f44620y);
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.j(this.f44621z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$changeModerator$1", f = "BroadcastActionCreator.kt", l = {182}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;

        /* renamed from: w  reason: collision with root package name */
        public int f44622w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44624y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44625z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44624y = str;
            this.f44625z = str2;
            this.A = str3;
            this.B = str4;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44624y, this.f44625z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44622w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44624y;
                    String str2 = this.f44625z;
                    String str3 = this.A;
                    this.f44622w = 1;
                    if (mRRequest.deleteModerator(str, str2, str3, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.c(this.f44625z, this.B, this.f44624y);
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.a0(this.B, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$deleteModerator$1", f = "BroadcastActionCreator.kt", l = {156}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f44626w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44628y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44629z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f44628y = str;
            this.f44629z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f44628y, this.f44629z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44626w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44628y;
                    String str2 = this.f44629z;
                    String str3 = this.A;
                    this.f44626w = 1;
                    if (mRRequest.deleteModerator(str, str2, str3, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f44612y.a(new i1.b0(this.A));
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.a0(this.A, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$followUser$1", f = "BroadcastActionCreator.kt", l = {70}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44630w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44632y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44633z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f44632y = str;
            this.f44633z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f44632y, this.f44633z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44630w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44632y;
                    String str2 = this.f44633z;
                    this.f44630w = 1;
                    obj = mRRequest.postGraphFollow(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f44612y.a(new i1.o(this.f44633z, (Graph.Follow) obj));
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.n(this.f44633z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$kickUser$1", f = "BroadcastActionCreator.kt", l = {204}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f44634w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44636y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44637z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, String str3, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f44636y = str;
            this.f44637z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f44636y, this.f44637z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44634w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44636y;
                    String str2 = this.f44637z;
                    String str3 = this.A;
                    this.f44634w = 1;
                    if (mRRequest.postLiveKickOut(str, str2, str3, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f44612y.a(new i1.r(this.A));
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.q(this.A, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$loadNextUserApps$1", f = "BroadcastActionCreator.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44638w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44640y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44641z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f44640y = str;
            this.f44641z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f44640y, this.f44641z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44638w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    a.this.f44612y.a(new i1.d(this.f44640y));
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44640y;
                    String str2 = this.f44641z;
                    this.f44638w = 1;
                    obj = mRRequest.getAppUserApps(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f44612y.a(new i1.e(this.f44640y, (App.Apps) obj));
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.c(this.f44640y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$reloadUser$2", f = "BroadcastActionCreator.kt", l = {30}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44642w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44644y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44645z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f44644y = str;
            this.f44645z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f44644y, this.f44645z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44642w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44644y;
                    String str2 = this.f44645z;
                    this.f44642w = 1;
                    obj = mRRequest.getUserProfile(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f44612y.a(new i1.k(this.f44645z, (UserProfile) obj));
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.p(this.f44645z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$reloadUserApps$1", f = "BroadcastActionCreator.kt", l = {47}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44646w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44648y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f44648y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f44648y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44646w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    a.this.f44612y.a(new i1.f(this.f44648y));
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44648y;
                    this.f44646w = 1;
                    obj = mRRequest.getAppUserApps(str, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f44612y.a(new i1.g(this.f44648y, (App.Apps) obj));
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.c(this.f44648y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$unblockUser$1", f = "BroadcastActionCreator.kt", l = {118}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44649w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44651y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44652z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f44651y = str;
            this.f44652z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f44651y, this.f44652z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44649w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44651y;
                    String str2 = this.f44652z;
                    this.f44649w = 1;
                    if (mRRequest.postUnblock(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.k(this.f44652z, this.f44651y);
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.j(this.f44652z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.BroadcastActionCreator$unfollowUser$1", f = "BroadcastActionCreator.kt", l = {86}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44653w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44655y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44656z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f44655y = str;
            this.f44656z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f44655y, this.f44656z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44653w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f44610w;
                    String str = this.f44655y;
                    String str2 = this.f44656z;
                    this.f44653w = 1;
                    if (mRRequest.postGraphUnfollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f44612y.a(new i1.g0(this.f44656z));
            } catch (Throwable th2) {
                a.this.f44612y.a(new i1.n(this.f44656z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public a(MRRequest mRRequest, kf.x xVar, q8.a aVar) {
        uo.b0 b10;
        jo.p.h(mRRequest, "request");
        jo.p.h(xVar, "userPreference");
        jo.p.h(aVar, "dispatcher");
        this.f44610w = mRRequest;
        this.f44611x = xVar;
        this.f44612y = aVar;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.f44613z = b11.plus(b10);
    }

    public final void c(String str, String str2, String str3) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "referer");
        if (jo.p.c(str2, this.f44611x.T4())) {
            return;
        }
        uo.l.d(this, null, null, new C0675a(str3, str, str2, null), 3, null);
    }

    public final void d(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        uo.l.d(this, null, null, new b(str2, str, null), 3, null);
    }

    public final void e(String str, String str2, String str3, String str4) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "currentModeratorUserId");
        jo.p.h(str4, "referer");
        if (jo.p.c(str2, this.f44611x.T4())) {
            return;
        }
        uo.l.d(this, null, null, new c(str4, str, str3, str2, null), 3, null);
    }

    public final void f(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        this.f44612y.a(new c.v(str, str2));
    }

    public final void g(String str, String str2, String str3) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "referer");
        uo.l.d(this, null, null, new d(str3, str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44613z;
    }

    public final void h(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        uo.l.d(this, null, null, new e(str2, str, null), 3, null);
    }

    public final void i(String str, String str2, String str3) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "liveId");
        jo.p.h(str3, "referer");
        uo.l.d(this, null, null, new f(str3, str2, str, null), 3, null);
    }

    public final void j(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "nextCursor");
        uo.l.d(this, null, null, new g(str, str2, null), 3, null);
    }

    public final void k(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        String T4 = this.f44611x.T4();
        if (T4.length() > 0) {
            this.f44612y.a(new i1.x(str, T4));
        }
        uo.l.d(this, null, null, new h(str2, str, null), 3, null);
    }

    public final void l(String str) {
        jo.p.h(str, "userId");
        uo.l.d(this, null, null, new i(str, null), 3, null);
    }

    public final void m(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        uo.l.d(this, null, null, new j(str2, str, null), 3, null);
    }

    public final void n(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        uo.l.d(this, null, null, new k(str2, str, null), 3, null);
    }
}
