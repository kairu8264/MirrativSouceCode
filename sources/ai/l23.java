package ai;

import java.lang.Throwable;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class l23<V, X extends Throwable, F, T> extends y33<V> implements Runnable {
    public s43<? extends V> D;
    public Class<X> E;
    public F F;

    public l23(s43<? extends V> s43Var, Class<X> cls, F f10) {
        Objects.requireNonNull(s43Var);
        this.D = s43Var;
        this.E = cls;
        Objects.requireNonNull(f10);
        this.F = f10;
    }

    public abstract void F(T t10);

    public abstract T G(F f10, X x10) throws Exception;

    @Override // ai.a33
    public final String h() {
        String str;
        s43<? extends V> s43Var = this.D;
        Class<X> cls = this.E;
        F f10 = this.F;
        String h10 = super.h();
        if (s43Var != null) {
            String obj = s43Var.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(obj);
            sb2.append("], ");
            str = sb2.toString();
        } else {
            str = "";
        }
        if (cls == null || f10 == null) {
            if (h10 != null) {
                return h10.length() != 0 ? str.concat(h10) : new String(str);
            }
            return null;
        }
        String obj2 = cls.toString();
        String obj3 = f10.toString();
        StringBuilder sb3 = new StringBuilder(str.length() + 29 + obj2.length() + obj3.length());
        sb3.append(str);
        sb3.append("exceptionType=[");
        sb3.append(obj2);
        sb3.append("], fallback=[");
        sb3.append(obj3);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // ai.a33
    public final void j() {
        z(this.D);
        this.D = null;
        this.E = null;
        this.F = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            ai.s43<? extends V> r0 = r10.D
            java.lang.Class<X extends java.lang.Throwable> r1 = r10.E
            F r2 = r10.F
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r1 != 0) goto L11
            r6 = r3
            goto L12
        L11:
            r6 = r4
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = r4
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto Lad
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L22
            goto Lad
        L22:
            r3 = 0
            r10.D = r3
            boolean r4 = r0 instanceof ai.k53     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            if (r4 == 0) goto L31
            r4 = r0
            ai.k53 r4 = (ai.k53) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            java.lang.Throwable r4 = r4.a()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3a
            java.lang.Object r5 = ai.j43.q(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L83
        L39:
            r4 = move-exception
        L3a:
            r5 = r3
            goto L83
        L3c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L81
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r8 = r4.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = " threw "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L81:
            r4 = r5
            goto L3a
        L83:
            if (r4 != 0) goto L89
            r10.u(r5)
            return
        L89:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto Laa
            java.lang.Object r0 = r10.G(r2, r4)     // Catch: java.lang.Throwable -> L9b
            r10.E = r3
            r10.F = r3
            r10.F(r0)
            return
        L9b:
            r0 = move-exception
            r10.v(r0)     // Catch: java.lang.Throwable -> La4
            r10.E = r3
            r10.F = r3
            return
        La4:
            r0 = move-exception
            r10.E = r3
            r10.F = r3
            throw r0
        Laa:
            r10.w(r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.l23.run():void");
    }
}
