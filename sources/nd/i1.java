package nd;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final ye.a f42174a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42175b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, Long> f42176c;

    /* renamed from: d  reason: collision with root package name */
    public final te.e f42177d;

    /* renamed from: e  reason: collision with root package name */
    public final ge.a f42178e;

    /* renamed from: f  reason: collision with root package name */
    public final te.a f42179f;

    /* renamed from: g  reason: collision with root package name */
    public String f42180g;

    public i1() {
        this(null, false, null, null, null, null, null, 127, null);
    }

    public i1(ye.a aVar, boolean z10, HashMap<String, Long> hashMap, te.e eVar, ge.a aVar2, te.a aVar3, String str) {
        jo.p.h(aVar, "castServiceStatus");
        jo.p.h(hashMap, "dashboardLastLoadedAt");
        jo.p.h(eVar, "playerLiveStatus");
        jo.p.h(aVar2, "chatActivityStatus");
        jo.p.h(aVar3, "playerArchiveStatus");
        jo.p.h(str, "notifiedLatestFolloweeLiveId");
        this.f42174a = aVar;
        this.f42175b = z10;
        this.f42176c = hashMap;
        this.f42177d = eVar;
        this.f42178e = aVar2;
        this.f42179f = aVar3;
        this.f42180g = str;
    }

    public final ye.a a() {
        return this.f42174a;
    }

    public final ge.a b() {
        return this.f42178e;
    }

    public final te.a c() {
        return this.f42179f;
    }

    public final te.e d() {
        return this.f42177d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            return jo.p.c(this.f42174a, i1Var.f42174a) && this.f42175b == i1Var.f42175b && jo.p.c(this.f42176c, i1Var.f42176c) && jo.p.c(this.f42177d, i1Var.f42177d) && jo.p.c(this.f42178e, i1Var.f42178e) && jo.p.c(this.f42179f, i1Var.f42179f) && jo.p.c(this.f42180g, i1Var.f42180g);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f42174a.hashCode() * 31;
        boolean z10 = this.f42175b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((((((hashCode + i10) * 31) + this.f42176c.hashCode()) * 31) + this.f42177d.hashCode()) * 31) + this.f42178e.hashCode()) * 31) + this.f42179f.hashCode()) * 31) + this.f42180g.hashCode();
    }

    public String toString() {
        return "SharedApplicationModel(castServiceStatus=" + this.f42174a + ", highQualityAvailable=" + this.f42175b + ", dashboardLastLoadedAt=" + this.f42176c + ", playerLiveStatus=" + this.f42177d + ", chatActivityStatus=" + this.f42178e + ", playerArchiveStatus=" + this.f42179f + ", notifiedLatestFolloweeLiveId=" + this.f42180g + ')';
    }

    public /* synthetic */ i1(ye.a aVar, boolean z10, HashMap hashMap, te.e eVar, ge.a aVar2, te.a aVar3, String str, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new ye.a("stopped") : aVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? new HashMap() : hashMap, (i10 & 8) != 0 ? new te.e("stopped") : eVar, (i10 & 16) != 0 ? new ge.a() : aVar2, (i10 & 32) != 0 ? new te.a("stopped") : aVar3, (i10 & 64) != 0 ? "" : str);
    }
}
