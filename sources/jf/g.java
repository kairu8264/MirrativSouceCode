package jf;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f37928a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37929b;

    public g(String str, boolean z10) {
        jo.p.h(str, "userId");
        this.f37928a = str;
        this.f37929b = z10;
    }

    public final String a() {
        return this.f37928a;
    }

    public final boolean b() {
        return this.f37929b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return jo.p.c(this.f37928a, gVar.f37928a) && this.f37929b == gVar.f37929b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f37928a.hashCode() * 31;
        boolean z10 = this.f37929b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "CollabEndRequestParam(userId=" + this.f37928a + ", isIceStateConnected=" + this.f37929b + ')';
    }
}
