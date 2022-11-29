package hi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class r implements q {

    /* renamed from: w  reason: collision with root package name */
    public final String f35968w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<q> f35969x;

    public r(String str, List<q> list) {
        this.f35968w = str;
        ArrayList<q> arrayList = new ArrayList<>();
        this.f35969x = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f35968w;
    }

    public final ArrayList<q> b() {
        return this.f35969x;
    }

    @Override // hi.q
    public final q d() {
        return this;
    }

    @Override // hi.q
    public final Double e() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            String str = this.f35968w;
            if (str == null ? rVar.f35968w == null : str.equals(rVar.f35968w)) {
                return this.f35969x.equals(rVar.f35969x);
            }
            return false;
        }
        return false;
    }

    @Override // hi.q
    public final Boolean f() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // hi.q
    public final String h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f35968w;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f35969x.hashCode();
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return null;
    }

    @Override // hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
