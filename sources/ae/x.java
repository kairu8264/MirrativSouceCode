package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class x extends w {

    /* renamed from: c0  reason: collision with root package name */
    public static final ViewDataBinding.i f1507c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final SparseIntArray f1508d0;

    /* renamed from: b0  reason: collision with root package name */
    public long f1509b0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(26);
        f1507c0 = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1508d0 = sparseIntArray;
        sparseIntArray.put(nd.z0.account_setting, 2);
        sparseIntArray.put(nd.z0.twitter, 3);
        sparseIntArray.put(nd.z0.link_twitter, 4);
        sparseIntArray.put(nd.z0.twitter_status, 5);
        sparseIntArray.put(nd.z0.disconnect_twitter, 6);
        sparseIntArray.put(nd.z0.handover_code_setting_container, 7);
        sparseIntArray.put(nd.z0.handover_code_setting_text_view, 8);
        sparseIntArray.put(nd.z0.broadcast_setting_divider0, 9);
        sparseIntArray.put(nd.z0.broadcast_setting, 10);
        sparseIntArray.put(nd.z0.switch_broadcast_quality, 11);
        sparseIntArray.put(nd.z0.switch_broadcast_quality_text, 12);
        sparseIntArray.put(nd.z0.f42308ke, 13);
        sparseIntArray.put(nd.z0.earphone_title_text_view, 14);
        sparseIntArray.put(nd.z0.earphone_body_text_view, 15);
        sparseIntArray.put(nd.z0.Q3, 16);
        sparseIntArray.put(nd.z0.f42303je, 17);
        sparseIntArray.put(nd.z0.broadcast_setting_divider1, 18);
        sparseIntArray.put(nd.z0.open_download_folder, 19);
        sparseIntArray.put(nd.z0.broadcast_setting_divider2, 20);
        sparseIntArray.put(nd.z0.block_list, 21);
        sparseIntArray.put(nd.z0.emomo_cache_clear_text_view, 22);
        sparseIntArray.put(nd.z0.report_jasrac, 23);
        sparseIntArray.put(nd.z0.logout, 24);
        sparseIntArray.put(nd.z0.withdraw_text_view, 25);
    }

    public x(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 26, f1507c0, f1508d0));
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
                this.f1509b0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f1509b0 = 0L;
        }
        ViewDataBinding.n(this.X);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.f1509b0 != 0) {
                return true;
            }
            return this.X.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1509b0 = 2L;
        }
        this.X.y();
        H();
    }

    public x(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (LinearLayout) objArr[2], (AppCompatTextView) objArr[21], (LinearLayout) objArr[10], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[18], (AppCompatImageView) objArr[20], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[15], (SwitchCompat) objArr[16], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[22], (LinearLayout) objArr[7], (AppCompatTextView) objArr[8], (LinearLayout) objArr[4], (AppCompatTextView) objArr[24], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[23], (RelativeLayout) objArr[0], (LinearLayout) objArr[11], (AppCompatTextView) objArr[12], (Switch) objArr[17], (Switch) objArr[13], (e8) objArr[1], (LinearLayout) objArr[3], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[25]);
        this.f1509b0 = -1L;
        this.S.setTag(null);
        L(this.X);
        N(view);
        y();
    }
}
