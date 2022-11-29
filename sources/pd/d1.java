package pd;

import android.graphics.Bitmap;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftSlot;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d1 {

    /* loaded from: classes2.dex */
    public static final class a extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46710a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46710a = mRError;
        }

        public final MRError a() {
            return this.f46710a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46710a, ((a) obj).f46710a);
        }

        public int hashCode() {
            return this.f46710a.hashCode();
        }

        public String toString() {
            return "FetchUniqueEmomoGiftSlotsFailed(error=" + this.f46710a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46711a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public final List<UniqueEmomoGiftSlot> f46712a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<UniqueEmomoGiftSlot> list) {
            super(null);
            jo.p.h(list, "slots");
            this.f46712a = list;
        }

        public final List<UniqueEmomoGiftSlot> a() {
            return this.f46712a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46712a, ((c) obj).f46712a);
        }

        public int hashCode() {
            return this.f46712a.hashCode();
        }

        public String toString() {
            return "FetchUniqueEmomoGiftSlotsSucceeded(slots=" + this.f46712a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f46713a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bitmap bitmap) {
            super(null);
            jo.p.h(bitmap, "actualImage");
            this.f46713a = bitmap;
        }

        public final Bitmap a() {
            return this.f46713a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f46713a, ((d) obj).f46713a);
        }

        public int hashCode() {
            return this.f46713a.hashCode();
        }

        public String toString() {
            return "LoadedActualImage(actualImage=" + this.f46713a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46714a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46714a = mRError;
        }

        public final MRError a() {
            return this.f46714a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46714a, ((e) obj).f46714a);
        }

        public int hashCode() {
            return this.f46714a.hashCode();
        }

        public String toString() {
            return "SaveRichGiftFailed(error=" + this.f46714a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public static final f f46715a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public static final g f46716a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46717a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46717a = mRError;
        }

        public final MRError a() {
            return this.f46717a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f46717a, ((h) obj).f46717a);
        }

        public int hashCode() {
            return this.f46717a.hashCode();
        }

        public String toString() {
            return "SaveStampGiftFailed(error=" + this.f46717a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f46718a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends d1 {

        /* renamed from: a  reason: collision with root package name */
        public static final j f46719a = new j();

        public j() {
            super(null);
        }
    }

    public d1() {
    }

    public /* synthetic */ d1(jo.h hVar) {
        this();
    }
}
