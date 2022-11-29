package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class x0 extends w0 {
    public static final ViewDataBinding.i Z = null;

    /* renamed from: a0  reason: collision with root package name */
    public static final SparseIntArray f46541a0;
    public long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f46541a0 = sparseIntArray;
        sparseIntArray.put(nc.e.f41840s3, 1);
        sparseIntArray.put(nc.e.f41855z6, 2);
        sparseIntArray.put(nc.e.f41846u6, 3);
        sparseIntArray.put(nc.e.time_note_text_view, 4);
        sparseIntArray.put(nc.e.f41844t6, 5);
        sparseIntArray.put(nc.e.f41841s6, 6);
        sparseIntArray.put(nc.e.trash_image_view, 7);
        sparseIntArray.put(nc.e.comment_text_view, 8);
        sparseIntArray.put(nc.e.announce_message_edit_text, 9);
        sparseIntArray.put(nc.e.text_count_text_view, 10);
        sparseIntArray.put(nc.e.app_text_view, 11);
        sparseIntArray.put(nc.e.f41842t, 12);
        sparseIntArray.put(nc.e.notification_image_view, 13);
        sparseIntArray.put(nc.e.notification_setting_text_view, 14);
        sparseIntArray.put(nc.e.notification_setting_switch, 15);
        sparseIntArray.put(nc.e.tweet_image_view, 16);
        sparseIntArray.put(nc.e.tweet_setting_text_view, 17);
        sparseIntArray.put(nc.e.tweet_setting_switch, 18);
        sparseIntArray.put(nc.e.apply_button_text_view, 19);
        sparseIntArray.put(nc.e.f41828i3, 20);
        sparseIntArray.put(nc.e.apply_button_progressbar, 21);
        sparseIntArray.put(nc.e.loading_data_progress_container, 22);
    }

    public x0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 23, Z, f46541a0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.Y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Y = 1L;
        }
        H();
    }

    public x0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (EditText) objArr[9], (AppCompatImageView) objArr[12], (AppCompatTextView) objArr[11], (ProgressBar) objArr[21], (RoundedButtonView) objArr[19], (AppCompatTextView) objArr[8], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[20], (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[22], (AppCompatImageView) objArr[13], (SwitchCompat) objArr[15], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[5], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[16], (SwitchCompat) objArr[18], (AppCompatTextView) objArr[17]);
        this.Y = -1L;
        this.H.setTag(null);
        N(view);
        y();
    }
}
