package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;

/* loaded from: classes2.dex */
public class vc extends uc {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.gift_comment_container, 1);
        sparseIntArray.put(nd.z0.La, 2);
        sparseIntArray.put(nd.z0.M, 3);
        sparseIntArray.put(nd.z0.moderator_badge_image_view, 4);
        sparseIntArray.put(nd.z0.Lg, 5);
        sparseIntArray.put(nd.z0.f42270bg, 6);
        sparseIntArray.put(nd.z0.X5, 7);
    }

    public vc(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
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
            this.J = 1L;
        }
        H();
    }

    public vc(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (ConstraintLayout) objArr[1], (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[6], (YellRankIconView) objArr[5]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
