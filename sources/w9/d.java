package w9;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEventResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f58281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f58281a = mRError;
        }

        public final MRError a() {
            return this.f58281a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f58281a, ((a) obj).f58281a);
        }

        public int hashCode() {
            return this.f58281a.hashCode();
        }

        public String toString() {
            return "FetchEmomoQuestEventFailed(error=" + this.f58281a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58282a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoQuestEventResponse f58283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EmomoQuestEventResponse emomoQuestEventResponse) {
            super(null);
            jo.p.h(emomoQuestEventResponse, "emomoQuestEvent");
            this.f58283a = emomoQuestEventResponse;
        }

        public final EmomoQuestEventResponse a() {
            return this.f58283a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f58283a, ((c) obj).f58283a);
        }

        public int hashCode() {
            return this.f58283a.hashCode();
        }

        public String toString() {
            return "FetchEmomoQuestEventSucceeded(emomoQuestEvent=" + this.f58283a + ')';
        }
    }

    public d() {
    }

    public /* synthetic */ d(jo.h hVar) {
        this();
    }
}
