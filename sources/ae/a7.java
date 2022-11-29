package ae;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class a7 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final Switch C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final Switch F;
    public final AppCompatTextView G;
    public final LinearLayout H;
    public final AppCompatTextView I;
    public final Switch J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final LinearLayout M;
    public final AppCompatTextView N;
    public final Switch O;
    public final AppCompatTextView P;
    public final AppCompatTextView Q;
    public final Switch R;
    public final AppCompatTextView S;
    public final Switch T;
    public final AppCompatTextView U;

    public a7(Object obj, View view, int i10, AppCompatTextView appCompatTextView, Switch r72, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, Switch r10, AppCompatTextView appCompatTextView4, LinearLayout linearLayout, AppCompatTextView appCompatTextView5, Switch r14, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, LinearLayout linearLayout2, AppCompatTextView appCompatTextView8, Switch r19, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, Switch r22, AppCompatTextView appCompatTextView11, Switch r24, AppCompatTextView appCompatTextView12) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = r72;
        this.D = appCompatTextView2;
        this.E = appCompatTextView3;
        this.F = r10;
        this.G = appCompatTextView4;
        this.H = linearLayout;
        this.I = appCompatTextView5;
        this.J = r14;
        this.K = appCompatTextView6;
        this.L = appCompatTextView7;
        this.M = linearLayout2;
        this.N = appCompatTextView8;
        this.O = r19;
        this.P = appCompatTextView9;
        this.Q = appCompatTextView10;
        this.R = r22;
        this.S = appCompatTextView11;
        this.T = r24;
        this.U = appCompatTextView12;
    }

    public static a7 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static a7 U(View view, Object obj) {
        return (a7) ViewDataBinding.j(obj, view, nd.b1.fragment_push_settings);
    }
}
