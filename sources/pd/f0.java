package pd;

import com.dena.mirrativ.mirrativapi.RankingFocusableResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.BroadcastSettings;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.FavoriteLiveSetting;
import com.dena.mirrorman.net.api.response.live.RequestPackageUsageStats;

/* loaded from: classes2.dex */
public abstract class f0 {

    /* loaded from: classes2.dex */
    public static final class a extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46805a;

        public a(boolean z10) {
            super(null);
            this.f46805a = z10;
        }

        public final boolean a() {
            return this.f46805a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f46805a == ((a) obj).f46805a;
        }

        public int hashCode() {
            boolean z10 = this.f46805a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "AutoTweetChangeEvent(enabled=" + this.f46805a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends pd.z {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f46806a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46807b;

        public a0(Integer num, String str) {
            super(null);
            this.f46806a = num;
            this.f46807b = str;
        }

        public final String a() {
            return this.f46807b;
        }

        public final Integer b() {
            return this.f46806a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                return jo.p.c(this.f46806a, a0Var.f46806a) && jo.p.c(this.f46807b, a0Var.f46807b);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.f46806a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f46807b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SetRankingFocusEventSucceeded(eventType=" + this.f46806a + ", eventId=" + this.f46807b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46808a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46808a = mRError;
        }

        public final MRError a() {
            return this.f46808a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46808a, ((b) obj).f46808a);
        }

        public int hashCode() {
            return this.f46808a.hashCode();
        }

        public String toString() {
            return "AutoTweetChangeFailEvent(error=" + this.f46808a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f46809a;

        public b0(int i10) {
            super(null);
            this.f46809a = i10;
        }

        public final int a() {
            return this.f46809a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.f46809a == ((b0) obj).f46809a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46809a);
        }

        public String toString() {
            return "SetSelectedThumbnailFrameId(selectedThumbnailFrameId=" + this.f46809a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final BroadcastSettings f46810a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BroadcastSettings broadcastSettings) {
            super(null);
            jo.p.h(broadcastSettings, "response");
            this.f46810a = broadcastSettings;
        }

        public final BroadcastSettings a() {
            return this.f46810a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46810a, ((c) obj).f46810a);
        }

        public int hashCode() {
            return this.f46810a.hashCode();
        }

        public String toString() {
            return "BroadCastSettingsLoadEvent(response=" + this.f46810a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final FavoriteLiveSetting f46811a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(FavoriteLiveSetting favoriteLiveSetting) {
            super(null);
            jo.p.h(favoriteLiveSetting, MRLog.PAYLOAD_KEY_SETTING);
            this.f46811a = favoriteLiveSetting;
        }

        public final FavoriteLiveSetting a() {
            return this.f46811a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && jo.p.c(this.f46811a, ((c0) obj).f46811a);
        }

        public int hashCode() {
            return this.f46811a.hashCode();
        }

        public String toString() {
            return "SuccessToUseFavoriteLiveSettingEvent(setting=" + this.f46811a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46812a;

        public d(boolean z10) {
            super(null);
            this.f46812a = z10;
        }

        public final boolean a() {
            return this.f46812a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f46812a == ((d) obj).f46812a;
        }

        public int hashCode() {
            boolean z10 = this.f46812a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CastTtsStatusChangedEvent(isTtsEnable=" + this.f46812a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public static final d0 f46813a = new d0();

        public d0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final float f46814a;

        public e(float f10) {
            super(null);
            this.f46814a = f10;
        }

        public final float a() {
            return this.f46814a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(Float.valueOf(this.f46814a), Float.valueOf(((e) obj).f46814a));
        }

        public int hashCode() {
            return Float.hashCode(this.f46814a);
        }

        public String toString() {
            return "CastTtsVolumeChangedEvent(ttsVolume=" + this.f46814a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.w f46815a;

        public e0(jf.w wVar) {
            super(null);
            this.f46815a = wVar;
        }

        public final jf.w a() {
            return this.f46815a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && jo.p.c(this.f46815a, ((e0) obj).f46815a);
        }

        public int hashCode() {
            jf.w wVar = this.f46815a;
            if (wVar == null) {
                return 0;
            }
            return wVar.hashCode();
        }

        public String toString() {
            return "UpdateLiveApp(liveAppSetting=" + this.f46815a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46816a;

        public f(boolean z10) {
            super(null);
            this.f46816a = z10;
        }

        public final boolean a() {
            return this.f46816a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f46816a == ((f) obj).f46816a;
        }

        public int hashCode() {
            boolean z10 = this.f46816a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CatalogEmomoEnabledChangedEvent(isCatalogEmomoEnabled=" + this.f46816a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends pd.z {

        /* renamed from: a  reason: collision with root package name */
        public final int f46817a;

        public g(int i10) {
            super(null);
            this.f46817a = i10;
        }

        public final int a() {
            return this.f46817a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f46817a == ((g) obj).f46817a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46817a);
        }

        public String toString() {
            return "ChangedNotificationGuardMode(notificationGuardMode=" + this.f46817a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f46818a;

        public h(int i10) {
            super(null);
            this.f46818a = i10;
        }

        public final int a() {
            return this.f46818a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f46818a == ((h) obj).f46818a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46818a);
        }

        public String toString() {
            return "CollabMaxParticipantsChangedEvent(collabMaxParticipants=" + this.f46818a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46819a;

        public i(boolean z10) {
            super(null);
            this.f46819a = z10;
        }

        public final boolean a() {
            return this.f46819a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f46819a == ((i) obj).f46819a;
        }

        public int hashCode() {
            boolean z10 = this.f46819a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CollabStatusChangedEvent(isCollabEnable=" + this.f46819a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends f0 {
    }

    /* loaded from: classes2.dex */
    public static final class k extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46820a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46820a = mRError;
        }

        public final MRError a() {
            return this.f46820a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f46820a, ((k) obj).f46820a);
        }

        public int hashCode() {
            return this.f46820a.hashCode();
        }

        public String toString() {
            return "FailedToCreateLiveForLiveStart(error=" + this.f46820a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46821a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46821a = mRError;
        }

        public final MRError a() {
            return this.f46821a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f46821a, ((l) obj).f46821a);
        }

        public int hashCode() {
            return this.f46821a.hashCode();
        }

        public String toString() {
            return "FailedToCreateLiveForShowThumbnail(error=" + this.f46821a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46822a = mRError;
        }

        public final MRError a() {
            return this.f46822a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f46822a, ((m) obj).f46822a);
        }

        public int hashCode() {
            return this.f46822a.hashCode();
        }

        public String toString() {
            return "FailedToLiveEditForLiveStart(error=" + this.f46822a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final EventNoticeResponse f46823a;

        public n(EventNoticeResponse eventNoticeResponse) {
            super(null);
            this.f46823a = eventNoticeResponse;
        }

        public final EventNoticeResponse a() {
            return this.f46823a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && jo.p.c(this.f46823a, ((n) obj).f46823a);
        }

        public int hashCode() {
            EventNoticeResponse eventNoticeResponse = this.f46823a;
            if (eventNoticeResponse == null) {
                return 0;
            }
            return eventNoticeResponse.hashCode();
        }

        public String toString() {
            return "FetchEventNoticeSucceeded(response=" + this.f46823a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends pd.z {

        /* renamed from: a  reason: collision with root package name */
        public static final o f46824a = new o();

        public o() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends pd.z {

        /* renamed from: a  reason: collision with root package name */
        public final RankingFocusableResponse f46825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(RankingFocusableResponse rankingFocusableResponse) {
            super(null);
            jo.p.h(rankingFocusableResponse, "response");
            this.f46825a = rankingFocusableResponse;
        }

        public final RankingFocusableResponse a() {
            return this.f46825a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && jo.p.c(this.f46825a, ((p) obj).f46825a);
        }

        public int hashCode() {
            return this.f46825a.hashCode();
        }

        public String toString() {
            return "FetchRankingFocusableEventsSucceeded(response=" + this.f46825a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final ye.c f46826a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ye.c cVar) {
            super(null);
            jo.p.h(cVar, "recordRequestParams");
            this.f46826a = cVar;
        }

        public final ye.c a() {
            return this.f46826a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && jo.p.c(this.f46826a, ((q) obj).f46826a);
        }

        public int hashCode() {
            return this.f46826a.hashCode();
        }

        public String toString() {
            return "FinishCreateLive(recordRequestParams=" + this.f46826a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final ye.c f46827a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ye.c cVar) {
            super(null);
            jo.p.h(cVar, "recordRequestParams");
            this.f46827a = cVar;
        }

        public final ye.c a() {
            return this.f46827a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && jo.p.c(this.f46827a, ((r) obj).f46827a);
        }

        public int hashCode() {
            return this.f46827a.hashCode();
        }

        public String toString() {
            return "FinishCreateLiveForLiveStart(recordRequestParams=" + this.f46827a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final ye.c f46828a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ye.c cVar) {
            super(null);
            jo.p.h(cVar, "recordRequestParams");
            this.f46828a = cVar;
        }

        public final ye.c a() {
            return this.f46828a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && jo.p.c(this.f46828a, ((s) obj).f46828a);
        }

        public int hashCode() {
            return this.f46828a.hashCode();
        }

        public String toString() {
            return "FinishCreateLiveForThumbnail(recordRequestParams=" + this.f46828a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final ye.c f46829a;

        /* renamed from: b  reason: collision with root package name */
        public final RequestPackageUsageStats f46830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ye.c cVar, RequestPackageUsageStats requestPackageUsageStats) {
            super(null);
            jo.p.h(cVar, "recordRequestParams");
            this.f46829a = cVar;
            this.f46830b = requestPackageUsageStats;
        }

        public final ye.c a() {
            return this.f46829a;
        }

        public final RequestPackageUsageStats b() {
            return this.f46830b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return jo.p.c(this.f46829a, tVar.f46829a) && jo.p.c(this.f46830b, tVar.f46830b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f46829a.hashCode() * 31;
            RequestPackageUsageStats requestPackageUsageStats = this.f46830b;
            return hashCode + (requestPackageUsageStats == null ? 0 : requestPackageUsageStats.hashCode());
        }

        public String toString() {
            return "FinishLiveEditForLiveStart(recordRequestParams=" + this.f46829a + ", requestPackageUsageStats=" + this.f46830b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46831a;

        public u(boolean z10) {
            super(null);
            this.f46831a = z10;
        }

        public final boolean a() {
            return this.f46831a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f46831a == ((u) obj).f46831a;
        }

        public int hashCode() {
            boolean z10 = this.f46831a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "GiftOverlayEnableChanged(giftOverlayEnable=" + this.f46831a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(null);
            jo.p.h(str, "liveMemo");
            this.f46832a = str;
        }

        public final String a() {
            return this.f46832a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && jo.p.c(this.f46832a, ((v) obj).f46832a);
        }

        public int hashCode() {
            return this.f46832a.hashCode();
        }

        public String toString() {
            return "LiveMemoChangedEvent(liveMemo=" + this.f46832a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46833a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super(null);
            jo.p.h(str, "liveTitle");
            this.f46833a = str;
        }

        public final String a() {
            return this.f46833a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && jo.p.c(this.f46833a, ((w) obj).f46833a);
        }

        public int hashCode() {
            return this.f46833a.hashCode();
        }

        public String toString() {
            return "LiveTitleChangedEvent(liveTitle=" + this.f46833a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46834a;

        public x(boolean z10) {
            super(null);
            this.f46834a = z10;
        }

        public final boolean a() {
            return this.f46834a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.f46834a == ((x) obj).f46834a;
        }

        public int hashCode() {
            boolean z10 = this.f46834a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "OmotenashiLiveEnableChanged(omotenashiLiveEnabled=" + this.f46834a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46835a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(null);
            jo.p.h(str, "thumbnailImageUrl");
            this.f46835a = str;
        }

        public final String a() {
            return this.f46835a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && jo.p.c(this.f46835a, ((y) obj).f46835a);
        }

        public int hashCode() {
            return this.f46835a.hashCode();
        }

        public String toString() {
            return "ReloadLiveThumbnail(thumbnailImageUrl=" + this.f46835a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends pd.z {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46836a = mRError;
        }

        public final MRError a() {
            return this.f46836a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && jo.p.c(this.f46836a, ((z) obj).f46836a);
        }

        public int hashCode() {
            return this.f46836a.hashCode();
        }

        public String toString() {
            return "SetRankingFocusEventFailed(error=" + this.f46836a + ')';
        }
    }

    public f0() {
    }

    public /* synthetic */ f0(jo.h hVar) {
        this();
    }
}
