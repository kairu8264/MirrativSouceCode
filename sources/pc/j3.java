package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.emomo.EmomoMotionView;

/* loaded from: classes2.dex */
public class j3 extends i3 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(nc.e.W1, 1);
        sparseIntArray.put(nc.e.V3, 2);
        sparseIntArray.put(nc.e.mic_status_text_view, 3);
        sparseIntArray.put(nc.e.R0, 4);
        sparseIntArray.put(nc.e.X1, 5);
        sparseIntArray.put(nc.e.Q1, 6);
        sparseIntArray.put(nc.e.avatar_dress_up_image_view, 7);
        sparseIntArray.put(nc.e.B, 8);
        sparseIntArray.put(nc.e.back_to_player_container, 9);
        sparseIntArray.put(nc.e.back_to_player_arrow_image_view, 10);
        sparseIntArray.put(nc.e.back_to_player_text_view, 11);
        sparseIntArray.put(nc.e.player_thumbnail_container, 12);
        sparseIntArray.put(nc.e.player_thumbnail_image_view, 13);
    }

    public j3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.P = 0L;
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
            this.P = 1L;
        }
        H();
    }

    public j3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[7], (View) objArr[8], (AppCompatImageView) objArr[10], (ConstraintLayout) objArr[9], (AppCompatTextView) objArr[11], (AppCompatButton) objArr[4], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[6], (EmomoMotionView) objArr[1], (AppCompatButton) objArr[5], (AppCompatTextView) objArr[3], (ConstraintLayout) objArr[2], (FrameLayout) objArr[12], (AppCompatImageView) objArr[13]);
        this.P = -1L;
        this.H.setTag(null);
        N(view);
        y();
    }
}
