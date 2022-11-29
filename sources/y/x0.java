package y;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public float f61023a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f61024b;

    /* renamed from: c  reason: collision with root package name */
    public s f61025c;

    public x0() {
        this(0.0f, false, null, 7, null);
    }

    public x0(float f10, boolean z10, s sVar) {
        this.f61023a = f10;
        this.f61024b = z10;
        this.f61025c = sVar;
    }

    public final s a() {
        return this.f61025c;
    }

    public final boolean b() {
        return this.f61024b;
    }

    public final float c() {
        return this.f61023a;
    }

    public final void d(s sVar) {
        this.f61025c = sVar;
    }

    public final void e(boolean z10) {
        this.f61024b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            return jo.p.c(Float.valueOf(this.f61023a), Float.valueOf(x0Var.f61023a)) && this.f61024b == x0Var.f61024b && jo.p.c(this.f61025c, x0Var.f61025c);
        }
        return false;
    }

    public final void f(float f10) {
        this.f61023a = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Float.hashCode(this.f61023a) * 31;
        boolean z10 = this.f61024b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        s sVar = this.f61025c;
        return i11 + (sVar == null ? 0 : sVar.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f61023a + ", fill=" + this.f61024b + ", crossAxisAlignment=" + this.f61025c + ')';
    }

    public /* synthetic */ x0(float f10, boolean z10, s sVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : sVar);
    }
}
