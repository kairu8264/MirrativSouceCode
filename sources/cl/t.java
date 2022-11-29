package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class t extends a0.e.d.AbstractC0171d {

    /* renamed from: a  reason: collision with root package name */
    public final String f19974a;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.AbstractC0171d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f19975a;

        @Override // cl.a0.e.d.AbstractC0171d.a
        public a0.e.d.AbstractC0171d a() {
            String str = "";
            if (this.f19975a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new t(this.f19975a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.AbstractC0171d.a
        public a0.e.d.AbstractC0171d.a b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f19975a = str;
            return this;
        }
    }

    @Override // cl.a0.e.d.AbstractC0171d
    public String b() {
        return this.f19974a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.AbstractC0171d) {
            return this.f19974a.equals(((a0.e.d.AbstractC0171d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f19974a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f19974a + "}";
    }

    public t(String str) {
        this.f19974a = str;
    }
}
