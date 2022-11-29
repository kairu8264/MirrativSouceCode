package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.x;

@x.b("navigation")
/* loaded from: classes.dex */
public class r extends x<q> {

    /* renamed from: a  reason: collision with root package name */
    public final y f15788a;

    public r(y yVar) {
        this.f15788a = yVar;
    }

    @Override // androidx.navigation.x
    public boolean e() {
        return true;
    }

    @Override // androidx.navigation.x
    /* renamed from: f */
    public q a() {
        return new q(this);
    }

    @Override // androidx.navigation.x
    /* renamed from: g */
    public o b(q qVar, Bundle bundle, u uVar, x.a aVar) {
        int M = qVar.M();
        if (M != 0) {
            o K = qVar.K(M, false);
            if (K != null) {
                return this.f15788a.e(K.s()).b(K, K.g(bundle), uVar, aVar);
            }
            String L = qVar.L();
            throw new IllegalArgumentException("navigation destination " + L + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException("no start destination defined via app:startDestination for " + qVar.m());
    }
}
