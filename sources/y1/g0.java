package y1;

/* loaded from: classes.dex */
public final class g0 extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f61088a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str) {
        super(null);
        jo.p.h(str, "verbatim");
        this.f61088a = str;
    }

    public final String a() {
        return this.f61088a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && jo.p.c(this.f61088a, ((g0) obj).f61088a);
    }

    public int hashCode() {
        return this.f61088a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f61088a + ')';
    }
}
