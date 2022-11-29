package ya;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import yd.g1;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61427b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61428c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final db.s f61429a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), wa.f.view_holder_campaign_detail_app_user_id_setting, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new e((db.s) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61430w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f61430w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f61430w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public e(db.s sVar) {
        super(sVar.u());
        this.f61429a = sVar;
    }

    public /* synthetic */ e(db.s sVar, jo.h hVar) {
        this(sVar);
    }

    public final void a(d dVar, io.a<wn.v> aVar) {
        jo.p.h(dVar, "bindModel");
        jo.p.h(aVar, "onClickButtonListener");
        this.f61429a.T(dVar);
        RoundedButtonView roundedButtonView = this.f61429a.C;
        jo.p.g(roundedButtonView, "binding.appUserIdSettingButtonView");
        g1.a(roundedButtonView, new b(aVar));
    }
}
