package u8;

import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrorman.clientlog.logs.UrgeUsers;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.MissionStatusResponse;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import com.dena.mirrorman.net.retrofit.MRRequest;
import ep.c0;
import hf.h0;
import hf.v0;
import io.p;
import java.util.List;
import pd.n;
import pd.s;
import ud.h2;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import wn.m;
import wn.v;
import xn.a0;

/* loaded from: classes.dex */
public final class a implements q0 {
    public b0 A;
    public final ao.g B;
    public final String C;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f54604w;

    /* renamed from: x  reason: collision with root package name */
    public final v0 f54605x;

    /* renamed from: y  reason: collision with root package name */
    public final MRRequest f54606y;

    /* renamed from: z  reason: collision with root package name */
    public final h0 f54607z;

    @co.f(c = "com.dena.mirrativ.catalog.follow.FollowCatalogActionCreator$bulkFollow$1", f = "FollowCatalogActionCreator.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: u8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0858a extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54608w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<String> f54610y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0858a(List<String> list, ao.d<? super C0858a> dVar) {
            super(2, dVar);
            this.f54610y = list;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0858a(this.f54610y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0858a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f54608w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = a.this.f54606y;
                    String str = a.this.C + Referer.URGE_USERS;
                    c0 graphBulkFollowBody = ApiUtil.INSTANCE.graphBulkFollowBody(this.f54610y);
                    this.f54608w = 1;
                    if (mRRequest.postGraphBulkFollow(str, graphBulkFollowBody, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f54604w.a(n.a.f47075a);
                Puree.d(new UrgeUsers.Follow(a0.g0(this.f54610y, ",", null, null, 0, null, null, 62, null), a.this.C));
            } catch (Throwable unused) {
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.follow.FollowCatalogActionCreator$loadMissionStatus$1", f = "FollowCatalogActionCreator.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54611w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f54611w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = a.this.f54606y;
                    String str = a.this.C;
                    this.f54611w = 1;
                    obj = mRRequest.getMissionStatus(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f54604w.a(new n.c(h2.f54992e.a((MissionStatusResponse) obj)));
            } catch (Throwable unused) {
                a.this.f54604w.a(n.b.f47076a);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.follow.FollowCatalogActionCreator$loadRecommendUser$1", f = "FollowCatalogActionCreator.kt", l = {33}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54613w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f54613w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = a.this.f54606y;
                    String str = a.this.C;
                    this.f54613w = 1;
                    obj = mRRequest.getGraphUrgeUsers(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                Graph.UrgeUserList urgeUserList = (Graph.UrgeUserList) obj;
                for (UrgeUser urgeUser : urgeUserList.getUsers()) {
                    urgeUser.setRequestFollow(true);
                }
                a.this.f54604w.a(new n.d(urgeUserList));
            } catch (Throwable unused) {
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, v0 v0Var, MRRequest mRRequest, h0 h0Var) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(mRRequest, "request");
        jo.p.h(h0Var, "noticeRepository");
        this.f54604w = aVar;
        this.f54605x = v0Var;
        this.f54606y = mRRequest;
        this.f54607z = h0Var;
        b10 = i2.b(null, 1, null);
        this.A = b10;
        this.B = g1.b().plus(this.A);
        this.C = Referer.HOME_FOLLOW;
    }

    public final void d(List<String> list) {
        jo.p.h(list, "userIds");
        if (this.f54605x.l()) {
            uo.l.d(this, null, null, new C0858a(list, null), 3, null);
        } else {
            this.f54604w.a(n.e.f47079a);
        }
    }

    public final void e() {
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final d2 f() {
        d2 d10;
        d10 = uo.l.d(this, null, null, new c(null), 3, null);
        return d10;
    }

    public final void g() {
        this.f54607z.b();
        this.f54604w.a(new s.l(false));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B;
    }
}
