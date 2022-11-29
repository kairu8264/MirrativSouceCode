package ud;

import com.dena.mirrorman.net.api.response.RibbonResponse;

/* loaded from: classes2.dex */
public final class h3 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f54997f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f54998a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54999b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55000c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55001d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55002e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h3 a(RibbonResponse ribbonResponse) {
            jo.p.h(ribbonResponse, "ribbonResponse");
            return new h3(ribbonResponse.getRibbonId(), ribbonResponse.getImageUrl(), ribbonResponse.isLabel(), !ribbonResponse.isContinuousRibbon(), ribbonResponse.isContinuousRibbon());
        }
    }

    public h3(int i10, String str, boolean z10, boolean z11, boolean z12) {
        jo.p.h(str, "ribbonImageUrl");
        this.f54998a = i10;
        this.f54999b = str;
        this.f55000c = z10;
        this.f55001d = z11;
        this.f55002e = z12;
    }

    public final float a() {
        return this.f55001d ? 1.0f : 0.2f;
    }

    public final int b() {
        return this.f54998a;
    }

    public final String c() {
        return this.f54999b;
    }

    public final boolean d() {
        return this.f55002e;
    }

    public final boolean e() {
        return this.f55000c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h3) {
            h3 h3Var = (h3) obj;
            return this.f54998a == h3Var.f54998a && jo.p.c(this.f54999b, h3Var.f54999b) && this.f55000c == h3Var.f55000c && this.f55001d == h3Var.f55001d && this.f55002e == h3Var.f55002e;
        }
        return false;
    }

    public final boolean f() {
        return this.f55001d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f54998a) * 31) + this.f54999b.hashCode()) * 31;
        boolean z10 = this.f55000c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55001d;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f55002e;
        return i13 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "SelectRibbonBindModel(ribbonId=" + this.f54998a + ", ribbonImageUrl=" + this.f54999b + ", isDefault=" + this.f55000c + ", isEnabled=" + this.f55001d + ", isContinuousRibbon=" + this.f55002e + ')';
    }
}
