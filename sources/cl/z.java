package cl;

import cl.c0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class z extends c0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f20004a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20005b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20006c;

    public z(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f20004a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f20005b = str2;
        this.f20006c = z10;
    }

    @Override // cl.c0.c
    public boolean b() {
        return this.f20006c;
    }

    @Override // cl.c0.c
    public String c() {
        return this.f20005b;
    }

    @Override // cl.c0.c
    public String d() {
        return this.f20004a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.c) {
            c0.c cVar = (c0.c) obj;
            return this.f20004a.equals(cVar.d()) && this.f20005b.equals(cVar.c()) && this.f20006c == cVar.b();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f20004a.hashCode() ^ 1000003) * 1000003) ^ this.f20005b.hashCode()) * 1000003) ^ (this.f20006c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f20004a + ", osCodeName=" + this.f20005b + ", isRooted=" + this.f20006c + "}";
    }
}
