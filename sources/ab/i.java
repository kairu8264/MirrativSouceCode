package ab;

import com.google.android.exoplayer2.metadata.id3.InternalFrame;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f783d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f784a;

    /* renamed from: b  reason: collision with root package name */
    public final String f785b;

    /* renamed from: c  reason: collision with root package name */
    public final String f786c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a() {
            return new i(InternalFrame.ID, InternalFrame.ID, InternalFrame.ID);
        }
    }

    public i(String str, String str2, String str3) {
        jo.p.h(str, "possessionCoin");
        jo.p.h(str2, "freeCoin");
        jo.p.h(str3, "paidCoin");
        this.f784a = str;
        this.f785b = str2;
        this.f786c = str3;
    }

    public final String a() {
        return this.f785b;
    }

    public final String b() {
        return this.f786c;
    }

    public final String c() {
        return this.f784a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return jo.p.c(this.f784a, iVar.f784a) && jo.p.c(this.f785b, iVar.f785b) && jo.p.c(this.f786c, iVar.f786c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f784a.hashCode() * 31) + this.f785b.hashCode()) * 31) + this.f786c.hashCode();
    }

    public String toString() {
        return "CoinPurchaseHeaderBindModel(possessionCoin=" + this.f784a + ", freeCoin=" + this.f785b + ", paidCoin=" + this.f786c + ')';
    }
}
