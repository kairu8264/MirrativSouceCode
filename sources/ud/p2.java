package ud;

import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f55330a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55331b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55332c;

    public p2(boolean z10, String str, String str2) {
        jo.p.h(str, "title");
        jo.p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        this.f55330a = z10;
        this.f55331b = str;
        this.f55332c = str2;
    }

    public final String a() {
        return this.f55332c;
    }

    public final String b() {
        return this.f55331b;
    }

    public final boolean c() {
        return this.f55330a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p2) {
            p2 p2Var = (p2) obj;
            return this.f55330a == p2Var.f55330a && jo.p.c(this.f55331b, p2Var.f55331b) && jo.p.c(this.f55332c, p2Var.f55332c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.f55330a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((r02 * 31) + this.f55331b.hashCode()) * 31) + this.f55332c.hashCode();
    }

    public String toString() {
        return "PartTextTutorialBindModel(isVisible=" + this.f55330a + ", title=" + this.f55331b + ", description=" + this.f55332c + ')';
    }

    public /* synthetic */ p2(boolean z10, String str, String str2, int i10, jo.h hVar) {
        this(z10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
