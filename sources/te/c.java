package te;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.AnnouncementUrls;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.CollabRequestResponse;
import com.dena.mirrorman.net.api.response.Gift;
import com.dena.mirrorman.net.api.response.MirroringResponse;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.live.LiveAd;
import com.dena.mirrorman.net.api.response.live.LiveDetailParams;
import com.dena.mirrorman.net.api.response.live.LivePolling;
import com.dena.mirrorman.net.api.response.live.LiveQuiz;
import com.dena.mirrorman.net.api.response.live.LiveShares;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jf.q;
import jf.r;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class c extends LiveDetailParams implements Parcelable {
    public String A;
    public String B;
    public boolean C;
    public boolean D;
    public String E;
    public int F;
    public String G;
    public String H;
    public List<StunServer> I;
    public List<TurnServer> J;
    public List<RankingUser> K;
    public List<q> L;

    /* renamed from: w  reason: collision with root package name */
    public String f53607w;

    /* renamed from: x  reason: collision with root package name */
    public String f53608x;

    /* renamed from: y  reason: collision with root package name */
    public String f53609y;

    /* renamed from: z  reason: collision with root package name */
    public String f53610z;
    public static final b M = new b(null);
    public static final int N = 8;
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final c b(LiveDetailParams liveDetailParams) {
            p.h(liveDetailParams, "liveDetailParams");
            c cVar = new c(null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 65535, null);
            cVar.setArchiveUrlHls(liveDetailParams.getArchiveUrlHls());
            cVar.setStreamingUrlEdge(liveDetailParams.getStreamingUrlEdge());
            cVar.setStreamingUrlHls(liveDetailParams.getStreamingUrlHls());
            cVar.setStreamingUrlLlstreamVideo(liveDetailParams.getStreamingUrlLlstreamVideo());
            cVar.setStreamingUrlLlstreamAudio(liveDetailParams.getStreamingUrlLlstreamAudio());
            cVar.setLiveId(liveDetailParams.getLiveId());
            cVar.setTitle(liveDetailParams.getTitle());
            cVar.setDescription(liveDetailParams.getDescription());
            cVar.setLiveUserKey(liveDetailParams.getLiveUserKey());
            cVar.setImage_url(liveDetailParams.getImage_url());
            cVar.setOnlineUserNum(liveDetailParams.getOnlineUserNum());
            cVar.setTotalViewerNum(liveDetailParams.getTotalViewerNum());
            cVar.setBroadcastHost(liveDetailParams.getBroadcastHost());
            cVar.setBroadcastPort(liveDetailParams.getBroadcastPort());
            cVar.setBroadcastKey(liveDetailParams.getBroadcastKey());
            cVar.r(liveDetailParams.getOwner().getUserId());
            cVar.p(liveDetailParams.getOwner().getName());
            cVar.q(liveDetailParams.getOwner().getProfileImageUrl());
            cVar.l(liveDetailParams.getOwner().getBadges().isEmpty() ^ true ? liveDetailParams.getOwner().getBadges().get(0).getImageUrl() : "");
            cVar.m(liveDetailParams.getOwner().getDescription());
            cVar.o(liveDetailParams.getOwner().isFollowing());
            cVar.n(liveDetailParams.getOwner().isFollower());
            cVar.setOwner(liveDetailParams.getOwner());
            cVar.setArchive(liveDetailParams.isArchive());
            cVar.setLive(liveDetailParams.isLive());
            cVar.setArchiveStatus(liveDetailParams.getArchiveStatus());
            cVar.setShareUrl(liveDetailParams.getShareUrl());
            cVar.setPrivate(liveDetailParams.isPrivate());
            cVar.setOmotenashi(liveDetailParams.isOmotenashi());
            cVar.setNuuWelcome(liveDetailParams.isNuuWelcome());
            liveDetailParams.getTimeline();
            cVar.setApp(liveDetailParams.getApp());
            cVar.u(liveDetailParams.getArchiveUrlHls());
            cVar.setStartedAt(liveDetailParams.getStartedAt());
            cVar.setEndedAt(liveDetailParams.getEndedAt());
            cVar.setTimeline(liveDetailParams.getTimeline());
            cVar.setCollabEnabled(liveDetailParams.getCollabEnabled());
            cVar.setCollabHasVacancy(liveDetailParams.getCollabHasVacancy());
            cVar.setMaxCollabUserNum(liveDetailParams.getMaxCollabUserNum());
            cVar.setAnnouncementUrl(liveDetailParams.getAnnouncementUrl());
            cVar.setAnnouncementUrls(liveDetailParams.getAnnouncementUrls());
            cVar.setShares(liveDetailParams.getShares());
            cVar.setAd(liveDetailParams.getAd());
            cVar.setLinkedLive(liveDetailParams.getLinkedLive());
            cVar.setQuiz(liveDetailParams.getQuiz());
            cVar.setOrientationV2(liveDetailParams.getOrientationV2());
            cVar.setRemainingFreeCoins(liveDetailParams.getRemainingFreeCoins());
            cVar.setRemainingPaidCoins(liveDetailParams.getRemainingPaidCoins());
            cVar.setDiamonds(liveDetailParams.getDiamonds());
            cVar.setGiftSupported(liveDetailParams.isGiftSupported());
            List<RankingUser> rankingUsers = liveDetailParams.getRankingUsers();
            if (rankingUsers == null) {
                rankingUsers = s.k();
            }
            cVar.s(rankingUsers);
            List<q> c10 = c(liveDetailParams.getRecommendedGifts());
            if (c10 == null) {
                c10 = s.k();
            }
            cVar.t(c10);
            cVar.setMirroring(liveDetailParams.getMirroring());
            cVar.setAnniversaryBotComment(liveDetailParams.getAnniversaryBotComment());
            cVar.setUserLevel(liveDetailParams.getUserLevel());
            cVar.setConnectedStreamingCollab(liveDetailParams.isConnectedStreamingCollab());
            cVar.setStreamingCollabEnabled(liveDetailParams.isStreamingCollabEnabled());
            cVar.setCollabInvitation(liveDetailParams.getCollabInvitation());
            cVar.setGiftAppealPopupImage(liveDetailParams.getGiftAppealPopupImage());
            cVar.setEmomoVisible(liveDetailParams.isEmomoVisible());
            cVar.setLiveGamePlaying(liveDetailParams.getLiveGamePlaying());
            return cVar;
        }

        public final List<q> c(List<Gift.GiftParams> list) {
            if (list == null) {
                return null;
            }
            r rVar = new r();
            ArrayList arrayList = new ArrayList();
            for (Gift.GiftParams giftParams : list) {
                arrayList.add(rVar.a(giftParams, Referer.RECOMMENDED_GIFTS));
            }
            return arrayList;
        }
    }

    public c() {
        this(null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 65535, null);
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7, int i10, String str8, String str9, List list, List list2, List list3, List list4, int i11, h hVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? false : z10, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? "" : str7, (i11 & 512) == 0 ? i10 : 0, (i11 & 1024) != 0 ? "" : str8, (i11 & 2048) == 0 ? str9 : "", (i11 & 4096) != 0 ? s.k() : list, (i11 & 8192) != 0 ? s.k() : list2, (i11 & 16384) != 0 ? s.k() : list3, (i11 & 32768) != 0 ? null : list4);
    }

    public final String a() {
        if (getApp() != null) {
            App.AppParams app = getApp();
            p.e(app);
            return app.getAppId();
        }
        return null;
    }

    public final String b() {
        return this.A;
    }

    public final String c() {
        return this.B;
    }

    public final boolean d() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f53609y;
    }

    public final String f() {
        return this.f53610z;
    }

    public final String g() {
        return this.f53608x;
    }

    public final String getModeratorUserId() {
        return this.H;
    }

    public final List<RankingUser> h() {
        return this.K;
    }

    public final List<q> i() {
        return this.L;
    }

    public final String j() {
        return this.f53607w;
    }

    public final boolean k() {
        if (!isPrivate()) {
            LiveShares shares = getShares();
            if ((shares != null ? shares.getTwitter() : null) != null) {
                LiveShares shares2 = getShares();
                if (!TextUtils.isEmpty(shares2 != null ? shares2.getTitle() : null)) {
                    LiveShares shares3 = getShares();
                    if (!TextUtils.isEmpty(shares3 != null ? shares3.getDescription() : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void l(String str) {
        p.h(str, "<set-?>");
        this.A = str;
    }

    public final void m(String str) {
        p.h(str, "<set-?>");
        this.B = str;
    }

    public final void n(boolean z10) {
        this.D = z10;
    }

    public final void o(boolean z10) {
        this.C = z10;
    }

    public final void p(String str) {
        p.h(str, "<set-?>");
        this.f53609y = str;
    }

    public final void q(String str) {
        p.h(str, "<set-?>");
        this.f53610z = str;
    }

    public final void r(String str) {
        p.h(str, "<set-?>");
        this.f53608x = str;
    }

    public final void s(List<RankingUser> list) {
        p.h(list, "<set-?>");
        this.K = list;
    }

    public final void setModeratorUserId(String str) {
        p.h(str, "<set-?>");
        this.H = str;
    }

    public final void t(List<q> list) {
        this.L = list;
    }

    public final void u(String str) {
        this.f53607w = str;
    }

    public final void v(LivePolling livePolling) {
        if (livePolling == null) {
            return;
        }
        setApp(livePolling.getApp());
        setOnlineUserNum(livePolling.getOnlineUserNum());
        setTotalViewerNum(livePolling.getTotalViewerNum());
        if (livePolling.getTitle() != null) {
            setTitle(livePolling.getTitle());
        }
        if (livePolling.getDescription() != null) {
            setDescription(livePolling.getDescription());
        }
        if (!TextUtils.isEmpty(livePolling.getOwner().getUserId())) {
            this.f53608x = livePolling.getOwner().getUserId();
            this.f53609y = livePolling.getOwner().getName();
            this.C = livePolling.getOwner().isFollowing();
            this.D = livePolling.getOwner().isFollower();
            this.B = livePolling.getOwner().getDescription();
            this.f53610z = livePolling.getOwner().getProfileImageUrl();
            this.A = livePolling.getOwner().getBadges().isEmpty() ^ true ? livePolling.getOwner().getBadges().get(0).getImageUrl() : "";
            setOwner(livePolling.getOwner());
        }
        setTimeline(livePolling.getTimeline());
        setAnnouncementUrl(livePolling.getAnnouncementUrl());
        setAnnouncementUrls(livePolling.getAnnouncementUrls());
        setCollabEnabled(livePolling.getCollabEnabled());
        setCollabHasVacancy(livePolling.getCollabHasVacancy());
        setMaxCollabUserNum(livePolling.getMaxCollabUserNum());
        setShares(livePolling.getShares());
        setLinkedLive(livePolling.getLinkedLive());
        if (livePolling.getQuiz() != null) {
            setQuiz(livePolling.getQuiz());
        }
        setOrientationV2(livePolling.getOrientationV2());
        this.L = M.c(livePolling.getRecommendedGifts());
        String moderatorUserId = livePolling.getModeratorUserId();
        this.H = moderatorUserId != null ? moderatorUserId : "";
        setEmomoVisible(livePolling.isEmomoVisible());
    }

    public final void w(CollabRequestResponse collabRequestResponse) {
        p.h(collabRequestResponse, "response");
        this.E = collabRequestResponse.getCollabUnicastHost();
        this.G = collabRequestResponse.getCollabUnicastKey();
        this.F = collabRequestResponse.getCollabUnicastPort();
        this.I = collabRequestResponse.getStunServers();
        this.J = collabRequestResponse.getTurnServers();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "parcel");
        parcel.writeString(getStreamingUrlEdge());
        parcel.writeString(getStreamingUrlHls());
        parcel.writeString(getStreamingUrlLlstreamVideo());
        parcel.writeString(getStreamingUrlLlstreamAudio());
        parcel.writeString(getArchiveUrlHls());
        parcel.writeString(getLiveId());
        parcel.writeString(getTitle());
        parcel.writeString(getDescription());
        parcel.writeString(getLiveUserKey());
        parcel.writeString(getImage_url());
        parcel.writeInt(getOnlineUserNum());
        parcel.writeInt(getTotalViewerNum());
        parcel.writeString(getBroadcastHost());
        parcel.writeInt(getBroadcastPort());
        parcel.writeString(getBroadcastKey());
        parcel.writeString(this.f53608x);
        parcel.writeString(this.f53609y);
        parcel.writeString(this.f53610z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeString(getShareUrl());
        parcel.writeByte(isLive() ? (byte) 1 : (byte) 0);
        parcel.writeByte(isArchive() ? (byte) 1 : (byte) 0);
        parcel.writeByte(isPrivate() ? (byte) 1 : (byte) 0);
        parcel.writeByte(isOmotenashi() ? (byte) 1 : (byte) 0);
        parcel.writeByte(isNuuWelcome() ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(getApp());
        parcel.writeString(this.f53607w);
        parcel.writeLong(getStartedAt());
        parcel.writeLong(getEndedAt());
        parcel.writeString(getAnnouncementUrl());
        parcel.writeSerializable(getAnnouncementUrls());
        parcel.writeByte(getCollabEnabled() ? (byte) 1 : (byte) 0);
        parcel.writeByte(getCollabHasVacancy() ? (byte) 1 : (byte) 0);
        parcel.writeInt(getMaxCollabUserNum());
        parcel.writeString(this.E);
        parcel.writeInt(this.F);
        parcel.writeString(this.G);
        parcel.writeTypedList(this.I);
        parcel.writeTypedList(this.J);
        parcel.writeSerializable(getShares());
        parcel.writeSerializable(getAd());
        parcel.writeSerializable(getLinkedLive());
        parcel.writeSerializable(getQuiz());
        parcel.writeString(getOrientationV2());
        parcel.writeInt(getRemainingFreeCoins());
        parcel.writeInt(getRemainingPaidCoins());
        parcel.writeByte(isGiftSupported() ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.K);
        parcel.writeTypedList(this.L);
        parcel.writeParcelable(getMirroring(), i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7, int i10, String str8, String str9, List<StunServer> list, List<TurnServer> list2, List<RankingUser> list3, List<q> list4) {
        super(null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, false, null, 1073741823, null);
        p.h(str2, "ownerUserID");
        p.h(str3, "ownerName");
        p.h(str4, "ownerProfileImageUrl");
        p.h(str5, "ownerBadgeImageUrl");
        p.h(str6, "ownerDescription");
        p.h(str7, "collabUnicastHost");
        p.h(str8, "collabUnicastKey");
        p.h(str9, "moderatorUserId");
        p.h(list, "stunServers");
        p.h(list2, "turnServers");
        p.h(list3, "rankingTopUsers");
        this.f53607w = str;
        this.f53608x = str2;
        this.f53609y = str3;
        this.f53610z = str4;
        this.A = str5;
        this.B = str6;
        this.C = z10;
        this.D = z11;
        this.E = str7;
        this.F = i10;
        this.G = str8;
        this.H = str9;
        this.I = list;
        this.J = list2;
        this.K = list3;
        this.L = list4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Parcel parcel) {
        this(null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 65535, null);
        p.h(parcel, "parcel");
        setStreamingUrlEdge(parcel.readString());
        setStreamingUrlHls(parcel.readString());
        setStreamingUrlLlstreamVideo(parcel.readString());
        setStreamingUrlLlstreamAudio(parcel.readString());
        setArchiveUrlHls(parcel.readString());
        String readString = parcel.readString();
        setLiveId(readString == null ? "" : readString);
        setTitle(parcel.readString());
        setDescription(parcel.readString());
        String readString2 = parcel.readString();
        setLiveUserKey(readString2 == null ? "" : readString2);
        String readString3 = parcel.readString();
        setImage_url(readString3 == null ? "" : readString3);
        setOnlineUserNum(parcel.readInt());
        setTotalViewerNum(parcel.readInt());
        String readString4 = parcel.readString();
        setBroadcastHost(readString4 == null ? "" : readString4);
        setBroadcastPort(parcel.readInt());
        String readString5 = parcel.readString();
        setBroadcastKey(readString5 == null ? "" : readString5);
        String readString6 = parcel.readString();
        this.f53608x = readString6 == null ? "" : readString6;
        String readString7 = parcel.readString();
        this.f53609y = readString7 == null ? "" : readString7;
        String readString8 = parcel.readString();
        this.f53610z = readString8 == null ? "" : readString8;
        String readString9 = parcel.readString();
        this.A = readString9 == null ? "" : readString9;
        String readString10 = parcel.readString();
        this.B = readString10 == null ? "" : readString10;
        this.C = parcel.readByte() > 0;
        this.D = parcel.readByte() > 0;
        String readString11 = parcel.readString();
        setShareUrl(readString11 == null ? "" : readString11);
        setLive(parcel.readByte() > 0);
        setArchive(parcel.readByte() > 0);
        setPrivate(parcel.readByte() > 0);
        setOmotenashi(parcel.readByte() > 0);
        setNuuWelcome(parcel.readByte() > 0);
        Serializable readSerializable = parcel.readSerializable();
        setApp(readSerializable instanceof App.AppParams ? (App.AppParams) readSerializable : null);
        this.f53607w = parcel.readString();
        setStartedAt(parcel.readLong());
        setEndedAt(parcel.readLong());
        setAnnouncementUrl(parcel.readString());
        Serializable readSerializable2 = parcel.readSerializable();
        setAnnouncementUrls(readSerializable2 instanceof AnnouncementUrls ? (AnnouncementUrls) readSerializable2 : null);
        setCollabEnabled(parcel.readByte() > 0);
        setCollabHasVacancy(parcel.readByte() > 0);
        setMaxCollabUserNum(parcel.readInt());
        String readString12 = parcel.readString();
        this.E = readString12 == null ? "" : readString12;
        this.F = parcel.readInt();
        String readString13 = parcel.readString();
        this.G = readString13 != null ? readString13 : "";
        List<StunServer> createTypedArrayList = parcel.createTypedArrayList(StunServer.CREATOR);
        this.I = createTypedArrayList == null ? s.k() : createTypedArrayList;
        List<TurnServer> createTypedArrayList2 = parcel.createTypedArrayList(TurnServer.CREATOR);
        this.J = createTypedArrayList2 == null ? s.k() : createTypedArrayList2;
        Serializable readSerializable3 = parcel.readSerializable();
        setShares(readSerializable3 instanceof LiveShares ? (LiveShares) readSerializable3 : null);
        Serializable readSerializable4 = parcel.readSerializable();
        setAd(readSerializable4 instanceof LiveAd ? (LiveAd) readSerializable4 : null);
        Serializable readSerializable5 = parcel.readSerializable();
        setLinkedLive(readSerializable5 instanceof LinkedLive ? (LinkedLive) readSerializable5 : null);
        Serializable readSerializable6 = parcel.readSerializable();
        setQuiz(readSerializable6 instanceof LiveQuiz ? (LiveQuiz) readSerializable6 : null);
        setOrientationV2(parcel.readString());
        setRemainingFreeCoins(parcel.readInt());
        setRemainingPaidCoins(parcel.readInt());
        setGiftSupported(parcel.readByte() > 0);
        List<RankingUser> createTypedArrayList3 = parcel.createTypedArrayList(RankingUser.CREATOR);
        this.K = createTypedArrayList3 == null ? s.k() : createTypedArrayList3;
        List<q> createTypedArrayList4 = parcel.createTypedArrayList(q.CREATOR);
        this.L = createTypedArrayList4 == null ? s.k() : createTypedArrayList4;
        setMirroring((MirroringResponse) parcel.readParcelable(MirroringResponse.class.getClassLoader()));
    }
}
