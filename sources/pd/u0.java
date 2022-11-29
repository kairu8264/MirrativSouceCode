package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class u0 {

    /* loaded from: classes2.dex */
    public static final class a extends u0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47288a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47288a = mRError;
        }

        public final MRError a() {
            return this.f47288a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47288a, ((a) obj).f47288a);
        }

        public int hashCode() {
            return this.f47288a.hashCode();
        }

        public String toString() {
            return "UpdateUserProfileFailed(error=" + this.f47288a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends u0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47289a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends u0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47290a = new c();

        public c() {
            super(null);
        }
    }

    public u0() {
    }

    public /* synthetic */ u0(jo.h hVar) {
        this();
    }
}
