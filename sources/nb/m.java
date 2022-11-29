package nb;

import android.graphics.Typeface;
import android.view.View;
import com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout;
import com.google.android.material.tabs.TabLayout;
import jo.p;

/* loaded from: classes2.dex */
public final class m implements TabLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GiftPanelTabLayout f41780a;

    public m(GiftPanelTabLayout giftPanelTabLayout) {
        this.f41780a = giftPanelTabLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r1 == r4.B.getTabCount()) goto L16;
     */
    @Override // com.google.android.material.tabs.TabLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.google.android.material.tabs.TabLayout.g r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L8
            android.view.View r1 = r6.e()
            goto L9
        L8:
            r1 = r0
        L9:
            boolean r2 = r1 instanceof nb.n
            if (r2 == 0) goto L10
            nb.n r1 = (nb.n) r1
            goto L11
        L10:
            r1 = r0
        L11:
            r2 = 1
            if (r1 != 0) goto L15
            goto L18
        L15:
            r1.setSelected(r2)
        L18:
            if (r1 == 0) goto L24
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT_BOLD
            java.lang.String r4 = "DEFAULT_BOLD"
            jo.p.g(r3, r4)
            r1.setTextTypeface(r3)
        L24:
            com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout r1 = r5.f41780a
            java.util.List r1 = r1.getPanels()
            r3 = 0
            if (r1 == 0) goto L40
            int r1 = r1.size()
            com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout r4 = r5.f41780a
            ae.wb r4 = com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout.b(r4)
            com.google.android.material.tabs.TabLayout r4 = r4.B
            int r4 = r4.getTabCount()
            if (r1 != r4) goto L40
            goto L41
        L40:
            r2 = r3
        L41:
            if (r2 != 0) goto L44
            return
        L44:
            com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout r1 = r5.f41780a
            java.util.List r1 = r1.getPanels()
            if (r1 == 0) goto L6b
            com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout r2 = r5.f41780a
            ae.wb r2 = com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout.b(r2)
            com.google.android.material.tabs.TabLayout r2 = r2.B
            int r2 = r2.getSelectedTabPosition()
            java.lang.Object r1 = r1.get(r2)
            jf.s r1 = (jf.s) r1
            if (r1 == 0) goto L6b
            com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout r2 = r5.f41780a
            io.l r2 = r2.getOnPanelSelectedListener()
            if (r2 == 0) goto L6b
            r2.invoke(r1)
        L6b:
            if (r6 == 0) goto L71
            java.lang.Object r0 = r6.i()
        L71:
            java.lang.String r1 = "action_tab_click"
            boolean r0 = jo.p.c(r0, r1)
            if (r0 == 0) goto L99
            com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout r0 = r5.f41780a
            io.l r0 = r0.getOnPanelClickedListener()
            if (r0 == 0) goto L94
            com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout r1 = r5.f41780a
            ae.wb r1 = com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout.b(r1)
            com.google.android.material.tabs.TabLayout r1 = r1.B
            int r1 = r1.getSelectedTabPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r1)
        L94:
            java.lang.String r0 = "action_tab_reset"
            r6.s(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.m.a(com.google.android.material.tabs.TabLayout$g):void");
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void b(TabLayout.g gVar) {
        View e10 = gVar != null ? gVar.e() : null;
        n nVar = e10 instanceof n ? (n) e10 : null;
        if (nVar != null) {
            nVar.setSelected(false);
        }
        if (nVar != null) {
            Typeface typeface = Typeface.DEFAULT;
            p.g(typeface, "DEFAULT");
            nVar.setTextTypeface(typeface);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void c(TabLayout.g gVar) {
    }
}
