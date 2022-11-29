package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResult;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class v0 {

    /* loaded from: classes2.dex */
    public static final class a extends v0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47297a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47297a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47297a, ((a) obj).f47297a);
        }

        public int hashCode() {
            return this.f47297a.hashCode();
        }

        public String toString() {
            return "LiveResultLoadFailed(error=" + this.f47297a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends v0 {

        /* renamed from: a  reason: collision with root package name */
        public final SeasonRatingLiveResult f47298a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SeasonRatingLiveResult seasonRatingLiveResult) {
            super(null);
            jo.p.h(seasonRatingLiveResult, "response");
            this.f47298a = seasonRatingLiveResult;
        }

        public final SeasonRatingLiveResult a() {
            return this.f47298a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47298a, ((b) obj).f47298a);
        }

        public int hashCode() {
            return this.f47298a.hashCode();
        }

        public String toString() {
            return "LiveResultLoadSucceeded(response=" + this.f47298a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends v0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47299a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends v0 {

        /* renamed from: a  reason: collision with root package name */
        public final SeasonRatingStatusResponse f47300a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SeasonRatingStatusResponse seasonRatingStatusResponse) {
            super(null);
            jo.p.h(seasonRatingStatusResponse, "response");
            this.f47300a = seasonRatingStatusResponse;
        }

        public final SeasonRatingStatusResponse a() {
            return this.f47300a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47300a, ((d) obj).f47300a);
        }

        public int hashCode() {
            return this.f47300a.hashCode();
        }

        public String toString() {
            return "StatusLoadSucceeded(response=" + this.f47300a + ')';
        }
    }

    public v0() {
    }

    public /* synthetic */ v0(jo.h hVar) {
        this();
    }
}
