package wo;

import java.util.ArrayList;
import kotlinx.coroutines.internal.UndeliveredElementException;
import wo.c;
import zo.k0;

/* loaded from: classes4.dex */
public class s<E> extends a<E> {
    public s(io.l<? super E, wn.v> lVar) {
        super(lVar);
    }

    @Override // wo.a
    public final boolean N() {
        return true;
    }

    @Override // wo.a
    public final boolean O() {
        return true;
    }

    @Override // wo.a
    public void S(Object obj, p<?> pVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                a0 a0Var = (a0) obj;
                if (a0Var instanceof c.a) {
                    io.l<E, wn.v> lVar = this.f59265w;
                    if (lVar != null) {
                        undeliveredElementException = zo.c0.c(lVar, ((c.a) a0Var).f59267z, null);
                    }
                } else {
                    a0Var.U(pVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i10 = size - 1;
                        a0 a0Var2 = (a0) arrayList.get(size);
                        if (a0Var2 instanceof c.a) {
                            io.l<E, wn.v> lVar2 = this.f59265w;
                            undeliveredElementException2 = lVar2 == null ? null : zo.c0.c(lVar2, ((c.a) a0Var2).f59267z, undeliveredElementException2);
                        } else {
                            a0Var2.U(pVar);
                        }
                        if (i10 < 0) {
                            break;
                        }
                        size = i10;
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    @Override // wo.c
    public final boolean v() {
        return false;
    }

    @Override // wo.c
    public final boolean w() {
        return false;
    }

    @Override // wo.c
    public Object z(E e10) {
        y<?> B;
        do {
            Object z10 = super.z(e10);
            k0 k0Var = b.f59259b;
            if (z10 == k0Var) {
                return k0Var;
            }
            if (z10 == b.f59260c) {
                B = B(e10);
                if (B == null) {
                    return k0Var;
                }
            } else if (z10 instanceof p) {
                return z10;
            } else {
                throw new IllegalStateException(jo.p.o("Invalid offerInternal result ", z10).toString());
            }
        } while (!(B instanceof p));
        return B;
    }
}
