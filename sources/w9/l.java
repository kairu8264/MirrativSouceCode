package w9;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEventResponse;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d  reason: collision with root package name */
    public static final a f58368d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f58369a;

    /* renamed from: b  reason: collision with root package name */
    public final int f58370b;

    /* renamed from: c  reason: collision with root package name */
    public final String f58371c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(EmomoQuestEventResponse emomoQuestEventResponse) {
            jo.p.h(emomoQuestEventResponse, "eventResponse");
            return new l(emomoQuestEventResponse.getRankReward().getRank(), emomoQuestEventResponse.getRankReward().getScore(), emomoQuestEventResponse.getRankReward().getGrade());
        }
    }

    public l(int i10, int i11, String str) {
        jo.p.h(str, "grade");
        this.f58369a = i10;
        this.f58370b = i11;
        this.f58371c = str;
    }

    public final String a() {
        return this.f58371c;
    }

    public final int b() {
        return this.f58369a;
    }

    public final int c() {
        return this.f58370b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f58369a == lVar.f58369a && this.f58370b == lVar.f58370b && jo.p.c(this.f58371c, lVar.f58371c);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f58369a) * 31) + Integer.hashCode(this.f58370b)) * 31) + this.f58371c.hashCode();
    }

    public String toString() {
        return "EmomoQuestRankingLogParams(rank=" + this.f58369a + ", score=" + this.f58370b + ", grade=" + this.f58371c + ')';
    }
}
