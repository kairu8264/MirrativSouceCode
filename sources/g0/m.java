package g0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final f0.j f32247a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32248b;

    public m(f0.j jVar, long j10) {
        this.f32247a = jVar;
        this.f32248b = j10;
    }

    public /* synthetic */ m(f0.j jVar, long j10, jo.h hVar) {
        this(jVar, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f32247a == mVar.f32247a && b1.f.j(this.f32248b, mVar.f32248b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f32247a.hashCode() * 31) + b1.f.o(this.f32248b);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f32247a + ", position=" + ((Object) b1.f.t(this.f32248b)) + ')';
    }
}
