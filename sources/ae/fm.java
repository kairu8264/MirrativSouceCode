package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class fm extends em {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ScrollView F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nd.z0.category_radio_group, 1);
        sparseIntArray.put(nd.z0.edit_report, 2);
        sparseIntArray.put(nd.z0.Y0, 3);
        sparseIntArray.put(nd.z0.report_button, 4);
    }

    public fm(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 1L;
        }
        H();
    }

    public fm(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatButton) objArr[3], (RadioGroup) objArr[1], (EditText) objArr[2], (AppCompatButton) objArr[4]);
        this.G = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.F = scrollView;
        scrollView.setTag(null);
        N(view);
        y();
    }
}
