package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class f6 extends e6 {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public final ConstraintLayout T;
    public androidx.databinding.g U;
    public long V;

    /* loaded from: classes2.dex */
    public class a implements androidx.databinding.g {
        public a() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(f6.this.M);
            ud.n nVar = f6.this.S;
            if (nVar != null) {
                androidx.lifecycle.e0<String> l10 = nVar.l();
                if (l10 != null) {
                    l10.p(a10);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(nd.z0.choose_your_favorite_game_image_view, 7);
        sparseIntArray.put(nd.z0.f42364w9, 8);
        sparseIntArray.put(nd.z0.f42377zc, 9);
        sparseIntArray.put(nd.z0.search_icon_image_view, 10);
        sparseIntArray.put(nd.z0.search_box_right_margin, 11);
        sparseIntArray.put(nd.z0.E3, 12);
        sparseIntArray.put(nd.z0.apps_recycler_view, 13);
        sparseIntArray.put(nd.z0.empty_image_view, 14);
        sparseIntArray.put(nd.z0.empty_text_view, 15);
        sparseIntArray.put(nd.z0.f42268be, 16);
        sparseIntArray.put(nd.z0.Ye, 17);
    }

    public f6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 18, W, X));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 2:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 3:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return W((androidx.lifecycle.e0) obj, i11);
            case 6:
                return X((androidx.lifecycle.e0) obj, i11);
            case 7:
                return d0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.e6
    public void V(ud.n nVar) {
        this.S = nVar;
        synchronized (this) {
            this.V |= 256;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.V |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.V |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.V |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.V |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.V |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.V |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.V |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.V |= 128;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.f6.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.V != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.V = 512L;
        }
        H();
    }

    public f6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 8, (RecyclerView) objArr[13], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[7], (View) objArr[12], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[14], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[8], (Space) objArr[11], (ConstraintLayout) objArr[9], (EditText) objArr[1], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[5], (StatusView) objArr[16], (AppCompatButton) objArr[6], (ConstraintLayout) objArr[17]);
        this.U = new a();
        this.V = -1L;
        this.C.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T = constraintLayout;
        constraintLayout.setTag(null);
        this.M.setTag(null);
        this.O.setTag(null);
        this.Q.setTag(null);
        N(view);
        y();
    }
}
