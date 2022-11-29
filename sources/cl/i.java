package cl;

import cl.a0;

/* loaded from: classes4.dex */
public final class i extends a0.e.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f19873a;

    @Override // cl.a0.e.a.b
    public String a() {
        return this.f19873a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.a.b) {
            return this.f19873a.equals(((a0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f19873a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f19873a + "}";
    }
}
