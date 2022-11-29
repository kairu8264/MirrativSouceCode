package g0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final a f32237a;

    /* renamed from: b  reason: collision with root package name */
    public final a f32238b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f32239c;

    /* loaded from: classes.dex */
    public static final class a {
    }

    public final a a() {
        return this.f32238b;
    }

    public final boolean b() {
        return this.f32239c;
    }

    public final a c() {
        return this.f32237a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return jo.p.c(this.f32237a, jVar.f32237a) && jo.p.c(this.f32238b, jVar.f32238b) && this.f32239c == jVar.f32239c;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Selection(start=" + this.f32237a + ", end=" + this.f32238b + ", handlesCrossed=" + this.f32239c + ')';
    }
}
