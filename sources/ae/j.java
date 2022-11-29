package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class j extends i {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final ConstraintLayout S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(nd.z0.f42269bf, 1);
        sparseIntArray.put(nd.z0.Ue, 2);
        sparseIntArray.put(nd.z0.form_container, 3);
        sparseIntArray.put(nd.z0.amount_text_view, 4);
        sparseIntArray.put(nd.z0.price_unit1_text_view, 5);
        sparseIntArray.put(nd.z0.price_unit2_text_view, 6);
        sparseIntArray.put(nd.z0.amount_description_text_view, 7);
        sparseIntArray.put(nd.z0.exchangable_total_orb_text_notice_text_view, 8);
        sparseIntArray.put(nd.z0.select_google_play_gift_code_button, 9);
        sparseIntArray.put(nd.z0.select_itunes_gift_code_button, 10);
        sparseIntArray.put(nd.z0.apple_copyright, 11);
        sparseIntArray.put(nd.z0.loading_progress_container, 12);
        sparseIntArray.put(nd.z0.Va, 13);
        sparseIntArray.put(nd.z0.block_reason_view, 14);
        sparseIntArray.put(nd.z0.bow_image_view, 15);
        sparseIntArray.put(nd.z0.reason_text_view, 16);
        sparseIntArray.put(nd.z0.f42268be, 17);
    }

    public j(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 18, U, V));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.T = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.T != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.T = 1L;
        }
        H();
    }

    public j(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[11], (ConstraintLayout) objArr[14], (AppCompatImageView) objArr[15], (AppCompatTextView) objArr[8], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[12], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (ProgressBar) objArr[13], (AppCompatTextView) objArr[16], (AppCompatButton) objArr[9], (AppCompatButton) objArr[10], (StatusView) objArr[17], (AppCompatTextView) objArr[2], (Toolbar) objArr[1]);
        this.T = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
