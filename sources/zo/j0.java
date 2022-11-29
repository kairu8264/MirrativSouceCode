package zo;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import uo.u0;
import wn.l;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a */
    public static final String f63295a;

    /* renamed from: b */
    public static final String f63296b;

    static {
        Object a10;
        Object a11;
        try {
            l.a aVar = wn.l.f59224w;
            a10 = wn.l.a(Class.forName("co.a").getCanonicalName());
        } catch (Throwable th2) {
            l.a aVar2 = wn.l.f59224w;
            a10 = wn.l.a(wn.m.a(th2));
        }
        if (wn.l.b(a10) != null) {
            a10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f63295a = (String) a10;
        try {
            l.a aVar3 = wn.l.f59224w;
            a11 = wn.l.a(j0.class.getCanonicalName());
        } catch (Throwable th3) {
            l.a aVar4 = wn.l.f59224w;
            a11 = wn.l.a(wn.m.a(th3));
        }
        if (wn.l.b(a11) != null) {
            a11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f63296b = (String) a11;
    }

    public static final /* synthetic */ Throwable a(Throwable th2, co.e eVar) {
        return j(th2, eVar);
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement(jo.p.o("\b\b\b(", str), "\b", "\b", -1);
    }

    public static final <E extends Throwable> wn.k<E, StackTraceElement[]> c(E e10) {
        boolean z10;
        Throwable cause = e10.getCause();
        if (cause != null && jo.p.c(cause.getClass(), e10.getClass())) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            int length = stackTrace.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                if (h(stackTraceElement)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return wn.q.a(cause, stackTrace);
            }
            return wn.q.a(e10, new StackTraceElement[0]);
        }
        return wn.q.a(e10, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E d(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int g10 = g(stackTrace, f63295a);
        int i10 = 0;
        if (g10 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e11.setStackTrace((StackTraceElement[]) array);
            return e11;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + g10];
        for (int i11 = 0; i11 < g10; i11++) {
            stackTraceElementArr[i11] = stackTrace[i11];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i10 + g10] = it.next();
            i10++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    public static final ArrayDeque<StackTraceElement> e(co.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    public static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && jo.p.c(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && jo.p.c(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && jo.p.c(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    public static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (jo.p.c(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        return so.n.C(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    public static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            int i11 = i10 + 1;
            if (h(stackTraceElementArr[i10])) {
                break;
            }
            i10 = i11;
        }
        int i12 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i12 > length2) {
            return;
        }
        while (true) {
            int i13 = length2 - 1;
            if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i12) {
                return;
            }
            length2 = i13;
        }
    }

    public static final <E extends Throwable> E j(E e10, co.e eVar) {
        wn.k c10 = c(e10);
        Throwable th2 = (Throwable) c10.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c10.b();
        Throwable m10 = m(th2);
        if (m10 == null) {
            return e10;
        }
        ArrayDeque<StackTraceElement> e11 = e(eVar);
        if (e11.isEmpty()) {
            return e10;
        }
        if (th2 != e10) {
            i(stackTraceElementArr, e11);
        }
        return (E) d(th2, m10, e11);
    }

    public static final <E extends Throwable> E k(E e10) {
        Throwable m10;
        return (u0.d() && (m10 = m(e10)) != null) ? (E) l(m10) : e10;
    }

    public static final <E extends Throwable> E l(E e10) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int g10 = g(stackTrace, f63296b);
        int i10 = g10 + 1;
        int g11 = g(stackTrace, f63295a);
        int i11 = (length - g10) - (g11 == -1 ? 0 : length - g11);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                stackTraceElement = b("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i10 + i12) - 1];
            }
            stackTraceElementArr[i12] = stackTraceElement;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    public static final <E extends Throwable> E m(E e10) {
        E e11 = (E) m.g(e10);
        if (e11 == null) {
            return null;
        }
        if ((e10 instanceof uo.i0) || jo.p.c(e11.getMessage(), e10.getMessage())) {
            return e11;
        }
        return null;
    }

    public static final <E extends Throwable> E n(E e10) {
        E e11 = (E) e10.getCause();
        if (e11 != null && jo.p.c(e11.getClass(), e10.getClass())) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            int length = stackTrace.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                if (h(stackTraceElement)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return e11;
            }
        }
        return e10;
    }
}
