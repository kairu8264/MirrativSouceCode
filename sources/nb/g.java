package nb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.player.gifting.panel.PlayerGiftPagerCell;
import hb.q1;
import hb.x1;
import ia.a;
import jf.q;
import jo.p;
import kb.s0;
import ud.b1;
import wn.v;

/* loaded from: classes2.dex */
public final class g extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41751b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41752c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s0 f41753a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_giftpanel_gift, viewGroup, false);
            p.g(e10, "inflate(\n               …  false\n                )");
            return new g((s0) e10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ia.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b1 f41755b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ io.p<PlayerGiftPagerCell, q, v> f41756c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ io.l<q, v> f41757d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(b1 b1Var, io.p<? super PlayerGiftPagerCell, ? super q, v> pVar, io.l<? super q, v> lVar) {
            this.f41755b = b1Var;
            this.f41756c = pVar;
            this.f41757d = lVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            g.this.f41753a.B.setEnabled(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            g gVar = g.this;
            PlayerGiftPagerCell playerGiftPagerCell = gVar.f41753a.B;
            p.g(playerGiftPagerCell, "binding.giftView");
            gVar.h(playerGiftPagerCell, this.f41755b.a(), this.f41756c, this.f41757d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<q, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<q, v> f41758w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super q, v> lVar) {
            super(1);
            this.f41758w = lVar;
        }

        public final void a(q qVar) {
            io.l<q, v> lVar = this.f41758w;
            if (lVar != null) {
                lVar.invoke(qVar);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q qVar) {
            a(qVar);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s0 s0Var) {
        super(s0Var.u());
        p.h(s0Var, "binding");
        this.f41753a = s0Var;
    }

    public static final void i(io.p pVar, PlayerGiftPagerCell playerGiftPagerCell, q qVar, View view) {
        p.h(playerGiftPagerCell, "$this_setUpGift");
        p.h(qVar, "$data");
        if (pVar != null) {
            pVar.invoke(playerGiftPagerCell, qVar);
        }
    }

    public final void d(b1 b1Var, io.p<? super PlayerGiftPagerCell, ? super q, v> pVar, io.l<? super q, v> lVar) {
        p.h(b1Var, "bindModel");
        PlayerGiftPagerCell playerGiftPagerCell = this.f41753a.B;
        p.g(playerGiftPagerCell, "binding.giftView");
        h(playerGiftPagerCell, b1Var.a(), pVar, lVar);
    }

    public final void f(b1 b1Var, io.p<? super PlayerGiftPagerCell, ? super q, v> pVar, io.l<? super q, v> lVar) {
        p.h(b1Var, "bindModel");
        s0 s0Var = this.f41753a;
        PlayerGiftPagerCell playerGiftPagerCell = s0Var.B;
        Animation loadAnimation = AnimationUtils.loadAnimation(s0Var.u().getContext(), q1.f34953b);
        loadAnimation.setDuration(300L);
        loadAnimation.setStartOffset(300L);
        loadAnimation.setAnimationListener(new b(b1Var, pVar, lVar));
        playerGiftPagerCell.startAnimation(loadAnimation);
    }

    public final void g() {
        this.f41753a.B.x();
    }

    public final void h(final PlayerGiftPagerCell playerGiftPagerCell, final q qVar, final io.p<? super PlayerGiftPagerCell, ? super q, v> pVar, io.l<? super q, v> lVar) {
        playerGiftPagerCell.y(qVar, false);
        playerGiftPagerCell.setOnClickListener(new View.OnClickListener() { // from class: nb.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.i(io.p.this, playerGiftPagerCell, qVar, view);
            }
        });
        playerGiftPagerCell.setOnProgressAnimationEnd(new c(lVar));
    }
}
