package w8;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.PhotoCampaign;
import jo.p;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f58224a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f58224a = mRError;
        }

        public final MRError a() {
            return this.f58224a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f58224a, ((a) obj).f58224a);
        }

        public int hashCode() {
            return this.f58224a.hashCode();
        }

        public String toString() {
            return "FetchCampaignStatusFailed(error=" + this.f58224a + ')';
        }
    }

    /* renamed from: w8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0958b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0958b f58225a = new C0958b();

        public C0958b() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f58226b = PhotoCampaign.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final PhotoCampaign f58227a;

        public c(PhotoCampaign photoCampaign) {
            super(null);
            this.f58227a = photoCampaign;
        }

        public final PhotoCampaign a() {
            return this.f58227a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.c(this.f58227a, ((c) obj).f58227a);
        }

        public int hashCode() {
            PhotoCampaign photoCampaign = this.f58227a;
            if (photoCampaign == null) {
                return 0;
            }
            return photoCampaign.hashCode();
        }

        public String toString() {
            return "FetchCampaignStatusSucceeded(photoCampaign=" + this.f58227a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f58228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f58228a = mRError;
        }

        public final MRError a() {
            return this.f58228a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.c(this.f58228a, ((d) obj).f58228a);
        }

        public int hashCode() {
            return this.f58228a.hashCode();
        }

        public String toString() {
            return "PostCampaignPhotoFailed(error=" + this.f58228a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f58229a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f58230a;

        public f(int i10) {
            super(null);
            this.f58230a = i10;
        }

        public final int a() {
            return this.f58230a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f58230a == ((f) obj).f58230a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f58230a);
        }

        public String toString() {
            return "PostCampaignPhotoSucceeded(coinNum=" + this.f58230a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
