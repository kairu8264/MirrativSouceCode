package ce;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public int f19468a;

    public o(int i10) {
        this.f19468a = i10;
    }

    public final int a() {
        return this.f19468a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f19468a == ((o) obj).f19468a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f19468a);
    }

    public String toString() {
        return "EventCollabChangeMaxUser(maxColalbUserNum=" + this.f19468a + ')';
    }
}
