package uo;

import java.util.concurrent.locks.LockSupport;
import uo.n1;

/* loaded from: classes4.dex */
public abstract class o1 extends m1 {
    public abstract Thread E0();

    public void F0(long j10, n1.c cVar) {
        w0.C.m1(j10, cVar);
    }

    public final void L0() {
        Thread E0 = E0();
        if (Thread.currentThread() != E0) {
            c.a();
            LockSupport.unpark(E0);
        }
    }
}
