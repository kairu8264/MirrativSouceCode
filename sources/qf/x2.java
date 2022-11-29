package qf;

import ae.si;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequests;
import ud.z3;

/* loaded from: classes3.dex */
public final class x2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49435b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49436c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final si f49437a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_stamp_gift_color_palette, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new x2((si) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<z3, wn.v> f49438w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ z3 f49439x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super z3, wn.v> lVar, z3 z3Var) {
            super(1);
            this.f49438w = lVar;
            this.f49439x = z3Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<z3, wn.v> lVar = this.f49438w;
            if (lVar != null) {
                lVar.invoke(this.f49439x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public x2(si siVar) {
        super(siVar.u());
        this.f49437a = siVar;
    }

    public /* synthetic */ x2(si siVar, jo.h hVar) {
        this(siVar);
    }

    public final void a(z3 z3Var, io.l<? super z3, wn.v> lVar) {
        jo.p.h(z3Var, "bindModel");
        this.f49437a.T(z3Var);
        GlideApp.with(this.f49437a.B).load((Drawable) new ColorDrawable(z3Var.b())).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49437a.B);
        GlideRequests with = GlideApp.with(this.f49437a.D);
        Integer c10 = z3Var.c();
        with.load((Drawable) new ColorDrawable(c10 != null ? c10.intValue() : z3Var.b())).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49437a.D);
        View u10 = this.f49437a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(lVar, z3Var));
    }
}
