package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;

/* loaded from: classes2.dex */
public class r2 extends q2 {

    /* renamed from: e0  reason: collision with root package name */
    public static final ViewDataBinding.i f46496e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final SparseIntArray f46497f0;

    /* renamed from: a0  reason: collision with root package name */
    public final ConstraintLayout f46498a0;

    /* renamed from: b0  reason: collision with root package name */
    public androidx.databinding.g f46499b0;

    /* renamed from: c0  reason: collision with root package name */
    public androidx.databinding.g f46500c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f46501d0;

    /* loaded from: classes2.dex */
    public class a implements androidx.databinding.g {
        public a() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(r2.this.C);
            bd.d dVar = r2.this.Z;
            if (dVar != null) {
                androidx.lifecycle.e0<String> b10 = dVar.b();
                if (b10 != null) {
                    b10.p(a10);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements androidx.databinding.g {
        public b() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(r2.this.K);
            bd.d dVar = r2.this.Z;
            if (dVar != null) {
                androidx.lifecycle.e0<String> a11 = dVar.a();
                if (a11 != null) {
                    a11.p(a10);
                }
            }
        }
    }

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(25);
        f46496e0 = iVar;
        iVar.a(0, new String[]{"view_contract_edit_section"}, new int[]{10}, new int[]{nc.f.view_contract_edit_section});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f46497f0 = sparseIntArray;
        sparseIntArray.put(nc.e.bank_name_text, 11);
        sparseIntArray.put(nc.e.bank_name_select_container, 12);
        sparseIntArray.put(nc.e.bank_select_arrow, 13);
        sparseIntArray.put(nc.e.bank_name_divider, 14);
        sparseIntArray.put(nc.e.bank_account_type_text, 15);
        sparseIntArray.put(nc.e.bank_account_type_select, 16);
        sparseIntArray.put(nc.e.bank_account_type_divider, 17);
        sparseIntArray.put(nc.e.bank_account_branch_code_divider, 18);
        sparseIntArray.put(nc.e.bank_account_number_divider, 19);
        sparseIntArray.put(nc.e.bank_account_name_divider, 20);
        sparseIntArray.put(nc.e.bank_account_caption_divider, 21);
        sparseIntArray.put(nc.e.bottom_background, 22);
        sparseIntArray.put(nc.e.japan_postal_bank_caption, 23);
        sparseIntArray.put(nc.e.caption_arrow, 24);
    }

    public r2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 25, f46496e0, f46497f0));
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
                            return W((androidx.lifecycle.e0) obj, i11);
                        }
                        return V((androidx.lifecycle.e0) obj, i11);
                    }
                    return X((androidx.lifecycle.e0) obj, i11);
                }
                return Y((LiveData) obj, i11);
            }
            return U((w2) obj, i11);
        }
        return Z((LiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M(androidx.lifecycle.u uVar) {
        super.M(uVar);
        this.U.M(uVar);
    }

    @Override // pc.q2
    public void T(bd.d dVar) {
        this.Z = dVar;
        synchronized (this) {
            this.f46501d0 |= 64;
        }
        c(nc.a.f41788b);
        super.H();
    }

    public final boolean U(w2 w2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46501d0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46501d0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46501d0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46501d0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(LiveData<Float> liveData, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46501d0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(LiveData<Boolean> liveData, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46501d0 |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.appcompat.widget.AppCompatTextView, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v19, types: [androidx.appcompat.widget.AppCompatTextView, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.r2.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.f46501d0 != 0) {
                return true;
            }
            return this.U.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f46501d0 = 128L;
        }
        this.U.y();
        H();
    }

    public r2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 6, (View) objArr[18], (AppCompatEditText) objArr[4], (AppCompatTextView) objArr[3], (View) objArr[21], (AppCompatTextView) objArr[9], (View) objArr[20], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7], (View) objArr[19], (AppCompatEditText) objArr[6], (AppCompatTextView) objArr[5], (View) objArr[17], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[15], (View) objArr[14], (AppCompatTextView) objArr[1], (FrameLayout) objArr[12], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[11], (w2) objArr[10], (AppCompatImageView) objArr[13], (View) objArr[22], (AppCompatImageView) objArr[24], (AppCompatTextView) objArr[23]);
        this.f46499b0 = new a();
        this.f46500c0 = new b();
        this.f46501d0 = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.Q.setTag(null);
        this.S.setTag(null);
        L(this.U);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f46498a0 = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
