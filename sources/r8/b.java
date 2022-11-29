package r8;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.CarouselView;

/* loaded from: classes.dex */
public final class b extends RecyclerView.u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CarouselView f49829a;

    public b(CarouselView carouselView) {
        this.f49829a = carouselView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, int i10) {
        g gVar;
        jo.p.h(recyclerView, "recyclerView");
        super.a(recyclerView, i10);
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        g gVar2 = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int i22 = linearLayoutManager.i2();
        gVar = this.f49829a.C;
        if (gVar == null) {
            jo.p.v("carouselAdapter");
        } else {
            gVar2 = gVar;
        }
        int c10 = gVar2.c(i22);
        this.f49829a.l(c10);
        if (i10 == 1) {
            this.f49829a.A = true;
        }
        if (i10 == 0) {
            this.f49829a.h();
            this.f49829a.j(c10);
        }
    }
}
