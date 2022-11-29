package tc;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.ChatThreadMessages;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f53451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f53451a = mRError;
        }

        public final MRError a() {
            return this.f53451a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f53451a, ((a) obj).f53451a);
        }

        public int hashCode() {
            return this.f53451a.hashCode();
        }

        public String toString() {
            return "AddChatThreadFailed(error=" + this.f53451a + ')';
        }
    }

    /* renamed from: tc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0831b extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f53452b = ChatThreadMessages.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final ChatThreadMessages f53453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0831b(ChatThreadMessages chatThreadMessages) {
            super(null);
            jo.p.h(chatThreadMessages, "response");
            this.f53453a = chatThreadMessages;
        }

        public final ChatThreadMessages a() {
            return this.f53453a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0831b) && jo.p.c(this.f53453a, ((C0831b) obj).f53453a);
        }

        public int hashCode() {
            return this.f53453a.hashCode();
        }

        public String toString() {
            return "AddChatThreadSucceeded(response=" + this.f53453a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53454a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f53455a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f53455a = mRError;
        }

        public final MRError a() {
            return this.f53455a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f53455a, ((d) obj).f53455a);
        }

        public int hashCode() {
            return this.f53455a.hashCode();
        }

        public String toString() {
            return "InitChatThreadFailed(error=" + this.f53455a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f53456b = ChatThreadMessages.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final ChatThreadMessages f53457a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ChatThreadMessages chatThreadMessages) {
            super(null);
            jo.p.h(chatThreadMessages, "response");
            this.f53457a = chatThreadMessages;
        }

        public final ChatThreadMessages a() {
            return this.f53457a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f53457a, ((e) obj).f53457a);
        }

        public int hashCode() {
            return this.f53457a.hashCode();
        }

        public String toString() {
            return "InitChatThreadSucceeded(response=" + this.f53457a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f53458a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f53458a = mRError;
        }

        public final MRError a() {
            return this.f53458a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f53458a, ((f) obj).f53458a);
        }

        public int hashCode() {
            return this.f53458a.hashCode();
        }

        public String toString() {
            return "PostChatBadReportFailed(error=" + this.f53458a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f53459a = new g();

        public g() {
            super(null);
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
