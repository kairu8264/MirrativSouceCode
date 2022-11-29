package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p9 extends o9 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nd.z0.pose_image_view, 3);
        sparseIntArray.put(nd.z0.Ue, 4);
    }

    public p9(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.c(this.B, 100, null, Integer.valueOf(ViewDataBinding.t(this.B, nd.w0.Q0)), Integer.valueOf(ViewDataBinding.t(this.B, nd.w0.emomo_message_gift_preview_background)));
            td.c.c(this.D, 100, 2, Integer.valueOf(ViewDataBinding.t(this.D, nd.w0.f42242u0)), null);
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

    public p9(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[1], (AppCompatImageView) objArr[3], (View) objArr[2], (AppCompatTextView) objArr[4]);
        this.G = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
