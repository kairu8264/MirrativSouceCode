package qf;

import ae.sf;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.GiftboxGachaResultSpecialGachaItem;

/* loaded from: classes3.dex */
public final class z0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49462b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49463c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final sf f49464a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_giftbox_gacha_result_special_item, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new z0((sf) e10, null);
        }
    }

    public z0(sf sfVar) {
        super(sfVar.u());
        this.f49464a = sfVar;
    }

    public /* synthetic */ z0(sf sfVar, jo.h hVar) {
        this(sfVar);
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(GiftboxGachaResultSpecialGachaItem giftboxGachaResultSpecialGachaItem) {
        String str;
        jo.p.h(giftboxGachaResultSpecialGachaItem, "specialItem");
        AppCompatImageView appCompatImageView = this.f49464a.C;
        jo.p.g(appCompatImageView, "binding.imageView");
        td.a.e(appCompatImageView, giftboxGachaResultSpecialGachaItem.getImageUrl());
        AppCompatTextView appCompatTextView = this.f49464a.B;
        if (giftboxGachaResultSpecialGachaItem.getNum() > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('x');
            sb2.append(giftboxGachaResultSpecialGachaItem.getNum());
            str = sb2.toString();
        } else {
            str = "";
        }
        appCompatTextView.setText(str);
    }
}
