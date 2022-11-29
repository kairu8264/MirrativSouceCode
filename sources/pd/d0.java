package pd;

/* loaded from: classes2.dex */
public final class d0 extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final jf.x f46709a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(jf.x xVar) {
        super(null);
        jo.p.h(xVar, "rankingType");
        this.f46709a = xVar;
    }

    public jf.x a() {
        return this.f46709a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && a() == ((d0) obj).a();
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "Reload(rankingType=" + a() + ')';
    }
}
