package qf;

import ae.ig;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class l1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49283b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49284c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ig f49285a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ig T = ig.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new l1(T, null);
        }
    }

    public l1(ig igVar) {
        super(igVar.u());
        this.f49285a = igVar;
    }

    public /* synthetic */ l1(ig igVar, jo.h hVar) {
        this(igVar);
    }
}
