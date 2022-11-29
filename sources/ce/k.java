package ce;

import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrorman.clientlog.logs.EventBannerWhere;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class k {

    /* loaded from: classes2.dex */
    public static final class a extends k {

        /* renamed from: a  reason: collision with root package name */
        public final EventBannerResponse f19328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EventBannerResponse eventBannerResponse) {
            super(null);
            jo.p.h(eventBannerResponse, "eventBanner");
            this.f19328a = eventBannerResponse;
        }

        public final EventBannerResponse a() {
            return this.f19328a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends k {

        /* renamed from: a  reason: collision with root package name */
        public final nd.c f19329a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19330b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19331c;

        /* renamed from: d  reason: collision with root package name */
        public final EventBannerWhere f19332d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nd.c cVar, String str, String str2, EventBannerWhere eventBannerWhere) {
            super(null);
            jo.p.h(cVar, "bannerType");
            jo.p.h(str, "title");
            jo.p.h(str2, "url");
            jo.p.h(eventBannerWhere, MRLog.PAYLOAD_KEY_WHERE);
            this.f19329a = cVar;
            this.f19330b = str;
            this.f19331c = str2;
            this.f19332d = eventBannerWhere;
        }

        public final nd.c a() {
            return this.f19329a;
        }

        public final String b() {
            return this.f19330b;
        }

        public final EventBannerWhere c() {
            return this.f19332d;
        }
    }

    public k() {
    }

    public /* synthetic */ k(jo.h hVar) {
        this();
    }
}
