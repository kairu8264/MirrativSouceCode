package zb;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.live.CollabInvitableUsersResponse;
import com.dena.mirrorman.net.api.response.user.CollabInvitableUser;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import kf.x;
import pd.h;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class d implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final MRRequest f62971w;

    /* renamed from: x  reason: collision with root package name */
    public final q8.a f62972x;

    /* renamed from: y  reason: collision with root package name */
    public final x f62973y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ da.b f62974z;

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersActionCreator$inviteCollab$1", f = "CollabCandidateViewersActionCreator.kt", l = {52, 53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ CollabInvitableUser A;
        public final /* synthetic */ CollabType B;

        /* renamed from: w  reason: collision with root package name */
        public int f62975w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f62977y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f62978z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, CollabInvitableUser collabInvitableUser, CollabType collabType, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f62977y = str;
            this.f62978z = str2;
            this.A = collabInvitableUser;
            this.B = collabType;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f62977y, this.f62978z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:6:0x000e, B:21:0x0057, B:22:0x0070, B:24:0x0076, B:26:0x0090, B:27:0x0094, B:10:0x001a, B:18:0x0044, B:15:0x0024), top: B:32:0x0008 }] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f62975w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L1e
                goto L57
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L1e
                goto L44
            L1e:
                r11 = move-exception
                goto L9d
            L21:
                wn.m.b(r11)
                zb.d r11 = zb.d.this     // Catch: java.lang.Throwable -> L1e
                com.dena.mirrorman.net.retrofit.MRRequest r4 = zb.d.b(r11)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r5 = r10.f62977y     // Catch: java.lang.Throwable -> L1e
                java.lang.String r6 = r10.f62978z     // Catch: java.lang.Throwable -> L1e
                com.dena.mirrorman.net.api.response.user.CollabInvitableUser r11 = r10.A     // Catch: java.lang.Throwable -> L1e
                java.lang.String r7 = r11.getUserId()     // Catch: java.lang.Throwable -> L1e
                com.dena.mirrorman.net.api.response.CollabType r11 = r10.B     // Catch: java.lang.Throwable -> L1e
                int r8 = r11.getRawValue()     // Catch: java.lang.Throwable -> L1e
                r10.f62975w = r3     // Catch: java.lang.Throwable -> L1e
                r9 = r10
                java.lang.Object r11 = r4.postInviteCollab(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1e
                if (r11 != r0) goto L44
                return r0
            L44:
                zb.d r11 = zb.d.this     // Catch: java.lang.Throwable -> L1e
                com.dena.mirrorman.net.retrofit.MRRequest r11 = zb.d.b(r11)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r1 = r10.f62977y     // Catch: java.lang.Throwable -> L1e
                java.lang.String r4 = r10.f62978z     // Catch: java.lang.Throwable -> L1e
                r10.f62975w = r2     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r11 = r11.getCollaboratingUsers(r1, r4, r10)     // Catch: java.lang.Throwable -> L1e
                if (r11 != r0) goto L57
                return r0
            L57:
                com.dena.mirrorman.net.api.response.live.LiveOnlineUsersResponse r11 = (com.dena.mirrorman.net.api.response.live.LiveOnlineUsersResponse) r11     // Catch: java.lang.Throwable -> L1e
                zb.d r0 = zb.d.this     // Catch: java.lang.Throwable -> L1e
                q8.a r0 = zb.d.a(r0)     // Catch: java.lang.Throwable -> L1e
                com.dena.mirrorman.net.api.response.user.CollabInvitableUser r1 = r10.A     // Catch: java.lang.Throwable -> L1e
                java.util.List r11 = r11.getUsers()     // Catch: java.lang.Throwable -> L1e
                zb.d r2 = zb.d.this     // Catch: java.lang.Throwable -> L1e
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
                r4.<init>()     // Catch: java.lang.Throwable -> L1e
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L1e
            L70:
                boolean r5 = r11.hasNext()     // Catch: java.lang.Throwable -> L1e
                if (r5 == 0) goto L94
                java.lang.Object r5 = r11.next()     // Catch: java.lang.Throwable -> L1e
                r6 = r5
                com.dena.mirrorman.net.api.response.user.LiveViewingUser r6 = (com.dena.mirrorman.net.api.response.user.LiveViewingUser) r6     // Catch: java.lang.Throwable -> L1e
                java.lang.String r6 = r6.getUserId()     // Catch: java.lang.Throwable -> L1e
                kf.x r7 = zb.d.c(r2)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r7 = r7.T4()     // Catch: java.lang.Throwable -> L1e
                boolean r6 = jo.p.c(r6, r7)     // Catch: java.lang.Throwable -> L1e
                r6 = r6 ^ r3
                if (r6 == 0) goto L70
                r4.add(r5)     // Catch: java.lang.Throwable -> L1e
                goto L70
            L94:
                pd.h$c r11 = new pd.h$c     // Catch: java.lang.Throwable -> L1e
                r11.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1e
                r0.a(r11)     // Catch: java.lang.Throwable -> L1e
                goto Lb3
            L9d:
                zb.d r0 = zb.d.this
                q8.a r0 = zb.d.a(r0)
                pd.h$a r1 = new pd.h$a
                com.dena.mirrativ.mirrativapi.core.MRException r11 = com.dena.mirrativ.mirrativapi.core.MRErrorKt.convertMRException(r11)
                com.dena.mirrativ.mirrativapi.core.MRError r11 = r11.getError()
                r1.<init>(r11)
                r0.a(r1)
            Lb3:
                wn.v r11 = wn.v.f59242a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: zb.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersActionCreator$loadNextViewers$1", f = "CollabCandidateViewersActionCreator.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f62979w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f62981y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f62982z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f62981y = str;
            this.f62982z = str2;
            this.A = i10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f62981y, this.f62982z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62979w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = d.this.f62971w;
                    String str = this.f62981y;
                    String str2 = this.f62982z;
                    Integer d10 = co.b.d(this.A);
                    this.f62979w = 1;
                    obj = mRRequest.getInvitableUsers(str, str2, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                CollabInvitableUsersResponse collabInvitableUsersResponse = (CollabInvitableUsersResponse) obj;
                d.this.f62972x.a(new h.d(collabInvitableUsersResponse.getUsers(), collabInvitableUsersResponse.getPaging().getNextPage()));
            } catch (Throwable th2) {
                d.this.f62972x.a(new h.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersActionCreator$reloadViewers$1", f = "CollabCandidateViewersActionCreator.kt", l = {23}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62983w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f62985y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f62986z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f62985y = str;
            this.f62986z = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f62985y, this.f62986z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62983w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = d.this.f62971w;
                    String str = this.f62985y;
                    String str2 = this.f62986z;
                    this.f62983w = 1;
                    obj = MRRequest.DefaultImpls.getInvitableUsers$default(mRRequest, str, str2, null, this, 4, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                CollabInvitableUsersResponse collabInvitableUsersResponse = (CollabInvitableUsersResponse) obj;
                d.this.f62972x.a(new h.f(collabInvitableUsersResponse.getUsers(), collabInvitableUsersResponse.getPaging().getNextPage()));
            } catch (Throwable th2) {
                d.this.f62972x.a(new h.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public d(MRRequest mRRequest, q8.a aVar, x xVar) {
        jo.p.h(mRRequest, "request");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(xVar, "userPreference");
        this.f62971w = mRRequest;
        this.f62972x = aVar;
        this.f62973y = xVar;
        this.f62974z = new da.b();
    }

    public final void d(String str, String str2, CollabInvitableUser collabInvitableUser, CollabType collabType) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        jo.p.h(collabInvitableUser, "collabInvitableUser");
        jo.p.h(collabType, "collabType");
        this.f62972x.a(h.C0716h.f46905a);
        uo.l.d(this, null, null, new a(str, str2, collabInvitableUser, collabType, null), 3, null);
    }

    public final void e(String str, String str2, int i10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        this.f62972x.a(h.e.f46901a);
        uo.l.d(this, null, null, new b(str, str2, i10, null), 3, null);
    }

    public final void f(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        this.f62972x.a(h.g.f46904a);
        uo.l.d(this, null, null, new c(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f62974z.getCoroutineContext();
    }
}
