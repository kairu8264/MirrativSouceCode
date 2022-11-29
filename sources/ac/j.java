package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class j extends i {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final FrameLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(xb.o.V1, 1);
        sparseIntArray.put(xb.o.f60003l4, 2);
        sparseIntArray.put(xb.o.f60024q1, 3);
        sparseIntArray.put(xb.o.G9, 4);
        sparseIntArray.put(xb.o.collab_settings_info_container, 5);
        sparseIntArray.put(xb.o.collab_setting_description_text_view, 6);
        sparseIntArray.put(xb.o.show_collab_settings_text_view, 7);
        sparseIntArray.put(xb.o.collab_description_text_view, 8);
        sparseIntArray.put(xb.o.max_collab_count_text_view, 9);
        sparseIntArray.put(xb.o.collab_live_invite_image_view, 10);
        sparseIntArray.put(xb.o.f60051xa, 11);
        sparseIntArray.put(xb.o.f60062za, 12);
        sparseIntArray.put(xb.o.f60056ya, 13);
        sparseIntArray.put(xb.o.Q8, 14);
    }

    public j(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 15, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = 1L;
        }
        H();
    }

    public j(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[7], (StatusView) objArr[14], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[11], (RecyclerView) objArr[13], (View) objArr[12]);
        this.Q = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.P = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
