package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements i {
    private i.a mCallback;
    public Context mContext;
    private int mId;
    public LayoutInflater mInflater;
    private int mItemLayoutRes;
    public e mMenu;
    private int mMenuLayoutRes;
    public j mMenuView;
    public Context mSystemContext;
    public LayoutInflater mSystemInflater;

    public a(Context context, int i10, int i11) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = i10;
        this.mItemLayoutRes = i11;
    }

    public void addItemView(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.mMenuView).addView(view, i10);
    }

    public abstract void bindItemView(g gVar, j.a aVar);

    @Override // androidx.appcompat.view.menu.i
    public boolean collapseItemActionView(e eVar, g gVar) {
        return false;
    }

    public j.a createItemView(ViewGroup viewGroup) {
        return (j.a) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean expandItemActionView(e eVar, g gVar) {
        return false;
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    public i.a getCallback() {
        return this.mCallback;
    }

    public int getId() {
        return this.mId;
    }

    public View getItemView(g gVar, View view, ViewGroup viewGroup) {
        j.a createItemView;
        if (view instanceof j.a) {
            createItemView = (j.a) view;
        } else {
            createItemView = createItemView(viewGroup);
        }
        bindItemView(gVar, createItemView);
        return (View) createItemView;
    }

    public j getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            j jVar = (j) this.mSystemInflater.inflate(this.mMenuLayoutRes, viewGroup, false);
            this.mMenuView = jVar;
            jVar.initialize(this.mMenu);
            updateMenuView(true);
        }
        return this.mMenuView;
    }

    @Override // androidx.appcompat.view.menu.i
    public void initForMenu(Context context, e eVar) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mMenu = eVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onCloseMenu(e eVar, boolean z10) {
        i.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.i
    public boolean onSubMenuSelected(l lVar) {
        i.a aVar = this.mCallback;
        l lVar2 = lVar;
        if (aVar != null) {
            if (lVar == null) {
                lVar2 = this.mMenu;
            }
            return aVar.onOpenSubMenu(lVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setCallback(i.a aVar) {
        this.mCallback = aVar;
    }

    public void setId(int i10) {
        this.mId = i10;
    }

    public boolean shouldIncludeItem(int i10, g gVar) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.mMenu;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.mMenu.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = E.get(i12);
                if (shouldIncludeItem(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View itemView = getItemView(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != childAt) {
                        addItemView(itemView, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!filterLeftoverView(viewGroup, i10)) {
                i10++;
            }
        }
    }
}
