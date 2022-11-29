package ud;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f54987a;

    /* renamed from: b  reason: collision with root package name */
    public final int f54988b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54989c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f54990d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f54991e;

    public h0(int i10, int i11, int i12, androidx.lifecycle.e0<Integer> e0Var, boolean z10) {
        jo.p.h(e0Var, "currentProgress");
        this.f54987a = i10;
        this.f54988b = i11;
        this.f54989c = i12;
        this.f54990d = e0Var;
        this.f54991e = z10;
    }

    public final androidx.lifecycle.e0<Integer> a() {
        return this.f54990d;
    }

    public final int b() {
        return this.f54989c;
    }

    public final int c() {
        return this.f54987a;
    }

    public final int d() {
        return this.f54988b;
    }

    public final boolean e() {
        return this.f54991e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return this.f54987a == h0Var.f54987a && this.f54988b == h0Var.f54988b && this.f54989c == h0Var.f54989c && jo.p.c(this.f54990d, h0Var.f54990d) && this.f54991e == h0Var.f54991e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f54987a) * 31) + Integer.hashCode(this.f54988b)) * 31) + Integer.hashCode(this.f54989c)) * 31) + this.f54990d.hashCode()) * 31;
        boolean z10 = this.f54991e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "GiftGachaGaugeBindModel(gaugeColor=" + this.f54987a + ", maxProgress=" + this.f54988b + ", endProgress=" + this.f54989c + ", currentProgress=" + this.f54990d + ", isVisibleProgress=" + this.f54991e + ')';
    }
}
