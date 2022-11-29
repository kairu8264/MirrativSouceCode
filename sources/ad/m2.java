package ad;

import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResultExpInfo;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m2 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f1206i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f1207a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1208b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1209c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1210d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1211e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1212f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1213g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1214h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ m2 b(a aVar, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo, String str, String str2, Resources resources, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            return aVar.a(seasonRatingLiveResultExpInfo, str, str2, resources);
        }

        public static /* synthetic */ m2 d(a aVar, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo, String str, String str2, Resources resources, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            return aVar.c(seasonRatingLiveResultExpInfo, str, str2, resources);
        }

        public final m2 a(SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo, String str, String str2, Resources resources) {
            jo.p.h(seasonRatingLiveResultExpInfo, "expInfo");
            jo.p.h(str, "title");
            jo.p.h(resources, "resources");
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(seasonRatingLiveResultExpInfo.getCount())}, 1));
            jo.p.g(format, "format(this, *args)");
            int i10 = nc.i.text_classup_score_per_count;
            Object[] objArr = new Object[1];
            String valueOf = String.valueOf(seasonRatingLiveResultExpInfo.getScorePerCount());
            if (so.n.p(valueOf, ".0", false, 2, null)) {
                valueOf = so.n.y(valueOf, ".0", "", false, 4, null);
            }
            objArr[0] = valueOf;
            String string = resources.getString(i10, objArr);
            String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(seasonRatingLiveResultExpInfo.getAcquiredScore())}, 1));
            jo.p.g(format2, "format(this, *args)");
            boolean overflow = seasonRatingLiveResultExpInfo.getOverflow();
            int d10 = e3.h.d(resources, seasonRatingLiveResultExpInfo.getOverflow() ? nc.b.f41795l : nc.b.F, null);
            jo.p.g(string, "getString(\n             …) else it }\n            )");
            return new m2(str, format, string, format2, overflow, str2, d10, "+");
        }

        public final m2 c(SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo, String str, String str2, Resources resources) {
            jo.p.h(seasonRatingLiveResultExpInfo, "expInfo");
            jo.p.h(str, "title");
            jo.p.h(resources, "resources");
            StringBuilder sb2 = new StringBuilder();
            String valueOf = String.valueOf(seasonRatingLiveResultExpInfo.getScorePerCount());
            if (so.n.p(valueOf, ".0", false, 2, null)) {
                valueOf = so.n.y(valueOf, ".0", "", false, 4, null);
            }
            sb2.append(valueOf);
            sb2.append(' ');
            sb2.append(resources.getString(nc.i.text_classup_exp_unit));
            String sb3 = sb2.toString();
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(seasonRatingLiveResultExpInfo.getAcquiredScore())}, 1));
            jo.p.g(format, "format(this, *args)");
            return new m2(str, sb3, "", format, seasonRatingLiveResultExpInfo.getOverflow(), str2, e3.h.d(resources, seasonRatingLiveResultExpInfo.getOverflow() ? nc.b.f41795l : nc.b.F, null), "+");
        }
    }

    public m2(String str, String str2, String str3, String str4, boolean z10, String str5, int i10, String str6) {
        jo.p.h(str, "title");
        jo.p.h(str2, "count");
        jo.p.h(str3, "countExp");
        jo.p.h(str4, "totalExp");
        jo.p.h(str6, "totalExpPlusText");
        this.f1207a = str;
        this.f1208b = str2;
        this.f1209c = str3;
        this.f1210d = str4;
        this.f1211e = z10;
        this.f1212f = str5;
        this.f1213g = i10;
        this.f1214h = str6;
    }

    public final String a() {
        return this.f1208b;
    }

    public final String b() {
        return this.f1209c;
    }

    public final String c() {
        return this.f1207a;
    }

    public final String d() {
        return this.f1210d;
    }

    public final String e() {
        return this.f1214h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            return jo.p.c(this.f1207a, m2Var.f1207a) && jo.p.c(this.f1208b, m2Var.f1208b) && jo.p.c(this.f1209c, m2Var.f1209c) && jo.p.c(this.f1210d, m2Var.f1210d) && this.f1211e == m2Var.f1211e && jo.p.c(this.f1212f, m2Var.f1212f) && this.f1213g == m2Var.f1213g && jo.p.c(this.f1214h, m2Var.f1214h);
        }
        return false;
    }

    public final int f() {
        return this.f1213g;
    }

    public final boolean g() {
        return this.f1211e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f1207a.hashCode() * 31) + this.f1208b.hashCode()) * 31) + this.f1209c.hashCode()) * 31) + this.f1210d.hashCode()) * 31;
        boolean z10 = this.f1211e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        String str = this.f1212f;
        return ((((i11 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f1213g)) * 31) + this.f1214h.hashCode();
    }

    public String toString() {
        return "ResultExpInfoViewBindModel(title=" + this.f1207a + ", count=" + this.f1208b + ", countExp=" + this.f1209c + ", totalExp=" + this.f1210d + ", isVisibleMax=" + this.f1211e + ", message=" + this.f1212f + ", totalExpTextColor=" + this.f1213g + ", totalExpPlusText=" + this.f1214h + ')';
    }
}
