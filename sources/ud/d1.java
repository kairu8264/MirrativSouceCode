package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class d1 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final int f54858w;

    /* renamed from: x  reason: collision with root package name */
    public final a.EnumC0862a f54859x;

    public d1(int i10, a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f54858w = i10;
        this.f54859x = enumC0862a;
    }

    public final int a() {
        return this.f54858w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            return this.f54858w == d1Var.f54858w && getType() == d1Var.getType();
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54859x;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f54858w) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftRankingRankUpRouletteDummyUserBindModel(dummyImageResInt=" + this.f54858w + ", type=" + getType() + ')';
    }

    public /* synthetic */ d1(int i10, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(i10, (i11 & 2) != 0 ? a.EnumC0862a.GIFT_RANKING_RANK_UP_NEARBY_DUMMY_USER : enumC0862a);
    }
}
