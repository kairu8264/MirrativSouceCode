package g0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final long f32327a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32328b;

    public z(long j10, long j11) {
        this.f32327a = j10;
        this.f32328b = j11;
    }

    public /* synthetic */ z(long j10, long j11, jo.h hVar) {
        this(j10, j11);
    }

    public final long a() {
        return this.f32328b;
    }

    public final long b() {
        return this.f32327a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return c1.c0.m(this.f32327a, zVar.f32327a) && c1.c0.m(this.f32328b, zVar.f32328b);
        }
        return false;
    }

    public int hashCode() {
        return (c1.c0.s(this.f32327a) * 31) + c1.c0.s(this.f32328b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) c1.c0.t(this.f32327a)) + ", selectionBackgroundColor=" + ((Object) c1.c0.t(this.f32328b)) + ')';
    }
}
