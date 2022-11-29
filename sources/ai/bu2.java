package ai;

/* loaded from: classes3.dex */
public final class bu2 extends xt2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2553a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2554b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2555c;

    public /* synthetic */ bu2(String str, boolean z10, boolean z11, au2 au2Var) {
        this.f2553a = str;
        this.f2554b = z10;
        this.f2555c = z11;
    }

    @Override // ai.xt2
    public final String a() {
        return this.f2553a;
    }

    @Override // ai.xt2
    public final boolean b() {
        return this.f2554b;
    }

    @Override // ai.xt2
    public final boolean c() {
        return this.f2555c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xt2) {
            xt2 xt2Var = (xt2) obj;
            if (this.f2553a.equals(xt2Var.a()) && this.f2554b == xt2Var.b() && this.f2555c == xt2Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2553a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f2554b ? 1237 : 1231)) * 1000003) ^ (true == this.f2555c ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.f2553a;
        boolean z10 = this.f2554b;
        boolean z11 = this.f2555c;
        StringBuilder sb2 = new StringBuilder(str.length() + 99);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z10);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z11);
        sb2.append("}");
        return sb2.toString();
    }
}
