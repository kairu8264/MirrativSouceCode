package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class pb extends ob {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.O2, 1);
        sparseIntArray.put(nd.z0.f42350u2, 2);
        sparseIntArray.put(nd.z0.gift_overlay_text_view, 3);
        sparseIntArray.put(nd.z0.gift_overlay_switch_view, 4);
        sparseIntArray.put(nd.z0.gift_overlay_on_description_text_view, 5);
        sparseIntArray.put(nd.z0.gift_overlay_off_description_text_view, 6);
        sparseIntArray.put(nd.z0.arrow, 7);
    }

    public pb(androidx.databinding.e eVar, View view) {
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

    public pb(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[7], (ConstraintLayout) objArr[2], (View) objArr[1], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[5], (Switch) objArr[4], (AppCompatTextView) objArr[3]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
