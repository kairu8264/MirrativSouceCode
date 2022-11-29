package hi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ff extends j {

    /* renamed from: y  reason: collision with root package name */
    public final x7 f35776y;

    /* renamed from: z  reason: collision with root package name */
    public final Map<String, j> f35777z;

    public ff(x7 x7Var) {
        super("require");
        this.f35777z = new HashMap();
        this.f35776y = x7Var;
    }

    @Override // hi.j
    public final q a(u4 u4Var, List<q> list) {
        j jVar;
        v5.h("require", 1, list);
        String h10 = u4Var.b(list.get(0)).h();
        if (this.f35777z.containsKey(h10)) {
            return this.f35777z.get(h10);
        }
        x7 x7Var = this.f35776y;
        if (x7Var.f36068a.containsKey(h10)) {
            try {
                jVar = x7Var.f36068a.get(h10).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(h10);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            jVar = q.f35921f;
        }
        if (jVar instanceof j) {
            this.f35777z.put(h10, (j) jVar);
        }
        return jVar;
    }
}
