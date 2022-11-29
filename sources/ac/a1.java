package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public abstract class a1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final ProfileImageView F;
    public final StatusView G;
    public final AppCompatTextView H;
    public cc.o I;

    public a1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, ProfileImageView profileImageView, StatusView statusView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = appCompatImageView3;
        this.E = appCompatTextView;
        this.F = profileImageView;
        this.G = statusView;
        this.H = appCompatTextView2;
    }

    public static a1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static a1 U(View view, Object obj) {
        return (a1) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_invite_collab);
    }

    public abstract void V(cc.o oVar);
}
