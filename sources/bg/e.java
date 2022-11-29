package bg;

import bg.k;

/* loaded from: classes3.dex */
public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k.b f18422a;

    /* renamed from: b  reason: collision with root package name */
    public final bg.a f18423b;

    /* loaded from: classes3.dex */
    public static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        public k.b f18424a;

        /* renamed from: b  reason: collision with root package name */
        public bg.a f18425b;

        @Override // bg.k.a
        public k a() {
            return new e(this.f18424a, this.f18425b);
        }

        @Override // bg.k.a
        public k.a b(bg.a aVar) {
            this.f18425b = aVar;
            return this;
        }

        @Override // bg.k.a
        public k.a c(k.b bVar) {
            this.f18424a = bVar;
            return this;
        }
    }

    @Override // bg.k
    public bg.a b() {
        return this.f18423b;
    }

    @Override // bg.k
    public k.b c() {
        return this.f18422a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f18422a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                bg.a aVar = this.f18423b;
                if (aVar == null) {
                    if (kVar.b() == null) {
                        return true;
                    }
                } else if (aVar.equals(kVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f18422a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        bg.a aVar = this.f18423b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f18422a + ", androidClientInfo=" + this.f18423b + "}";
    }

    public e(k.b bVar, bg.a aVar) {
        this.f18422a = bVar;
        this.f18423b = aVar;
    }
}
