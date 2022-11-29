package y8;

import com.dena.mirrorman.net.api.response.App;
import jo.p;
import ud.j2;
import y8.d;

/* loaded from: classes.dex */
public final class g implements j2 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f61300g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f61301a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61302b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f61303c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f61304d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f61305e;

    /* renamed from: f  reason: collision with root package name */
    public final j2.a f61306f;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(d dVar, boolean z10) {
            String iconUrl;
            String appId;
            p.h(dVar, "itemApp");
            App.AppParams a10 = dVar.a();
            String str = (a10 == null || (appId = a10.getAppId()) == null) ? "" : appId;
            App.AppParams a11 = dVar.a();
            String str2 = (a11 == null || (iconUrl = a11.getIconUrl()) == null) ? "" : iconUrl;
            boolean z11 = !z10 || dVar.b() == d.a.Selected;
            boolean z12 = dVar.b() == d.a.Selected;
            App.AppParams a12 = dVar.a();
            return new g(str, str2, z11, z12, a12 != null ? a12.isHoldingCampaign() : false, null, 32, null);
        }
    }

    public g(String str, String str2, boolean z10, boolean z11, boolean z12, j2.a aVar) {
        p.h(str, "appId");
        p.h(str2, "imageUrl");
        p.h(aVar, "type");
        this.f61301a = str;
        this.f61302b = str2;
        this.f61303c = z10;
        this.f61304d = z11;
        this.f61305e = z12;
        this.f61306f = aVar;
    }

    public final String a() {
        return this.f61301a;
    }

    public final String b() {
        return this.f61302b;
    }

    public final boolean c() {
        return this.f61303c;
    }

    public final boolean d() {
        return this.f61305e;
    }

    public final boolean e() {
        return this.f61304d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return p.c(this.f61301a, gVar.f61301a) && p.c(this.f61302b, gVar.f61302b) && this.f61303c == gVar.f61303c && this.f61304d == gVar.f61304d && this.f61305e == gVar.f61305e && getType() == gVar.getType();
        }
        return false;
    }

    @Override // ud.j2
    public j2.a getType() {
        return this.f61306f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f61301a.hashCode() * 31) + this.f61302b.hashCode()) * 31;
        boolean z10 = this.f61303c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f61304d;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f61305e;
        return ((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "MyAppHasOutlineBindModel(appId=" + this.f61301a + ", imageUrl=" + this.f61302b + ", isActive=" + this.f61303c + ", isVisibleSelectedOutline=" + this.f61304d + ", isVisibleHoldingCampaign=" + this.f61305e + ", type=" + getType() + ')';
    }

    public /* synthetic */ g(String str, String str2, boolean z10, boolean z11, boolean z12, j2.a aVar, int i10, jo.h hVar) {
        this(str, str2, z10, z11, z12, (i10 & 32) != 0 ? j2.a.APP : aVar);
    }
}
