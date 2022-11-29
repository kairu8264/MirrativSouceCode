package z8;

import com.dena.mirrorman.net.api.response.Mission;
import com.dena.mirrorman.net.api.response.MissionCategoryDescription;
import com.dena.mirrorman.net.api.response.MissionCategorySpecial;
import com.dena.mirrorman.net.api.response.MissionInfoResponse;
import com.dena.mirrorman.net.api.response.MissionProgressStatus;
import com.dena.mirrorman.net.api.response.MissionStatus;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: h  reason: collision with root package name */
    public static final a f62765h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f62766i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f62767a;

    /* renamed from: b  reason: collision with root package name */
    public final int f62768b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f62769c;

    /* renamed from: d  reason: collision with root package name */
    public final String f62770d;

    /* renamed from: e  reason: collision with root package name */
    public final List<MissionCategoryDescription> f62771e;

    /* renamed from: f  reason: collision with root package name */
    public final g f62772f;

    /* renamed from: g  reason: collision with root package name */
    public final MissionCategorySpecial f62773g;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t a(MissionInfoResponse missionInfoResponse) {
            jo.p.h(missionInfoResponse, "response");
            return new t(missionInfoResponse.getDescription(), missionInfoResponse.getCategoryFirst().getCategoryId(), missionInfoResponse.getCategoryFirst().isActivation(), missionInfoResponse.getCategoryFirst().getCategoryDescriptionFirst(), missionInfoResponse.getCategoryFirst().getCategoryDescriptionSecond(), c(missionInfoResponse.getCategoryFirst().getMissions()), missionInfoResponse.getCategorySpecial());
        }

        public final t b(MissionInfoResponse missionInfoResponse, int i10) {
            jo.p.h(missionInfoResponse, "response");
            return new t(missionInfoResponse.getDescription(), missionInfoResponse.getCategorySecond().getCategoryId(), missionInfoResponse.getCategorySecond().isActivation(), missionInfoResponse.getCategorySecond().getCategoryDescriptionFirst(), missionInfoResponse.getCategorySecond().getCategoryDescriptionSecond(), g.f62670n.a(missionInfoResponse.getCategorySecond().getMissions().get(i10)), null);
        }

        public final g c(List<Mission> list) {
            return list.isEmpty() ^ true ? g.f62670n.a(list.get(0)) : g.f62670n.a(d());
        }

        public final Mission d() {
            return new Mission(-1, "", false, "", null, null, -1, MissionStatus.UNDEFINED_API_PARAM, "", new MissionProgressStatus(0, 0), "", 48, null);
        }
    }

    public t(String str, int i10, boolean z10, String str2, List<MissionCategoryDescription> list, g gVar, MissionCategorySpecial missionCategorySpecial) {
        jo.p.h(str, "missionDescription");
        jo.p.h(str2, "categoryDescriptionFirst");
        jo.p.h(list, "categoryDescriptionSecond");
        jo.p.h(gVar, "missionItemData");
        this.f62767a = str;
        this.f62768b = i10;
        this.f62769c = z10;
        this.f62770d = str2;
        this.f62771e = list;
        this.f62772f = gVar;
        this.f62773g = missionCategorySpecial;
    }

    public final String a() {
        return this.f62770d;
    }

    public final List<MissionCategoryDescription> b() {
        return this.f62771e;
    }

    public final MissionCategorySpecial c() {
        return this.f62773g;
    }

    public final String d() {
        return this.f62767a;
    }

    public final g e() {
        return this.f62772f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return jo.p.c(this.f62767a, tVar.f62767a) && this.f62768b == tVar.f62768b && this.f62769c == tVar.f62769c && jo.p.c(this.f62770d, tVar.f62770d) && jo.p.c(this.f62771e, tVar.f62771e) && jo.p.c(this.f62772f, tVar.f62772f) && jo.p.c(this.f62773g, tVar.f62773g);
        }
        return false;
    }

    public final boolean f() {
        return this.f62769c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f62767a.hashCode() * 31) + Integer.hashCode(this.f62768b)) * 31;
        boolean z10 = this.f62769c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + this.f62770d.hashCode()) * 31) + this.f62771e.hashCode()) * 31) + this.f62772f.hashCode()) * 31;
        MissionCategorySpecial missionCategorySpecial = this.f62773g;
        return hashCode2 + (missionCategorySpecial == null ? 0 : missionCategorySpecial.hashCode());
    }

    public String toString() {
        return "MissionTabItem(missionDescription=" + this.f62767a + ", categoryId=" + this.f62768b + ", isActivation=" + this.f62769c + ", categoryDescriptionFirst=" + this.f62770d + ", categoryDescriptionSecond=" + this.f62771e + ", missionItemData=" + this.f62772f + ", categorySpecial=" + this.f62773g + ')';
    }
}
