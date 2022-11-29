package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateTeamResponse;
import com.dena.mirrorman.net.api.response.event.ShooterViewingUser;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class z0 {

    /* loaded from: classes2.dex */
    public static final class a extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47379a = mRError;
        }

        public final MRError a() {
            return this.f47379a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47379a, ((a) obj).f47379a);
        }

        public int hashCode() {
            return this.f47379a.hashCode();
        }

        public String toString() {
            return "CreateTeamFailed(error=" + this.f47379a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterUpdateTeamResponse f47380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ShooterUpdateTeamResponse shooterUpdateTeamResponse) {
            super(null);
            jo.p.h(shooterUpdateTeamResponse, "response");
            this.f47380a = shooterUpdateTeamResponse;
        }

        public final ShooterUpdateTeamResponse a() {
            return this.f47380a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47380a, ((b) obj).f47380a);
        }

        public int hashCode() {
            return this.f47380a.hashCode();
        }

        public String toString() {
            return "CreateTeamSucceeded(response=" + this.f47380a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterMatchingResponse f47381a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ShooterMatchingResponse shooterMatchingResponse) {
            super(null);
            jo.p.h(shooterMatchingResponse, "response");
            this.f47381a = shooterMatchingResponse;
        }

        public final ShooterMatchingResponse a() {
            return this.f47381a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47381a, ((c) obj).f47381a);
        }

        public int hashCode() {
            return this.f47381a.hashCode();
        }

        public String toString() {
            return "FetchMatchingSucceeded(response=" + this.f47381a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47382a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47382a = mRError;
        }

        public final MRError a() {
            return this.f47382a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47382a, ((d) obj).f47382a);
        }

        public int hashCode() {
            return this.f47382a.hashCode();
        }

        public String toString() {
            return "FetchViewersFailed(error=" + this.f47382a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<ShooterViewingUser> f47383a;

        /* renamed from: b  reason: collision with root package name */
        public final long f47384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<ShooterViewingUser> list, long j10) {
            super(null);
            jo.p.h(list, "viewers");
            this.f47383a = list;
            this.f47384b = j10;
        }

        public final long a() {
            return this.f47384b;
        }

        public final List<ShooterViewingUser> b() {
            return this.f47383a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return jo.p.c(this.f47383a, eVar.f47383a) && this.f47384b == eVar.f47384b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f47383a.hashCode() * 31) + Long.hashCode(this.f47384b);
        }

        public String toString() {
            return "FetchViewersSucceeded(viewers=" + this.f47383a + ", nextPage=" + this.f47384b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47385a = mRError;
        }

        public final MRError a() {
            return this.f47385a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47385a, ((f) obj).f47385a);
        }

        public int hashCode() {
            return this.f47385a.hashCode();
        }

        public String toString() {
            return "InviteUserFailed(error=" + this.f47385a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterMemberStatus f47386a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ShooterMemberStatus shooterMemberStatus) {
            super(null);
            jo.p.h(shooterMemberStatus, "status");
            this.f47386a = shooterMemberStatus;
        }

        public final ShooterMemberStatus a() {
            return this.f47386a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f47386a == ((g) obj).f47386a;
        }

        public int hashCode() {
            return this.f47386a.hashCode();
        }

        public String toString() {
            return "InviteUserStarted(status=" + this.f47386a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47387a;

        /* renamed from: b  reason: collision with root package name */
        public final ShooterMemberStatus f47388b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, ShooterMemberStatus shooterMemberStatus) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(shooterMemberStatus, "status");
            this.f47387a = str;
            this.f47388b = shooterMemberStatus;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return jo.p.c(this.f47387a, hVar.f47387a) && this.f47388b == hVar.f47388b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f47387a.hashCode() * 31) + this.f47388b.hashCode();
        }

        public String toString() {
            return "InviteUserSucceeded(userId=" + this.f47387a + ", status=" + this.f47388b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f47389a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47390a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f47390a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f47390a, ((j) obj).f47390a);
        }

        public int hashCode() {
            return this.f47390a.hashCode();
        }

        public String toString() {
            return "RejectUserCanceled(userId=" + this.f47390a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47391a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f47391a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f47391a, ((k) obj).f47391a);
        }

        public int hashCode() {
            return this.f47391a.hashCode();
        }

        public String toString() {
            return "RejectUserFinished(userId=" + this.f47391a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47392a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f47392a = str;
        }

        public final String a() {
            return this.f47392a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f47392a, ((l) obj).f47392a);
        }

        public int hashCode() {
            return this.f47392a.hashCode();
        }

        public String toString() {
            return "RejectUserStarted(userId=" + this.f47392a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public static final m f47393a = new m();

        public m() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47394a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47394a = mRError;
        }

        public final MRError a() {
            return this.f47394a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && jo.p.c(this.f47394a, ((n) obj).f47394a);
        }

        public int hashCode() {
            return this.f47394a.hashCode();
        }

        public String toString() {
            return "UpdateTeamFailed(error=" + this.f47394a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends z0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterUpdateTeamResponse f47395a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ShooterUpdateTeamResponse shooterUpdateTeamResponse) {
            super(null);
            jo.p.h(shooterUpdateTeamResponse, "response");
            this.f47395a = shooterUpdateTeamResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && jo.p.c(this.f47395a, ((o) obj).f47395a);
        }

        public int hashCode() {
            return this.f47395a.hashCode();
        }

        public String toString() {
            return "UpdateTeamSucceeded(response=" + this.f47395a + ')';
        }
    }

    public z0() {
    }

    public /* synthetic */ z0(jo.h hVar) {
        this();
    }
}
