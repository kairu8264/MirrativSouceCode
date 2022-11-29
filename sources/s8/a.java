package s8;

import android.content.Context;
import com.dena.mirrorman.net.api.response.CarouselItem;
import com.dena.mirrorman.net.api.response.DashboardCatalogItem;
import com.dena.mirrorman.net.api.response.DashboardCatalogItemType;
import com.dena.mirrorman.net.api.response.live.CatalogBanner;
import com.dena.mirrorman.net.api.response.live.GroupShotItem;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LiveCatalogAnnouncement;
import com.dena.mirrorman.net.api.response.live.LiveCatalogMirrativQ;
import java.util.List;
import jo.p;
import s8.b;
import s8.c;
import s8.d;
import s8.f;
import s8.g;
import s8.h;
import s8.i;
import s8.j;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0801a f52304a = C0801a.f52305a;

    /* renamed from: s8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0801a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C0801a f52305a = new C0801a();

        /* renamed from: s8.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0802a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f52306a;

            static {
                int[] iArr = new int[DashboardCatalogItemType.values().length];
                iArr[DashboardCatalogItemType.LIVE_SMALL.ordinal()] = 1;
                iArr[DashboardCatalogItemType.LIVE_LARGE.ordinal()] = 2;
                iArr[DashboardCatalogItemType.LIVE_ANNOUNCEMENT.ordinal()] = 3;
                iArr[DashboardCatalogItemType.MIRRATIVQ.ordinal()] = 4;
                iArr[DashboardCatalogItemType.CATALOG_BANNER.ordinal()] = 5;
                iArr[DashboardCatalogItemType.CAROUSEL.ordinal()] = 6;
                iArr[DashboardCatalogItemType.GROUP_SHOT.ordinal()] = 7;
                f52306a = iArr;
            }
        }

        public final a a(Context context, int i10, int i11, DashboardCatalogItem dashboardCatalogItem, boolean z10, long j10) {
            p.h(context, "context");
            p.h(dashboardCatalogItem, "dashboardCatalogItem");
            switch (C0802a.f52306a[dashboardCatalogItem.getType().ordinal()]) {
                case 1:
                    LiveBasicParams live_small = dashboardCatalogItem.getLive_small();
                    p.e(live_small);
                    if (live_small.isPrivate()) {
                        j.a aVar = j.A;
                        LiveBasicParams live_small2 = dashboardCatalogItem.getLive_small();
                        p.e(live_small2);
                        return aVar.a(i10, i11, live_small2);
                    }
                    h.a aVar2 = h.T;
                    LiveBasicParams live_small3 = dashboardCatalogItem.getLive_small();
                    p.e(live_small3);
                    return aVar2.a(context, i10, i11, live_small3, j10);
                case 2:
                    if (z10) {
                        h.a aVar3 = h.T;
                        LiveBasicParams live_large = dashboardCatalogItem.getLive_large();
                        p.e(live_large);
                        return aVar3.a(context, i10, i11, live_large, j10);
                    }
                    g.a aVar4 = g.N;
                    LiveBasicParams live_large2 = dashboardCatalogItem.getLive_large();
                    p.e(live_large2);
                    return aVar4.a(i10, i11, live_large2);
                case 3:
                    f.a aVar5 = f.f52326h;
                    LiveCatalogAnnouncement liveAnnouncement = dashboardCatalogItem.getLiveAnnouncement();
                    p.e(liveAnnouncement);
                    return aVar5.a(context, liveAnnouncement);
                case 4:
                    i.a aVar6 = i.f52385j;
                    LiveCatalogMirrativQ mirrativq = dashboardCatalogItem.getMirrativq();
                    p.e(mirrativq);
                    return i.a.b(aVar6, context, mirrativq, 0, 4, null);
                case 5:
                    b.a aVar7 = s8.b.f52307k;
                    CatalogBanner catalogBanner = dashboardCatalogItem.getCatalogBanner();
                    p.e(catalogBanner);
                    return b.a.b(aVar7, context, catalogBanner, false, 0, 8, null);
                case 6:
                    c.a aVar8 = c.f52317d;
                    List<CarouselItem> carousel = dashboardCatalogItem.getCarousel();
                    p.e(carousel);
                    return aVar8.a(context, carousel);
                case 7:
                    d.a aVar9 = d.f52322d;
                    List<GroupShotItem> groupShots = dashboardCatalogItem.getGroupShots();
                    p.e(groupShots);
                    return aVar9.a(context, groupShots);
                default:
                    throw new IllegalArgumentException("存在しないtype " + dashboardCatalogItem.getType() + " です");
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        LIVE,
        LIVE_PRIVATE,
        LIVE_LARGE,
        MIRRATIV_Q,
        LIVE_ANNOUNCEMENT,
        CATALOG_BANNER,
        CATALOG_WEB_BANNER,
        CAROUSEL,
        GROUP_SHOT
    }

    b getType();
}
