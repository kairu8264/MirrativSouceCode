package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;
import com.google.android.flexbox.FlexboxLayout;

/* loaded from: classes2.dex */
public class m5 extends l5 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(xb.o.f59980f7, 1);
        sparseIntArray.put(xb.o.f59989i0, 2);
        sparseIntArray.put(xb.o.Ca, 3);
        sparseIntArray.put(xb.o.f59992ia, 4);
        sparseIntArray.put(xb.o.comment_count, 5);
        sparseIntArray.put(xb.o.is_follower_text_view, 6);
        sparseIntArray.put(xb.o.gift_points, 7);
        sparseIntArray.put(xb.o.gift_points_text_view, 8);
        sparseIntArray.put(xb.o.G3, 9);
        sparseIntArray.put(xb.o.thanks_status, 10);
        sparseIntArray.put(xb.o.f60043v3, 11);
    }

    public m5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 1L;
        }
        H();
    }

    public m5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[11], (FlexboxLayout) objArr[9], (LinearLayout) objArr[7], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[4], (YellRankIconView) objArr[3]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
