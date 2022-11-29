package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {
    public int A;
    public int B;
    public int C;
    public i.a D;
    public a E;

    /* renamed from: w  reason: collision with root package name */
    public Context f14207w;

    /* renamed from: x  reason: collision with root package name */
    public LayoutInflater f14208x;

    /* renamed from: y  reason: collision with root package name */
    public e f14209y;

    /* renamed from: z  reason: collision with root package name */
    public ExpandedMenuView f14210z;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: w  reason: collision with root package name */
        public int f14211w = -1;

        public a() {
            a();
        }

        public void a() {
            g v10 = c.this.f14209y.v();
            if (v10 != null) {
                ArrayList<g> z10 = c.this.f14209y.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z10.get(i10) == v10) {
                        this.f14211w = i10;
                        return;
                    }
                }
            }
            this.f14211w = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i10) {
            ArrayList<g> z10 = c.this.f14209y.z();
            int i11 = i10 + c.this.A;
            int i12 = this.f14211w;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f14209y.z().size() - c.this.A;
            return this.f14211w < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f14208x.inflate(cVar.C, viewGroup, false);
            }
            ((j.a) view).a(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f14207w = context;
        this.f14208x = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.E == null) {
            this.E = new a();
        }
        return this.E;
    }

    public j b(ViewGroup viewGroup) {
        if (this.f14210z == null) {
            this.f14210z = (ExpandedMenuView) this.f14208x.inflate(d.g.f28748i, viewGroup, false);
            if (this.E == null) {
                this.E = new a();
            }
            this.f14210z.setAdapter((ListAdapter) this.E);
            this.f14210z.setOnItemClickListener(this);
        }
        return this.f14210z;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean collapseItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean expandItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void initForMenu(Context context, e eVar) {
        if (this.B != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.B);
            this.f14207w = contextThemeWrapper;
            this.f14208x = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f14207w != null) {
            this.f14207w = context;
            if (this.f14208x == null) {
                this.f14208x = LayoutInflater.from(context);
            }
        }
        this.f14209y = eVar;
        a aVar = this.E;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void onCloseMenu(e eVar, boolean z10) {
        i.a aVar = this.D;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z10);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f14209y.M(this.E.getItem(i10), this, 0);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean onSubMenuSelected(l lVar) {
        if (lVar.hasVisibleItems()) {
            new f(lVar).b(null);
            i.a aVar = this.D;
            if (aVar != null) {
                aVar.onOpenSubMenu(lVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setCallback(i.a aVar) {
        this.D = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        a aVar = this.E;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public c(int i10, int i11) {
        this.C = i10;
        this.B = i11;
    }
}
