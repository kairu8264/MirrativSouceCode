package uo;

/* loaded from: classes4.dex */
public final class p2 extends zo.s implements x1 {
    public final String U(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        boolean z10 = true;
        for (zo.u uVar = (zo.u) D(); !jo.p.c(uVar, this); uVar = uVar.E()) {
            if (uVar instanceof j2) {
                j2 j2Var = (j2) uVar;
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(j2Var);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        jo.p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // uo.x1
    public p2 f() {
        return this;
    }

    @Override // uo.x1
    public boolean isActive() {
        return true;
    }

    @Override // zo.u
    public String toString() {
        return u0.c() ? U("Active") : super.toString();
    }
}
