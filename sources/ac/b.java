package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.streaming.result.BroadcastResultBadgeView;
import com.dena.mirrativ.streaming.result.BroadcastResultPictureView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public class b extends a {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(xb.o.f60001l, 1);
        sparseIntArray.put(xb.o.I1, 2);
        sparseIntArray.put(xb.o.broadcast_result_picture_view, 3);
        sparseIntArray.put(xb.o.custom_thanks_message_container, 4);
        sparseIntArray.put(xb.o.thanks_send_logo, 5);
        sparseIntArray.put(xb.o.text_custom_thanks_message_title, 6);
        sparseIntArray.put(xb.o.text_custom_thanks_message_subtitle, 7);
        sparseIntArray.put(xb.o.bulk_send_text_view, 8);
        sparseIntArray.put(xb.o.viewer_container, 9);
        sparseIntArray.put(xb.o.follow_all_button_text_view, 10);
        sparseIntArray.put(xb.o.follow_all_progress_bar, 11);
        sparseIntArray.put(xb.o.I9, 12);
        sparseIntArray.put(xb.o.f60045v7, 13);
        sparseIntArray.put(xb.o.f60005m0, 14);
    }

    public b(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 15, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = 1L;
        }
        H();
    }

    public b(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[1], (BroadcastResultBadgeView) objArr[14], (BroadcastResultPictureView) objArr[3], (AppCompatTextView) objArr[8], (CollapsingToolbarLayout) objArr[2], (ConstraintLayout) objArr[4], (AppCompatTextView) objArr[10], (ProgressBar) objArr[11], (RecyclerView) objArr[13], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[5], (Toolbar) objArr[12], (ConstraintLayout) objArr[9]);
        this.Q = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
