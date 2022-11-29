package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {
    public final LayoutInflater A;
    public final int B;

    /* renamed from: w  reason: collision with root package name */
    public e f14213w;

    /* renamed from: x  reason: collision with root package name */
    public int f14214x = -1;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14215y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f14216z;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f14216z = z10;
        this.A = layoutInflater;
        this.f14213w = eVar;
        this.B = i10;
        a();
    }

    public void a() {
        g v10 = this.f14213w.v();
        if (v10 != null) {
            ArrayList<g> z10 = this.f14213w.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f14214x = i10;
                    return;
                }
            }
        }
        this.f14214x = -1;
    }

    public e b() {
        return this.f14213w;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList<g> z10 = this.f14216z ? this.f14213w.z() : this.f14213w.E();
        int i11 = this.f14214x;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f14215y = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z10 = this.f14216z ? this.f14213w.z() : this.f14213w.E();
        if (this.f14214x < 0) {
            return z10.size();
        }
        return z10.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.A.inflate(this.B, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f14213w.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.f14215y) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
