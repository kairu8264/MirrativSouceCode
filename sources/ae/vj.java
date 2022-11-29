package ae;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class vj extends uj {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.description_recycler_view, 2);
    }

    public vj(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return U((androidx.lifecycle.e0) obj, i11);
        }
        return V((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.uj
    public void T(ud.o1 o1Var) {
        this.E = o1Var;
        synchronized (this) {
            this.F |= 4;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.F     // Catch: java.lang.Throwable -> L64
            r2 = 0
            r13.F = r2     // Catch: java.lang.Throwable -> L64
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L64
            ud.o1 r4 = r13.E
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 13
            r8 = 14
            r10 = 0
            if (r5 == 0) goto L4e
            long r11 = r0 & r6
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L31
            if (r4 == 0) goto L23
            androidx.lifecycle.e0 r5 = r4.d()
            goto L24
        L23:
            r5 = r10
        L24:
            r11 = 0
            r13.Q(r11, r5)
            if (r5 == 0) goto L31
            java.lang.Object r5 = r5.f()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L32
        L31:
            r5 = r10
        L32:
            long r11 = r0 & r8
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L4f
            if (r4 == 0) goto L3f
            androidx.lifecycle.e0 r4 = r4.b()
            goto L40
        L3f:
            r4 = r10
        L40:
            r11 = 1
            r13.Q(r11, r4)
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r4.f()
            r10 = r4
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            goto L4f
        L4e:
            r5 = r10
        L4f:
            long r8 = r8 & r0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L59
            androidx.constraintlayout.widget.ConstraintLayout r4 = r13.B
            x3.f.a(r4, r10)
        L59:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L63
            android.view.View r0 = r13.D
            td.c.e(r0, r5)
        L63:
            return
        L64:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L64
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.vj.l():void");
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
            this.F = 8L;
        }
        H();
    }

    public vj(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, (ConstraintLayout) objArr[0], (RecyclerView) objArr[2], (View) objArr[1]);
        this.F = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
