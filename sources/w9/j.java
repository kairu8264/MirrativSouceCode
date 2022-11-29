package w9;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestReward;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: g  reason: collision with root package name */
    public static final a f58348g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f58349h = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f58350a;

    /* renamed from: b  reason: collision with root package name */
    public final String f58351b;

    /* renamed from: c  reason: collision with root package name */
    public final String f58352c;

    /* renamed from: d  reason: collision with root package name */
    public final String f58353d;

    /* renamed from: e  reason: collision with root package name */
    public final String f58354e;

    /* renamed from: f  reason: collision with root package name */
    public final List<p> f58355f;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(String str, String str2, String str3, String str4, String str5, List<EmomoQuestReward> list) {
            jo.p.h(str, "headerImageUrl");
            jo.p.h(str2, "titles");
            jo.p.h(str3, "subTitles");
            jo.p.h(str4, "rulePopupUrl");
            jo.p.h(str5, "gachaPageUrl");
            jo.p.h(list, "stageRewards");
            ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                arrayList.add(p.f58420d.a(i10, (EmomoQuestReward) obj));
                i10 = i11;
            }
            return new j(str, str2, str3, str4, str5, arrayList);
        }
    }

    public j(String str, String str2, String str3, String str4, String str5, List<p> list) {
        jo.p.h(str, "headerImageUrl");
        jo.p.h(str2, "title");
        jo.p.h(str3, "subTitle");
        jo.p.h(str4, "rulePopupUrl");
        jo.p.h(str5, "gachaPageUrl");
        jo.p.h(list, "stageRewards");
        this.f58350a = str;
        this.f58351b = str2;
        this.f58352c = str3;
        this.f58353d = str4;
        this.f58354e = str5;
        this.f58355f = list;
    }

    public final String a() {
        return this.f58354e;
    }

    public final String b() {
        return this.f58350a;
    }

    public final String c() {
        return this.f58353d;
    }

    public final List<p> d() {
        return this.f58355f;
    }

    public final String e() {
        return this.f58352c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return jo.p.c(this.f58350a, jVar.f58350a) && jo.p.c(this.f58351b, jVar.f58351b) && jo.p.c(this.f58352c, jVar.f58352c) && jo.p.c(this.f58353d, jVar.f58353d) && jo.p.c(this.f58354e, jVar.f58354e) && jo.p.c(this.f58355f, jVar.f58355f);
        }
        return false;
    }

    public final String f() {
        return this.f58351b;
    }

    public int hashCode() {
        return (((((((((this.f58350a.hashCode() * 31) + this.f58351b.hashCode()) * 31) + this.f58352c.hashCode()) * 31) + this.f58353d.hashCode()) * 31) + this.f58354e.hashCode()) * 31) + this.f58355f.hashCode();
    }

    public String toString() {
        return "EmomoQuestRankingHeaderBindModel(headerImageUrl=" + this.f58350a + ", title=" + this.f58351b + ", subTitle=" + this.f58352c + ", rulePopupUrl=" + this.f58353d + ", gachaPageUrl=" + this.f58354e + ", stageRewards=" + this.f58355f + ')';
    }
}
