package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftColorConfig;
import java.io.File;
import java.util.List;
import ud.a4;
import ud.z3;

/* loaded from: classes2.dex */
public abstract class g1 {

    /* loaded from: classes2.dex */
    public static final class a extends g1 {

        /* renamed from: a  reason: collision with root package name */
        public final z3 f46887a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z3 z3Var) {
            super(null);
            jo.p.h(z3Var, "bindModel");
            this.f46887a = z3Var;
        }

        public final z3 a() {
            return this.f46887a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46887a, ((a) obj).f46887a);
        }

        public int hashCode() {
            return this.f46887a.hashCode();
        }

        public String toString() {
            return "ChangeColorPaletteSucceeded(bindModel=" + this.f46887a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends g1 {

        /* renamed from: a  reason: collision with root package name */
        public final a4 f46888a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a4 a4Var) {
            super(null);
            jo.p.h(a4Var, "bindModel");
            this.f46888a = a4Var;
        }

        public final a4 a() {
            return this.f46888a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46888a, ((b) obj).f46888a);
        }

        public int hashCode() {
            return this.f46888a.hashCode();
        }

        public String toString() {
            return "ChangeTextAlignSucceeded(bindModel=" + this.f46888a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends g1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46889a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46889a = mRError;
        }

        public final MRError a() {
            return this.f46889a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46889a, ((c) obj).f46889a);
        }

        public int hashCode() {
            return this.f46889a.hashCode();
        }

        public String toString() {
            return "CheckInputTextFailed(error=" + this.f46889a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends g1 {

        /* renamed from: a  reason: collision with root package name */
        public static final d f46890a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends g1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46891a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            jo.p.h(str, "sanitizedText");
            this.f46891a = str;
        }

        public final String a() {
            return this.f46891a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46891a, ((e) obj).f46891a);
        }

        public int hashCode() {
            return this.f46891a.hashCode();
        }

        public String toString() {
            return "CheckInputTextSucceeded(sanitizedText=" + this.f46891a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends g1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46892a = mRError;
        }

        public final MRError a() {
            return this.f46892a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f46892a, ((f) obj).f46892a);
        }

        public int hashCode() {
            return this.f46892a.hashCode();
        }

        public String toString() {
            return "SaveTemporaryStampImageFileFailed(error=" + this.f46892a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends g1 {

        /* renamed from: a  reason: collision with root package name */
        public final File f46893a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(File file) {
            super(null);
            jo.p.h(file, "stampImageFile");
            this.f46893a = file;
        }

        public final File a() {
            return this.f46893a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46893a, ((g) obj).f46893a);
        }

        public int hashCode() {
            return this.f46893a.hashCode();
        }

        public String toString() {
            return "SaveTemporaryStampImageFileSucceeded(stampImageFile=" + this.f46893a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends g1 {

        /* renamed from: a  reason: collision with root package name */
        public final List<UniqueEmomoGiftColorConfig> f46894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<UniqueEmomoGiftColorConfig> list) {
            super(null);
            jo.p.h(list, "colorConfigs");
            this.f46894a = list;
        }

        public final List<UniqueEmomoGiftColorConfig> a() {
            return this.f46894a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f46894a, ((h) obj).f46894a);
        }

        public int hashCode() {
            return this.f46894a.hashCode();
        }

        public String toString() {
            return "UpdateUniqueEmomoGiftColorConfig(colorConfigs=" + this.f46894a + ')';
        }
    }

    public g1() {
    }

    public /* synthetic */ g1(jo.h hVar) {
        this();
    }
}
