package na;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameListResponse;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f41638a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: na.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0620b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0620b f41639a = new C0620b();

        public C0620b() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameListResponse f41640a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LiveGameListResponse liveGameListResponse) {
            super(null);
            p.h(liveGameListResponse, "response");
            this.f41640a = liveGameListResponse;
        }

        public final LiveGameListResponse a() {
            return this.f41640a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.c(this.f41640a, ((c) obj).f41640a);
        }

        public int hashCode() {
            return this.f41640a.hashCode();
        }

        public String toString() {
            return "LoadListingSucceed(response=" + this.f41640a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f41641a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f41642a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f41642a = mRError;
        }

        public final MRError a() {
            return this.f41642a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p.c(this.f41642a, ((e) obj).f41642a);
        }

        public int hashCode() {
            return this.f41642a.hashCode();
        }

        public String toString() {
            return "PlayStartFailed(error=" + this.f41642a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameStartResponse f41643a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LiveGameStartResponse liveGameStartResponse) {
            super(null);
            p.h(liveGameStartResponse, "response");
            this.f41643a = liveGameStartResponse;
        }

        public final LiveGameStartResponse a() {
            return this.f41643a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p.c(this.f41643a, ((f) obj).f41643a);
        }

        public int hashCode() {
            return this.f41643a.hashCode();
        }

        public String toString() {
            return "PlayStartSucceed(response=" + this.f41643a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f41644a = new g();

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
