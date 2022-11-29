package z9;

import ud.a;

/* loaded from: classes.dex */
public final class m implements ud.a {

    /* renamed from: w  reason: collision with root package name */
    public final String f62856w;

    /* renamed from: x  reason: collision with root package name */
    public final int f62857x;

    /* renamed from: y  reason: collision with root package name */
    public final a.EnumC0862a f62858y;

    public m(String str, int i10, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "expandText");
        jo.p.h(enumC0862a, "type");
        this.f62856w = str;
        this.f62857x = i10;
        this.f62858y = enumC0862a;
    }

    public final String a() {
        return this.f62856w;
    }

    public final int b() {
        return this.f62857x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return jo.p.c(this.f62856w, mVar.f62856w) && this.f62857x == mVar.f62857x && getType() == mVar.getType();
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f62858y;
    }

    public int hashCode() {
        return (((this.f62856w.hashCode() * 31) + Integer.hashCode(this.f62857x)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftRankingExpandBindModel(expandText=" + this.f62856w + ", textColor=" + this.f62857x + ", type=" + getType() + ')';
    }

    public /* synthetic */ m(String str, int i10, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(str, i10, (i11 & 4) != 0 ? a.EnumC0862a.GIFT_RANKING_EXPAND : enumC0862a);
    }
}
