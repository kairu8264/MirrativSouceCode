package ud;

import ud.p;

/* loaded from: classes2.dex */
public final class r implements p {

    /* renamed from: w  reason: collision with root package name */
    public final p.a f55435w;

    public r() {
        this(null, 1, null);
    }

    public r(p.a aVar) {
        jo.p.h(aVar, "type");
        this.f55435w = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && getType() == ((r) obj).getType();
    }

    @Override // ud.p
    public p.a getType() {
        return this.f55435w;
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return "ClosetPartsSpaceBindModel(type=" + getType() + ')';
    }

    public /* synthetic */ r(p.a aVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? p.a.SPACE : aVar);
    }
}
