package co;

import ao.g;
import jo.p;

/* loaded from: classes4.dex */
public abstract class d extends a {
    private final ao.g _context;
    private transient ao.d<Object> intercepted;

    public d(ao.d<Object> dVar, ao.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // ao.d
    public ao.g getContext() {
        ao.g gVar = this._context;
        p.e(gVar);
        return gVar;
    }

    public final ao.d<Object> intercepted() {
        ao.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            ao.e eVar = (ao.e) getContext().get(ao.e.f16648d);
            if (eVar == null || (dVar = eVar.U(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // co.a
    public void releaseIntercepted() {
        ao.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(ao.e.f16648d);
            p.e(bVar);
            ((ao.e) bVar).v(dVar);
        }
        this.intercepted = c.f20012w;
    }

    public d(ao.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
