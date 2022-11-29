package t8;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.PagerSlidingTab;
import com.dena.mirrorman.widget.SafeViewPager;

/* loaded from: classes.dex */
public abstract class y extends ViewDataBinding {
    public final ImageButton B;
    public final SafeViewPager C;
    public final ImageButton D;
    public final RelativeLayout E;
    public final EditText F;
    public final Toolbar G;
    public final PagerSlidingTab H;

    public y(Object obj, View view, int i10, ImageButton imageButton, SafeViewPager safeViewPager, ImageButton imageButton2, RelativeLayout relativeLayout, EditText editText, Toolbar toolbar, PagerSlidingTab pagerSlidingTab) {
        super(obj, view, i10);
        this.B = imageButton;
        this.C = safeViewPager;
        this.D = imageButton2;
        this.E = relativeLayout;
        this.F = editText;
        this.G = toolbar;
        this.H = pagerSlidingTab;
    }
}
