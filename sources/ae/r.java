package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class r extends q {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final RelativeLayout E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        G = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.add_user, 2);
        sparseIntArray.put(nd.z0.users, 3);
    }

    public r(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return T((e8) obj, i11);
    }

    public final boolean T(e8 e8Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.n(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return this.C.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 2L;
        }
        this.C.y();
        H();
    }

    public r(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatTextView) objArr[2], (e8) objArr[1], (ListView) objArr[3]);
        this.F = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.E = relativeLayout;
        relativeLayout.setTag(null);
        L(this.C);
        N(view);
        y();
    }
}
