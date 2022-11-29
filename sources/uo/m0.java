package uo;

import java.util.List;
import java.util.ServiceLoader;
import wn.l;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<l0> f56061a = ro.n.v(ro.l.c(ServiceLoader.load(l0.class, l0.class.getClassLoader()).iterator()));

    public static final void a(ao.g gVar, Throwable th2) {
        for (l0 l0Var : f56061a) {
            try {
                l0Var.handleException(gVar, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, n0.b(th2, th3));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            l.a aVar = wn.l.f59224w;
            wn.a.a(th2, new c1(gVar));
            wn.l.a(wn.v.f59242a);
        } catch (Throwable th4) {
            l.a aVar2 = wn.l.f59224w;
            wn.l.a(wn.m.a(th4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
