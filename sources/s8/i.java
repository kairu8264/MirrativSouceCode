package s8;

import android.content.Context;
import androidx.lifecycle.e0;
import com.dena.mirrorman.net.api.response.live.LiveCatalogMirrativQ;
import jo.p;
import r8.a1;
import s8.a;

/* loaded from: classes.dex */
public final class i implements s8.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f52385j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f52386k = 8;

    /* renamed from: b  reason: collision with root package name */
    public final e0<Boolean> f52387b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52388c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52389d;

    /* renamed from: e  reason: collision with root package name */
    public final String f52390e;

    /* renamed from: f  reason: collision with root package name */
    public final String f52391f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f52392g;

    /* renamed from: h  reason: collision with root package name */
    public final int f52393h;

    /* renamed from: i  reason: collision with root package name */
    public final a.b f52394i;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ i b(a aVar, Context context, LiveCatalogMirrativQ liveCatalogMirrativQ, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i10 = -1;
            }
            return aVar.a(context, liveCatalogMirrativQ, i10);
        }

        public final i a(Context context, LiveCatalogMirrativQ liveCatalogMirrativQ, int i10) {
            p.h(context, "context");
            p.h(liveCatalogMirrativQ, "mirrativQ");
            return new i(new e0(Boolean.valueOf(liveCatalogMirrativQ.isFollowing())), liveCatalogMirrativQ.getUrl(), liveCatalogMirrativQ.getUserId(), liveCatalogMirrativQ.getShareText(), liveCatalogMirrativQ.getImageUrl(), context.getResources().getBoolean(a1.f49828a), i10, null, 128, null);
        }
    }

    public i(e0<Boolean> e0Var, String str, String str2, String str3, String str4, boolean z10, int i10, a.b bVar) {
        p.h(e0Var, "isFollowing");
        p.h(str, "bannerLinkUrl");
        p.h(str2, "userId");
        p.h(str3, "shareText");
        p.h(str4, "imageUrl");
        p.h(bVar, "type");
        this.f52387b = e0Var;
        this.f52388c = str;
        this.f52389d = str2;
        this.f52390e = str3;
        this.f52391f = str4;
        this.f52392g = z10;
        this.f52393h = i10;
        this.f52394i = bVar;
    }

    public final boolean a() {
        return this.f52392g;
    }

    public final String b() {
        return this.f52388c;
    }

    public final int c() {
        return this.f52393h;
    }

    public final String d() {
        return this.f52391f;
    }

    public final String e() {
        return this.f52390e;
    }

    public final String f() {
        return this.f52389d;
    }

    public final e0<Boolean> g() {
        return this.f52387b;
    }

    @Override // s8.a
    public a.b getType() {
        return this.f52394i;
    }

    public /* synthetic */ i(e0 e0Var, String str, String str2, String str3, String str4, boolean z10, int i10, a.b bVar, int i11, jo.h hVar) {
        this(e0Var, str, str2, str3, str4, z10, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? a.b.MIRRATIV_Q : bVar);
    }
}
