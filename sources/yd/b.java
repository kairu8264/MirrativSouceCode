package yd;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f61701d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final we.g f61702a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61703b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f61704c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public b(we.g gVar, String str, boolean z10) {
        jo.p.h(gVar, "rank");
        jo.p.h(str, "bonusDescription");
        this.f61702a = gVar;
        this.f61703b = str;
        this.f61704c = z10;
    }

    public final String a() {
        return this.f61703b;
    }

    public final we.g b() {
        return this.f61702a;
    }

    public final boolean c() {
        return this.f61704c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f61702a == bVar.f61702a && jo.p.c(this.f61703b, bVar.f61703b) && this.f61704c == bVar.f61704c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f61702a.hashCode() * 31) + this.f61703b.hashCode()) * 31;
        boolean z10 = this.f61704c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "CheerLevelUpCommentBonusDescriptionBindModel(rank=" + this.f61702a + ", bonusDescription=" + this.f61703b + ", isVisibleBonusDescription=" + this.f61704c + ')';
    }
}
