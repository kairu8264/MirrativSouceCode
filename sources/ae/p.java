package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class p extends o {
    public static final ViewDataBinding.i L;
    public static final SparseIntArray M;
    public final RelativeLayout J;
    public long K;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        L = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.f42367xc, 2);
        sparseIntArray.put(nd.z0.search_field, 3);
        sparseIntArray.put(nd.z0.footer, 4);
        sparseIntArray.put(nd.z0.invited_users, 5);
        sparseIntArray.put(nd.z0.submit, 6);
        sparseIntArray.put(nd.z0.candidates, 7);
        sparseIntArray.put(nd.z0.empty, 8);
    }

    public p(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
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
                this.K |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
        ViewDataBinding.n(this.I);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return this.I.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 2L;
        }
        this.I.y();
        H();
    }

    public p(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (ListView) objArr[7], (AppCompatTextView) objArr[8], (LinearLayout) objArr[4], (RecyclerView) objArr[5], (LinearLayout) objArr[2], (EditText) objArr[3], (AppCompatTextView) objArr[6], (e8) objArr[1]);
        this.K = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        L(this.I);
        N(view);
        y();
    }
}
