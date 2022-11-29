package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.PrivateLiveInvitationsResponse;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.dena.mirrorman.net.api.response.user.UserGroup;
import com.dena.mirrorman.net.api.response.user.UserGroupsResponse;
import com.dena.mirrorman.net.api.response.user.UsersResponse;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class c1 {

    /* loaded from: classes2.dex */
    public static final class a extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46681a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46681a = mRError;
        }

        public final MRError a() {
            return this.f46681a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46681a, ((a) obj).f46681a);
        }

        public int hashCode() {
            return this.f46681a.hashCode();
        }

        public String toString() {
            return "ErrorOnOnGetInitialData(error=" + this.f46681a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46682a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46682a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46682a, ((b) obj).f46682a);
        }

        public int hashCode() {
            return this.f46682a.hashCode();
        }

        public String toString() {
            return "ErrorOnPostPrivateLiveInvitations(error=" + this.f46682a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46683a = mRError;
        }

        public final MRError a() {
            return this.f46683a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46683a, ((c) obj).f46683a);
        }

        public int hashCode() {
            return this.f46683a.hashCode();
        }

        public String toString() {
            return "ErrorOnSearchUser(error=" + this.f46683a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46684a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46684a = mRError;
        }

        public final MRError a() {
            return this.f46684a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f46684a, ((d) obj).f46684a);
        }

        public int hashCode() {
            return this.f46684a.hashCode();
        }

        public String toString() {
            return "FailedToLiveCreate(error=" + this.f46684a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public final ye.c f46685a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ye.c cVar) {
            super(null);
            jo.p.h(cVar, "recordRequestParams");
            this.f46685a = cVar;
        }

        public final ye.c a() {
            return this.f46685a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46685a, ((e) obj).f46685a);
        }

        public int hashCode() {
            return this.f46685a.hashCode();
        }

        public String toString() {
            return "FinishToLiveCreate(recordRequestParams=" + this.f46685a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public final PrivateLiveInvitationsResponse f46686a;

        /* renamed from: b  reason: collision with root package name */
        public final UserGroupsResponse f46687b;

        /* renamed from: c  reason: collision with root package name */
        public final UsersResponse f46688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PrivateLiveInvitationsResponse privateLiveInvitationsResponse, UserGroupsResponse userGroupsResponse, UsersResponse usersResponse) {
            super(null);
            jo.p.h(privateLiveInvitationsResponse, "invitationsRes");
            jo.p.h(userGroupsResponse, "groupRes");
            jo.p.h(usersResponse, "userRes");
            this.f46686a = privateLiveInvitationsResponse;
            this.f46687b = userGroupsResponse;
            this.f46688c = usersResponse;
        }

        public final UserGroupsResponse a() {
            return this.f46687b;
        }

        public final PrivateLiveInvitationsResponse b() {
            return this.f46686a;
        }

        public final UsersResponse c() {
            return this.f46688c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return jo.p.c(this.f46686a, fVar.f46686a) && jo.p.c(this.f46687b, fVar.f46687b) && jo.p.c(this.f46688c, fVar.f46688c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f46686a.hashCode() * 31) + this.f46687b.hashCode()) * 31) + this.f46688c.hashCode();
        }

        public String toString() {
            return "FinishedOnOnGetInitialData(invitationsRes=" + this.f46686a + ", groupRes=" + this.f46687b + ", userRes=" + this.f46688c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public final UsersResponse f46689a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(UsersResponse usersResponse) {
            super(null);
            jo.p.h(usersResponse, "userResponse");
            this.f46689a = usersResponse;
        }

        public final UsersResponse a() {
            return this.f46689a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46689a, ((g) obj).f46689a);
        }

        public int hashCode() {
            return this.f46689a.hashCode();
        }

        public String toString() {
            return "FinishedOnSearchUser(userResponse=" + this.f46689a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public static final h f46690a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f46691a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public static final j f46692a = new j();

        public j() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends c1 {

        /* renamed from: a  reason: collision with root package name */
        public final List<UserGroup> f46693a;

        /* renamed from: b  reason: collision with root package name */
        public final List<UserBasicParams> f46694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(List<UserGroup> list, List<? extends UserBasicParams> list2) {
            super(null);
            jo.p.h(list, "invitedGroups");
            jo.p.h(list2, "invitedUsers");
            this.f46693a = list;
            this.f46694b = list2;
        }

        public final List<UserGroup> a() {
            return this.f46693a;
        }

        public final List<UserBasicParams> b() {
            return this.f46694b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return jo.p.c(this.f46693a, kVar.f46693a) && jo.p.c(this.f46694b, kVar.f46694b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46693a.hashCode() * 31) + this.f46694b.hashCode();
        }

        public String toString() {
            return "UpdateGroupCheckStatus(invitedGroups=" + this.f46693a + ", invitedUsers=" + this.f46694b + ')';
        }
    }

    public c1() {
    }

    public /* synthetic */ c1(jo.h hVar) {
        this();
    }
}
