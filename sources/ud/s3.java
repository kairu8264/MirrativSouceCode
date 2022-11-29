package ud;

import ud.r3;

/* loaded from: classes2.dex */
public final class s3 implements r3 {

    /* renamed from: b  reason: collision with root package name */
    public final r3.b f55488b;

    public s3() {
        this(null, 1, null);
    }

    public s3(r3.b bVar) {
        jo.p.h(bVar, "type");
        this.f55488b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3) && getType() == ((s3) obj).getType();
    }

    @Override // ud.r3
    public r3.b getType() {
        return this.f55488b;
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return "ShooterPartsCategoryDividerBindModel(type=" + getType() + ')';
    }

    public /* synthetic */ s3(r3.b bVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? r3.b.DIVIDER : bVar);
    }
}
