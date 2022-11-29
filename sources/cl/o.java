package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class o extends a0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f19930a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19931b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> f19932c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.a.b.c f19933d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19934e;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.a.b.c.AbstractC0164a {

        /* renamed from: a  reason: collision with root package name */
        public String f19935a;

        /* renamed from: b  reason: collision with root package name */
        public String f19936b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> f19937c;

        /* renamed from: d  reason: collision with root package name */
        public a0.e.d.a.b.c f19938d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f19939e;

        @Override // cl.a0.e.d.a.b.c.AbstractC0164a
        public a0.e.d.a.b.c a() {
            String str = "";
            if (this.f19935a == null) {
                str = " type";
            }
            if (this.f19937c == null) {
                str = str + " frames";
            }
            if (this.f19939e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new o(this.f19935a, this.f19936b, this.f19937c, this.f19938d, this.f19939e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.a.b.c.AbstractC0164a
        public a0.e.d.a.b.c.AbstractC0164a b(a0.e.d.a.b.c cVar) {
            this.f19938d = cVar;
            return this;
        }

        @Override // cl.a0.e.d.a.b.c.AbstractC0164a
        public a0.e.d.a.b.c.AbstractC0164a c(b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.f19937c = b0Var;
            return this;
        }

        @Override // cl.a0.e.d.a.b.c.AbstractC0164a
        public a0.e.d.a.b.c.AbstractC0164a d(int i10) {
            this.f19939e = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.d.a.b.c.AbstractC0164a
        public a0.e.d.a.b.c.AbstractC0164a e(String str) {
            this.f19936b = str;
            return this;
        }

        @Override // cl.a0.e.d.a.b.c.AbstractC0164a
        public a0.e.d.a.b.c.AbstractC0164a f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f19935a = str;
            return this;
        }
    }

    @Override // cl.a0.e.d.a.b.c
    public a0.e.d.a.b.c b() {
        return this.f19933d;
    }

    @Override // cl.a0.e.d.a.b.c
    public b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> c() {
        return this.f19932c;
    }

    @Override // cl.a0.e.d.a.b.c
    public int d() {
        return this.f19934e;
    }

    @Override // cl.a0.e.d.a.b.c
    public String e() {
        return this.f19931b;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.c) {
            a0.e.d.a.b.c cVar2 = (a0.e.d.a.b.c) obj;
            return this.f19930a.equals(cVar2.f()) && ((str = this.f19931b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f19932c.equals(cVar2.c()) && ((cVar = this.f19933d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f19934e == cVar2.d();
        }
        return false;
    }

    @Override // cl.a0.e.d.a.b.c
    public String f() {
        return this.f19930a;
    }

    public int hashCode() {
        int hashCode = (this.f19930a.hashCode() ^ 1000003) * 1000003;
        String str = this.f19931b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f19932c.hashCode()) * 1000003;
        a0.e.d.a.b.c cVar = this.f19933d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f19934e;
    }

    public String toString() {
        return "Exception{type=" + this.f19930a + ", reason=" + this.f19931b + ", frames=" + this.f19932c + ", causedBy=" + this.f19933d + ", overflowCount=" + this.f19934e + "}";
    }

    public o(String str, String str2, b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> b0Var, a0.e.d.a.b.c cVar, int i10) {
        this.f19930a = str;
        this.f19931b = str2;
        this.f19932c = b0Var;
        this.f19933d = cVar;
        this.f19934e = i10;
    }
}
