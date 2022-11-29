package androidx.navigation;

import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public class l extends q0 {

    /* renamed from: z  reason: collision with root package name */
    public static final t0.b f15755z = new a();

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<UUID, u0> f15756y = new HashMap<>();

    /* loaded from: classes.dex */
    public class a implements t0.b {
        @Override // androidx.lifecycle.t0.b
        public <T extends q0> T a(Class<T> cls) {
            return new l();
        }
    }

    public static l g(u0 u0Var) {
        return (l) new t0(u0Var, f15755z).a(l.class);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        for (u0 u0Var : this.f15756y.values()) {
            u0Var.a();
        }
        this.f15756y.clear();
    }

    public void f(UUID uuid) {
        u0 remove = this.f15756y.remove(uuid);
        if (remove != null) {
            remove.a();
        }
    }

    public u0 h(UUID uuid) {
        u0 u0Var = this.f15756y.get(uuid);
        if (u0Var == null) {
            u0 u0Var2 = new u0();
            this.f15756y.put(uuid, u0Var2);
            return u0Var2;
        }
        return u0Var;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<UUID> it = this.f15756y.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
