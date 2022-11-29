package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class h6 extends g6 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(nd.z0.Ue, 1);
        sparseIntArray.put(nd.z0.f42361w3, 2);
        sparseIntArray.put(nd.z0.constraintLayout2, 3);
        sparseIntArray.put(nd.z0.gender_container, 4);
        sparseIntArray.put(nd.z0.gender_title_text_view, 5);
        sparseIntArray.put(nd.z0.male_button, 6);
        sparseIntArray.put(nd.z0.female_button, 7);
        sparseIntArray.put(nd.z0.other_button, 8);
        sparseIntArray.put(nd.z0.generation_container, 9);
        sparseIntArray.put(nd.z0.generation_title_text_view, 10);
        sparseIntArray.put(nd.z0.generation_recycler_view, 11);
        sparseIntArray.put(nd.z0.privacy_text_view, 12);
        sparseIntArray.put(nd.z0.footer_container, 13);
        sparseIntArray.put(nd.z0.f42371yd, 14);
        sparseIntArray.put(nd.z0.Mc, 15);
    }

    public h6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, S, T));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.R != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.R = 1L;
        }
        H();
    }

    public h6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[2], (AppCompatButton) objArr[7], (ConstraintLayout) objArr[13], (CardView) objArr[4], (AppCompatTextView) objArr[5], (CardView) objArr[9], (RecyclerView) objArr[11], (AppCompatTextView) objArr[10], (AppCompatButton) objArr[6], (AppCompatButton) objArr[8], (AppCompatTextView) objArr[12], (AppCompatButton) objArr[15], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[1]);
        this.R = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
