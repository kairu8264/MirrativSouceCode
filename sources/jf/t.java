package jf;

import com.dena.mirrorman.net.api.response.Gift;
import com.dena.mirrorman.net.api.response.GiftPanelBanner;
import com.dena.mirrorman.net.api.response.GiftPanelsResponse;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class t {
    public final s a(GiftPanelsResponse.PanelParams panelParams, boolean z10, String str) {
        jo.p.h(panelParams, "panel");
        jo.p.h(str, "referer");
        String id2 = panelParams.getId();
        int type = panelParams.getType();
        int reasonId = panelParams.getReasonId();
        String title = panelParams.getTitle();
        String iconUrl = panelParams.getIconUrl();
        GiftPanelBanner banner = panelParams.getBanner();
        List<Gift.GiftParams> gifts = panelParams.getGifts();
        ArrayList arrayList = new ArrayList();
        for (Gift.GiftParams giftParams : gifts) {
            arrayList.add(new r().a(giftParams, str));
        }
        return new s(id2, type, reasonId, title, iconUrl, banner, z10, arrayList, panelParams.getLiveGameId(), panelParams.isFocus());
    }
}
