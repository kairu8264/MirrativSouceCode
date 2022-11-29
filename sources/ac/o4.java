package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public class o4 extends n4 {

    /* renamed from: b0  reason: collision with root package name */
    public static final ViewDataBinding.i f942b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public static final SparseIntArray f943c0;

    /* renamed from: a0  reason: collision with root package name */
    public long f944a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f943c0 = sparseIntArray;
        sparseIntArray.put(xb.o.f60011n1, 1);
        sparseIntArray.put(xb.o.left_guideline, 2);
        sparseIntArray.put(xb.o.right_guideline, 3);
        sparseIntArray.put(xb.o.send_to_textview, 4);
        sparseIntArray.put(xb.o.target_only_gifting_users_button, 5);
        sparseIntArray.put(xb.o.gift_user, 6);
        sparseIntArray.put(xb.o.text1, 7);
        sparseIntArray.put(xb.o.blur_view1, 8);
        sparseIntArray.put(xb.o.already_send_mark1, 9);
        sparseIntArray.put(xb.o.already_send_text_view1, 10);
        sparseIntArray.put(xb.o.target_not_gifting_viewer_button, 11);
        sparseIntArray.put(xb.o.people_image_view, 12);
        sparseIntArray.put(xb.o.f60017o2, 13);
        sparseIntArray.put(xb.o.blur_view2, 14);
        sparseIntArray.put(xb.o.already_send_mark2, 15);
        sparseIntArray.put(xb.o.already_send_text_view2, 16);
        sparseIntArray.put(xb.o.J5, 17);
        sparseIntArray.put(xb.o.text_input_layout, 18);
        sparseIntArray.put(xb.o.text_input_edit_text, 19);
        sparseIntArray.put(xb.o.caution_text, 20);
        sparseIntArray.put(xb.o.send_button_container, 21);
        sparseIntArray.put(xb.o.heart_image_view, 22);
        sparseIntArray.put(xb.o.f59981f8, 23);
        sparseIntArray.put(xb.o.f59995j7, 24);
    }

    public o4(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 25, f942b0, f943c0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f944a0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f944a0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f944a0 = 1L;
        }
        H();
    }

    public o4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[9], (View) objArr[15], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[16], (View) objArr[8], (View) objArr[14], (AppCompatTextView) objArr[20], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[13], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[22], (Guideline) objArr[2], (AppCompatTextView) objArr[17], (NestedScrollView) objArr[0], (AppCompatImageView) objArr[12], (ProgressBar) objArr[24], (Guideline) objArr[3], (LinearLayout) objArr[21], (AppCompatTextView) objArr[23], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[5], (AppCompatTextView) objArr[7], (TextInputEditText) objArr[19], (TextInputLayout) objArr[18]);
        this.f944a0 = -1L;
        this.O.setTag(null);
        N(view);
        y();
    }
}
