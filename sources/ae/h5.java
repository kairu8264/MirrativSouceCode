package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StrokeDecorationTextView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes2.dex */
public class h5 extends g5 {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public final ConstraintLayout S;
    public final View T;
    public final View U;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(nd.z0.top_space, 7);
        sparseIntArray.put(nd.z0.stamp_comment_edit_text, 8);
        sparseIntArray.put(nd.z0.input_text_button, 9);
        sparseIntArray.put(nd.z0.input_text_note_text_view, 10);
        sparseIntArray.put(nd.z0.f42372z0, 11);
        sparseIntArray.put(nd.z0.bottom_item_barrier, 12);
        sparseIntArray.put(nd.z0.f42323nc, 13);
        sparseIntArray.put(nd.z0.f42365x1, 14);
        sparseIntArray.put(nd.z0.stamp_container, 15);
        sparseIntArray.put(nd.z0.base_image_view, 16);
        sparseIntArray.put(nd.z0.palette_recycler_view, 17);
        sparseIntArray.put(nd.z0.without_keyboard_group, 18);
        sparseIntArray.put(nd.z0.with_keyboard_group, 19);
    }

    public h5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 20, W, X));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.V;
            this.V = 0L;
        }
        if ((j10 & 1) != 0) {
            td.b.j(this.E, "MPLUSRounded1c-Black.ttf");
            td.b.j(this.I, "MPLUSRounded1c-Black.ttf");
            td.c.b(this.T, 4, Integer.valueOf(ViewDataBinding.t(this.T, nd.w0.emomo_message_gift_preview_background)));
            td.c.c(this.U, 4, 1, Integer.valueOf(ViewDataBinding.t(this.U, nd.w0.emomo_message_gift_preview_border)), null);
            td.b.j(this.K, "MPLUSRounded1c-Black.ttf");
            td.b.j(this.P, "MPLUSRounded1c-Black.ttf");
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.V != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.V = 1L;
        }
        H();
    }

    public h5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[16], (Barrier) objArr[12], (Space) objArr[11], (StrokeDecorationTextView) objArr[6], (AppCompatImageView) objArr[14], (RoundedButtonView) objArr[9], (AppCompatTextView) objArr[10], (StrokeDecorationTextView) objArr[4], (RecyclerView) objArr[17], (StrokeDecorationTextView) objArr[5], (RoundedButtonView) objArr[13], (EditTextWithOnKeyPreImeListener) objArr[8], (ConstraintLayout) objArr[15], (Space) objArr[7], (StrokeDecorationTextView) objArr[3], (Group) objArr[19], (Group) objArr[18]);
        this.V = -1L;
        this.E.setTag(null);
        this.I.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArr[1];
        this.T = view2;
        view2.setTag(null);
        View view3 = (View) objArr[2];
        this.U = view3;
        view3.setTag(null);
        this.K.setTag(null);
        this.P.setTag(null);
        N(view);
        y();
    }
}
