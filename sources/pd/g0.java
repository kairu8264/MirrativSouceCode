package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AvailableRewardAdIdsResponse;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.RecommendLivesResponse;

/* loaded from: classes2.dex */
public abstract class g0 {

    /* loaded from: classes2.dex */
    public static final class a extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f46873a;

        public a(long j10) {
            super(null);
            this.f46873a = j10;
        }

        public final long a() {
            return this.f46873a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f46873a == ((a) obj).f46873a;
        }

        public int hashCode() {
            return Long.hashCode(this.f46873a);
        }

        public String toString() {
            return "AddPoolLiveRequestCount(count=" + this.f46873a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46874a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46874a = mRError;
        }

        public final MRError a() {
            return this.f46874a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46874a, ((b) obj).f46874a);
        }

        public int hashCode() {
            return this.f46874a.hashCode();
        }

        public String toString() {
            return "ErrorToastEvent(error=" + this.f46874a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f46875a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final AvailableRewardAdIdsResponse f46876a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AvailableRewardAdIdsResponse availableRewardAdIdsResponse) {
            super(null);
            jo.p.h(availableRewardAdIdsResponse, "availableRewardAdIdsResponse");
            this.f46876a = availableRewardAdIdsResponse;
        }

        public final AvailableRewardAdIdsResponse a() {
            return this.f46876a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f46876a, ((d) obj).f46876a);
        }

        public int hashCode() {
            return this.f46876a.hashCode();
        }

        public String toString() {
            return "LoadAvailableRewardAdIds(availableRewardAdIdsResponse=" + this.f46876a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46877a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46877a = mRError;
        }

        public final MRError a() {
            return this.f46877a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46877a, ((e) obj).f46877a);
        }

        public int hashCode() {
            return this.f46877a.hashCode();
        }

        public String toString() {
            return "LoadFailRecommendLives(error=" + this.f46877a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final App.Apps f46878a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(App.Apps apps) {
            super(null);
            jo.p.h(apps, "apps");
            this.f46878a = apps;
        }

        public final App.Apps a() {
            return this.f46878a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f46878a, ((f) obj).f46878a);
        }

        public int hashCode() {
            return this.f46878a.hashCode();
        }

        public String toString() {
            return "LoadFinishAppsEvent(apps=" + this.f46878a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final RecommendLivesResponse f46879a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(RecommendLivesResponse recommendLivesResponse) {
            super(null);
            jo.p.h(recommendLivesResponse, "response");
            this.f46879a = recommendLivesResponse;
        }

        public final RecommendLivesResponse a() {
            return this.f46879a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46879a, ((g) obj).f46879a);
        }

        public int hashCode() {
            return this.f46879a.hashCode();
        }

        public String toString() {
            return "LoadFinishRecommendLives(response=" + this.f46879a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final oe.b f46880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oe.b bVar) {
            super(null);
            jo.p.h(bVar, "streamerInfo");
            this.f46880a = bVar;
        }

        public final oe.b a() {
            return this.f46880a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f46880a, ((h) obj).f46880a);
        }

        public int hashCode() {
            return this.f46880a.hashCode();
        }

        public String toString() {
            return "LoadStreamerInfoEvent(streamerInfo=" + this.f46880a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f46881a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveBasicParams f46882a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LiveBasicParams liveBasicParams) {
            super(null);
            jo.p.h(liveBasicParams, "targetLive");
            this.f46882a = liveBasicParams;
        }

        public final LiveBasicParams a() {
            return this.f46882a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f46882a, ((j) obj).f46882a);
        }

        public int hashCode() {
            return this.f46882a.hashCode();
        }

        public String toString() {
            return "SelectRecommendLive(targetLive=" + this.f46882a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46883a;

        /* renamed from: b  reason: collision with root package name */
        public final long f46884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, long j10) {
            super(null);
            jo.p.h(str, "userId");
            this.f46883a = str;
            this.f46884b = j10;
        }

        public final long a() {
            return this.f46884b;
        }

        public final String b() {
            return this.f46883a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return jo.p.c(this.f46883a, kVar.f46883a) && this.f46884b == kVar.f46884b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f46883a.hashCode() * 31) + Long.hashCode(this.f46884b);
        }

        public String toString() {
            return "SetLiveRequestCount(userId=" + this.f46883a + ", count=" + this.f46884b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f46885a;

        public l(long j10) {
            super(null);
            this.f46885a = j10;
        }

        public final long a() {
            return this.f46885a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f46885a == ((l) obj).f46885a;
        }

        public int hashCode() {
            return Long.hashCode(this.f46885a);
        }

        public String toString() {
            return "SetPoolLiveRequestCount(count=" + this.f46885a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends g0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46886a;

        public m(boolean z10) {
            super(null);
            this.f46886a = z10;
        }

        public final boolean a() {
            return this.f46886a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f46886a == ((m) obj).f46886a;
        }

        public int hashCode() {
            boolean z10 = this.f46886a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "UpdatePostingState(posting=" + this.f46886a + ')';
        }
    }

    public g0() {
    }

    public /* synthetic */ g0(jo.h hVar) {
        this();
    }
}
