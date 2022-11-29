package s8;

import android.content.Context;
import com.dena.mirrorman.net.api.response.live.CatalogBanner;
import jo.p;
import r8.a1;
import s8.a;

/* loaded from: classes.dex */
public final class b implements s8.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f52307k = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final String f52308b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52309c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52310d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f52311e;

    /* renamed from: f  reason: collision with root package name */
    public final String f52312f;

    /* renamed from: g  reason: collision with root package name */
    public final String f52313g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f52314h;

    /* renamed from: i  reason: collision with root package name */
    public final int f52315i;

    /* renamed from: j  reason: collision with root package name */
    public final a.b f52316j;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ b b(a aVar, Context context, CatalogBanner catalogBanner, boolean z10, int i10, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                i10 = -1;
            }
            return aVar.a(context, catalogBanner, z10, i10);
        }

        public final b a(Context context, CatalogBanner catalogBanner, boolean z10, int i10) {
            p.h(context, "context");
            p.h(catalogBanner, "catalogBanner");
            String url = catalogBanner.getUrl();
            String bannerImageUrl = catalogBanner.getBannerImageUrl();
            String labelText = catalogBanner.getLabelText();
            boolean z11 = true;
            if (!(catalogBanner.getLabelText().length() > 0) || z10) {
                z11 = false;
            }
            return new b(url, bannerImageUrl, labelText, z11, catalogBanner.getMainText(), catalogBanner.getTermText(), context.getResources().getBoolean(a1.f49828a), i10, null, 256, null);
        }
    }

    public b(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, a.b bVar) {
        p.h(str, "url");
        p.h(str2, "bannerImageUrl");
        p.h(str3, "labelText");
        p.h(str4, "mainText");
        p.h(str5, "termText");
        p.h(bVar, "type");
        this.f52308b = str;
        this.f52309c = str2;
        this.f52310d = str3;
        this.f52311e = z10;
        this.f52312f = str4;
        this.f52313g = str5;
        this.f52314h = z11;
        this.f52315i = i10;
        this.f52316j = bVar;
    }

    public final boolean a() {
        return this.f52314h;
    }

    public final String b() {
        return this.f52309c;
    }

    public final int c() {
        return this.f52315i;
    }

    public final String d() {
        return this.f52310d;
    }

    public final boolean e() {
        return this.f52311e;
    }

    public final String f() {
        return this.f52312f;
    }

    public final String g() {
        return this.f52313g;
    }

    @Override // s8.a
    public a.b getType() {
        return this.f52316j;
    }

    public final String h() {
        return this.f52308b;
    }

    public final boolean i() {
        return this.f52315i != -1;
    }

    public /* synthetic */ b(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, a.b bVar, int i11, jo.h hVar) {
        this(str, str2, str3, z10, str4, str5, z11, (i11 & 128) != 0 ? -1 : i10, (i11 & 256) != 0 ? a.b.CATALOG_BANNER : bVar);
    }
}
