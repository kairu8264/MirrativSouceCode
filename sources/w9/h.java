package w9;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestRankingUser;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: m  reason: collision with root package name */
    public static final a f58295m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f58296a;

    /* renamed from: b  reason: collision with root package name */
    public final String f58297b;

    /* renamed from: c  reason: collision with root package name */
    public final String f58298c;

    /* renamed from: d  reason: collision with root package name */
    public final int f58299d;

    /* renamed from: e  reason: collision with root package name */
    public final int f58300e;

    /* renamed from: f  reason: collision with root package name */
    public final String f58301f;

    /* renamed from: g  reason: collision with root package name */
    public final String f58302g;

    /* renamed from: h  reason: collision with root package name */
    public final String f58303h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f58304i;

    /* renamed from: j  reason: collision with root package name */
    public final String f58305j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f58306k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f58307l;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(EmomoQuestRankingUser emomoQuestRankingUser, boolean z10) {
            int i10;
            jo.p.h(emomoQuestRankingUser, "rankingUser");
            int userId = emomoQuestRankingUser.getUserId();
            String name = emomoQuestRankingUser.getName();
            String valueOf = String.valueOf(emomoQuestRankingUser.getRank());
            int i11 = emomoQuestRankingUser.getRank() <= 3 ? 26 : 20;
            int rank = emomoQuestRankingUser.getRank();
            if (rank == 1) {
                i10 = q9.d.f48811o;
            } else if (rank == 2) {
                i10 = q9.d.f48812p;
            } else if (rank != 3) {
                i10 = q9.d.f48816t;
            } else {
                i10 = q9.d.f48813q;
            }
            String format = String.format("%,dpt", Arrays.copyOf(new Object[]{Integer.valueOf(emomoQuestRankingUser.getScore())}, 1));
            jo.p.g(format, "format(this, *args)");
            return new h(userId, name, valueOf, i11, i10, format, emomoQuestRankingUser.getIconUrl(), emomoQuestRankingUser.getLabelImageUrl(), emomoQuestRankingUser.getLabelImageUrl().length() > 0, emomoQuestRankingUser.getBadgeImageUrl(), emomoQuestRankingUser.getBadgeImageUrl().length() > 0, z10);
        }
    }

    public h(int i10, String str, String str2, int i11, int i12, String str3, String str4, String str5, boolean z10, String str6, boolean z11, boolean z12) {
        jo.p.h(str, "name");
        jo.p.h(str2, "rankText");
        jo.p.h(str3, "scoreText");
        jo.p.h(str4, "iconUrl");
        jo.p.h(str5, "labelImageUrl");
        jo.p.h(str6, "badgeImageUrl");
        this.f58296a = i10;
        this.f58297b = str;
        this.f58298c = str2;
        this.f58299d = i11;
        this.f58300e = i12;
        this.f58301f = str3;
        this.f58302g = str4;
        this.f58303h = str5;
        this.f58304i = z10;
        this.f58305j = str6;
        this.f58306k = z11;
        this.f58307l = z12;
    }

    public final String a() {
        return this.f58305j;
    }

    public final String b() {
        return this.f58302g;
    }

    public final String c() {
        return this.f58303h;
    }

    public final String d() {
        return this.f58297b;
    }

    public final String e() {
        return this.f58298c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f58296a == hVar.f58296a && jo.p.c(this.f58297b, hVar.f58297b) && jo.p.c(this.f58298c, hVar.f58298c) && this.f58299d == hVar.f58299d && this.f58300e == hVar.f58300e && jo.p.c(this.f58301f, hVar.f58301f) && jo.p.c(this.f58302g, hVar.f58302g) && jo.p.c(this.f58303h, hVar.f58303h) && this.f58304i == hVar.f58304i && jo.p.c(this.f58305j, hVar.f58305j) && this.f58306k == hVar.f58306k && this.f58307l == hVar.f58307l;
        }
        return false;
    }

    public final int f() {
        return this.f58300e;
    }

    public final int g() {
        return this.f58299d;
    }

    public final String h() {
        return this.f58301f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.f58296a) * 31) + this.f58297b.hashCode()) * 31) + this.f58298c.hashCode()) * 31) + Integer.hashCode(this.f58299d)) * 31) + Integer.hashCode(this.f58300e)) * 31) + this.f58301f.hashCode()) * 31) + this.f58302g.hashCode()) * 31) + this.f58303h.hashCode()) * 31;
        boolean z10 = this.f58304i;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.f58305j.hashCode()) * 31;
        boolean z11 = this.f58306k;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z12 = this.f58307l;
        return i12 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final int i() {
        return this.f58296a;
    }

    public final boolean j() {
        return this.f58306k;
    }

    public final boolean k() {
        return this.f58304i;
    }

    public final boolean l() {
        return this.f58307l;
    }

    public String toString() {
        return "EmomoQuestRankingGradeRankingUserBindModel(userId=" + this.f58296a + ", name=" + this.f58297b + ", rankText=" + this.f58298c + ", rankTextSizeSp=" + this.f58299d + ", rankTextColorResInt=" + this.f58300e + ", scoreText=" + this.f58301f + ", iconUrl=" + this.f58302g + ", labelImageUrl=" + this.f58303h + ", isVisibleLabelImageView=" + this.f58304i + ", badgeImageUrl=" + this.f58305j + ", isVisibleBadgeImageView=" + this.f58306k + ", isVisibleTopDivider=" + this.f58307l + ')';
    }
}
