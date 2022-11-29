package androidx.appcompat.view.menu;

import android.content.Context;

/* loaded from: classes.dex */
public interface i {

    /* loaded from: classes.dex */
    public interface a {
        void onCloseMenu(e eVar, boolean z10);

        boolean onOpenSubMenu(e eVar);
    }

    boolean collapseItemActionView(e eVar, g gVar);

    boolean expandItemActionView(e eVar, g gVar);

    boolean flagActionItems();

    void initForMenu(Context context, e eVar);

    void onCloseMenu(e eVar, boolean z10);

    boolean onSubMenuSelected(l lVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z10);
}
