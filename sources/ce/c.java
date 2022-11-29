package ce;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f19315a;

    /* renamed from: b  reason: collision with root package name */
    public final jf.a f19316b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19317c;

    public c(String str, jf.a aVar, boolean z10) {
        jo.p.h(str, "appId");
        jo.p.h(aVar, "appUserDetailType");
        this.f19315a = str;
        this.f19316b = aVar;
        this.f19317c = z10;
    }

    public final String a() {
        return this.f19315a;
    }

    public final jf.a b() {
        return this.f19316b;
    }

    public final boolean c() {
        return this.f19317c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return jo.p.c(this.f19315a, cVar.f19315a) && this.f19316b == cVar.f19316b && this.f19317c == cVar.f19317c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f19315a.hashCode() * 31) + this.f19316b.hashCode()) * 31;
        boolean z10 = this.f19317c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "PublishAppUserDetail(appId=" + this.f19315a + ", appUserDetailType=" + this.f19316b + ", isPublish=" + this.f19317c + ')';
    }
}
