package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class x0 extends w0 {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(xb.o.J9, 1);
        sparseIntArray.put(xb.o.photo_view_container, 2);
        sparseIntArray.put(xb.o.B4, 3);
        sparseIntArray.put(xb.o.save_photo_button_view, 4);
        sparseIntArray.put(xb.o.thumbnail_button_view, 5);
        sparseIntArray.put(xb.o.post_group_shot_gallery_button_view, 6);
        sparseIntArray.put(xb.o.f60023p8, 7);
        sparseIntArray.put(xb.o.f59971aa, 8);
        sparseIntArray.put(xb.o.f60032r8, 9);
        sparseIntArray.put(xb.o.f60028q8, 10);
        sparseIntArray.put(xb.o.share_tweet_clickable_view, 11);
        sparseIntArray.put(xb.o.group_shot_gallery_help_text_view, 12);
        sparseIntArray.put(xb.o.f60041v0, 13);
        sparseIntArray.put(xb.o.close_anchor_space, 14);
        sparseIntArray.put(xb.o.f60024q1, 15);
        sparseIntArray.put(xb.o.Q8, 16);
    }

    public x0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 17, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.S = 0L;
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

    public x0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Space) objArr[13], (Space) objArr[14], (AppCompatImageView) objArr[15], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[12], (AppCompatImageView) objArr[3], (ConstraintLayout) objArr[2], (RoundedButtonView) objArr[6], (RoundedButtonView) objArr[4], (View) objArr[11], (ConstraintLayout) objArr[7], (SwitchCompat) objArr[10], (AppCompatTextView) objArr[9], (StatusView) objArr[16], (RoundedButtonView) objArr[5], (Space) objArr[1], (AppCompatImageView) objArr[8]);
        this.S = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
