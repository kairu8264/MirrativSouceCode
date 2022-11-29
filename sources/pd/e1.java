package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftConfigResponse;

/* loaded from: classes2.dex */
public abstract class e1 {

    /* loaded from: classes2.dex */
    public static final class a extends e1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46729a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46729a = mRError;
        }

        public final MRError a() {
            return this.f46729a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46729a, ((a) obj).f46729a);
        }

        public int hashCode() {
            return this.f46729a.hashCode();
        }

        public String toString() {
            return "FetchUniqueEmomoGiftConfigFailed(error=" + this.f46729a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends e1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46730a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends e1 {

        /* renamed from: a  reason: collision with root package name */
        public final UniqueEmomoGiftConfigResponse f46731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UniqueEmomoGiftConfigResponse uniqueEmomoGiftConfigResponse) {
            super(null);
            jo.p.h(uniqueEmomoGiftConfigResponse, "response");
            this.f46731a = uniqueEmomoGiftConfigResponse;
        }

        public final UniqueEmomoGiftConfigResponse a() {
            return this.f46731a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46731a, ((c) obj).f46731a);
        }

        public int hashCode() {
            return this.f46731a.hashCode();
        }

        public String toString() {
            return "FetchUniqueEmomoGiftConfigSucceeded(response=" + this.f46731a + ')';
        }
    }

    public e1() {
    }

    public /* synthetic */ e1(jo.h hVar) {
        this();
    }
}
