package y1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final k f61096a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61097b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61098c;

    public j(k kVar, int i10, int i11) {
        jo.p.h(kVar, "intrinsics");
        this.f61096a = kVar;
        this.f61097b = i10;
        this.f61098c = i11;
    }

    public final int a() {
        return this.f61098c;
    }

    public final k b() {
        return this.f61096a;
    }

    public final int c() {
        return this.f61097b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return jo.p.c(this.f61096a, jVar.f61096a) && this.f61097b == jVar.f61097b && this.f61098c == jVar.f61098c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f61096a.hashCode() * 31) + Integer.hashCode(this.f61097b)) * 31) + Integer.hashCode(this.f61098c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f61096a + ", startIndex=" + this.f61097b + ", endIndex=" + this.f61098c + ')';
    }
}
