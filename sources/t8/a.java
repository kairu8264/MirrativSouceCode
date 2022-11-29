package t8;

import ae.e8;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrativ.customview.StatusView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class a extends ViewDataBinding {
    public final StatusView B;
    public final TabLayout C;
    public final View D;
    public final e8 E;
    public final ViewPager F;

    public a(Object obj, View view, int i10, StatusView statusView, TabLayout tabLayout, View view2, e8 e8Var, ViewPager viewPager) {
        super(obj, view, i10);
        this.B = statusView;
        this.C = tabLayout;
        this.D = view2;
        this.E = e8Var;
        this.F = viewPager;
    }
}
