package w9;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestRankingUser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f58289e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f58290f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f58291a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f58292b;

    /* renamed from: c  reason: collision with root package name */
    public final List<h> f58293c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f58294d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(String str, List<EmomoQuestRankingUser> list) {
            jo.p.h(str, "grade");
            jo.p.h(list, "rankings");
            boolean z10 = str.length() > 0;
            ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                arrayList.add(h.f58295m.a((EmomoQuestRankingUser) obj, i10 > 0));
                i10 = i11;
            }
            return new g(str, z10, arrayList, !list.isEmpty());
        }
    }

    public g(String str, boolean z10, List<h> list, boolean z11) {
        jo.p.h(str, "grade");
        jo.p.h(list, "rankings");
        this.f58291a = str;
        this.f58292b = z10;
        this.f58293c = list;
        this.f58294d = z11;
    }

    public final String a() {
        return this.f58291a;
    }

    public final List<h> b() {
        return this.f58293c;
    }

    public final boolean c() {
        return this.f58292b;
    }

    public final boolean d() {
        return this.f58294d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return jo.p.c(this.f58291a, gVar.f58291a) && this.f58292b == gVar.f58292b && jo.p.c(this.f58293c, gVar.f58293c) && this.f58294d == gVar.f58294d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f58291a.hashCode() * 31;
        boolean z10 = this.f58292b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.f58293c.hashCode()) * 31;
        boolean z11 = this.f58294d;
        return hashCode2 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "EmomoQuestRankingGradeRankingBindModel(grade=" + this.f58291a + ", isVisibleGrade=" + this.f58292b + ", rankings=" + this.f58293c + ", isVisibleRanking=" + this.f58294d + ')';
    }
}
