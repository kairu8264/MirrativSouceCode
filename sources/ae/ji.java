package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public class ji extends ii {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout N;
    public final View O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 9);
        sparseIntArray.put(nd.z0.f42293h6, 10);
        sparseIntArray.put(nd.z0.f42305k6, 11);
        sparseIntArray.put(nd.z0.f42311l6, 12);
        sparseIntArray.put(nd.z0.profile_info_container, 13);
    }

    public ji(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.P;
            this.P = 0L;
        }
        if ((j10 & 3) != 0) {
            td.c.e(this.O, false);
            td.a.f(this.F, null);
            td.c.e(this.F, false);
            td.a.f(this.G, null);
            td.c.e(this.G, false);
            td.a.i(this.H, null);
            x3.e.c(this.J, null);
            x3.e.c(this.K, null);
            this.K.setTextColor(0);
            td.c.e(this.L, false);
            x3.f.a(this.M, null);
            td.c.e(this.M, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.P = 2L;
        }
        H();
    }

    public ji(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Guideline) objArr[10], (Guideline) objArr[9], (Guideline) objArr[11], (Guideline) objArr[12], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[13], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (ShooterVictoryCountView) objArr[7], (AppCompatImageView) objArr[2]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArr[8];
        this.O = view2;
        view2.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        N(view);
        y();
    }
}
