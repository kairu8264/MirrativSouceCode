package um;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f55979a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55980b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f55979a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f55980b = str2;
    }

    @Override // um.f
    public String b() {
        return this.f55979a;
    }

    @Override // um.f
    public String c() {
        return this.f55980b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f55979a.equals(fVar.b()) && this.f55980b.equals(fVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f55979a.hashCode() ^ 1000003) * 1000003) ^ this.f55980b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f55979a + ", version=" + this.f55980b + "}";
    }
}
