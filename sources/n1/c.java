package n1;

import androidx.compose.ui.platform.g2;

/* loaded from: classes.dex */
public interface c extends m2.d {
    static /* synthetic */ Object y0(c cVar, o oVar, ao.d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                oVar = o.Main;
            }
            return cVar.t0(oVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    default <T> Object H(long j10, io.p<? super c, ? super ao.d<? super T>, ? extends Object> pVar, ao.d<? super T> dVar) {
        return pVar.invoke(this, dVar);
    }

    default long S() {
        return b1.l.f16742b.b();
    }

    long a();

    g2 getViewConfiguration();

    default <T> Object h0(long j10, io.p<? super c, ? super ao.d<? super T>, ? extends Object> pVar, ao.d<? super T> dVar) {
        return pVar.invoke(this, dVar);
    }

    m o0();

    Object t0(o oVar, ao.d<? super m> dVar);
}
