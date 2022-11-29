package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class vf extends uf {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public long F;

    public vf(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                return V((androidx.lifecycle.e0) obj, i11);
            }
            return U((androidx.lifecycle.e0) obj, i11);
        }
        return W((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.uf
    public void T(ud.n1 n1Var) {
        this.E = n1Var;
        synchronized (this) {
            this.F |= 8;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.F |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.F     // Catch: java.lang.Throwable -> L97
            r4 = 0
            r1.F = r4     // Catch: java.lang.Throwable -> L97
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L97
            ud.n1 r0 = r1.E
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 26
            r9 = 25
            r11 = 28
            r13 = 0
            r14 = 0
            if (r6 == 0) goto L72
            long r15 = r2 & r9
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            if (r0 == 0) goto L28
            androidx.lifecycle.e0 r6 = r0.d()
            goto L29
        L28:
            r6 = r14
        L29:
            r1.Q(r13, r6)
            if (r6 == 0) goto L35
            java.lang.Object r6 = r6.f()
            java.lang.String r6 = (java.lang.String) r6
            goto L36
        L35:
            r6 = r14
        L36:
            long r15 = r2 & r7
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L56
            if (r0 == 0) goto L43
            androidx.lifecycle.e0 r13 = r0.b()
            goto L44
        L43:
            r13 = r14
        L44:
            r15 = 1
            r1.Q(r15, r13)
            if (r13 == 0) goto L51
            java.lang.Object r13 = r13.f()
            java.lang.Integer r13 = (java.lang.Integer) r13
            goto L52
        L51:
            r13 = r14
        L52:
            int r13 = androidx.databinding.ViewDataBinding.J(r13)
        L56:
            long r15 = r2 & r11
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L73
            if (r0 == 0) goto L63
            androidx.lifecycle.e0 r0 = r0.c()
            goto L64
        L63:
            r0 = r14
        L64:
            r15 = 2
            r1.Q(r15, r0)
            if (r0 == 0) goto L73
            java.lang.Object r0 = r0.f()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            goto L73
        L72:
            r6 = r14
        L73:
            long r11 = r11 & r2
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L7d
            androidx.appcompat.widget.AppCompatTextView r0 = r1.C
            x3.e.c(r0, r14)
        L7d:
            long r7 = r7 & r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L8c
            androidx.appcompat.widget.AppCompatTextView r0 = r1.C
            r0.setTextColor(r13)
            androidx.appcompat.widget.AppCompatTextView r0 = r1.D
            r0.setTextColor(r13)
        L8c:
            long r2 = r2 & r9
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L96
            androidx.appcompat.widget.AppCompatTextView r0 = r1.D
            x3.e.c(r0, r6)
        L96:
            return
        L97:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.vf.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 16L;
        }
        H();
    }

    public vf(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 3, (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[1]);
        this.F = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
