package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public class l extends k {

    /* renamed from: t0  reason: collision with root package name */
    public static final ViewDataBinding.i f899t0 = null;

    /* renamed from: u0  reason: collision with root package name */
    public static final SparseIntArray f900u0;

    /* renamed from: s0  reason: collision with root package name */
    public long f901s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f900u0 = sparseIntArray;
        sparseIntArray.put(xb.o.G9, 10);
        sparseIntArray.put(xb.o.complete_text_view, 11);
        sparseIntArray.put(xb.o.title_border_view, 12);
        sparseIntArray.put(xb.o.live_memo_container, 13);
        sparseIntArray.put(xb.o.memo_image_view, 14);
        sparseIntArray.put(xb.o.memo_title_text_view, 15);
        sparseIntArray.put(xb.o.f60042v1, 16);
        sparseIntArray.put(xb.o.collab_image_view, 17);
        sparseIntArray.put(xb.o.collab_title_text_view, 18);
        sparseIntArray.put(xb.o.tts_container, 19);
        sparseIntArray.put(xb.o.tts_image_view, 20);
        sparseIntArray.put(xb.o.tts_title_text_view, 21);
        sparseIntArray.put(xb.o.sound_min_image_view, 22);
        sparseIntArray.put(xb.o.sound_max_image_view, 23);
        sparseIntArray.put(xb.o.catalog_emomo_container, 24);
        sparseIntArray.put(xb.o.catalog_emomo_image_view, 25);
        sparseIntArray.put(xb.o.catalog_emomo_title_text_view, 26);
        sparseIntArray.put(xb.o.hide_notification_container, 27);
        sparseIntArray.put(xb.o.hide_notification_image_view, 28);
        sparseIntArray.put(xb.o.hide_notification_title_text_view, 29);
        sparseIntArray.put(xb.o.hide_notification_description_text_view, 30);
        sparseIntArray.put(xb.o.hide_notification_status_text, 31);
        sparseIntArray.put(xb.o.recommend_notification_guard_container, 32);
        sparseIntArray.put(xb.o.notification_guard_card_view, 33);
        sparseIntArray.put(xb.o.notification_guard_text, 34);
        sparseIntArray.put(xb.o.in_game_gift_container, 35);
        sparseIntArray.put(xb.o.in_game_gift_image_view, 36);
        sparseIntArray.put(xb.o.in_game_gift_title_text_view, 37);
        sparseIntArray.put(xb.o.tips_container, 38);
        sparseIntArray.put(xb.o.tips_title_text_view, 39);
        sparseIntArray.put(xb.o.help_container, 40);
        sparseIntArray.put(xb.o.help_title_text_view, 41);
    }

    public l(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 42, f899t0, f900u0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return X((LiveData) obj, i11);
            case 2:
                return c0((androidx.lifecycle.c0) obj, i11);
            case 3:
                return W((androidx.lifecycle.c0) obj, i11);
            case 4:
                return b0((androidx.lifecycle.c0) obj, i11);
            case 5:
                return Y((LiveData) obj, i11);
            case 6:
                return Z((LiveData) obj, i11);
            default:
                return false;
        }
    }

    @Override // ac.k
    public void V(kc.m mVar) {
        this.f898r0 = mVar;
        synchronized (this) {
            this.f901s0 |= 128;
        }
        c(xb.b.f59841d);
        super.H();
    }

    public final boolean W(androidx.lifecycle.c0<String> c0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.f901s0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean X(LiveData<Boolean> liveData, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.f901s0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(LiveData<Boolean> liveData, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.f901s0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(LiveData<Boolean> liveData, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.f901s0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.f901s0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.c0<String> c0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.f901s0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.c0<Integer> c0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.f901s0 |= 4;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.l.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f901s0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f901s0 = 256L;
        }
        H();
    }

    public l(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 7, (ConstraintLayout) objArr[24], (AppCompatImageView) objArr[25], (SwitchCompat) objArr[6], (AppCompatTextView) objArr[26], (ConstraintLayout) objArr[16], (AppCompatImageView) objArr[17], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[18], (AppCompatTextView) objArr[11], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[40], (AppCompatTextView) objArr[41], (ConstraintLayout) objArr[27], (AppCompatTextView) objArr[30], (AppCompatImageView) objArr[28], (SwitchCompat) objArr[7], (AppCompatTextView) objArr[31], (AppCompatTextView) objArr[29], (ConstraintLayout) objArr[35], (AppCompatImageView) objArr[36], (SwitchCompat) objArr[9], (AppCompatTextView) objArr[37], (ConstraintLayout) objArr[13], (EditTextWithOnKeyPreImeListener) objArr[3], (AppCompatImageView) objArr[14], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[8], (MaterialCardView) objArr[33], (AppCompatTextView) objArr[34], (FrameLayout) objArr[32], (AppCompatImageView) objArr[23], (AppCompatImageView) objArr[22], (ConstraintLayout) objArr[38], (AppCompatTextView) objArr[39], (View) objArr[12], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[19], (AppCompatImageView) objArr[20], (AppCompatTextView) objArr[21], (SeekBar) objArr[5]);
        this.f901s0 = -1L;
        this.D.setTag(null);
        this.H.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.R.setTag(null);
        this.W.setTag(null);
        this.Z.setTag(null);
        this.f882b0.setTag(null);
        this.f884d0.setTag(null);
        this.f897q0.setTag(null);
        N(view);
        y();
    }
}
