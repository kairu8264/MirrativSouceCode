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
import com.dena.mirrativ.customview.LoadingMirrabitView;
import com.dena.mirrorman.customview.JoinLineMultiView;
import com.dena.mirrorman.customview.StreamerAppUserIdView;
import com.dena.mirrorman.customview.StreamerProfileSummaryView;

/* loaded from: classes2.dex */
public class r0 extends q0 {

    /* renamed from: h0  reason: collision with root package name */
    public static final ViewDataBinding.i f1472h0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public static final SparseIntArray f1473i0;

    /* renamed from: a0  reason: collision with root package name */
    public final ConstraintLayout f1474a0;

    /* renamed from: b0  reason: collision with root package name */
    public final View f1475b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ProgressBar f1476c0;

    /* renamed from: d0  reason: collision with root package name */
    public final ConstraintLayout f1477d0;

    /* renamed from: e0  reason: collision with root package name */
    public final ConstraintLayout f1478e0;

    /* renamed from: f0  reason: collision with root package name */
    public androidx.databinding.g f1479f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f1480g0;

    /* loaded from: classes2.dex */
    public class a implements androidx.databinding.g {
        public a() {
        }

        @Override // androidx.databinding.g
        public void a() {
            String a10 = x3.e.a(r0.this.D);
            ud.j jVar = r0.this.Z;
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
        f1473i0 = sparseIntArray;
        sparseIntArray.put(nd.z0.mode_container_portrait, 23);
        sparseIntArray.put(nd.z0.edit_app_user_id_text_view, 24);
        sparseIntArray.put(nd.z0.edit_app_user_id_touchable_view, 25);
        sparseIntArray.put(nd.z0.A1, 26);
    }

    public r0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 27, f1472h0, f1473i0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return V((androidx.lifecycle.e0) obj, i11);
            case 3:
                return p0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return z0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return X((androidx.lifecycle.e0) obj, i11);
            case 6:
                return U((androidx.lifecycle.e0) obj, i11);
            case 7:
                return W((androidx.lifecycle.e0) obj, i11);
            case 8:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 9:
                return j0((androidx.lifecycle.e0) obj, i11);
            case 10:
                return t0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 12:
                return o0((androidx.lifecycle.e0) obj, i11);
            case 13:
                return y0((androidx.lifecycle.e0) obj, i11);
            case 14:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 15:
                return w0((androidx.lifecycle.e0) obj, i11);
            case 16:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 17:
                return v0((androidx.lifecycle.e0) obj, i11);
            case 18:
                return k0((androidx.lifecycle.e0) obj, i11);
            case 19:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 20:
                return q0((androidx.lifecycle.e0) obj, i11);
            case 21:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 22:
                return m0((androidx.lifecycle.e0) obj, i11);
            case 23:
                return s0((androidx.lifecycle.e0) obj, i11);
            case 24:
                return u0((androidx.lifecycle.e0) obj, i11);
            case 25:
                return l0((androidx.lifecycle.e0) obj, i11);
            case 26:
                return r0((androidx.lifecycle.e0) obj, i11);
            case 27:
                return n0((androidx.lifecycle.e0) obj, i11);
            case 28:
                return x0((androidx.lifecycle.e0) obj, i11);
            case 29:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 30:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 31:
                return Z((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.q0
    public void T(ud.j jVar) {
        this.Z = jVar;
        synchronized (this) {
            this.f1480g0 |= 4294967296L;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 2147483648L;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 1073741824;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 536870912;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean k0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 1978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.r0.l():void");
    }

    public final boolean l0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 33554432;
            }
            return true;
        }
        return false;
    }

    public final boolean m0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 4194304;
            }
            return true;
        }
        return false;
    }

    public final boolean n0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 134217728;
            }
            return true;
        }
        return false;
    }

    public final boolean o0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    public final boolean p0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean q0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean r0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 67108864;
            }
            return true;
        }
        return false;
    }

    public final boolean s0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 8388608;
            }
            return true;
        }
        return false;
    }

    public final boolean t0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean u0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 16777216;
            }
            return true;
        }
        return false;
    }

    public final boolean v0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1480g0 != 0;
        }
    }

    public final boolean w0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean x0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 268435456;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1480g0 = 8589934592L;
        }
        H();
    }

    public final boolean y0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean z0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1480g0 |= 16;
            }
            return true;
        }
        return false;
    }

    public r0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 32, (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[5], (EditText) objArr[6], (AppCompatImageView) objArr[26], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[14], (View) objArr[15], (AppCompatTextView) objArr[24], (View) objArr[25], (AppCompatImageView) objArr[21], (JoinLineMultiView) objArr[18], (AppCompatTextView) objArr[4], (LoadingMirrabitView) objArr[22], null, null, (FrameLayout) objArr[23], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[8], (StreamerAppUserIdView) objArr[17], (StreamerProfileSummaryView) objArr[16], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[11]);
        this.f1479f0 = new a();
        this.f1480g0 = -1L;
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
        this.O.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f1474a0 = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArr[19];
        this.f1475b0 = view2;
        view2.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[20];
        this.f1476c0 = progressBar;
        progressBar.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[3];
        this.f1477d0 = constraintLayout2;
        constraintLayout2.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[9];
        this.f1478e0 = constraintLayout3;
        constraintLayout3.setTag(null);
        this.S.setTag(null);
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
