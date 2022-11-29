package cg;

import cg.n;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c extends n {

    /* renamed from: a  reason: collision with root package name */
    public final o f19594a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19595b;

    /* renamed from: c  reason: collision with root package name */
    public final zf.c<?> f19596c;

    /* renamed from: d  reason: collision with root package name */
    public final zf.e<?, byte[]> f19597d;

    /* renamed from: e  reason: collision with root package name */
    public final zf.b f19598e;

    /* loaded from: classes3.dex */
    public static final class b extends n.a {

        /* renamed from: a  reason: collision with root package name */
        public o f19599a;

        /* renamed from: b  reason: collision with root package name */
        public String f19600b;

        /* renamed from: c  reason: collision with root package name */
        public zf.c<?> f19601c;

        /* renamed from: d  reason: collision with root package name */
        public zf.e<?, byte[]> f19602d;

        /* renamed from: e  reason: collision with root package name */
        public zf.b f19603e;

        @Override // cg.n.a
        public n a() {
            String str = "";
            if (this.f19599a == null) {
                str = " transportContext";
            }
            if (this.f19600b == null) {
                str = str + " transportName";
            }
            if (this.f19601c == null) {
                str = str + " event";
            }
            if (this.f19602d == null) {
                str = str + " transformer";
            }
            if (this.f19603e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f19599a, this.f19600b, this.f19601c, this.f19602d, this.f19603e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cg.n.a
        public n.a b(zf.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f19603e = bVar;
            return this;
        }

        @Override // cg.n.a
        public n.a c(zf.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f19601c = cVar;
            return this;
        }

        @Override // cg.n.a
        public n.a d(zf.e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f19602d = eVar;
            return this;
        }

        @Override // cg.n.a
        public n.a e(o oVar) {
            Objects.requireNonNull(oVar, "Null transportContext");
            this.f19599a = oVar;
            return this;
        }

        @Override // cg.n.a
        public n.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f19600b = str;
            return this;
        }
    }

    @Override // cg.n
    public zf.b b() {
        return this.f19598e;
    }

    @Override // cg.n
    public zf.c<?> c() {
        return this.f19596c;
    }

    @Override // cg.n
    public zf.e<?, byte[]> e() {
        return this.f19597d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f19594a.equals(nVar.f()) && this.f19595b.equals(nVar.g()) && this.f19596c.equals(nVar.c()) && this.f19597d.equals(nVar.e()) && this.f19598e.equals(nVar.b());
        }
        return false;
    }

    @Override // cg.n
    public o f() {
        return this.f19594a;
    }

    @Override // cg.n
    public String g() {
        return this.f19595b;
    }

    public int hashCode() {
        return ((((((((this.f19594a.hashCode() ^ 1000003) * 1000003) ^ this.f19595b.hashCode()) * 1000003) ^ this.f19596c.hashCode()) * 1000003) ^ this.f19597d.hashCode()) * 1000003) ^ this.f19598e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f19594a + ", transportName=" + this.f19595b + ", event=" + this.f19596c + ", transformer=" + this.f19597d + ", encoding=" + this.f19598e + "}";
    }

    public c(o oVar, String str, zf.c<?> cVar, zf.e<?, byte[]> eVar, zf.b bVar) {
        this.f19594a = oVar;
        this.f19595b = str;
        this.f19596c = cVar;
        this.f19597d = eVar;
        this.f19598e = bVar;
    }
}
