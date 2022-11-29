package yc;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public abstract class c {

    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f61625a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f61626a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f61626a = mRError;
        }

        public final MRError a() {
            return this.f61626a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p.c(this.f61626a, ((b) obj).f61626a);
        }

        public int hashCode() {
            return this.f61626a.hashCode();
        }

        public String toString() {
            return "RegisterGenerationFailed(error=" + this.f61626a + ')';
        }
    }

    /* renamed from: yc.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1053c extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final C1053c f61627a = new C1053c();

        public C1053c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public final ChatStatus f61628a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ChatStatus chatStatus) {
            super(null);
            p.h(chatStatus, "response");
            this.f61628a = chatStatus;
        }

        public final ChatStatus a() {
            return this.f61628a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.c(this.f61628a, ((d) obj).f61628a);
        }

        public int hashCode() {
            return this.f61628a.hashCode();
        }

        public String toString() {
            return "RegisterGenerationSucceeded(response=" + this.f61628a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public final int f61629a;

        public e(int i10) {
            super(null);
            this.f61629a = i10;
        }

        public final int a() {
            return this.f61629a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f61629a == ((e) obj).f61629a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f61629a);
        }

        public String toString() {
            return "SelectedGenerationChanged(currentIndex=" + this.f61629a + ')';
        }
    }

    public c() {
    }

    public /* synthetic */ c(jo.h hVar) {
        this();
    }
}
