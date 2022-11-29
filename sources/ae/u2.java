package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class u2 extends t2 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(nd.z0.G, 1);
        sparseIntArray.put(nd.z0.save_image_view, 2);
        sparseIntArray.put(nd.z0.save_text_view, 3);
        sparseIntArray.put(nd.z0.f42318md, 4);
        sparseIntArray.put(nd.z0.make_gift_image_view, 5);
        sparseIntArray.put(nd.z0.new_badge_image_view, 6);
        sparseIntArray.put(nd.z0.make_gift_balloon_image_view, 7);
        sparseIntArray.put(nd.z0.check_box_layout, 8);
        sparseIntArray.put(nd.z0.set_profile_image_to_emomo_check_box, 9);
        sparseIntArray.put(nd.z0.set_profile_image_to_emomo_text_view, 10);
        sparseIntArray.put(nd.z0.update_account, 11);
        sparseIntArray.put(nd.z0.edit_pose_text_view, 12);
    }

    public u2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.O != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.O = 1L;
        }
        H();
    }

    public u2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (LinearLayout) objArr[8], (AppCompatTextView) objArr[12], (ImageView) objArr[7], (ImageButton) objArr[5], (ImageView) objArr[6], (ImageButton) objArr[2], (AppCompatTextView) objArr[3], (AppCompatCheckBox) objArr[9], (AppCompatTextView) objArr[10], (ImageButton) objArr[4], (AppCompatButton) objArr[11]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
