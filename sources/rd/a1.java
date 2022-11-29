package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.j;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftSlot;
import qf.y2;

/* loaded from: classes2.dex */
public final class a1 extends androidx.recyclerview.widget.t<UniqueEmomoGiftSlot, y2> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super UniqueEmomoGiftSlot, wn.v> f51092c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<UniqueEmomoGiftSlot> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(UniqueEmomoGiftSlot uniqueEmomoGiftSlot, UniqueEmomoGiftSlot uniqueEmomoGiftSlot2) {
            jo.p.h(uniqueEmomoGiftSlot, "oldItem");
            jo.p.h(uniqueEmomoGiftSlot2, "newItem");
            return jo.p.c(uniqueEmomoGiftSlot, uniqueEmomoGiftSlot2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(UniqueEmomoGiftSlot uniqueEmomoGiftSlot, UniqueEmomoGiftSlot uniqueEmomoGiftSlot2) {
            jo.p.h(uniqueEmomoGiftSlot, "oldItem");
            jo.p.h(uniqueEmomoGiftSlot2, "newItem");
            return uniqueEmomoGiftSlot == uniqueEmomoGiftSlot2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<UniqueEmomoGiftSlot, wn.v> {
        public b() {
            super(1);
        }

        public final void a(UniqueEmomoGiftSlot uniqueEmomoGiftSlot) {
            jo.p.h(uniqueEmomoGiftSlot, "it");
            io.l<UniqueEmomoGiftSlot, wn.v> g10 = a1.this.g();
            if (g10 != null) {
                g10.invoke(uniqueEmomoGiftSlot);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(UniqueEmomoGiftSlot uniqueEmomoGiftSlot) {
            a(uniqueEmomoGiftSlot);
            return wn.v.f59242a;
        }
    }

    public a1() {
        super(new a());
    }

    public final io.l<UniqueEmomoGiftSlot, wn.v> g() {
        return this.f51092c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public void onBindViewHolder(y2 y2Var, int i10) {
        jo.p.h(y2Var, "viewHolder");
        UniqueEmomoGiftSlot b10 = b(i10);
        jo.p.g(b10, "getItem(position)");
        y2Var.a(b10, new b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i */
    public y2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return y2.f49454b.a(viewGroup);
    }

    public final void j(io.l<? super UniqueEmomoGiftSlot, wn.v> lVar) {
        this.f51092c = lVar;
    }
}
