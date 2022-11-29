package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s extends q0 {
    public static final t0.b F = new a();
    public final boolean B;

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, Fragment> f15381y = new HashMap<>();

    /* renamed from: z  reason: collision with root package name */
    public final HashMap<String, s> f15382z = new HashMap<>();
    public final HashMap<String, u0> A = new HashMap<>();
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;

    /* loaded from: classes.dex */
    public class a implements t0.b {
        @Override // androidx.lifecycle.t0.b
        public <T extends q0> T a(Class<T> cls) {
            return new s(true);
        }
    }

    public s(boolean z10) {
        this.B = z10;
    }

    public static s l(u0 u0Var) {
        return (s) new t0(u0Var, F).a(s.class);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        if (FragmentManager.D0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.C = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f15381y.equals(sVar.f15381y) && this.f15382z.equals(sVar.f15382z) && this.A.equals(sVar.A);
    }

    public void f(Fragment fragment) {
        if (this.E) {
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f15381y.containsKey(fragment.B)) {
        } else {
            this.f15381y.put(fragment.B, fragment);
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void g(Fragment fragment) {
        if (FragmentManager.D0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.B);
    }

    public void h(String str) {
        if (FragmentManager.D0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f15381y.hashCode() * 31) + this.f15382z.hashCode()) * 31) + this.A.hashCode();
    }

    public final void i(String str) {
        s sVar = this.f15382z.get(str);
        if (sVar != null) {
            sVar.d();
            this.f15382z.remove(str);
        }
        u0 u0Var = this.A.get(str);
        if (u0Var != null) {
            u0Var.a();
            this.A.remove(str);
        }
    }

    public Fragment j(String str) {
        return this.f15381y.get(str);
    }

    public s k(Fragment fragment) {
        s sVar = this.f15382z.get(fragment.B);
        if (sVar == null) {
            s sVar2 = new s(this.B);
            this.f15382z.put(fragment.B, sVar2);
            return sVar2;
        }
        return sVar;
    }

    public Collection<Fragment> m() {
        return new ArrayList(this.f15381y.values());
    }

    public u0 n(Fragment fragment) {
        u0 u0Var = this.A.get(fragment.B);
        if (u0Var == null) {
            u0 u0Var2 = new u0();
            this.A.put(fragment.B, u0Var2);
            return u0Var2;
        }
        return u0Var;
    }

    public boolean o() {
        return this.C;
    }

    public void p(Fragment fragment) {
        if (this.E) {
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f15381y.remove(fragment.B) != null) && FragmentManager.D0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public void q(boolean z10) {
        this.E = z10;
    }

    public boolean r(Fragment fragment) {
        if (this.f15381y.containsKey(fragment.B)) {
            if (this.B) {
                return this.C;
            }
            return !this.D;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f15381y.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f15382z.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.A.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
