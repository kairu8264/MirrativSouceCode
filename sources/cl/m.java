package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class m extends a0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0167e> f19912a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.e.d.a.b.c f19913b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.a f19914c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.a.b.AbstractC0165d f19915d;

    /* renamed from: e  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0161a> f19916e;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0163b {

        /* renamed from: a  reason: collision with root package name */
        public b0<a0.e.d.a.b.AbstractC0167e> f19917a;

        /* renamed from: b  reason: collision with root package name */
        public a0.e.d.a.b.c f19918b;

        /* renamed from: c  reason: collision with root package name */
        public a0.a f19919c;

        /* renamed from: d  reason: collision with root package name */
        public a0.e.d.a.b.AbstractC0165d f19920d;

        /* renamed from: e  reason: collision with root package name */
        public b0<a0.e.d.a.b.AbstractC0161a> f19921e;

        @Override // cl.a0.e.d.a.b.AbstractC0163b
        public a0.e.d.a.b a() {
            String str = "";
            if (this.f19920d == null) {
                str = " signal";
            }
            if (this.f19921e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new m(this.f19917a, this.f19918b, this.f19919c, this.f19920d, this.f19921e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.a.b.AbstractC0163b
        public a0.e.d.a.b.AbstractC0163b b(a0.a aVar) {
            this.f19919c = aVar;
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0163b
        public a0.e.d.a.b.AbstractC0163b c(b0<a0.e.d.a.b.AbstractC0161a> b0Var) {
            Objects.requireNonNull(b0Var, "Null binaries");
            this.f19921e = b0Var;
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0163b
        public a0.e.d.a.b.AbstractC0163b d(a0.e.d.a.b.c cVar) {
            this.f19918b = cVar;
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0163b
        public a0.e.d.a.b.AbstractC0163b e(a0.e.d.a.b.AbstractC0165d abstractC0165d) {
            Objects.requireNonNull(abstractC0165d, "Null signal");
            this.f19920d = abstractC0165d;
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0163b
        public a0.e.d.a.b.AbstractC0163b f(b0<a0.e.d.a.b.AbstractC0167e> b0Var) {
            this.f19917a = b0Var;
            return this;
        }
    }

    @Override // cl.a0.e.d.a.b
    public a0.a b() {
        return this.f19914c;
    }

    @Override // cl.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0161a> c() {
        return this.f19916e;
    }

    @Override // cl.a0.e.d.a.b
    public a0.e.d.a.b.c d() {
        return this.f19913b;
    }

    @Override // cl.a0.e.d.a.b
    public a0.e.d.a.b.AbstractC0165d e() {
        return this.f19915d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b) {
            a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
            b0<a0.e.d.a.b.AbstractC0167e> b0Var = this.f19912a;
            if (b0Var != null ? b0Var.equals(bVar.f()) : bVar.f() == null) {
                a0.e.d.a.b.c cVar = this.f19913b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    a0.a aVar = this.f19914c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f19915d.equals(bVar.e()) && this.f19916e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // cl.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0167e> f() {
        return this.f19912a;
    }

    public int hashCode() {
        b0<a0.e.d.a.b.AbstractC0167e> b0Var = this.f19912a;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.c cVar = this.f19913b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        a0.a aVar = this.f19914c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f19915d.hashCode()) * 1000003) ^ this.f19916e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f19912a + ", exception=" + this.f19913b + ", appExitInfo=" + this.f19914c + ", signal=" + this.f19915d + ", binaries=" + this.f19916e + "}";
    }

    public m(b0<a0.e.d.a.b.AbstractC0167e> b0Var, a0.e.d.a.b.c cVar, a0.a aVar, a0.e.d.a.b.AbstractC0165d abstractC0165d, b0<a0.e.d.a.b.AbstractC0161a> b0Var2) {
        this.f19912a = b0Var;
        this.f19913b = cVar;
        this.f19914c = aVar;
        this.f19915d = abstractC0165d;
        this.f19916e = b0Var2;
    }
}
