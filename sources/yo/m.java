package yo;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes4.dex */
public final class m {
    public static final void a(AbortFlowException abortFlowException, xo.d<?> dVar) {
        if (abortFlowException.a() != dVar) {
            throw abortFlowException;
        }
    }
}
