package jf;

import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAccessoryAsset;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37934c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f37935a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37936b;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(ClosetBuyableAccessoryAsset closetBuyableAccessoryAsset) {
            jo.p.h(closetBuyableAccessoryAsset, "asset");
            String id2 = closetBuyableAccessoryAsset.getId();
            String name = closetBuyableAccessoryAsset.getName();
            if (name == null) {
                name = "";
            }
            return new l(id2, name);
        }
    }

    public l(String str, String str2) {
        jo.p.h(str, "companionTypeId");
        jo.p.h(str2, "companionName");
        this.f37935a = str;
        this.f37936b = str2;
    }

    public final String a() {
        return this.f37936b;
    }

    public final String b() {
        return this.f37935a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return jo.p.c(this.f37935a, lVar.f37935a) && jo.p.c(this.f37936b, lVar.f37936b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f37935a.hashCode() * 31) + this.f37936b.hashCode();
    }

    public String toString() {
        return "CompanionName(companionTypeId=" + this.f37935a + ", companionName=" + this.f37936b + ')';
    }
}
