package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.GiftCodeSelectionResponse;

/* loaded from: classes2.dex */
public abstract class p {

    /* loaded from: classes2.dex */
    public static final class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47101a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47101a = mRError;
        }

        public final MRError a() {
            return this.f47101a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47101a, ((a) obj).f47101a);
        }

        public int hashCode() {
            return this.f47101a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f47101a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends p {

        /* renamed from: a  reason: collision with root package name */
        public final GiftCodeSelectionResponse f47102a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GiftCodeSelectionResponse giftCodeSelectionResponse) {
            super(null);
            jo.p.h(giftCodeSelectionResponse, "response");
            this.f47102a = giftCodeSelectionResponse;
        }

        public final GiftCodeSelectionResponse a() {
            return this.f47102a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47102a, ((b) obj).f47102a);
        }

        public int hashCode() {
            return this.f47102a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f47102a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends p {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47103a = mRError;
        }

        public final MRError a() {
            return this.f47103a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47103a, ((c) obj).f47103a);
        }

        public int hashCode() {
            return this.f47103a.hashCode();
        }

        public String toString() {
            return "PostFail(error=" + this.f47103a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends p {

        /* renamed from: a  reason: collision with root package name */
        public final se.l f47104a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(se.l lVar) {
            super(null);
            jo.p.h(lVar, "giftCodeType");
            this.f47104a = lVar;
        }

        public final se.l a() {
            return this.f47104a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f47104a == ((d) obj).f47104a;
        }

        public int hashCode() {
            return this.f47104a.hashCode();
        }

        public String toString() {
            return "PostFinish(giftCodeType=" + this.f47104a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends p {

        /* renamed from: a  reason: collision with root package name */
        public static final e f47105a = new e();

        public e() {
            super(null);
        }
    }

    public p() {
    }

    public /* synthetic */ p(jo.h hVar) {
        this();
    }
}
