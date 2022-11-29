package qf;

import ae.gc;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes3.dex */
public final class c extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49075b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49076c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final gc f49077a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(androidx.lifecycle.u uVar, ViewGroup viewGroup) {
            jo.p.h(uVar, "lifecycleOwner");
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_app_setting, viewGroup, false);
            gc gcVar = (gc) e10;
            gcVar.M(uVar);
            jo.p.g(e10, "inflate<ViewHolderAppSet…ecycleOwner\n            }");
            return new c(gcVar, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49078w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.f f49079x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar, ud.f fVar) {
            super(1);
            this.f49078w = lVar;
            this.f49079x = fVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49078w.invoke(this.f49079x.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* renamed from: qf.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0744c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49080w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.f f49081x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0744c(io.l<? super String, wn.v> lVar, ud.f fVar) {
            super(1);
            this.f49080w = lVar;
            this.f49081x = fVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49080w.invoke(this.f49081x.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public c(gc gcVar) {
        super(gcVar.u());
        this.f49077a = gcVar;
    }

    public /* synthetic */ c(gc gcVar, jo.h hVar) {
        this(gcVar);
    }

    public final void a(ud.f fVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2) {
        jo.p.h(fVar, "bindModel");
        jo.p.h(lVar, "onItemClick");
        jo.p.h(lVar2, "onCampaignDetailClick");
        this.f49077a.T(fVar);
        ConstraintLayout constraintLayout = this.f49077a.C;
        jo.p.g(constraintLayout, "binding.container");
        yd.g1.a(constraintLayout, new b(lVar, fVar));
        RoundedButtonView roundedButtonView = this.f49077a.F;
        jo.p.g(roundedButtonView, "binding.holdingCampaignButtonView");
        yd.g1.a(roundedButtonView, new C0744c(lVar2, fVar));
    }
}
