package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.customview.YellRankIconView;
import com.dena.mirrorman.widget.AutoLinkTextView;

/* loaded from: classes2.dex */
public class lh extends kh {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nd.z0.Pa, 1);
        sparseIntArray.put(nd.z0.Lg, 2);
        sparseIntArray.put(nd.z0.f42272cg, 3);
        sparseIntArray.put(nd.z0.A8, 4);
    }

    public lh(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 1L;
        }
        H();
    }

    public lh(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AutoLinkTextView) objArr[4], (ProfileImageView) objArr[1], (AppCompatTextView) objArr[3], (YellRankIconView) objArr[2]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
