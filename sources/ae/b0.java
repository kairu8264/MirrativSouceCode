package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes2.dex */
public class b0 extends a0 {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(nd.z0.main_content_container, 2);
        sparseIntArray.put(nd.z0.f42323nc, 3);
        sparseIntArray.put(nd.z0.F, 4);
        sparseIntArray.put(nd.z0.play_button_image_view, 5);
        sparseIntArray.put(nd.z0.avatar_bottom_container, 6);
        sparseIntArray.put(nd.z0.Me, 7);
        sparseIntArray.put(nd.z0.title_edit_text, 8);
        sparseIntArray.put(nd.z0.Gb, 9);
        sparseIntArray.put(nd.z0.stamp_attributes_container, 10);
        sparseIntArray.put(nd.z0.input_text_recycler_view, 11);
        sparseIntArray.put(nd.z0.input_text_description_text_view, 12);
        sparseIntArray.put(nd.z0.pose_recycler_view, 13);
        sparseIntArray.put(nd.z0.f42361w3, 14);
        sparseIntArray.put(nd.z0.f42365x1, 15);
        sparseIntArray.put(nd.z0.f42268be, 16);
    }

    public b0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 17, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.S;
            this.S = 0L;
        }
        if ((j10 & 1) != 0) {
            View view = this.P;
            View view2 = this.P;
            int i10 = nd.w0.greyishBrown;
            td.c.c(view, 4, null, Integer.valueOf(ViewDataBinding.t(view2, i10)), Integer.valueOf(ViewDataBinding.t(this.P, i10)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.S != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.S = 1L;
        }
        H();
    }

    public b0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[6], (FrameLayout) objArr[4], (AppCompatImageView) objArr[15], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[12], (RecyclerView) objArr[11], (ConstraintLayout) objArr[2], (AppCompatImageView) objArr[5], (RecyclerView) objArr[13], (AppCompatTextView) objArr[9], (RoundedButtonView) objArr[3], (ConstraintLayout) objArr[10], (StatusView) objArr[16], (ConstraintLayout) objArr[7], (View) objArr[1], (EditTextWithOnKeyPreImeListener) objArr[8]);
        this.S = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.R = constraintLayout;
        constraintLayout.setTag(null);
        this.P.setTag(null);
        N(view);
        y();
    }
}
