package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class w3 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final String f55652w;

    /* renamed from: x  reason: collision with root package name */
    public final int f55653x;

    /* renamed from: y  reason: collision with root package name */
    public final a.EnumC0862a f55654y;

    public w3(String str, int i10, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "expandText");
        jo.p.h(enumC0862a, "type");
        this.f55652w = str;
        this.f55653x = i10;
        this.f55654y = enumC0862a;
    }

    public final String a() {
        return this.f55652w;
    }

    public final int b() {
        return this.f55653x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w3) {
            w3 w3Var = (w3) obj;
            return jo.p.c(this.f55652w, w3Var.f55652w) && this.f55653x == w3Var.f55653x && getType() == w3Var.getType();
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55654y;
    }

    public int hashCode() {
        return (((this.f55652w.hashCode() * 31) + Integer.hashCode(this.f55653x)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "ShooterRankingExpandBindModel(expandText=" + this.f55652w + ", textColor=" + this.f55653x + ", type=" + getType() + ')';
    }

    public /* synthetic */ w3(String str, int i10, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(str, i10, (i11 & 4) != 0 ? a.EnumC0862a.SHOOTER_RANKING_EXPAND : enumC0862a);
    }
}
