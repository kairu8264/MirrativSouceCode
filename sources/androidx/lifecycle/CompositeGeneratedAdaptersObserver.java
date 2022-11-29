package androidx.lifecycle;

import androidx.lifecycle.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements r {

    /* renamed from: w  reason: collision with root package name */
    public final n[] f15437w;

    public CompositeGeneratedAdaptersObserver(n[] nVarArr) {
        this.f15437w = nVarArr;
    }

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        d0 d0Var = new d0();
        for (n nVar : this.f15437w) {
            nVar.a(uVar, bVar, false, d0Var);
        }
        for (n nVar2 : this.f15437w) {
            nVar2.a(uVar, bVar, true, d0Var);
        }
    }
}
