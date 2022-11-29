package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class l9 extends k9 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout G;
    public androidx.databinding.g H;
    public long I;

    /* loaded from: classes2.dex */
    public class a implements androidx.databinding.g {
        public a() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(l9.this.D);
            jf.p pVar = l9.this.F;
            if (pVar != null) {
                androidx.lifecycle.e0<CharSequence> f10 = pVar.f();
                if (f10 != null) {
                    f10.p(a10);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.f42276e4, 4);
    }

    public l9(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return W((androidx.lifecycle.c0) obj, i11);
        }
        return V((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.k9
    public void U(jf.p pVar) {
        this.F = pVar;
        synchronized (this) {
            this.I |= 4;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean V(androidx.lifecycle.e0<CharSequence> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.I |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.c0<String> c0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.I |= 2;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.I     // Catch: java.lang.Throwable -> Lc1
            r4 = 0
            r1.I = r4     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lc1
            jf.p r0 = r1.F
            r6 = 15
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 14
            r9 = 13
            r11 = 12
            r13 = 0
            r14 = 0
            if (r6 == 0) goto L6a
            long r15 = r2 & r11
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L2c
            if (r0 == 0) goto L2c
            int r6 = r0.c()
            boolean r15 = r0.h()
            goto L2e
        L2c:
            r6 = r13
            r15 = r6
        L2e:
            long r16 = r2 & r9
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r16 == 0) goto L4a
            if (r0 == 0) goto L3d
            androidx.lifecycle.e0 r16 = r0.f()
            r9 = r16
            goto L3e
        L3d:
            r9 = r14
        L3e:
            r1.Q(r13, r9)
            if (r9 == 0) goto L4a
            java.lang.Object r9 = r9.f()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            goto L4b
        L4a:
            r9 = r14
        L4b:
            long r18 = r2 & r7
            int r10 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r10 == 0) goto L67
            if (r0 == 0) goto L58
            androidx.lifecycle.c0 r0 = r0.g()
            goto L59
        L58:
            r0 = r14
        L59:
            r10 = 1
            r1.Q(r10, r0)
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.f()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r6
            goto L6d
        L67:
            r13 = r6
            r0 = r14
            goto L6d
        L6a:
            r15 = r13
            r0 = r14
            r9 = r0
        L6d:
            long r10 = r2 & r11
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L85
            androidx.appcompat.widget.AppCompatImageView r6 = r1.C
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            td.a.E(r6, r10)
            androidx.appcompat.widget.AppCompatImageView r6 = r1.C
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r15)
            td.c.e(r6, r10)
        L85:
            r10 = 8
            long r10 = r10 & r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto Laa
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.G
            r10 = 16
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            androidx.constraintlayout.widget.ConstraintLayout r11 = r1.G
            int r12 = nd.w0.U0
            int r11 = androidx.databinding.ViewDataBinding.t(r11, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            td.c.b(r6, r10, r11)
            android.widget.EditText r6 = r1.D
            androidx.databinding.g r10 = r1.H
            x3.e.e(r6, r14, r14, r14, r10)
        Laa:
            r10 = 13
            long r10 = r10 & r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto Lb6
            android.widget.EditText r6 = r1.D
            x3.e.c(r6, r9)
        Lb6:
            long r2 = r2 & r7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto Lc0
            androidx.appcompat.widget.AppCompatTextView r2 = r1.E
            x3.e.c(r2, r0)
        Lc0:
            return
        Lc1:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lc1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.l9.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 8L;
        }
        H();
    }

    public l9(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[1], (EditText) objArr[2], (AppCompatTextView) objArr[3]);
        this.H = new a();
        this.I = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        N(view);
        y();
    }
}
