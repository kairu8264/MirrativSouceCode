package qf;

import ae.ki;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import ud.p3;

/* loaded from: classes3.dex */
public final class r2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49364b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49365c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ki f49366a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_shooter_invited_viewer, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new r2((ki) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49367w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ p3 f49368x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar, p3 p3Var) {
            super(1);
            this.f49367w = lVar;
            this.f49368x = p3Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49367w.invoke(this.f49368x.d());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public r2(ki kiVar) {
        super(kiVar.u());
        this.f49366a = kiVar;
    }

    public /* synthetic */ r2(ki kiVar, jo.h hVar) {
        this(kiVar);
    }

    public final void a(androidx.lifecycle.u uVar, p3 p3Var, io.l<? super String, wn.v> lVar) {
        jo.p.h(uVar, "viewLifeCycleOwner");
        jo.p.h(p3Var, "bindModel");
        jo.p.h(lVar, "onClickReject");
        this.f49366a.M(uVar);
        this.f49366a.T(p3Var);
        GlideApp.with(this.f49366a.F).load((Drawable) new ColorDrawable(this.f49366a.u().getContext().getColor(nd.w0.blackThree10))).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49366a.F);
        AppCompatImageView appCompatImageView = this.f49366a.K;
        jo.p.g(appCompatImageView, "binding.rejectButtonView");
        yd.g1.a(appCompatImageView, new b(lVar, p3Var));
    }
}
