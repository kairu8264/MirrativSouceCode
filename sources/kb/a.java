package kb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.VideoTextureView;

/* loaded from: classes2.dex */
public abstract class a extends ViewDataBinding {
    public final ConstraintLayout B;
    public final LottieAnimationView C;
    public final FrameLayout D;
    public final AppCompatImageView E;
    public final ConstraintLayout F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final LottieAnimationView I;
    public final AppCompatTextView J;
    public final ConstraintLayout K;
    public final AppCompatImageView L;
    public final AppCompatTextView M;
    public final ImageButton N;
    public final ConstraintLayout O;
    public final ProgressBar P;
    public final AppCompatButton Q;
    public final SeekBar R;
    public final AppCompatImageView S;
    public final VideoTextureView T;

    public a(Object obj, View view, int i10, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LottieAnimationView lottieAnimationView2, AppCompatTextView appCompatTextView3, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView4, ImageButton imageButton, ConstraintLayout constraintLayout4, ProgressBar progressBar, AppCompatButton appCompatButton, SeekBar seekBar, AppCompatImageView appCompatImageView3, VideoTextureView videoTextureView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = lottieAnimationView;
        this.D = frameLayout;
        this.E = appCompatImageView;
        this.F = constraintLayout2;
        this.G = appCompatTextView;
        this.H = appCompatTextView2;
        this.I = lottieAnimationView2;
        this.J = appCompatTextView3;
        this.K = constraintLayout3;
        this.L = appCompatImageView2;
        this.M = appCompatTextView4;
        this.N = imageButton;
        this.O = constraintLayout4;
        this.P = progressBar;
        this.Q = appCompatButton;
        this.R = seekBar;
        this.S = appCompatImageView3;
        this.T = videoTextureView;
    }
}
