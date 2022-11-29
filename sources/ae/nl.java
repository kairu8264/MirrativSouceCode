package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public class nl extends ml {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.live_image_view, 1);
        sparseIntArray.put(nd.z0.f42345t, 2);
        sparseIntArray.put(nd.z0.C7, 3);
        sparseIntArray.put(nd.z0.N7, 4);
        sparseIntArray.put(nd.z0.Pa, 5);
        sparseIntArray.put(nd.z0.f42319mf, 6);
        sparseIntArray.put(nd.z0.f42272cg, 7);
        sparseIntArray.put(nd.z0.O7, 8);
    }

    public nl(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 1L;
        }
        H();
    }

    public nl(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (LiveBadgeView) objArr[3], (AppCompatImageView) objArr[1], (LiveTimeView) objArr[4], (AppCompatTextView) objArr[8], (ProfileImageView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[7]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
