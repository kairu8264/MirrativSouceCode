package ce;

import com.dena.mirrorman.net.api.response.CollabType;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f19466a;

    /* renamed from: b  reason: collision with root package name */
    public final CollabType f19467b;

    public m(String str, CollabType collabType) {
        jo.p.h(str, "userId");
        jo.p.h(collabType, "collabType");
        this.f19466a = str;
        this.f19467b = collabType;
    }

    public final CollabType a() {
        return this.f19467b;
    }

    public final String b() {
        return this.f19466a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return jo.p.c(this.f19466a, mVar.f19466a) && this.f19467b == mVar.f19467b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f19466a.hashCode() * 31) + this.f19467b.hashCode();
    }

    public String toString() {
        return "EventCollabAccept(userId=" + this.f19466a + ", collabType=" + this.f19467b + ')';
    }
}
