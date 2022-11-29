package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class l extends a0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.e.d.a.b f19902a;

    /* renamed from: b  reason: collision with root package name */
    public final b0<a0.c> f19903b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.c> f19904c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f19905d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19906e;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.a.AbstractC0160a {

        /* renamed from: a  reason: collision with root package name */
        public a0.e.d.a.b f19907a;

        /* renamed from: b  reason: collision with root package name */
        public b0<a0.c> f19908b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.c> f19909c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f19910d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f19911e;

        @Override // cl.a0.e.d.a.AbstractC0160a
        public a0.e.d.a a() {
            String str = "";
            if (this.f19907a == null) {
                str = " execution";
            }
            if (this.f19911e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new l(this.f19907a, this.f19908b, this.f19909c, this.f19910d, this.f19911e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.a.AbstractC0160a
        public a0.e.d.a.AbstractC0160a b(Boolean bool) {
            this.f19910d = bool;
            return this;
        }

        @Override // cl.a0.e.d.a.AbstractC0160a
        public a0.e.d.a.AbstractC0160a c(b0<a0.c> b0Var) {
            this.f19908b = b0Var;
            return this;
        }

        @Override // cl.a0.e.d.a.AbstractC0160a
        public a0.e.d.a.AbstractC0160a d(a0.e.d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f19907a = bVar;
            return this;
        }

        @Override // cl.a0.e.d.a.AbstractC0160a
        public a0.e.d.a.AbstractC0160a e(b0<a0.c> b0Var) {
            this.f19909c = b0Var;
            return this;
        }

        @Override // cl.a0.e.d.a.AbstractC0160a
        public a0.e.d.a.AbstractC0160a f(int i10) {
            this.f19911e = Integer.valueOf(i10);
            return this;
        }

        public b() {
        }

        public b(a0.e.d.a aVar) {
            this.f19907a = aVar.d();
            this.f19908b = aVar.c();
            this.f19909c = aVar.e();
            this.f19910d = aVar.b();
            this.f19911e = Integer.valueOf(aVar.f());
        }
    }

    @Override // cl.a0.e.d.a
    public Boolean b() {
        return this.f19905d;
    }

    @Override // cl.a0.e.d.a
    public b0<a0.c> c() {
        return this.f19903b;
    }

    @Override // cl.a0.e.d.a
    public a0.e.d.a.b d() {
        return this.f19902a;
    }

    @Override // cl.a0.e.d.a
    public b0<a0.c> e() {
        return this.f19904c;
    }

    public boolean equals(Object obj) {
        b0<a0.c> b0Var;
        b0<a0.c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a) {
            a0.e.d.a aVar = (a0.e.d.a) obj;
            return this.f19902a.equals(aVar.d()) && ((b0Var = this.f19903b) != null ? b0Var.equals(aVar.c()) : aVar.c() == null) && ((b0Var2 = this.f19904c) != null ? b0Var2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f19905d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f19906e == aVar.f();
        }
        return false;
    }

    @Override // cl.a0.e.d.a
    public int f() {
        return this.f19906e;
    }

    @Override // cl.a0.e.d.a
    public a0.e.d.a.AbstractC0160a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.f19902a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.f19903b;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f19904c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f19905d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f19906e;
    }

    public String toString() {
        return "Application{execution=" + this.f19902a + ", customAttributes=" + this.f19903b + ", internalKeys=" + this.f19904c + ", background=" + this.f19905d + ", uiOrientation=" + this.f19906e + "}";
    }

    public l(a0.e.d.a.b bVar, b0<a0.c> b0Var, b0<a0.c> b0Var2, Boolean bool, int i10) {
        this.f19902a = bVar;
        this.f19903b = b0Var;
        this.f19904c = b0Var2;
        this.f19905d = bool;
        this.f19906e = i10;
    }
}
