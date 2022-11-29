package s8;

import android.content.Context;
import com.dena.mirrorman.net.api.response.CarouselItem;
import com.dena.mirrorman.net.api.response.CarouselItemType;
import com.dena.mirrorman.net.api.response.live.CatalogBanner;
import com.dena.mirrorman.net.api.response.live.CatalogWebBanner;
import com.dena.mirrorman.net.api.response.live.LiveCatalogMirrativQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.p;
import s8.a;
import s8.b;
import s8.i;
import s8.l;
import xn.s;
import xn.t;

/* loaded from: classes.dex */
public final class c implements s8.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f52317d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f52318e = 8;

    /* renamed from: b  reason: collision with root package name */
    public final List<s8.a> f52319b;

    /* renamed from: c  reason: collision with root package name */
    public final a.b f52320c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: s8.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0803a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f52321a;

            static {
                int[] iArr = new int[CarouselItemType.values().length];
                iArr[CarouselItemType.MIRRATIVQ.ordinal()] = 1;
                iArr[CarouselItemType.CATALOG_BANNER.ordinal()] = 2;
                iArr[CarouselItemType.CATALOG_WEB_BANNER.ordinal()] = 3;
                f52321a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(Context context, List<CarouselItem> list) {
            int i10;
            Object a10;
            p.h(context, "context");
            p.h(list, "carousel");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ((((CarouselItem) next).getType() != CarouselItemType.UNKNOWN ? 1 : 0) != 0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(t.u(arrayList, 10));
            for (Object obj : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.t();
                }
                CarouselItem carouselItem = (CarouselItem) obj;
                int i12 = C0803a.f52321a[carouselItem.getType().ordinal()];
                if (i12 == 1) {
                    i.a aVar = i.f52385j;
                    LiveCatalogMirrativQ mirrativq = carouselItem.getMirrativq();
                    p.e(mirrativq);
                    a10 = aVar.a(context, mirrativq, i10);
                } else if (i12 == 2) {
                    b.a aVar2 = b.f52307k;
                    CatalogBanner catalogBanner = carouselItem.getCatalogBanner();
                    p.e(catalogBanner);
                    a10 = aVar2.a(context, catalogBanner, true, i10);
                } else if (i12 == 3) {
                    l.a aVar3 = l.f52426h;
                    CatalogWebBanner catalogWebBanner = carouselItem.getCatalogWebBanner();
                    p.e(catalogWebBanner);
                    a10 = aVar3.a(catalogWebBanner, i10);
                } else {
                    throw new IllegalArgumentException("存在しないtype " + carouselItem.getType() + " です");
                }
                arrayList2.add(a10);
                i10 = i11;
            }
            return new c(arrayList2, null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends s8.a> list, a.b bVar) {
        p.h(list, "items");
        p.h(bVar, "type");
        this.f52319b = list;
        this.f52320c = bVar;
    }

    public final List<s8.a> a() {
        return this.f52319b;
    }

    @Override // s8.a
    public a.b getType() {
        return this.f52320c;
    }

    public /* synthetic */ c(List list, a.b bVar, int i10, jo.h hVar) {
        this(list, (i10 & 2) != 0 ? a.b.CAROUSEL : bVar);
    }
}
