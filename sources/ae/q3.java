package ae;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public class q3 extends p3 {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public final ConstraintLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(nd.z0.A1, 7);
        sparseIntArray.put(nd.z0.Ue, 8);
        sparseIntArray.put(nd.z0.f42377zc, 9);
        sparseIntArray.put(nd.z0.f42299j4, 10);
        sparseIntArray.put(nd.z0.f42348u, 11);
        sparseIntArray.put(nd.z0.f42268be, 12);
        sparseIntArray.put(nd.z0.O0, 13);
        sparseIntArray.put(nd.z0.edit_user_id_text_view_container, 14);
        sparseIntArray.put(nd.z0.bottom_arrow_image_view, 15);
        sparseIntArray.put(nd.z0.register_id_button_text_view, 16);
        sparseIntArray.put(nd.z0.add_user_id_appeal_card_view, 17);
    }

    public q3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 18, V, W));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return W((androidx.lifecycle.e0) obj, i11);
            case 1:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 2:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 6:
                return X((androidx.lifecycle.e0) obj, i11);
            case 7:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return a0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.p3
    public void V(ud.h hVar) {
        this.S = hVar;
        synchronized (this) {
            this.U |= 512;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<SpannableStringBuilder> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.U |= 8;
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
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.q3.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.U != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.U = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        H();
    }

    public q3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 9, (MaterialCardView) objArr[17], (FrameLayout) objArr[5], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[2], (RecyclerView) objArr[11], (AppCompatImageView) objArr[15], (ConstraintLayout) objArr[13], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[1], (ConstraintLayout) objArr[3], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[14], (EditText) objArr[10], (AppCompatTextView) objArr[16], (LinearLayout) objArr[9], (StatusView) objArr[12], (AppCompatTextView) objArr[8]);
        this.U = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
