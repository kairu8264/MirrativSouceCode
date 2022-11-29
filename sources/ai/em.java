package ai;

/* loaded from: classes3.dex */
public final class em {

    /* renamed from: a  reason: collision with root package name */
    public final long f3723a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3724b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3725c;

    public em(long j10, String str, int i10) {
        this.f3723a = j10;
        this.f3724b = str;
        this.f3725c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof em)) {
            em emVar = (em) obj;
            if (emVar.f3723a == this.f3723a && emVar.f3725c == this.f3725c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f3723a;
    }
}
