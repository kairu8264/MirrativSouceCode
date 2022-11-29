package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class b extends a {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(nd.z0.f42269bf, 1);
        sparseIntArray.put(nd.z0.toolbar_text_view, 2);
        sparseIntArray.put(nd.z0.G6, 3);
        sparseIntArray.put(nd.z0.permission_text_view, 4);
        sparseIntArray.put(nd.z0.permission_base_view, 5);
        sparseIntArray.put(nd.z0.cando_text_view, 6);
        sparseIntArray.put(nd.z0.view_profile_text_view, 7);
        sparseIntArray.put(nd.z0.view_live_info_text_view, 8);
        sparseIntArray.put(nd.z0.authentication_button, 9);
        sparseIntArray.put(nd.z0.Y0, 10);
    }

    public b(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = 1L;
        }
        H();
    }

    public b(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatButton) objArr[9], (ConstraintLayout) objArr[0], (AppCompatButton) objArr[10], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[3], (View) objArr[5], (AppCompatTextView) objArr[4], (Toolbar) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7]);
        this.M = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
