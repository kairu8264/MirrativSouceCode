package jo;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class q<R> implements k<R>, Serializable {
    private final int arity;

    public q(int i10) {
        this.arity = i10;
    }

    @Override // jo.k
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String h10 = f0.h(this);
        p.g(h10, "renderLambdaToString(this)");
        return h10;
    }
}
