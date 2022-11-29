package z8;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.mission.MissionItemView;
import t8.o1;

/* loaded from: classes.dex */
public final class u extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62774b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f62775c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final o1 f62776a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            o1 T = o1.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(LayoutInflater.f….context), parent, false)");
            return new u(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o1 o1Var) {
        super(o1Var.u());
        jo.p.h(o1Var, "binding");
        this.f62776a = o1Var;
    }

    public final void a(t tVar, androidx.lifecycle.u uVar, io.l<? super Integer, wn.v> lVar, io.l<? super g, wn.v> lVar2) {
        jo.p.h(tVar, "missionTabItem");
        jo.p.h(uVar, "lifecycleOwner");
        jo.p.h(lVar, "onClickGetButton");
        jo.p.h(lVar2, "onClickRewardDetail");
        MissionItemView missionItemView = this.f62776a.B;
        jo.p.g(missionItemView, "binding.missionItemView");
        missionItemView.c(tVar.e(), !tVar.f(), uVar, lVar, (r16 & 16) != 0 ? null : lVar2, (r16 & 32) != 0 ? null : null);
        if (tVar.f()) {
            this.f62776a.B.setAlpha(1.0f);
        } else {
            this.f62776a.B.setAlpha(0.3f);
        }
    }
}
