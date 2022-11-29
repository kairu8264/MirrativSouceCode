package al;

import java.io.File;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b extends o {

    /* renamed from: a  reason: collision with root package name */
    public final cl.a0 f13746a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13747b;

    /* renamed from: c  reason: collision with root package name */
    public final File f13748c;

    public b(cl.a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.f13746a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f13747b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f13748c = file;
    }

    @Override // al.o
    public cl.a0 b() {
        return this.f13746a;
    }

    @Override // al.o
    public File c() {
        return this.f13748c;
    }

    @Override // al.o
    public String d() {
        return this.f13747b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f13746a.equals(oVar.b()) && this.f13747b.equals(oVar.d()) && this.f13748c.equals(oVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13746a.hashCode() ^ 1000003) * 1000003) ^ this.f13747b.hashCode()) * 1000003) ^ this.f13748c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f13746a + ", sessionId=" + this.f13747b + ", reportFile=" + this.f13748c + "}";
    }
}
