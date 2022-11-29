package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class u extends a0.e.AbstractC0172e {

    /* renamed from: a  reason: collision with root package name */
    public final int f19976a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19977b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19978c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19979d;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.AbstractC0172e.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f19980a;

        /* renamed from: b  reason: collision with root package name */
        public String f19981b;

        /* renamed from: c  reason: collision with root package name */
        public String f19982c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f19983d;

        @Override // cl.a0.e.AbstractC0172e.a
        public a0.e.AbstractC0172e a() {
            String str = "";
            if (this.f19980a == null) {
                str = " platform";
            }
            if (this.f19981b == null) {
                str = str + " version";
            }
            if (this.f19982c == null) {
                str = str + " buildVersion";
            }
            if (this.f19983d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new u(this.f19980a.intValue(), this.f19981b, this.f19982c, this.f19983d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.AbstractC0172e.a
        public a0.e.AbstractC0172e.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f19982c = str;
            return this;
        }

        @Override // cl.a0.e.AbstractC0172e.a
        public a0.e.AbstractC0172e.a c(boolean z10) {
            this.f19983d = Boolean.valueOf(z10);
            return this;
        }

        @Override // cl.a0.e.AbstractC0172e.a
        public a0.e.AbstractC0172e.a d(int i10) {
            this.f19980a = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.AbstractC0172e.a
        public a0.e.AbstractC0172e.a e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f19981b = str;
            return this;
        }
    }

    @Override // cl.a0.e.AbstractC0172e
    public String b() {
        return this.f19978c;
    }

    @Override // cl.a0.e.AbstractC0172e
    public int c() {
        return this.f19976a;
    }

    @Override // cl.a0.e.AbstractC0172e
    public String d() {
        return this.f19977b;
    }

    @Override // cl.a0.e.AbstractC0172e
    public boolean e() {
        return this.f19979d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.AbstractC0172e) {
            a0.e.AbstractC0172e abstractC0172e = (a0.e.AbstractC0172e) obj;
            return this.f19976a == abstractC0172e.c() && this.f19977b.equals(abstractC0172e.d()) && this.f19978c.equals(abstractC0172e.b()) && this.f19979d == abstractC0172e.e();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f19976a ^ 1000003) * 1000003) ^ this.f19977b.hashCode()) * 1000003) ^ this.f19978c.hashCode()) * 1000003) ^ (this.f19979d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f19976a + ", version=" + this.f19977b + ", buildVersion=" + this.f19978c + ", jailbroken=" + this.f19979d + "}";
    }

    public u(int i10, String str, String str2, boolean z10) {
        this.f19976a = i10;
        this.f19977b = str;
        this.f19978c = str2;
        this.f19979d = z10;
    }
}
