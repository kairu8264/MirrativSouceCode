package ab;

import ab.k;

/* loaded from: classes2.dex */
public final class m implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final a f791f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f792a;

    /* renamed from: b  reason: collision with root package name */
    public final String f793b;

    /* renamed from: c  reason: collision with root package name */
    public final int f794c;

    /* renamed from: d  reason: collision with root package name */
    public final String f795d;

    /* renamed from: e  reason: collision with root package name */
    public final k.a f796e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public m(String str, String str2, int i10, String str3, k.a aVar) {
        jo.p.h(str, "sku");
        jo.p.h(str2, "itemName");
        jo.p.h(str3, "price");
        jo.p.h(aVar, "type");
        this.f792a = str;
        this.f793b = str2;
        this.f794c = i10;
        this.f795d = str3;
        this.f796e = aVar;
    }

    public final String a() {
        return this.f793b;
    }

    public final int b() {
        return this.f794c;
    }

    public final String c() {
        return this.f795d;
    }

    public final String d() {
        return this.f792a;
    }

    public final boolean e() {
        return this.f794c > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return jo.p.c(this.f792a, mVar.f792a) && jo.p.c(this.f793b, mVar.f793b) && this.f794c == mVar.f794c && jo.p.c(this.f795d, mVar.f795d) && getType() == mVar.getType();
        }
        return false;
    }

    @Override // ab.k
    public k.a getType() {
        return this.f796e;
    }

    public int hashCode() {
        return (((((((this.f792a.hashCode() * 31) + this.f793b.hashCode()) * 31) + Integer.hashCode(this.f794c)) * 31) + this.f795d.hashCode()) * 31) + getType().hashCode();
    }

    public String toString() {
        return "CoinPurchaseNormalItemBindModel(sku=" + this.f792a + ", itemName=" + this.f793b + ", omakeCoin=" + this.f794c + ", price=" + this.f795d + ", type=" + getType() + ')';
    }

    public /* synthetic */ m(String str, String str2, int i10, String str3, k.a aVar, int i11, jo.h hVar) {
        this(str, str2, i10, str3, (i11 & 16) != 0 ? k.a.NORMAL : aVar);
    }
}
