package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, q0> f15623a = new HashMap<>();

    public final void a() {
        for (q0 q0Var : this.f15623a.values()) {
            q0Var.a();
        }
        this.f15623a.clear();
    }

    public final q0 b(String str) {
        return this.f15623a.get(str);
    }

    public Set<String> c() {
        return new HashSet(this.f15623a.keySet());
    }

    public final void d(String str, q0 q0Var) {
        q0 put = this.f15623a.put(str, q0Var);
        if (put != null) {
            put.d();
        }
    }
}
