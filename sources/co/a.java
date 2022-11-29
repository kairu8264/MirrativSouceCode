package co;

import java.io.Serializable;
import jo.p;
import wn.l;
import wn.m;
import wn.v;

/* loaded from: classes4.dex */
public abstract class a implements ao.d<Object>, e, Serializable {
    private final ao.d<Object> completion;

    public a(ao.d<Object> dVar) {
        this.completion = dVar;
    }

    public ao.d<v> create(ao.d<?> dVar) {
        p.h(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // co.e
    public e getCallerFrame() {
        ao.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final ao.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // co.e
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ao.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        ao.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            ao.d dVar2 = aVar.completion;
            p.e(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                l.a aVar2 = wn.l.f59224w;
                obj = wn.l.a(m.a(th2));
            }
            if (invokeSuspend == bo.c.c()) {
                return;
            }
            l.a aVar3 = wn.l.f59224w;
            obj = wn.l.a(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public ao.d<v> create(Object obj, ao.d<?> dVar) {
        p.h(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
