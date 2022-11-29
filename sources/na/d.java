package na;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.livegame.CoinBoost;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameListItem;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameMission;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameMissionStatus;
import com.dena.mirrativ.mirrativapi.livegame.Provider;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import na.h;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final String G;
    public final String H;
    public final String I;
    public final h J;
    public final h K;
    public final String L;

    /* renamed from: w  reason: collision with root package name */
    public final String f41647w;

    /* renamed from: x  reason: collision with root package name */
    public final String f41648x;

    /* renamed from: y  reason: collision with root package name */
    public final String f41649y;

    /* renamed from: z  reason: collision with root package name */
    public final String f41650z;
    public static final a M = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(LiveGameListItem liveGameListItem, boolean z10) {
            h hVar;
            h hVar2;
            CoinBoost coinBoost;
            LiveGameMissionStatus viewer;
            CoinBoost coinBoost2;
            LiveGameMissionStatus player;
            CoinBoost coinBoost3;
            p.h(liveGameListItem, "item");
            String id2 = liveGameListItem.getId();
            String title = liveGameListItem.getTitle();
            String iconUrl = liveGameListItem.getIconUrl();
            String description = liveGameListItem.getDescription();
            String logoUrl = liveGameListItem.getLogoUrl();
            String bannerUrl = liveGameListItem.getBannerUrl();
            String animatedBannerUrl = liveGameListItem.getAnimatedBannerUrl();
            String appId = liveGameListItem.getAppId();
            boolean z11 = liveGameListItem.isOnlivePlayOnly() ? z10 : true;
            boolean z12 = liveGameListItem.getProvider() != null;
            Provider provider = liveGameListItem.getProvider();
            String name = provider != null ? provider.getName() : null;
            Provider provider2 = liveGameListItem.getProvider();
            String email = provider2 != null ? provider2.getEmail() : null;
            LiveGameMission mission = liveGameListItem.getMission();
            String condition = mission != null ? mission.getCondition() : null;
            LiveGameMission mission2 = liveGameListItem.getMission();
            if (mission2 == null || (player = mission2.getPlayer()) == null) {
                hVar = null;
            } else {
                h.a aVar = h.B;
                LiveGameMission mission3 = liveGameListItem.getMission();
                hVar = aVar.a(player, ((mission3 == null || (coinBoost3 = mission3.getCoinBoost()) == null) ? null : coinBoost3.getDescription()) != null);
            }
            LiveGameMission mission4 = liveGameListItem.getMission();
            if (mission4 == null || (viewer = mission4.getViewer()) == null) {
                hVar2 = null;
            } else {
                h.a aVar2 = h.B;
                LiveGameMission mission5 = liveGameListItem.getMission();
                hVar2 = aVar2.b(viewer, ((mission5 == null || (coinBoost2 = mission5.getCoinBoost()) == null) ? null : coinBoost2.getDescription()) != null);
            }
            LiveGameMission mission6 = liveGameListItem.getMission();
            return new d(id2, title, description, iconUrl, logoUrl, bannerUrl, animatedBannerUrl, appId, z11, z12, name, email, condition, hVar, hVar2, (mission6 == null || (coinBoost = mission6.getCoinBoost()) == null) ? null : coinBoost.getDescription());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final d createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? h.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, h hVar, h hVar2, String str12) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "title");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "iconUrl");
        p.h(str5, "logoUrl");
        p.h(str6, "bannerUrl");
        p.h(str7, "animatedBannerUrl");
        p.h(str8, "appId");
        this.f41647w = str;
        this.f41648x = str2;
        this.f41649y = str3;
        this.f41650z = str4;
        this.A = str5;
        this.B = str6;
        this.C = str7;
        this.D = str8;
        this.E = z10;
        this.F = z11;
        this.G = str9;
        this.H = str10;
        this.I = str11;
        this.J = hVar;
        this.K = hVar2;
        this.L = str12;
    }

    public final String a() {
        return this.C;
    }

    public final String b() {
        return this.B;
    }

    public final String c() {
        return this.L;
    }

    public final String d() {
        return this.f41649y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f41650z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return p.c(this.f41647w, dVar.f41647w) && p.c(this.f41648x, dVar.f41648x) && p.c(this.f41649y, dVar.f41649y) && p.c(this.f41650z, dVar.f41650z) && p.c(this.A, dVar.A) && p.c(this.B, dVar.B) && p.c(this.C, dVar.C) && p.c(this.D, dVar.D) && this.E == dVar.E && this.F == dVar.F && p.c(this.G, dVar.G) && p.c(this.H, dVar.H) && p.c(this.I, dVar.I) && p.c(this.J, dVar.J) && p.c(this.K, dVar.K) && p.c(this.L, dVar.L);
        }
        return false;
    }

    public final String f() {
        return this.f41647w;
    }

    public final String g() {
        return this.A;
    }

    public final String h() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.f41647w.hashCode() * 31) + this.f41648x.hashCode()) * 31) + this.f41649y.hashCode()) * 31) + this.f41650z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        boolean z10 = this.E;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.F;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str = this.G;
        int hashCode2 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.H;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.I;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        h hVar = this.J;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h hVar2 = this.K;
        int hashCode6 = (hashCode5 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        String str4 = this.L;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final h i() {
        return this.J;
    }

    public final String j() {
        return this.H;
    }

    public final String k() {
        return this.G;
    }

    public final String l() {
        return this.f41648x;
    }

    public final h m() {
        return this.K;
    }

    public final boolean n() {
        return this.E;
    }

    public final boolean o() {
        return this.F;
    }

    public String toString() {
        return "LiveGameListingItemBindModel(id=" + this.f41647w + ", title=" + this.f41648x + ", description=" + this.f41649y + ", iconUrl=" + this.f41650z + ", logoUrl=" + this.A + ", bannerUrl=" + this.B + ", animatedBannerUrl=" + this.C + ", appId=" + this.D + ", isPlayable=" + this.E + ", isVisibleProvider=" + this.F + ", providerName=" + this.G + ", providerEmail=" + this.H + ", missionTitle=" + this.I + ", playerMissionBindModel=" + this.J + ", viewerMissionBindModel=" + this.K + ", coinBoostText=" + this.L + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f41647w);
        parcel.writeString(this.f41648x);
        parcel.writeString(this.f41649y);
        parcel.writeString(this.f41650z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        h hVar = this.J;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i10);
        }
        h hVar2 = this.K;
        if (hVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar2.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.L);
    }
}
