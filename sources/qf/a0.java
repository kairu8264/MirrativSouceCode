package qf;

import ae.qd;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ud.p4;

/* loaded from: classes3.dex */
public final class a0 extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f49022c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f49023d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final qd f49024a;

    /* renamed from: b  reason: collision with root package name */
    public List<Animation> f49025b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment_message_gift, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new a0((qd) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Animation f49027x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animation animation) {
            super(0);
            this.f49027x = animation;
        }

        public final void a() {
            a0.this.f49024a.D.startAnimation(this.f49027x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Animation f49029x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Animation animation) {
            super(0);
            this.f49029x = animation;
        }

        public final void a() {
            a0.this.f49024a.D.startAnimation(this.f49029x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final long f49030a;

        /* renamed from: b  reason: collision with root package name */
        public final io.a<wn.v> f49031b;

        @co.f(c = "com.dena.mirrorman.viewholder.EmomoCommentMessageGiftViewHolder$startMessageGiftAnimation$TickerAnimationListener$onAnimationEnd$1", f = "EmomoCommentMessageGiftViewHolder.kt", l = {66}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f49032w;

            public a(ao.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f49032w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (d.this.a() > 0) {
                        long a10 = d.this.a();
                        this.f49032w = 1;
                        if (uo.b1.a(a10, this) == c10) {
                            return c10;
                        }
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                d.this.b().invoke();
                return wn.v.f59242a;
            }
        }

        public d(long j10, io.a<wn.v> aVar) {
            jo.p.h(aVar, "onAnimationEnd");
            this.f49030a = j10;
            this.f49031b = aVar;
        }

        public final long a() {
            return this.f49030a;
        }

        public final io.a<wn.v> b() {
            return this.f49031b;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            uo.l.d(uo.v1.f56093w, uo.g1.c(), null, new a(null), 2, null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public a0(qd qdVar) {
        super(qdVar.u());
        this.f49024a = qdVar;
    }

    public /* synthetic */ a0(qd qdVar, jo.h hVar) {
        this(qdVar);
    }

    public final void b(p4 p4Var) {
        jo.p.h(p4Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f49024a.G;
        jo.p.g(appCompatImageView, "binding.profileImage");
        de.f.e(appCompatImageView, p4Var.f(), Integer.valueOf(nd.y0.U1));
        AppCompatTextView appCompatTextView = this.f49024a.H;
        appCompatTextView.setText(appCompatTextView.getContext().getString(nd.f1.text_birthday_message_gift_comment_title, p4Var.c()));
        if (TextUtils.isEmpty(p4Var.g())) {
            this.f49024a.B.setVisibility(4);
        } else {
            this.f49024a.B.setVisibility(0);
            of.f fVar = of.f.f45394a;
            Context context = this.f49024a.B.getContext();
            jo.p.g(context, "binding.badgeImage.context");
            fVar.c(context, p4Var.g(), this.f49024a.B);
        }
        this.f49024a.D.setText(p4Var.a());
        this.f49024a.o();
    }

    public final void c() {
        this.f49024a.D.clearAnimation();
        List<Animation> list = this.f49025b;
        if (list != null) {
            for (Animation animation : list) {
                animation.cancel();
            }
        }
        List<Animation> list2 = this.f49025b;
        if (list2 != null) {
            list2.clear();
        }
        this.f49025b = null;
    }

    public final void d() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f49024a.u().getContext(), nd.v0.emokara_request_gift_message_ticker_0);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f49024a.u().getContext(), nd.v0.emokara_request_gift_message_ticker_1);
        loadAnimation2.setFillAfter(true);
        loadAnimation.setAnimationListener(new d(1000L, new b(loadAnimation2)));
        loadAnimation2.setAnimationListener(new d(0L, new c(loadAnimation)));
        ArrayList arrayList = new ArrayList();
        this.f49025b = arrayList;
        jo.p.g(loadAnimation, "ticker0");
        arrayList.add(loadAnimation);
        List<Animation> list = this.f49025b;
        if (list != null) {
            jo.p.g(loadAnimation2, "ticker1");
            list.add(loadAnimation2);
        }
        this.f49024a.D.startAnimation(loadAnimation);
    }
}
