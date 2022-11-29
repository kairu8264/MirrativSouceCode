package ai;

/* loaded from: classes3.dex */
public final class rq2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f9536a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9537b;

    public rq2(String str, String str2) {
        this.f9536a = str;
        this.f9537b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rq2) {
            rq2 rq2Var = (rq2) obj;
            return this.f9536a.equals(rq2Var.f9536a) && this.f9537b.equals(rq2Var.f9537b);
        }
        return false;
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.f9536a);
        String valueOf2 = String.valueOf(this.f9537b);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
