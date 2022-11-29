package co;

import jo.f0;
import jo.p;

/* loaded from: classes4.dex */
public abstract class k extends j implements jo.k<Object> {

    /* renamed from: w  reason: collision with root package name */
    public final int f20019w;

    public k(int i10, ao.d<Object> dVar) {
        super(dVar);
        this.f20019w = i10;
    }

    @Override // jo.k
    public int getArity() {
        return this.f20019w;
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
}
