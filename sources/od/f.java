package od;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.live.LiveOnlineUsersResponse;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.UnityManager;
import java.util.ArrayList;
import java.util.List;
import pd.g;

/* loaded from: classes2.dex */
public final class f implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44844w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44845x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.x f44846y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f44847z;

    @co.f(c = "com.dena.mirrorman.actioncreator.CollabActionCreator$cancel$1", f = "CollabActionCreator.kt", l = {71}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44848w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44850y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jf.k f44851z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, jf.k kVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44850y = str;
            this.f44851z = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44850y, this.f44851z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44848w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f44845x;
                    String str = this.f44850y;
                    String name = this.f44851z.name();
                    this.f44848w = 1;
                    if (mRRequest.postCollabCancel(Referer.LIVE_VIEW, str, null, name, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Exception unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CollabActionCreator$close$1", f = "CollabActionCreator.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44852w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44854y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jf.k f44855z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, jf.k kVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44854y = str;
            this.f44855z = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44854y, this.f44855z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44852w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f44845x;
                    String str = this.f44854y;
                    String name = this.f44855z.name();
                    Integer d10 = co.b.d(this.f44855z.e() ? 1 : 0);
                    this.f44852w = 1;
                    if (mRRequest.postCollabClose(Referer.LIVE_VIEW, str, null, name, d10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Exception unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CollabActionCreator$endCollab$1", f = "CollabActionCreator.kt", l = {126, 139, 150}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public Object A;
        public Object B;
        public int C;
        public final /* synthetic */ List<jf.g> D;
        public final /* synthetic */ f E;
        public final /* synthetic */ String F;
        public final /* synthetic */ String G;
        public final /* synthetic */ jf.k H;

        /* renamed from: w  reason: collision with root package name */
        public Object f44856w;

        /* renamed from: x  reason: collision with root package name */
        public Object f44857x;

        /* renamed from: y  reason: collision with root package name */
        public Object f44858y;

        /* renamed from: z  reason: collision with root package name */
        public Object f44859z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<jf.g> list, f fVar, String str, String str2, jf.k kVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.D = list;
            this.E = fVar;
            this.F = str;
            this.G = str2;
            this.H = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.D, this.E, this.F, this.G, this.H, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[Catch: Exception -> 0x020e, TRY_LEAVE, TryCatch #1 {Exception -> 0x020e, blocks: (B:22:0x007a, B:24:0x0081), top: B:84:0x007a }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01e2 A[Catch: Exception -> 0x0209, TryCatch #5 {Exception -> 0x0209, blocks: (B:65:0x01c5, B:66:0x01dc, B:68:0x01e2, B:70:0x01fc, B:71:0x0200, B:56:0x016b, B:28:0x0098, B:31:0x00a1, B:43:0x00dc), top: B:91:0x016b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00dc -> B:57:0x019b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0164 -> B:91:0x016b). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 553
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: od.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CollabActionCreator$fetchCollabUserData$1", f = "CollabActionCreator.kt", l = {81}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44860w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44862y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f44863z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f44862y = str;
            this.f44863z = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f44862y, this.f44863z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44860w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f44845x;
                    String str = this.f44862y;
                    this.f44860w = 1;
                    obj = mRRequest.getCollaboratingUsers(Referer.LIVE_VIEW, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                q8.a aVar = f.this.f44844w;
                List<LiveViewingUser> users = ((LiveOnlineUsersResponse) obj).getUsers();
                f fVar = f.this;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : users) {
                    if (!jo.p.c(((LiveViewingUser) obj2).getUserId(), fVar.f44846y.T4())) {
                        arrayList.add(obj2);
                    }
                }
                aVar.a(new g.h(arrayList));
                if (this.f44863z) {
                    f.this.f44844w.a(g.d.f46856a);
                }
            } catch (Throwable th2) {
                g9.a aVar2 = g9.a.f32826a;
                aVar2.b("get collab user fetch Fail  onFailure : " + th2.getMessage(), new Object[0]);
                f.this.f44844w.a(new g.k(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CollabActionCreator$reconnect$1", f = "CollabActionCreator.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44864w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44866y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f44866y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f44866y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44864w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f44845x;
                    String str = this.f44866y;
                    int rawValue = CollabType.LIVE.getRawValue();
                    Integer d10 = co.b.d(1);
                    this.f44864w = 1;
                    if (mRRequest.postCollabRequest(Referer.LIVE_VIEW, str, rawValue, d10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                f.this.f44844w.a(g.q.f46870a);
            } catch (Throwable unused) {
                f.this.f44844w.a(new g.m(MRError.Network.INSTANCE));
            }
            return wn.v.f59242a;
        }
    }

    public f(q8.a aVar, MRRequest mRRequest, kf.x xVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(xVar, "userPreference");
        this.f44844w = aVar;
        this.f44845x = mRRequest;
        this.f44846y = xVar;
        this.f44847z = uo.r0.b();
    }

    public static /* synthetic */ void i(f fVar, String str, String str2, List list, jf.k kVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            kVar = null;
        }
        fVar.h(str, str2, list, kVar);
    }

    public final void d(String str, jf.k kVar) {
        jo.p.h(str, "liveId");
        jo.p.h(kVar, "reason");
        this.f44844w.a(new g.s(jf.j.CLOSED));
        uo.l.d(this, null, null, new a(str, kVar, null), 3, null);
    }

    public final void e(String str, jf.k kVar) {
        jo.p.h(str, "liveId");
        jo.p.h(kVar, "reason");
        this.f44844w.a(new g.s(jf.j.CLOSED));
        uo.l.d(this, null, null, new b(str, kVar, null), 3, null);
    }

    public final void f(String str) {
        jo.p.h(str, "userId");
        this.f44844w.a(new g.c(str));
    }

    public final void g(List<? extends LiveViewingUser> list, String str) {
        jo.p.h(list, "collaboratingUsers");
        jo.p.h(str, "disconnectUserId");
        this.f44844w.a(new g.e(str));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44847z.getCoroutineContext();
    }

    public final void h(String str, String str2, List<jf.g> list, jf.k kVar) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        jo.p.h(list, "endRequestParams");
        this.f44844w.a(g.p.f46869a);
        uo.l.d(this, null, null, new c(list, this, str2, str, kVar, null), 3, null);
    }

    public final void j(String str, boolean z10) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new d(str, z10, null), 3, null);
    }

    public final void k() {
        this.f44844w.a(g.i.f46861a);
        UnityManager.Companion.getInstance().getCollabAvatarManager().clear();
    }

    public final void l(jf.h hVar) {
        jo.p.h(hVar, "collabInfo");
        this.f44844w.a(new g.j(hVar));
    }

    public final void m(jf.p0 p0Var) {
        this.f44844w.a(new g.l(p0Var));
    }

    public final void n(String str) {
        jo.p.h(str, "hostLiveId");
        uo.l.d(this, null, null, new e(str, null), 3, null);
    }

    public final void o() {
        this.f44844w.a(g.o.f46868a);
    }

    public final void p(jf.k kVar) {
        jo.p.h(kVar, "reason");
        this.f44844w.a(new g.r(kVar));
    }

    public final void q(jf.j jVar) {
        jo.p.h(jVar, "collabStatus");
        this.f44844w.a(new g.s(jVar));
    }
}
