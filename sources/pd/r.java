package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.GiftboxGachaExecuteResponse;
import com.dena.mirrorman.net.api.response.GiftboxGachaResponse;

/* loaded from: classes2.dex */
public abstract class r {

    /* loaded from: classes2.dex */
    public static final class a extends r {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47207a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends r {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47208a = mRError;
        }

        public final MRError a() {
            return this.f47208a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47208a, ((b) obj).f47208a);
        }

        public int hashCode() {
            return this.f47208a.hashCode();
        }

        public String toString() {
            return "FailExecuteGiftboxGacha(error=" + this.f47208a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends r {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47209a = mRError;
        }

        public final MRError a() {
            return this.f47209a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47209a, ((c) obj).f47209a);
        }

        public int hashCode() {
            return this.f47209a.hashCode();
        }

        public String toString() {
            return "FailGetGiftboxGacha(error=" + this.f47209a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends r {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47210a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47210a = mRError;
        }

        public final MRError a() {
            return this.f47210a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47210a, ((d) obj).f47210a);
        }

        public int hashCode() {
            return this.f47210a.hashCode();
        }

        public String toString() {
            return "FailTweet(error=" + this.f47210a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends r {

        /* renamed from: a  reason: collision with root package name */
        public final GiftboxGachaExecuteResponse f47211a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(GiftboxGachaExecuteResponse giftboxGachaExecuteResponse) {
            super(null);
            jo.p.h(giftboxGachaExecuteResponse, "response");
            this.f47211a = giftboxGachaExecuteResponse;
        }

        public final GiftboxGachaExecuteResponse a() {
            return this.f47211a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f47211a, ((e) obj).f47211a);
        }

        public int hashCode() {
            return this.f47211a.hashCode();
        }

        public String toString() {
            return "FinishExecuteGiftboxGacha(response=" + this.f47211a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends r {

        /* renamed from: a  reason: collision with root package name */
        public final GiftboxGachaResponse f47212a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(GiftboxGachaResponse giftboxGachaResponse) {
            super(null);
            jo.p.h(giftboxGachaResponse, "response");
            this.f47212a = giftboxGachaResponse;
        }

        public final GiftboxGachaResponse a() {
            return this.f47212a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47212a, ((f) obj).f47212a);
        }

        public int hashCode() {
            return this.f47212a.hashCode();
        }

        public String toString() {
            return "FinishGetGiftboxGacha(response=" + this.f47212a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends r {

        /* renamed from: a  reason: collision with root package name */
        public static final g f47213a = new g();

        public g() {
            super(null);
        }
    }

    public r() {
    }

    public /* synthetic */ r(jo.h hVar) {
        this();
    }
}
