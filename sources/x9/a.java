package x9;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEventResponse;
import jo.h;
import jo.p;
import w9.e;
import w9.g;
import w9.j;
import w9.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0994a f59811f = new C0994a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f59812g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final j f59813a;

    /* renamed from: b  reason: collision with root package name */
    public final s f59814b;

    /* renamed from: c  reason: collision with root package name */
    public final g f59815c;

    /* renamed from: d  reason: collision with root package name */
    public final e f59816d;

    /* renamed from: e  reason: collision with root package name */
    public final String f59817e;

    /* renamed from: x9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0994a {
        public C0994a() {
        }

        public /* synthetic */ C0994a(h hVar) {
            this();
        }

        public final a a(EmomoQuestEventResponse emomoQuestEventResponse) {
            p.h(emomoQuestEventResponse, "eventResponse");
            return new a(j.f58348g.a(emomoQuestEventResponse.getImageUrl(), emomoQuestEventResponse.getTitle(), emomoQuestEventResponse.getSubtitle(), emomoQuestEventResponse.getRulePageUrl(), emomoQuestEventResponse.getGachaPageUrl(), emomoQuestEventResponse.getStageRewards()), s.f58439s.a(emomoQuestEventResponse.getRankReward(), emomoQuestEventResponse.getAchievedImageUrl(), emomoQuestEventResponse.getGradeImageUrl(), emomoQuestEventResponse.getGradeHelpUrl()), g.f58289e.a(emomoQuestEventResponse.getRankReward().getGrade(), emomoQuestEventResponse.getRankings()), e.f58284b.a(emomoQuestEventResponse.getDescriptions()), emomoQuestEventResponse.getFooterImageUrl());
        }
    }

    public a(j jVar, s sVar, g gVar, e eVar, String str) {
        p.h(jVar, "headerBindModel");
        p.h(sVar, "userBindModel");
        p.h(gVar, "rankingBindModel");
        p.h(eVar, "descriptionBindModel");
        p.h(str, "footerImageUrl");
        this.f59813a = jVar;
        this.f59814b = sVar;
        this.f59815c = gVar;
        this.f59816d = eVar;
        this.f59817e = str;
    }

    public final e a() {
        return this.f59816d;
    }

    public final String b() {
        return this.f59817e;
    }

    public final j c() {
        return this.f59813a;
    }

    public final g d() {
        return this.f59815c;
    }

    public final s e() {
        return this.f59814b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f59813a, aVar.f59813a) && p.c(this.f59814b, aVar.f59814b) && p.c(this.f59815c, aVar.f59815c) && p.c(this.f59816d, aVar.f59816d) && p.c(this.f59817e, aVar.f59817e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f59813a.hashCode() * 31) + this.f59814b.hashCode()) * 31) + this.f59815c.hashCode()) * 31) + this.f59816d.hashCode()) * 31) + this.f59817e.hashCode();
    }

    public String toString() {
        return "EmomoQuestRankingBindModel(headerBindModel=" + this.f59813a + ", userBindModel=" + this.f59814b + ", rankingBindModel=" + this.f59815c + ", descriptionBindModel=" + this.f59816d + ", footerImageUrl=" + this.f59817e + ')';
    }
}
