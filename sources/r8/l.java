package r8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49959b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49960c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.q0 f49961a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.q0 T = t8.q0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new l(T, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f49962a;

        public b(m mVar) {
            this.f49962a = mVar;
        }

        @Override // r8.o
        public void a(String str) {
            jo.p.h(str, "userId");
            m mVar = this.f49962a;
            if (mVar != null) {
                mVar.a(str);
            }
        }

        @Override // r8.o
        public void b(String str, n3.d<View, String>... dVarArr) {
            jo.p.h(str, "groupShotId");
            jo.p.h(dVarArr, "sharedElements");
            m mVar = this.f49962a;
            if (mVar != null) {
                mVar.d(str, (n3.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m f49963w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m mVar) {
            super(1);
            this.f49963w = mVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            m mVar = this.f49963w;
            if (mVar != null) {
                mVar.c();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public l(t8.q0 q0Var) {
        super(q0Var.u());
        this.f49961a = q0Var;
    }

    public /* synthetic */ l(t8.q0 q0Var, jo.h hVar) {
        this(q0Var);
    }

    public final void a(s8.d dVar, m mVar) {
        jo.p.h(dVar, "bindModel");
        if (mVar != null) {
            List<v8.a> a10 = dVar.a();
            ArrayList arrayList = new ArrayList(xn.t.u(a10, 10));
            for (v8.a aVar : a10) {
                arrayList.add(aVar.getId());
            }
            mVar.b(arrayList);
        }
        RecyclerView recyclerView = this.f49961a.D;
        k kVar = new k();
        kVar.i(new b(mVar));
        kVar.d(dVar.a());
        recyclerView.setAdapter(kVar);
        AppCompatTextView appCompatTextView = this.f49961a.E;
        jo.p.g(appCompatTextView, "binding.showMoreTextView");
        yd.g1.a(appCompatTextView, new c(mVar));
    }
}
