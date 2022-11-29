package ce;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f19323a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19324b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19325c;

    public i(String str, String str2, boolean z10) {
        jo.p.h(str, "appId");
        jo.p.h(str2, "appUserId");
        this.f19323a = str;
        this.f19324b = str2;
        this.f19325c = z10;
    }

    public final String a() {
        return this.f19323a;
    }

    public final String b() {
        return this.f19324b;
    }

    public final boolean c() {
        return this.f19325c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return jo.p.c(this.f19323a, iVar.f19323a) && jo.p.c(this.f19324b, iVar.f19324b) && this.f19325c == iVar.f19325c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f19323a.hashCode() * 31) + this.f19324b.hashCode()) * 31;
        boolean z10 = this.f19325c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ClickedRegisterIdButton(appId=" + this.f19323a + ", appUserId=" + this.f19324b + ", isConfirmed=" + this.f19325c + ')';
    }
}
