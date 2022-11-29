package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.GroupShotGalleryResponse;
import com.dena.mirrorman.net.api.response.live.PhotoCampaign;

/* loaded from: classes2.dex */
public abstract class t {

    /* loaded from: classes2.dex */
    public static final class a extends t {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47261a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47261a = mRError;
        }

        public final MRError a() {
            return this.f47261a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47261a, ((a) obj).f47261a);
        }

        public int hashCode() {
            return this.f47261a.hashCode();
        }

        public String toString() {
            return "FetchCampaignStatusFailed(error=" + this.f47261a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends t {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47262a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends t {

        /* renamed from: a  reason: collision with root package name */
        public final PhotoCampaign f47263a;

        public c(PhotoCampaign photoCampaign) {
            super(null);
            this.f47263a = photoCampaign;
        }

        public final PhotoCampaign a() {
            return this.f47263a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47263a, ((c) obj).f47263a);
        }

        public int hashCode() {
            PhotoCampaign photoCampaign = this.f47263a;
            if (photoCampaign == null) {
                return 0;
            }
            return photoCampaign.hashCode();
        }

        public String toString() {
            return "FetchCampaignStatusSucceeded(photoCampaign=" + this.f47263a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends t {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47264a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47264a = mRError;
        }

        public final MRError a() {
            return this.f47264a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47264a, ((d) obj).f47264a);
        }

        public int hashCode() {
            return this.f47264a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f47264a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends t {

        /* renamed from: a  reason: collision with root package name */
        public final GroupShotGalleryResponse f47265a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(GroupShotGalleryResponse groupShotGalleryResponse) {
            super(null);
            jo.p.h(groupShotGalleryResponse, "response");
            this.f47265a = groupShotGalleryResponse;
        }

        public final GroupShotGalleryResponse a() {
            return this.f47265a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f47265a, ((e) obj).f47265a);
        }

        public int hashCode() {
            return this.f47265a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f47265a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends t {

        /* renamed from: a  reason: collision with root package name */
        public static final f f47266a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends t {

        /* renamed from: a  reason: collision with root package name */
        public static final g f47267a = new g();

        public g() {
            super(null);
        }
    }

    public t() {
    }

    public /* synthetic */ t(jo.h hVar) {
        this();
    }
}
