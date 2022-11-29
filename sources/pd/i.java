package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.CollabMatchingStartResponse;
import com.dena.mirrorman.net.api.response.live.AcceptedMatchedCollabResponse;

/* loaded from: classes2.dex */
public abstract class i {

    /* loaded from: classes2.dex */
    public static final class a extends i {

        /* renamed from: a  reason: collision with root package name */
        public final AcceptedMatchedCollabResponse f46912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AcceptedMatchedCollabResponse acceptedMatchedCollabResponse) {
            super(null);
            jo.p.h(acceptedMatchedCollabResponse, "response");
            this.f46912a = acceptedMatchedCollabResponse;
        }

        public final AcceptedMatchedCollabResponse a() {
            return this.f46912a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46912a, ((a) obj).f46912a);
        }

        public int hashCode() {
            return this.f46912a.hashCode();
        }

        public String toString() {
            return "AcceptedMatchingCollab(response=" + this.f46912a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends i {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46913a = mRError;
        }

        public final MRError a() {
            return this.f46913a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46913a, ((b) obj).f46913a);
        }

        public int hashCode() {
            return this.f46913a.hashCode();
        }

        public String toString() {
            return "FailedAcceptedMatchingCollab(error=" + this.f46913a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends i {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46914a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46914a = mRError;
        }

        public final MRError a() {
            return this.f46914a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46914a, ((c) obj).f46914a);
        }

        public int hashCode() {
            return this.f46914a.hashCode();
        }

        public String toString() {
            return "FailedStartMatchingCollab(error=" + this.f46914a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends i {

        /* renamed from: a  reason: collision with root package name */
        public static final d f46915a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends i {

        /* renamed from: a  reason: collision with root package name */
        public static final e f46916a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends i {

        /* renamed from: a  reason: collision with root package name */
        public final CollabMatchingStartResponse f46917a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CollabMatchingStartResponse collabMatchingStartResponse) {
            super(null);
            jo.p.h(collabMatchingStartResponse, "collabMatchingStartResponse");
            this.f46917a = collabMatchingStartResponse;
        }

        public final CollabMatchingStartResponse a() {
            return this.f46917a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f46917a, ((f) obj).f46917a);
        }

        public int hashCode() {
            return this.f46917a.hashCode();
        }

        public String toString() {
            return "SucceededStartMatching(collabMatchingStartResponse=" + this.f46917a + ')';
        }
    }

    public i() {
    }

    public /* synthetic */ i(jo.h hVar) {
        this();
    }
}
