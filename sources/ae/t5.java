package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.PinCodeView;

/* loaded from: classes2.dex */
public class t5 extends s5 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.Ue, 3);
        sparseIntArray.put(nd.z0.pin_code_view, 4);
        sparseIntArray.put(nd.z0.Y0, 5);
    }

    public t5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                return W((androidx.lifecycle.e0) obj, i11);
            }
            return U((androidx.lifecycle.e0) obj, i11);
        }
        return V((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.s5
    public void T(ud.l1 l1Var) {
        this.G = l1Var;
        synchronized (this) {
            this.I |= 8;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.I |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.I |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.I |= 4;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.I     // Catch: java.lang.Throwable -> L97
            r4 = 0
            r1.I = r4     // Catch: java.lang.Throwable -> L97
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L97
            ud.l1 r0 = r1.G
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 25
            r11 = 26
            r13 = 0
            r14 = 0
            if (r6 == 0) goto L76
            long r15 = r2 & r9
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            if (r0 == 0) goto L28
            androidx.lifecycle.e0 r6 = r0.g()
            goto L29
        L28:
            r6 = r14
        L29:
            r1.Q(r13, r6)
            if (r6 == 0) goto L35
            java.lang.Object r6 = r6.f()
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L36
        L35:
            r6 = r14
        L36:
            long r15 = r2 & r11
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L51
            if (r0 == 0) goto L43
            androidx.lifecycle.e0 r15 = r0.f()
            goto L44
        L43:
            r15 = r14
        L44:
            r13 = 1
            r1.Q(r13, r15)
            if (r15 == 0) goto L51
            java.lang.Object r13 = r15.f()
            java.lang.String r13 = (java.lang.String) r13
            goto L52
        L51:
            r13 = r14
        L52:
            long r17 = r2 & r7
            int r15 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r15 == 0) goto L74
            if (r0 == 0) goto L5f
            androidx.lifecycle.e0 r0 = r0.h()
            goto L60
        L5f:
            r0 = r14
        L60:
            r15 = 2
            r1.Q(r15, r0)
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r0.f()
            r14 = r0
            java.lang.Boolean r14 = (java.lang.Boolean) r14
        L6d:
            boolean r0 = androidx.databinding.ViewDataBinding.K(r14)
            r14 = r13
            r13 = r0
            goto L78
        L74:
            r14 = r13
            goto L77
        L76:
            r6 = r14
        L77:
            r13 = 0
        L78:
            long r11 = r11 & r2
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L82
            androidx.appcompat.widget.AppCompatTextView r0 = r1.C
            x3.e.c(r0, r14)
        L82:
            long r9 = r9 & r2
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L8c
            androidx.appcompat.widget.AppCompatTextView r0 = r1.C
            td.b.g(r0, r6)
        L8c:
            long r2 = r2 & r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L96
            androidx.appcompat.widget.AppCompatButton r0 = r1.D
            r0.setEnabled(r13)
        L96:
            return
        L97:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.t5.l():void");
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
            this.I = 16L;
        }
        H();
    }

    public t5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 3, (AppCompatButton) objArr[5], (AppCompatTextView) objArr[1], (AppCompatButton) objArr[2], (PinCodeView) objArr[4], (AppCompatTextView) objArr[3]);
        this.I = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
