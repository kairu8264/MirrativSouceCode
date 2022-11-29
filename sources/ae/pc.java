package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.widget.AutoLinkTextView;

/* loaded from: classes2.dex */
public class pc extends oc {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.M1, 1);
        sparseIntArray.put(nd.z0.La, 2);
        sparseIntArray.put(nd.z0.f42270bg, 3);
        sparseIntArray.put(nd.z0.message_label_text_view, 4);
        sparseIntArray.put(nd.z0.A8, 5);
        sparseIntArray.put(nd.z0.copy_image_view, 6);
        sparseIntArray.put(nd.z0.clickable_view, 7);
    }

    public pc(androidx.databinding.e eVar, View view) {
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

    public pc(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[7], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[4], (AutoLinkTextView) objArr[5], (ProfileImageView) objArr[2], (AppCompatTextView) objArr[3]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
