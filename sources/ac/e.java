package ac;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class e extends ViewDataBinding {
    public final AppCompatImageView B;
    public final FrameLayout C;
    public final AppCompatTextView D;
    public final EditText E;
    public final ConstraintLayout F;
    public final RecyclerView G;
    public final RoundedButtonView H;
    public final StatusView I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;
    public final Toolbar L;

    public e(Object obj, View view, int i10, AppCompatImageView appCompatImageView, FrameLayout frameLayout, AppCompatTextView appCompatTextView, EditText editText, ConstraintLayout constraintLayout, RecyclerView recyclerView, RoundedButtonView roundedButtonView, StatusView statusView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, Toolbar toolbar) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = frameLayout;
        this.D = appCompatTextView;
        this.E = editText;
        this.F = constraintLayout;
        this.G = recyclerView;
        this.H = roundedButtonView;
        this.I = statusView;
        this.J = appCompatImageView2;
        this.K = appCompatTextView2;
        this.L = toolbar;
    }
}
