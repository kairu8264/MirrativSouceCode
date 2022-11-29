package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.widget.HtmlTextView;

/* loaded from: classes2.dex */
public class ld extends kd {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.M1, 1);
        sparseIntArray.put(nd.z0.Pa, 2);
        sparseIntArray.put(nd.z0.M, 3);
        sparseIntArray.put(nd.z0.moderator_badge_image_view, 4);
        sparseIntArray.put(nd.z0.message_html_text_view, 5);
        sparseIntArray.put(nd.z0.f42263ae, 6);
        sparseIntArray.put(nd.z0.f42260a1, 7);
    }

    public ld(androidx.databinding.e eVar, View view) {
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

    public ld(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (RoundedButtonView) objArr[7], (ConstraintLayout) objArr[1], (HtmlTextView) objArr[5], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[2], (RoundedButtonView) objArr[6]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
