package ce;

import ud.m4;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public m4 f19469a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19470b;

    public q(m4 m4Var, boolean z10) {
        jo.p.h(m4Var, "data");
        this.f19469a = m4Var;
        this.f19470b = z10;
    }

    public final m4 a() {
        return this.f19469a;
    }

    public final boolean b() {
        return this.f19470b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return jo.p.c(this.f19469a, qVar.f19469a) && this.f19470b == qVar.f19470b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f19469a.hashCode() * 31;
        boolean z10 = this.f19470b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "EventCollabReject(data=" + this.f19469a + ", neverAsk=" + this.f19470b + ')';
    }
}
