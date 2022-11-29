package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class bc extends ac {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(nd.z0.f42361w3, 1);
        sparseIntArray.put(nd.z0.f42295hf, 2);
        sparseIntArray.put(nd.z0.f42322n8, 3);
        sparseIntArray.put(nd.z0.member_type_setting_container, 4);
        sparseIntArray.put(nd.z0.member_type_setting_title_view, 5);
        sparseIntArray.put(nd.z0.member_type_setting_random_view, 6);
        sparseIntArray.put(nd.z0.member_type_setting_ranking_view, 7);
        sparseIntArray.put(nd.z0.member_type_setting_myself_view, 8);
        sparseIntArray.put(nd.z0.select_by_myself_text_view, 9);
        sparseIntArray.put(nd.z0.selected_user_recycler_view, 10);
        sparseIntArray.put(nd.z0.member_type_setting_notice_text_view, 11);
        sparseIntArray.put(nd.z0.f42339s0, 12);
        sparseIntArray.put(nd.z0.next_step_button, 13);
    }

    public bc(androidx.databinding.e eVar, View view) {
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

    public bc(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[12], (AppCompatTextView) objArr[1], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[4], (RoundedButtonView) objArr[8], (AppCompatTextView) objArr[11], (RoundedButtonView) objArr[6], (RoundedButtonView) objArr[7], (AppCompatTextView) objArr[5], (RoundedButtonView) objArr[13], (AppCompatTextView) objArr[9], (RecyclerView) objArr[10], (View) objArr[2]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
