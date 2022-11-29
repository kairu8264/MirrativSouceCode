package ud;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.GiftPanelBanner;
import ud.a;

/* loaded from: classes2.dex */
public final class y0 implements ud.a {
    public static final a H = new a(null);
    public final boolean A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final int F;
    public final a.EnumC0862a G;

    /* renamed from: w  reason: collision with root package name */
    public final int f55731w;

    /* renamed from: x  reason: collision with root package name */
    public final String f55732x;

    /* renamed from: y  reason: collision with root package name */
    public final int f55733y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f55734z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y0 a(jf.s sVar, GiftPanelBanner giftPanelBanner) {
            int i10;
            jo.p.h(sVar, "panel");
            jo.p.h(giftPanelBanner, MRLog.TARGET_TYPE_BANNER);
            int type = giftPanelBanner.getType();
            String description = giftPanelBanner.getDescription();
            int endsAt = giftPanelBanner.getEndsAt();
            boolean z10 = giftPanelBanner.getUrl().length() > 0;
            boolean z11 = giftPanelBanner.getEndsAt() > 0;
            String title = giftPanelBanner.getTitle();
            String url = giftPanelBanner.getUrl();
            String eventPageUrl = giftPanelBanner.getEventPageUrl();
            String imageUrl = giftPanelBanner.getImageUrl();
            if (sVar.l()) {
                i10 = nd.w0.S;
            } else {
                i10 = nd.w0.f42242u0;
            }
            return new y0(type, description, endsAt, z10, z11, title, url, eventPageUrl, imageUrl, i10, null, 1024, null);
        }
    }

    public y0(int i10, String str, int i11, boolean z10, boolean z11, String str2, String str3, String str4, String str5, int i12, a.EnumC0862a enumC0862a) {
        jo.p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(str2, "title");
        jo.p.h(str3, "url");
        jo.p.h(str4, "eventPageUrl");
        jo.p.h(str5, "imageUrl");
        jo.p.h(enumC0862a, "type");
        this.f55731w = i10;
        this.f55732x = str;
        this.f55733y = i11;
        this.f55734z = z10;
        this.A = z11;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = str5;
        this.F = i12;
        this.G = enumC0862a;
    }

    public final int a() {
        return this.f55731w;
    }

    public final String b() {
        return this.f55732x;
    }

    public final int c() {
        return this.F;
    }

    public final int d() {
        return this.f55733y;
    }

    public final String e() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            return this.f55731w == y0Var.f55731w && jo.p.c(this.f55732x, y0Var.f55732x) && this.f55733y == y0Var.f55733y && this.f55734z == y0Var.f55734z && this.A == y0Var.A && jo.p.c(this.B, y0Var.B) && jo.p.c(this.C, y0Var.C) && jo.p.c(this.D, y0Var.D) && jo.p.c(this.E, y0Var.E) && this.F == y0Var.F && getType() == y0Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.E;
    }

    public final String g() {
        return this.B;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.G;
    }

    public final String h() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f55731w) * 31) + this.f55732x.hashCode()) * 31) + Integer.hashCode(this.f55733y)) * 31;
        boolean z10 = this.f55734z;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.A;
        return ((((((((((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + Integer.hashCode(this.F)) * 31) + getType().hashCode();
    }

    public final boolean i() {
        return this.f55734z;
    }

    public final boolean j() {
        return this.A;
    }

    public String toString() {
        return "GiftPanelBannerBindModel(bannerType=" + this.f55731w + ", description=" + this.f55732x + ", endsAt=" + this.f55733y + ", isClickable=" + this.f55734z + ", isVisibleEndLabel=" + this.A + ", title=" + this.B + ", url=" + this.C + ", eventPageUrl=" + this.D + ", imageUrl=" + this.E + ", endTextColor=" + this.F + ", type=" + getType() + ')';
    }

    public /* synthetic */ y0(int i10, String str, int i11, boolean z10, boolean z11, String str2, String str3, String str4, String str5, int i12, a.EnumC0862a enumC0862a, int i13, jo.h hVar) {
        this(i10, str, i11, z10, z11, str2, str3, str4, str5, i12, (i13 & 1024) != 0 ? a.EnumC0862a.GIFT_PANEL_BANNER : enumC0862a);
    }
}
