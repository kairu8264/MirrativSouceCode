package ud;

import com.dena.mirrorman.net.api.response.live.LiveGamePlaying;
import com.dena.mirrorman.net.api.response.live.ViewerLiveGameGift;
import com.dena.mirrorman.net.bcsvr.response.LiveGamePlayingBcsvrResponse;

/* loaded from: classes2.dex */
public final class w1 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f55632g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f55633h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f55634a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f55635b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55636c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55637d;

    /* renamed from: e  reason: collision with root package name */
    public final v1 f55638e;

    /* renamed from: f  reason: collision with root package name */
    public final v1 f55639f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w1 a(LiveGamePlaying liveGamePlaying) {
            jo.p.h(liveGamePlaying, "response");
            String liveGameId = liveGamePlaying.getLiveGameId();
            boolean z10 = liveGamePlaying.getViewerSelfStartIconUrl().length() > 0;
            String viewerSelfStartIconUrl = liveGamePlaying.getViewerSelfStartIconUrl();
            ViewerLiveGameGift viewerLiveGameGift = (ViewerLiveGameGift) xn.a0.Z(liveGamePlaying.getGifts());
            v1 v1Var = viewerLiveGameGift != null ? new v1(viewerLiveGameGift.getId(), viewerLiveGameGift.getIconUrl(), viewerLiveGameGift.getCoins(), viewerLiveGameGift.isFeatureGift()) : null;
            boolean z11 = xn.a0.Z(liveGamePlaying.getGifts()) != null;
            ViewerLiveGameGift viewerLiveGameGift2 = (ViewerLiveGameGift) xn.a0.a0(liveGamePlaying.getGifts(), 1);
            return new w1(liveGameId, z10, viewerSelfStartIconUrl, z11, v1Var, viewerLiveGameGift2 != null ? new v1(viewerLiveGameGift2.getId(), viewerLiveGameGift2.getIconUrl(), viewerLiveGameGift2.getCoins(), viewerLiveGameGift2.isFeatureGift()) : null);
        }

        public final w1 b(LiveGamePlayingBcsvrResponse liveGamePlayingBcsvrResponse) {
            jo.p.h(liveGamePlayingBcsvrResponse, "response");
            String liveGameId = liveGamePlayingBcsvrResponse.getLiveGameId();
            boolean z10 = liveGamePlayingBcsvrResponse.getViewerSelfStartIconUrl().length() > 0;
            String viewerSelfStartIconUrl = liveGamePlayingBcsvrResponse.getViewerSelfStartIconUrl();
            ViewerLiveGameGift viewerLiveGameGift = (ViewerLiveGameGift) xn.a0.Z(liveGamePlayingBcsvrResponse.getGifts());
            v1 v1Var = viewerLiveGameGift != null ? new v1(viewerLiveGameGift.getId(), viewerLiveGameGift.getIconUrl(), viewerLiveGameGift.getCoins(), viewerLiveGameGift.isFeatureGift()) : null;
            boolean z11 = xn.a0.Z(liveGamePlayingBcsvrResponse.getGifts()) != null;
            ViewerLiveGameGift viewerLiveGameGift2 = (ViewerLiveGameGift) xn.a0.a0(liveGamePlayingBcsvrResponse.getGifts(), 1);
            return new w1(liveGameId, z10, viewerSelfStartIconUrl, z11, v1Var, viewerLiveGameGift2 != null ? new v1(viewerLiveGameGift2.getId(), viewerLiveGameGift2.getIconUrl(), viewerLiveGameGift2.getCoins(), viewerLiveGameGift2.isFeatureGift()) : null);
        }
    }

    public w1(String str, boolean z10, String str2, boolean z11, v1 v1Var, v1 v1Var2) {
        jo.p.h(str, "liveGameId");
        jo.p.h(str2, "startIconImageUrl");
        this.f55634a = str;
        this.f55635b = z10;
        this.f55636c = str2;
        this.f55637d = z11;
        this.f55638e = v1Var;
        this.f55639f = v1Var2;
    }

    public final v1 a() {
        return this.f55638e;
    }

    public final v1 b() {
        return this.f55639f;
    }

    public final String c() {
        return this.f55634a;
    }

    public final String d() {
        return this.f55636c;
    }

    public final boolean e() {
        return this.f55637d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            return jo.p.c(this.f55634a, w1Var.f55634a) && this.f55635b == w1Var.f55635b && jo.p.c(this.f55636c, w1Var.f55636c) && this.f55637d == w1Var.f55637d && jo.p.c(this.f55638e, w1Var.f55638e) && jo.p.c(this.f55639f, w1Var.f55639f);
        }
        return false;
    }

    public final boolean f() {
        return this.f55635b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f55634a.hashCode() * 31;
        boolean z10 = this.f55635b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.f55636c.hashCode()) * 31;
        boolean z11 = this.f55637d;
        int i11 = (hashCode2 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        v1 v1Var = this.f55638e;
        int hashCode3 = (i11 + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        v1 v1Var2 = this.f55639f;
        return hashCode3 + (v1Var2 != null ? v1Var2.hashCode() : 0);
    }

    public String toString() {
        return "LiveGameInfoBindModel(liveGameId=" + this.f55634a + ", isVisibleStartIcon=" + this.f55635b + ", startIconImageUrl=" + this.f55636c + ", isVisibleGiftContainer=" + this.f55637d + ", giftOneBindModel=" + this.f55638e + ", giftTwoBindModel=" + this.f55639f + ')';
    }
}
