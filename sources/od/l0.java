package od;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterOnlineUsersResponse;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateTeamResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.z0;
import uo.l0;

/* loaded from: classes2.dex */
public final class l0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45003w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45004x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45005y;

    /* loaded from: classes2.dex */
    public static final class a extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l0 f45006w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.a aVar, l0 l0Var) {
            super(aVar);
            this.f45006w = l0Var;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            q8.a aVar = this.f45006w.f45003w;
            MRError.Network network = MRError.Network.INSTANCE;
            aVar.a(new z0.a(network));
            this.f45006w.f45003w.a(new z0.d(network));
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterInviteActionCreator$createTeam$2", f = "ShooterInviteActionCreator.kt", l = {43, 50, 58}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ String B;

        /* renamed from: w  reason: collision with root package name */
        public Object f45007w;

        /* renamed from: x  reason: collision with root package name */
        public int f45008x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f45009y;

        @co.f(c = "com.dena.mirrorman.actioncreator.ShooterInviteActionCreator$createTeam$2$createTeamJob$1", f = "ShooterInviteActionCreator.kt", l = {33}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super ShooterUpdateTeamResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45011w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l0 f45012x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f45013y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, int i10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f45012x = l0Var;
                this.f45013y = i10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f45012x, this.f45013y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ShooterUpdateTeamResponse> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45011w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45012x.f45004x;
                    int i11 = this.f45013y;
                    this.f45011w = 1;
                    obj = mRRequest.createShooterTeam(i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrorman.actioncreator.ShooterInviteActionCreator$createTeam$2$matchingJob$1", f = "ShooterInviteActionCreator.kt", l = {39}, m = "invokeSuspend")
        /* renamed from: od.l0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0679b extends co.l implements io.p<uo.q0, ao.d<? super ShooterMatchingResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45014w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l0 f45015x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f45016y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0679b(l0 l0Var, String str, ao.d<? super C0679b> dVar) {
                super(2, dVar);
                this.f45015x = l0Var;
                this.f45016y = str;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0679b(this.f45015x, this.f45016y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ShooterMatchingResponse> dVar) {
                return ((C0679b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45014w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45015x.f45004x;
                    String str = this.f45016y;
                    this.f45014w = 1;
                    obj = mRRequest.getShooterMatching(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrorman.actioncreator.ShooterInviteActionCreator$createTeam$2$onlineUsersJob$1", f = "ShooterInviteActionCreator.kt", l = {36}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends co.l implements io.p<uo.q0, ao.d<? super ShooterOnlineUsersResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45017w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l0 f45018x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f45019y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(l0 l0Var, int i10, ao.d<? super c> dVar) {
                super(2, dVar);
                this.f45018x = l0Var;
                this.f45019y = i10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new c(this.f45018x, this.f45019y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ShooterOnlineUsersResponse> dVar) {
                return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45017w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45018x.f45004x;
                    int i11 = this.f45019y;
                    this.f45017w = 1;
                    obj = MRRequest.DefaultImpls.getShooterOnlineUsers$default(mRRequest, i11, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.A = i10;
            this.B = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.A, this.B, dVar);
            bVar.f45009y = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00d1 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: od.l0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterInviteActionCreator$loadNextViewers$1", f = "ShooterInviteActionCreator.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45020w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f45022y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f45023z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, long j10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45022y = i10;
            this.f45023z = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45022y, this.f45023z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45020w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = l0.this.f45004x;
                    int i11 = this.f45022y;
                    Long e10 = co.b.e(this.f45023z);
                    this.f45020w = 1;
                    obj = mRRequest.getShooterOnlineUsers(i11, e10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ShooterOnlineUsersResponse shooterOnlineUsersResponse = (ShooterOnlineUsersResponse) obj;
                l0.this.f45003w.a(new z0.e(shooterOnlineUsersResponse.getViewers(), shooterOnlineUsersResponse.getNextCursor()));
            } catch (Throwable th2) {
                l0.this.f45003w.a(new z0.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterInviteActionCreator$reloadViewers$1", f = "ShooterInviteActionCreator.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45024w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f45026y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f45026y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f45026y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45024w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = l0.this.f45004x;
                    int i11 = this.f45026y;
                    this.f45024w = 1;
                    obj = MRRequest.DefaultImpls.getShooterOnlineUsers$default(mRRequest, i11, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ShooterOnlineUsersResponse shooterOnlineUsersResponse = (ShooterOnlineUsersResponse) obj;
                l0.this.f45003w.a(new z0.e(shooterOnlineUsersResponse.getViewers(), shooterOnlineUsersResponse.getNextCursor()));
            } catch (Throwable th2) {
                l0.this.f45003w.a(new z0.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterInviteActionCreator$updateInviteViewerStatus$1", f = "ShooterInviteActionCreator.kt", l = {109}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ ShooterMemberStatus B;

        /* renamed from: w  reason: collision with root package name */
        public int f45027w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f45029y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f45030z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, int i11, String str, ShooterMemberStatus shooterMemberStatus, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f45029y = i10;
            this.f45030z = i11;
            this.A = str;
            this.B = shooterMemberStatus;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f45029y, this.f45030z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            e eVar2 = this;
            Object c10 = bo.c.c();
            int i10 = eVar2.f45027w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = l0.this.f45004x;
                    int i11 = eVar2.f45029y;
                    int i12 = eVar2.f45030z;
                    String str = eVar2.A;
                    int rawValue = eVar2.B.getRawValue();
                    eVar2.f45027w = 1;
                    eVar2 = null;
                    try {
                        if (MRRequest.DefaultImpls.updateShooterMemberStatus$default(mRRequest, i11, i12, str, rawValue, null, null, null, null, null, null, null, null, null, null, this, 16368, null) == c10) {
                            return c10;
                        }
                        eVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = this;
                        l0.this.f45003w.a(new z0.f(MRErrorKt.convertMRException(th).getError()));
                        return wn.v.f59242a;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    eVar = eVar2;
                }
                try {
                    l0.this.f45003w.a(new z0.h(eVar.A, eVar.B));
                } catch (Throwable th3) {
                    th = th3;
                    l0.this.f45003w.a(new z0.f(MRErrorKt.convertMRException(th).getError()));
                    return wn.v.f59242a;
                }
            } catch (Throwable th4) {
                th = th4;
                eVar = eVar2;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterInviteActionCreator$updateTeamStatus$1", f = "ShooterInviteActionCreator.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ ShooterTeamStatus A;

        /* renamed from: w  reason: collision with root package name */
        public int f45031w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f45033y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f45034z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, int i11, ShooterTeamStatus shooterTeamStatus, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f45033y = i10;
            this.f45034z = i11;
            this.A = shooterTeamStatus;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f45033y, this.f45034z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45031w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = l0.this.f45004x;
                    int i11 = this.f45033y;
                    int i12 = this.f45034z;
                    int rawValue = this.A.getRawValue();
                    this.f45031w = 1;
                    obj = MRRequest.DefaultImpls.updateShooterTeamStatus$default(mRRequest, i11, i12, rawValue, null, null, this, 24, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                l0.this.f45003w.a(new z0.o((ShooterUpdateTeamResponse) obj));
            } catch (Throwable th2) {
                l0.this.f45003w.a(new z0.n(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public l0(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45003w = aVar;
        this.f45004x = mRRequest;
        this.f45005y = uo.r0.b();
    }

    public final void c(String str) {
        jo.p.h(str, "userId");
        this.f45003w.a(new z0.j(str));
    }

    public final void d(String str, int i10) {
        jo.p.h(str, "referer");
        this.f45003w.a(z0.m.f47393a);
        uo.l.d(this, new a(uo.l0.f56050r, this), null, new b(i10, str, null), 2, null);
    }

    public final void e(String str) {
        jo.p.h(str, "userId");
        this.f45003w.a(new z0.k(str));
    }

    public final void f(int i10, long j10) {
        this.f45003w.a(z0.i.f47389a);
        uo.l.d(this, null, null, new c(i10, j10, null), 3, null);
    }

    public final void g(String str) {
        jo.p.h(str, "userId");
        this.f45003w.a(new z0.l(str));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45005y.getCoroutineContext();
    }

    public final void h(int i10) {
        this.f45003w.a(z0.m.f47393a);
        uo.l.d(this, null, null, new d(i10, null), 3, null);
    }

    public final void i(int i10, int i11, String str, ShooterMemberStatus shooterMemberStatus) {
        jo.p.h(str, "userId");
        jo.p.h(shooterMemberStatus, "nextStatus");
        this.f45003w.a(new z0.g(shooterMemberStatus));
        uo.l.d(this, null, null, new e(i10, i11, str, shooterMemberStatus, null), 3, null);
    }

    public final void j(int i10, int i11, ShooterTeamStatus shooterTeamStatus) {
        jo.p.h(shooterTeamStatus, "teamStatus");
        uo.l.d(this, null, null, new f(i10, i11, shooterTeamStatus, null), 3, null);
    }
}
