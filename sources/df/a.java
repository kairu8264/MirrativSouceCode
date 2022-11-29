package df;

import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LiveEndLiveParam;
import com.dena.mirrorman.net.api.response.live.LiveEndResponse;
import com.dena.mirrorman.net.api.response.live.LiveEndUserParam;
import com.dena.mirrorman.net.api.response.live.ReceivedDiamonds;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class a implements Serializable {
    public ReceivedDiamonds A;
    public final LiveEndUserParam B;

    /* renamed from: w  reason: collision with root package name */
    public final LiveEndLiveParam f29604w;

    /* renamed from: x  reason: collision with root package name */
    public String f29605x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f29606y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f29607z;

    public a(LiveEndResponse liveEndResponse) {
        p.h(liveEndResponse, "liveEndResponse");
        this.B = liveEndResponse.getUser();
        this.f29604w = liveEndResponse.getLive();
        this.f29605x = liveEndResponse.getAnnouncementUrl();
        this.f29606y = liveEndResponse.getGiftCoins() != null;
        this.f29607z = liveEndResponse.getGiftCoins();
        this.A = liveEndResponse.getReceivedDiamonds();
    }

    public final String a() {
        return this.f29605x;
    }

    public final Integer b() {
        return this.f29607z;
    }

    public final boolean c() {
        return this.f29606y;
    }

    public a(LiveBasicParams liveBasicParams) {
        p.h(liveBasicParams, "liveParam");
        this.B = null;
        LiveEndLiveParam liveEndLiveParam = new LiveEndLiveParam(0, 0, 0, 7, null);
        this.f29604w = liveEndLiveParam;
        liveEndLiveParam.setTotalViewerNum(liveBasicParams.getTotalViewerNum());
        liveEndLiveParam.setMaxOnlineViewerNum(liveBasicParams.getMaxOnlineViewerNum());
        this.f29606y = liveBasicParams.isGiftSupported();
        this.f29607z = liveBasicParams.getGiftCoins();
        this.A = liveBasicParams.getReceivedDiamonds();
    }
}
