package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes2.dex */
public class d4 extends c4 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nd.z0.f42359w1, 1);
        sparseIntArray.put(nd.z0.login_title, 2);
        sparseIntArray.put(nd.z0.can_change_later_text_view, 3);
        sparseIntArray.put(nd.z0.f42287fg, 4);
        sparseIntArray.put(nd.z0.delete_input_image_view, 5);
        sparseIntArray.put(nd.z0.register_account, 6);
        sparseIntArray.put(nd.z0.social_container, 7);
        sparseIntArray.put(nd.z0.text_or, 8);
        sparseIntArray.put(nd.z0.btn_login_twitter, 9);
    }

    public d4(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public d4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[7], (AppCompatTextView) objArr[8], (EditTextWithOnKeyPreImeListener) objArr[4]);
        this.L = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
