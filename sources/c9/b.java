package c9;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.user.UrgeUsersResponse;
import hf.c;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f18887b = c.a.f35513i;

        /* renamed from: a  reason: collision with root package name */
        public final c.a f18888a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c.a aVar) {
            super(null);
            jo.p.h(aVar, "appInfo");
            this.f18888a = aVar;
        }

        public final c.a a() {
            return this.f18888a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f18888a, ((a) obj).f18888a);
        }

        public int hashCode() {
            return this.f18888a.hashCode();
        }

        public String toString() {
            return "AppToggleIsMyApp(appInfo=" + this.f18888a + ')';
        }
    }

    /* renamed from: c9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0140b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f18889a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18890b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0140b(MRError mRError, boolean z10) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f18889a = mRError;
            this.f18890b = z10;
        }

        public final MRError a() {
            return this.f18889a;
        }

        public final boolean b() {
            return this.f18890b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0140b) {
                C0140b c0140b = (C0140b) obj;
                return jo.p.c(this.f18889a, c0140b.f18889a) && this.f18890b == c0140b.f18890b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f18889a.hashCode() * 31;
            boolean z10 = this.f18890b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "FetchAppsBySearchFailed(error=" + this.f18889a + ", isUsedFragment=" + this.f18890b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: d  reason: collision with root package name */
        public static final int f18891d = App.Apps.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final App.Apps f18892a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18893b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18894c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(App.Apps apps, boolean z10, boolean z11) {
            super(null);
            jo.p.h(apps, "response");
            this.f18892a = apps;
            this.f18893b = z10;
            this.f18894c = z11;
        }

        public final boolean a() {
            return this.f18893b;
        }

        public final App.Apps b() {
            return this.f18892a;
        }

        public final boolean c() {
            return this.f18894c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(this.f18892a, cVar.f18892a) && this.f18893b == cVar.f18893b && this.f18894c == cVar.f18894c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f18892a.hashCode() * 31;
            boolean z10 = this.f18893b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.f18894c;
            return i11 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "FetchAppsBySearchSucceeded(response=" + this.f18892a + ", fromScroller=" + this.f18893b + ", isUsedFragment=" + this.f18894c + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f18895c = App.Apps.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final App.Apps f18896a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(App.Apps apps, boolean z10) {
            super(null);
            jo.p.h(apps, "response");
            this.f18896a = apps;
            this.f18897b = z10;
        }

        public final App.Apps a() {
            return this.f18896a;
        }

        public final boolean b() {
            return this.f18897b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return jo.p.c(this.f18896a, dVar.f18896a) && this.f18897b == dVar.f18897b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f18896a.hashCode() * 31;
            boolean z10 = this.f18897b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "FetchRecommendAppsSucceeded(response=" + this.f18896a + ", isUsedFragment=" + this.f18897b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f18898b = Graph.RecommendUserList.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final Graph.RecommendUserList f18899a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Graph.RecommendUserList recommendUserList) {
            super(null);
            jo.p.h(recommendUserList, "response");
            this.f18899a = recommendUserList;
        }

        public final Graph.RecommendUserList a() {
            return this.f18899a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f18899a, ((e) obj).f18899a);
        }

        public int hashCode() {
            return this.f18899a.hashCode();
        }

        public String toString() {
            return "FetchRecommendUsersSucceeded(response=" + this.f18899a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f18900a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f18900a = mRError;
        }

        public final MRError a() {
            return this.f18900a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f18900a, ((f) obj).f18900a);
        }

        public int hashCode() {
            return this.f18900a.hashCode();
        }

        public String toString() {
            return "FetchUsersBySearchFailed(error=" + this.f18900a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f18901b = UrgeUsersResponse.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final UrgeUsersResponse f18902a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(UrgeUsersResponse urgeUsersResponse) {
            super(null);
            jo.p.h(urgeUsersResponse, "response");
            this.f18902a = urgeUsersResponse;
        }

        public final UrgeUsersResponse a() {
            return this.f18902a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f18902a, ((g) obj).f18902a);
        }

        public int hashCode() {
            return this.f18902a.hashCode();
        }

        public String toString() {
            return "FetchUsersBySearchSucceeded(response=" + this.f18902a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f18903a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18904b;

        public h(boolean z10, boolean z11) {
            super(null);
            this.f18903a = z10;
            this.f18904b = z11;
        }

        public final boolean a() {
            return this.f18904b;
        }

        public final boolean b() {
            return this.f18903a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.f18903a == hVar.f18903a && this.f18904b == hVar.f18904b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.f18903a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            boolean z11 = this.f18904b;
            return i10 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "LoadingNext(isUser=" + this.f18903a + ", isAppFragment=" + this.f18904b + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
