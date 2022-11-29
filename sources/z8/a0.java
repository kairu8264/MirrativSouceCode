package z8;

import androidx.lifecycle.e0;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.MissionSpecial;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f62646j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f62647k = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f62648a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62649b;

    /* renamed from: c  reason: collision with root package name */
    public final String f62650c;

    /* renamed from: d  reason: collision with root package name */
    public final String f62651d;

    /* renamed from: e  reason: collision with root package name */
    public final String f62652e;

    /* renamed from: f  reason: collision with root package name */
    public final String f62653f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f62654g;

    /* renamed from: h  reason: collision with root package name */
    public final g f62655h;

    /* renamed from: i  reason: collision with root package name */
    public final e0<Boolean> f62656i;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a0 a(MissionSpecial missionSpecial) {
            jo.p.h(missionSpecial, Referer.MISSION);
            int id2 = missionSpecial.getId();
            String title = missionSpecial.getTitle();
            String appTitle = missionSpecial.getAppTitle();
            if (appTitle == null) {
                appTitle = "";
            }
            return new a0(id2, title, appTitle, missionSpecial.getIconImageUrl(), missionSpecial.getVideoUrl(), missionSpecial.getDownloadUrl(), false, g.f62670n.b(missionSpecial), new e0(Boolean.FALSE));
        }
    }

    public a0(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, g gVar, e0<Boolean> e0Var) {
        jo.p.h(str, "titleText");
        jo.p.h(str2, "appTitleText");
        jo.p.h(str3, "iconImageUrl");
        jo.p.h(str4, "videoUrl");
        jo.p.h(str5, "downloadUrl");
        jo.p.h(gVar, "missionItemBindModel");
        jo.p.h(e0Var, "isPlaying");
        this.f62648a = i10;
        this.f62649b = str;
        this.f62650c = str2;
        this.f62651d = str3;
        this.f62652e = str4;
        this.f62653f = str5;
        this.f62654g = z10;
        this.f62655h = gVar;
        this.f62656i = e0Var;
    }

    public final String a() {
        return this.f62650c;
    }

    public final String b() {
        return this.f62653f;
    }

    public final String c() {
        return this.f62651d;
    }

    public final int d() {
        return this.f62648a;
    }

    public final g e() {
        return this.f62655h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return this.f62648a == a0Var.f62648a && jo.p.c(this.f62649b, a0Var.f62649b) && jo.p.c(this.f62650c, a0Var.f62650c) && jo.p.c(this.f62651d, a0Var.f62651d) && jo.p.c(this.f62652e, a0Var.f62652e) && jo.p.c(this.f62653f, a0Var.f62653f) && this.f62654g == a0Var.f62654g && jo.p.c(this.f62655h, a0Var.f62655h) && jo.p.c(this.f62656i, a0Var.f62656i);
        }
        return false;
    }

    public final String f() {
        return this.f62652e;
    }

    public final e0<Boolean> g() {
        return this.f62656i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f62648a) * 31) + this.f62649b.hashCode()) * 31) + this.f62650c.hashCode()) * 31) + this.f62651d.hashCode()) * 31) + this.f62652e.hashCode()) * 31) + this.f62653f.hashCode()) * 31;
        boolean z10 = this.f62654g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + this.f62655h.hashCode()) * 31) + this.f62656i.hashCode();
    }

    public String toString() {
        return "SpecialMissionBindModel(id=" + this.f62648a + ", titleText=" + this.f62649b + ", appTitleText=" + this.f62650c + ", iconImageUrl=" + this.f62651d + ", videoUrl=" + this.f62652e + ", downloadUrl=" + this.f62653f + ", forceDisableGetButton=" + this.f62654g + ", missionItemBindModel=" + this.f62655h + ", isPlaying=" + this.f62656i + ')';
    }
}
