package ae;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class a1 extends z0 {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final AppCompatImageView S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(nd.z0.Ue, 7);
        sparseIntArray.put(nd.z0.send_score_text_view, 8);
        sparseIntArray.put(nd.z0.score_edit_text_container, 9);
        sparseIntArray.put(nd.z0.score_edit_text, 10);
        sparseIntArray.put(nd.z0.score_edit_text_border_view, 11);
        sparseIntArray.put(nd.z0.E1, 12);
        sparseIntArray.put(nd.z0.Nc, 13);
        sparseIntArray.put(nd.z0.description_1_text_view, 14);
        sparseIntArray.put(nd.z0.description_2_text_view, 15);
        sparseIntArray.put(nd.z0.A1, 16);
    }

    public a1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 17, U, V));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return false;
                            }
                            return Z((androidx.lifecycle.e0) obj, i11);
                        }
                        return W((androidx.lifecycle.e0) obj, i11);
                    }
                    return X((androidx.lifecycle.e0) obj, i11);
                }
                return Y((androidx.lifecycle.e0) obj, i11);
            }
            return V((androidx.lifecycle.e0) obj, i11);
        }
        return U((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.z0
    public void T(ud.e0 e0Var) {
        this.R = e0Var;
        synchronized (this) {
            this.T |= 64;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.T |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.T |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.T |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.T |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.T |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.T |= 32;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.a1.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.T != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.T = 128L;
        }
        H();
    }

    public a1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 6, (AppCompatImageView) objArr[16], (AppCompatImageView) objArr[12], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[15], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[6], (EditText) objArr[10], (View) objArr[11], (ConstraintLayout) objArr[9], (AppCompatTextView) objArr[2], (ConstraintLayout) objArr[4], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7]);
        this.T = -1L;
        this.D.setTag(null);
        this.G.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[5];
        this.S = appCompatImageView;
        appCompatImageView.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        N(view);
        y();
    }
}
