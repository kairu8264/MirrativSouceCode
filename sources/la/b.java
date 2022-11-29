package la;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f39757a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f39757a = mRError;
        }

        public final MRError a() {
            return this.f39757a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f39757a, ((a) obj).f39757a);
        }

        public int hashCode() {
            return this.f39757a.hashCode();
        }

        public String toString() {
            return "PlayStartFailed(error=" + this.f39757a + ')';
        }
    }

    /* renamed from: la.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0571b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameStartResponse f39758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0571b(LiveGameStartResponse liveGameStartResponse) {
            super(null);
            p.h(liveGameStartResponse, "response");
            this.f39758a = liveGameStartResponse;
        }

        public final LiveGameStartResponse a() {
            return this.f39758a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0571b) && p.c(this.f39758a, ((C0571b) obj).f39758a);
        }

        public int hashCode() {
            return this.f39758a.hashCode();
        }

        public String toString() {
            return "PlayStartSucceed(response=" + this.f39758a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39759a = new c();

        public c() {
            super(null);
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
