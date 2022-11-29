package pc;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;

/* loaded from: classes2.dex */
public class v2 extends u2 {

    /* renamed from: d0  reason: collision with root package name */
    public static final ViewDataBinding.i f46504d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final SparseIntArray f46505e0;
    public final ConstraintLayout V;
    public androidx.databinding.g W;
    public androidx.databinding.g X;
    public androidx.databinding.g Y;
    public androidx.databinding.g Z;

    /* renamed from: a0  reason: collision with root package name */
    public androidx.databinding.g f46506a0;

    /* renamed from: b0  reason: collision with root package name */
    public androidx.databinding.g f46507b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f46508c0;

    /* loaded from: classes2.dex */
    public class a implements androidx.databinding.g {
        public a() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(v2.this.B);
            bd.e eVar = v2.this.U;
            if (eVar != null) {
                androidx.lifecycle.e0<String> e10 = eVar.e();
                if (e10 != null) {
                    e10.p(a10);
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
            String a10 = x3.e.a(v2.this.H);
            bd.e eVar = v2.this.U;
            if (eVar != null) {
                androidx.lifecycle.e0<String> h10 = eVar.h();
                if (h10 != null) {
                    h10.p(a10);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements androidx.databinding.g {
        public c() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(v2.this.I);
            bd.e eVar = v2.this.U;
            if (eVar != null) {
                androidx.lifecycle.e0<String> i10 = eVar.i();
                if (i10 != null) {
                    i10.p(a10);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements androidx.databinding.g {
        public d() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(v2.this.L);
            bd.e eVar = v2.this.U;
            if (eVar != null) {
                androidx.lifecycle.e0<String> l10 = eVar.l();
                if (l10 != null) {
                    l10.p(a10);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements androidx.databinding.g {
        public e() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(v2.this.N);
            bd.e eVar = v2.this.U;
            if (eVar != null) {
                androidx.lifecycle.e0<String> j10 = eVar.j();
                if (j10 != null) {
                    j10.p(a10);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements androidx.databinding.g {
        public f() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(v2.this.O);
            bd.e eVar = v2.this.U;
            if (eVar != null) {
                androidx.lifecycle.e0<String> k10 = eVar.k();
                if (k10 != null) {
                    k10.p(a10);
                }
            }
        }
    }

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(20);
        f46504d0 = iVar;
        int i10 = nc.f.view_contract_edit_section;
        iVar.a(0, new String[]{"view_contract_edit_section", "view_contract_edit_section", "view_contract_edit_section"}, new int[]{9, 10, 11}, new int[]{i10, i10, i10});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f46505e0 = sparseIntArray;
        sparseIntArray.put(nc.e.last_name_kanji_text, 12);
        sparseIntArray.put(nc.e.first_name_kanji_text, 13);
        sparseIntArray.put(nc.e.last_name_text, 14);
        sparseIntArray.put(nc.e.first_name_text, 15);
        sparseIntArray.put(nc.e.name_caption_text, 16);
        sparseIntArray.put(nc.e.select_birthday_container, 17);
        sparseIntArray.put(nc.e.first_postal_code_text, 18);
        sparseIntArray.put(nc.e.address_text, 19);
    }

    public v2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 20, f46504d0, f46505e0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return e0((w2) obj, i11);
            case 2:
                return W((LiveData) obj, i11);
            case 3:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return X((androidx.lifecycle.e0) obj, i11);
            case 5:
                return d0((w2) obj, i11);
            case 6:
                return V((androidx.lifecycle.e0) obj, i11);
            case 7:
                return Z((LiveData) obj, i11);
            case 8:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 9:
                return U((w2) obj, i11);
            case 10:
                return Y((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M(androidx.lifecycle.u uVar) {
        super.M(uVar);
        this.S.M(uVar);
        this.F.M(uVar);
        this.C.M(uVar);
    }

    @Override // pc.u2
    public void T(bd.e eVar) {
        this.U = eVar;
        synchronized (this) {
            this.f46508c0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        c(nc.a.f41788b);
        super.H();
    }

    public final boolean U(w2 w2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean W(LiveData<String> liveData, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(LiveData<Boolean> liveData, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(w2 w2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(w2 w2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46508c0 |= 2;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0122  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.v2.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.f46508c0 != 0) {
                return true;
            }
            return this.S.w() || this.F.w() || this.C.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f46508c0 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        this.S.y();
        this.F.y();
        this.C.y();
        H();
    }

    public v2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 11, (EditText) objArr[8], (w2) objArr[11], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[6], (w2) objArr[10], (AppCompatTextView) objArr[5], (EditText) objArr[4], (EditText) objArr[2], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[15], (EditText) objArr[7], (AppCompatTextView) objArr[18], (EditText) objArr[3], (EditText) objArr[1], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[16], (w2) objArr[9], (FrameLayout) objArr[17]);
        this.W = new a();
        this.X = new b();
        this.Y = new c();
        this.Z = new d();
        this.f46506a0 = new e();
        this.f46507b0 = new f();
        this.f46508c0 = -1L;
        this.B.setTag(null);
        L(this.C);
        this.E.setTag(null);
        L(this.F);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.L.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.V = constraintLayout;
        constraintLayout.setTag(null);
        L(this.S);
        N(view);
        y();
    }
}
