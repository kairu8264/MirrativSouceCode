package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import hb.w1;

/* loaded from: classes2.dex */
public class r1 extends q1 {

    /* renamed from: c0  reason: collision with root package name */
    public static final ViewDataBinding.i f38539c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    public static final SparseIntArray f38540d0;

    /* renamed from: b0  reason: collision with root package name */
    public long f38541b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38540d0 = sparseIntArray;
        sparseIntArray.put(w1.dialogLayout, 1);
        sparseIntArray.put(w1.timeBar, 2);
        sparseIntArray.put(w1.quizNumberLabel, 3);
        sparseIntArray.put(w1.correctAnswerIndicator, 4);
        sparseIntArray.put(w1.imageView3, 5);
        sparseIntArray.put(w1.correctIndicatorTextView, 6);
        sparseIntArray.put(w1.incorrectAnswerIndicator, 7);
        sparseIntArray.put(w1.imageView2, 8);
        sparseIntArray.put(w1.incorrectIndicatorTextView, 9);
        sparseIntArray.put(w1.imageView4, 10);
        sparseIntArray.put(w1.userNumTextView, 11);
        sparseIntArray.put(w1.quizTextView, 12);
        sparseIntArray.put(w1.remainingTimeTextView, 13);
        sparseIntArray.put(w1.buttonChoice1, 14);
        sparseIntArray.put(w1.buttonChoice2, 15);
        sparseIntArray.put(w1.buttonChoice3, 16);
        sparseIntArray.put(w1.buttonChoice4, 17);
        sparseIntArray.put(w1.checkMarkOnChoice1, 18);
        sparseIntArray.put(w1.checkMarkOnChoice2, 19);
        sparseIntArray.put(w1.checkMarkOnChoice3, 20);
        sparseIntArray.put(w1.checkMarkOnChoice4, 21);
        sparseIntArray.put(w1.answererNumView1, 22);
        sparseIntArray.put(w1.answererNumView2, 23);
        sparseIntArray.put(w1.answererNumView3, 24);
        sparseIntArray.put(w1.answererNumView4, 25);
    }

    public r1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 26, f38539c0, f38540d0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f38541b0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f38541b0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f38541b0 = 1L;
        }
        H();
    }

    public r1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[22], (AppCompatTextView) objArr[23], (AppCompatTextView) objArr[24], (AppCompatTextView) objArr[25], (AppCompatButton) objArr[14], (AppCompatButton) objArr[15], (AppCompatButton) objArr[16], (AppCompatButton) objArr[17], (AppCompatImageView) objArr[18], (AppCompatImageView) objArr[19], (AppCompatImageView) objArr[20], (AppCompatImageView) objArr[21], (LinearLayout) objArr[4], (AppCompatTextView) objArr[6], (RelativeLayout) objArr[1], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[10], (LinearLayout) objArr[7], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[3], (RelativeLayout) objArr[0], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[13], (ProgressBar) objArr[2], (AppCompatTextView) objArr[11]);
        this.f38541b0 = -1L;
        this.W.setTag(null);
        N(view);
        y();
    }
}
