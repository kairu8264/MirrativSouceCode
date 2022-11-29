package s8;

import com.dena.mirrorman.net.api.response.live.CatalogWebBanner;
import jo.p;
import s8.a;

/* loaded from: classes.dex */
public final class l implements s8.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f52426h = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final String f52427b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52428c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52429d;

    /* renamed from: e  reason: collision with root package name */
    public final String f52430e;

    /* renamed from: f  reason: collision with root package name */
    public final int f52431f;

    /* renamed from: g  reason: collision with root package name */
    public final a.b f52432g;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(CatalogWebBanner catalogWebBanner, int i10) {
            p.h(catalogWebBanner, "catalogWebBanner");
            return new l(catalogWebBanner.getUrl(), catalogWebBanner.getAdContentUrl(), catalogWebBanner.getText(), catalogWebBanner.getPeriod(), i10, null, 32, null);
        }
    }

    public l(String str, String str2, String str3, String str4, int i10, a.b bVar) {
        p.h(str, "url");
        p.h(str2, "adContentUrl");
        p.h(str3, "mainText");
        p.h(str4, "termText");
        p.h(bVar, "type");
        this.f52427b = str;
        this.f52428c = str2;
        this.f52429d = str3;
        this.f52430e = str4;
        this.f52431f = i10;
        this.f52432g = bVar;
    }

    public final String a() {
        return this.f52428c;
    }

    public final int b() {
        return this.f52431f;
    }

    public final String c() {
        return this.f52429d;
    }

    public final String d() {
        return this.f52430e;
    }

    public final String e() {
        return this.f52427b;
    }

    @Override // s8.a
    public a.b getType() {
        return this.f52432g;
    }

    public /* synthetic */ l(String str, String str2, String str3, String str4, int i10, a.b bVar, int i11, jo.h hVar) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? a.b.CATALOG_WEB_BANNER : bVar);
    }
}
