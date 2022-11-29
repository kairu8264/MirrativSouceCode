package zo;

import ai.r23;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public class w<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63343a = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public w(boolean z10) {
        this._cur = new x(8, z10);
    }

    public final boolean a(E e10) {
        while (true) {
            x xVar = (x) this._cur;
            int a10 = xVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                r23.a(f63343a, this, xVar, xVar.i());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            x xVar = (x) this._cur;
            if (xVar.d()) {
                return;
            }
            r23.a(f63343a, this, xVar, xVar.i());
        }
    }

    public final int c() {
        return ((x) this._cur).f();
    }

    public final E d() {
        while (true) {
            x xVar = (x) this._cur;
            E e10 = (E) xVar.j();
            if (e10 != x.f63347h) {
                return e10;
            }
            r23.a(f63343a, this, xVar, xVar.i());
        }
    }
}
