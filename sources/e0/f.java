package e0;

import b1.h;
import b1.k;
import b1.m;
import c1.q0;
import jo.p;
import m2.q;

/* loaded from: classes.dex */
public final class f extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
        p.h(bVar, "topStart");
        p.h(bVar2, "topEnd");
        p.h(bVar3, "bottomEnd");
        p.h(bVar4, "bottomStart");
    }

    @Override // e0.a
    public q0 d(long j10, float f10, float f11, float f12, float f13, q qVar) {
        p.h(qVar, "layoutDirection");
        if (((f10 + f11) + f12) + f13 == 0.0f) {
            return new q0.b(m.c(j10));
        }
        h c10 = m.c(j10);
        q qVar2 = q.Ltr;
        return new q0.c(k.b(c10, b1.b.b(qVar == qVar2 ? f10 : f11, 0.0f, 2, null), b1.b.b(qVar == qVar2 ? f11 : f10, 0.0f, 2, null), b1.b.b(qVar == qVar2 ? f12 : f13, 0.0f, 2, null), b1.b.b(qVar == qVar2 ? f13 : f12, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return p.c(h(), fVar.h()) && p.c(g(), fVar.g()) && p.c(e(), fVar.e()) && p.c(f(), fVar.f());
        }
        return false;
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // e0.a
    /* renamed from: i */
    public f c(b bVar, b bVar2, b bVar3, b bVar4) {
        p.h(bVar, "topStart");
        p.h(bVar2, "topEnd");
        p.h(bVar3, "bottomEnd");
        p.h(bVar4, "bottomStart");
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + h() + ", topEnd = " + g() + ", bottomEnd = " + e() + ", bottomStart = " + f() + ')';
    }
}
