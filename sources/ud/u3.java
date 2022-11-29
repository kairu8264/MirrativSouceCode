package ud;

import ud.r3;

/* loaded from: classes2.dex */
public final class u3 implements r3 {

    /* renamed from: b  reason: collision with root package name */
    public final int f55572b;

    /* renamed from: c  reason: collision with root package name */
    public final r3.b f55573c;

    public u3(int i10, r3.b bVar) {
        jo.p.h(bVar, "type");
        this.f55572b = i10;
        this.f55573c = bVar;
    }

    public final int a() {
        return this.f55572b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u3) {
            u3 u3Var = (u3) obj;
            return this.f55572b == u3Var.f55572b && getType() == u3Var.getType();
        }
        return false;
    }

    @Override // ud.r3
    public r3.b getType() {
        return this.f55573c;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f55572b) * 31) + getType().hashCode();
    }

    public String toString() {
        return "ShooterPartsCategoryTitleBindModel(titleTextResId=" + this.f55572b + ", type=" + getType() + ')';
    }

    public /* synthetic */ u3(int i10, r3.b bVar, int i11, jo.h hVar) {
        this(i10, (i11 & 2) != 0 ? r3.b.TITLE : bVar);
    }
}
