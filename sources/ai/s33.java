package ai;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class s33<V, C> extends i33<V, C> {
    public List<r33<V>> L;

    public s33(uz2<? extends s43<? extends V>> uz2Var, boolean z10) {
        super(uz2Var, true, true);
        List<r33<V>> a10;
        if (uz2Var.isEmpty()) {
            a10 = Collections.emptyList();
        } else {
            a10 = r03.a(uz2Var.size());
        }
        for (int i10 = 0; i10 < uz2Var.size(); i10++) {
            a10.add(null);
        }
        this.L = a10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.i33
    public final void M() {
        List<r33<V>> list = this.L;
        if (list != null) {
            u(X(list));
        }
    }

    @Override // ai.i33
    public final void N(int i10) {
        super.N(i10);
        this.L = null;
    }

    @Override // ai.i33
    public final void W(int i10, V v10) {
        List<r33<V>> list = this.L;
        if (list != null) {
            list.set(i10, new r33<>(v10));
        }
    }

    public abstract C X(List<r33<V>> list);
}
