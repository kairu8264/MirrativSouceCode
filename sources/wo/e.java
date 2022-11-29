package wo;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import uo.u0;
import zo.k0;

/* loaded from: classes4.dex */
public class e<E> extends wo.a<E> {
    public final h A;
    public final ReentrantLock B;
    public Object[] C;
    public int D;
    private volatile /* synthetic */ int size;

    /* renamed from: z  reason: collision with root package name */
    public final int f59273z;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59274a;

        static {
            int[] iArr = new int[h.values().length];
            iArr[h.SUSPEND.ordinal()] = 1;
            iArr[h.DROP_LATEST.ordinal()] = 2;
            iArr[h.DROP_OLDEST.ordinal()] = 3;
            f59274a = iArr;
        }
    }

    public e(int i10, h hVar, io.l<? super E, wn.v> lVar) {
        super(lVar);
        this.f59273z = i10;
        this.A = hVar;
        if (i10 >= 1) {
            this.B = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i10, 8)];
            xn.n.t(objArr, b.f59258a, 0, 0, 6, null);
            this.C = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    @Override // wo.a
    public boolean L(w<? super E> wVar) {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            return super.L(wVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // wo.a
    public final boolean N() {
        return false;
    }

    @Override // wo.a
    public final boolean O() {
        return this.size == 0;
    }

    @Override // wo.a
    public boolean P() {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            return super.P();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // wo.a
    public void R(boolean z10) {
        io.l<E, wn.v> lVar = this.f59265w;
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            int i11 = 0;
            while (i11 < i10) {
                i11++;
                Object obj = this.C[this.D];
                if (lVar != null && obj != b.f59258a) {
                    undeliveredElementException = zo.c0.c(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.C;
                int i12 = this.D;
                objArr[i12] = b.f59258a;
                this.D = (i12 + 1) % objArr.length;
            }
            this.size = 0;
            wn.v vVar = wn.v.f59242a;
            reentrantLock.unlock();
            super.R(z10);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // wo.a
    public Object V() {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object k10 = k();
                if (k10 == null) {
                    k10 = b.f59261d;
                }
                return k10;
            }
            Object[] objArr = this.C;
            int i11 = this.D;
            Object obj = objArr[i11];
            a0 a0Var = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object obj2 = b.f59261d;
            if (i10 == this.f59273z) {
                a0 a0Var2 = null;
                while (true) {
                    a0 E = E();
                    if (E == null) {
                        a0Var = a0Var2;
                        break;
                    }
                    k0 V = E.V(null);
                    if (V != null) {
                        if (u0.a()) {
                            if (!(V == uo.r.f56081a)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = E.S();
                        r6 = true;
                        a0Var = E;
                    } else {
                        E.W();
                        a0Var2 = E;
                    }
                }
            }
            if (obj2 != b.f59261d && !(obj2 instanceof p)) {
                this.size = i10;
                Object[] objArr2 = this.C;
                objArr2[(this.D + i10) % objArr2.length] = obj2;
            }
            this.D = (this.D + 1) % this.C.length;
            wn.v vVar = wn.v.f59242a;
            if (r6) {
                jo.p.e(a0Var);
                a0Var.Q();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #0 {all -> 0x00bb, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:32:0x0078, B:34:0x007c, B:36:0x0080, B:42:0x00a2, B:37:0x008c, B:39:0x0092, B:15:0x0043, B:18:0x0048, B:21:0x004d, B:23:0x0053, B:26:0x005f, B:29:0x0067, B:30:0x0076), top: B:50:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // wo.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object W(cp.d<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.B
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lbb
            if (r1 != 0) goto L15
            wo.p r9 = r8.k()     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L11
            zo.k0 r9 = wo.b.f59261d     // Catch: java.lang.Throwable -> Lbb
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.C     // Catch: java.lang.Throwable -> Lbb
            int r3 = r8.D     // Catch: java.lang.Throwable -> Lbb
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lbb
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lbb
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lbb
            zo.k0 r2 = wo.b.f59261d     // Catch: java.lang.Throwable -> Lbb
            int r3 = r8.f59273z     // Catch: java.lang.Throwable -> Lbb
            r6 = 1
            if (r1 != r3) goto L77
        L29:
            wo.a$g r3 = r8.J()     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r7 = r9.b(r3)     // Catch: java.lang.Throwable -> Lbb
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> Lbb
            jo.p.e(r5)     // Catch: java.lang.Throwable -> Lbb
            r2 = r5
            wo.a0 r2 = (wo.a0) r2     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r2 = r2.S()     // Catch: java.lang.Throwable -> Lbb
            r3 = r6
            goto L78
        L43:
            zo.k0 r3 = wo.b.f59261d     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r3) goto L48
            goto L77
        L48:
            java.lang.Object r3 = zo.c.f63279b     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r3) goto L4d
            goto L29
        L4d:
            java.lang.Object r2 = cp.e.d()     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r2) goto L5f
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.C     // Catch: java.lang.Throwable -> Lbb
            int r1 = r8.D     // Catch: java.lang.Throwable -> Lbb
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            return r7
        L5f:
            boolean r2 = r7 instanceof wo.p     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L67
            r3 = r6
            r2 = r7
            r5 = r2
            goto L78
        L67:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = jo.p.o(r1, r7)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lbb
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lbb
            throw r9     // Catch: java.lang.Throwable -> Lbb
        L77:
            r3 = 0
        L78:
            zo.k0 r7 = wo.b.f59261d     // Catch: java.lang.Throwable -> Lbb
            if (r2 == r7) goto L8c
            boolean r7 = r2 instanceof wo.p     // Catch: java.lang.Throwable -> Lbb
            if (r7 != 0) goto L8c
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.C     // Catch: java.lang.Throwable -> Lbb
            int r7 = r8.D     // Catch: java.lang.Throwable -> Lbb
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lbb
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lbb
            goto La2
        L8c:
            boolean r9 = r9.m()     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto La2
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.C     // Catch: java.lang.Throwable -> Lbb
            int r1 = r8.D     // Catch: java.lang.Throwable -> Lbb
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r9 = cp.e.d()     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            return r9
        La2:
            int r9 = r8.D     // Catch: java.lang.Throwable -> Lbb
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.C     // Catch: java.lang.Throwable -> Lbb
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lbb
            int r9 = r9 % r1
            r8.D = r9     // Catch: java.lang.Throwable -> Lbb
            wn.v r9 = wn.v.f59242a     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            if (r3 == 0) goto Lba
            jo.p.e(r5)
            wo.a0 r5 = (wo.a0) r5
            r5.Q()
        Lba:
            return r4
        Lbb:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.e.W(cp.d):java.lang.Object");
    }

    public final void b0(int i10, E e10) {
        if (i10 < this.f59273z) {
            c0(i10);
            Object[] objArr = this.C;
            objArr[(this.D + i10) % objArr.length] = e10;
            return;
        }
        if (u0.a()) {
            if (!(this.A == h.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.C;
        int i11 = this.D;
        objArr2[i11 % objArr2.length] = null;
        objArr2[(i10 + i11) % objArr2.length] = e10;
        this.D = (i11 + 1) % objArr2.length;
    }

    public final void c0(int i10) {
        Object[] objArr = this.C;
        if (i10 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f59273z);
            Object[] objArr2 = new Object[min];
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr3 = this.C;
                objArr2[i11] = objArr3[(this.D + i11) % objArr3.length];
            }
            xn.n.r(objArr2, b.f59258a, i10, min);
            this.C = objArr2;
            this.D = 0;
        }
    }

    public final k0 d0(int i10) {
        if (i10 < this.f59273z) {
            this.size = i10 + 1;
            return null;
        }
        int i11 = a.f59274a[this.A.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return b.f59259b;
        }
        return b.f59260c;
    }

    @Override // wo.c
    public Object h(a0 a0Var) {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            return super.h(a0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // wo.c
    public String i() {
        return "(buffer:capacity=" + this.f59273z + ",size=" + this.size + ')';
    }

    @Override // wo.c
    public final boolean v() {
        return false;
    }

    @Override // wo.c
    public final boolean w() {
        return this.size == this.f59273z && this.A == h.SUSPEND;
    }

    @Override // wo.c
    public Object z(E e10) {
        y<E> D;
        k0 l10;
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            p<?> k10 = k();
            if (k10 == null) {
                k0 d02 = d0(i10);
                if (d02 == null) {
                    if (i10 == 0) {
                        do {
                            D = D();
                            if (D != null) {
                                if (D instanceof p) {
                                    this.size = i10;
                                    return D;
                                }
                                l10 = D.l(e10, null);
                            }
                        } while (l10 == null);
                        if (u0.a()) {
                            if (!(l10 == uo.r.f56081a)) {
                                throw new AssertionError();
                            }
                        }
                        this.size = i10;
                        wn.v vVar = wn.v.f59242a;
                        reentrantLock.unlock();
                        D.i(e10);
                        return D.a();
                    }
                    b0(i10, e10);
                    return b.f59259b;
                }
                return d02;
            }
            return k10;
        } finally {
            reentrantLock.unlock();
        }
    }
}
