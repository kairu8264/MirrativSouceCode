package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class p extends o {

    /* renamed from: p0  reason: collision with root package name */
    public static final ViewDataBinding.i f46491p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final SparseIntArray f46492q0;

    /* renamed from: m0  reason: collision with root package name */
    public final FrameLayout f46493m0;

    /* renamed from: n0  reason: collision with root package name */
    public final LinearLayout f46494n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f46495o0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(39);
        f46491p0 = iVar;
        iVar.a(1, new String[]{"toolbar"}, new int[]{3}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f46492q0 = sparseIntArray;
        sparseIntArray.put(nc.e.f41822e5, 4);
        sparseIntArray.put(nc.e.gift_received_this_month_text, 5);
        sparseIntArray.put(nc.e.amount_of_gift, 6);
        sparseIntArray.put(nc.e.period_text, 7);
        sparseIntArray.put(nc.e.ranking_triangle_view, 8);
        sparseIntArray.put(nc.e.f41849w0, 9);
        sparseIntArray.put(nc.e.diamond_text, 10);
        sparseIntArray.put(nc.e.diamond_border_text, 11);
        sparseIntArray.put(nc.e.diamond_border_line, 12);
        sparseIntArray.put(nc.e.platinum_text, 13);
        sparseIntArray.put(nc.e.platinum_border_text, 14);
        sparseIntArray.put(nc.e.platinum_border_line, 15);
        sparseIntArray.put(nc.e.emerald_text, 16);
        sparseIntArray.put(nc.e.emerald_border_text, 17);
        sparseIntArray.put(nc.e.emerald_border_line, 18);
        sparseIntArray.put(nc.e.gold_text, 19);
        sparseIntArray.put(nc.e.gold_border_text, 20);
        sparseIntArray.put(nc.e.gold_border_line, 21);
        sparseIntArray.put(nc.e.silver_text, 22);
        sparseIntArray.put(nc.e.silver_border_text, 23);
        sparseIntArray.put(nc.e.silver_border_line, 24);
        sparseIntArray.put(nc.e.ranking_unit_text, 25);
        sparseIntArray.put(nc.e.out_of_rank, 26);
        sparseIntArray.put(nc.e.current_ranking_text, 27);
        sparseIntArray.put(nc.e.current_your_ranking_text, 28);
        sparseIntArray.put(nc.e.out_of_rank_current_your_ranking_text, 29);
        sparseIntArray.put(nc.e.current_ranking_line, 30);
        sparseIntArray.put(nc.e.ranking_image, 31);
        sparseIntArray.put(nc.e.out_of_rank_text, 32);
        sparseIntArray.put(nc.e.check_ranking_rules_detail_text_view, 33);
        sparseIntArray.put(nc.e.paid_cash_or_coin_message_text_view, 34);
        sparseIntArray.put(nc.e.free_coin_message_text_view, 35);
        sparseIntArray.put(nc.e.rank_table, 36);
        sparseIntArray.put(nc.e.receive_cash_and_coin_example, 37);
        sparseIntArray.put(nc.e.Q5, 38);
    }

    public p(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 39, f46491p0, f46492q0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return T((e8) obj, i11);
    }

    public final boolean T(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46495o0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.f46495o0;
            this.f46495o0 = 0L;
        }
        if ((j10 & 2) != 0) {
            td.c.b(this.f46479a0, 12, Integer.valueOf(ViewDataBinding.t(this.f46479a0, nc.b.f41790a)));
        }
        ViewDataBinding.n(this.f46490l0);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.f46495o0 != 0) {
                return true;
            }
            return this.f46490l0.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f46495o0 = 2L;
        }
        this.f46490l0.y();
        H();
    }

    public p(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatTextView) objArr[6], (Space) objArr[9], (AppCompatTextView) objArr[33], (View) objArr[30], (AppCompatTextView) objArr[27], (AppCompatTextView) objArr[28], (View) objArr[12], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[10], (View) objArr[18], (AppCompatTextView) objArr[17], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[35], (AppCompatTextView) objArr[5], (View) objArr[21], (AppCompatTextView) objArr[20], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[26], (AppCompatTextView) objArr[29], (AppCompatTextView) objArr[32], (AppCompatTextView) objArr[34], (AppCompatTextView) objArr[7], (View) objArr[15], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[2], (RecyclerView) objArr[36], (NestedScrollView) objArr[4], (AppCompatImageView) objArr[31], (ConstraintLayout) objArr[8], (AppCompatTextView) objArr[25], (AppCompatTextView) objArr[37], (View) objArr[24], (AppCompatTextView) objArr[23], (AppCompatTextView) objArr[22], (StatusView) objArr[38], (e8) objArr[3]);
        this.f46495o0 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f46493m0 = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f46494n0 = linearLayout;
        linearLayout.setTag(null);
        this.f46479a0.setTag(null);
        L(this.f46490l0);
        N(view);
        y();
    }
}
