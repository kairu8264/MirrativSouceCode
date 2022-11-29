package g5;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import g5.m;
import java.util.ArrayList;
import java.util.List;
import k3.c;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.c0 {

    /* loaded from: classes.dex */
    public class a extends m.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f32682a;

        public a(Rect rect) {
            this.f32682a = rect;
        }
    }

    /* loaded from: classes.dex */
    public class b implements m.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f32684a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f32685b;

        public b(View view, ArrayList arrayList) {
            this.f32684a = view;
            this.f32685b = arrayList;
        }

        @Override // g5.m.f
        public void a(m mVar) {
        }

        @Override // g5.m.f
        public void b(m mVar) {
        }

        @Override // g5.m.f
        public void c(m mVar) {
            mVar.W(this);
            this.f32684a.setVisibility(8);
            int size = this.f32685b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f32685b.get(i10)).setVisibility(0);
            }
        }

        @Override // g5.m.f
        public void d(m mVar) {
            mVar.W(this);
            mVar.b(this);
        }

        @Override // g5.m.f
        public void e(m mVar) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f32687a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f32688b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f32689c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f32690d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f32691e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f32692f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f32687a = obj;
            this.f32688b = arrayList;
            this.f32689c = obj2;
            this.f32690d = arrayList2;
            this.f32691e = obj3;
            this.f32692f = arrayList3;
        }

        @Override // g5.m.f
        public void c(m mVar) {
            mVar.W(this);
        }

        @Override // g5.n, g5.m.f
        public void d(m mVar) {
            Object obj = this.f32687a;
            if (obj != null) {
                e.this.w(obj, this.f32688b, null);
            }
            Object obj2 = this.f32689c;
            if (obj2 != null) {
                e.this.w(obj2, this.f32690d, null);
            }
            Object obj3 = this.f32691e;
            if (obj3 != null) {
                e.this.w(obj3, this.f32692f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f32694a;

        public d(m mVar) {
            this.f32694a = mVar;
        }

        @Override // k3.c.a
        public void a() {
            this.f32694a.cancel();
        }
    }

    /* renamed from: g5.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0379e implements m.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f32696a;

        public C0379e(Runnable runnable) {
            this.f32696a = runnable;
        }

        @Override // g5.m.f
        public void a(m mVar) {
        }

        @Override // g5.m.f
        public void b(m mVar) {
        }

        @Override // g5.m.f
        public void c(m mVar) {
            this.f32696a.run();
        }

        @Override // g5.m.f
        public void d(m mVar) {
        }

        @Override // g5.m.f
        public void e(m mVar) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends m.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f32698a;

        public f(Rect rect) {
            this.f32698a = rect;
        }
    }

    public static boolean v(m mVar) {
        return (androidx.fragment.app.c0.i(mVar.D()) && androidx.fragment.app.c0.i(mVar.E()) && androidx.fragment.app.c0.i(mVar.F())) ? false : true;
    }

    @Override // androidx.fragment.app.c0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).e(view);
        }
    }

    @Override // androidx.fragment.app.c0
    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i10 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int q02 = qVar.q0();
            while (i10 < q02) {
                b(qVar.p0(i10), arrayList);
                i10++;
            }
        } else if (v(mVar) || !androidx.fragment.app.c0.i(mVar.G())) {
        } else {
            int size = arrayList.size();
            while (i10 < size) {
                mVar.e(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.c0
    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.c0
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.c0
    public Object f(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.c0
    public Object j(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new q().n0(mVar).n0(mVar2).w0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 != null) {
            q qVar = new q();
            if (mVar != null) {
                qVar.n0(mVar);
            }
            qVar.n0(mVar3);
            return qVar;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.c0
    public Object k(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.n0((m) obj);
        }
        if (obj2 != null) {
            qVar.n0((m) obj2);
        }
        if (obj3 != null) {
            qVar.n0((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.c0
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.c0
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.c0
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).c0(new f(rect));
        }
    }

    @Override // androidx.fragment.app.c0
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((m) obj).c0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.c0
    public void q(Fragment fragment, Object obj, k3.c cVar, Runnable runnable) {
        m mVar = (m) obj;
        cVar.b(new d(mVar));
        mVar.b(new C0379e(runnable));
    }

    @Override // androidx.fragment.app.c0
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> G = qVar.G();
        G.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.c0.d(G, arrayList.get(i10));
        }
        G.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }

    @Override // androidx.fragment.app.c0
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.G().clear();
            qVar.G().addAll(arrayList2);
            w(qVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.c0
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.n0((m) obj);
        return qVar;
    }

    public void w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i10 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int q02 = qVar.q0();
            while (i10 < q02) {
                w(qVar.p0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!v(mVar)) {
            List<View> G = mVar.G();
            if (G.size() == arrayList.size() && G.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size) {
                    mVar.e(arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.X(arrayList.get(size2));
                }
            }
        }
    }
}
