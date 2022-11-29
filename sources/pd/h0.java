package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class h0 {

    /* loaded from: classes2.dex */
    public static final class a extends h0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46906a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46906a = mRError;
        }

        public final MRError a() {
            return this.f46906a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46906a, ((a) obj).f46906a);
        }

        public int hashCode() {
            return this.f46906a.hashCode();
        }

        public String toString() {
            return "UpdateFail(error=" + this.f46906a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            jo.p.h(str, "imageUrl");
            this.f46907a = str;
        }

        public final String a() {
            return this.f46907a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46907a, ((b) obj).f46907a);
        }

        public int hashCode() {
            return this.f46907a.hashCode();
        }

        public String toString() {
            return "UpdateFinish(imageUrl=" + this.f46907a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f46908a = new c();

        public c() {
            super(null);
        }
    }

    public h0() {
    }

    public /* synthetic */ h0(jo.h hVar) {
        this();
    }
}
