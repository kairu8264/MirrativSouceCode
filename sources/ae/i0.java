package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public abstract class i0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final FloatingActionButton D;
    public final View E;
    public final AppCompatImageView F;
    public final AppCompatImageView G;
    public final TabLayout H;
    public final AppCompatTextView I;
    public final ViewPager J;

    public i0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, View view2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, TabLayout tabLayout, AppCompatTextView appCompatTextView, ViewPager viewPager) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = floatingActionButton;
        this.E = view2;
        this.F = appCompatImageView2;
        this.G = appCompatImageView3;
        this.H = tabLayout;
        this.I = appCompatTextView;
        this.J = viewPager;
    }
}
