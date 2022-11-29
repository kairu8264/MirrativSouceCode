package ac;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.MutualFolloweeView;
import com.dena.mirrorman.customview.UserProfileYellStatusConditionView;

/* loaded from: classes2.dex */
public class m2 extends l2 {

    /* renamed from: m0  reason: collision with root package name */
    public static final ViewDataBinding.i f938m0 = null;

    /* renamed from: n0  reason: collision with root package name */
    public static final SparseIntArray f939n0;

    /* renamed from: k0  reason: collision with root package name */
    public final AppCompatImageView f940k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f941l0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f939n0 = sparseIntArray;
        sparseIntArray.put(xb.o.matching_start_lottie_animation_view, 27);
        sparseIntArray.put(xb.o.f59996ja, 28);
        sparseIntArray.put(xb.o.f60000ka, 29);
        sparseIntArray.put(xb.o.f59977d0, 30);
        sparseIntArray.put(xb.o.f60024q1, 31);
        sparseIntArray.put(xb.o.yell_condition_view, 32);
        sparseIntArray.put(xb.o.B0, 33);
        sparseIntArray.put(xb.o.moderator_help_button_image_view, 34);
    }

    public m2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 35, f938m0, f939n0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return U((ud.x4) obj, i11);
    }

    @Override // ac.l2
    public void T(ud.x4 x4Var) {
        R(0, x4Var);
        this.f911j0 = x4Var;
        synchronized (this) {
            this.f941l0 |= 1;
        }
        c(xb.b.f59841d);
        super.H();
    }

    public final boolean U(ud.x4 x4Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.f941l0 |= 1;
            }
            return true;
        } else if (i10 == xb.b.f59840c) {
            synchronized (this) {
                this.f941l0 |= 2;
            }
            return true;
        } else if (i10 == xb.b.f59839b) {
            synchronized (this) {
                this.f941l0 |= 4;
            }
            return true;
        } else if (i10 == xb.b.f59845h) {
            synchronized (this) {
                this.f941l0 |= 8;
            }
            return true;
        } else if (i10 == xb.b.f59847j) {
            synchronized (this) {
                this.f941l0 |= 16;
            }
            return true;
        } else if (i10 == xb.b.f59858u) {
            synchronized (this) {
                this.f941l0 |= 32;
            }
            return true;
        } else if (i10 == xb.b.f59846i) {
            synchronized (this) {
                this.f941l0 |= 64;
            }
            return true;
        } else if (i10 == xb.b.f59859v) {
            synchronized (this) {
                this.f941l0 |= 128;
            }
            return true;
        } else if (i10 == xb.b.G) {
            synchronized (this) {
                this.f941l0 |= 256;
            }
            return true;
        } else if (i10 == xb.b.f59857t) {
            synchronized (this) {
                this.f941l0 |= 512;
            }
            return true;
        } else if (i10 == xb.b.F) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else if (i10 == xb.b.f59855r) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        } else if (i10 == xb.b.f59854q) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        } else if (i10 == xb.b.f59844g) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        } else if (i10 == xb.b.C) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        } else if (i10 == xb.b.B) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        } else if (i10 == xb.b.E) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        } else if (i10 == xb.b.A) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        } else if (i10 == xb.b.f59848k) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        } else if (i10 == xb.b.f59863z) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        } else if (i10 == xb.b.D) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        } else if (i10 == xb.b.f59842e) {
            synchronized (this) {
                this.f941l0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        } else if (i10 == xb.b.f59861x) {
            synchronized (this) {
                this.f941l0 |= 4194304;
            }
            return true;
        } else if (i10 == xb.b.f59843f) {
            synchronized (this) {
                this.f941l0 |= 8388608;
            }
            return true;
        } else if (i10 == xb.b.f59862y) {
            synchronized (this) {
                this.f941l0 |= 16777216;
            }
            return true;
        } else if (i10 == xb.b.f59856s) {
            synchronized (this) {
                this.f941l0 |= 33554432;
            }
            return true;
        } else if (i10 == xb.b.f59860w) {
            synchronized (this) {
                this.f941l0 |= 67108864;
            }
            return true;
        } else if (i10 == xb.b.f59850m) {
            synchronized (this) {
                this.f941l0 |= 134217728;
            }
            return true;
        } else if (i10 == xb.b.f59853p) {
            synchronized (this) {
                this.f941l0 |= 268435456;
            }
            return true;
        } else if (i10 == xb.b.f59851n) {
            synchronized (this) {
                this.f941l0 |= 536870912;
            }
            return true;
        } else if (i10 == xb.b.f59852o) {
            synchronized (this) {
                this.f941l0 |= 1073741824;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        long j11;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        boolean z19;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str6;
        String str7;
        Integer num5;
        String str8;
        String str9;
        String str10;
        synchronized (this) {
            j10 = this.f941l0;
            this.f941l0 = 0L;
        }
        ud.x4 x4Var = this.f911j0;
        boolean z20 = false;
        r45 = 0;
        int i13 = 0;
        Integer num6 = null;
        if ((4294967295L & j10) != 0) {
            i11 = ((j10 & 2147614721L) == 0 || x4Var == null) ? 0 : x4Var.B();
            z10 = ((j10 & 2151677953L) == 0 || x4Var == null) ? false : x4Var.y();
            String h10 = ((j10 & 2155872257L) == 0 || x4Var == null) ? null : x4Var.h();
            Integer D = ((j10 & 2147500033L) == 0 || x4Var == null) ? null : x4Var.D();
            z11 = ((j10 & 2147483713L) == 0 || x4Var == null) ? false : x4Var.k();
            z12 = ((j10 & 2164260865L) == 0 || x4Var == null) ? false : x4Var.z();
            z13 = ((j10 & 2147745793L) == 0 || x4Var == null) ? false : x4Var.m();
            Integer p10 = ((j10 & 3221225473L) == 0 || x4Var == null) ? null : x4Var.p();
            z14 = ((j10 & 2148532225L) == 0 || x4Var == null) ? false : x4Var.E();
            z15 = ((j10 & 2148007937L) == 0 || x4Var == null) ? false : x4Var.A();
            String v10 = ((j10 & 2147483681L) == 0 || x4Var == null) ? null : x4Var.v();
            String u10 = ((j10 & 2147484161L) == 0 || x4Var == null) ? null : x4Var.u();
            String s10 = ((j10 & 2147485697L) == 0 || x4Var == null) ? null : x4Var.s();
            long t10 = ((j10 & 2181038081L) == 0 || x4Var == null) ? 0L : x4Var.t();
            String g10 = ((j10 & 2149580801L) == 0 || x4Var == null) ? null : x4Var.g();
            String i14 = ((j10 & 2147491841L) == 0 || x4Var == null) ? null : x4Var.i();
            String f10 = ((j10 & 2147483651L) == 0 || x4Var == null) ? null : x4Var.f();
            z16 = ((j10 & 2147549185L) == 0 || x4Var == null) ? false : x4Var.F();
            z17 = ((j10 & 2147516417L) == 0 || x4Var == null) ? false : x4Var.C();
            Integer q10 = ((j10 & 2415919105L) == 0 || x4Var == null) ? null : x4Var.q();
            z18 = ((j10 & 2147484673L) == 0 || x4Var == null) ? false : x4Var.G();
            i12 = ((j10 & 2147483657L) == 0 || x4Var == null) ? 0 : x4Var.j();
            boolean x10 = ((j10 & 2214592513L) == 0 || x4Var == null) ? false : x4Var.x();
            String o10 = ((j10 & 2684354561L) == 0 || x4Var == null) ? null : x4Var.o();
            String e10 = ((j10 & 2147483653L) == 0 || x4Var == null) ? null : x4Var.e();
            z19 = ((j10 & 2147483905L) == 0 || x4Var == null) ? false : x4Var.H();
            String w10 = ((j10 & 2147483777L) == 0 || x4Var == null) ? null : x4Var.w();
            Integer n10 = ((j10 & 2281701377L) == 0 || x4Var == null) ? null : x4Var.n();
            if ((j10 & 2147483665L) != 0 && x4Var != null) {
                i13 = x4Var.l();
            }
            if ((j10 & 2147487745L) != 0 && x4Var != null) {
                num6 = x4Var.r();
            }
            i10 = i13;
            num4 = num6;
            str2 = h10;
            num = D;
            num5 = p10;
            str9 = v10;
            str8 = u10;
            str6 = s10;
            str = g10;
            str5 = i14;
            str4 = f10;
            num2 = q10;
            z20 = x10;
            str7 = o10;
            str3 = e10;
            str10 = w10;
            num3 = n10;
            j11 = t10;
        } else {
            j11 = 0;
            i10 = 0;
            i11 = 0;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = false;
            z18 = false;
            i12 = 0;
            z19 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            num = null;
            num2 = null;
            num3 = null;
            num4 = null;
            str6 = null;
            str7 = null;
            num5 = null;
            str8 = null;
            str9 = null;
            str10 = null;
        }
        if ((j10 & 2214592513L) != 0) {
            td.c.e(this.B, Boolean.valueOf(z20));
        }
        if ((j10 & 2147483653L) != 0) {
            td.a.f(this.C, str3);
        }
        if ((j10 & 2147483651L) != 0) {
            AppCompatImageView appCompatImageView = this.D;
            td.a.G(appCompatImageView, str4, f.a.b(appCompatImageView.getContext(), xb.n.T0), Boolean.TRUE);
        }
        if ((j10 & 2149580801L) != 0) {
            x3.e.c(this.F, str);
        }
        if ((j10 & 2151677953L) != 0) {
            td.c.e(this.F, Boolean.valueOf(z10));
        }
        if ((j10 & 2155872257L) != 0) {
            x3.e.c(this.G, str2);
        }
        if ((j10 & 2164260865L) != 0) {
            td.c.e(this.G, Boolean.valueOf(z12));
        }
        if ((j10 & 2148007937L) != 0) {
            td.c.e(this.H, Boolean.valueOf(z15));
        }
        if ((j10 & 2147491841L) != 0) {
            td.a.f(this.K, str5);
        }
        if ((j10 & 2147614721L) != 0) {
            this.L.setVisibility(i11);
            this.M.setVisibility(i11);
        }
        if ((j10 & 2147745793L) != 0) {
            yd.m.a(this.L, Boolean.valueOf(z13));
        }
        if ((j10 & 2147483665L) != 0) {
            yd.k.a(this.N, Integer.valueOf(i10));
        }
        if ((2147483657L & j10) != 0) {
            yd.k.a(this.O, Integer.valueOf(i12));
        }
        if ((j10 & 2147500033L) != 0) {
            td.a.E(this.f940k0, num);
        }
        if ((2147516417L & j10) != 0) {
            td.c.e(this.f940k0, Boolean.valueOf(z17));
        }
        if ((2415919105L & j10) != 0) {
            td.a.F(this.Q, num2);
        }
        if ((2281701377L & j10) != 0) {
            td.c.a(this.R, num3);
        }
        if ((2148532225L & j10) != 0) {
            td.c.e(this.T, Boolean.valueOf(z14));
        }
        if ((2147549185L & j10) != 0) {
            td.c.e(this.U, Boolean.valueOf(z16));
        }
        if ((2147487745L & j10) != 0) {
            td.c.a(this.V, num4);
        }
        if ((2147485697L & j10) != 0) {
            td.a.i(this.W, str6);
        }
        if ((2684354561L & j10) != 0) {
            x3.e.c(this.X, str7);
        }
        if ((j10 & 3221225473L) != 0) {
            td.b.g(this.X, num5);
        }
        if ((2181038081L & j10) != 0) {
            td.b.e(this.Y, Long.valueOf(j11));
        }
        if ((2147484161L & j10) != 0) {
            td.a.f(this.Z, str8);
        }
        if ((2147484673L & j10) != 0) {
            td.c.e(this.Z, Boolean.valueOf(z18));
            td.c.e(this.f902a0, Boolean.valueOf(z18));
        }
        if ((2147483905L & j10) != 0) {
            td.c.e(this.f904c0, Boolean.valueOf(z19));
        }
        if ((j10 & 2147483713L) != 0) {
            td.c.e(this.f905d0, Boolean.valueOf(z11));
        }
        if ((2147483681L & j10) != 0) {
            td.b.k(this.f906e0, str9);
        }
        if ((j10 & 2147483777L) != 0) {
            x3.e.c(this.f907f0, str10);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f941l0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f941l0 = 2147483648L;
        }
        H();
    }

    public m2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (RecyclerView) objArr[23], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (View) objArr[30], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[20], (ConstraintLayout) objArr[17], (Space) objArr[33], (AppCompatImageView) objArr[31], (AppCompatImageView) objArr[12], (FollowView) objArr[16], (Space) objArr[15], (FollowTextView) objArr[4], (FollowTextView) objArr[3], (LottieAnimationView) objArr[27], (AppCompatImageView) objArr[25], (ConstraintLayout) objArr[24], (AppCompatImageView) objArr[34], (MutualFolloweeView) objArr[18], (AppCompatImageView) objArr[14], (View) objArr[11], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[26], (AppCompatTextView) objArr[21], (AppCompatImageView) objArr[9], (RecyclerView) objArr[22], (ScrollView) objArr[0], (AppCompatImageView) objArr[8], (FollowsYouView) objArr[6], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[7], (Guideline) objArr[28], (Guideline) objArr[29], (UserProfileYellStatusConditionView) objArr[32]);
        this.f941l0 = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[13];
        this.f940k0 = appCompatImageView;
        appCompatImageView.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.T.setTag(null);
        this.U.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.f902a0.setTag(null);
        this.f903b0.setTag(null);
        this.f904c0.setTag(null);
        this.f905d0.setTag(null);
        this.f906e0.setTag(null);
        this.f907f0.setTag(null);
        N(view);
        y();
    }
}
