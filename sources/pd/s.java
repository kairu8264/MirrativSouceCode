package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonResponse;

/* loaded from: classes2.dex */
public abstract class s {

    /* loaded from: classes2.dex */
    public static final class a extends s {

        /* renamed from: a  reason: collision with root package name */
        public final App.AppParams f47225a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(App.AppParams appParams) {
            super(null);
            jo.p.h(appParams, "app");
            this.f47225a = appParams;
        }

        public final App.AppParams a() {
            return this.f47225a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47225a, ((a) obj).f47225a);
        }

        public int hashCode() {
            return this.f47225a.hashCode();
        }

        public String toString() {
            return "AddMyAppEvent(app=" + this.f47225a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends s {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47226a;

        public a0(boolean z10) {
            super(null);
            this.f47226a = z10;
        }

        public final boolean a() {
            return this.f47226a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.f47226a == ((a0) obj).f47226a;
        }

        public int hashCode() {
            boolean z10 = this.f47226a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "SetPlayerPictureInPictureMode(isInPictureInPictureMode=" + this.f47226a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends s {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47227a;

        public b(boolean z10) {
            super(null);
            this.f47227a = z10;
        }

        public final boolean a() {
            return this.f47227a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f47227a == ((b) obj).f47227a;
        }

        public int hashCode() {
            boolean z10 = this.f47227a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "AppLifecycleChanged(isForeground=" + this.f47227a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends s {

        /* renamed from: a  reason: collision with root package name */
        public final jf.t0 f47228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(jf.t0 t0Var) {
            super(null);
            jo.p.h(t0Var, "resultViewState");
            this.f47228a = t0Var;
        }

        public final jf.t0 a() {
            return this.f47228a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && jo.p.c(this.f47228a, ((b0) obj).f47228a);
        }

        public int hashCode() {
            return this.f47228a.hashCode();
        }

        public String toString() {
            return "SetTwitterLoginResultViewEvent(resultViewState=" + this.f47228a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends s {

        /* renamed from: a  reason: collision with root package name */
        public final App.AppParams f47229a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(App.AppParams appParams) {
            super(null);
            jo.p.h(appParams, "app");
            this.f47229a = appParams;
        }

        public final App.AppParams a() {
            return this.f47229a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47229a, ((c) obj).f47229a);
        }

        public int hashCode() {
            return this.f47229a.hashCode();
        }

        public String toString() {
            return "AppRemoveEvent(app=" + this.f47229a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends s {

        /* renamed from: a  reason: collision with root package name */
        public final ToolTipStartLiveButtonResponse f47230a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ToolTipStartLiveButtonResponse toolTipStartLiveButtonResponse) {
            super(null);
            jo.p.h(toolTipStartLiveButtonResponse, "toolTipStartLiveButtonResponse");
            this.f47230a = toolTipStartLiveButtonResponse;
        }

        public final ToolTipStartLiveButtonResponse a() {
            return this.f47230a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && jo.p.c(this.f47230a, ((c0) obj).f47230a);
        }

        public int hashCode() {
            return this.f47230a.hashCode();
        }

        public String toString() {
            return "ToolTipLoadEvent(toolTipStartLiveButtonResponse=" + this.f47230a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends s {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47231a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47231a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47231a, ((d) obj).f47231a);
        }

        public int hashCode() {
            return this.f47231a.hashCode();
        }

        public String toString() {
            return "AppsErrorOccurEvent(error=" + this.f47231a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends s {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47232a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47232a = mRError;
        }

        public final MRError a() {
            return this.f47232a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && jo.p.c(this.f47232a, ((d0) obj).f47232a);
        }

        public int hashCode() {
            return this.f47232a.hashCode();
        }

        public String toString() {
            return "TwitterLoginFailureEvent(error=" + this.f47232a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends s {

        /* renamed from: a  reason: collision with root package name */
        public final App.Apps f47233a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(App.Apps apps) {
            super(null);
            jo.p.h(apps, "apps");
            this.f47233a = apps;
        }

        public final App.Apps a() {
            return this.f47233a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f47233a, ((e) obj).f47233a);
        }

        public int hashCode() {
            return this.f47233a.hashCode();
        }

        public String toString() {
            return "AppsLoadFinishEvent(apps=" + this.f47233a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends s {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47234a;

        public e0(boolean z10) {
            super(null);
            this.f47234a = z10;
        }

        public final boolean a() {
            return this.f47234a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && this.f47234a == ((e0) obj).f47234a;
        }

        public int hashCode() {
            boolean z10 = this.f47234a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "UpdateForceHideBalloon(hide=" + this.f47234a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final f f47235a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends s {

        /* renamed from: a  reason: collision with root package name */
        public final int f47236a;

        public f0(int i10) {
            super(null);
            this.f47236a = i10;
        }

        public final int a() {
            return this.f47236a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && this.f47236a == ((f0) obj).f47236a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47236a);
        }

        public String toString() {
            return "UpdatePhoneCallState(state=" + this.f47236a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final g f47237a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final h f47238a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends s {

        /* renamed from: a  reason: collision with root package name */
        public final String f47239a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            jo.p.h(str, "liveId");
            this.f47239a = str;
        }

        public final String a() {
            return this.f47239a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f47239a, ((i) obj).f47239a);
        }

        public int hashCode() {
            return this.f47239a.hashCode();
        }

        public String toString() {
            return "BroadcastStartEvent(liveId=" + this.f47239a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends s {

        /* renamed from: a  reason: collision with root package name */
        public final jf.f f47240a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(jf.f fVar) {
            super(null);
            jo.p.h(fVar, "coins");
            this.f47240a = fVar;
        }

        public final jf.f a() {
            return this.f47240a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f47240a, ((j) obj).f47240a);
        }

        public int hashCode() {
            return this.f47240a.hashCode();
        }

        public String toString() {
            return "CoinUpdateEvent(coins=" + this.f47240a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends s {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47241a;

        public k(boolean z10) {
            super(null);
            this.f47241a = z10;
        }

        public final boolean a() {
            return this.f47241a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f47241a == ((k) obj).f47241a;
        }

        public int hashCode() {
            boolean z10 = this.f47241a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "ExistsNewAvatarPartsChangeEvent(existsNewAvatarParts=" + this.f47241a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends s {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47242a;

        public l(boolean z10) {
            super(null);
            this.f47242a = z10;
        }

        public final boolean a() {
            return this.f47242a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f47242a == ((l) obj).f47242a;
        }

        public int hashCode() {
            boolean z10 = this.f47242a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "FollowTabCheckNotificationEvent(shouldNotify=" + this.f47242a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends s {

        /* renamed from: a  reason: collision with root package name */
        public final int f47243a;

        public m(int i10) {
            super(null);
            this.f47243a = i10;
        }

        public final int a() {
            return this.f47243a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f47243a == ((m) obj).f47243a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47243a);
        }

        public String toString() {
            return "LiveGameTabChanged(tabIndex=" + this.f47243a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends s {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47244a;

        public n(boolean z10) {
            super(null);
            this.f47244a = z10;
        }

        public final boolean a() {
            return this.f47244a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f47244a == ((n) obj).f47244a;
        }

        public int hashCode() {
            boolean z10 = this.f47244a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "LiveGameTabCheckNotificationEvent(shouldNotify=" + this.f47244a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final o f47245a = new o();

        public o() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final p f47246a = new p();

        public p() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final q f47247a = new q();

        public q() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends s {

        /* renamed from: a  reason: collision with root package name */
        public final int f47248a;

        public r(int i10) {
            super(null);
            this.f47248a = i10;
        }

        public final int a() {
            return this.f47248a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f47248a == ((r) obj).f47248a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47248a);
        }

        public String toString() {
            return "MyFollowCountUpdateEvent(followCount=" + this.f47248a + ')';
        }
    }

    /* renamed from: pd.s$s  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0720s extends s {

        /* renamed from: a  reason: collision with root package name */
        public final String f47249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0720s(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f47249a = str;
        }

        public final String a() {
            return this.f47249a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0720s) && jo.p.c(this.f47249a, ((C0720s) obj).f47249a);
        }

        public int hashCode() {
            return this.f47249a.hashCode();
        }

        public String toString() {
            return "MyFollowEvent(userId=" + this.f47249a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends s {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47250a;

        public t(boolean z10) {
            super(null);
            this.f47250a = z10;
        }

        public final boolean a() {
            return this.f47250a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f47250a == ((t) obj).f47250a;
        }

        public int hashCode() {
            boolean z10 = this.f47250a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "MyPageTabCheckNotificationEvent(shouldNotify=" + this.f47250a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final u f47251a = new u();

        public u() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends s {

        /* renamed from: a  reason: collision with root package name */
        public final int f47252a;

        public v(int i10) {
            super(null);
            this.f47252a = i10;
        }

        public final int a() {
            return this.f47252a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.f47252a == ((v) obj).f47252a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47252a);
        }

        public String toString() {
            return "NoticeCampaignPageChanged(pageIndex=" + this.f47252a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends s {

        /* renamed from: a  reason: collision with root package name */
        public final int f47253a;

        public w(int i10) {
            super(null);
            this.f47253a = i10;
        }

        public final int a() {
            return this.f47253a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f47253a == ((w) obj).f47253a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47253a);
        }

        public String toString() {
            return "NoticeTabChanged(tabIndex=" + this.f47253a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends s {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47254a;

        public x(boolean z10) {
            super(null);
            this.f47254a = z10;
        }

        public final boolean a() {
            return this.f47254a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.f47254a == ((x) obj).f47254a;
        }

        public int hashCode() {
            boolean z10 = this.f47254a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "NoticeTabCheckNotificationEvent(shouldNotify=" + this.f47254a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final y f47255a = new y();

        public y() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final z f47256a = new z();

        public z() {
            super(null);
        }
    }

    public s() {
    }

    public /* synthetic */ s(jo.h hVar) {
        this();
    }
}
