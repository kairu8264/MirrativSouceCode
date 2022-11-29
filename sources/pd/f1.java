package pd;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class f1 {

    /* loaded from: classes2.dex */
    public static final class a extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46837a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46837a = mRError;
        }

        public final MRError a() {
            return this.f46837a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46837a, ((a) obj).f46837a);
        }

        public int hashCode() {
            return this.f46837a.hashCode();
        }

        public String toString() {
            return "FetchInitDataFailed(error=" + this.f46837a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46838a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final UniqueEmomoGiftPreset f46839a;

        /* renamed from: b  reason: collision with root package name */
        public final jf.c f46840b;

        /* renamed from: c  reason: collision with root package name */
        public final ClosetAvatarPartsResponse f46841c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UniqueEmomoGiftPreset uniqueEmomoGiftPreset, jf.c cVar, ClosetAvatarPartsResponse closetAvatarPartsResponse) {
            super(null);
            jo.p.h(uniqueEmomoGiftPreset, "preset");
            jo.p.h(cVar, "closetAvatarModel");
            jo.p.h(closetAvatarPartsResponse, "avatarPartsResponse");
            this.f46839a = uniqueEmomoGiftPreset;
            this.f46840b = cVar;
            this.f46841c = closetAvatarPartsResponse;
        }

        public final ClosetAvatarPartsResponse a() {
            return this.f46841c;
        }

        public final jf.c b() {
            return this.f46840b;
        }

        public final UniqueEmomoGiftPreset c() {
            return this.f46839a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(this.f46839a, cVar.f46839a) && jo.p.c(this.f46840b, cVar.f46840b) && jo.p.c(this.f46841c, cVar.f46841c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f46839a.hashCode() * 31) + this.f46840b.hashCode()) * 31) + this.f46841c.hashCode();
        }

        public String toString() {
            return "FetchInitDataSucceeded(preset=" + this.f46839a + ", closetAvatarModel=" + this.f46840b + ", avatarPartsResponse=" + this.f46841c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final int f46842a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, String str) {
            super(null);
            jo.p.h(str, "fontId");
            this.f46842a = i10;
            this.f46843b = str;
        }

        public final String a() {
            return this.f46843b;
        }

        public final int b() {
            return this.f46842a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f46842a == dVar.f46842a && jo.p.c(this.f46843b, dVar.f46843b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46842a) * 31) + this.f46843b.hashCode();
        }

        public String toString() {
            return "FontSelected(index=" + this.f46842a + ", fontId=" + this.f46843b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            jo.p.h(str, "motionId");
            this.f46844a = str;
        }

        public final String a() {
            return this.f46844a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46844a, ((e) obj).f46844a);
        }

        public int hashCode() {
            return this.f46844a.hashCode();
        }

        public String toString() {
            return "MotionSelected(motionId=" + this.f46844a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public static final f f46845a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public static final g f46846a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46847a = mRError;
        }

        public final MRError a() {
            return this.f46847a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f46847a, ((h) obj).f46847a);
        }

        public int hashCode() {
            return this.f46847a.hashCode();
        }

        public String toString() {
            return "SaveTemporaryStampImageFileFailed(error=" + this.f46847a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final File f46848a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file) {
            super(null);
            jo.p.h(file, "stampImageFile");
            this.f46848a = file;
        }

        public final File a() {
            return this.f46848a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f46848a, ((i) obj).f46848a);
        }

        public int hashCode() {
            return this.f46848a.hashCode();
        }

        public String toString() {
            return "SaveTemporaryStampImageFileSucceeded(stampImageFile=" + this.f46848a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(null);
            jo.p.h(str, "text");
            this.f46849a = str;
        }

        public final String a() {
            return this.f46849a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f46849a, ((j) obj).f46849a);
        }

        public int hashCode() {
            return this.f46849a.hashCode();
        }

        public String toString() {
            return "TextChanged(text=" + this.f46849a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public static final k f46850a = new k();

        public k() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final int f46851a;

        public l(int i10) {
            super(null);
            this.f46851a = i10;
        }

        public final int a() {
            return this.f46851a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f46851a == ((l) obj).f46851a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46851a);
        }

        public String toString() {
            return "TextEditStarted(index=" + this.f46851a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends f1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46852a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(null);
            jo.p.h(str, "title");
            this.f46852a = str;
        }

        public final String a() {
            return this.f46852a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f46852a, ((m) obj).f46852a);
        }

        public int hashCode() {
            return this.f46852a.hashCode();
        }

        public String toString() {
            return "TitleChanged(title=" + this.f46852a + ')';
        }
    }

    public f1() {
    }

    public /* synthetic */ f1(jo.h hVar) {
        this();
    }
}
