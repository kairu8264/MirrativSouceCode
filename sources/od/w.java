package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.PrivateLiveInvitationsResponse;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.dena.mirrorman.net.api.response.user.UserGroup;
import com.dena.mirrorman.net.api.response.user.UserGroupsResponse;
import com.dena.mirrorman.net.api.response.user.UsersResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.List;
import pd.c1;
import uo.l0;

/* loaded from: classes2.dex */
public final class w implements uo.q0 {
    public final /* synthetic */ uo.q0 A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45319w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45320x;

    /* renamed from: y  reason: collision with root package name */
    public final hf.l f45321y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.d0 f45322z;

    @co.f(c = "com.dena.mirrorman.actioncreator.LivePrepareForFriendActionCreator$createLive$1", f = "LivePrepareForFriendActionCreator.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45323w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45323w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = w.this.f45320x;
                    this.f45323w = 1;
                    obj = mRRequest.postLiveCreate(Referer.Broadcast.SETTING, 1, 0, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveOwnedResponse liveOwnedResponse = (LiveOwnedResponse) obj;
                w.this.f45322z.d(liveOwnedResponse);
                w.this.f45319w.a(new c1.e(w.this.f45321y.a(liveOwnedResponse)));
            } catch (Exception e10) {
                w.this.f45319w.a(new c1.d(MRErrorKt.convertMRException(e10).getError()));
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ w f45325w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.a aVar, w wVar) {
            super(aVar);
            this.f45325w = wVar;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            this.f45325w.f45319w.a(new c1.a(MRErrorKt.convertMRException(th2).getError()));
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LivePrepareForFriendActionCreator$getInitialData$2", f = "LivePrepareForFriendActionCreator.kt", l = {43, 44, 45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public Object f45326w;

        /* renamed from: x  reason: collision with root package name */
        public int f45327x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f45328y;

        @co.f(c = "com.dena.mirrorman.actioncreator.LivePrepareForFriendActionCreator$getInitialData$2$groupJob$1", f = "LivePrepareForFriendActionCreator.kt", l = {32}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super UserGroupsResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45330w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ w f45331x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f45332y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, String str, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f45331x = wVar;
                this.f45332y = str;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f45331x, this.f45332y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super UserGroupsResponse> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45330w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45331x.f45320x;
                    String str = this.f45332y;
                    Integer d10 = co.b.d(0);
                    this.f45330w = 1;
                    obj = mRRequest.getUserGroups(str, d10, this);
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

        @co.f(c = "com.dena.mirrorman.actioncreator.LivePrepareForFriendActionCreator$getInitialData$2$invitationJob$1", f = "LivePrepareForFriendActionCreator.kt", l = {33}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super PrivateLiveInvitationsResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45333w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ w f45334x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f45335y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(w wVar, String str, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f45334x = wVar;
                this.f45335y = str;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f45334x, this.f45335y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super PrivateLiveInvitationsResponse> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45333w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45334x.f45320x;
                    String str = this.f45335y;
                    this.f45333w = 1;
                    obj = mRRequest.getUserPrivateLiveInvitations(str, this);
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

        @co.f(c = "com.dena.mirrorman.actioncreator.LivePrepareForFriendActionCreator$getInitialData$2$searchUserJob$1", f = "LivePrepareForFriendActionCreator.kt", l = {35}, m = "invokeSuspend")
        /* renamed from: od.w$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0681c extends co.l implements io.p<uo.q0, ao.d<? super UsersResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45336w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ w f45337x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f45338y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0681c(w wVar, String str, ao.d<? super C0681c> dVar) {
                super(2, dVar);
                this.f45337x = wVar;
                this.f45338y = str;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0681c(this.f45337x, this.f45338y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super UsersResponse> dVar) {
                return ((C0681c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45336w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45337x.f45320x;
                    String str = this.f45338y;
                    Integer d10 = co.b.d(1);
                    Integer d11 = co.b.d(1);
                    this.f45336w = 1;
                    obj = mRRequest.getSearchUsers(str, "", d10, d11, null, this);
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
        public c(String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.A = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.A, dVar);
            cVar.f45328y = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r14.f45327x
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3f
                if (r1 == r4) goto L33
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r14.f45326w
                com.dena.mirrorman.net.api.response.PrivateLiveInvitationsResponse r0 = (com.dena.mirrorman.net.api.response.PrivateLiveInvitationsResponse) r0
                java.lang.Object r1 = r14.f45328y
                com.dena.mirrorman.net.api.response.user.UserGroupsResponse r1 = (com.dena.mirrorman.net.api.response.user.UserGroupsResponse) r1
                wn.m.b(r15)
                goto Lac
            L1e:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L26:
                java.lang.Object r1 = r14.f45326w
                com.dena.mirrorman.net.api.response.user.UserGroupsResponse r1 = (com.dena.mirrorman.net.api.response.user.UserGroupsResponse) r1
                java.lang.Object r3 = r14.f45328y
                uo.y0 r3 = (uo.y0) r3
                wn.m.b(r15)
                goto L9b
            L33:
                java.lang.Object r1 = r14.f45326w
                uo.y0 r1 = (uo.y0) r1
                java.lang.Object r4 = r14.f45328y
                uo.y0 r4 = (uo.y0) r4
                wn.m.b(r15)
                goto L88
            L3f:
                wn.m.b(r15)
                java.lang.Object r15 = r14.f45328y
                uo.q0 r15 = (uo.q0) r15
                r6 = 0
                r7 = 0
                od.w$c$a r8 = new od.w$c$a
                od.w r1 = od.w.this
                java.lang.String r5 = r14.A
                r11 = 0
                r8.<init>(r1, r5, r11)
                r9 = 3
                r10 = 0
                r5 = r15
                uo.y0 r1 = uo.j.b(r5, r6, r7, r8, r9, r10)
                od.w$c$b r8 = new od.w$c$b
                od.w r5 = od.w.this
                java.lang.String r9 = r14.A
                r8.<init>(r5, r9, r11)
                r9 = 3
                r5 = r15
                uo.y0 r12 = uo.j.b(r5, r6, r7, r8, r9, r10)
                od.w$c$c r8 = new od.w$c$c
                od.w r5 = od.w.this
                java.lang.String r9 = r14.A
                r8.<init>(r5, r9, r11)
                r9 = 3
                r5 = r15
                uo.y0 r15 = uo.j.b(r5, r6, r7, r8, r9, r10)
                r14.f45328y = r12
                r14.f45326w = r15
                r14.f45327x = r4
                java.lang.Object r1 = r1.o(r14)
                if (r1 != r0) goto L84
                return r0
            L84:
                r4 = r12
                r13 = r1
                r1 = r15
                r15 = r13
            L88:
                com.dena.mirrorman.net.api.response.user.UserGroupsResponse r15 = (com.dena.mirrorman.net.api.response.user.UserGroupsResponse) r15
                r14.f45328y = r1
                r14.f45326w = r15
                r14.f45327x = r3
                java.lang.Object r3 = r4.o(r14)
                if (r3 != r0) goto L97
                return r0
            L97:
                r13 = r1
                r1 = r15
                r15 = r3
                r3 = r13
            L9b:
                com.dena.mirrorman.net.api.response.PrivateLiveInvitationsResponse r15 = (com.dena.mirrorman.net.api.response.PrivateLiveInvitationsResponse) r15
                r14.f45328y = r1
                r14.f45326w = r15
                r14.f45327x = r2
                java.lang.Object r2 = r3.o(r14)
                if (r2 != r0) goto Laa
                return r0
            Laa:
                r0 = r15
                r15 = r2
            Lac:
                com.dena.mirrorman.net.api.response.user.UsersResponse r15 = (com.dena.mirrorman.net.api.response.user.UsersResponse) r15
                od.w r2 = od.w.this
                q8.a r2 = od.w.b(r2)
                pd.c1$f r3 = new pd.c1$f
                r3.<init>(r0, r1, r15)
                r2.a(r3)
                wn.v r15 = wn.v.f59242a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: od.w.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LivePrepareForFriendActionCreator$searchUser$1", f = "LivePrepareForFriendActionCreator.kt", l = {54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45339w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45341y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45342z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f45341y = str;
            this.f45342z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f45341y, this.f45342z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45339w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = w.this.f45320x;
                    String str = this.f45341y;
                    String str2 = this.f45342z;
                    Integer d10 = co.b.d(1);
                    Integer d11 = co.b.d(1);
                    this.f45339w = 1;
                    obj = mRRequest.getSearchUsers(str, str2, d10, d11, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                w.this.f45319w.a(new c1.g((UsersResponse) obj));
            } catch (Throwable th2) {
                w.this.f45319w.a(new c1.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LivePrepareForFriendActionCreator$searchUserNext$1", f = "LivePrepareForFriendActionCreator.kt", l = {66}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f45343w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45345y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45346z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, int i10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f45345y = str;
            this.f45346z = str2;
            this.A = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f45345y, this.f45346z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45343w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = w.this.f45320x;
                    String str = this.f45345y;
                    String str2 = this.f45346z;
                    Integer d10 = co.b.d(this.A);
                    Integer d11 = co.b.d(1);
                    this.f45343w = 1;
                    obj = mRRequest.getSearchUsers(str, str2, d10, d11, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                w.this.f45319w.a(new c1.g((UsersResponse) obj));
            } catch (Throwable th2) {
                w.this.f45319w.a(new c1.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LivePrepareForFriendActionCreator$updatePrivateLiveInvitations$1", f = "LivePrepareForFriendActionCreator.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ List<UserGroup> B;
        public final /* synthetic */ List<UserBasicParams> C;

        /* renamed from: w  reason: collision with root package name */
        public int f45347w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<UserGroup> f45348x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<UserBasicParams> f45349y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ w f45350z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<UserGroup, CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f45351w = new a();

            public a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final CharSequence invoke(UserGroup userGroup) {
                jo.p.h(userGroup, "it");
                return userGroup.getId();
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.l<UserBasicParams, CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f45352w = new b();

            public b() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final CharSequence invoke(UserBasicParams userBasicParams) {
                jo.p.h(userBasicParams, "it");
                return userBasicParams.getUserId();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(List<UserGroup> list, List<? extends UserBasicParams> list2, w wVar, String str, List<UserGroup> list3, List<? extends UserBasicParams> list4, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f45348x = list;
            this.f45349y = list2;
            this.f45350z = wVar;
            this.A = str;
            this.B = list3;
            this.C = list4;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f45348x, this.f45349y, this.f45350z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object postUserUpdatePrivateLiveInvitations;
            Object c10 = bo.c.c();
            int i10 = this.f45347w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    String g02 = xn.a0.g0(this.f45348x, ",", null, null, 0, null, a.f45351w, 30, null);
                    String g03 = xn.a0.g0(this.f45349y, ",", null, null, 0, null, b.f45352w, 30, null);
                    MRRequest mRRequest = this.f45350z.f45320x;
                    String str = this.A;
                    Integer d10 = co.b.d(0);
                    this.f45347w = 1;
                    postUserUpdatePrivateLiveInvitations = mRRequest.postUserUpdatePrivateLiveInvitations(str, g02, g03, d10, this);
                    if (postUserUpdatePrivateLiveInvitations == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postUserUpdatePrivateLiveInvitations = obj;
                }
                PrivateLiveInvitationsResponse privateLiveInvitationsResponse = (PrivateLiveInvitationsResponse) postUserUpdatePrivateLiveInvitations;
            } catch (Throwable th2) {
                this.f45350z.f45319w.a(new c1.b(MRErrorKt.convertMRException(th2).getError()));
                this.f45350z.f45319w.a(new c1.k(this.B, this.C));
            }
            return wn.v.f59242a;
        }
    }

    public w(q8.a aVar, MRRequest mRRequest, hf.l lVar, hf.d0 d0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(lVar, "createRecordRequestParams");
        jo.p.h(d0Var, "liveHelper");
        this.f45319w = aVar;
        this.f45320x = mRRequest;
        this.f45321y = lVar;
        this.f45322z = d0Var;
        this.A = uo.r0.b();
    }

    public final void e() {
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final void f(String str) {
        jo.p.h(str, "referer");
        this.f45319w.a(c1.h.f46690a);
        uo.l.d(this, new b(uo.l0.f56050r, this), null, new c(str, null), 2, null);
    }

    public final void g(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "searchQuery");
        this.f45319w.a(c1.i.f46691a);
        uo.l.d(this, null, null, new d(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final void h(String str, String str2, int i10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "searchQuery");
        this.f45319w.a(c1.j.f46692a);
        uo.l.d(this, null, null, new e(str, str2, i10, null), 3, null);
    }

    public final void i(String str, List<UserGroup> list, List<? extends UserBasicParams> list2, List<UserGroup> list3, List<? extends UserBasicParams> list4) {
        jo.p.h(str, "referer");
        jo.p.h(list, "oldInvitedGroups");
        jo.p.h(list2, "oldInvitedUsers");
        jo.p.h(list3, "invitedGroups");
        jo.p.h(list4, "invitedUsers");
        this.f45319w.a(new c1.k(list3, list4));
        uo.l.d(this, null, null, new f(list3, list4, this, str, list, list2, null), 3, null);
    }
}
