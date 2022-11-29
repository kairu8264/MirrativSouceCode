package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse;

/* loaded from: classes2.dex */
public abstract class w {

    /* loaded from: classes2.dex */
    public static final class a extends w {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47301a = mRError;
        }

        public final MRError a() {
            return this.f47301a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47301a, ((a) obj).f47301a);
        }

        public int hashCode() {
            return this.f47301a.hashCode();
        }

        public String toString() {
            return "GetCoinProductsFailedEvent(error=" + this.f47301a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends w {

        /* renamed from: a  reason: collision with root package name */
        public final EventNoticeResponse f47302a;

        public b(EventNoticeResponse eventNoticeResponse) {
            super(null);
            this.f47302a = eventNoticeResponse;
        }

        public final EventNoticeResponse a() {
            return this.f47302a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47302a, ((b) obj).f47302a);
        }

        public int hashCode() {
            EventNoticeResponse eventNoticeResponse = this.f47302a;
            if (eventNoticeResponse == null) {
                return 0;
            }
            return eventNoticeResponse.hashCode();
        }

        public String toString() {
            return "GetEventNoticeSucceededEvent(response=" + this.f47302a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends w {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47303a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47303a = mRError;
        }

        public final MRError a() {
            return this.f47303a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47303a, ((c) obj).f47303a);
        }

        public int hashCode() {
            return this.f47303a.hashCode();
        }

        public String toString() {
            return "PostPurchaseAvatarsFailedEvent(error=" + this.f47303a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends w {

        /* renamed from: a  reason: collision with root package name */
        public final PurchaseAvatarsResponse f47304a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PurchaseAvatarsResponse purchaseAvatarsResponse) {
            super(null);
            jo.p.h(purchaseAvatarsResponse, "response");
            this.f47304a = purchaseAvatarsResponse;
        }

        public final PurchaseAvatarsResponse a() {
            return this.f47304a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47304a, ((d) obj).f47304a);
        }

        public int hashCode() {
            return this.f47304a.hashCode();
        }

        public String toString() {
            return "PostPurchaseAvatarsSucceededEvent(response=" + this.f47304a + ')';
        }
    }

    public w() {
    }

    public /* synthetic */ w(jo.h hVar) {
        this();
    }
}
