package xb;

import com.dena.mirrativ.mirrativapi.RankingFocusableResponse;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: h  reason: collision with root package name */
    public static final a f60098h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f60099a;

    /* renamed from: b  reason: collision with root package name */
    public final String f60100b;

    /* renamed from: c  reason: collision with root package name */
    public final String f60101c;

    /* renamed from: d  reason: collision with root package name */
    public final String f60102d;

    /* renamed from: e  reason: collision with root package name */
    public final String f60103e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f60104f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f60105g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t a(RankingFocusableResponse.RankingFocusable rankingFocusable, boolean z10, boolean z11) {
            jo.p.h(rankingFocusable, "focusEvent");
            return new t(rankingFocusable.getEventType(), rankingFocusable.getEventId(), rankingFocusable.getImageUrl(), rankingFocusable.getTitle(), rankingFocusable.getPeriod(), z11, z10);
        }
    }

    public t(int i10, String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        jo.p.h(str, "eventId");
        jo.p.h(str2, "imageUrl");
        jo.p.h(str3, "title");
        jo.p.h(str4, "period");
        this.f60099a = i10;
        this.f60100b = str;
        this.f60101c = str2;
        this.f60102d = str3;
        this.f60103e = str4;
        this.f60104f = z10;
        this.f60105g = z11;
    }

    public static /* synthetic */ t b(t tVar, int i10, String str, String str2, String str3, String str4, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = tVar.f60099a;
        }
        if ((i11 & 2) != 0) {
            str = tVar.f60100b;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = tVar.f60101c;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = tVar.f60102d;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = tVar.f60103e;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            z10 = tVar.f60104f;
        }
        boolean z12 = z10;
        if ((i11 & 64) != 0) {
            z11 = tVar.f60105g;
        }
        return tVar.a(i10, str5, str6, str7, str8, z12, z11);
    }

    public final t a(int i10, String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        jo.p.h(str, "eventId");
        jo.p.h(str2, "imageUrl");
        jo.p.h(str3, "title");
        jo.p.h(str4, "period");
        return new t(i10, str, str2, str3, str4, z10, z11);
    }

    public final String c() {
        return this.f60100b;
    }

    public final int d() {
        return this.f60099a;
    }

    public final boolean e() {
        return this.f60105g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f60099a == tVar.f60099a && jo.p.c(this.f60100b, tVar.f60100b) && jo.p.c(this.f60101c, tVar.f60101c) && jo.p.c(this.f60102d, tVar.f60102d) && jo.p.c(this.f60103e, tVar.f60103e) && this.f60104f == tVar.f60104f && this.f60105g == tVar.f60105g;
        }
        return false;
    }

    public final String f() {
        return this.f60101c;
    }

    public final String g() {
        return this.f60103e;
    }

    public final String h() {
        return this.f60102d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f60099a) * 31) + this.f60100b.hashCode()) * 31) + this.f60101c.hashCode()) * 31) + this.f60102d.hashCode()) * 31) + this.f60103e.hashCode()) * 31;
        boolean z10 = this.f60104f;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f60105g;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean i() {
        return this.f60104f;
    }

    public String toString() {
        return "RankingFocusEventBindModel(eventType=" + this.f60099a + ", eventId=" + this.f60100b + ", imageUrl=" + this.f60101c + ", title=" + this.f60102d + ", period=" + this.f60103e + ", isSelected=" + this.f60104f + ", hasSelected=" + this.f60105g + ')';
    }
}
