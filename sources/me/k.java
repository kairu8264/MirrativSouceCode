package me;

import ae.mj;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import nd.b1;
import yd.g1;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41051b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41052c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final mj f41053a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_unique_emomo_rich_gift_preset_text, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new k((mj) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f41054w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f41055x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, int i10) {
            super(1);
            this.f41054w = lVar;
            this.f41055x = i10;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            l lVar = this.f41054w;
            if (lVar != null) {
                lVar.a(this.f41055x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public k(mj mjVar) {
        super(mjVar.u());
        this.f41053a = mjVar;
    }

    public /* synthetic */ k(mj mjVar, jo.h hVar) {
        this(mjVar);
    }

    public final void a(int i10, String str, l lVar) {
        jo.p.h(str, "title");
        this.f41053a.C.setText(str);
        RoundedButtonView roundedButtonView = this.f41053a.B;
        jo.p.g(roundedButtonView, "binding.buttonView");
        g1.a(roundedButtonView, new b(lVar, i10));
    }
}
