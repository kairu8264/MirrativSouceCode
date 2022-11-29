package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class n implements LayoutInflater.Factory2 {

    /* renamed from: w  reason: collision with root package name */
    public final FragmentManager f15369w;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x f15370w;

        public a(x xVar) {
            this.f15370w = xVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k10 = this.f15370w.k();
            this.f15370w.m();
            g0.n((ViewGroup) k10.f15130e0.getParent(), n.this.f15369w).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public n(FragmentManager fragmentManager) {
        this.f15369w = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        x s10;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f15369w);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g4.c.f32629a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(g4.c.f32630b);
            }
            int resourceId = obtainStyledAttributes.getResourceId(g4.c.f32631c, -1);
            String string = obtainStyledAttributes.getString(g4.c.f32632d);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !l.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment d02 = resourceId != -1 ? this.f15369w.d0(resourceId) : null;
            if (d02 == null && string != null) {
                d02 = this.f15369w.e0(string);
            }
            if (d02 == null && id2 != -1) {
                d02 = this.f15369w.d0(id2);
            }
            if (d02 == null) {
                d02 = this.f15369w.o0().a(context.getClassLoader(), attributeValue);
                d02.K = true;
                d02.T = resourceId != 0 ? resourceId : id2;
                d02.U = id2;
                d02.V = string;
                d02.L = true;
                FragmentManager fragmentManager = this.f15369w;
                d02.P = fragmentManager;
                d02.Q = fragmentManager.q0();
                d02.N1(this.f15369w.q0().f(), attributeSet, d02.f15149x);
                s10 = this.f15369w.f(d02);
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "Fragment " + d02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!d02.L) {
                d02.L = true;
                FragmentManager fragmentManager2 = this.f15369w;
                d02.P = fragmentManager2;
                d02.Q = fragmentManager2.q0();
                d02.N1(this.f15369w.q0().f(), attributeSet, d02.f15149x);
                s10 = this.f15369w.s(d02);
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + d02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            h4.c.i(d02, viewGroup);
            d02.f15129d0 = viewGroup;
            s10.m();
            s10.j();
            View view2 = d02.f15130e0;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (d02.f15130e0.getTag() == null) {
                    d02.f15130e0.setTag(string);
                }
                d02.f15130e0.addOnAttachStateChangeListener(new a(s10));
                return d02.f15130e0;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}
