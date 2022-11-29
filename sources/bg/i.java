package bg;

import bg.o;

/* loaded from: classes3.dex */
public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final o.c f18455a;

    /* renamed from: b  reason: collision with root package name */
    public final o.b f18456b;

    /* loaded from: classes3.dex */
    public static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        public o.c f18457a;

        /* renamed from: b  reason: collision with root package name */
        public o.b f18458b;

        @Override // bg.o.a
        public o a() {
            return new i(this.f18457a, this.f18458b);
        }

        @Override // bg.o.a
        public o.a b(o.b bVar) {
            this.f18458b = bVar;
            return this;
        }

        @Override // bg.o.a
        public o.a c(o.c cVar) {
            this.f18457a = cVar;
            return this;
        }
    }

    @Override // bg.o
    public o.b b() {
        return this.f18456b;
    }

    @Override // bg.o
    public o.c c() {
        return this.f18455a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f18455a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f18456b;
                if (bVar == null) {
                    if (oVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(oVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f18455a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f18456b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f18455a + ", mobileSubtype=" + this.f18456b + "}";
    }

    public i(o.c cVar, o.b bVar) {
        this.f18455a = cVar;
        this.f18456b = bVar;
    }
}
