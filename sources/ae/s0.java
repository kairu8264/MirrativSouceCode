package ae;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.JoinLineMultiView;
import com.dena.mirrorman.customview.StreamerAppUserIdView;
import com.dena.mirrorman.customview.StreamerProfileSummaryView;

/* loaded from: classes2.dex */
public class s0 extends q0 {

    /* renamed from: j0  reason: collision with root package name */
    public static final ViewDataBinding.i f1491j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public static final SparseIntArray f1492k0;

    /* renamed from: a0  reason: collision with root package name */
    public final ConstraintLayout f1493a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ConstraintLayout f1494b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ConstraintLayout f1495c0;

    /* renamed from: d0  reason: collision with root package name */
    public final View f1496d0;

    /* renamed from: e0  reason: collision with root package name */
    public final ProgressBar f1497e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ConstraintLayout f1498f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ConstraintLayout f1499g0;

    /* renamed from: h0  reason: collision with root package name */
    public androidx.databinding.g f1500h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f1501i0;

    /* loaded from: classes2.dex */
    public class a implements androidx.databinding.g {
        public a() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(s0.this.D);
            ud.j jVar = s0.this.Z;
            if (jVar != null) {
                androidx.lifecycle.e0<String> p10 = jVar.p();
                if (p10 != null) {
                    p10.p(a10);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1492k0 = sparseIntArray;
        sparseIntArray.put(nd.z0.mode_container_landscape, 23);
        sparseIntArray.put(nd.z0.edit_app_user_id_text_view, 24);
        sparseIntArray.put(nd.z0.edit_app_user_id_touchable_view, 25);
        sparseIntArray.put(nd.z0.mode_container2_landscape, 26);
        sparseIntArray.put(nd.z0.A1, 27);
    }

    public s0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 28, f1491j0, f1492k0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return V((androidx.lifecycle.e0) obj, i11);
            case 4:
                return l0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return u0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return o0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return p0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return U((androidx.lifecycle.e0) obj, i11);
            case 9:
                return W((androidx.lifecycle.e0) obj, i11);
            case 10:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 12:
                return n0((androidx.lifecycle.e0) obj, i11);
            case 13:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 14:
                return j0((androidx.lifecycle.e0) obj, i11);
            case 15:
                return s0((androidx.lifecycle.e0) obj, i11);
            case 16:
                return k0((androidx.lifecycle.e0) obj, i11);
            case 17:
                return t0((androidx.lifecycle.e0) obj, i11);
            case 18:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 19:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 20:
                return r0((androidx.lifecycle.e0) obj, i11);
            case 21:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 22:
                return q0((androidx.lifecycle.e0) obj, i11);
            case 23:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 24:
                return X((androidx.lifecycle.e0) obj, i11);
            case 25:
                return m0((androidx.lifecycle.e0) obj, i11);
            case 26:
                return c0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.q0
    public void T(ud.j jVar) {
        this.Z = jVar;
        synchronized (this) {
            this.f1501i0 |= 134217728;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 16777216;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 8388608;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 67108864;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean k0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0140  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 1579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.s0.l():void");
    }

    public final boolean l0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean m0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 33554432;
            }
            return true;
        }
        return false;
    }

    public final boolean n0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    public final boolean o0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean p0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean q0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 4194304;
            }
            return true;
        }
        return false;
    }

    public final boolean r0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean s0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean t0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean u0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1501i0 |= 32;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1501i0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1501i0 = 268435456L;
        }
        H();
    }

    public s0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 27, (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[5], (EditText) objArr[6], (AppCompatImageView) objArr[27], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[15], (View) objArr[16], (AppCompatTextView) objArr[24], (View) objArr[25], (AppCompatImageView) objArr[22], (JoinLineMultiView) objArr[19], (AppCompatTextView) objArr[4], null, (FrameLayout) objArr[26], (FrameLayout) objArr[23], null, null, (AppCompatTextView) objArr[11], (StreamerAppUserIdView) objArr[18], (StreamerProfileSummaryView) objArr[17], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[9]);
        this.f1500h0 = new a();
        this.f1501i0 = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f1493a0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[10];
        this.f1494b0 = constraintLayout2;
        constraintLayout2.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[12];
        this.f1495c0 = constraintLayout3;
        constraintLayout3.setTag(null);
        View view2 = (View) objArr[20];
        this.f1496d0 = view2;
        view2.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[21];
        this.f1497e0 = progressBar;
        progressBar.setTag(null);
        ConstraintLayout constraintLayout4 = (ConstraintLayout) objArr[3];
        this.f1498f0 = constraintLayout4;
        constraintLayout4.setTag(null);
        ConstraintLayout constraintLayout5 = (ConstraintLayout) objArr[7];
        this.f1499g0 = constraintLayout5;
        constraintLayout5.setTag(null);
        this.T.setTag(null);
        this.U.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        N(view);
        y();
    }
}
