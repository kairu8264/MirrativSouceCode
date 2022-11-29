package jb;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final float f37447a;

        public a(float f10) {
            super(null);
            this.f37447a = f10;
        }

        public final float a() {
            return this.f37447a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(Float.valueOf(this.f37447a), Float.valueOf(((a) obj).f37447a));
        }

        public int hashCode() {
            return Float.hashCode(this.f37447a);
        }

        public String toString() {
            return "ChangePlaybackSpeed(speed=" + this.f37447a + ')';
        }
    }

    /* renamed from: jb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0505b extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f37448b = te.a.f53599e;

        /* renamed from: a  reason: collision with root package name */
        public final te.a f37449a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0505b(te.a aVar) {
            super(null);
            jo.p.h(aVar, "status");
            this.f37449a = aVar;
        }

        public final te.a a() {
            return this.f37449a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0505b) && jo.p.c(this.f37449a, ((C0505b) obj).f37449a);
        }

        public int hashCode() {
            return this.f37449a.hashCode();
        }

        public String toString() {
            return "ChangePlayerStatus(status=" + this.f37449a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f37450a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f37450a = mRError;
        }

        public final MRError a() {
            return this.f37450a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f37450a, ((c) obj).f37450a);
        }

        public int hashCode() {
            return this.f37450a.hashCode();
        }

        public String toString() {
            return "LoadParamsErrorOccurEvent(error=" + this.f37450a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f37451a;

        public d(boolean z10) {
            super(null);
            this.f37451a = z10;
        }

        public final boolean a() {
            return this.f37451a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f37451a == ((d) obj).f37451a;
        }

        public int hashCode() {
            boolean z10 = this.f37451a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "SetIsAppOwnersArchive(isArchiveByAppOwner=" + this.f37451a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f37452b = te.c.N;

        /* renamed from: a  reason: collision with root package name */
        public final te.c f37453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(te.c cVar) {
            super(null);
            jo.p.h(cVar, "params");
            this.f37453a = cVar;
        }

        public final te.c a() {
            return this.f37453a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f37453a, ((e) obj).f37453a);
        }

        public int hashCode() {
            return this.f37453a.hashCode();
        }

        public String toString() {
            return "SetPlayRequestParamsEvent(params=" + this.f37453a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
