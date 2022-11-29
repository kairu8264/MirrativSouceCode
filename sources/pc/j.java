package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class j extends i {
    public static final ViewDataBinding.i I;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(6);
        I = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nc.e.Y6, 2);
        sparseIntArray.put(nc.e.Q5, 3);
        sparseIntArray.put(nc.e.contact_container, 4);
        sparseIntArray.put(nc.e.contact_by_mail_text_view, 5);
    }

    public j(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return T((e8) obj, i11);
    }

    public final boolean T(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.H |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.H = 0L;
        }
        ViewDataBinding.n(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.H != 0) {
                return true;
            }
            return this.E.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 2L;
        }
        this.E.y();
        H();
    }

    public j(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatTextView) objArr[5], (ConstraintLayout) objArr[4], (StatusView) objArr[3], (e8) objArr[1], (WebView) objArr[2]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        L(this.E);
        N(view);
        y();
    }
}
