package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.DashboardCatalog;

/* loaded from: classes2.dex */
public abstract class a0 {

    /* loaded from: classes2.dex */
    public static final class a extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46557a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            jo.p.h(str, "actionId");
            jo.p.h(str2, "userId");
            this.f46557a = str;
            this.f46558b = str2;
        }

        public String a() {
            return this.f46557a;
        }

        public final String b() {
            return this.f46558b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(a(), aVar.a()) && jo.p.c(this.f46558b, aVar.f46558b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46558b.hashCode();
        }

        public String toString() {
            return "FollowEvent(actionId=" + a() + ", userId=" + this.f46558b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46559a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            jo.p.h(str, "actionId");
            jo.p.h(str2, "userId");
            this.f46559a = str;
            this.f46560b = str2;
        }

        public String a() {
            return this.f46559a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(a(), bVar.a()) && jo.p.c(this.f46560b, bVar.f46560b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46560b.hashCode();
        }

        public String toString() {
            return "FollowStatusUpdateFailedEvent(actionId=" + a() + ", userId=" + this.f46560b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46561a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46562b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "actionId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46561a = str;
            this.f46562b = mRError;
        }

        public String a() {
            return this.f46561a;
        }

        public final MRError b() {
            return this.f46562b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(a(), cVar.a()) && jo.p.c(this.f46562b, cVar.f46562b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46562b.hashCode();
        }

        public String toString() {
            return "LoadFail(actionId=" + a() + ", error=" + this.f46562b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46563a;

        /* renamed from: b  reason: collision with root package name */
        public final DashboardCatalog f46564b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f46565c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f46566d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, DashboardCatalog dashboardCatalog, boolean z10, boolean z11) {
            super(null);
            jo.p.h(str, "actionId");
            jo.p.h(dashboardCatalog, "response");
            this.f46563a = str;
            this.f46564b = dashboardCatalog;
            this.f46565c = z10;
            this.f46566d = z11;
        }

        public String a() {
            return this.f46563a;
        }

        public final boolean b() {
            return this.f46566d;
        }

        public final DashboardCatalog c() {
            return this.f46564b;
        }

        public final boolean d() {
            return this.f46565c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return jo.p.c(a(), dVar.a()) && jo.p.c(this.f46564b, dVar.f46564b) && this.f46565c == dVar.f46565c && this.f46566d == dVar.f46566d;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((a().hashCode() * 31) + this.f46564b.hashCode()) * 31;
            boolean z10 = this.f46565c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.f46566d;
            return i11 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "LoadFinish(actionId=" + a() + ", response=" + this.f46564b + ", isReload=" + this.f46565c + ", asSmall=" + this.f46566d + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46567a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            jo.p.h(str, "actionId");
            this.f46567a = str;
        }

        public String a() {
            return this.f46567a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(a(), ((e) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "LoadNext(actionId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46568a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            jo.p.h(str, "actionId");
            this.f46568a = str;
        }

        public String a() {
            return this.f46568a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(a(), ((f) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "Reload(actionId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46569a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(null);
            jo.p.h(str, "actionId");
            jo.p.h(str2, "liveId");
            this.f46569a = str;
            this.f46570b = str2;
        }

        public String a() {
            return this.f46569a;
        }

        public final String b() {
            return this.f46570b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return jo.p.c(a(), gVar.a()) && jo.p.c(this.f46570b, gVar.f46570b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46570b.hashCode();
        }

        public String toString() {
            return "StartPreview(actionId=" + a() + ", liveId=" + this.f46570b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46571a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(null);
            jo.p.h(str, "actionId");
            jo.p.h(str2, "liveId");
            this.f46571a = str;
            this.f46572b = str2;
        }

        public String a() {
            return this.f46571a;
        }

        public final String b() {
            return this.f46572b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return jo.p.c(a(), hVar.a()) && jo.p.c(this.f46572b, hVar.f46572b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46572b.hashCode();
        }

        public String toString() {
            return "StopPreview(actionId=" + a() + ", liveId=" + this.f46572b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46573a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2) {
            super(null);
            jo.p.h(str, "actionId");
            jo.p.h(str2, "userId");
            this.f46573a = str;
            this.f46574b = str2;
        }

        public String a() {
            return this.f46573a;
        }

        public final String b() {
            return this.f46574b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return jo.p.c(a(), iVar.a()) && jo.p.c(this.f46574b, iVar.f46574b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46574b.hashCode();
        }

        public String toString() {
            return "UnfollowEvent(actionId=" + a() + ", userId=" + this.f46574b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(null);
            jo.p.h(str, "actionId");
            this.f46575a = str;
        }

        public String a() {
            return this.f46575a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(a(), ((j) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "UserGrade0Event(actionId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46576a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2) {
            super(null);
            jo.p.h(str, "actionId");
            jo.p.h(str2, "liveId");
            this.f46576a = str;
            this.f46577b = str2;
        }

        public String a() {
            return this.f46576a;
        }

        public final String b() {
            return this.f46577b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return jo.p.c(a(), kVar.a()) && jo.p.c(this.f46577b, kVar.f46577b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46577b.hashCode();
        }

        public String toString() {
            return "ViewLiveSmall(actionId=" + a() + ", liveId=" + this.f46577b + ')';
        }
    }

    public a0() {
    }

    public /* synthetic */ a0(jo.h hVar) {
        this();
    }
}
