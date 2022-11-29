package ab;

import ab.k;

/* loaded from: classes2.dex */
public final class p implements k {

    /* renamed from: g  reason: collision with root package name */
    public static final a f808g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f809a;

    /* renamed from: b  reason: collision with root package name */
    public final String f810b;

    /* renamed from: c  reason: collision with root package name */
    public final int f811c;

    /* renamed from: d  reason: collision with root package name */
    public final String f812d;

    /* renamed from: e  reason: collision with root package name */
    public final String f813e;

    /* renamed from: f  reason: collision with root package name */
    public final k.a f814f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public p(String str, String str2, int i10, String str3, String str4, k.a aVar) {
        jo.p.h(str, "sku");
        jo.p.h(str2, "itemName");
        jo.p.h(str3, "price");
        jo.p.h(str4, "specialRibbonUrl");
        jo.p.h(aVar, "type");
        this.f809a = str;
        this.f810b = str2;
        this.f811c = i10;
        this.f812d = str3;
        this.f813e = str4;
        this.f814f = aVar;
    }

    public final String a() {
        return this.f810b;
    }

    public final int b() {
        return this.f811c;
    }

    public final String c() {
        return this.f812d;
    }

    public final String d() {
        return this.f809a;
    }

    public final String e() {
        return this.f813e;
    }

    @Override // ab.k
    public k.a getType() {
        return this.f814f;
    }

    public /* synthetic */ p(String str, String str2, int i10, String str3, String str4, k.a aVar, int i11, jo.h hVar) {
        this(str, str2, i10, str3, str4, (i11 & 32) != 0 ? k.a.SPECIAL : aVar);
    }
}
