package rd;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import qf.p2;
import qf.q2;
import ud.j3;
import ud.k3;
import ud.l3;

/* loaded from: classes2.dex */
public final class x0 extends androidx.recyclerview.widget.t<j3, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.u f51292c;

    /* renamed from: d  reason: collision with root package name */
    public final io.l<String, wn.v> f51293d;

    /* renamed from: e  reason: collision with root package name */
    public final io.a<wn.v> f51294e;

    /* renamed from: f  reason: collision with root package name */
    public final io.a<wn.v> f51295f;

    /* renamed from: g  reason: collision with root package name */
    public final io.a<wn.v> f51296g;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<j3> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51297a = new a();

        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(j3 j3Var, j3 j3Var2) {
            jo.p.h(j3Var, "oldItem");
            jo.p.h(j3Var2, "newItem");
            return jo.p.c(j3Var, j3Var2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(j3 j3Var, j3 j3Var2) {
            jo.p.h(j3Var, "oldItem");
            jo.p.h(j3Var2, "newItem");
            if ((j3Var instanceof k3) && (j3Var2 instanceof k3)) {
                return true;
            }
            if ((j3Var instanceof l3) && (j3Var2 instanceof l3)) {
                return jo.p.c(((l3) j3Var).o(), ((l3) j3Var2).o());
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(androidx.lifecycle.u uVar, io.l<? super String, wn.v> lVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.a<wn.v> aVar3) {
        super(a.f51297a);
        jo.p.h(uVar, "viewLifecycleOwner");
        jo.p.h(lVar, "onClickInvite");
        jo.p.h(aVar, "onClickRequestMatching");
        jo.p.h(aVar2, "onClickCancelMatching");
        jo.p.h(aVar3, "onClickAcceptMatching");
        this.f51292c = uVar;
        this.f51293d = lVar;
        this.f51294e = aVar;
        this.f51295f = aVar2;
        this.f51296g = aVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof q2) {
            androidx.lifecycle.u uVar = this.f51292c;
            j3 b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.ShooterCandidateViewerBindModel");
            ((q2) e0Var).a(uVar, (l3) b10, this.f51293d);
        } else if (!(e0Var instanceof p2)) {
            throw new IllegalArgumentException("unknown view holder " + e0Var);
        } else {
            p2 p2Var = (p2) e0Var;
            androidx.lifecycle.u uVar2 = this.f51292c;
            j3 b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.ShooterCandidateMatchingBindModel");
            p2Var.a(uVar2, (k3) b11, this.f51294e, this.f51295f, this.f51296g);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == j3.a.VIEWER.ordinal()) {
            return q2.f49351b.a(viewGroup);
        }
        if (i10 == j3.a.MATCHING.ordinal()) {
            return p2.f49329b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
