package qf;

import ae.mc;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes3.dex */
public final class f extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f49126c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f49127d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final mc f49128a;

    /* renamed from: b  reason: collision with root package name */
    public g f49129b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_collab_member, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new f((mc) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ud.s f49131b;

        public b(ud.s sVar) {
            this.f49131b = sVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            jo.p.h(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            jo.p.h(seekBar, "seekBar");
            int progress = seekBar.getProgress() - 80;
            g gVar = f.this.f49129b;
            if (gVar != null) {
                gVar.c(this.f49131b.f(), progress);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.s f49133x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ud.s sVar) {
            super(1);
            this.f49133x = sVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            g gVar = f.this.f49129b;
            if (gVar != null) {
                gVar.a(this.f49133x.f());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.s f49135x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ud.s sVar) {
            super(1);
            this.f49135x = sVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            g gVar = f.this.f49129b;
            if (gVar != null) {
                gVar.b(this.f49135x.f());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public f(mc mcVar) {
        super(mcVar.u());
        this.f49128a = mcVar;
    }

    public /* synthetic */ f(mc mcVar, jo.h hVar) {
        this(mcVar);
    }

    public final void b(ud.s sVar) {
        jo.p.h(sVar, "collabMemberBindModel");
        this.f49128a.T(sVar);
        this.f49128a.I.setOnSeekBarChangeListener(new b(sVar));
        RoundedButtonView roundedButtonView = this.f49128a.G;
        jo.p.g(roundedButtonView, "binding.stopImageView");
        yd.g1.a(roundedButtonView, new c(sVar));
        RoundedButtonView roundedButtonView2 = this.f49128a.D;
        jo.p.g(roundedButtonView2, "binding.showLiveButtonView");
        yd.g1.a(roundedButtonView2, new d(sVar));
    }

    public final void c(g gVar) {
        jo.p.h(gVar, "listener");
        this.f49129b = gVar;
    }
}
