package w9;

import com.dena.mirrativ.mirrativapi.common.Description;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f58284b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f58285c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final List<Description> f58286a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(List<Description> list) {
            jo.p.h(list, "descriptions");
            return new e(list);
        }
    }

    public e(List<Description> list) {
        jo.p.h(list, "descriptions");
        this.f58286a = list;
    }

    public final List<Description> a() {
        return this.f58286a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && jo.p.c(this.f58286a, ((e) obj).f58286a);
    }

    public int hashCode() {
        return this.f58286a.hashCode();
    }

    public String toString() {
        return "EmomoQuestRankingDescriptionBindModel(descriptions=" + this.f58286a + ')';
    }
}
