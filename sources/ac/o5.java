package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.customview.YellRankIconView;

/* loaded from: classes2.dex */
public class o5 extends n5 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xb.o.Ca, 6);
    }

    public o5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return U((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ac.n5
    public void T(zb.b bVar) {
        this.H = bVar;
        synchronized (this) {
            this.J |= 2;
        }
        c(xb.b.f59841d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.J |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z11;
        String str5;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        zb.b bVar = this.H;
        int i10 = ((7 & j10) > 0L ? 1 : ((7 & j10) == 0L ? 0 : -1));
        boolean z12 = false;
        String str6 = null;
        if (i10 != 0) {
            if ((j10 & 6) == 0 || bVar == null) {
                z11 = false;
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
            } else {
                str = bVar.f();
                str2 = bVar.c();
                str3 = bVar.a();
                str4 = bVar.d();
                z11 = bVar.j();
                str5 = bVar.b();
            }
            androidx.lifecycle.e0<Boolean> i11 = bVar != null ? bVar.i() : null;
            Q(0, i11);
            z10 = ViewDataBinding.K(i11 != null ? i11.f() : null);
            z12 = z11;
            str6 = str5;
        } else {
            z10 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if ((j10 & 6) != 0) {
            td.a.f(this.B, str6);
            td.c.e(this.B, Boolean.valueOf(z12));
            x3.e.c(this.D, str2);
            this.E.setProfileContinuousBadgeImageUrl(str3);
            this.E.setProfileImageUrl(str4);
            x3.e.c(this.F, str);
        }
        if (i10 != 0) {
            this.C.setEnabled(z10);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 4L;
        }
        H();
    }

    public o5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatImageView) objArr[2], (RoundedButtonView) objArr[5], (TextView) objArr[4], (ProfileImageView) objArr[1], (AppCompatTextView) objArr[3], (YellRankIconView) objArr[6]);
        this.J = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
