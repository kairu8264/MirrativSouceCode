package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class f extends e {

    /* renamed from: x0  reason: collision with root package name */
    public static final ViewDataBinding.i f46408x0;

    /* renamed from: y0  reason: collision with root package name */
    public static final SparseIntArray f46409y0;

    /* renamed from: v0  reason: collision with root package name */
    public final LinearLayout f46410v0;

    /* renamed from: w0  reason: collision with root package name */
    public long f46411w0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(47);
        f46408x0 = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f46409y0 = sparseIntArray;
        sparseIntArray.put(nc.e.Q5, 2);
        sparseIntArray.put(nc.e.contract_container, 3);
        sparseIntArray.put(nc.e.banner_background, 4);
        sparseIntArray.put(nc.e.M1, 5);
        sparseIntArray.put(nc.e.your_rank_title_text, 6);
        sparseIntArray.put(nc.e.grade_container, 7);
        sparseIntArray.put(nc.e.grade_image, 8);
        sparseIntArray.put(nc.e.grade_text, 9);
        sparseIntArray.put(nc.e.period_covered_text, 10);
        sparseIntArray.put(nc.e.choose_ranking_prize_text, 11);
        sparseIntArray.put(nc.e.choose_contract_container, 12);
        sparseIntArray.put(nc.e.choose_contract_message_text1, 13);
        sparseIntArray.put(nc.e.choose_contract_message_text2, 14);
        sparseIntArray.put(nc.e.choose_contract_message_text3, 15);
        sparseIntArray.put(nc.e.choose_contract_message_text4, 16);
        sparseIntArray.put(nc.e.choose_not_contract_container, 17);
        sparseIntArray.put(nc.e.choose_not_contract_message_text1, 18);
        sparseIntArray.put(nc.e.choose_not_contract_message_text2, 19);
        sparseIntArray.put(nc.e.choose_not_contract_message_text3, 20);
        sparseIntArray.put(nc.e.choose_not_contract_message_text4, 21);
        sparseIntArray.put(nc.e.or_text_image_view, 22);
        sparseIntArray.put(nc.e.prize_example_message_text, 23);
        sparseIntArray.put(nc.e.can_receive_cash_text, 24);
        sparseIntArray.put(nc.e.can_receive_coin_text, 25);
        sparseIntArray.put(nc.e.can_receive_coin_message, 26);
        sparseIntArray.put(nc.e.N1, 27);
        sparseIntArray.put(nc.e.required_contract_rectangle_image, 28);
        sparseIntArray.put(nc.e.required_contract_title_text, 29);
        sparseIntArray.put(nc.e.terms_text, 30);
        sparseIntArray.put(nc.e.identification_text, 31);
        sparseIntArray.put(nc.e.register_mail_address_text, 32);
        sparseIntArray.put(nc.e.can_be_contract_rectangle_image, 33);
        sparseIntArray.put(nc.e.can_be_contract_title_text, 34);
        sparseIntArray.put(nc.e.can_be_contract_date_text, 35);
        sparseIntArray.put(nc.e.can_be_contract_message, 36);
        sparseIntArray.put(nc.e.contract_rectangle_image, 37);
        sparseIntArray.put(nc.e.contract_title_text, 38);
        sparseIntArray.put(nc.e.contract_date_text, 39);
        sparseIntArray.put(nc.e.payment_rectangle_image, 40);
        sparseIntArray.put(nc.e.payment_title_text, 41);
        sparseIntArray.put(nc.e.payment_date_text, 42);
        sparseIntArray.put(nc.e.check_button, 43);
        sparseIntArray.put(nc.e.start_button, 44);
        sparseIntArray.put(nc.e.not_contract_button, 45);
        sparseIntArray.put(nc.e.payment_type_annotation_1_text_view, 46);
    }

    public f(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 47, f46408x0, f46409y0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return V((e8) obj, i11);
    }

    public final boolean V(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46411w0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f46411w0 = 0L;
        }
        ViewDataBinding.n(this.f46406t0);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.f46411w0 != 0) {
                return true;
            }
            return this.f46406t0.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f46411w0 = 2L;
        }
        this.f46406t0.y();
        H();
    }

    public f(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[35], (AppCompatTextView) objArr[36], (View) objArr[33], (AppCompatTextView) objArr[34], (AppCompatTextView) objArr[24], (AppCompatTextView) objArr[26], (AppCompatTextView) objArr[25], (AppCompatButton) objArr[43], (ConstraintLayout) objArr[12], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[16], (ConstraintLayout) objArr[17], (AppCompatTextView) objArr[18], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[20], (AppCompatTextView) objArr[21], (AppCompatTextView) objArr[11], (NestedScrollView) objArr[3], (AppCompatTextView) objArr[39], (AppCompatImageView) objArr[37], (AppCompatTextView) objArr[38], (View) objArr[5], (View) objArr[27], (ConstraintLayout) objArr[7], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[31], (AppCompatButton) objArr[45], (AppCompatImageView) objArr[22], (AppCompatTextView) objArr[42], (AppCompatImageView) objArr[40], (AppCompatTextView) objArr[41], (AppCompatTextView) objArr[46], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[23], (AppCompatTextView) objArr[32], (View) objArr[28], (AppCompatTextView) objArr[29], (AppCompatButton) objArr[44], (StatusView) objArr[2], (AppCompatTextView) objArr[30], (e8) objArr[1], (AppCompatTextView) objArr[6]);
        this.f46411w0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f46410v0 = linearLayout;
        linearLayout.setTag(null);
        L(this.f46406t0);
        N(view);
        y();
    }
}
