package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class d extends a0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f19825a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19826b;

    /* loaded from: classes4.dex */
    public static final class b extends a0.c.a {

        /* renamed from: a  reason: collision with root package name */
        public String f19827a;

        /* renamed from: b  reason: collision with root package name */
        public String f19828b;

        @Override // cl.a0.c.a
        public a0.c a() {
            String str = "";
            if (this.f19827a == null) {
                str = " key";
            }
            if (this.f19828b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new d(this.f19827a, this.f19828b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.c.a
        public a0.c.a b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f19827a = str;
            return this;
        }

        @Override // cl.a0.c.a
        public a0.c.a c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f19828b = str;
            return this;
        }
    }

    @Override // cl.a0.c
    public String b() {
        return this.f19825a;
    }

    @Override // cl.a0.c
    public String c() {
        return this.f19826b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.c) {
            a0.c cVar = (a0.c) obj;
            return this.f19825a.equals(cVar.b()) && this.f19826b.equals(cVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19825a.hashCode() ^ 1000003) * 1000003) ^ this.f19826b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f19825a + ", value=" + this.f19826b + "}";
    }

    public d(String str, String str2) {
        this.f19825a = str;
        this.f19826b = str2;
    }
}
