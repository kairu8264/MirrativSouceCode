package p000do;

import java.lang.reflect.Method;
import jo.p;
import no.b;
import no.c;

/* renamed from: do.a  reason: invalid package */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: do.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0289a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0289a f29741a = new C0289a();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f29742b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f29743c;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[LOOP:0: B:3:0x0015->B:13:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[EDGE_INSN: B:24:0x0043->B:15:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                do.a$a r0 = new do.a$a
                r0.<init>()
                p000do.a.C0289a.f29741a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                jo.p.g(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = jo.p.c(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                jo.p.g(r7, r8)
                java.lang.Object r7 = xn.o.W(r7)
                boolean r7 = jo.p.c(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                p000do.a.C0289a.f29742b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = jo.p.c(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                p000do.a.C0289a.f29743c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000do.a.C0289a.<clinit>():void");
        }
    }

    public void a(Throwable th2, Throwable th3) {
        p.h(th2, "cause");
        p.h(th3, "exception");
        Method method = C0289a.f29742b;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    public c b() {
        return new b();
    }
}
