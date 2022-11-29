package s9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.emomo.closet.ShooterDressUpDetailView;
import com.dena.mirrorman.customview.HorizontalScrollBar;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public class h0 extends g0 {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(q9.g.M1, 1);
        sparseIntArray.put(q9.g.C1, 2);
        sparseIntArray.put(q9.g.dress_up_container_background_view, 3);
        sparseIntArray.put(q9.g.event_banner_image_container, 4);
        sparseIntArray.put(q9.g.event_banner_image_view, 5);
        sparseIntArray.put(q9.g.event_banner_title_text_view, 6);
        sparseIntArray.put(q9.g.f48826d0, 7);
        sparseIntArray.put(q9.g.dress_up_machine_spec_view, 8);
        sparseIntArray.put(q9.g.attributes_bottom_divider_view, 9);
        sparseIntArray.put(q9.g.parts_category_recycler_view, 10);
        sparseIntArray.put(q9.g.parts_recycler_view_container, 11);
        sparseIntArray.put(q9.g.parts_recycler_view, 12);
        sparseIntArray.put(q9.g.no_part_text_view, 13);
        sparseIntArray.put(q9.g.horizontal_scroll_bar_view, 14);
        sparseIntArray.put(q9.g.f48836s3, 15);
        sparseIntArray.put(q9.g.trial_button, 16);
        sparseIntArray.put(q9.g.save_button_anchor_space, 17);
        sparseIntArray.put(q9.g.reset_button, 18);
        sparseIntArray.put(q9.g.f48833i, 19);
        sparseIntArray.put(q9.g.D2, 20);
        sparseIntArray.put(q9.g.V2, 21);
    }

    public h0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 22, Y, Z));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.X = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.X != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.X = 1L;
        }
        H();
    }

    public h0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[9], (AppCompatImageView) objArr[19], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[7], (View) objArr[3], (ShooterDressUpDetailView) objArr[8], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[2], (HorizontalScrollBar) objArr[14], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[13], (RecyclerView) objArr[10], (RecyclerView) objArr[12], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[20], (RoundedButtonView) objArr[18], (AppCompatButton) objArr[21], (RoundedButtonView) objArr[15], (Space) objArr[17], (RoundedButtonView) objArr[16]);
        this.X = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
