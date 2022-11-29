package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class cf extends j {

    /* renamed from: y  reason: collision with root package name */
    public final af f35716y;

    public cf(af afVar) {
        super("internal.logger");
        this.f35716y = afVar;
        this.f35818x.put("log", new bf(this, false, true));
        this.f35818x.put("silent", new wd(this, "silent"));
        ((j) this.f35818x.get("silent")).k("log", new bf(this, true, true));
        this.f35818x.put("unmonitored", new xe(this, "unmonitored"));
        ((j) this.f35818x.get("unmonitored")).k("log", new bf(this, false, false));
    }

    @Override // hi.j
    public final q a(u4 u4Var, List<q> list) {
        return q.f35921f;
    }
}
