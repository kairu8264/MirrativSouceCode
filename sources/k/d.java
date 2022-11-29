package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;

/* loaded from: classes.dex */
public abstract class d implements f, i, AdapterView.OnItemClickListener {

    /* renamed from: w  reason: collision with root package name */
    public Rect f38268w;

    public static int d(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean m(androidx.appcompat.view.menu.e eVar) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static androidx.appcompat.view.menu.d n(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (androidx.appcompat.view.menu.d) listAdapter;
    }

    public abstract void a(androidx.appcompat.view.menu.e eVar);

    public boolean b() {
        return true;
    }

    public Rect c() {
        return this.f38268w;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean collapseItemActionView(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    public abstract void e(View view);

    @Override // androidx.appcompat.view.menu.i
    public boolean expandItemActionView(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    public void f(Rect rect) {
        this.f38268w = rect;
    }

    public abstract void g(boolean z10);

    public abstract void h(int i10);

    public abstract void i(int i10);

    @Override // androidx.appcompat.view.menu.i
    public void initForMenu(Context context, androidx.appcompat.view.menu.e eVar) {
    }

    public abstract void j(PopupWindow.OnDismissListener onDismissListener);

    public abstract void k(boolean z10);

    public abstract void l(int i10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        n(listAdapter).f14213w.M((MenuItem) listAdapter.getItem(i10), this, b() ? 0 : 4);
    }
}
