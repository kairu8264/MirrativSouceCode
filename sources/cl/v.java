package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class v extends a0.e.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f19984a;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.f.a {

        /* renamed from: a  reason: collision with root package name */
        public String f19985a;

        @Override // cl.a0.e.f.a
        public a0.e.f a() {
            String str = "";
            if (this.f19985a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new v(this.f19985a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.f.a
        public a0.e.f.a b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f19985a = str;
            return this;
        }
    }

    @Override // cl.a0.e.f
    public String b() {
        return this.f19984a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.f19984a.equals(((a0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f19984a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f19984a + "}";
    }

    public v(String str) {
        this.f19984a = str;
    }
}
