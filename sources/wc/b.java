package wc;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f58582a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f58582a = mRError;
        }

        public final MRError a() {
            return this.f58582a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f58582a, ((a) obj).f58582a);
        }

        public int hashCode() {
            return this.f58582a.hashCode();
        }

        public String toString() {
            return "AgreeFailed(error=" + this.f58582a + ')';
        }
    }

    /* renamed from: wc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0973b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0973b f58583a = new C0973b();

        public C0973b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58584a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f58585a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f58585a = mRError;
        }

        public final MRError a() {
            return this.f58585a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.c(this.f58585a, ((d) obj).f58585a);
        }

        public int hashCode() {
            return this.f58585a.hashCode();
        }

        public String toString() {
            return "DisagreeFailed(error=" + this.f58585a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f58586a = new e();

        public e() {
            super(null);
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
