package w9;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestReward;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestUserDetail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: s  reason: collision with root package name */
    public static final a f58439s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f58440t = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f58441a;

    /* renamed from: b  reason: collision with root package name */
    public final String f58442b;

    /* renamed from: c  reason: collision with root package name */
    public final String f58443c;

    /* renamed from: d  reason: collision with root package name */
    public final String f58444d;

    /* renamed from: e  reason: collision with root package name */
    public final String f58445e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f58446f;

    /* renamed from: g  reason: collision with root package name */
    public final int f58447g;

    /* renamed from: h  reason: collision with root package name */
    public final String f58448h;

    /* renamed from: i  reason: collision with root package name */
    public final String f58449i;

    /* renamed from: j  reason: collision with root package name */
    public final String f58450j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f58451k;

    /* renamed from: l  reason: collision with root package name */
    public final String f58452l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f58453m;

    /* renamed from: n  reason: collision with root package name */
    public final String f58454n;

    /* renamed from: o  reason: collision with root package name */
    public final String f58455o;

    /* renamed from: p  reason: collision with root package name */
    public final List<n> f58456p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f58457q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f58458r;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(EmomoQuestUserDetail emomoQuestUserDetail, String str, String str2, String str3) {
            int i10;
            jo.p.h(emomoQuestUserDetail, "userDetail");
            jo.p.h(str, "achievedImageUrl");
            jo.p.h(str2, "gradeImageUrl");
            jo.p.h(str3, "gradeLinkUrl");
            int userId = emomoQuestUserDetail.getUserId();
            String name = emomoQuestUserDetail.getName();
            String grade = emomoQuestUserDetail.getGrade();
            String valueOf = String.valueOf(emomoQuestUserDetail.getRank());
            boolean z10 = emomoQuestUserDetail.getRank() > 0 && !emomoQuestUserDetail.isBanned();
            if (emomoQuestUserDetail.isBanned()) {
                i10 = q9.i.text_gift_event_banned;
            } else {
                i10 = q9.i.X;
            }
            int i11 = i10;
            String format = String.format("%,dpt", Arrays.copyOf(new Object[]{Integer.valueOf(emomoQuestUserDetail.getScore())}, 1));
            jo.p.g(format, "format(this, *args)");
            String iconUrl = emomoQuestUserDetail.getIconUrl();
            String labelImageUrl = emomoQuestUserDetail.getLabelImageUrl();
            boolean z11 = emomoQuestUserDetail.getLabelImageUrl().length() > 0;
            String badgeImageUrl = emomoQuestUserDetail.getBadgeImageUrl();
            boolean z12 = emomoQuestUserDetail.getBadgeImageUrl().length() > 0;
            List<EmomoQuestReward> rewards = emomoQuestUserDetail.getRewards();
            ArrayList arrayList = new ArrayList(xn.t.u(rewards, 10));
            Iterator it = rewards.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    xn.s.t();
                }
                arrayList.add(n.f58401o.a(i12, (EmomoQuestReward) next, str));
                it = it;
                i12 = i13;
            }
            return new s(userId, name, grade, str2, valueOf, z10, i11, format, iconUrl, labelImageUrl, z11, badgeImageUrl, z12, str, str3, arrayList, emomoQuestUserDetail.getGrade().length() > 0, emomoQuestUserDetail.getGrade().length() > 0);
        }
    }

    public s(int i10, String str, String str2, String str3, String str4, boolean z10, int i11, String str5, String str6, String str7, boolean z11, String str8, boolean z12, String str9, String str10, List<n> list, boolean z13, boolean z14) {
        jo.p.h(str, "name");
        jo.p.h(str2, "grade");
        jo.p.h(str3, "gradeImageUrl");
        jo.p.h(str4, "rankText");
        jo.p.h(str5, "scoreText");
        jo.p.h(str6, "iconUrl");
        jo.p.h(str7, "labelImageUrl");
        jo.p.h(str8, "badgeImageUrl");
        jo.p.h(str9, "achievedImageUrl");
        jo.p.h(str10, "gradeLinkUrl");
        jo.p.h(list, "rewards");
        this.f58441a = i10;
        this.f58442b = str;
        this.f58443c = str2;
        this.f58444d = str3;
        this.f58445e = str4;
        this.f58446f = z10;
        this.f58447g = i11;
        this.f58448h = str5;
        this.f58449i = str6;
        this.f58450j = str7;
        this.f58451k = z11;
        this.f58452l = str8;
        this.f58453m = z12;
        this.f58454n = str9;
        this.f58455o = str10;
        this.f58456p = list;
        this.f58457q = z13;
        this.f58458r = z14;
    }

    public final int a() {
        return this.f58447g;
    }

    public final String b() {
        return this.f58452l;
    }

    public final String c() {
        return this.f58443c;
    }

    public final String d() {
        return this.f58444d;
    }

    public final String e() {
        return this.f58455o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f58441a == sVar.f58441a && jo.p.c(this.f58442b, sVar.f58442b) && jo.p.c(this.f58443c, sVar.f58443c) && jo.p.c(this.f58444d, sVar.f58444d) && jo.p.c(this.f58445e, sVar.f58445e) && this.f58446f == sVar.f58446f && this.f58447g == sVar.f58447g && jo.p.c(this.f58448h, sVar.f58448h) && jo.p.c(this.f58449i, sVar.f58449i) && jo.p.c(this.f58450j, sVar.f58450j) && this.f58451k == sVar.f58451k && jo.p.c(this.f58452l, sVar.f58452l) && this.f58453m == sVar.f58453m && jo.p.c(this.f58454n, sVar.f58454n) && jo.p.c(this.f58455o, sVar.f58455o) && jo.p.c(this.f58456p, sVar.f58456p) && this.f58457q == sVar.f58457q && this.f58458r == sVar.f58458r;
        }
        return false;
    }

    public final String f() {
        return this.f58449i;
    }

    public final String g() {
        return this.f58450j;
    }

    public final String h() {
        return this.f58442b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f58441a) * 31) + this.f58442b.hashCode()) * 31) + this.f58443c.hashCode()) * 31) + this.f58444d.hashCode()) * 31) + this.f58445e.hashCode()) * 31;
        boolean z10 = this.f58446f;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((((hashCode + i10) * 31) + Integer.hashCode(this.f58447g)) * 31) + this.f58448h.hashCode()) * 31) + this.f58449i.hashCode()) * 31) + this.f58450j.hashCode()) * 31;
        boolean z11 = this.f58451k;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode3 = (((hashCode2 + i11) * 31) + this.f58452l.hashCode()) * 31;
        boolean z12 = this.f58453m;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int hashCode4 = (((((((hashCode3 + i12) * 31) + this.f58454n.hashCode()) * 31) + this.f58455o.hashCode()) * 31) + this.f58456p.hashCode()) * 31;
        boolean z13 = this.f58457q;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode4 + i13) * 31;
        boolean z14 = this.f58458r;
        return i14 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final String i() {
        return this.f58445e;
    }

    public final List<n> j() {
        return this.f58456p;
    }

    public final String k() {
        return this.f58448h;
    }

    public final int l() {
        return this.f58441a;
    }

    public final boolean m() {
        return this.f58453m;
    }

    public final boolean n() {
        return this.f58457q;
    }

    public final boolean o() {
        return this.f58458r;
    }

    public final boolean p() {
        return this.f58451k;
    }

    public final boolean q() {
        return this.f58446f;
    }

    public String toString() {
        return "EmomoQuestRankingUserDetailBindModel(userId=" + this.f58441a + ", name=" + this.f58442b + ", grade=" + this.f58443c + ", gradeImageUrl=" + this.f58444d + ", rankText=" + this.f58445e + ", isVisibleRankText=" + this.f58446f + ", alternativeRankText=" + this.f58447g + ", scoreText=" + this.f58448h + ", iconUrl=" + this.f58449i + ", labelImageUrl=" + this.f58450j + ", isVisibleLabelImageView=" + this.f58451k + ", badgeImageUrl=" + this.f58452l + ", isVisibleBadgeImageView=" + this.f58453m + ", achievedImageUrl=" + this.f58454n + ", gradeLinkUrl=" + this.f58455o + ", rewards=" + this.f58456p + ", isVisibleGradeLink=" + this.f58457q + ", isVisibleGradeRibbon=" + this.f58458r + ')';
    }
}
