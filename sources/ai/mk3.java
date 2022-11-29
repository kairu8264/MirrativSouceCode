package ai;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class mk3 implements Iterator<jh3> {

    /* renamed from: w  reason: collision with root package name */
    public final ArrayDeque<nk3> f6965w;

    /* renamed from: x  reason: collision with root package name */
    public jh3 f6966x;

    public /* synthetic */ mk3(oh3 oh3Var, lk3 lk3Var) {
        oh3 oh3Var2;
        if (oh3Var instanceof nk3) {
            nk3 nk3Var = (nk3) oh3Var;
            ArrayDeque<nk3> arrayDeque = new ArrayDeque<>(nk3Var.t());
            this.f6965w = arrayDeque;
            arrayDeque.push(nk3Var);
            oh3Var2 = nk3Var.B;
            this.f6966x = b(oh3Var2);
            return;
        }
        this.f6965w = null;
        this.f6966x = (jh3) oh3Var;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final jh3 next() {
        jh3 jh3Var;
        oh3 oh3Var;
        jh3 jh3Var2 = this.f6966x;
        if (jh3Var2 != null) {
            do {
                ArrayDeque<nk3> arrayDeque = this.f6965w;
                jh3Var = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                oh3Var = this.f6965w.pop().C;
                jh3Var = b(oh3Var);
            } while (jh3Var.L());
            this.f6966x = jh3Var;
            return jh3Var2;
        }
        throw new NoSuchElementException();
    }

    public final jh3 b(oh3 oh3Var) {
        while (oh3Var instanceof nk3) {
            nk3 nk3Var = (nk3) oh3Var;
            this.f6965w.push(nk3Var);
            oh3Var = nk3Var.B;
        }
        return (jh3) oh3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6966x != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
