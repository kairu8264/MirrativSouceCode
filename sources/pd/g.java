package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g {

    /* loaded from: classes2.dex */
    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public final String f46853a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46853a = str;
        }

        public final String a() {
            return this.f46853a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46853a, ((a) obj).f46853a);
        }

        public int hashCode() {
            return this.f46853a.hashCode();
        }

        public String toString() {
            return "CanceledCollab(userId=" + this.f46853a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final String f46854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46854a = str;
        }

        public final String a() {
            return this.f46854a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46854a, ((b) obj).f46854a);
        }

        public int hashCode() {
            return this.f46854a.hashCode();
        }

        public String toString() {
            return "ClosedCollab(userId=" + this.f46854a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends g {

        /* renamed from: a  reason: collision with root package name */
        public final String f46855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46855a = str;
        }

        public final String a() {
            return this.f46855a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46855a, ((c) obj).f46855a);
        }

        public int hashCode() {
            return this.f46855a.hashCode();
        }

        public String toString() {
            return "ConnectCollab(userId=" + this.f46855a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f46856a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final String f46857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            jo.p.h(str, "disconnectedUserId");
            this.f46857a = str;
        }

        public final String a() {
            return this.f46857a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46857a, ((e) obj).f46857a);
        }

        public int hashCode() {
            return this.f46857a.hashCode();
        }

        public String toString() {
            return "DisconnectCollab(disconnectedUserId=" + this.f46857a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends g {

        /* renamed from: a  reason: collision with root package name */
        public final List<LiveViewingUser> f46858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends LiveViewingUser> list) {
            super(null);
            jo.p.h(list, "collaboratingUsers");
            this.f46858a = list;
        }

        public final List<LiveViewingUser> a() {
            return this.f46858a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f46858a, ((f) obj).f46858a);
        }

        public int hashCode() {
            return this.f46858a.hashCode();
        }

        public String toString() {
            return "EndedCollab(collaboratingUsers=" + this.f46858a + ')';
        }
    }

    /* renamed from: pd.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0715g extends g {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0715g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46859a = mRError;
        }

        public final MRError a() {
            return this.f46859a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0715g) && jo.p.c(this.f46859a, ((C0715g) obj).f46859a);
        }

        public int hashCode() {
            return this.f46859a.hashCode();
        }

        public String toString() {
            return "FailedEndCollab(error=" + this.f46859a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends g {

        /* renamed from: a  reason: collision with root package name */
        public final List<LiveViewingUser> f46860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(List<? extends LiveViewingUser> list) {
            super(null);
            jo.p.h(list, "collaboratingUsers");
            this.f46860a = list;
        }

        public final List<LiveViewingUser> a() {
            return this.f46860a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f46860a, ((h) obj).f46860a);
        }

        public int hashCode() {
            return this.f46860a.hashCode();
        }

        public String toString() {
            return "FetchedCollaboratingUsers(collaboratingUsers=" + this.f46860a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final i f46861a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends g {

        /* renamed from: a  reason: collision with root package name */
        public final jf.h f46862a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(jf.h hVar) {
            super(null);
            jo.p.h(hVar, "collabInfo");
            this.f46862a = hVar;
        }

        public final jf.h a() {
            return this.f46862a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f46862a, ((j) obj).f46862a);
        }

        public int hashCode() {
            return this.f46862a.hashCode();
        }

        public String toString() {
            return "LoadCollabInfo(collabInfo=" + this.f46862a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends g {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46863a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46863a = mRError;
        }

        public final MRError a() {
            return this.f46863a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f46863a, ((k) obj).f46863a);
        }

        public int hashCode() {
            return this.f46863a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f46863a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends g {

        /* renamed from: a  reason: collision with root package name */
        public final jf.p0 f46864a;

        public l(jf.p0 p0Var) {
            super(null);
            this.f46864a = p0Var;
        }

        public final jf.p0 a() {
            return this.f46864a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f46864a, ((l) obj).f46864a);
        }

        public int hashCode() {
            jf.p0 p0Var = this.f46864a;
            if (p0Var == null) {
                return 0;
            }
            return p0Var.hashCode();
        }

        public String toString() {
            return "LoadReconnectCollabInfo(reconnectCollabInfo=" + this.f46864a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends g {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46865a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46865a = mRError;
        }

        public final MRError a() {
            return this.f46865a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f46865a, ((m) obj).f46865a);
        }

        public int hashCode() {
            return this.f46865a.hashCode();
        }

        public String toString() {
            return "ReconnectFailed(error=" + this.f46865a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends g {

        /* renamed from: a  reason: collision with root package name */
        public final String f46866a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f46867b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, boolean z10) {
            super(null);
            jo.p.h(str, "liveId");
            this.f46866a = str;
            this.f46867b = z10;
        }

        public final String a() {
            return this.f46866a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return jo.p.c(this.f46866a, nVar.f46866a) && this.f46867b == nVar.f46867b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f46866a.hashCode() * 31;
            boolean z10 = this.f46867b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "ShowCollabLive(liveId=" + this.f46866a + ", fource=" + this.f46867b + ')';
        }

        public /* synthetic */ n(String str, boolean z10, int i10, jo.h hVar) {
            this(str, (i10 & 2) != 0 ? false : z10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final o f46868a = new o();

        public o() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final p f46869a = new p();

        public p() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final q f46870a = new q();

        public q() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends g {

        /* renamed from: a  reason: collision with root package name */
        public final jf.k f46871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(jf.k kVar) {
            super(null);
            jo.p.h(kVar, "reason");
            this.f46871a = kVar;
        }

        public final jf.k a() {
            return this.f46871a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f46871a == ((r) obj).f46871a;
        }

        public int hashCode() {
            return this.f46871a.hashCode();
        }

        public String toString() {
            return "StopCollab(reason=" + this.f46871a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends g {

        /* renamed from: a  reason: collision with root package name */
        public final jf.j f46872a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(jf.j jVar) {
            super(null);
            jo.p.h(jVar, "collabStatus");
            this.f46872a = jVar;
        }

        public final jf.j a() {
            return this.f46872a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f46872a == ((s) obj).f46872a;
        }

        public int hashCode() {
            return this.f46872a.hashCode();
        }

        public String toString() {
            return "UpdateCollabStatus(collabStatus=" + this.f46872a + ')';
        }
    }

    public g() {
    }

    public /* synthetic */ g(jo.h hVar) {
        this();
    }
}
