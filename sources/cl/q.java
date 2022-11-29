package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class q extends a0.e.d.a.b.AbstractC0167e {

    /* renamed from: a  reason: collision with root package name */
    public final String f19946a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19947b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> f19948c;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0167e.AbstractC0168a {

        /* renamed from: a  reason: collision with root package name */
        public String f19949a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f19950b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> f19951c;

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0168a
        public a0.e.d.a.b.AbstractC0167e a() {
            String str = "";
            if (this.f19949a == null) {
                str = " name";
            }
            if (this.f19950b == null) {
                str = str + " importance";
            }
            if (this.f19951c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new q(this.f19949a, this.f19950b.intValue(), this.f19951c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0168a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0168a b(b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.f19951c = b0Var;
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0168a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0168a c(int i10) {
            this.f19950b = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0168a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0168a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f19949a = str;
            return this;
        }
    }

    @Override // cl.a0.e.d.a.b.AbstractC0167e
    public b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> b() {
        return this.f19948c;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0167e
    public int c() {
        return this.f19947b;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0167e
    public String d() {
        return this.f19946a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0167e) {
            a0.e.d.a.b.AbstractC0167e abstractC0167e = (a0.e.d.a.b.AbstractC0167e) obj;
            return this.f19946a.equals(abstractC0167e.d()) && this.f19947b == abstractC0167e.c() && this.f19948c.equals(abstractC0167e.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f19946a.hashCode() ^ 1000003) * 1000003) ^ this.f19947b) * 1000003) ^ this.f19948c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f19946a + ", importance=" + this.f19947b + ", frames=" + this.f19948c + "}";
    }

    public q(String str, int i10, b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> b0Var) {
        this.f19946a = str;
        this.f19947b = i10;
        this.f19948c = b0Var;
    }
}
