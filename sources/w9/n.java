package w9;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestReward;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: o  reason: collision with root package name */
    public static final a f58401o = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f58402a;

    /* renamed from: b  reason: collision with root package name */
    public final String f58403b;

    /* renamed from: c  reason: collision with root package name */
    public final int f58404c;

    /* renamed from: d  reason: collision with root package name */
    public final int f58405d;

    /* renamed from: e  reason: collision with root package name */
    public final String f58406e;

    /* renamed from: f  reason: collision with root package name */
    public final String f58407f;

    /* renamed from: g  reason: collision with root package name */
    public final String f58408g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f58409h;

    /* renamed from: i  reason: collision with root package name */
    public final String f58410i;

    /* renamed from: j  reason: collision with root package name */
    public final String f58411j;

    /* renamed from: k  reason: collision with root package name */
    public final String f58412k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f58413l;

    /* renamed from: m  reason: collision with root package name */
    public final String f58414m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f58415n;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n a(int i10, EmomoQuestReward emomoQuestReward, String str) {
            jo.p.h(emomoQuestReward, "reward");
            jo.p.h(str, "achievedImageUrl");
            return new n(i10, emomoQuestReward.getName(), emomoQuestReward.getRarity(), emomoQuestReward.getThreshold(), emomoQuestReward.getCondition(), emomoQuestReward.getDescription(), emomoQuestReward.getBadgeUrl(), emomoQuestReward.getBadgeUrl().length() > 0, emomoQuestReward.getIconUrl(), emomoQuestReward.getImageUrl(), emomoQuestReward.getPartTypeIconUrl(), emomoQuestReward.getAchieved(), str, emomoQuestReward.getAchieved());
        }
    }

    public n(int i10, String str, int i11, int i12, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, boolean z11, String str8, boolean z12) {
        jo.p.h(str, "name");
        jo.p.h(str2, "condition");
        jo.p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(str4, "badgeUrl");
        jo.p.h(str5, "iconUrl");
        jo.p.h(str6, "imageUrl");
        jo.p.h(str7, "partTypeIconUrl");
        jo.p.h(str8, "achievedImageUrl");
        this.f58402a = i10;
        this.f58403b = str;
        this.f58404c = i11;
        this.f58405d = i12;
        this.f58406e = str2;
        this.f58407f = str3;
        this.f58408g = str4;
        this.f58409h = z10;
        this.f58410i = str5;
        this.f58411j = str6;
        this.f58412k = str7;
        this.f58413l = z11;
        this.f58414m = str8;
        this.f58415n = z12;
    }

    public final String a() {
        return this.f58408g;
    }

    public final String b() {
        return this.f58406e;
    }

    public final String c() {
        return this.f58410i;
    }

    public final int d() {
        return this.f58402a;
    }

    public final boolean e() {
        return this.f58409h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f58402a == nVar.f58402a && jo.p.c(this.f58403b, nVar.f58403b) && this.f58404c == nVar.f58404c && this.f58405d == nVar.f58405d && jo.p.c(this.f58406e, nVar.f58406e) && jo.p.c(this.f58407f, nVar.f58407f) && jo.p.c(this.f58408g, nVar.f58408g) && this.f58409h == nVar.f58409h && jo.p.c(this.f58410i, nVar.f58410i) && jo.p.c(this.f58411j, nVar.f58411j) && jo.p.c(this.f58412k, nVar.f58412k) && this.f58413l == nVar.f58413l && jo.p.c(this.f58414m, nVar.f58414m) && this.f58415n == nVar.f58415n;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f58402a) * 31) + this.f58403b.hashCode()) * 31) + Integer.hashCode(this.f58404c)) * 31) + Integer.hashCode(this.f58405d)) * 31) + this.f58406e.hashCode()) * 31) + this.f58407f.hashCode()) * 31) + this.f58408g.hashCode()) * 31;
        boolean z10 = this.f58409h;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + this.f58410i.hashCode()) * 31) + this.f58411j.hashCode()) * 31) + this.f58412k.hashCode()) * 31;
        boolean z11 = this.f58413l;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode3 = (((hashCode2 + i11) * 31) + this.f58414m.hashCode()) * 31;
        boolean z12 = this.f58415n;
        return hashCode3 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "EmomoQuestRankingRewardBindModel(index=" + this.f58402a + ", name=" + this.f58403b + ", rarity=" + this.f58404c + ", threshold=" + this.f58405d + ", condition=" + this.f58406e + ", description=" + this.f58407f + ", badgeUrl=" + this.f58408g + ", isVisibleBadgeImageView=" + this.f58409h + ", iconUrl=" + this.f58410i + ", imageUrl=" + this.f58411j + ", partTypeIconUrl=" + this.f58412k + ", achieved=" + this.f58413l + ", achievedImageUrl=" + this.f58414m + ", isVisibleAchievedImageView=" + this.f58415n + ')';
    }
}
