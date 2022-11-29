package ce;

import ud.m4;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public m4 f19471a;

    public r(m4 m4Var) {
        jo.p.h(m4Var, "data");
        this.f19471a = m4Var;
    }

    public final m4 a() {
        return this.f19471a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && jo.p.c(this.f19471a, ((r) obj).f19471a);
    }

    public int hashCode() {
        return this.f19471a.hashCode();
    }

    public String toString() {
        return "EventCollabRejectOpenDialog(data=" + this.f19471a + ')';
    }
}
