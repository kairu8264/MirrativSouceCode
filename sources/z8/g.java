package z8;

import androidx.lifecycle.e0;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Mission;
import com.dena.mirrorman.net.api.response.MissionSpecial;
import com.dena.mirrorman.net.api.response.MissionStatus;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: n  reason: collision with root package name */
    public static final a f62670n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f62671o = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f62672a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62673b;

    /* renamed from: c  reason: collision with root package name */
    public final String f62674c;

    /* renamed from: d  reason: collision with root package name */
    public final e0<MissionStatus> f62675d;

    /* renamed from: e  reason: collision with root package name */
    public final String f62676e;

    /* renamed from: f  reason: collision with root package name */
    public final int f62677f;

    /* renamed from: g  reason: collision with root package name */
    public final int f62678g;

    /* renamed from: h  reason: collision with root package name */
    public final String f62679h;

    /* renamed from: i  reason: collision with root package name */
    public final String f62680i;

    /* renamed from: j  reason: collision with root package name */
    public final String f62681j;

    /* renamed from: k  reason: collision with root package name */
    public final String f62682k;

    /* renamed from: l  reason: collision with root package name */
    public final String f62683l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f62684m;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(Mission mission) {
            jo.p.h(mission, Referer.MISSION);
            int id2 = mission.getId();
            String title = mission.getTitle();
            String str = "✕ " + mission.getRewardNum();
            e0 e0Var = new e0(mission.getMissionStatus());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mission.getProgressStatus().getCurrent());
            sb2.append('/');
            sb2.append(mission.getProgressStatus().getMax());
            String sb3 = sb2.toString();
            int max = mission.getProgressStatus().getMax();
            int current = mission.getProgressStatus().getCurrent();
            String description = mission.getDescription();
            String rewardImageUrl = mission.getRewardImageUrl();
            String rewardText = mission.getRewardText();
            String rewardAvatarPartTypeIconUrl = mission.getRewardAvatarPartTypeIconUrl();
            if (rewardAvatarPartTypeIconUrl == null) {
                rewardAvatarPartTypeIconUrl = "";
            }
            String rewardTextDescription = mission.getRewardTextDescription();
            return new g(id2, title, str, e0Var, sb3, max, current, description, rewardImageUrl, rewardText, rewardAvatarPartTypeIconUrl, rewardTextDescription != null ? rewardTextDescription : "", mission.getHasRewardDetail());
        }

        public final g b(MissionSpecial missionSpecial) {
            jo.p.h(missionSpecial, "missionSpecial");
            int id2 = missionSpecial.getId();
            String title = missionSpecial.getTitle();
            String str = "✕ " + missionSpecial.getRewardNum();
            e0 e0Var = new e0(missionSpecial.getMissionStatus());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(missionSpecial.getProgressStatus().getCurrent());
            sb2.append('/');
            sb2.append(missionSpecial.getProgressStatus().getMax());
            String sb3 = sb2.toString();
            int max = missionSpecial.getProgressStatus().getMax();
            int current = missionSpecial.getProgressStatus().getCurrent();
            String description = missionSpecial.getDescription();
            String rewardImageUrl = missionSpecial.getRewardImageUrl();
            String rewardText = missionSpecial.getRewardText();
            String rewardAvatarPartTypeIconUrl = missionSpecial.getRewardAvatarPartTypeIconUrl();
            if (rewardAvatarPartTypeIconUrl == null) {
                rewardAvatarPartTypeIconUrl = "";
            }
            String rewardTextDescription = missionSpecial.getRewardTextDescription();
            return new g(id2, title, str, e0Var, sb3, max, current, description, rewardImageUrl, rewardText, rewardAvatarPartTypeIconUrl, rewardTextDescription != null ? rewardTextDescription : "", missionSpecial.getHasRewardDetail());
        }
    }

    public g(int i10, String str, String str2, e0<MissionStatus> e0Var, String str3, int i11, int i12, String str4, String str5, String str6, String str7, String str8, boolean z10) {
        jo.p.h(str, "titleText");
        jo.p.h(str2, "rewardCountText");
        jo.p.h(e0Var, "missionStatus");
        jo.p.h(str3, "progressNumText");
        jo.p.h(str4, "descriptionText");
        jo.p.h(str5, "rewardImageUrl");
        jo.p.h(str6, "rewardText");
        jo.p.h(str7, "rewardPartTypeIconUrl");
        jo.p.h(str8, "rewardDescriptionText");
        this.f62672a = i10;
        this.f62673b = str;
        this.f62674c = str2;
        this.f62675d = e0Var;
        this.f62676e = str3;
        this.f62677f = i11;
        this.f62678g = i12;
        this.f62679h = str4;
        this.f62680i = str5;
        this.f62681j = str6;
        this.f62682k = str7;
        this.f62683l = str8;
        this.f62684m = z10;
    }

    public final String a() {
        return this.f62679h;
    }

    public final int b() {
        return this.f62672a;
    }

    public final e0<MissionStatus> c() {
        return this.f62675d;
    }

    public final int d() {
        return this.f62678g;
    }

    public final int e() {
        return this.f62677f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f62672a == gVar.f62672a && jo.p.c(this.f62673b, gVar.f62673b) && jo.p.c(this.f62674c, gVar.f62674c) && jo.p.c(this.f62675d, gVar.f62675d) && jo.p.c(this.f62676e, gVar.f62676e) && this.f62677f == gVar.f62677f && this.f62678g == gVar.f62678g && jo.p.c(this.f62679h, gVar.f62679h) && jo.p.c(this.f62680i, gVar.f62680i) && jo.p.c(this.f62681j, gVar.f62681j) && jo.p.c(this.f62682k, gVar.f62682k) && jo.p.c(this.f62683l, gVar.f62683l) && this.f62684m == gVar.f62684m;
        }
        return false;
    }

    public final String f() {
        return this.f62676e;
    }

    public final String g() {
        return this.f62674c;
    }

    public final String h() {
        return this.f62680i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((Integer.hashCode(this.f62672a) * 31) + this.f62673b.hashCode()) * 31) + this.f62674c.hashCode()) * 31) + this.f62675d.hashCode()) * 31) + this.f62676e.hashCode()) * 31) + Integer.hashCode(this.f62677f)) * 31) + Integer.hashCode(this.f62678g)) * 31) + this.f62679h.hashCode()) * 31) + this.f62680i.hashCode()) * 31) + this.f62681j.hashCode()) * 31) + this.f62682k.hashCode()) * 31) + this.f62683l.hashCode()) * 31;
        boolean z10 = this.f62684m;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String i() {
        return this.f62682k;
    }

    public final String j() {
        return this.f62681j;
    }

    public final String k() {
        return this.f62673b;
    }

    public final boolean l() {
        return this.f62684m;
    }

    public String toString() {
        return "MissionItemBindModel(id=" + this.f62672a + ", titleText=" + this.f62673b + ", rewardCountText=" + this.f62674c + ", missionStatus=" + this.f62675d + ", progressNumText=" + this.f62676e + ", progressMax=" + this.f62677f + ", progressCurrent=" + this.f62678g + ", descriptionText=" + this.f62679h + ", rewardImageUrl=" + this.f62680i + ", rewardText=" + this.f62681j + ", rewardPartTypeIconUrl=" + this.f62682k + ", rewardDescriptionText=" + this.f62683l + ", visibleRewardDetailPopup=" + this.f62684m + ')';
    }
}
