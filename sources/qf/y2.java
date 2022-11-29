package qf;

import ae.ui;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftSlot;

/* loaded from: classes3.dex */
public final class y2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49454b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49455c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ui f49456a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_stamp_gift_slot, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new y2((ui) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<UniqueEmomoGiftSlot, wn.v> f49457w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UniqueEmomoGiftSlot f49458x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super UniqueEmomoGiftSlot, wn.v> lVar, UniqueEmomoGiftSlot uniqueEmomoGiftSlot) {
            super(1);
            this.f49457w = lVar;
            this.f49458x = uniqueEmomoGiftSlot;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49457w.invoke(this.f49458x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public y2(ui uiVar) {
        super(uiVar.u());
        this.f49456a = uiVar;
    }

    public /* synthetic */ y2(ui uiVar, jo.h hVar) {
        this(uiVar);
    }

    public final void a(UniqueEmomoGiftSlot uniqueEmomoGiftSlot, io.l<? super UniqueEmomoGiftSlot, wn.v> lVar) {
        jo.p.h(uniqueEmomoGiftSlot, "slot");
        jo.p.h(lVar, "clickListener");
        if (uniqueEmomoGiftSlot.isEmpty()) {
            this.f49456a.D.setVisibility(0);
        } else {
            this.f49456a.D.setVisibility(8);
            ImageView imageView = this.f49456a.C;
            jo.p.g(imageView, "binding.imageView");
            td.a.f(imageView, uniqueEmomoGiftSlot.getImageUrl());
        }
        ui uiVar = this.f49456a;
        uiVar.E.setText(uiVar.u().getResources().getString(nd.f1.text_unique_emomo_gift_slot_name, String.valueOf(uniqueEmomoGiftSlot.getSlotId())));
        View u10 = this.f49456a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(lVar, uniqueEmomoGiftSlot));
    }
}
