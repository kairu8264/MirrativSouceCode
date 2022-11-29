package t5;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f53164a;

    /* renamed from: b  reason: collision with root package name */
    public Long f53165b;

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f53164a.equals(dVar.f53164a)) {
                Long l10 = this.f53165b;
                Long l11 = dVar.f53165b;
                return l10 != null ? l10.equals(l11) : l11 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f53164a.hashCode() * 31;
        Long l10 = this.f53165b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f53164a = str;
        this.f53165b = Long.valueOf(j10);
    }
}
