package jf;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f37911a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37912b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f37913c;

    public d(String str, String str2, boolean z10) {
        jo.p.h(str, "avatarPartId");
        jo.p.h(str2, "iconUrl");
        this.f37911a = str;
        this.f37912b = str2;
        this.f37913c = z10;
    }

    public final String a() {
        return this.f37911a;
    }

    public final String b() {
        return this.f37912b;
    }

    public final boolean c() {
        return this.f37913c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return jo.p.c(this.f37911a, dVar.f37911a) && jo.p.c(this.f37912b, dVar.f37912b) && this.f37913c == dVar.f37913c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f37911a.hashCode() * 31) + this.f37912b.hashCode()) * 31;
        boolean z10 = this.f37913c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ClosetPartData(avatarPartId=" + this.f37911a + ", iconUrl=" + this.f37912b + ", isTrial=" + this.f37913c + ')';
    }
}
