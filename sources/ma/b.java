package ma;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameGiftHelpResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f40635a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f40635a = mRError;
        }

        public final MRError a() {
            return this.f40635a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f40635a, ((a) obj).f40635a);
        }

        public int hashCode() {
            return this.f40635a.hashCode();
        }

        public String toString() {
            return "FetchLiveGameGiftHelpFailed(error=" + this.f40635a + ')';
        }
    }

    /* renamed from: ma.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0594b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameGiftHelpResponse f40636a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0594b(LiveGameGiftHelpResponse liveGameGiftHelpResponse) {
            super(null);
            p.h(liveGameGiftHelpResponse, "liveGameGiftHelpResponse");
            this.f40636a = liveGameGiftHelpResponse;
        }

        public final LiveGameGiftHelpResponse a() {
            return this.f40636a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0594b) && p.c(this.f40636a, ((C0594b) obj).f40636a);
        }

        public int hashCode() {
            return this.f40636a.hashCode();
        }

        public String toString() {
            return "FetchLiveGameGiftHelpSucceeded(liveGameGiftHelpResponse=" + this.f40636a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
