package o3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g0 {

    /* loaded from: classes.dex */
    public static final class a implements ro.g<View> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f43953a;

        public a(ViewGroup viewGroup) {
            this.f43953a = viewGroup;
        }

        @Override // ro.g
        public Iterator<View> iterator() {
            return g0.b(this.f43953a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Iterator<View>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public int f43954w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f43955x;

        public b(ViewGroup viewGroup) {
            this.f43955x = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.f43955x;
            int i10 = this.f43954w;
            this.f43954w = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43954w < this.f43955x.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f43955x;
            int i10 = this.f43954w - 1;
            this.f43954w = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final ro.g<View> a(ViewGroup viewGroup) {
        jo.p.h(viewGroup, "<this>");
        return new a(viewGroup);
    }

    public static final Iterator<View> b(ViewGroup viewGroup) {
        jo.p.h(viewGroup, "<this>");
        return new b(viewGroup);
    }
}
