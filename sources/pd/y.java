package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.BroadcastSettings;
import com.dena.mirrorman.net.api.response.live.LiveAnnouncement;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public abstract class y {

    /* loaded from: classes2.dex */
    public static final class a extends y {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47332a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47332a = mRError;
        }

        public final MRError a() {
            return this.f47332a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47332a, ((a) obj).f47332a);
        }

        public int hashCode() {
            return this.f47332a.hashCode();
        }

        public String toString() {
            return "ErrorOnGetUserMeAndBroadcastSetting(error=" + this.f47332a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends y {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47333a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47333a, ((b) obj).f47333a);
        }

        public int hashCode() {
            return this.f47333a.hashCode();
        }

        public String toString() {
            return "ErrorOnPostBroadcastSettingEvent(error=" + this.f47333a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends y {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47334a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47334a = mRError;
        }

        public final MRError a() {
            return this.f47334a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47334a, ((c) obj).f47334a);
        }

        public int hashCode() {
            return this.f47334a.hashCode();
        }

        public String toString() {
            return "ErrorOnPostNextAnnounceEvent(error=" + this.f47334a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends y {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47335a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends y {

        /* renamed from: a  reason: collision with root package name */
        public final UserMe f47336a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastSettings f47337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UserMe userMe, BroadcastSettings broadcastSettings) {
            super(null);
            jo.p.h(userMe, "userMe");
            jo.p.h(broadcastSettings, "broadcastSetting");
            this.f47336a = userMe;
            this.f47337b = broadcastSettings;
        }

        public final BroadcastSettings a() {
            return this.f47337b;
        }

        public final UserMe b() {
            return this.f47336a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return jo.p.c(this.f47336a, eVar.f47336a) && jo.p.c(this.f47337b, eVar.f47337b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47336a.hashCode() * 31) + this.f47337b.hashCode();
        }

        public String toString() {
            return "FinishedGetUserMeAndBroadcastSetting(userMe=" + this.f47336a + ", broadcastSetting=" + this.f47337b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends y {

        /* renamed from: a  reason: collision with root package name */
        public final BroadcastSettings f47338a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BroadcastSettings broadcastSettings) {
            super(null);
            jo.p.h(broadcastSettings, "response");
            this.f47338a = broadcastSettings;
        }

        public final BroadcastSettings a() {
            return this.f47338a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47338a, ((f) obj).f47338a);
        }

        public int hashCode() {
            return this.f47338a.hashCode();
        }

        public String toString() {
            return "FinishedPostBroadcastSettingEvent(response=" + this.f47338a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends y {

        /* renamed from: a  reason: collision with root package name */
        public final LiveAnnouncement f47339a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LiveAnnouncement liveAnnouncement) {
            super(null);
            jo.p.h(liveAnnouncement, "liveAnnouncement");
            this.f47339a = liveAnnouncement;
        }

        public final LiveAnnouncement a() {
            return this.f47339a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f47339a, ((g) obj).f47339a);
        }

        public int hashCode() {
            return this.f47339a.hashCode();
        }

        public String toString() {
            return "FinishedPostNextAnnounceEvent(liveAnnouncement=" + this.f47339a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends y {

        /* renamed from: a  reason: collision with root package name */
        public static final h f47340a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends y {

        /* renamed from: a  reason: collision with root package name */
        public static final i f47341a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends y {

        /* renamed from: a  reason: collision with root package name */
        public static final j f47342a = new j();

        public j() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends y {

        /* renamed from: a  reason: collision with root package name */
        public final jf.w f47343a;

        public k(jf.w wVar) {
            super(null);
            this.f47343a = wVar;
        }

        public final jf.w a() {
            return this.f47343a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f47343a, ((k) obj).f47343a);
        }

        public int hashCode() {
            jf.w wVar = this.f47343a;
            if (wVar == null) {
                return 0;
            }
            return wVar.hashCode();
        }

        public String toString() {
            return "UpdateLiveApp(liveAppSetting=" + this.f47343a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends y {

        /* renamed from: a  reason: collision with root package name */
        public final String f47344a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(null);
            jo.p.h(str, TtmlNode.TAG_BODY);
            this.f47344a = str;
        }

        public final String a() {
            return this.f47344a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f47344a, ((l) obj).f47344a);
        }

        public int hashCode() {
            return this.f47344a.hashCode();
        }

        public String toString() {
            return "UpdateNextAnnounceBody(body=" + this.f47344a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends y {

        /* renamed from: a  reason: collision with root package name */
        public final int f47345a;

        public m(int i10) {
            super(null);
            this.f47345a = i10;
        }

        public final int a() {
            return this.f47345a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f47345a == ((m) obj).f47345a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47345a);
        }

        public String toString() {
            return "UpdateNextAnnounceStartAtEvent(startAt=" + this.f47345a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends y {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47346a;

        public n(boolean z10) {
            super(null);
            this.f47346a = z10;
        }

        public final boolean a() {
            return this.f47346a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f47346a == ((n) obj).f47346a;
        }

        public int hashCode() {
            boolean z10 = this.f47346a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "UpdateTwitterAutoPostEnabled(isEnabled=" + this.f47346a + ')';
        }
    }

    public y() {
    }

    public /* synthetic */ y(jo.h hVar) {
        this();
    }
}
