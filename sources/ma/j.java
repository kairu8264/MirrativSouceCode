package ma;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameGift;
import jo.p;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40699d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f40700a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40701b;

    /* renamed from: c  reason: collision with root package name */
    public final String f40702c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(LiveGameGift liveGameGift) {
            p.h(liveGameGift, "liveGameGift");
            return new j(liveGameGift.getIconUrl(), liveGameGift.getTitle(), liveGameGift.getDescription());
        }
    }

    public j(String str, String str2, String str3) {
        p.h(str, "giftImageUrl");
        p.h(str2, "giftTitle");
        p.h(str3, "giftDescription");
        this.f40700a = str;
        this.f40701b = str2;
        this.f40702c = str3;
    }

    public final String a() {
        return this.f40702c;
    }

    public final String b() {
        return this.f40700a;
    }

    public final String c() {
        return this.f40701b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return p.c(this.f40700a, jVar.f40700a) && p.c(this.f40701b, jVar.f40701b) && p.c(this.f40702c, jVar.f40702c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f40700a.hashCode() * 31) + this.f40701b.hashCode()) * 31) + this.f40702c.hashCode();
    }

    public String toString() {
        return "LiveGameGiftInfoBindModel(giftImageUrl=" + this.f40700a + ", giftTitle=" + this.f40701b + ", giftDescription=" + this.f40702c + ')';
    }
}
