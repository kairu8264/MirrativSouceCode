package jf;

import com.dena.mirrorman.net.api.response.GiftPanelBanner;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f37979a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37980b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37981c;

    /* renamed from: d  reason: collision with root package name */
    public final String f37982d;

    /* renamed from: e  reason: collision with root package name */
    public final String f37983e;

    /* renamed from: f  reason: collision with root package name */
    public final GiftPanelBanner f37984f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f37985g;

    /* renamed from: h  reason: collision with root package name */
    public final List<q> f37986h;

    /* renamed from: i  reason: collision with root package name */
    public final String f37987i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f37988j;

    public s(String str, int i10, int i11, String str2, String str3, GiftPanelBanner giftPanelBanner, boolean z10, List<q> list, String str4, boolean z11) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "title");
        jo.p.h(str3, "iconUrl");
        jo.p.h(list, "gifts");
        jo.p.h(str4, "liveGameId");
        this.f37979a = str;
        this.f37980b = i10;
        this.f37981c = i11;
        this.f37982d = str2;
        this.f37983e = str3;
        this.f37984f = giftPanelBanner;
        this.f37985g = z10;
        this.f37986h = list;
        this.f37987i = str4;
        this.f37988j = z11;
    }

    public final s a(String str, int i10, int i11, String str2, String str3, GiftPanelBanner giftPanelBanner, boolean z10, List<q> list, String str4, boolean z11) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "title");
        jo.p.h(str3, "iconUrl");
        jo.p.h(list, "gifts");
        jo.p.h(str4, "liveGameId");
        return new s(str, i10, i11, str2, str3, giftPanelBanner, z10, list, str4, z11);
    }

    public final GiftPanelBanner c() {
        return this.f37984f;
    }

    public final List<q> d() {
        return this.f37986h;
    }

    public final String e() {
        return this.f37983e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return jo.p.c(this.f37979a, sVar.f37979a) && this.f37980b == sVar.f37980b && this.f37981c == sVar.f37981c && jo.p.c(this.f37982d, sVar.f37982d) && jo.p.c(this.f37983e, sVar.f37983e) && jo.p.c(this.f37984f, sVar.f37984f) && this.f37985g == sVar.f37985g && jo.p.c(this.f37986h, sVar.f37986h) && jo.p.c(this.f37987i, sVar.f37987i) && this.f37988j == sVar.f37988j;
        }
        return false;
    }

    public final String f() {
        return this.f37979a;
    }

    public final String g() {
        return this.f37987i;
    }

    public final int h() {
        return this.f37981c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f37979a.hashCode() * 31) + Integer.hashCode(this.f37980b)) * 31) + Integer.hashCode(this.f37981c)) * 31) + this.f37982d.hashCode()) * 31) + this.f37983e.hashCode()) * 31;
        GiftPanelBanner giftPanelBanner = this.f37984f;
        int hashCode2 = (hashCode + (giftPanelBanner == null ? 0 : giftPanelBanner.hashCode())) * 31;
        boolean z10 = this.f37985g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode3 = (((((hashCode2 + i10) * 31) + this.f37986h.hashCode()) * 31) + this.f37987i.hashCode()) * 31;
        boolean z11 = this.f37988j;
        return hashCode3 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String i() {
        return this.f37982d;
    }

    public final int j() {
        return this.f37980b;
    }

    public final boolean k() {
        return this.f37985g;
    }

    public final boolean l() {
        return this.f37988j;
    }

    public final boolean m() {
        return this.f37984f != null || (this.f37986h.isEmpty() ^ true);
    }

    public final boolean n() {
        return this.f37983e.length() > 0;
    }

    public final boolean o() {
        return this.f37987i.length() > 0;
    }

    public final boolean p() {
        return !n();
    }

    public String toString() {
        return "GiftPanel(id=" + this.f37979a + ", type=" + this.f37980b + ", reasonId=" + this.f37981c + ", title=" + this.f37982d + ", iconUrl=" + this.f37983e + ", banner=" + this.f37984f + ", isDefault=" + this.f37985g + ", gifts=" + this.f37986h + ", liveGameId=" + this.f37987i + ", isRankingFocusedEvent=" + this.f37988j + ')';
    }
}
