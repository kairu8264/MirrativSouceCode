package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class e extends a0.d {

    /* renamed from: a  reason: collision with root package name */
    public final b0<a0.d.b> f19829a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19830b;

    /* loaded from: classes4.dex */
    public static final class b extends a0.d.a {

        /* renamed from: a  reason: collision with root package name */
        public b0<a0.d.b> f19831a;

        /* renamed from: b  reason: collision with root package name */
        public String f19832b;

        @Override // cl.a0.d.a
        public a0.d a() {
            String str = "";
            if (this.f19831a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new e(this.f19831a, this.f19832b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.d.a
        public a0.d.a b(b0<a0.d.b> b0Var) {
            Objects.requireNonNull(b0Var, "Null files");
            this.f19831a = b0Var;
            return this;
        }

        @Override // cl.a0.d.a
        public a0.d.a c(String str) {
            this.f19832b = str;
            return this;
        }
    }

    @Override // cl.a0.d
    public b0<a0.d.b> b() {
        return this.f19829a;
    }

    @Override // cl.a0.d
    public String c() {
        return this.f19830b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d) {
            a0.d dVar = (a0.d) obj;
            if (this.f19829a.equals(dVar.b())) {
                String str = this.f19830b;
                if (str == null) {
                    if (dVar.c() == null) {
                        return true;
                    }
                } else if (str.equals(dVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f19829a.hashCode() ^ 1000003) * 1000003;
        String str = this.f19830b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f19829a + ", orgId=" + this.f19830b + "}";
    }

    public e(b0<a0.d.b> b0Var, String str) {
        this.f19829a = b0Var;
        this.f19830b = str;
    }
}
