package g5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static m f32759a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<s.a<ViewGroup, ArrayList<m>>>> f32760b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f32761c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public m f32762w;

        /* renamed from: x  reason: collision with root package name */
        public ViewGroup f32763x;

        /* renamed from: g5.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0380a extends n {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ s.a f32764a;

            public C0380a(s.a aVar) {
                this.f32764a = aVar;
            }

            @Override // g5.m.f
            public void c(m mVar) {
                ((ArrayList) this.f32764a.get(a.this.f32763x)).remove(mVar);
                mVar.W(this);
            }
        }

        public a(m mVar, ViewGroup viewGroup) {
            this.f32762w = mVar;
            this.f32763x = viewGroup;
        }

        public final void a() {
            this.f32763x.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f32763x.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (o.f32761c.remove(this.f32763x)) {
                s.a<ViewGroup, ArrayList<m>> b10 = o.b();
                ArrayList<m> arrayList = b10.get(this.f32763x);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b10.put(this.f32763x, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f32762w);
                this.f32762w.b(new C0380a(b10));
                this.f32762w.n(this.f32763x, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((m) it.next()).Y(this.f32763x);
                    }
                }
                this.f32762w.V(this.f32763x);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f32761c.remove(this.f32763x);
            ArrayList<m> arrayList = o.b().get(this.f32763x);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().Y(this.f32763x);
                }
            }
            this.f32762w.o(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f32761c.contains(viewGroup) || !o3.c0.V(viewGroup)) {
            return;
        }
        f32761c.add(viewGroup);
        if (mVar == null) {
            mVar = f32759a;
        }
        m clone = mVar.clone();
        d(viewGroup, clone);
        l.c(viewGroup, null);
        c(viewGroup, clone);
    }

    public static s.a<ViewGroup, ArrayList<m>> b() {
        s.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<s.a<ViewGroup, ArrayList<m>>> weakReference = f32760b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            s.a<ViewGroup, ArrayList<m>> aVar2 = new s.a<>();
            f32760b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    public static void c(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().T(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.n(viewGroup, true);
        }
        l b10 = l.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
