package co;

import jo.f0;
import jo.p;

/* loaded from: classes4.dex */
public abstract class l extends d implements jo.k<Object> {
    private final int arity;

    public l(int i10, ao.d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // jo.k
    public int getArity() {
        return this.arity;
    }

    @Override // co.a
    public String toString() {
        if (getCompletion() == null) {
            String g10 = f0.g(this);
            p.g(g10, "renderLambdaToString(this)");
            return g10;
        }
        return super.toString();
    }

    public l(int i10) {
        this(i10, null);
    }
}
