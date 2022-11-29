package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class z extends y {

    /* renamed from: h0  reason: collision with root package name */
    public static final ViewDataBinding.i f1516h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final SparseIntArray f1517i0;

    /* renamed from: g0  reason: collision with root package name */
    public long f1518g0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(31);
        f1516h0 = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1517i0 = sparseIntArray;
        sparseIntArray.put(nd.z0.edit_identification_container, 2);
        sparseIntArray.put(nd.z0.edit_identification_text_view, 3);
        sparseIntArray.put(nd.z0.edit_identification_new_badge_image_view, 4);
        sparseIntArray.put(nd.z0.edit_identification_right_icon_image_view, 5);
        sparseIntArray.put(nd.z0.edit_identification_divider_view, 6);
        sparseIntArray.put(nd.z0.edit_bank_account_container, 7);
        sparseIntArray.put(nd.z0.edit_bank_account_text_view, 8);
        sparseIntArray.put(nd.z0.edit_bank_account_new_badge_image_view, 9);
        sparseIntArray.put(nd.z0.payment_type_text_view, 10);
        sparseIntArray.put(nd.z0.edit_bank_account_right_icon_image_view, 11);
        sparseIntArray.put(nd.z0.edit_bank_account_divider_view, 12);
        sparseIntArray.put(nd.z0.contract_member_pass_book_container, 13);
        sparseIntArray.put(nd.z0.contract_passbook_new_badge_image_view, 14);
        sparseIntArray.put(nd.z0.cash_bonus_history_right_icon_image_view, 15);
        sparseIntArray.put(nd.z0.contract_member_pass_book_divider_view, 16);
        sparseIntArray.put(nd.z0.monthly_ranking, 17);
        sparseIntArray.put(nd.z0.monthly_ranking_new_badge, 18);
        sparseIntArray.put(nd.z0.monthly_ranking_divider, 19);
        sparseIntArray.put(nd.z0.contract_member_menu_divider, 20);
        sparseIntArray.put(nd.z0.setting_root_setting, 21);
        sparseIntArray.put(nd.z0.contactus, 22);
        sparseIntArray.put(nd.z0.dear_developer, 23);
        sparseIntArray.put(nd.z0.dear_publisher, 24);
        sparseIntArray.put(nd.z0.policy, 25);
        sparseIntArray.put(nd.z0.terms_for_streamer, 26);
        sparseIntArray.put(nd.z0.law, 27);
        sparseIntArray.put(nd.z0.license, 28);
        sparseIntArray.put(nd.z0.f42278e6, 29);
        sparseIntArray.put(nd.z0.about, 30);
    }

    public z(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 31, f1516h0, f1517i0));
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
                this.f1518g0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f1518g0 = 0L;
        }
        ViewDataBinding.n(this.f1515f0);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.f1518g0 != 0) {
                return true;
            }
            return this.f1515f0.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1518g0 = 2L;
        }
        this.f1515f0.y();
        H();
    }

    public z(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (LinearLayout) objArr[30], (AppCompatImageView) objArr[15], (LinearLayout) objArr[22], (View) objArr[20], (LinearLayout) objArr[13], (View) objArr[16], (AppCompatImageView) objArr[14], (LinearLayout) objArr[23], (LinearLayout) objArr[24], (LinearLayout) objArr[7], (View) objArr[12], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[8], (LinearLayout) objArr[2], (View) objArr[6], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[3], (LinearLayout) objArr[29], (LinearLayout) objArr[27], (LinearLayout) objArr[28], (LinearLayout) objArr[17], (View) objArr[19], (AppCompatImageView) objArr[18], (AppCompatTextView) objArr[10], (LinearLayout) objArr[25], (RelativeLayout) objArr[0], (LinearLayout) objArr[21], (LinearLayout) objArr[26], (e8) objArr[1]);
        this.f1518g0 = -1L;
        this.f1512c0.setTag(null);
        L(this.f1515f0);
        N(view);
        y();
    }
}
