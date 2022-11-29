package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.LiveRequestUsersResponse;

/* loaded from: classes2.dex */
public abstract class s0 {

    /* loaded from: classes2.dex */
    public static final class a extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47257a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47257a = mRError;
        }

        public final MRError a() {
            return this.f47257a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47257a, ((a) obj).f47257a);
        }

        public int hashCode() {
            return this.f47257a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f47257a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveRequestUsersResponse f47258a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LiveRequestUsersResponse liveRequestUsersResponse) {
            super(null);
            jo.p.h(liveRequestUsersResponse, "response");
            this.f47258a = liveRequestUsersResponse;
        }

        public final LiveRequestUsersResponse a() {
            return this.f47258a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47258a, ((b) obj).f47258a);
        }

        public int hashCode() {
            return this.f47258a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f47258a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47259a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47260a = new d();

        public d() {
            super(null);
        }
    }

    public s0() {
    }

    public /* synthetic */ s0(jo.h hVar) {
        this();
    }
}
