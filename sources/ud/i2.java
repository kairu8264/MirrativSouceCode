package ud;

import ud.j2;

/* loaded from: classes2.dex */
public final class i2 implements j2 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f55019a;

    /* renamed from: b  reason: collision with root package name */
    public final j2.a f55020b;

    public i2(boolean z10, j2.a aVar) {
        jo.p.h(aVar, "type");
        this.f55019a = z10;
        this.f55020b = aVar;
    }

    public final boolean a() {
        return this.f55019a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i2) {
            i2 i2Var = (i2) obj;
            return this.f55019a == i2Var.f55019a && getType() == i2Var.getType();
        }
        return false;
    }

    @Override // ud.j2
    public j2.a getType() {
        return this.f55020b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z10 = this.f55019a;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return (i10 * 31) + getType().hashCode();
    }

    public String toString() {
        return "MyAppAddHasOutlineBindModel(isVisibleRegistrationGuide=" + this.f55019a + ", type=" + getType() + ')';
    }

    public /* synthetic */ i2(boolean z10, j2.a aVar, int i10, jo.h hVar) {
        this(z10, (i10 & 2) != 0 ? j2.a.ADD : aVar);
    }
}
