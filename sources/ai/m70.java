package ai;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m70 implements b60, l70 {

    /* renamed from: w  reason: collision with root package name */
    public final l70 f6822w;

    /* renamed from: x  reason: collision with root package name */
    public final HashSet<AbstractMap.SimpleEntry<String, r30<? super l70>>> f6823x = new HashSet<>();

    public m70(l70 l70Var) {
        this.f6822w = l70Var;
    }

    @Override // ai.b60, ai.n60
    public final void B(String str, String str2) {
        a60.b(this, str, str2);
    }

    public final void b() {
        Iterator<AbstractMap.SimpleEntry<String, r30<? super l70>>> it = this.f6823x.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, r30<? super l70>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            yg.p1.k(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f6822w.z0(next.getKey(), next.getValue());
        }
        this.f6823x.clear();
    }

    @Override // ai.b60, ai.z50
    public final void c(String str, JSONObject jSONObject) {
        a60.c(this, str, jSONObject);
    }

    @Override // ai.z50
    public final void j0(String str, Map map) {
        a60.d(this, str, map);
    }

    @Override // ai.n60
    public final void l0(String str, JSONObject jSONObject) {
        a60.a(this, str, jSONObject);
    }

    @Override // ai.b60, ai.n60
    public final void v(String str) {
        this.f6822w.v(str);
    }

    @Override // ai.l70
    public final void x0(String str, r30<? super l70> r30Var) {
        this.f6822w.x0(str, r30Var);
        this.f6823x.add(new AbstractMap.SimpleEntry<>(str, r30Var));
    }

    @Override // ai.l70
    public final void z0(String str, r30<? super l70> r30Var) {
        this.f6822w.z0(str, r30Var);
        this.f6823x.remove(new AbstractMap.SimpleEntry(str, r30Var));
    }
}
