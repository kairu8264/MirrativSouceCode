package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class ef extends j {

    /* renamed from: y  reason: collision with root package name */
    public final Cif f35748y;

    public ef(Cif cif) {
        super("internal.registerCallback");
        this.f35748y = cif;
    }

    @Override // hi.j
    public final q a(u4 u4Var, List<q> list) {
        v5.h(this.f35817w, 3, list);
        String h10 = u4Var.b(list.get(0)).h();
        q b10 = u4Var.b(list.get(1));
        if (b10 instanceof p) {
            q b11 = u4Var.b(list.get(2));
            if (b11 instanceof n) {
                n nVar = (n) b11;
                if (nVar.g("type")) {
                    this.f35748y.a(h10, nVar.g("priority") ? v5.b(nVar.s("priority").e().doubleValue()) : 1000, (p) b10, nVar.s("type").h());
                    return q.f35921f;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
