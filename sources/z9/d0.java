package z9;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import s9.y0;
import yd.g1;

/* loaded from: classes.dex */
public final class d0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62813b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f62814c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final y0 f62815a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_gift_ranking_whole_ranking_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new d0((y0) e10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, wn.v> f62816w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c0 f62817x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super Integer, wn.v> lVar, c0 c0Var) {
            super(1);
            this.f62816w = lVar;
            this.f62817x = c0Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<Integer, wn.v> lVar = this.f62816w;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(this.f62817x.k()));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, wn.v> f62818w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c0 f62819x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super Integer, wn.v> lVar, c0 c0Var) {
            super(1);
            this.f62818w = lVar;
            this.f62819x = c0Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<Integer, wn.v> lVar = this.f62818w;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(this.f62819x.k()));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0 f62820w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f62821x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(c0 c0Var, io.l<? super String, wn.v> lVar) {
            super(1);
            this.f62820w = c0Var;
            this.f62821x = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            String b10 = this.f62820w.b();
            io.l<String, wn.v> lVar = this.f62821x;
            if (TextUtils.isEmpty(b10) || lVar == null) {
                return;
            }
            lVar.invoke(b10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public d0(y0 y0Var) {
        super(y0Var.u());
        this.f62815a = y0Var;
    }

    public /* synthetic */ d0(y0 y0Var, jo.h hVar) {
        this(y0Var);
    }

    public final void a(c0 c0Var, io.l<? super Integer, wn.v> lVar, io.l<? super String, wn.v> lVar2) {
        jo.p.h(c0Var, "bindModel");
        this.f62815a.T(c0Var);
        AppCompatImageView appCompatImageView = this.f62815a.E;
        jo.p.g(appCompatImageView, "binding.rankProfileImageView");
        g1.a(appCompatImageView, new b(lVar, c0Var));
        AppCompatTextView appCompatTextView = this.f62815a.I;
        jo.p.g(appCompatTextView, "binding.rankProfileNameTextView");
        g1.a(appCompatTextView, new c(lVar, c0Var));
        ConstraintLayout constraintLayout = this.f62815a.G;
        jo.p.g(constraintLayout, "binding.rankProfileLiveContainer");
        g1.a(constraintLayout, new d(c0Var, lVar2));
    }
}
