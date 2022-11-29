package lc;

import com.dena.mirrorman.net.api.response.FavoriteLiveSetting;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f39829k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f39830a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39831b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39832c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39833d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39834e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f39835f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f39836g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f39837h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f39838i;

    /* renamed from: j  reason: collision with root package name */
    public final String f39839j;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(FavoriteLiveSetting favoriteLiveSetting, String str) {
            jo.p.h(favoriteLiveSetting, "favoriteLiveSetting");
            jo.p.h(str, "favoriteNumberText");
            boolean isNotSet = favoriteLiveSetting.isNotSet();
            return new b(favoriteLiveSetting.getId(), favoriteLiveSetting.getLiveThumbnailImageUrl(), favoriteLiveSetting.getTitle(), favoriteLiveSetting.getMemo(), favoriteLiveSetting.getAppIconUrl(), isNotSet, favoriteLiveSetting.getLiveThumbnailImageUrl().length() == 0, favoriteLiveSetting.getAppIconUrl().length() == 0, !isNotSet, str);
        }
    }

    public b(int i10, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        jo.p.h(str, "thumbnailImageUrl");
        jo.p.h(str2, "title");
        jo.p.h(str3, "memo");
        jo.p.h(str4, "appIconUrl");
        jo.p.h(str5, "favoriteNumberText");
        this.f39830a = i10;
        this.f39831b = str;
        this.f39832c = str2;
        this.f39833d = str3;
        this.f39834e = str4;
        this.f39835f = z10;
        this.f39836g = z11;
        this.f39837h = z12;
        this.f39838i = z13;
        this.f39839j = str5;
    }

    public final String a() {
        return this.f39834e;
    }

    public final int b() {
        return this.f39830a;
    }

    public final String c() {
        return this.f39839j;
    }

    public final String d() {
        return this.f39833d;
    }

    public final String e() {
        return this.f39831b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f39830a == bVar.f39830a && jo.p.c(this.f39831b, bVar.f39831b) && jo.p.c(this.f39832c, bVar.f39832c) && jo.p.c(this.f39833d, bVar.f39833d) && jo.p.c(this.f39834e, bVar.f39834e) && this.f39835f == bVar.f39835f && this.f39836g == bVar.f39836g && this.f39837h == bVar.f39837h && this.f39838i == bVar.f39838i && jo.p.c(this.f39839j, bVar.f39839j);
        }
        return false;
    }

    public final String f() {
        return this.f39832c;
    }

    public final boolean g() {
        return this.f39838i;
    }

    public final boolean h() {
        return this.f39837h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f39830a) * 31) + this.f39831b.hashCode()) * 31) + this.f39832c.hashCode()) * 31) + this.f39833d.hashCode()) * 31) + this.f39834e.hashCode()) * 31;
        boolean z10 = this.f39835f;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f39836g;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f39837h;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f39838i;
        return ((i15 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + this.f39839j.hashCode();
    }

    public final boolean i() {
        return this.f39836g;
    }

    public final boolean j() {
        return this.f39835f;
    }

    public String toString() {
        return "FavoriteLiveSettingBindModel(favoriteId=" + this.f39830a + ", thumbnailImageUrl=" + this.f39831b + ", title=" + this.f39832c + ", memo=" + this.f39833d + ", appIconUrl=" + this.f39834e + ", isVisibleNotSet=" + this.f39835f + ", isVisibleNoThumbnail=" + this.f39836g + ", isVisibleNoApp=" + this.f39837h + ", isEnabledUseSetting=" + this.f39838i + ", favoriteNumberText=" + this.f39839j + ')';
    }
}
